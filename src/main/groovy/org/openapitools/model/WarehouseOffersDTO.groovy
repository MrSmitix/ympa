package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.WarehouseOfferDTO;

@Canonical
class WarehouseOffersDTO {
    /* Идентификатор склада. */
    Long warehouseId
    /* Информация об остатках. */
    List<WarehouseOfferDTO> offers = new ArrayList<>()
}
