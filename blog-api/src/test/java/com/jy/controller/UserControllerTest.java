package com.jy.controller;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.jy.BlogApiApplicationTests;
import com.jy.entity.User;
import com.jy.entity.UserStatus;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UserControllerTest extends BlogApiApplicationTests{
	
	
    private MockMvc mockMvc; // 模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化。    
    
    @Autowired    
    private WebApplicationContext wac; // 注入WebApplicationContext    
    
    @Before
    public void setup() {    
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();    
    } 
	
	@Test
	public void saveUserTest() throws Exception {
		User u = new User();
		u.setAccount("jy");
		u.setNickname("金勇");
		u.setPassword("123456");
		u.setAdmin(true);
		u.setCreateDate(new Date());
		u.setEmail("1149959964@qq.com");
		u.setMobilePhoneNumber("15077831109");
		u.setStatus(UserStatus.normal);
		
        MvcResult result = mockMvc.perform(post("/users/create").contentType(MediaType.APPLICATION_JSON).content(JSONObject.toJSONString(u)))  
                .andExpect(status().isOk())// 模拟向testRest发送get请求    
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))// 预期返回值的媒体类型text/plain;charset=UTF-8    
                .andReturn();// 返回执行请求的结果    
          
        System.out.println(result.getResponse().getContentAsString()); 
		
		
	}
	
	@Test
	public void getUserById() throws Exception {
		Long id = 5L;
        MvcResult result = mockMvc.perform(get("/users/"+id))  
                .andExpect(status().isOk())  
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))    
                .andReturn();
          
        System.out.println(result.getResponse().getContentAsString()); 
	}
	
	@Test
	public void findAllTest() throws Exception {
        MvcResult result = mockMvc.perform(get("/users/"))  
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))  
                .andReturn();   
          
        System.out.println(result.getResponse().getContentAsString()); 
	}
	
	@Test
	public void updateUserTest() throws Exception {
		User u = new User();
		Long id = 5L;
		u.setId(id);
		u.setNickname("金勇222");
        MvcResult result = mockMvc.perform(post("/users/update").contentType(MediaType.APPLICATION_JSON).content(JSONObject.toJSONString(u)))  
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))    
                .andReturn();
          
        System.out.println(result.getResponse().getContentAsString()); 
	}
	
	@Test
	public void deleteTest() throws Exception {
		Long id = 5L;
		MvcResult result = mockMvc.perform(get("/users/delete/"+id))  
                .andExpect(status().isOk())  
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))    
                .andReturn();
          
        System.out.println(result.getResponse().getContentAsString()); 
		
	}
	
}
