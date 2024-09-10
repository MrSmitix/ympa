package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.OrdersStatsItemStatusType;
import org.openapitools.model.OrdersStatsStockType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об удалении товара из заказа.
 */

@Schema(name = "OrdersStatsDetailsDTO", description = "Информация об удалении товара из заказа.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsDetailsDTO {

  private OrdersStatsItemStatusType itemStatus;

  private Long itemCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date updateDate;

  private OrdersStatsStockType stockType;

  public OrdersStatsDetailsDTO itemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

  /**
   * Get itemStatus
   * @return itemStatus
   */
  @Valid 
  @Schema(name = "itemStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemStatus")
  public OrdersStatsItemStatusType getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  public OrdersStatsDetailsDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Количество товара со статусом, указанном в параметре `itemStatus`.
   * @return itemCount
   */
  
  @Schema(name = "itemCount", description = "Количество товара со статусом, указанном в параметре `itemStatus`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }

  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  public OrdersStatsDetailsDTO updateDate(Date updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return updateDate
   */
  @Valid 
  @Schema(name = "updateDate", description = "Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateDate")
  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public OrdersStatsDetailsDTO stockType(OrdersStatsStockType stockType) {
    this.stockType = stockType;
    return this;
  }

  /**
   * Get stockType
   * @return stockType
   */
  @Valid 
  @Schema(name = "stockType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stockType")
  public OrdersStatsStockType getStockType() {
    return stockType;
  }

  public void setStockType(OrdersStatsStockType stockType) {
    this.stockType = stockType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersStatsDetailsDTO ordersStatsDetailsDTO = (OrdersStatsDetailsDTO) o;
    return Objects.equals(this.itemStatus, ordersStatsDetailsDTO.itemStatus) &&
        Objects.equals(this.itemCount, ordersStatsDetailsDTO.itemCount) &&
        Objects.equals(this.updateDate, ordersStatsDetailsDTO.updateDate) &&
        Objects.equals(this.stockType, ordersStatsDetailsDTO.stockType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemStatus, itemCount, updateDate, stockType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersStatsDetailsDTO {\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    stockType: ").append(toIndentedString(stockType)).append("\n");
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

