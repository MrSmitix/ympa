package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ParameterValueDTO {
    /* Идентификатор характеристики. */
    Long parameterId
    /* Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию. */
    Long unitId
    /* Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`.  */
    Long valueId
    /* Значение. */
    String value
}
