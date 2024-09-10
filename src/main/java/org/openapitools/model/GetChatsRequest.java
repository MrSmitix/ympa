/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Фильтры по чатам, которые нужно вернуть. 
 */
@JsonPropertyOrder({
  GetChatsRequest.JSON_PROPERTY_ORDER_IDS,
  GetChatsRequest.JSON_PROPERTY_TYPES,
  GetChatsRequest.JSON_PROPERTY_STATUSES
})
@JsonTypeName("GetChatsRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetChatsRequest {
    public static final String JSON_PROPERTY_ORDER_IDS = "orderIds";
    private List<Long> orderIds = null;

    public static final String JSON_PROPERTY_TYPES = "types";
    private List<ChatType> types = null;

    public static final String JSON_PROPERTY_STATUSES = "statuses";
    private List<ChatStatusType> statuses = null;

    public GetChatsRequest() {
    }

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
     */
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_ORDER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Long> getOrderIds() {
        return orderIds;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_TYPES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ChatType> getTypes() {
        return types;
    }

    @JsonProperty(JSON_PROPERTY_TYPES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_STATUSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ChatStatusType> getStatuses() {
        return statuses;
    }

    @JsonProperty(JSON_PROPERTY_STATUSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

