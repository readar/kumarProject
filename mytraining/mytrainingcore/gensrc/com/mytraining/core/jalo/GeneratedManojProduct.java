/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 04-Feb-2020, 9:04:37 AM                     ---
 * ----------------------------------------------------------------
 */
package com.mytraining.core.jalo;

import com.mytraining.core.constants.MytrainingCoreConstants;
import com.mytraining.core.jalo.ManojCategory;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ManojProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManojProduct extends GenericItem
{
	/** Qualifier of the <code>ManojProduct.productId</code> attribute **/
	public static final String PRODUCTID = "productId";
	/** Qualifier of the <code>ManojProduct.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>ManojProduct.productPrice</code> attribute **/
	public static final String PRODUCTPRICE = "productPrice";
	/** Qualifier of the <code>ManojProduct.productInfo</code> attribute **/
	public static final String PRODUCTINFO = "productInfo";
	/** Qualifier of the <code>ManojProduct.manojCategory</code> attribute **/
	public static final String MANOJCATEGORY = "manojCategory";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MANOJCATEGORY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedManojProduct> MANOJCATEGORYHANDLER = new BidirectionalOneToManyHandler<GeneratedManojProduct>(
	MytrainingCoreConstants.TC.MANOJPRODUCT,
	false,
	"manojCategory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTID, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(PRODUCTPRICE, AttributeMode.INITIAL);
		tmp.put(PRODUCTINFO, AttributeMode.INITIAL);
		tmp.put(MANOJCATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		MANOJCATEGORYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.manojCategory</code> attribute.
	 * @return the manojCategory
	 */
	public ManojCategory getManojCategory(final SessionContext ctx)
	{
		return (ManojCategory)getProperty( ctx, MANOJCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.manojCategory</code> attribute.
	 * @return the manojCategory
	 */
	public ManojCategory getManojCategory()
	{
		return getManojCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.manojCategory</code> attribute. 
	 * @param value the manojCategory
	 */
	public void setManojCategory(final SessionContext ctx, final ManojCategory value)
	{
		MANOJCATEGORYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.manojCategory</code> attribute. 
	 * @param value the manojCategory
	 */
	public void setManojCategory(final ManojCategory value)
	{
		setManojCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productId</code> attribute.
	 * @return the productId
	 */
	public Integer getProductId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PRODUCTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productId</code> attribute.
	 * @return the productId
	 */
	public Integer getProductId()
	{
		return getProductId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productId</code> attribute. 
	 * @return the productId
	 */
	public int getProductIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getProductId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productId</code> attribute. 
	 * @return the productId
	 */
	public int getProductIdAsPrimitive()
	{
		return getProductIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productId</code> attribute. 
	 * @param value the productId
	 */
	public void setProductId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PRODUCTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productId</code> attribute. 
	 * @param value the productId
	 */
	public void setProductId(final Integer value)
	{
		setProductId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productId</code> attribute. 
	 * @param value the productId
	 */
	public void setProductId(final SessionContext ctx, final int value)
	{
		setProductId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productId</code> attribute. 
	 * @param value the productId
	 */
	public void setProductId(final int value)
	{
		setProductId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productInfo</code> attribute.
	 * @return the productInfo
	 */
	public String getProductInfo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productInfo</code> attribute.
	 * @return the productInfo
	 */
	public String getProductInfo()
	{
		return getProductInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productInfo</code> attribute. 
	 * @param value the productInfo
	 */
	public void setProductInfo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productInfo</code> attribute. 
	 * @param value the productInfo
	 */
	public void setProductInfo(final String value)
	{
		setProductInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final String value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productPrice</code> attribute.
	 * @return the productPrice
	 */
	public Double getProductPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PRODUCTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productPrice</code> attribute.
	 * @return the productPrice
	 */
	public Double getProductPrice()
	{
		return getProductPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productPrice</code> attribute. 
	 * @return the productPrice
	 */
	public double getProductPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getProductPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojProduct.productPrice</code> attribute. 
	 * @return the productPrice
	 */
	public double getProductPriceAsPrimitive()
	{
		return getProductPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productPrice</code> attribute. 
	 * @param value the productPrice
	 */
	public void setProductPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PRODUCTPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productPrice</code> attribute. 
	 * @param value the productPrice
	 */
	public void setProductPrice(final Double value)
	{
		setProductPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productPrice</code> attribute. 
	 * @param value the productPrice
	 */
	public void setProductPrice(final SessionContext ctx, final double value)
	{
		setProductPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojProduct.productPrice</code> attribute. 
	 * @param value the productPrice
	 */
	public void setProductPrice(final double value)
	{
		setProductPrice( getSession().getSessionContext(), value );
	}
	
}
