package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.FoodVo;

@Repository
public class FoodStoreDao {

	@Autowired
	private SqlSession sqlSession;

	
	public List<FoodVo> foodSelect() {
		System.out.println("FoodStoreDao.foodSelect()");

		List<FoodVo> foodList = sqlSession.selectList("food.select");
		System.out.println(foodList);

		return foodList;
	}

	public int foodInsert(FoodVo foodVo) {
		System.out.println("FoodStoreDao.foodInsert()");

		int count = sqlSession.insert("foodInsert", foodVo);

		return count;
	}
}
