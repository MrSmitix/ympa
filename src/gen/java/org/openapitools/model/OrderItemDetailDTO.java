package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OrderItemStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Детали по товару в заказе.
 **/
@ApiModel(description="Детали по товару в заказе.")

public class OrderItemDetailDTO  {
  
  @ApiModelProperty(value = "Количество единиц товара.")
 /**
   * Количество единиц товара.
  **/
  private Long itemCount;

  @ApiModelProperty(value = "")
  @Valid
  private OrderItemStatusType itemStatus;

  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
 /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
  **/
  private String updateDate;
 /**
   * Количество единиц товара.
   * @return itemCount
  **/
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }

  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  public OrderItemDetailDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

 /**
   * Get itemStatus
   * @return itemStatus
  **/
  @JsonProperty("itemStatus")
  public OrderItemStatusType getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(OrderItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  public OrderItemDetailDTO itemStatus(OrderItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

 /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return updateDate
  **/
  @JsonProperty("updateDate")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public OrderItemDetailDTO updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

