package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SendMessageToChatRequest {
    /* Текст сообщения. Максимальная длина — 4096 символа. */
    String message
}
