package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class FeedIndexLogsOffersDTO {
    /* Количество предложений, который не опубликованы на Маркете из-за найденных ошибок. */
    Long rejectedCount
    /* Количество предложений в прайс-листе. */
    Long totalCount
}
