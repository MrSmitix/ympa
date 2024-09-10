package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Фильтры по чатам, которые нужно вернуть. 
 **/
@ApiModel(description="Фильтры по чатам, которые нужно вернуть. ")

public class GetChatsRequest  {
  
  @ApiModelProperty(value = "Фильтр по идентификаторам заказов на Маркете.")
 /**
   * Фильтр по идентификаторам заказов на Маркете.
  **/
  private List<Long> orderIds;

  @ApiModelProperty(value = "Фильтр по типам чатов.")
 /**
   * Фильтр по типам чатов.
  **/
  private List<ChatType> types;

  @ApiModelProperty(value = "Фильтр по статусам чатов.")
 /**
   * Фильтр по статусам чатов.
  **/
  private List<ChatStatusType> statuses;
 /**
   * Фильтр по идентификаторам заказов на Маркете.
   * @return orderIds
  **/
  @JsonProperty("orderIds")
  public List<Long> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public GetChatsRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public GetChatsRequest addOrderIdsItem(Long orderIdsItem) {
    this.orderIds.add(orderIdsItem);
    return this;
  }

 /**
   * Фильтр по типам чатов.
   * @return types
  **/
  @JsonProperty("types")
  public List<ChatType> getTypes() {
    return types;
  }

  public void setTypes(List<ChatType> types) {
    this.types = types;
  }

  public GetChatsRequest types(List<ChatType> types) {
    this.types = types;
    return this;
  }

  public GetChatsRequest addTypesItem(ChatType typesItem) {
    this.types.add(typesItem);
    return this;
  }

 /**
   * Фильтр по статусам чатов.
   * @return statuses
  **/
  @JsonProperty("statuses")
  public List<ChatStatusType> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<ChatStatusType> statuses) {
    this.statuses = statuses;
  }

  public GetChatsRequest statuses(List<ChatStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

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

