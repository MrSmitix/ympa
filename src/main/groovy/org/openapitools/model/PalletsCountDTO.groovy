package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PalletsCountDTO {
    /* Количество палет, которое заявил продавец. */
    Integer planned
    /* Количество палет, которое приняли в сортировочном центре. */
    Integer fact
}
