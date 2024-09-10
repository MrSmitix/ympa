package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WarehouseStockType;

@Canonical
class WarehouseStockDTO {
    
    WarehouseStockType type
    /* Значение остатков. */
    Long count
}
