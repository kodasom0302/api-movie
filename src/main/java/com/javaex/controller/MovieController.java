package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.MovieService;
import com.javaex.util.JsonResult;
import com.javaex.vo.MovieVo;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	// 회원정보 수정폼(1명 데이터가져오기)
	@GetMapping("/api/movie/movieonetime")
	public JsonResult selectone(@RequestBody MovieVo movieVo) {
		System.out.println("MovieController.selectone()");
		System.out.println(movieVo);

		MovieVo mVo = movieService.exeSelectOne(movieVo.getM_no());
		System.out.println(mVo);

		//return null;
		return JsonResult.success(mVo);
	}
/*
	// DB에 이미지 정보 저장
	@PostMapping("/api/movie/attach")
	public JsonResult upload(@RequestParam MultipartFile file, @ModelAttribute MovieVo movieVo) {
		System.out.println("MovieController.upload()");

		String saveName = movieService.exeUpload(file);

		return JsonResult.success(saveName);
	}
	*/

	// 영화 예매 리스트
	@GetMapping("/api/movie/list")
	public JsonResult movieList() {
		System.out.println("MovieController.movieList()");

		List<MovieVo> mList = movieService.exeMovieList();

		return JsonResult.success(mList);
	}
	@GetMapping("/api/movie/timelist")
	public JsonResult movieTimeList() {
		System.out.println("MovieController.movieList()");
		
		List<MovieVo> tList = movieService.exeTimeList();
		
		return JsonResult.success(tList);
	}
	/*
	 * // 회원정보 수정폼(1명 데이터가져오기)
	 * 
	 * @GetMapping("/api/movie/count/{m_no}") public JsonResult
	 * movieCount(@PathVariable(value = "no") int m_no) {
	 * System.out.println("UserController.modifyform()");
	 * 
	 * 
	 * MovieVo movieVo = movieService.exeMovieCount(m_no);
	 * 
	 * return JsonResult.success(movieVo);
	 * 
	 * }
	 */

}
