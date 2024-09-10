/* tslint:disable */
/* eslint-disable */
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
 * Статус заказа:
 * 
 * * `CANCELLED` — отменен.
 * 
 * * `DELIVERED` — получен покупателем.
 * 
 * * `DELIVERY` — передан в службу доставки.
 * 
 * * `PICKUP` — доставлен в пункт самовывоза.
 * 
 * * `PROCESSING` — находится в обработке.
 * 
 * * `PENDING` — ожидает обработки со стороны продавца.
 * 
 * * `UNPAID` — оформлен, но еще не оплачен (если выбрана оплата при оформлении).
 * 
 * * `PLACING` — оформляется, подготовка к резервированию.
 * 
 * * `RESERVED` — зарезервирован, но недооформлен.
 * 
 * * `PARTIALLY_RETURNED` — возвращен частично.
 * 
 * * `RETURNED` — возвращен полностью.
 * 
 * * `UNKNOWN` — неизвестный статус.
 * 
 * Также могут возвращаться другие значения. Обрабатывать их не требуется.
 * 
 * @export
 */
export const OrderStatusType = {
    Placing: 'PLACING',
    Reserved: 'RESERVED',
    Unpaid: 'UNPAID',
    Processing: 'PROCESSING',
    Delivery: 'DELIVERY',
    Pickup: 'PICKUP',
    Delivered: 'DELIVERED',
    Cancelled: 'CANCELLED',
    Pending: 'PENDING',
    PartiallyReturned: 'PARTIALLY_RETURNED',
    Returned: 'RETURNED',
    Unknown: 'UNKNOWN'
} as const;
export type OrderStatusType = typeof OrderStatusType[keyof typeof OrderStatusType];


export function instanceOfOrderStatusType(value: any): boolean {
    for (const key in OrderStatusType) {
        if (Object.prototype.hasOwnProperty.call(OrderStatusType, key)) {
            if (OrderStatusType[key as keyof typeof OrderStatusType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function OrderStatusTypeFromJSON(json: any): OrderStatusType {
    return OrderStatusTypeFromJSONTyped(json, false);
}

export function OrderStatusTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderStatusType {
    return json as OrderStatusType;
}

export function OrderStatusTypeToJSON(value?: OrderStatusType | null): any {
    return value as any;
}
