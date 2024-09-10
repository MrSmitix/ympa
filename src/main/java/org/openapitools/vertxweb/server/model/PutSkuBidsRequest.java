package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.SkuBidItemDTO;

/**
 * description.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PutSkuBidsRequest   {
  
  private List<SkuBidItemDTO> bids = new ArrayList<>();

  public PutSkuBidsRequest () {

  }

  public PutSkuBidsRequest (List<SkuBidItemDTO> bids) {
    this.bids = bids;
  }

    
  @JsonProperty("bids")
  public List<SkuBidItemDTO> getBids() {
    return bids;
  }
  public void setBids(List<SkuBidItemDTO> bids) {
    this.bids = bids;
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
    return Objects.equals(bids, putSkuBidsRequest.bids);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
