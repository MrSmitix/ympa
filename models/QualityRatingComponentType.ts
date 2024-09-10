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
 * Составляющие индекса качества.
 * 
 * **Для модели DBS:**
 * * `DBS_CANCELLATION_RATE` — доля отмененных товаров.
 * * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.
 * 
 * **Для моделей FBS и Экспресс:**
 * * `FBS_CANCELLATION_RATE` — доля отмененных товаров.
 * * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.
 * 
 * **Для модели FBY:**
 * * `FBY_LATE_DELIVERY_RATE` — доля товаров, которые приехали на склад с опозданием.
 * * `FBY_CANCELLATION_RATE` — доля отмененных или недоставленных товаров.
 * * `FBY_DELIVERY_DIFF_RATE` — доля товаров, которые не прибыли вместе с поставкой или которые не приняли.
 * * `FBY_LATE_EDITING_RATE` — доля товаров, которые поздно убрали из заявки.
 * 
 * @export
 */
export const QualityRatingComponentType = {
    DbsCancellationRate: 'DBS_CANCELLATION_RATE',
    DbsLateDeliveryRate: 'DBS_LATE_DELIVERY_RATE',
    FbsCancellationRate: 'FBS_CANCELLATION_RATE',
    FbsLateShipRate: 'FBS_LATE_SHIP_RATE',
    FbyLateDeliveryRate: 'FBY_LATE_DELIVERY_RATE',
    FbyCancellationRate: 'FBY_CANCELLATION_RATE',
    FbyDeliveryDiffRate: 'FBY_DELIVERY_DIFF_RATE',
    FbyLateEditingRate: 'FBY_LATE_EDITING_RATE'
} as const;
export type QualityRatingComponentType = typeof QualityRatingComponentType[keyof typeof QualityRatingComponentType];


export function instanceOfQualityRatingComponentType(value: any): boolean {
    for (const key in QualityRatingComponentType) {
        if (Object.prototype.hasOwnProperty.call(QualityRatingComponentType, key)) {
            if (QualityRatingComponentType[key as keyof typeof QualityRatingComponentType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function QualityRatingComponentTypeFromJSON(json: any): QualityRatingComponentType {
    return QualityRatingComponentTypeFromJSONTyped(json, false);
}

export function QualityRatingComponentTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): QualityRatingComponentType {
    return json as QualityRatingComponentType;
}

export function QualityRatingComponentTypeToJSON(value?: QualityRatingComponentType | null): any {
    return value as any;
}

