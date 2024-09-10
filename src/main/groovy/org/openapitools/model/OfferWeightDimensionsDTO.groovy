package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class OfferWeightDimensionsDTO {
    /* Длина упаковки в см.  */
    BigDecimal length
    /* Ширина упаковки в см.  */
    BigDecimal width
    /* Высота упаковки в см.  */
    BigDecimal height
    /* Вес товара в кг с учетом упаковки (брутто).  */
    BigDecimal weight
}
