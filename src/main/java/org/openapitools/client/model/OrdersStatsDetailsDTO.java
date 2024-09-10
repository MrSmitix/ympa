/**
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

package org.openapitools.client.model;

import java.util.Date;
import org.openapitools.client.model.OrdersStatsItemStatusType;
import org.openapitools.client.model.OrdersStatsStockType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Информация об удалении товара из заказа.
 **/
@ApiModel(description = "Информация об удалении товара из заказа.")
public class OrdersStatsDetailsDTO {
  
  @SerializedName("itemStatus")
  private OrdersStatsItemStatusType itemStatus = null;
  @SerializedName("itemCount")
  private Long itemCount = null;
  @SerializedName("updateDate")
  private Date updateDate = null;
  @SerializedName("stockType")
  private OrdersStatsStockType stockType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public OrdersStatsItemStatusType getItemStatus() {
    return itemStatus;
  }
  public void setItemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  /**
   * Количество товара со статусом, указанном в параметре `itemStatus`.
   **/
  @ApiModelProperty(value = "Количество товара со статусом, указанном в параметре `itemStatus`.")
  public Long getItemCount() {
    return itemCount;
  }
  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  /**
   * Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
   **/
  @ApiModelProperty(value = "Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ")
  public Date getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.itemStatus == null ? ordersStatsDetailsDTO.itemStatus == null : this.itemStatus.equals(ordersStatsDetailsDTO.itemStatus)) &&
        (this.itemCount == null ? ordersStatsDetailsDTO.itemCount == null : this.itemCount.equals(ordersStatsDetailsDTO.itemCount)) &&
        (this.updateDate == null ? ordersStatsDetailsDTO.updateDate == null : this.updateDate.equals(ordersStatsDetailsDTO.updateDate)) &&
        (this.stockType == null ? ordersStatsDetailsDTO.stockType == null : this.stockType.equals(ordersStatsDetailsDTO.stockType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.itemStatus == null ? 0: this.itemStatus.hashCode());
    result = 31 * result + (this.itemCount == null ? 0: this.itemCount.hashCode());
    result = 31 * result + (this.updateDate == null ? 0: this.updateDate.hashCode());
    result = 31 * result + (this.stockType == null ? 0: this.stockType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersStatsDetailsDTO {\n");
    
    sb.append("  itemStatus: ").append(itemStatus).append("\n");
    sb.append("  itemCount: ").append(itemCount).append("\n");
    sb.append("  updateDate: ").append(updateDate).append("\n");
    sb.append("  stockType: ").append(stockType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
