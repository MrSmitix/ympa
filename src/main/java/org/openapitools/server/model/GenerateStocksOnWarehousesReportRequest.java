package org.openapitools.server.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации отчета. 
 */
public class GenerateStocksOnWarehousesReportRequest   {

    private Long campaignId;
    private List<Long> warehouseIds;
    private LocalDate reportDate;
    private List<Long> categoryIds;
    private Boolean hasStocks;

    /**
     * Default constructor.
     */
    public GenerateStocksOnWarehousesReportRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateStocksOnWarehousesReportRequest.
     *
     * @param campaignId Идентификатор магазина.
     * @param warehouseIds Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
     * @param reportDate Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
     * @param categoryIds Фильтр по категориям на Маркете (кроме модели FBY).
     * @param hasStocks Фильтр по наличию остатков (кроме модели FBY).
     */
    public GenerateStocksOnWarehousesReportRequest(
        Long campaignId, 
        List<Long> warehouseIds, 
        LocalDate reportDate, 
        List<Long> categoryIds, 
        Boolean hasStocks
    ) {
        this.campaignId = campaignId;
        this.warehouseIds = warehouseIds;
        this.reportDate = reportDate;
        this.categoryIds = categoryIds;
        this.hasStocks = hasStocks;
    }



    /**
     * Идентификатор магазина.
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
     * @return warehouseIds
     */
    public List<Long> getWarehouseIds() {
        return warehouseIds;
    }

    public void setWarehouseIds(List<Long> warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    /**
     * Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
     * @return reportDate
     */
    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * Фильтр по категориям на Маркете (кроме модели FBY).
     * @return categoryIds
     */
    public List<Long> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }

    /**
     * Фильтр по наличию остатков (кроме модели FBY).
     * @return hasStocks
     */
    public Boolean getHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(Boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateStocksOnWarehousesReportRequest {\n");
        
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    warehouseIds: ").append(toIndentedString(warehouseIds)).append("\n");
        sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
        sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
        sb.append("    hasStocks: ").append(toIndentedString(hasStocks)).append("\n");
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

