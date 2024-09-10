package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Список товаров и ставок на них.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SkuBidItemDTO   {
  
  private String sku;
  private Integer bid;

  public SkuBidItemDTO () {

  }

  public SkuBidItemDTO (String sku, Integer bid) {
    this.sku = sku;
    this.bid = bid;
  }

    
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

    
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuBidItemDTO skuBidItemDTO = (SkuBidItemDTO) o;
    return Objects.equals(sku, skuBidItemDTO.sku) &&
        Objects.equals(bid, skuBidItemDTO.bid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, bid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuBidItemDTO {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
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
