package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.OrderPromoType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */

@Schema(name = "OrderItemPromoDTO", description = "Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemPromoDTO {

  private OrderPromoType type;

  private BigDecimal discount;

  private BigDecimal subsidy;

  private String shopPromoId;

  private String marketPromoId;

  public OrderItemPromoDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderItemPromoDTO(OrderPromoType type) {
    this.type = type;
  }

  public OrderItemPromoDTO type(OrderPromoType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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
   */
  @Valid 
  @Schema(name = "discount", description = "Размер пользовательской скидки в валюте покупателя. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discount")
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
   */
  @Valid 
  @Schema(name = "subsidy", description = "Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subsidy")
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
   */
  
  @Schema(name = "shopPromoId", description = "Идентификатор акции поставщика. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopPromoId")
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
   */
  
  @Schema(name = "marketPromoId", description = "Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

