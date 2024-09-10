package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;

/**
 * Фильтры по чатам, которые нужно вернуть. 
 */
@ApiModel(description = "Фильтры по чатам, которые нужно вернуть. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatsRequest   {
  @JsonProperty("orderIds")
  private List<Long> orderIds = null;

  @JsonProperty("types")
  private List<ChatType> types = null;

  @JsonProperty("statuses")
  private List<ChatStatusType> statuses = null;

  public GetChatsRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public GetChatsRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = ;
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Фильтр по идентификаторам заказов на Маркете.
   * @return orderIds
  **/
  @ApiModelProperty(value = "Фильтр по идентификаторам заказов на Маркете.")
  public List<Long> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public GetChatsRequest types(List<ChatType> types) {
    this.types = types;
    return this;
  }

  public GetChatsRequest addTypesItem(ChatType typesItem) {
    if (this.types == null) {
      this.types = ;
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Фильтр по типам чатов.
   * @return types
  **/
  @ApiModelProperty(value = "Фильтр по типам чатов.")
  public List<ChatType> getTypes() {
    return types;
  }

  public void setTypes(List<ChatType> types) {
    this.types = types;
  }

  public GetChatsRequest statuses(List<ChatStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  public GetChatsRequest addStatusesItem(ChatStatusType statusesItem) {
    if (this.statuses == null) {
      this.statuses = ;
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Фильтр по статусам чатов.
   * @return statuses
  **/
  @ApiModelProperty(value = "Фильтр по статусам чатов.")
  public List<ChatStatusType> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<ChatStatusType> statuses) {
    this.statuses = statuses;
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

