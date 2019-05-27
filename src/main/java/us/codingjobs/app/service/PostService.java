package us.codingjobs.app.service;

import javax.validation.Valid;

import us.codingjobs.app.model.dto.PostDto;

public interface PostService {

	public PostDto createPost(@Valid PostDto post);
}
