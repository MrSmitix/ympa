package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Информация об условиях доставки для данной точки продаж.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutletDeliveryRuleDTO   {
  
  private Integer minDeliveryDays;
  private Integer maxDeliveryDays;
  private Long deliveryServiceId;
  private Integer orderBefore;
  private BigDecimal priceFreePickup;
  private Boolean unspecifiedDeliveryInterval;

  public OutletDeliveryRuleDTO () {

  }

  public OutletDeliveryRuleDTO (Integer minDeliveryDays, Integer maxDeliveryDays, Long deliveryServiceId, Integer orderBefore, BigDecimal priceFreePickup, Boolean unspecifiedDeliveryInterval) {
    this.minDeliveryDays = minDeliveryDays;
    this.maxDeliveryDays = maxDeliveryDays;
    this.deliveryServiceId = deliveryServiceId;
    this.orderBefore = orderBefore;
    this.priceFreePickup = priceFreePickup;
    this.unspecifiedDeliveryInterval = unspecifiedDeliveryInterval;
  }

    
  @JsonProperty("minDeliveryDays")
  public Integer getMinDeliveryDays() {
    return minDeliveryDays;
  }
  public void setMinDeliveryDays(Integer minDeliveryDays) {
    this.minDeliveryDays = minDeliveryDays;
  }

    
  @JsonProperty("maxDeliveryDays")
  public Integer getMaxDeliveryDays() {
    return maxDeliveryDays;
  }
  public void setMaxDeliveryDays(Integer maxDeliveryDays) {
    this.maxDeliveryDays = maxDeliveryDays;
  }

    
  @JsonProperty("deliveryServiceId")
  public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }
  public void setDeliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

    
  @JsonProperty("orderBefore")
  public Integer getOrderBefore() {
    return orderBefore;
  }
  public void setOrderBefore(Integer orderBefore) {
    this.orderBefore = orderBefore;
  }

    
  @JsonProperty("priceFreePickup")
  public BigDecimal getPriceFreePickup() {
    return priceFreePickup;
  }
  public void setPriceFreePickup(BigDecimal priceFreePickup) {
    this.priceFreePickup = priceFreePickup;
  }

    
  @JsonProperty("unspecifiedDeliveryInterval")
  public Boolean getUnspecifiedDeliveryInterval() {
    return unspecifiedDeliveryInterval;
  }
  public void setUnspecifiedDeliveryInterval(Boolean unspecifiedDeliveryInterval) {
    this.unspecifiedDeliveryInterval = unspecifiedDeliveryInterval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletDeliveryRuleDTO outletDeliveryRuleDTO = (OutletDeliveryRuleDTO) o;
    return Objects.equals(minDeliveryDays, outletDeliveryRuleDTO.minDeliveryDays) &&
        Objects.equals(maxDeliveryDays, outletDeliveryRuleDTO.maxDeliveryDays) &&
        Objects.equals(deliveryServiceId, outletDeliveryRuleDTO.deliveryServiceId) &&
        Objects.equals(orderBefore, outletDeliveryRuleDTO.orderBefore) &&
        Objects.equals(priceFreePickup, outletDeliveryRuleDTO.priceFreePickup) &&
        Objects.equals(unspecifiedDeliveryInterval, outletDeliveryRuleDTO.unspecifiedDeliveryInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minDeliveryDays, maxDeliveryDays, deliveryServiceId, orderBefore, priceFreePickup, unspecifiedDeliveryInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletDeliveryRuleDTO {\n");
    
    sb.append("    minDeliveryDays: ").append(toIndentedString(minDeliveryDays)).append("\n");
    sb.append("    maxDeliveryDays: ").append(toIndentedString(maxDeliveryDays)).append("\n");
    sb.append("    deliveryServiceId: ").append(toIndentedString(deliveryServiceId)).append("\n");
    sb.append("    orderBefore: ").append(toIndentedString(orderBefore)).append("\n");
    sb.append("    priceFreePickup: ").append(toIndentedString(priceFreePickup)).append("\n");
    sb.append("    unspecifiedDeliveryInterval: ").append(toIndentedString(unspecifiedDeliveryInterval)).append("\n");
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
