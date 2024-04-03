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

	// 데이터 1개 가져오기 no 1개 데이터 가져오기
	public MovieVo movieSelectOne(int no) {
		System.out.println("MovieDao..movieSelectOne()");

		MovieVo movieVo = sqlSession.selectOne("movie.selectTimeOneList", no);
		System.out.println(movieVo);
		return movieVo;
	}

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
	// 영화 예매 리스트
	public List<MovieVo> selectMovieTime() {
		System.out.println("MovieDao.selectMovie()");
		
		List<MovieVo> tList = sqlSession.selectList("movie.selectTimeList");
		return tList;
	}

	// no로 한명데이터 가져오기(회원정보수정 폼)
	public MovieVo userSelectCount(int no) {
		System.out.println("UserDao.userSelectOneByNo()");

		MovieVo movieVo = sqlSession.selectOne("movie.selectMovieCount", no);
		return movieVo;
	}

}
