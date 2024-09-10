package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.FlippingPagerDTO;
import org.openapitools.server.api.model.FullOutletDTO;
import org.openapitools.server.api.model.ScrollingPagerDTO;

/**
 * Ответ на запрос информации о точках продаж.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOutletsResponse   {
  
  private List<FullOutletDTO> outlets = new ArrayList<>();
  private ScrollingPagerDTO paging;
  private FlippingPagerDTO pager;

  public GetOutletsResponse () {

  }

  public GetOutletsResponse (List<FullOutletDTO> outlets, ScrollingPagerDTO paging, FlippingPagerDTO pager) {
    this.outlets = outlets;
    this.paging = paging;
    this.pager = pager;
  }

    
  @JsonProperty("outlets")
  public List<FullOutletDTO> getOutlets() {
    return outlets;
  }
  public void setOutlets(List<FullOutletDTO> outlets) {
    this.outlets = outlets;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
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
    return Objects.equals(outlets, getOutletsResponse.outlets) &&
        Objects.equals(paging, getOutletsResponse.paging) &&
        Objects.equals(pager, getOutletsResponse.pager);
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
