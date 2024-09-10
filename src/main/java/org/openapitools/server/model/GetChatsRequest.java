package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ChatStatusType;
import org.openapitools.server.model.ChatType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Фильтры по чатам, которые нужно вернуть. 
 */
public class GetChatsRequest   {

    private List<Long> orderIds;
    private List<ChatType> types;
    private List<ChatStatusType> statuses;

    /**
     * Default constructor.
     */
    public GetChatsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetChatsRequest.
     *
     * @param orderIds Фильтр по идентификаторам заказов на Маркете.
     * @param types Фильтр по типам чатов.
     * @param statuses Фильтр по статусам чатов.
     */
    public GetChatsRequest(
        List<Long> orderIds, 
        List<ChatType> types, 
        List<ChatStatusType> statuses
    ) {
        this.orderIds = orderIds;
        this.types = types;
        this.statuses = statuses;
    }



    /**
     * Фильтр по идентификаторам заказов на Маркете.
     * @return orderIds
     */
    public List<Long> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    /**
     * Фильтр по типам чатов.
     * @return types
     */
    public List<ChatType> getTypes() {
        return types;
    }

    public void setTypes(List<ChatType> types) {
        this.types = types;
    }

    /**
     * Фильтр по статусам чатов.
     * @return statuses
     */
    public List<ChatStatusType> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<ChatStatusType> statuses) {
        this.statuses = statuses;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

