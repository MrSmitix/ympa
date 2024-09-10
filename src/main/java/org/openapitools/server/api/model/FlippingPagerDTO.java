package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Модель для пагинации.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlippingPagerDTO   {
  
  private Integer total;
  private Integer from;
  private Integer to;
  private Integer currentPage;
  private Integer pagesCount;
  private Integer pageSize;

  public FlippingPagerDTO () {

  }

  public FlippingPagerDTO (Integer total, Integer from, Integer to, Integer currentPage, Integer pagesCount, Integer pageSize) {
    this.total = total;
    this.from = from;
    this.to = to;
    this.currentPage = currentPage;
    this.pagesCount = pagesCount;
    this.pageSize = pageSize;
  }

    
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

    
  @JsonProperty("from")
  public Integer getFrom() {
    return from;
  }
  public void setFrom(Integer from) {
    this.from = from;
  }

    
  @JsonProperty("to")
  public Integer getTo() {
    return to;
  }
  public void setTo(Integer to) {
    this.to = to;
  }

    
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

    
  @JsonProperty("pagesCount")
  public Integer getPagesCount() {
    return pagesCount;
  }
  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

    
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlippingPagerDTO flippingPagerDTO = (FlippingPagerDTO) o;
    return Objects.equals(total, flippingPagerDTO.total) &&
        Objects.equals(from, flippingPagerDTO.from) &&
        Objects.equals(to, flippingPagerDTO.to) &&
        Objects.equals(currentPage, flippingPagerDTO.currentPage) &&
        Objects.equals(pagesCount, flippingPagerDTO.pagesCount) &&
        Objects.equals(pageSize, flippingPagerDTO.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, from, to, currentPage, pagesCount, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlippingPagerDTO {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
