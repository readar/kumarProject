/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11-Feb-2020, 9:43:51 AM                     ---
 * ----------------------------------------------------------------
 */
package com.mytraining.core.jalo;

import com.mytraining.core.constants.MytrainingCoreConstants;
import com.mytraining.core.jalo.ApparelProduct;
import com.mytraining.core.jalo.ApparelSizeVariantProduct;
import com.mytraining.core.jalo.ApparelStyleVariantProduct;
import com.mytraining.core.jalo.ElectronicsColorVariantProduct;
import com.mytraining.core.jalo.ManojCategory;
import com.mytraining.core.jalo.ManojProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>MytrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMytrainingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("productPrice", AttributeMode.INITIAL);
		tmp.put("productShortInfo", AttributeMode.INITIAL);
		tmp.put("firstName", AttributeMode.INITIAL);
		tmp.put("lastName", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MytrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MytrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MytrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MytrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ManojCategory createManojCategory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MytrainingCoreConstants.TC.MANOJCATEGORY );
			return (ManojCategory)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManojCategory : "+e.getMessage(), 0 );
		}
	}
	
	public ManojCategory createManojCategory(final Map attributeValues)
	{
		return createManojCategory( getSession().getSessionContext(), attributeValues );
	}
	
	public ManojProduct createManojProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MytrainingCoreConstants.TC.MANOJPRODUCT );
			return (ManojProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManojProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ManojProduct createManojProduct(final Map attributeValues)
	{
		return createManojProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, MytrainingCoreConstants.Attributes.Product.FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final Product item)
	{
		return getFirstName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, MytrainingCoreConstants.Attributes.Product.FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final Product item, final String value)
	{
		setFirstName( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return MytrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, MytrainingCoreConstants.Attributes.Product.LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final Product item)
	{
		return getLastName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, MytrainingCoreConstants.Attributes.Product.LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final Product item, final String value)
	{
		setLastName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productPrice</code> attribute.
	 * @return the productPrice
	 */
	public Integer getProductPrice(final SessionContext ctx, final Product item)
	{
		return (Integer)item.getProperty( ctx, MytrainingCoreConstants.Attributes.Product.PRODUCTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productPrice</code> attribute.
	 * @return the productPrice
	 */
	public Integer getProductPrice(final Product item)
	{
		return getProductPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productPrice</code> attribute. 
	 * @return the productPrice
	 */
	public int getProductPriceAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getProductPrice( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productPrice</code> attribute. 
	 * @return the productPrice
	 */
	public int getProductPriceAsPrimitive(final Product item)
	{
		return getProductPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productPrice</code> attribute. 
	 * @param value the productPrice
	 */
	public void setProductPrice(final SessionContext ctx, final Product item, final Integer value)
	{
		item.setProperty(ctx, MytrainingCoreConstants.Attributes.Product.PRODUCTPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productPrice</code> attribute. 
	 * @param value the productPrice
	 */
	public void setProductPrice(final Product item, final Integer value)
	{
		setProductPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productPrice</code> attribute. 
	 * @param value the productPrice
	 */
	public void setProductPrice(final SessionContext ctx, final Product item, final int value)
	{
		setProductPrice( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productPrice</code> attribute. 
	 * @param value the productPrice
	 */
	public void setProductPrice(final Product item, final int value)
	{
		setProductPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productShortInfo</code> attribute.
	 * @return the productShortInfo
	 */
	public String getProductShortInfo(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, MytrainingCoreConstants.Attributes.Product.PRODUCTSHORTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productShortInfo</code> attribute.
	 * @return the productShortInfo
	 */
	public String getProductShortInfo(final Product item)
	{
		return getProductShortInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productShortInfo</code> attribute. 
	 * @param value the productShortInfo
	 */
	public void setProductShortInfo(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, MytrainingCoreConstants.Attributes.Product.PRODUCTSHORTINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productShortInfo</code> attribute. 
	 * @param value the productShortInfo
	 */
	public void setProductShortInfo(final Product item, final String value)
	{
		setProductShortInfo( getSession().getSessionContext(), item, value );
	}
	
}
