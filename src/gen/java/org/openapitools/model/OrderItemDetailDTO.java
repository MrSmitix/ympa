package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderItemStatusType;



/**
 * Детали по товару в заказе.
 **/

@ApiModel(description = "Детали по товару в заказе.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemDetailDTO   {
  @JsonProperty("itemCount")
  private Long itemCount;

  @JsonProperty("itemStatus")
  private OrderItemStatusType itemStatus;

  @JsonProperty("updateDate")
  private String updateDate;

  /**
   * Количество единиц товара.
   **/
  public OrderItemDetailDTO itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество единиц товара.")
  @JsonProperty("itemCount")
  public Long getItemCount() {
    return itemCount;
  }
  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }

  /**
   **/
  public OrderItemDetailDTO itemStatus(OrderItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("itemStatus")
  public OrderItemStatusType getItemStatus() {
    return itemStatus;
  }
  public void setItemStatus(OrderItemStatusType itemStatus) {
    this.itemStatus = itemStatus;
  }

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  public OrderItemDetailDTO updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
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

