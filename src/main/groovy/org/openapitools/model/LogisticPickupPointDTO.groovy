package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LogisticPointType;
import org.openapitools.model.PickupAddressDTO;

@Canonical
class LogisticPickupPointDTO {
    /* Идентификатор пункта вывоза. */
    Long id
    /* Название пункта вывоза. */
    String name
    
    PickupAddressDTO address
    /* Дополнительные инструкции к вывозу. */
    String instruction
    
    LogisticPointType type
    /* Идентификатор логистического партнера, к которому относится логистическая точка. */
    Long logisticPartnerId
}
