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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.OrdersStatsItemStatusType;
import org.openapitools.model.OrdersStatsStockType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация об удалении товара из заказа.
 */
@ApiModel(description = "Информация об удалении товара из заказа.")
@JsonPropertyOrder({
  OrdersStatsDetailsDTO.JSON_PROPERTY_ITEM_STATUS,
  OrdersStatsDetailsDTO.JSON_PROPERTY_ITEM_COUNT,
  OrdersStatsDetailsDTO.JSON_PROPERTY_UPDATE_DATE,
  OrdersStatsDetailsDTO.JSON_PROPERTY_STOCK_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsDetailsDTO   {
  public static final String JSON_PROPERTY_ITEM_STATUS = "itemStatus";
  @JsonProperty(JSON_PROPERTY_ITEM_STATUS)
  private OrdersStatsItemStatusType itemStatus;

  public static final String JSON_PROPERTY_ITEM_COUNT = "itemCount";
  @JsonProperty(JSON_PROPERTY_ITEM_COUNT)
  private Long itemCount;

  public static final String JSON_PROPERTY_UPDATE_DATE = "updateDate";
  @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
  private Date updateDate;

  public static final String JSON_PROPERTY_STOCK_TYPE = "stockType";
  @JsonProperty(JSON_PROPERTY_STOCK_TYPE)
  private OrdersStatsStockType stockType;

  public OrdersStatsDetailsDTO itemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

  /**
   * Get itemStatus
   * @return itemStatus
   **/
  @JsonProperty(value = "itemStatus")
  @ApiModelProperty(value = "")
  
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
   * Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;.
   * @return itemCount
   **/
  @JsonProperty(value = "itemCount")
  @ApiModelProperty(value = "Количество товара со статусом, указанном в параметре `itemStatus`.")
  
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
   * Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   * @return updateDate
   **/
  @JsonProperty(value = "updateDate")
  @ApiModelProperty(value = "Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ")
  
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
   **/
  @JsonProperty(value = "stockType")
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

