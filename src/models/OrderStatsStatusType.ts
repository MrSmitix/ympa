// tslint:disable
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

/**
 * Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. 
 * @export
 * @enum {string}
 */
export enum OrderStatsStatusType {
    CancelledBeforeProcessing = 'CANCELLED_BEFORE_PROCESSING',
    CancelledInDelivery = 'CANCELLED_IN_DELIVERY',
    CancelledInProcessing = 'CANCELLED_IN_PROCESSING',
    Delivery = 'DELIVERY',
    Delivered = 'DELIVERED',
    PartiallyDelivered = 'PARTIALLY_DELIVERED',
    PartiallyReturned = 'PARTIALLY_RETURNED',
    Pending = 'PENDING',
    Pickup = 'PICKUP',
    Processing = 'PROCESSING',
    Reserved = 'RESERVED',
    Returned = 'RETURNED',
    Unknown = 'UNKNOWN',
    Unpaid = 'UNPAID',
    Lost = 'LOST'
}

export function OrderStatsStatusTypeFromJSON(json: any): OrderStatsStatusType {
    return json as OrderStatsStatusType;
}

export function OrderStatsStatusTypeToJSON(value?: OrderStatsStatusType): any {
    return value as any;
}

