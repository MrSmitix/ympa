package apimodels;

import apimodels.ChatStatusType;
import apimodels.ChatType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Фильтры по чатам, которые нужно вернуть. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetChatsRequest   {
  @JsonProperty("orderIds")
  @Size(min=1)

  private List<Long> orderIds = null;

  @JsonProperty("types")
  @Size(min=1)
@Valid

  private List<ChatType> types = null;

  @JsonProperty("statuses")
  @Size(min=1)
@Valid

  private List<ChatStatusType> statuses = null;

  public GetChatsRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public GetChatsRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Фильтр по идентификаторам заказов на Маркете.
   * @return orderIds
  **/
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
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Фильтр по типам чатов.
   * @return types
  **/
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
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Фильтр по статусам чатов.
   * @return statuses
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

