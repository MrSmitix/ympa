package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Модель для пагинации.
 **/
@ApiModel(description="Модель для пагинации.")

public class FlippingPagerDTO  {
  
  @ApiModelProperty(value = "Сколько всего найдено элементов.")
 /**
   * Сколько всего найдено элементов.
  **/
  private Integer total;

  @ApiModelProperty(value = "Начальный номер найденного элемента на странице.")
 /**
   * Начальный номер найденного элемента на странице.
  **/
  private Integer from;

  @ApiModelProperty(value = "Конечный номер найденного элемента на странице.")
 /**
   * Конечный номер найденного элемента на странице.
  **/
  private Integer to;

  @ApiModelProperty(value = "Текущая страница.")
 /**
   * Текущая страница.
  **/
  private Integer currentPage;

  @ApiModelProperty(value = "Общее количество страниц.")
 /**
   * Общее количество страниц.
  **/
  private Integer pagesCount;

  @ApiModelProperty(value = "Размер страницы.")
 /**
   * Размер страницы.
  **/
  private Integer pageSize;
 /**
   * Сколько всего найдено элементов.
   * @return total
  **/
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public FlippingPagerDTO total(Integer total) {
    this.total = total;
    return this;
  }

 /**
   * Начальный номер найденного элемента на странице.
   * @return from
  **/
  @JsonProperty("from")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public FlippingPagerDTO from(Integer from) {
    this.from = from;
    return this;
  }

 /**
   * Конечный номер найденного элемента на странице.
   * @return to
  **/
  @JsonProperty("to")
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  public FlippingPagerDTO to(Integer to) {
    this.to = to;
    return this;
  }

 /**
   * Текущая страница.
   * @return currentPage
  **/
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public FlippingPagerDTO currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

 /**
   * Общее количество страниц.
   * @return pagesCount
  **/
  @JsonProperty("pagesCount")
  public Integer getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

  public FlippingPagerDTO pagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

 /**
   * Размер страницы.
   * @return pageSize
  **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public FlippingPagerDTO pageSize(Integer pageSize) {
    this.pageSize = pageSize;
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
    FlippingPagerDTO flippingPagerDTO = (FlippingPagerDTO) o;
    return Objects.equals(this.total, flippingPagerDTO.total) &&
        Objects.equals(this.from, flippingPagerDTO.from) &&
        Objects.equals(this.to, flippingPagerDTO.to) &&
        Objects.equals(this.currentPage, flippingPagerDTO.currentPage) &&
        Objects.equals(this.pagesCount, flippingPagerDTO.pagesCount) &&
        Objects.equals(this.pageSize, flippingPagerDTO.pageSize);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

