package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.FullOutletDTO;
import org.openapitools.model.ScrollingPagerDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ответ на запрос информации о точках продаж.
 */

@Schema(name = "GetOutletsResponse", description = "Ответ на запрос информации о точках продаж.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOutletsResponse {

  @Valid
  private List<@Valid FullOutletDTO> outlets = new ArrayList<>();

  private ScrollingPagerDTO paging;

  private FlippingPagerDTO pager;

  public GetOutletsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetOutletsResponse(List<@Valid FullOutletDTO> outlets) {
    this.outlets = outlets;
  }

  public GetOutletsResponse outlets(List<@Valid FullOutletDTO> outlets) {
    this.outlets = outlets;
    return this;
  }

  public GetOutletsResponse addOutletsItem(FullOutletDTO outletsItem) {
    if (this.outlets == null) {
      this.outlets = new ArrayList<>();
    }
    this.outlets.add(outletsItem);
    return this;
  }

  /**
   * Информация о точках продаж.
   * @return outlets
   */
  @NotNull @Valid 
  @Schema(name = "outlets", description = "Информация о точках продаж.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("outlets")
  public List<@Valid FullOutletDTO> getOutlets() {
    return outlets;
  }

  public void setOutlets(List<@Valid FullOutletDTO> outlets) {
    this.outlets = outlets;
  }

  public GetOutletsResponse paging(ScrollingPagerDTO paging) {
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
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetOutletsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  /**
   * Get pager
   * @return pager
   */
  @Valid 
  @Schema(name = "pager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOutletsResponse getOutletsResponse = (GetOutletsResponse) o;
    return Objects.equals(this.outlets, getOutletsResponse.outlets) &&
        Objects.equals(this.paging, getOutletsResponse.paging) &&
        Objects.equals(this.pager, getOutletsResponse.pager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outlets, paging, pager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOutletsResponse {\n");
    sb.append("    outlets: ").append(toIndentedString(outlets)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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

