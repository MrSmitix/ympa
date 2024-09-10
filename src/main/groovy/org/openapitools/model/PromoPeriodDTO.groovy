package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PromoPeriodDTO {
    /* Дата и время начала акции. */
    Date dateTimeFrom
    /* Дата и время окончания акции. */
    Date dateTimeTo
}
