/**   
* @Title: PicController.java 
* @Package com.rmbih.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Rex   
* @date Jun 1, 2016 4:06:39 PM 
* @version V1.0   
*/
package com.rmbih.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rmbih.dao.RmbihPicTMapper;
import com.rmbih.model.RmbihPicT;
import com.rmbih.model.RmbihPicTExample;

/** 
* @ClassName: PicController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Rex 
* @date Jun 1, 2016 4:06:39 PM 
*  
*/
@Controller
@RequestMapping("/pic")
public class PicController {

	@Resource
	private RmbihPicTMapper rmbihPicTMapper;
	
	@RequestMapping("/getPicList")
	@ResponseBody
	public List<RmbihPicT> getPicList(int userId) {
		RmbihPicTExample rmbihPicTExample = new RmbihPicTExample();
		rmbihPicTExample.createCriteria().andDelsignEqualTo(0).andUserIdEqualTo(userId);
		List<RmbihPicT> list = rmbihPicTMapper.selectByExample(rmbihPicTExample);;
		return list;
	}
}
