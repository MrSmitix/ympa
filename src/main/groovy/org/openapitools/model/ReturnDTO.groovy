package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LogisticPickupPointDTO;
import org.openapitools.model.RecipientType;
import org.openapitools.model.RefundStatusType;
import org.openapitools.model.ReturnItemDTO;
import org.openapitools.model.ReturnShipmentStatusType;
import org.openapitools.model.ReturnType;

@Canonical
class ReturnDTO {
    /* Идентификатор возврата. */
    Long id
    /* Номер заказа. */
    Long orderId
    /* Дата создания возврата клиентом. */
    Date creationDate
    /* Дата обновления возврата. */
    Date updateDate
    
    RefundStatusType refundStatus
    
    LogisticPickupPointDTO logisticPickupPoint
    
    RecipientType shipmentRecipientType
    
    ReturnShipmentStatusType shipmentStatus
    /* Сумма возврата. */
    Long refundAmount
    /* Список товаров в возврате. */
    List<ReturnItemDTO> items = new ArrayList<>()
    
    ReturnType returnType
    /* Используется ли опция **Быстрый возврат денег за дешевый брак**.  */
    Boolean fastReturn
}
