package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GenerateGoodsTurnoverRequest {
    /* Идентификатор кампании. */
    Long campaignId
    /* Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата. */
    Date date
}
