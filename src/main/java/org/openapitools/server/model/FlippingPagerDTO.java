package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Модель для пагинации.
 */
public class FlippingPagerDTO   {

    private Integer total;
    private Integer from;
    private Integer to;
    private Integer currentPage;
    private Integer pagesCount;
    private Integer pageSize;

    /**
     * Default constructor.
     */
    public FlippingPagerDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FlippingPagerDTO.
     *
     * @param total Сколько всего найдено элементов.
     * @param from Начальный номер найденного элемента на странице.
     * @param to Конечный номер найденного элемента на странице.
     * @param currentPage Текущая страница.
     * @param pagesCount Общее количество страниц.
     * @param pageSize Размер страницы.
     */
    public FlippingPagerDTO(
        Integer total, 
        Integer from, 
        Integer to, 
        Integer currentPage, 
        Integer pagesCount, 
        Integer pageSize
    ) {
        this.total = total;
        this.from = from;
        this.to = to;
        this.currentPage = currentPage;
        this.pagesCount = pagesCount;
        this.pageSize = pageSize;
    }



    /**
     * Сколько всего найдено элементов.
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Начальный номер найденного элемента на странице.
     * @return from
     */
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    /**
     * Конечный номер найденного элемента на странице.
     * @return to
     */
    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    /**
     * Текущая страница.
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Общее количество страниц.
     * @return pagesCount
     */
    public Integer getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(Integer pagesCount) {
        this.pagesCount = pagesCount;
    }

    /**
     * Размер страницы.
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

