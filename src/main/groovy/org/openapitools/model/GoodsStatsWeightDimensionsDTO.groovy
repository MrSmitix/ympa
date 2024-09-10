package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class GoodsStatsWeightDimensionsDTO {
    /* Длина товара в сантиметрах. */
    BigDecimal length
    /* Ширина товара в сантиметрах. */
    BigDecimal width
    /* Высота товара в сантиметрах. */
    BigDecimal height
    /* Вес товара в килограммах. */
    BigDecimal weight
}
