package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Модель для пагинации.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FlippingPagerDTO   {
  
  private Integer total;
  private Integer from;
  private Integer to;
  private Integer currentPage;
  private Integer pagesCount;
  private Integer pageSize;

  /**
   * Сколько всего найдено элементов.
   **/
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

