/**
 *
 */
package com.mytraining.custom.handler;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;


/**
 * @author kumar
 *
 */
public class ManojDynamicHandler extends AbstractDynamicAttributeHandler<String, ProductModel>
{
	@Override
	public String get(ProductModel model) {
		String fullName=model.getFirstName()+model.getLastName();
		return fullName;
	}
	
}
