package kr.smhrd.lunch.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.service.GoodsService;

@CrossOrigin(origins = "http://3.38.107.204:5173")
@RestController
@RequestMapping("/api")
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	@GetMapping("/goods_list/{id}")
	public GoodsDTO getGoodsDetail(@PathVariable("id") int id) {
		
		GoodsDTO goodsDetail= goodsService.getGoodsDetail(id);
		
		return goodsDetail;
	}

	@GetMapping("/goods_list")
	public List<GoodsDTO> getGoodsList() {
		System.out.println("[list 출력 컨트롤러]");
		
		// 2Step -> Service -> Repository 
		// -> Service 클래스 불러오기!!
		
		List<GoodsDTO> list = goodsService.getGoodsList();// -?
		return list;
	}
	
	
	
	
}
