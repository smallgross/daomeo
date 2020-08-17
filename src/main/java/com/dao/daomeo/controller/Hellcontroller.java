package com.dao.daomeo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.daomeo.entity.Province;
import com.dao.daomeo.service.IprovinceService;
/**
 * 控制
 * @author luo
 *
 */
@Controller
public class Hellcontroller {
@Autowired
IprovinceService pService;



@RequestMapping("/")
public String index() {
	return"index";
}

	@RequestMapping("/getdata")
	@ResponseBody
	public List<Province> showData() {
		List<Province> arrayList = new ArrayList<>();
		arrayList= pService.selectAll();
		return arrayList;

	}
	

}
