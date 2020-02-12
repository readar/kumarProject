<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true" type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ attribute name="saiProduct" required="true" type="com.mytraining.facades.product.data.SaiProductData"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<div class="tab-details">
	<ycommerce:testId code="productDetails_content_label">
		<p>
			${ycommerce:sanitizeHTML(product.description)}
		<p>
		<p>
			${ycommerce:sanitizeHTML(saiProduct.shortDescription)}
		<p>
	</ycommerce:testId>
</div>