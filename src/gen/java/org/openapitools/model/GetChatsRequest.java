package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Фильтры по чатам, которые нужно вернуть. 
 **/
@ApiModel(description = "Фильтры по чатам, которые нужно вернуть. ")
@JsonTypeName("GetChatsRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatsRequest   {
  private @Valid List<Long> orderIds;
  private @Valid List<ChatType> types;
  private @Valid List<ChatStatusType> statuses;

  /**
   * Фильтр по идентификаторам заказов на Маркете.
   **/
  public GetChatsRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по идентификаторам заказов на Маркете.")
  @JsonProperty("orderIds")
   @Size(min=1)public List<Long> getOrderIds() {
    return orderIds;
  }

  @JsonProperty("orderIds")
  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public GetChatsRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }

    this.orderIds.add(orderIdsItem);
    return this;
  }

  public GetChatsRequest removeOrderIdsItem(Long orderIdsItem) {
    if (orderIdsItem != null && this.orderIds != null) {
      this.orderIds.remove(orderIdsItem);
    }

    return this;
  }
  /**
   * Фильтр по типам чатов.
   **/
  public GetChatsRequest types(List<ChatType> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по типам чатов.")
  @JsonProperty("types")
   @Size(min=1)public List<ChatType> getTypes() {
    return types;
  }

  @JsonProperty("types")
  public void setTypes(List<ChatType> types) {
    this.types = types;
  }

  public GetChatsRequest addTypesItem(ChatType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }

    this.types.add(typesItem);
    return this;
  }

  public GetChatsRequest removeTypesItem(ChatType typesItem) {
    if (typesItem != null && this.types != null) {
      this.types.remove(typesItem);
    }

    return this;
  }
  /**
   * Фильтр по статусам чатов.
   **/
  public GetChatsRequest statuses(List<ChatStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по статусам чатов.")
  @JsonProperty("statuses")
   @Size(min=1)public List<ChatStatusType> getStatuses() {
    return statuses;
  }

  @JsonProperty("statuses")
  public void setStatuses(List<ChatStatusType> statuses) {
    this.statuses = statuses;
  }

  public GetChatsRequest addStatusesItem(ChatStatusType statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }

    this.statuses.add(statusesItem);
    return this;
  }

  public GetChatsRequest removeStatusesItem(ChatStatusType statusesItem) {
    if (statusesItem != null && this.statuses != null) {
      this.statuses.remove(statusesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

