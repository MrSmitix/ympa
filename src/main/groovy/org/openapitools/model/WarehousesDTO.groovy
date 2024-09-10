package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.WarehouseDTO;
import org.openapitools.model.WarehouseGroupDTO;

@Canonical
class WarehousesDTO {
    /* Список складов, не входящих в группы. */
    List<WarehouseDTO> warehouses = new ArrayList<>()
    /* Список групп складов. */
    List<WarehouseGroupDTO> warehouseGroups = new ArrayList<>()
}
