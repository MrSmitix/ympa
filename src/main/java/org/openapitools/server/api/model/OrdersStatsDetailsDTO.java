package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.server.api.model.OrdersStatsItemStatusType;
import org.openapitools.server.api.model.OrdersStatsStockType;

/**
 * Информация об удалении товара из заказа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersStatsDetailsDTO   {
  
  private OrdersStatsItemStatusType itemStatus;
  private Long itemCount;
  private LocalDate updateDate;
  private OrdersStatsStockType stockType;

  public OrdersStatsDetailsDTO () {

  }

  public OrdersStatsDetailsDTO (OrdersStatsItemStatusType itemStatus, Long itemCount, LocalDate updateDate, OrdersStatsStockType stockType) {
    this.itemStatus = itemStatus;
    this.itemCount = itemCount;
    this.updateDate = updateDate;
    this.stockType = stockType;
  }

    
  @JsonProperty("itemStatus")
  public OrdersStatsItemStatusType getItemStatus() {
    return itemStatus;
  }
  public void setItemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

    
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }
  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

    
  @JsonProperty("updateDate")
  public LocalDate getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }

    
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
