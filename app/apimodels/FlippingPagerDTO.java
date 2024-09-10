package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Модель для пагинации.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  public FlippingPagerDTO total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Сколько всего найдено элементов.
   * @return total
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

