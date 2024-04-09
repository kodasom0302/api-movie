package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.FoodStoreService;
import com.javaex.util.JsonResult;
import com.javaex.vo.FoodVo;

@RestController
public class FoodStoreController {

	@Autowired
	private FoodStoreService foodStoreService;
	
	//메뉴 리스트
	@GetMapping("/api/food/list")
	public JsonResult list() {
		System.out.println("foodStoreService.list()");

		List<FoodVo> foddList = foodStoreService.exeList();
		System.out.println(foddList);
		
		return JsonResult.success(foddList);
	}
	
	//db 정보 등록
	@PostMapping("/api/food/attach")
	public JsonResult upload(@RequestParam MultipartFile file,
								@ModelAttribute FoodVo foodVo) {
		String saveName = foodStoreService.exeUpload(file);
		
		return JsonResult.success(saveName);
	}
}
