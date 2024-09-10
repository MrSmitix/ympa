package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderDocumentStatusType;

@Canonical
class DocumentDTO {
    
    OrderDocumentStatusType status
    /* Номер документа. */
    String number
    /* Дата создания документа. */
    Date date
}
