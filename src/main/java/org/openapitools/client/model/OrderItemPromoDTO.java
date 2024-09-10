/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.client.model.OrderPromoType;



/**
  * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 **/

public class OrderItemPromoDTO  {
  
  private OrderPromoType type;

 /**
   * Размер пользовательской скидки в валюте покупателя. 
  **/
  private BigDecimal discount;

 /**
   * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
  **/
  private BigDecimal subsidy;

 /**
   * Идентификатор акции поставщика. 
  **/
  private String shopPromoId;

 /**
   * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
  **/
  private String marketPromoId;

 /**
   * Get type
   * @return type
  **/
  public OrderPromoType getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(OrderPromoType type) {
    this.type = type;
  }

  public OrderItemPromoDTO type(OrderPromoType type) {
    this.type = type;
    return this;
  }

 /**
   * Размер пользовательской скидки в валюте покупателя. 
   * @return discount
  **/
  public BigDecimal getDiscount() {
    return discount;
  }

  /**
    * Set discount
  **/
  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public OrderItemPromoDTO discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

 /**
   * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
   * @return subsidy
  **/
  public BigDecimal getSubsidy() {
    return subsidy;
  }

  /**
    * Set subsidy
  **/
  public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

  public OrderItemPromoDTO subsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
    return this;
  }

 /**
   * Идентификатор акции поставщика. 
   * @return shopPromoId
  **/
  public String getShopPromoId() {
    return shopPromoId;
  }

  /**
    * Set shopPromoId
  **/
  public void setShopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
  }

  public OrderItemPromoDTO shopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
    return this;
  }

 /**
   * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;. 
   * @return marketPromoId
  **/
  public String getMarketPromoId() {
    return marketPromoId;
  }

  /**
    * Set marketPromoId
  **/
  public void setMarketPromoId(String marketPromoId) {
    this.marketPromoId = marketPromoId;
  }

  public OrderItemPromoDTO marketPromoId(String marketPromoId) {
    this.marketPromoId = marketPromoId;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemPromoDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    subsidy: ").append(toIndentedString(subsidy)).append("\n");
    sb.append("    shopPromoId: ").append(toIndentedString(shopPromoId)).append("\n");
    sb.append("    marketPromoId: ").append(toIndentedString(marketPromoId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
