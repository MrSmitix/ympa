package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OrderItemStatusType;

/**
 * Детали по товару в заказе.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemDetailDTO   {
  
  private Long itemCount;
  private OrderItemStatusType itemStatus;
  private String updateDate;

  public OrderItemDetailDTO () {

  }

  public OrderItemDetailDTO (Long itemCount, OrderItemStatusType itemStatus, String updateDate) {
    this.itemCount = itemCount;
    this.itemStatus = itemStatus;
    this.updateDate = updateDate;
  }

    
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }
  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

    
  @JsonProperty("itemStatus")
  public OrderItemStatusType getItemStatus() {
    return itemStatus;
  }
  public void setItemStatus(OrderItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

    
  @JsonProperty("updateDate")
  public String getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemDetailDTO orderItemDetailDTO = (OrderItemDetailDTO) o;
    return Objects.equals(itemCount, orderItemDetailDTO.itemCount) &&
        Objects.equals(itemStatus, orderItemDetailDTO.itemStatus) &&
        Objects.equals(updateDate, orderItemDetailDTO.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCount, itemStatus, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemDetailDTO {\n");
    
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
