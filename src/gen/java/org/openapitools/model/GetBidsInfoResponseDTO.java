package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.SkuBidItemDTO;



/**
 * Список товаров с указанными ставками.
 **/

@ApiModel(description = "Список товаров с указанными ставками.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBidsInfoResponseDTO   {
  @JsonProperty("bids")
  private List<SkuBidItemDTO> bids = new ArrayList<>();

  @JsonProperty("paging")
  private ForwardScrollingPagerDTO paging;

  /**
   * Страница списка товаров.
   **/
  public GetBidsInfoResponseDTO bids(List<SkuBidItemDTO> bids) {
    this.bids = bids;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Страница списка товаров.")
  @JsonProperty("bids")
  public List<SkuBidItemDTO> getBids() {
    return bids;
  }
  public void setBids(List<SkuBidItemDTO> bids) {
    this.bids = bids;
  }

  /**
   **/
  public GetBidsInfoResponseDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }
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
    return Objects.equals(bids, getBidsInfoResponseDTO.bids) &&
        Objects.equals(paging, getBidsInfoResponseDTO.paging);
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

