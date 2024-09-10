package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Модель для пагинации.
 **/

@ApiModel(description = "Модель для пагинации.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FlippingPagerDTO   {
  @JsonProperty("total")
  private Integer total;

  @JsonProperty("from")
  private Integer from;

  @JsonProperty("to")
  private Integer to;

  @JsonProperty("currentPage")
  private Integer currentPage;

  @JsonProperty("pagesCount")
  private Integer pagesCount;

  @JsonProperty("pageSize")
  private Integer pageSize;

  /**
   * Сколько всего найдено элементов.
   **/
  public FlippingPagerDTO total(Integer total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(value = "Сколько всего найдено элементов.")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   * Начальный номер найденного элемента на странице.
   **/
  public FlippingPagerDTO from(Integer from) {
    this.from = from;
    return this;
  }

  
  @ApiModelProperty(value = "Начальный номер найденного элемента на странице.")
  @JsonProperty("from")
  public Integer getFrom() {
    return from;
  }
  public void setFrom(Integer from) {
    this.from = from;
  }

  /**
   * Конечный номер найденного элемента на странице.
   **/
  public FlippingPagerDTO to(Integer to) {
    this.to = to;
    return this;
  }

  
  @ApiModelProperty(value = "Конечный номер найденного элемента на странице.")
  @JsonProperty("to")
  public Integer getTo() {
    return to;
  }
  public void setTo(Integer to) {
    this.to = to;
  }

  /**
   * Текущая страница.
   **/
  public FlippingPagerDTO currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  
  @ApiModelProperty(value = "Текущая страница.")
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  /**
   * Общее количество страниц.
   **/
  public FlippingPagerDTO pagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

  
  @ApiModelProperty(value = "Общее количество страниц.")
  @JsonProperty("pagesCount")
  public Integer getPagesCount() {
    return pagesCount;
  }
  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

  /**
   * Размер страницы.
   **/
  public FlippingPagerDTO pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  
  @ApiModelProperty(value = "Размер страницы.")
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

