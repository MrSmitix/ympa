package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PickupAddressDTO {
    /* Страна. */
    String country
    /* Город. */
    String city
    /* Улица. */
    String street
    /* Номер дома. */
    String house
    /* Почтовый индекс. */
    String postcode
}
