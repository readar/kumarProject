/**
 * 
 */
package com.mytraining.custom.facade.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;

import com.mytraining.custom.facade.SaiProductFacade;
import com.mytraining.facades.product.data.SaiProductData;

/**
 * @author kumar
 *
 */
public class SaiProductFacadeImpl implements SaiProductFacade
{

	private ProductService productService;
	/* (non-Javadoc)
	 * @see com.mytraining.custom.facade.SaiProductFacade#getPrice(java.lang.String)
	 */
	@Override
	public Double getPrice(String code)
	{
		ProductModel productModel=productService.getProductForCode(code);
		return Double.valueOf(productModel.getProductPrice());
	}

	/* (non-Javadoc)
	 * @see com.mytraining.custom.facade.SaiProductFacade#getDescription(java.lang.String)
	 */
	@Override
	public String getDescription(String code)
	{
		ProductModel productModel=productService.getProductForCode(code);
		return productModel.getProductShortInfo();
	}

	/**
	 * @return the productService
	 */
	public ProductService getProductService()
	{
		return productService;
	}

	/**
	 * @param productService the productService to set
	 */
	public void setProductService(ProductService productService)
	{
		this.productService = productService;
	}
	
}
