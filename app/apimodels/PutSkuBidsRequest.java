package apimodels;

import apimodels.SkuBidItemDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * description.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PutSkuBidsRequest   {
  @JsonProperty("bids")
  @NotNull
@Size(min=1,max=1500)
@Valid

  private List<@Valid SkuBidItemDTO> bids = new ArrayList<>();

  public PutSkuBidsRequest bids(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
    return this;
  }

  public PutSkuBidsRequest addBidsItem(SkuBidItemDTO bidsItem) {
    if (this.bids == null) {
      this.bids = new ArrayList<>();
    }
    this.bids.add(bidsItem);
    return this;
  }

   /**
   * Список товаров и ставки для продвижения, которые на них нужно установить.
   * @return bids
  **/
  public List<@Valid SkuBidItemDTO> getBids() {
    return bids;
  }

  public void setBids(List<@Valid SkuBidItemDTO> bids) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

