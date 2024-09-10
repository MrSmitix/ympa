package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.FullOutletDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ответ на запрос информации о точках продаж.
 **/
@ApiModel(description="Ответ на запрос информации о точках продаж.")

public class GetOutletsResponse  {
  
  @ApiModelProperty(required = true, value = "Информация о точках продаж.")
  @Valid
 /**
   * Информация о точках продаж.
  **/
  private List<@Valid FullOutletDTO> outlets = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;

  @ApiModelProperty(value = "")
  @Valid
  private FlippingPagerDTO pager;
 /**
   * Информация о точках продаж.
   * @return outlets
  **/
  @JsonProperty("outlets")
  @NotNull
  public List<@Valid FullOutletDTO> getOutlets() {
    return outlets;
  }

  public void setOutlets(List<@Valid FullOutletDTO> outlets) {
    this.outlets = outlets;
  }

  public GetOutletsResponse outlets(List<@Valid FullOutletDTO> outlets) {
    this.outlets = outlets;
    return this;
  }

  public GetOutletsResponse addOutletsItem(FullOutletDTO outletsItem) {
    this.outlets.add(outletsItem);
    return this;
  }

 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetOutletsResponse paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
   * Get pager
   * @return pager
  **/
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  public GetOutletsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

