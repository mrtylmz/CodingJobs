package us.codingjobs.app.service.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import us.codingjobs.app.entity.PostEntity;
import us.codingjobs.app.model.dto.PostDto;
import us.codingjobs.app.repository.PostRepository;
import us.codingjobs.app.service.PostService;
import us.codingjobs.app.utils.Utils;
@Service
@Validated
public class PostServiceImpl implements PostService {

	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	Utils utils;

	@Transactional
	@Override
	public PostDto createPost(@Valid PostDto post) {
		//implemented business validation in dto
		
		//check existing record
		PostEntity checkEntity=postRepository.checkExistingPost(post.getEmail(), post.getPosition(), post.getAddress().getZipCode());
		if(checkEntity!=null) {
			throw new RuntimeException("Record has already existing.");
		}
		//setpublic post id 
		post.setPostId(utils.generatePostId(20));
		//convert dto to entity
		PostEntity postEntity=modelMapper.map(post, PostEntity.class);
		postEntity.setCompanyInfoStr(postEntity.getCompanyInfo().toString());
		postEntity.setCity(postEntity.getAddress().getCity());
		postEntity.setState(postEntity.getAddress().getState());
		postEntity.setZipCode(postEntity.getAddress().getZipCode());
		//save entity
		PostEntity savedEntity=postRepository.save(postEntity);
		
		//convert entity to dto
		PostDto createdDto=modelMapper.map(savedEntity, PostDto.class);
		return createdDto;
	}

	@Override
	public List<PostDto> getPosts(int page, int limit) {
		List<PostDto> returnValues=new ArrayList<>();
		Pageable pageableRequest = PageRequest.of(page, limit);
		
		Page<PostEntity> postsPage=postRepository.findAll(pageableRequest);
		List<PostEntity> postEntities=postsPage.getContent();
		//below I can handle with modelmapper
//		for(PostEntity entity:postEntities) {
//			PostDto postDto=new PostDto();
//			postDto=modelMapper.map(entity, PostDto.class);
//			returnValues.add(postDto);
//		}
		
		Type listType = new TypeToken<List<PostDto>>() {}.getType();
		returnValues=modelMapper.map(postEntities, listType);
		return returnValues;
	}


}
