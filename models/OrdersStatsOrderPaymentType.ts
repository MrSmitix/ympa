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
 * Тип оплаты заказа:
 * - `CREDIT` — заказ оформлен в кредит.
 * - `POSTPAID` — заказ оплачен после того, как был получен.
 * - `PREPAID` — заказ оплачен до того, как был получен.
 * 
 * @export
 */
export const OrdersStatsOrderPaymentType = {
    Credit: 'CREDIT',
    Postpaid: 'POSTPAID',
    Prepaid: 'PREPAID',
    TinkoffCredit: 'TINKOFF_CREDIT'
} as const;
export type OrdersStatsOrderPaymentType = typeof OrdersStatsOrderPaymentType[keyof typeof OrdersStatsOrderPaymentType];


export function instanceOfOrdersStatsOrderPaymentType(value: any): boolean {
    for (const key in OrdersStatsOrderPaymentType) {
        if (Object.prototype.hasOwnProperty.call(OrdersStatsOrderPaymentType, key)) {
            if (OrdersStatsOrderPaymentType[key as keyof typeof OrdersStatsOrderPaymentType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function OrdersStatsOrderPaymentTypeFromJSON(json: any): OrdersStatsOrderPaymentType {
    return OrdersStatsOrderPaymentTypeFromJSONTyped(json, false);
}

export function OrdersStatsOrderPaymentTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrdersStatsOrderPaymentType {
    return json as OrdersStatsOrderPaymentType;
}

export function OrdersStatsOrderPaymentTypeToJSON(value?: OrdersStatsOrderPaymentType | null): any {
    return value as any;
}

