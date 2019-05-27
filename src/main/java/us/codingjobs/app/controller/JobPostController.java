package us.codingjobs.app.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import us.codingjobs.app.model.dto.PostDto;
import us.codingjobs.app.model.request.PostRequestModel;
import us.codingjobs.app.model.response.PostResponseModel;
import us.codingjobs.app.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class JobPostController {

	@Autowired
	PostService postService;
	
	@Autowired
	ModelMapper modelMapper;
	
	@GetMapping("")
	public List<PostResponseModel> getPosts(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "limit", defaultValue = "10") int limit){
		List<PostResponseModel> resp=new ArrayList<>();
		List<PostDto> getPosts = postService.getPosts(page, limit);
		Type listType = new TypeToken<List<PostResponseModel>>() {}.getType();
		resp=modelMapper.map(getPosts, listType);
		return resp;
	}
	
	@PostMapping("")
	public PostResponseModel createJobPost(@Valid @RequestBody PostRequestModel req) {
		PostDto postDto= modelMapper.map(req, PostDto.class);
		PostDto createdPost=postService.createPost(postDto);
		PostResponseModel resp=modelMapper.map(createdPost, PostResponseModel.class);
		return resp;
		
	}

}
