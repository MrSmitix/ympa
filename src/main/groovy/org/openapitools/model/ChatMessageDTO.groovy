package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatMessagePayloadDTO;
import org.openapitools.model.ChatMessageSenderType;

@Canonical
class ChatMessageDTO {
    /* Идентификатор сообщения. */
    Long messageId
    /* Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    Date createdAt
    
    ChatMessageSenderType sender
    /* Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.  */
    String message
    /* Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.  */
    List<ChatMessagePayloadDTO> payload
}
