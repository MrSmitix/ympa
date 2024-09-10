package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OrderItemStatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Детали по товару в заказе.
 */

@Schema(name = "OrderItemDetailDTO", description = "Детали по товару в заказе.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemDetailDTO {

  private Long itemCount;

  private OrderItemStatusType itemStatus;

  private String updateDate;

  public OrderItemDetailDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Количество единиц товара.
   * @return itemCount
   */
  
  @Schema(name = "itemCount", description = "Количество единиц товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }

  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  public OrderItemDetailDTO itemStatus(OrderItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

  /**
   * Get itemStatus
   * @return itemStatus
   */
  @Valid 
  @Schema(name = "itemStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemStatus")
  public OrderItemStatusType getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(OrderItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  public OrderItemDetailDTO updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   * @return updateDate
   */
  
  @Schema(name = "updateDate", example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.itemCount, orderItemDetailDTO.itemCount) &&
        Objects.equals(this.itemStatus, orderItemDetailDTO.itemStatus) &&
        Objects.equals(this.updateDate, orderItemDetailDTO.updateDate);
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
