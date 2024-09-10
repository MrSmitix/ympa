package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;

@Canonical
class GenerateMassOrderLabelsRequest {
    /* Идентификатор кабинета. */
    Long businessId
    /* Список идентификаторов заказов. */
    Set<Long> orderIds = new LinkedHashSet<>()
}
