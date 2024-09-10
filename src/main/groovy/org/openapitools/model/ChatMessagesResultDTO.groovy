package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ChatMessageDTO;
import org.openapitools.model.ForwardScrollingPagerDTO;

@Canonical
class ChatMessagesResultDTO {
    /* Идентификатор заказа. */
    Long orderId
    /* Информация о сообщениях. */
    List<ChatMessageDTO> messages = new ArrayList<>()
    
    ForwardScrollingPagerDTO paging
}
