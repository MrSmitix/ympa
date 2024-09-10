package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BriefOrderItemDTO;

@Canonical
class OrderItemsModificationResultDTO {
    /* Список позиций в заказе, подлежащих маркировке. */
    List<BriefOrderItemDTO> items = new ArrayList<>()
}
