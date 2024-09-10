package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GetChatHistoryRequest {
    /* Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения. */
    Long messageIdFrom
}
