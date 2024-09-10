package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.OrderPromoType;

/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemPromoDTO   {
  
  private OrderPromoType type;
  private BigDecimal discount;
  private BigDecimal subsidy;
  private String shopPromoId;
  private String marketPromoId;

  public OrderItemPromoDTO () {

  }

  public OrderItemPromoDTO (OrderPromoType type, BigDecimal discount, BigDecimal subsidy, String shopPromoId, String marketPromoId) {
    this.type = type;
    this.discount = discount;
    this.subsidy = subsidy;
    this.shopPromoId = shopPromoId;
    this.marketPromoId = marketPromoId;
  }

    
  @JsonProperty("type")
  public OrderPromoType getType() {
    return type;
  }
  public void setType(OrderPromoType type) {
    this.type = type;
  }

    
  @JsonProperty("discount")
  public BigDecimal getDiscount() {
    return discount;
  }
  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

    
  @JsonProperty("subsidy")
  public BigDecimal getSubsidy() {
    return subsidy;
  }
  public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

    
  @JsonProperty("shopPromoId")
  public String getShopPromoId() {
    return shopPromoId;
  }
  public void setShopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
  }

    
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
