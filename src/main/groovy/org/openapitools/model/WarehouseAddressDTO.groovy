package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GpsDTO;

@Canonical
class WarehouseAddressDTO {
    /* Город. */
    String city
    /* Улица. */
    String street
    /* Номер дома. */
    String number
    /* Номер строения. */
    String building
    /* Номер корпуса. */
    String block
    
    GpsDTO gps
}
