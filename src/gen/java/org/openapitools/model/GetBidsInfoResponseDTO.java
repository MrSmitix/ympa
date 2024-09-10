package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.SkuBidItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список товаров с указанными ставками.
 */
@ApiModel(description="Список товаров с указанными ставками.")

public class GetBidsInfoResponseDTO  {
  
 /**
  * Страница списка товаров.
  */
  @ApiModelProperty(required = true, value = "Страница списка товаров.")
  @Valid
  private List<@Valid SkuBidItemDTO> bids = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;
 /**
  * Страница списка товаров.
  * @return bids
  */
  @JsonProperty("bids")
  @NotNull
  public List<@Valid SkuBidItemDTO> getBids() {
    return bids;
  }

  /**
   * Sets the <code>bids</code> property.
   */
 public void setBids(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
  }

  /**
   * Sets the <code>bids</code> property.
   */
  public GetBidsInfoResponseDTO bids(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
    return this;
  }

  /**
   * Adds a new item to the <code>bids</code> list.
   */
  public GetBidsInfoResponseDTO addBidsItem(SkuBidItemDTO bidsItem) {
    this.bids.add(bidsItem);
    return this;
  }

 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
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

