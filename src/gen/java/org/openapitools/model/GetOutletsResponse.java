package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.FullOutletDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ответ на запрос информации о точках продаж.
 **/
@ApiModel(description = "Ответ на запрос информации о точках продаж.")
@JsonTypeName("GetOutletsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOutletsResponse   {
  private @Valid List<@Valid FullOutletDTO> outlets = new ArrayList<>();
  private ScrollingPagerDTO paging;
  private FlippingPagerDTO pager;

  /**
   * Информация о точках продаж.
   **/
  public GetOutletsResponse outlets(List<@Valid FullOutletDTO> outlets) {
    this.outlets = outlets;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о точках продаж.")
  @JsonProperty("outlets")
  @NotNull @Valid public List<@Valid FullOutletDTO> getOutlets() {
    return outlets;
  }

  @JsonProperty("outlets")
  public void setOutlets(List<@Valid FullOutletDTO> outlets) {
    this.outlets = outlets;
  }

  public GetOutletsResponse addOutletsItem(FullOutletDTO outletsItem) {
    if (this.outlets == null) {
      this.outlets = new ArrayList<>();
    }

    this.outlets.add(outletsItem);
    return this;
  }

  public GetOutletsResponse removeOutletsItem(FullOutletDTO outletsItem) {
    if (outletsItem != null && this.outlets != null) {
      this.outlets.remove(outletsItem);
    }

    return this;
  }
  /**
   **/
  public GetOutletsResponse paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   **/
  public GetOutletsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pager")
  @Valid public FlippingPagerDTO getPager() {
    return pager;
  }

  @JsonProperty("pager")
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

