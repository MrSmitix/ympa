package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.SkuBidItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список товаров с указанными ставками.
 **/
@ApiModel(description = "Список товаров с указанными ставками.")
@JsonTypeName("GetBidsInfoResponseDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBidsInfoResponseDTO   {
  private @Valid List<@Valid SkuBidItemDTO> bids = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   * Страница списка товаров.
   **/
  public GetBidsInfoResponseDTO bids(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Страница списка товаров.")
  @JsonProperty("bids")
  @NotNull @Valid public List<@Valid SkuBidItemDTO> getBids() {
    return bids;
  }

  @JsonProperty("bids")
  public void setBids(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
  }

  public GetBidsInfoResponseDTO addBidsItem(SkuBidItemDTO bidsItem) {
    if (this.bids == null) {
      this.bids = new ArrayList<>();
    }

    this.bids.add(bidsItem);
    return this;
  }

  public GetBidsInfoResponseDTO removeBidsItem(SkuBidItemDTO bidsItem) {
    if (bidsItem != null && this.bids != null) {
      this.bids.remove(bidsItem);
    }

    return this;
  }
  /**
   **/
  public GetBidsInfoResponseDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

