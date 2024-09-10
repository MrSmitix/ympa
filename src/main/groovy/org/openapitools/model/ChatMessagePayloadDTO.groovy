package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ChatMessagePayloadDTO {
    /* Имя файла. */
    String name
    /* Ссылка для скачивания файла. */
    String url
    /* Размер файла в байтах. */
    Integer size
}
