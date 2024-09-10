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
 * Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
 * @export
 * @enum {string}
 */
export enum AffectedOrderQualityRatingComponentType {
    DbsCancellationRate = 'DBS_CANCELLATION_RATE',
    DbsLateDeliveryRate = 'DBS_LATE_DELIVERY_RATE',
    FbsCancellationRate = 'FBS_CANCELLATION_RATE',
    FbsLateShipRate = 'FBS_LATE_SHIP_RATE'
}

export function AffectedOrderQualityRatingComponentTypeFromJSON(json: any): AffectedOrderQualityRatingComponentType {
    return json as AffectedOrderQualityRatingComponentType;
}

export function AffectedOrderQualityRatingComponentTypeToJSON(value?: AffectedOrderQualityRatingComponentType): any {
    return value as any;
}

