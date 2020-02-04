/**
 * 
 */
package com.mytraining.storefront.controllers.pages;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mytraining.custom.facade.ManojProductFacade;
import com.mytraining.facades.product.data.ManojProductData;

/**
 * @author kumar
 *
 */
@Controller
@RequestMapping("/myProduct")
public class ManojProductController
{
	@Resource(name="manojProductFacade")
	private ManojProductFacade manojProductFacade;
	
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<ManojProductData> getProductDatas(){
		return manojProductFacade.getManojProductsData();
	}
}
