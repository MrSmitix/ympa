package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OrderItemStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Детали по товару в заказе.
 */
@ApiModel(description = "Детали по товару в заказе.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemDetailDTO   {
  @JsonProperty("itemCount")
  private Long itemCount;

  @JsonProperty("itemStatus")
  private OrderItemStatusType itemStatus;

  @JsonProperty("updateDate")
  private String updateDate;

  public OrderItemDetailDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Количество единиц товара.
   * @return itemCount
   */
  @ApiModelProperty(value = "Количество единиц товара.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
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

