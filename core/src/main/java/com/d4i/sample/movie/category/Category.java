package com.d4i.sample.movie.category;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import com.d4i.sample.movie.shared.SelfValidating;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Category extends SelfValidating<Category> implements Serializable {

	@Min(0)
	private Long id;

	@NotNull
	@NotEmpty
	private String name;

	private Boolean available;

	@Builder
	public Category(Long id, String name, Boolean available) {
		this.id = id;
		this.name = name;
		this.available = available;
		this.validateSelf();
	}

}
