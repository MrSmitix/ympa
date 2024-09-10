/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatsRequest   {
  
  private List<Long> orderIds;
  private List<ChatType> types;
  private List<ChatStatusType> statuses;

  /**
   * Фильтр по идентификаторам заказов на Маркете.
   */
  public GetChatsRequest orderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по идентификаторам заказов на Маркете.")
  @JsonProperty("orderIds")
  public List<Long> getOrderIds() {
    return orderIds;
  }
  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }

  /**
   * Фильтр по типам чатов.
   */
  public GetChatsRequest types(List<ChatType> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по типам чатов.")
  @JsonProperty("types")
  public List<ChatType> getTypes() {
    return types;
  }
  public void setTypes(List<ChatType> types) {
    this.types = types;
  }

  /**
   * Фильтр по статусам чатов.
   */
  public GetChatsRequest statuses(List<ChatStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по статусам чатов.")
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

