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
 * Изменился ли статус заказа:
 * 
 * * `OK` — статус изменен.
 * 
 * * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`.
 * 
 * @export
 */
export const OrderUpdateStatusType = {
    Ok: 'OK',
    Error: 'ERROR'
} as const;
export type OrderUpdateStatusType = typeof OrderUpdateStatusType[keyof typeof OrderUpdateStatusType];


export function instanceOfOrderUpdateStatusType(value: any): boolean {
    for (const key in OrderUpdateStatusType) {
        if (Object.prototype.hasOwnProperty.call(OrderUpdateStatusType, key)) {
            if (OrderUpdateStatusType[key as keyof typeof OrderUpdateStatusType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function OrderUpdateStatusTypeFromJSON(json: any): OrderUpdateStatusType {
    return OrderUpdateStatusTypeFromJSONTyped(json, false);
}

export function OrderUpdateStatusTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderUpdateStatusType {
    return json as OrderUpdateStatusType;
}

export function OrderUpdateStatusTypeToJSON(value?: OrderUpdateStatusType | null): any {
    return value as any;
}
