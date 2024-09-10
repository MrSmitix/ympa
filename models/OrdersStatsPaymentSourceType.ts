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
 * Способ денежного перевода:
 * - `BUYER` — оплата или возврат деньгами.
 * - `CASHBACK` — оплата или возврат баллами Плюса.
 * - `MARKETPLACE` — оплата или возврат купонами.
 * - `SPLIT` — оплата картой по частям (Сплит).
 * 
 * @export
 */
export const OrdersStatsPaymentSourceType = {
    Buyer: 'BUYER',
    Cashback: 'CASHBACK',
    Marketplace: 'MARKETPLACE',
    Split: 'SPLIT'
} as const;
export type OrdersStatsPaymentSourceType = typeof OrdersStatsPaymentSourceType[keyof typeof OrdersStatsPaymentSourceType];


export function instanceOfOrdersStatsPaymentSourceType(value: any): boolean {
    for (const key in OrdersStatsPaymentSourceType) {
        if (Object.prototype.hasOwnProperty.call(OrdersStatsPaymentSourceType, key)) {
            if (OrdersStatsPaymentSourceType[key as keyof typeof OrdersStatsPaymentSourceType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function OrdersStatsPaymentSourceTypeFromJSON(json: any): OrdersStatsPaymentSourceType {
    return OrdersStatsPaymentSourceTypeFromJSONTyped(json, false);
}

export function OrdersStatsPaymentSourceTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrdersStatsPaymentSourceType {
    return json as OrdersStatsPaymentSourceType;
}

export function OrdersStatsPaymentSourceTypeToJSON(value?: OrdersStatsPaymentSourceType | null): any {
    return value as any;
}

