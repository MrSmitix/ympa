package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Модель для пагинации.
 */

@Schema(name = "FlippingPagerDTO", description = "Модель для пагинации.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FlippingPagerDTO {

  private Integer total;

  private Integer from;

  private Integer to;

  private Integer currentPage;

  private Integer pagesCount;

  private Integer pageSize;

  public FlippingPagerDTO total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Сколько всего найдено элементов.
   * @return total
   */
  
  @Schema(name = "total", description = "Сколько всего найдено элементов.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public FlippingPagerDTO from(Integer from) {
    this.from = from;
    return this;
  }

  /**
   * Начальный номер найденного элемента на странице.
   * @return from
   */
  
  @Schema(name = "from", description = "Начальный номер найденного элемента на странице.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public FlippingPagerDTO to(Integer to) {
    this.to = to;
    return this;
  }

  /**
   * Конечный номер найденного элемента на странице.
   * @return to
   */
  
  @Schema(name = "to", description = "Конечный номер найденного элемента на странице.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("to")
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  public FlippingPagerDTO currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Текущая страница.
   * @return currentPage
   */
  
  @Schema(name = "currentPage", description = "Текущая страница.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public FlippingPagerDTO pagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

  /**
   * Общее количество страниц.
   * @return pagesCount
   */
  
  @Schema(name = "pagesCount", description = "Общее количество страниц.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pagesCount")
  public Integer getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

  public FlippingPagerDTO pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Размер страницы.
   * @return pageSize
   */
  
  @Schema(name = "pageSize", description = "Размер страницы.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

