package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ForwardScrollingPagerDTO;
import org.openapitools.vertxweb.server.model.SkuBidItemDTO;

/**
 * Список товаров с указанными ставками.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBidsInfoResponseDTO   {
  
  private List<SkuBidItemDTO> bids = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public GetBidsInfoResponseDTO () {

  }

  public GetBidsInfoResponseDTO (List<SkuBidItemDTO> bids, ForwardScrollingPagerDTO paging) {
    this.bids = bids;
    this.paging = paging;
  }

    
  @JsonProperty("bids")
  public List<SkuBidItemDTO> getBids() {
    return bids;
  }
  public void setBids(List<SkuBidItemDTO> bids) {
    this.bids = bids;
  }

    
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
