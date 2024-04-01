package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.MovieVo;

@Repository
public class MovieDao {

	@Autowired
	private SqlSession sqlSession;

	// DB에 이미지 정보 저장
	public int movieInsert(MovieVo movieVo) {
		System.out.println("MovieDao.movieInsert()");

		int count = sqlSession.insert("movie.posterInsert", movieVo);

		return count;
	}

	// 영화 예매 리스트
	public List<MovieVo> selectMovie() {
		System.out.println("MovieDao.selectMovie()");

		List<MovieVo> mList = sqlSession.selectList("movie.selectMovieList");

		return mList;
	}

}
