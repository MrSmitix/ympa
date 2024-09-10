package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import org.openapitools.model.OrdersStatsItemStatusType;
import org.openapitools.model.OrdersStatsStockType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об удалении товара из заказа.
 **/
@ApiModel(description="Информация об удалении товара из заказа.")

public class OrdersStatsDetailsDTO  {
  
  @ApiModelProperty(value = "")
  private OrdersStatsItemStatusType itemStatus;

  @ApiModelProperty(value = "Количество товара со статусом, указанном в параметре `itemStatus`.")
 /**
   * Количество товара со статусом, указанном в параметре `itemStatus`.
  **/
  private Long itemCount;

  @ApiModelProperty(value = "Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ")
 /**
   * Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
  **/
  private LocalDate updateDate;

  @ApiModelProperty(value = "")
  private OrdersStatsStockType stockType;
 /**
   * Get itemStatus
   * @return itemStatus
  **/
  @JsonProperty("itemStatus")
  public OrdersStatsItemStatusType getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  public OrdersStatsDetailsDTO itemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

 /**
   * Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;.
   * @return itemCount
  **/
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }

  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  public OrdersStatsDetailsDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

 /**
   * Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   * @return updateDate
  **/
  @JsonProperty("updateDate")
  public LocalDate getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }

  public OrdersStatsDetailsDTO updateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
    return this;
  }

 /**
   * Get stockType
   * @return stockType
  **/
  @JsonProperty("stockType")
  public OrdersStatsStockType getStockType() {
    return stockType;
  }

  public void setStockType(OrdersStatsStockType stockType) {
    this.stockType = stockType;
  }

  public OrdersStatsDetailsDTO stockType(OrdersStatsStockType stockType) {
    this.stockType = stockType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

