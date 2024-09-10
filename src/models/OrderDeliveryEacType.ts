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
 * Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
 * @export
 * @enum {string}
 */
export enum OrderDeliveryEacType {
    MerchantToCourier = 'MERCHANT_TO_COURIER',
    CourierToMerchant = 'COURIER_TO_MERCHANT',
    CheckingByMerchant = 'CHECKING_BY_MERCHANT'
}

export function OrderDeliveryEacTypeFromJSON(json: any): OrderDeliveryEacType {
    return json as OrderDeliveryEacType;
}

export function OrderDeliveryEacTypeToJSON(value?: OrderDeliveryEacType): any {
    return value as any;
}

