package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.WarehouseDTO;

@Canonical
class WarehouseGroupDTO {
    /* Название группы складов. */
    String name
    
    WarehouseDTO mainWarehouse
    /* Список складов, входящих в группу. */
    List<WarehouseDTO> warehouses = new ArrayList<>()
}
