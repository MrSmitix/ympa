package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderCourierDTO;
import org.openapitools.model.OrderDeliveryAddressDTO;
import org.openapitools.model.OrderDeliveryDatesDTO;
import org.openapitools.model.OrderDeliveryDispatchType;
import org.openapitools.model.OrderDeliveryEacType;
import org.openapitools.model.OrderDeliveryPartnerType;
import org.openapitools.model.OrderDeliveryType;
import org.openapitools.model.OrderLiftType;
import org.openapitools.model.OrderShipmentDTO;
import org.openapitools.model.OrderTrackDTO;
import org.openapitools.model.OrderVatType;
import org.openapitools.model.RegionDTO;

@Canonical
class OrderDeliveryDTO {
    /* Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  */
    String id
    
    OrderDeliveryType type
    /* Наименование службы доставки. */
    String serviceName
    /* {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  */
    BigDecimal price
    
    OrderDeliveryPartnerType deliveryPartnerType
    
    OrderCourierDTO courier
    
    OrderDeliveryDatesDTO dates
    
    RegionDTO region
    
    OrderDeliveryAddressDTO address
    
    OrderVatType vat
    /* Идентификатор службы доставки. */
    Long deliveryServiceId
    
    OrderLiftType liftType
    /* Стоимость подъема на этаж. */
    BigDecimal liftPrice
    /* Идентификатор пункта самовывоза, присвоенный магазином. */
    String outletCode
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    String outletStorageLimitDate
    
    OrderDeliveryDispatchType dispatchType
    /* Информация для отслеживания перемещений посылки. */
    List<OrderTrackDTO> tracks
    /* Информация о посылках. */
    List<OrderShipmentDTO> shipments
    /* Приблизительная ли дата доставки. */
    Boolean estimated
    
    OrderDeliveryEacType eacType
    /* Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  */
    String eacCode
}
