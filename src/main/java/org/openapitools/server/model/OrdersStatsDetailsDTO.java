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

package org.openapitools.server.model;

import java.util.Date;
import org.openapitools.server.model.OrdersStatsItemStatusType;
import org.openapitools.server.model.OrdersStatsStockType;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Информация об удалении товара из заказа.
  */

public class OrdersStatsDetailsDTO  {
  
  @JsonbProperty("itemStatus")
  private OrdersStatsItemStatusType itemStatus;

 /**
  * Количество товара со статусом, указанном в параметре `itemStatus`.
  */
  @JsonbProperty("itemCount")
  private Long itemCount;

 /**
  * Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
  */
  @JsonbProperty("updateDate")
  private Date updateDate;

  @JsonbProperty("stockType")
  private OrdersStatsStockType stockType;

  /**
   * Get itemStatus
   * @return itemStatus
   **/
  public OrdersStatsItemStatusType getItemStatus() {
    return itemStatus;
  }

  /**
   * Set itemStatus
   */
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
  public Long getItemCount() {
    return itemCount;
  }

  /**
   * Set itemCount
   */
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
  public Date getUpdateDate() {
    return updateDate;
  }

  /**
   * Set updateDate
   */
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public OrdersStatsDetailsDTO updateDate(Date updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get stockType
   * @return stockType
   **/
  public OrdersStatsStockType getStockType() {
    return stockType;
  }

  /**
   * Set stockType
   */
  public void setStockType(OrdersStatsStockType stockType) {
    this.stockType = stockType;
  }

  public OrdersStatsDetailsDTO stockType(OrdersStatsStockType stockType) {
    this.stockType = stockType;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
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

