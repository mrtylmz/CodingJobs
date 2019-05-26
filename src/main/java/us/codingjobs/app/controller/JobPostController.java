package us.codingjobs.app.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@PostMapping("")
	public PostResponseModel createJobPost(@Valid @RequestBody PostRequestModel req) {
		PostDto postDto= modelMapper.map(req, PostDto.class);
		PostDto createdPost=postService.createPost(postDto);
		PostResponseModel resp=modelMapper.map(createdPost, PostResponseModel.class);
		return resp;
		
	}

}
