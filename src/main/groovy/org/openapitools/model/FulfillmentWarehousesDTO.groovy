package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FulfillmentWarehouseDTO;

@Canonical
class FulfillmentWarehousesDTO {
    /* Список складов Маркета (FBY). */
    List<FulfillmentWarehouseDTO> warehouses = new ArrayList<>()
}
