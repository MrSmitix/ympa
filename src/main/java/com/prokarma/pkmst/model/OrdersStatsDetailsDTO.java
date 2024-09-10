package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OrdersStatsItemStatusType;
import com.prokarma.pkmst.model.OrdersStatsStockType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация об удалении товара из заказа.
 */
@ApiModel(description = "Информация об удалении товара из заказа.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsDetailsDTO   {
  @JsonProperty("itemStatus")
  private OrdersStatsItemStatusType itemStatus;

  @JsonProperty("itemCount")
  private Long itemCount;

  @JsonProperty("updateDate")
  private LocalDate updateDate;

  @JsonProperty("stockType")
  private OrdersStatsStockType stockType;

  public OrdersStatsDetailsDTO itemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

  /**
   * Get itemStatus
   * @return itemStatus
   */
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
   * Количество товара со статусом, указанном в параметре `itemStatus`.
   * @return itemCount
   */
  @ApiModelProperty(value = "Количество товара со статусом, указанном в параметре `itemStatus`.")
  public Long getItemCount() {
    return itemCount;
  }

  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  public OrdersStatsDetailsDTO updateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return updateDate
   */
  @ApiModelProperty(value = "Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ")
  public LocalDate getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDate updateDate) {
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

