/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { OrderDeliveryDispatchType } from './orderDeliveryDispatchType';
import { OrderDeliveryEacType } from './orderDeliveryEacType';
import { OrderTrackDTO } from './orderTrackDTO';
import { OrderLiftType } from './orderLiftType';
import { OrderShipmentDTO } from './orderShipmentDTO';
import { OrderCourierDTO } from './orderCourierDTO';
import { RegionDTO } from './regionDTO';
import { OrderDeliveryPartnerType } from './orderDeliveryPartnerType';
import { OrderDeliveryType } from './orderDeliveryType';
import { OrderDeliveryDatesDTO } from './orderDeliveryDatesDTO';
import { OrderVatType } from './orderVatType';
import { OrderDeliveryAddressDTO } from './orderDeliveryAddressDTO';


/**
 * Информация о доставке.
 */
export interface OrderDeliveryDTO { 
    /**
     * Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
     */
    id?: string;
    type?: OrderDeliveryType;
    /**
     * Наименование службы доставки.
     */
    serviceName?: string;
    /**
     * {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
     */
    price?: number;
    deliveryPartnerType?: OrderDeliveryPartnerType;
    courier?: OrderCourierDTO;
    dates?: OrderDeliveryDatesDTO;
    region?: RegionDTO;
    address?: OrderDeliveryAddressDTO;
    vat?: OrderVatType;
    /**
     * Идентификатор службы доставки.
     */
    deliveryServiceId?: number;
    liftType?: OrderLiftType;
    /**
     * Стоимость подъема на этаж.
     */
    liftPrice?: number;
    /**
     * Идентификатор пункта самовывоза, присвоенный магазином.
     */
    outletCode?: string;
    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     */
    outletStorageLimitDate?: string;
    dispatchType?: OrderDeliveryDispatchType;
    /**
     * Информация для отслеживания перемещений посылки.
     */
    tracks?: Array<OrderTrackDTO> | null;
    /**
     * Информация о посылках.
     */
    shipments?: Array<OrderShipmentDTO> | null;
    /**
     * Приблизительная ли дата доставки.
     */
    estimated?: boolean;
    eacType?: OrderDeliveryEacType;
    /**
     * Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
     */
    eacCode?: string;
}
export namespace OrderDeliveryDTO {
}

