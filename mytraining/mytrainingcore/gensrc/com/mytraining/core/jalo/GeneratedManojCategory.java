/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 04-Feb-2020, 9:04:37 AM                     ---
 * ----------------------------------------------------------------
 */
package com.mytraining.core.jalo;

import com.mytraining.core.constants.MytrainingCoreConstants;
import com.mytraining.core.jalo.ManojProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ManojCategory}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManojCategory extends GenericItem
{
	/** Qualifier of the <code>ManojCategory.categoryId</code> attribute **/
	public static final String CATEGORYID = "categoryId";
	/** Qualifier of the <code>ManojCategory.categoryName</code> attribute **/
	public static final String CATEGORYNAME = "categoryName";
	/** Qualifier of the <code>ManojCategory.categoryInfo</code> attribute **/
	public static final String CATEGORYINFO = "categoryInfo";
	/** Qualifier of the <code>ManojCategory.manojProduct</code> attribute **/
	public static final String MANOJPRODUCT = "manojProduct";
	/**
	* {@link OneToManyHandler} for handling 1:n MANOJPRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ManojProduct> MANOJPRODUCTHANDLER = new OneToManyHandler<ManojProduct>(
	MytrainingCoreConstants.TC.MANOJPRODUCT,
	false,
	"manojCategory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	).withRelationQualifier("manojProduct");
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATEGORYID, AttributeMode.INITIAL);
		tmp.put(CATEGORYNAME, AttributeMode.INITIAL);
		tmp.put(CATEGORYINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.categoryId</code> attribute.
	 * @return the categoryId
	 */
	public Integer getCategoryId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CATEGORYID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.categoryId</code> attribute.
	 * @return the categoryId
	 */
	public Integer getCategoryId()
	{
		return getCategoryId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.categoryId</code> attribute. 
	 * @return the categoryId
	 */
	public int getCategoryIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCategoryId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.categoryId</code> attribute. 
	 * @return the categoryId
	 */
	public int getCategoryIdAsPrimitive()
	{
		return getCategoryIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.categoryId</code> attribute. 
	 * @param value the categoryId
	 */
	public void setCategoryId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CATEGORYID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.categoryId</code> attribute. 
	 * @param value the categoryId
	 */
	public void setCategoryId(final Integer value)
	{
		setCategoryId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.categoryId</code> attribute. 
	 * @param value the categoryId
	 */
	public void setCategoryId(final SessionContext ctx, final int value)
	{
		setCategoryId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.categoryId</code> attribute. 
	 * @param value the categoryId
	 */
	public void setCategoryId(final int value)
	{
		setCategoryId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.categoryInfo</code> attribute.
	 * @return the categoryInfo
	 */
	public String getCategoryInfo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATEGORYINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.categoryInfo</code> attribute.
	 * @return the categoryInfo
	 */
	public String getCategoryInfo()
	{
		return getCategoryInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.categoryInfo</code> attribute. 
	 * @param value the categoryInfo
	 */
	public void setCategoryInfo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATEGORYINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.categoryInfo</code> attribute. 
	 * @param value the categoryInfo
	 */
	public void setCategoryInfo(final String value)
	{
		setCategoryInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.categoryName</code> attribute.
	 * @return the categoryName
	 */
	public String getCategoryName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATEGORYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.categoryName</code> attribute.
	 * @return the categoryName
	 */
	public String getCategoryName()
	{
		return getCategoryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.categoryName</code> attribute. 
	 * @param value the categoryName
	 */
	public void setCategoryName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATEGORYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.categoryName</code> attribute. 
	 * @param value the categoryName
	 */
	public void setCategoryName(final String value)
	{
		setCategoryName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.manojProduct</code> attribute.
	 * @return the manojProduct
	 */
	public Collection<ManojProduct> getManojProduct(final SessionContext ctx)
	{
		return MANOJPRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManojCategory.manojProduct</code> attribute.
	 * @return the manojProduct
	 */
	public Collection<ManojProduct> getManojProduct()
	{
		return getManojProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.manojProduct</code> attribute. 
	 * @param value the manojProduct
	 */
	public void setManojProduct(final SessionContext ctx, final Collection<ManojProduct> value)
	{
		MANOJPRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManojCategory.manojProduct</code> attribute. 
	 * @param value the manojProduct
	 */
	public void setManojProduct(final Collection<ManojProduct> value)
	{
		setManojProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manojProduct. 
	 * @param value the item to add to manojProduct
	 */
	public void addToManojProduct(final SessionContext ctx, final ManojProduct value)
	{
		MANOJPRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manojProduct. 
	 * @param value the item to add to manojProduct
	 */
	public void addToManojProduct(final ManojProduct value)
	{
		addToManojProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manojProduct. 
	 * @param value the item to remove from manojProduct
	 */
	public void removeFromManojProduct(final SessionContext ctx, final ManojProduct value)
	{
		MANOJPRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manojProduct. 
	 * @param value the item to remove from manojProduct
	 */
	public void removeFromManojProduct(final ManojProduct value)
	{
		removeFromManojProduct( getSession().getSessionContext(), value );
	}
	
}
