package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SkuBidItemDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * description.
 **/
@ApiModel(description="description.")

public class PutSkuBidsRequest  {
  
  @ApiModelProperty(required = true, value = "Список товаров и ставки для продвижения, которые на них нужно установить.")
 /**
   * Список товаров и ставки для продвижения, которые на них нужно установить.
  **/
  private List<SkuBidItemDTO> bids = new ArrayList<>();
 /**
   * Список товаров и ставки для продвижения, которые на них нужно установить.
   * @return bids
  **/
  @JsonProperty("bids")
  public List<SkuBidItemDTO> getBids() {
    return bids;
  }

  public void setBids(List<SkuBidItemDTO> bids) {
    this.bids = bids;
  }

  public PutSkuBidsRequest bids(List<SkuBidItemDTO> bids) {
    this.bids = bids;
    return this;
  }

  public PutSkuBidsRequest addBidsItem(SkuBidItemDTO bidsItem) {
    this.bids.add(bidsItem);
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
    PutSkuBidsRequest putSkuBidsRequest = (PutSkuBidsRequest) o;
    return Objects.equals(this.bids, putSkuBidsRequest.bids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutSkuBidsRequest {\n");
    
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
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

