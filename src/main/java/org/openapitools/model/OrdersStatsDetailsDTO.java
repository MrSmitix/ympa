/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.OrdersStatsItemStatusType;
import org.openapitools.model.OrdersStatsStockType;



/**
 * Информация об удалении товара из заказа.
 */

@ApiModel(description = "Информация об удалении товара из заказа.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsDetailsDTO   {
  
  private OrdersStatsItemStatusType itemStatus;
  private Long itemCount;
  private Date updateDate;
  private OrdersStatsStockType stockType;

  /**
   */
  public OrdersStatsDetailsDTO itemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("itemStatus")
  public OrdersStatsItemStatusType getItemStatus() {
    return itemStatus;
  }
  public void setItemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  /**
   * Количество товара со статусом, указанном в параметре `itemStatus`.
   */
  public OrdersStatsDetailsDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество товара со статусом, указанном в параметре `itemStatus`.")
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }
  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  /**
   * Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
   */
  public OrdersStatsDetailsDTO updateDate(Date updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonProperty("updateDate")
  public Date getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  /**
   */
  public OrdersStatsDetailsDTO stockType(OrdersStatsStockType stockType) {
    this.stockType = stockType;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(itemStatus, ordersStatsDetailsDTO.itemStatus) &&
        Objects.equals(itemCount, ordersStatsDetailsDTO.itemCount) &&
        Objects.equals(updateDate, ordersStatsDetailsDTO.updateDate) &&
        Objects.equals(stockType, ordersStatsDetailsDTO.stockType);
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

