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

import { mapValues } from '../runtime';
/**
 * Рекомендованная цена.
 * @export
 * @interface PriceRecommendationItemDTO
 */
export interface PriceRecommendationItemDTO {
    /**
     * Идентификатор кампании.
     * @type {number}
     * @memberof PriceRecommendationItemDTO
     */
    campaignId: number;
    /**
     * Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)
     * 
     * @type {number}
     * @memberof PriceRecommendationItemDTO
     */
    price: number;
}

/**
 * Check if a given object implements the PriceRecommendationItemDTO interface.
 */
export function instanceOfPriceRecommendationItemDTO(value: object): value is PriceRecommendationItemDTO {
    if (!('campaignId' in value) || value['campaignId'] === undefined) return false;
    if (!('price' in value) || value['price'] === undefined) return false;
    return true;
}

export function PriceRecommendationItemDTOFromJSON(json: any): PriceRecommendationItemDTO {
    return PriceRecommendationItemDTOFromJSONTyped(json, false);
}

export function PriceRecommendationItemDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): PriceRecommendationItemDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'campaignId': json['campaignId'],
        'price': json['price'],
    };
}

export function PriceRecommendationItemDTOToJSON(value?: PriceRecommendationItemDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'campaignId': value['campaignId'],
        'price': value['price'],
    };
}
