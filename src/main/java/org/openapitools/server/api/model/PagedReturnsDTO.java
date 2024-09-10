package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ForwardScrollingPagerDTO;
import org.openapitools.server.api.model.ReturnDTO;

/**
 * Возвраты.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PagedReturnsDTO   {
  
  private ForwardScrollingPagerDTO paging;
  private List<ReturnDTO> returns = new ArrayList<>();

  public PagedReturnsDTO () {

  }

  public PagedReturnsDTO (ForwardScrollingPagerDTO paging, List<ReturnDTO> returns) {
    this.paging = paging;
    this.returns = returns;
  }

    
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
  @JsonProperty("returns")
  public List<ReturnDTO> getReturns() {
    return returns;
  }
  public void setReturns(List<ReturnDTO> returns) {
    this.returns = returns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedReturnsDTO pagedReturnsDTO = (PagedReturnsDTO) o;
    return Objects.equals(paging, pagedReturnsDTO.paging) &&
        Objects.equals(returns, pagedReturnsDTO.returns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, returns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedReturnsDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
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
