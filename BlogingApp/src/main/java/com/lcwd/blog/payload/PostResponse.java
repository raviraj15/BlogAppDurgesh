package com.lcwd.blog.payload;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class PostResponse {

	
	private List<PostDto> content;
	
	private int pageNumber;
	
	private int pageSize;
	
	private long totalElement;
	
	private int totalPages;
	
	private boolean lastpage;
	
	
}
