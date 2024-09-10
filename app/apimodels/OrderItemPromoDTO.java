package apimodels;

import apimodels.OrderPromoType;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderItemPromoDTO   {
  @JsonProperty("type")
  @NotNull
@Valid

  private OrderPromoType type;

  @JsonProperty("discount")
  @Valid

  private BigDecimal discount;

  @JsonProperty("subsidy")
  @Valid

  private BigDecimal subsidy;

  @JsonProperty("shopPromoId")
  
  private String shopPromoId;

  @JsonProperty("marketPromoId")
  
  private String marketPromoId;

  public OrderItemPromoDTO type(OrderPromoType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public OrderPromoType getType() {
    return type;
  }

  public void setType(OrderPromoType type) {
    this.type = type;
  }

  public OrderItemPromoDTO discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Размер пользовательской скидки в валюте покупателя. 
   * @return discount
  **/
  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public OrderItemPromoDTO subsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
    return this;
  }

   /**
   * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
   * @return subsidy
  **/
  public BigDecimal getSubsidy() {
    return subsidy;
  }

  public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

  public OrderItemPromoDTO shopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
    return this;
  }

   /**
   * Идентификатор акции поставщика. 
   * @return shopPromoId
  **/
  public String getShopPromoId() {
    return shopPromoId;
  }

  public void setShopPromoId(String shopPromoId) {
    this.shopPromoId = shopPromoId;
  }

  public OrderItemPromoDTO marketPromoId(String marketPromoId) {
    this.marketPromoId = marketPromoId;
    return this;
  }

   /**
   * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
   * @return marketPromoId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

