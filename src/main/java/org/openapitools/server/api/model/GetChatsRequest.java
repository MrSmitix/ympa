package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ChatStatusType;
import org.openapitools.server.api.model.ChatType;

/**
 * Фильтры по чатам, которые нужно вернуть. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetChatsRequest   {
  
  private List<Long> orderIds;
  private List<ChatType> types;
  private List<ChatStatusType> statuses;

  public GetChatsRequest () {

  }

  public GetChatsRequest (List<Long> orderIds, List<ChatType> types, List<ChatStatusType> statuses) {
    this.orderIds = orderIds;
    this.types = types;
    this.statuses = statuses;
  }

    
  @JsonProperty("orderIds")
  public List<Long> getOrderIds() {
    return orderIds;
  }
  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

    
  @JsonProperty("types")
  public List<ChatType> getTypes() {
    return types;
  }
  public void setTypes(List<ChatType> types) {
    this.types = types;
  }

    
  @JsonProperty("statuses")
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
    return Objects.equals(orderIds, getChatsRequest.orderIds) &&
        Objects.equals(types, getChatsRequest.types) &&
        Objects.equals(statuses, getChatsRequest.statuses);
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
