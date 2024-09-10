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
 * Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип. 
 * @export
 * @enum {string}
 */
export enum OrderDeliveryPartnerType {
    Shop = 'SHOP',
    YandexMarket = 'YANDEX_MARKET',
    Unknown = 'UNKNOWN'
}

export function OrderDeliveryPartnerTypeFromJSON(json: any): OrderDeliveryPartnerType {
    return json as OrderDeliveryPartnerType;
}

export function OrderDeliveryPartnerTypeToJSON(value?: OrderDeliveryPartnerType): any {
    return value as any;
}

