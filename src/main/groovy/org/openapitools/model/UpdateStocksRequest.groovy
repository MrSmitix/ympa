package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.UpdateStockDTO;

@Canonical
class UpdateStocksRequest {
    /* Данные об остатках товаров.  */
    Set<UpdateStockDTO> skus = new LinkedHashSet<>()
}
