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

import type {
    FieldStateType,
    PriceCompetitivenessType,
} from './';

/**
 * @export
 * @interface GetOfferRecommendationsRequest
 */
export interface GetOfferRecommendationsRequest {
    /**
     * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
     * @type {Array<string>}
     * @memberof GetOfferRecommendationsRequest
     */
    offerIds?: Array<string> | null;
    /**
     * @type {FieldStateType}
     * @memberof GetOfferRecommendationsRequest
     */
    cofinancePriceFilter?: FieldStateType;
    /**
     * @type {FieldStateType}
     * @memberof GetOfferRecommendationsRequest
     */
    recommendedCofinancePriceFilter?: FieldStateType;
    /**
     * @type {PriceCompetitivenessType}
     * @memberof GetOfferRecommendationsRequest
     */
    competitivenessFilter?: PriceCompetitivenessType;
}


