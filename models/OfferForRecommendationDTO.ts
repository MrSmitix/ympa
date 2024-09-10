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
import type { GetPriceDTO } from './GetPriceDTO';
import {
    GetPriceDTOFromJSON,
    GetPriceDTOFromJSONTyped,
    GetPriceDTOToJSON,
} from './GetPriceDTO';
import type { BasePriceDTO } from './BasePriceDTO';
import {
    BasePriceDTOFromJSON,
    BasePriceDTOFromJSONTyped,
    BasePriceDTOToJSON,
} from './BasePriceDTO';
import type { PriceCompetitivenessType } from './PriceCompetitivenessType';
import {
    PriceCompetitivenessTypeFromJSON,
    PriceCompetitivenessTypeFromJSONTyped,
    PriceCompetitivenessTypeToJSON,
} from './PriceCompetitivenessType';

/**
 * Информация о состоянии цены на товар.
 * @export
 * @interface OfferForRecommendationDTO
 */
export interface OfferForRecommendationDTO {
    /**
     * Ваш SKU — идентификатор товара в вашей системе.
     * 
     * Разрешена любая последовательность длиной до 255 знаков.
     * 
     * Правила использования SKU:
     * 
     * * У каждого товара SKU должен быть свой.
     * 
     * * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.
     * 
     * * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.
     * 
     * [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * 
     * @type {string}
     * @memberof OfferForRecommendationDTO
     */
    offerId?: string;
    /**
     * 
     * @type {BasePriceDTO}
     * @memberof OfferForRecommendationDTO
     */
    price?: BasePriceDTO;
    /**
     * 
     * @type {GetPriceDTO}
     * @memberof OfferForRecommendationDTO
     */
    cofinancePrice?: GetPriceDTO;
    /**
     * 
     * @type {PriceCompetitivenessType}
     * @memberof OfferForRecommendationDTO
     */
    competitiveness?: PriceCompetitivenessType;
    /**
     * Количество показов карточки товара за последние 7 дней.
     * @type {number}
     * @memberof OfferForRecommendationDTO
     */
    shows?: number;
}



/**
 * Check if a given object implements the OfferForRecommendationDTO interface.
 */
export function instanceOfOfferForRecommendationDTO(value: object): value is OfferForRecommendationDTO {
    return true;
}

export function OfferForRecommendationDTOFromJSON(json: any): OfferForRecommendationDTO {
    return OfferForRecommendationDTOFromJSONTyped(json, false);
}

export function OfferForRecommendationDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OfferForRecommendationDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'offerId': json['offerId'] == null ? undefined : json['offerId'],
        'price': json['price'] == null ? undefined : BasePriceDTOFromJSON(json['price']),
        'cofinancePrice': json['cofinancePrice'] == null ? undefined : GetPriceDTOFromJSON(json['cofinancePrice']),
        'competitiveness': json['competitiveness'] == null ? undefined : PriceCompetitivenessTypeFromJSON(json['competitiveness']),
        'shows': json['shows'] == null ? undefined : json['shows'],
    };
}

export function OfferForRecommendationDTOToJSON(value?: OfferForRecommendationDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offerId': value['offerId'],
        'price': BasePriceDTOToJSON(value['price']),
        'cofinancePrice': GetPriceDTOToJSON(value['cofinancePrice']),
        'competitiveness': PriceCompetitivenessTypeToJSON(value['competitiveness']),
        'shows': value['shows'],
    };
}

