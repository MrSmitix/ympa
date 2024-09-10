package apimodels;

import apimodels.OrdersStatsItemStatusType;
import apimodels.OrdersStatsStockType;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об удалении товара из заказа.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrdersStatsDetailsDTO   {
  @JsonProperty("itemStatus")
  @Valid

  private OrdersStatsItemStatusType itemStatus;

  @JsonProperty("itemCount")
  
  private Long itemCount;

  @JsonProperty("updateDate")
  @Valid

  private LocalDate updateDate;

  @JsonProperty("stockType")
  @Valid

  private OrdersStatsStockType stockType;

  public OrdersStatsDetailsDTO itemStatus(OrdersStatsItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Get itemStatus
   * @return itemStatus
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

