package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrderPromoType;



/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 **/

@ApiModel(description = "Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemPromoDTO   {
  @JsonProperty("type")
  private OrderPromoType type;

  @JsonProperty("discount")
  private BigDecimal discount;

  @JsonProperty("subsidy")
  private BigDecimal subsidy;

  @JsonProperty("shopPromoId")
  private String shopPromoId;

  @JsonProperty("marketPromoId")
  private String marketPromoId;

  /**
   **/
  public OrderItemPromoDTO type(OrderPromoType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public OrderPromoType getType() {
    return type;
  }
  public void setType(OrderPromoType type) {
    this.type = type;
  }

  /**
   * Размер пользовательской скидки в валюте покупателя. 
   **/
  public OrderItemPromoDTO discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

  
  @ApiModelProperty(value = "Размер пользовательской скидки в валюте покупателя. ")
  @JsonProperty("discount")
  public BigDecimal getDiscount() {
    return discount;
  }
  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  /**
   * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
   **/
  public OrderItemPromoDTO subsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
    return this;
  }

  
  @ApiModelProperty(value = "Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. ")
  @JsonProperty("subsidy")
  public BigDecimal getSubsidy() {
    return subsidy;
  }
  public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

  /**
   * Идентификатор акции поставщика. 
   **/
  public OrderItemPromoDTO shopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор акции поставщика. ")
  @JsonProperty("shopPromoId")
  public String getShopPromoId() {
    return shopPromoId;
  }
  public void setShopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
  }

  /**
   * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
   **/
  public OrderItemPromoDTO marketPromoId(String marketPromoId) {
    this.marketPromoId = marketPromoId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. ")
  @JsonProperty("marketPromoId")
  public String getMarketPromoId() {
    return marketPromoId;
  }
  public void setMarketPromoId(String marketPromoId) {
    this.marketPromoId = marketPromoId;
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
    return Objects.equals(type, orderItemPromoDTO.type) &&
        Objects.equals(discount, orderItemPromoDTO.discount) &&
        Objects.equals(subsidy, orderItemPromoDTO.subsidy) &&
        Objects.equals(shopPromoId, orderItemPromoDTO.shopPromoId) &&
        Objects.equals(marketPromoId, orderItemPromoDTO.marketPromoId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

