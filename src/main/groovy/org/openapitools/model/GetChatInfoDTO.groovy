package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;

@Canonical
class GetChatInfoDTO {
    /* Идентификатор чата. */
    Long chatId
    /* Идентификатор заказа. */
    Long orderId
    
    ChatType type
    
    ChatStatusType status
    /* Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    Date createdAt
    /* Дата и время последнего сообщения в чате. */
    Date updatedAt
}
