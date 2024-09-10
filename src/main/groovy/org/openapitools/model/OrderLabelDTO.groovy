package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ParcelBoxLabelDTO;

@Canonical
class OrderLabelDTO {
    /* Идентификатор заказа. */
    Long orderId
    /* Количество коробок в заказе. */
    Integer placesNumber
    /* URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  */
    String url
    /* Информация на ярлыке. */
    List<ParcelBoxLabelDTO> parcelBoxLabels = new ArrayList<>()
}
