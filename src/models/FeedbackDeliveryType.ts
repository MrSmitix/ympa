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
 * Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине. 
 * @export
 * @enum {string}
 */
export enum FeedbackDeliveryType {
    Delivery = 'DELIVERY',
    Pickup = 'PICKUP',
    Instore = 'INSTORE'
}

export function FeedbackDeliveryTypeFromJSON(json: any): FeedbackDeliveryType {
    return json as FeedbackDeliveryType;
}

export function FeedbackDeliveryTypeToJSON(value?: FeedbackDeliveryType): any {
    return value as any;
}

