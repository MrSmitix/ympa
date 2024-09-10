package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrderPromoType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemPromoDTO   {
  
  private OrderPromoType type;
  private BigDecimal discount;
  private BigDecimal subsidy;
  private String shopPromoId;
  private String marketPromoId;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  @Valid
  public OrderPromoType getType() {
    return type;
  }
  public void setType(OrderPromoType type) {
    this.type = type;
  }

  /**
   * Размер пользовательской скидки в валюте покупателя. 
   **/
  
  @ApiModelProperty(value = "Размер пользовательской скидки в валюте покупателя. ")
  @JsonProperty("discount")
  @Valid
  public BigDecimal getDiscount() {
    return discount;
  }
  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  /**
   * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
   **/
  
  @ApiModelProperty(value = "Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. ")
  @JsonProperty("subsidy")
  @Valid
  public BigDecimal getSubsidy() {
    return subsidy;
  }
  public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

  /**
   * Идентификатор акции поставщика. 
   **/
  
  @ApiModelProperty(value = "Идентификатор акции поставщика. ")
  @JsonProperty("shopPromoId")
  public String getShopPromoId() {
    return shopPromoId;
  }
  public void setShopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
  }

  /**
   * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;. 
   **/
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
