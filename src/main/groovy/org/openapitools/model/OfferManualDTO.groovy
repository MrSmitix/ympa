package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OfferManualDTO {
    /* Ссылка на инструкцию. */
    String url
    /* Название инструкции, которое будет отображаться на карточке товара.  */
    String title
}
