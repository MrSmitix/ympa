package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Фильтры по чатам, которые нужно вернуть. 
 */
@ApiModel(description="Фильтры по чатам, которые нужно вернуть. ")

public class GetChatsRequest  {
  
 /**
  * Фильтр по идентификаторам заказов на Маркете.
  */
  @ApiModelProperty(value = "Фильтр по идентификаторам заказов на Маркете.")
  private List<Long> orderIds;

 /**
  * Фильтр по типам чатов.
  */
  @ApiModelProperty(value = "Фильтр по типам чатов.")
  @Valid
  private List<ChatType> types;

 /**
  * Фильтр по статусам чатов.
  */
  @ApiModelProperty(value = "Фильтр по статусам чатов.")
  @Valid
  private List<ChatStatusType> statuses;
 /**
  * Фильтр по идентификаторам заказов на Маркете.
  * @return orderIds
  */
  @JsonProperty("orderIds")
 @Size(min=1)  public List<Long> getOrderIds() {
    return orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
 public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
  public GetChatsRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  /**
   * Adds a new item to the <code>orderIds</code> list.
   */
  public GetChatsRequest addOrderIdsItem(Long orderIdsItem) {
    this.orderIds.add(orderIdsItem);
    return this;
  }

 /**
  * Фильтр по типам чатов.
  * @return types
  */
  @JsonProperty("types")
 @Size(min=1)  public List<ChatType> getTypes() {
    return types;
  }

  /**
   * Sets the <code>types</code> property.
   */
 public void setTypes(List<ChatType> types) {
    this.types = types;
  }

  /**
   * Sets the <code>types</code> property.
   */
  public GetChatsRequest types(List<ChatType> types) {
    this.types = types;
    return this;
  }

  /**
   * Adds a new item to the <code>types</code> list.
   */
  public GetChatsRequest addTypesItem(ChatType typesItem) {
    this.types.add(typesItem);
    return this;
  }

 /**
  * Фильтр по статусам чатов.
  * @return statuses
  */
  @JsonProperty("statuses")
 @Size(min=1)  public List<ChatStatusType> getStatuses() {
    return statuses;
  }

  /**
   * Sets the <code>statuses</code> property.
   */
 public void setStatuses(List<ChatStatusType> statuses) {
    this.statuses = statuses;
  }

  /**
   * Sets the <code>statuses</code> property.
   */
  public GetChatsRequest statuses(List<ChatStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Adds a new item to the <code>statuses</code> list.
   */
  public GetChatsRequest addStatusesItem(ChatStatusType statusesItem) {
    this.statuses.add(statusesItem);
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
    GetChatsRequest getChatsRequest = (GetChatsRequest) o;
    return Objects.equals(this.orderIds, getChatsRequest.orderIds) &&
        Objects.equals(this.types, getChatsRequest.types) &&
        Objects.equals(this.statuses, getChatsRequest.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderIds, types, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChatsRequest {\n");
    
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

