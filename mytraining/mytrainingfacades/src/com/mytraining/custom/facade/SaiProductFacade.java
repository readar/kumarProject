/**
 *
 */
package com.mytraining.custom.facade;

import com.mytraining.facades.product.data.SaiProductData;


/**
 * @author kumar
 *
 */
public interface SaiProductFacade
{
	Double getPrice(String code);
	String getDescription(String code);

}
