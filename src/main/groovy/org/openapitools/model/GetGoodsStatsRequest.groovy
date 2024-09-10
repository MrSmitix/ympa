package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;

@Canonical
class GetGoodsStatsRequest {
    /* Список ваших идентификаторов SKU.  */
    Set<String> shopSkus = new LinkedHashSet<>()
}
