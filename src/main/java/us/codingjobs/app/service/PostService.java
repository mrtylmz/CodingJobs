package us.codingjobs.app.service;

import java.util.List;

import javax.validation.Valid;

import us.codingjobs.app.model.dto.PostDto;

public interface PostService {

	public PostDto createPost(@Valid PostDto post);
	public List<PostDto> getPosts(int page, int limit);
}
