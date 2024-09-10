package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;

@Canonical
class GetChatsRequest {
    /* Фильтр по идентификаторам заказов на Маркете. */
    List<Long> orderIds
    /* Фильтр по типам чатов. */
    List<ChatType> types
    /* Фильтр по статусам чатов. */
    List<ChatStatusType> statuses
}
