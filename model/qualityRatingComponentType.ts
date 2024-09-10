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
 * Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.  **Для модели FBY:** * `FBY_LATE_DELIVERY_RATE` — доля товаров, которые приехали на склад с опозданием. * `FBY_CANCELLATION_RATE` — доля отмененных или недоставленных товаров. * `FBY_DELIVERY_DIFF_RATE` — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * `FBY_LATE_EDITING_RATE` — доля товаров, которые поздно убрали из заявки. 
 */
export type QualityRatingComponentType = 'DBS_CANCELLATION_RATE' | 'DBS_LATE_DELIVERY_RATE' | 'FBS_CANCELLATION_RATE' | 'FBS_LATE_SHIP_RATE' | 'FBY_LATE_DELIVERY_RATE' | 'FBY_CANCELLATION_RATE' | 'FBY_DELIVERY_DIFF_RATE' | 'FBY_LATE_EDITING_RATE';

export const QualityRatingComponentType = {
    DbsCancellationRate: 'DBS_CANCELLATION_RATE' as QualityRatingComponentType,
    DbsLateDeliveryRate: 'DBS_LATE_DELIVERY_RATE' as QualityRatingComponentType,
    FbsCancellationRate: 'FBS_CANCELLATION_RATE' as QualityRatingComponentType,
    FbsLateShipRate: 'FBS_LATE_SHIP_RATE' as QualityRatingComponentType,
    FbyLateDeliveryRate: 'FBY_LATE_DELIVERY_RATE' as QualityRatingComponentType,
    FbyCancellationRate: 'FBY_CANCELLATION_RATE' as QualityRatingComponentType,
    FbyDeliveryDiffRate: 'FBY_DELIVERY_DIFF_RATE' as QualityRatingComponentType,
    FbyLateEditingRate: 'FBY_LATE_EDITING_RATE' as QualityRatingComponentType
};

