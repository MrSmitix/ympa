package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GoodsStatsGoodsDTO;

@Canonical
class GoodsStatsDTO {
    /* Список товаров. */
    List<GoodsStatsGoodsDTO> shopSkus = new ArrayList<>()
}
