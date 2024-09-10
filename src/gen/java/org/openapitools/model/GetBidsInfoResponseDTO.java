package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.SkuBidItemDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров с указанными ставками.
 **/
@ApiModel(description="Список товаров с указанными ставками.")

public class GetBidsInfoResponseDTO  {
  
  @ApiModelProperty(required = true, value = "Страница списка товаров.")
 /**
   * Страница списка товаров.
  **/
  private List<SkuBidItemDTO> bids = new ArrayList<>();

  @ApiModelProperty(value = "")
  private ForwardScrollingPagerDTO paging;
 /**
   * Страница списка товаров.
   * @return bids
  **/
  @JsonProperty("bids")
  public List<SkuBidItemDTO> getBids() {
    return bids;
  }

  public void setBids(List<SkuBidItemDTO> bids) {
    this.bids = bids;
  }

  public GetBidsInfoResponseDTO bids(List<SkuBidItemDTO> bids) {
    this.bids = bids;
    return this;
  }

  public GetBidsInfoResponseDTO addBidsItem(SkuBidItemDTO bidsItem) {
    this.bids.add(bidsItem);
    return this;
  }

 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetBidsInfoResponseDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
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
    GetBidsInfoResponseDTO getBidsInfoResponseDTO = (GetBidsInfoResponseDTO) o;
    return Objects.equals(this.bids, getBidsInfoResponseDTO.bids) &&
        Objects.equals(this.paging, getBidsInfoResponseDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bids, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBidsInfoResponseDTO {\n");
    
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

