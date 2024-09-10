package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class ModelPriceDTO {
    /* Средняя цена предложения для модели в регионе. */
    BigDecimal avg
    /* Максимальная цена предложения для модели в регионе. */
    BigDecimal max
    /* Минимальная цена предложения для модели в регионе. */
    BigDecimal min
}
