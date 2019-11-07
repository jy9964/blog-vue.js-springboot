package com.jy.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jy.BlogApiApplicationTests;
import com.jy.repository.CategoryRepository;

public class CategoryRepositoryTest extends BlogApiApplicationTests{

	@Autowired
	private CategoryRepository	categoryRepository;

	@Test
	public void test() {
	}
}
