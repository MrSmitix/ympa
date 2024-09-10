package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.DeliveryServiceInfoDTO;

@Canonical
class DeliveryServicesDTO {
    /* Информация о службе доставки. */
    List<DeliveryServiceInfoDTO> deliveryService = new ArrayList<>()
}
