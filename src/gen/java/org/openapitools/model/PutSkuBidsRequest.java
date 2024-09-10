package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * description.
 **/
@ApiModel(description = "description.")
@JsonTypeName("PutSkuBidsRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PutSkuBidsRequest   {
  private @Valid List<@Valid SkuBidItemDTO> bids = new ArrayList<>();

  /**
   * Список товаров и ставки для продвижения, которые на них нужно установить.
   **/
  public PutSkuBidsRequest bids(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров и ставки для продвижения, которые на них нужно установить.")
  @JsonProperty("bids")
  @NotNull @Valid  @Size(min=1,max=1500)public List<@Valid SkuBidItemDTO> getBids() {
    return bids;
  }

  @JsonProperty("bids")
  public void setBids(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
  }

  public PutSkuBidsRequest addBidsItem(SkuBidItemDTO bidsItem) {
    if (this.bids == null) {
      this.bids = new ArrayList<>();
    }

    this.bids.add(bidsItem);
    return this;
  }

  public PutSkuBidsRequest removeBidsItem(SkuBidItemDTO bidsItem) {
    if (bidsItem != null && this.bids != null) {
      this.bids.remove(bidsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

