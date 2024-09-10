/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Модель для пагинации.
 */
@Schema(name = "FlippingPagerDTO", description = "Модель для пагинации.")
@JsonPropertyOrder({
  FlippingPagerDTO.JSON_PROPERTY_TOTAL,
  FlippingPagerDTO.JSON_PROPERTY_FROM,
  FlippingPagerDTO.JSON_PROPERTY_TO,
  FlippingPagerDTO.JSON_PROPERTY_CURRENT_PAGE,
  FlippingPagerDTO.JSON_PROPERTY_PAGES_COUNT,
  FlippingPagerDTO.JSON_PROPERTY_PAGE_SIZE
})
@JsonTypeName("FlippingPagerDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class FlippingPagerDTO {
    public static final String JSON_PROPERTY_TOTAL = "total";
    private Integer total;

    public static final String JSON_PROPERTY_FROM = "from";
    private Integer from;

    public static final String JSON_PROPERTY_TO = "to";
    private Integer to;

    public static final String JSON_PROPERTY_CURRENT_PAGE = "currentPage";
    private Integer currentPage;

    public static final String JSON_PROPERTY_PAGES_COUNT = "pagesCount";
    private Integer pagesCount;

    public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
    private Integer pageSize;

    public FlippingPagerDTO() {
    }

    public FlippingPagerDTO total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Сколько всего найдено элементов.
     * @return total
     */
    @Nullable
    @Schema(name = "total", description = "Сколько всего найдено элементов.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TOTAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTotal() {
        return total;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Schema(name = "from", description = "Начальный номер найденного элемента на странице.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getFrom() {
        return from;
    }

    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Schema(name = "to", description = "Конечный номер найденного элемента на странице.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTo() {
        return to;
    }

    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Schema(name = "currentPage", description = "Текущая страница.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CURRENT_PAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getCurrentPage() {
        return currentPage;
    }

    @JsonProperty(JSON_PROPERTY_CURRENT_PAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Schema(name = "pagesCount", description = "Общее количество страниц.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPagesCount() {
        return pagesCount;
    }

    @JsonProperty(JSON_PROPERTY_PAGES_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Schema(name = "pageSize", description = "Размер страницы.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

