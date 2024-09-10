package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.OrderPromoType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 **/
@ApiModel(description="Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.")

public class OrderItemPromoDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OrderPromoType type;

  @ApiModelProperty(value = "Размер пользовательской скидки в валюте покупателя. ")
  @Valid
 /**
   * Размер пользовательской скидки в валюте покупателя. 
  **/
  private BigDecimal discount;

  @ApiModelProperty(value = "Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. ")
  @Valid
 /**
   * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
  **/
  private BigDecimal subsidy;

  @ApiModelProperty(value = "Идентификатор акции поставщика. ")
 /**
   * Идентификатор акции поставщика. 
  **/
  private String shopPromoId;

  @ApiModelProperty(value = "Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. ")
 /**
   * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
  **/
  private String marketPromoId;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public OrderPromoType getType() {
    return type;
  }

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
  @JsonProperty("discount")
  public BigDecimal getDiscount() {
    return discount;
  }

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
  @JsonProperty("subsidy")
  public BigDecimal getSubsidy() {
    return subsidy;
  }

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
  @JsonProperty("shopPromoId")
  public String getShopPromoId() {
    return shopPromoId;
  }

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
  @JsonProperty("marketPromoId")
  public String getMarketPromoId() {
    return marketPromoId;
  }

  public void setMarketPromoId(String marketPromoId) {
    this.marketPromoId = marketPromoId;
  }

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

