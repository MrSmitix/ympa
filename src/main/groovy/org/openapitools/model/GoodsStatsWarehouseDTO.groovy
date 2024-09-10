package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.WarehouseStockDTO;

@Canonical
class GoodsStatsWarehouseDTO {
    /* Идентификатор склада. */
    Long id
    /* Название склада. */
    String name
    /* Информация об остатках товаров на складе. */
    List<WarehouseStockDTO> stocks = new ArrayList<>()
}
