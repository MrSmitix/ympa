package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.SkuBidItemDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список товаров с указанными ставками.
 */

@Schema(name = "GetBidsInfoResponseDTO", description = "Список товаров с указанными ставками.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBidsInfoResponseDTO {

  @Valid
  private List<@Valid SkuBidItemDTO> bids = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  public GetBidsInfoResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetBidsInfoResponseDTO(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
  }

  public GetBidsInfoResponseDTO bids(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
    return this;
  }

  public GetBidsInfoResponseDTO addBidsItem(SkuBidItemDTO bidsItem) {
    if (this.bids == null) {
      this.bids = new ArrayList<>();
    }
    this.bids.add(bidsItem);
    return this;
  }

  /**
   * Страница списка товаров.
   * @return bids
   */
  @NotNull @Valid 
  @Schema(name = "bids", description = "Страница списка товаров.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bids")
  public List<@Valid SkuBidItemDTO> getBids() {
    return bids;
  }

  public void setBids(List<@Valid SkuBidItemDTO> bids) {
    this.bids = bids;
  }

  public GetBidsInfoResponseDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

