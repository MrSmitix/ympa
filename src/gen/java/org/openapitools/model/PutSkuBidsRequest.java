package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SkuBidItemDTO;



/**
 * description.
 **/

@ApiModel(description = "description.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PutSkuBidsRequest   {
  @JsonProperty("bids")
  private List<SkuBidItemDTO> bids = new ArrayList<>();

  /**
   * Список товаров и ставки для продвижения, которые на них нужно установить.
   **/
  public PutSkuBidsRequest bids(List<SkuBidItemDTO> bids) {
    this.bids = bids;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров и ставки для продвижения, которые на них нужно установить.")
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

