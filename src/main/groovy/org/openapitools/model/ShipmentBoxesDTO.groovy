package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ParcelBoxDTO;

@Canonical
class ShipmentBoxesDTO {
    /* Список грузовых мест. Маркет определил количество мест по длине этого списка.  */
    List<ParcelBoxDTO> boxes = new ArrayList<>()
}
