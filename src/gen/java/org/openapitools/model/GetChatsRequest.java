package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Фильтры по чатам, которые нужно вернуть. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatsRequest   {
  
  private List<Long> orderIds;
  private List<ChatType> types;
  private List<ChatStatusType> statuses;

  /**
   * Фильтр по идентификаторам заказов на Маркете.
   **/
  
  @ApiModelProperty(value = "Фильтр по идентификаторам заказов на Маркете.")
  @JsonProperty("orderIds")
 @Size(min=1)  public List<Long> getOrderIds() {
    return orderIds;
  }
  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  /**
   * Фильтр по типам чатов.
   **/
  
  @ApiModelProperty(value = "Фильтр по типам чатов.")
  @JsonProperty("types")
 @Size(min=1)  @Valid
  public List<ChatType> getTypes() {
    return types;
  }
  public void setTypes(List<ChatType> types) {
    this.types = types;
  }

  /**
   * Фильтр по статусам чатов.
   **/
  
  @ApiModelProperty(value = "Фильтр по статусам чатов.")
  @JsonProperty("statuses")
 @Size(min=1)  @Valid
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

