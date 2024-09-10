package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedIndexLogsErrorType;

@Canonical
class FeedIndexLogsErrorDTO {
    /* HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  */
    Integer httpStatusCode
    
    FeedIndexLogsErrorType type
    /* Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`.  */
    String description
}
