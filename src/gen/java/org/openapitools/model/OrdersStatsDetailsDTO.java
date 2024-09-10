package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import org.openapitools.model.OrdersStatsItemStatusType;
import org.openapitools.model.OrdersStatsStockType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация об удалении товара из заказа.
 **/
@ApiModel(description = "Информация об удалении товара из заказа.")
@JsonTypeName("OrdersStatsDetailsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsDetailsDTO   {
  private OrdersStatsItemStatusType itemStatus;
  private Long itemCount;
  private LocalDate updateDate;
  private OrdersStatsStockType stockType;

  /**
   **/
  public OrdersStatsDetailsDTO itemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("itemStatus")
  public OrdersStatsItemStatusType getItemStatus() {
    return itemStatus;
  }

  @JsonProperty("itemStatus")
  public void setItemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  /**
   * Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;.
   **/
  public OrdersStatsDetailsDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество товара со статусом, указанном в параметре `itemStatus`.")
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }

  @JsonProperty("itemCount")
  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  /**
   * Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   **/
  public OrdersStatsDetailsDTO updateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonProperty("updateDate")
  public LocalDate getUpdateDate() {
    return updateDate;
  }

  @JsonProperty("updateDate")
  public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }

  /**
   **/
  public OrdersStatsDetailsDTO stockType(OrdersStatsStockType stockType) {
    this.stockType = stockType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stockType")
  public OrdersStatsStockType getStockType() {
    return stockType;
  }

  @JsonProperty("stockType")
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

