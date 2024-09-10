package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.DeliveryServiceDTO;
import org.openapitools.model.PalletsCountDTO;
import org.openapitools.model.PartnerShipmentWarehouseDTO;
import org.openapitools.model.ShipmentStatusType;
import org.openapitools.model.ShipmentType;

@Canonical
class ShipmentInfoDTO {
    /* Идентификатор отгрузки. */
    Long id
    /* Начало планового интервала отгрузки. */
    Date planIntervalFrom
    /* Конец планового интервала отгрузки. */
    Date planIntervalTo
    
    ShipmentType shipmentType
    
    PartnerShipmentWarehouseDTO warehouse
    
    PartnerShipmentWarehouseDTO warehouseTo
    /* Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. */
    String externalId
    
    DeliveryServiceDTO deliveryService
    
    PalletsCountDTO palletsCount
    /* Идентификаторы заказов в отгрузке. */
    Set<Long> orderIds = new LinkedHashSet<>()
    /* Количество заказов, которое Маркет запланировал к отгрузке. */
    Integer draftCount
    /* Количество заказов, которое Маркет подтвердил к отгрузке. */
    Integer plannedCount
    /* Количество заказов, принятых в сортировочном центре или пункте приема. */
    Integer factCount
    
    ShipmentStatusType status
    /* Описание статуса отгрузки. */
    String statusDescription
    /* Время последнего изменения статуса отгрузки. */
    Date statusUpdateTime
}
