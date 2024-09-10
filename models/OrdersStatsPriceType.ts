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
 * Тип скидки или цена на товар:
 * - `BUYER` — цена на товар с учетом скидок, в том числе купонов.
 * - `CASHBACK` — баллы Плюса.
 * - `MARKETPLACE` — купоны.
 * 
 * @export
 */
export const OrdersStatsPriceType = {
    Buyer: 'BUYER',
    Cashback: 'CASHBACK',
    Marketplace: 'MARKETPLACE'
} as const;
export type OrdersStatsPriceType = typeof OrdersStatsPriceType[keyof typeof OrdersStatsPriceType];


export function instanceOfOrdersStatsPriceType(value: any): boolean {
    for (const key in OrdersStatsPriceType) {
        if (Object.prototype.hasOwnProperty.call(OrdersStatsPriceType, key)) {
            if (OrdersStatsPriceType[key as keyof typeof OrdersStatsPriceType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function OrdersStatsPriceTypeFromJSON(json: any): OrdersStatsPriceType {
    return OrdersStatsPriceTypeFromJSONTyped(json, false);
}

export function OrdersStatsPriceTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrdersStatsPriceType {
    return json as OrdersStatsPriceType;
}

export function OrdersStatsPriceTypeToJSON(value?: OrdersStatsPriceType | null): any {
    return value as any;
}

