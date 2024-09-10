package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OrderBoxLayoutItemDTO;

@Canonical
class EnrichedOrderBoxLayoutDTO {
    /* Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  */
    List<OrderBoxLayoutItemDTO> items = new ArrayList<>()
    /* Идентификатор коробки. */
    Long boxId
}
