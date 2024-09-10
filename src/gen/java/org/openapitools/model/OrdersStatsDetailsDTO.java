package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import org.openapitools.model.OrdersStatsItemStatusType;
import org.openapitools.model.OrdersStatsStockType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об удалении товара из заказа.
 */
@ApiModel(description="Информация об удалении товара из заказа.")

public class OrdersStatsDetailsDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OrdersStatsItemStatusType itemStatus;

 /**
  * Количество товара со статусом, указанном в параметре `itemStatus`.
  */
  @ApiModelProperty(value = "Количество товара со статусом, указанном в параметре `itemStatus`.")
  private Long itemCount;

 /**
  * Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
  */
  @ApiModelProperty(value = "Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate updateDate;

  @ApiModelProperty(value = "")
  @Valid
  private OrdersStatsStockType stockType;
 /**
  * Get itemStatus
  * @return itemStatus
  */
  @JsonProperty("itemStatus")
  public OrdersStatsItemStatusType getItemStatus() {
    return itemStatus;
  }

  /**
   * Sets the <code>itemStatus</code> property.
   */
 public void setItemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  /**
   * Sets the <code>itemStatus</code> property.
   */
  public OrdersStatsDetailsDTO itemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

 /**
  * Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;.
  * @return itemCount
  */
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }

  /**
   * Sets the <code>itemCount</code> property.
   */
 public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  /**
   * Sets the <code>itemCount</code> property.
   */
  public OrdersStatsDetailsDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

 /**
  * Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
  * @return updateDate
  */
  @JsonProperty("updateDate")
  public LocalDate getUpdateDate() {
    return updateDate;
  }

  /**
   * Sets the <code>updateDate</code> property.
   */
 public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }

  /**
   * Sets the <code>updateDate</code> property.
   */
  public OrdersStatsDetailsDTO updateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
    return this;
  }

 /**
  * Get stockType
  * @return stockType
  */
  @JsonProperty("stockType")
  public OrdersStatsStockType getStockType() {
    return stockType;
  }

  /**
   * Sets the <code>stockType</code> property.
   */
 public void setStockType(OrdersStatsStockType stockType) {
    this.stockType = stockType;
  }

  /**
   * Sets the <code>stockType</code> property.
   */
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

