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
 * Причина переноса доставки заказа. Возможные причины изменения даты:
 *   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.
 *   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок.
 * 
 * @export
 */
export const OrderDeliveryDateReasonType = {
    UserMovedDeliveryDates: 'USER_MOVED_DELIVERY_DATES',
    PartnerMovedDeliveryDates: 'PARTNER_MOVED_DELIVERY_DATES'
} as const;
export type OrderDeliveryDateReasonType = typeof OrderDeliveryDateReasonType[keyof typeof OrderDeliveryDateReasonType];


export function instanceOfOrderDeliveryDateReasonType(value: any): boolean {
    for (const key in OrderDeliveryDateReasonType) {
        if (Object.prototype.hasOwnProperty.call(OrderDeliveryDateReasonType, key)) {
            if (OrderDeliveryDateReasonType[key as keyof typeof OrderDeliveryDateReasonType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function OrderDeliveryDateReasonTypeFromJSON(json: any): OrderDeliveryDateReasonType {
    return OrderDeliveryDateReasonTypeFromJSONTyped(json, false);
}

export function OrderDeliveryDateReasonTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderDeliveryDateReasonType {
    return json as OrderDeliveryDateReasonType;
}

export function OrderDeliveryDateReasonTypeToJSON(value?: OrderDeliveryDateReasonType | null): any {
    return value as any;
}

