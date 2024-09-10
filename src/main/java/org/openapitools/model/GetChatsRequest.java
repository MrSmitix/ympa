package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Фильтры по чатам, которые нужно вернуть. 
 */

@Schema(name = "GetChatsRequest", description = "Фильтры по чатам, которые нужно вернуть. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatsRequest {

  @Valid
  private JsonNullable<List<Long>> orderIds = JsonNullable.<List<Long>>undefined();

  @Valid
  private JsonNullable<List<ChatType>> types = JsonNullable.<List<ChatType>>undefined();

  @Valid
  private JsonNullable<List<ChatStatusType>> statuses = JsonNullable.<List<ChatStatusType>>undefined();

  public GetChatsRequest orderIds(List<Long> orderIds) {
    this.orderIds = JsonNullable.of(orderIds);
    return this;
  }

  public GetChatsRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null || !this.orderIds.isPresent()) {
      this.orderIds = JsonNullable.of(new ArrayList<>());
    }
    this.orderIds.get().add(orderIdsItem);
    return this;
  }

  /**
   * Фильтр по идентификаторам заказов на Маркете.
   * @return orderIds
   */
  @Size(min = 1) 
  @Schema(name = "orderIds", description = "Фильтр по идентификаторам заказов на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderIds")
  public JsonNullable<List<Long>> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(JsonNullable<List<Long>> orderIds) {
    this.orderIds = orderIds;
  }

  public GetChatsRequest types(List<ChatType> types) {
    this.types = JsonNullable.of(types);
    return this;
  }

  public GetChatsRequest addTypesItem(ChatType typesItem) {
    if (this.types == null || !this.types.isPresent()) {
      this.types = JsonNullable.of(new ArrayList<>());
    }
    this.types.get().add(typesItem);
    return this;
  }

  /**
   * Фильтр по типам чатов.
   * @return types
   */
  @Valid @Size(min = 1) 
  @Schema(name = "types", description = "Фильтр по типам чатов.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("types")
  public JsonNullable<List<ChatType>> getTypes() {
    return types;
  }

  public void setTypes(JsonNullable<List<ChatType>> types) {
    this.types = types;
  }

  public GetChatsRequest statuses(List<ChatStatusType> statuses) {
    this.statuses = JsonNullable.of(statuses);
    return this;
  }

  public GetChatsRequest addStatusesItem(ChatStatusType statusesItem) {
    if (this.statuses == null || !this.statuses.isPresent()) {
      this.statuses = JsonNullable.of(new ArrayList<>());
    }
    this.statuses.get().add(statusesItem);
    return this;
  }

  /**
   * Фильтр по статусам чатов.
   * @return statuses
   */
  @Valid @Size(min = 1) 
  @Schema(name = "statuses", description = "Фильтр по статусам чатов.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public JsonNullable<List<ChatStatusType>> getStatuses() {
    return statuses;
  }

  public void setStatuses(JsonNullable<List<ChatStatusType>> statuses) {
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
    return equalsNullable(this.orderIds, getChatsRequest.orderIds) &&
        equalsNullable(this.types, getChatsRequest.types) &&
        equalsNullable(this.statuses, getChatsRequest.statuses);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(orderIds), hashCodeNullable(types), hashCodeNullable(statuses));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

