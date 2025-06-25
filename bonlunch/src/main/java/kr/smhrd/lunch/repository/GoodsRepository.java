package kr.smhrd.lunch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.smhrd.lunch.entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods,Integer>{

}
