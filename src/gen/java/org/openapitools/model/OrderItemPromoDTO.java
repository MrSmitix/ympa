package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.OrderPromoType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */
@ApiModel(description="Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.")

public class OrderItemPromoDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OrderPromoType type;

 /**
  * Размер пользовательской скидки в валюте покупателя. 
  */
  @ApiModelProperty(value = "Размер пользовательской скидки в валюте покупателя. ")
  @Valid
  private BigDecimal discount;

 /**
  * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
  */
  @ApiModelProperty(value = "Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. ")
  @Valid
  private BigDecimal subsidy;

 /**
  * Идентификатор акции поставщика. 
  */
  @ApiModelProperty(value = "Идентификатор акции поставщика. ")
  private String shopPromoId;

 /**
  * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
  */
  @ApiModelProperty(value = "Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. ")
  private String marketPromoId;
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public OrderPromoType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(OrderPromoType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public OrderItemPromoDTO type(OrderPromoType type) {
    this.type = type;
    return this;
  }

 /**
  * Размер пользовательской скидки в валюте покупателя. 
  * @return discount
  */
  @JsonProperty("discount")
  public BigDecimal getDiscount() {
    return discount;
  }

  /**
   * Sets the <code>discount</code> property.
   */
 public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  /**
   * Sets the <code>discount</code> property.
   */
  public OrderItemPromoDTO discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

 /**
  * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
  * @return subsidy
  */
  @JsonProperty("subsidy")
  public BigDecimal getSubsidy() {
    return subsidy;
  }

  /**
   * Sets the <code>subsidy</code> property.
   */
 public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

  /**
   * Sets the <code>subsidy</code> property.
   */
  public OrderItemPromoDTO subsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
    return this;
  }

 /**
  * Идентификатор акции поставщика. 
  * @return shopPromoId
  */
  @JsonProperty("shopPromoId")
  public String getShopPromoId() {
    return shopPromoId;
  }

  /**
   * Sets the <code>shopPromoId</code> property.
   */
 public void setShopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
  }

  /**
   * Sets the <code>shopPromoId</code> property.
   */
  public OrderItemPromoDTO shopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
    return this;
  }

 /**
  * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;. 
  * @return marketPromoId
  */
  @JsonProperty("marketPromoId")
  public String getMarketPromoId() {
    return marketPromoId;
  }

  /**
   * Sets the <code>marketPromoId</code> property.
   */
 public void setMarketPromoId(String marketPromoId) {
    this.marketPromoId = marketPromoId;
  }

  /**
   * Sets the <code>marketPromoId</code> property.
   */
  public OrderItemPromoDTO marketPromoId(String marketPromoId) {
    this.marketPromoId = marketPromoId;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemPromoDTO orderItemPromoDTO = (OrderItemPromoDTO) o;
    return Objects.equals(this.type, orderItemPromoDTO.type) &&
        Objects.equals(this.discount, orderItemPromoDTO.discount) &&
        Objects.equals(this.subsidy, orderItemPromoDTO.subsidy) &&
        Objects.equals(this.shopPromoId, orderItemPromoDTO.shopPromoId) &&
        Objects.equals(this.marketPromoId, orderItemPromoDTO.marketPromoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, discount, subsidy, shopPromoId, marketPromoId);
  }

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

