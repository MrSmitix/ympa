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
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 * @export
 * @interface PromoOfferDiscountParamsDTO
 */
export interface PromoOfferDiscountParamsDTO {
    /**
     * Зачеркнутая цена — та, по которой товар продавался до акции.
     * 
     * Указывается в рублях.
     * 
     * Возвращается, только если товар участвует в акции.
     * 
     * @type {number}
     * @memberof PromoOfferDiscountParamsDTO
     */
    price?: number;
    /**
     * Цена по акции — та, по которой вы хотите продавать товар.
     * 
     * Указывается в рублях.
     * 
     * Возвращается, только если товар участвует в акции.
     * 
     * @type {number}
     * @memberof PromoOfferDiscountParamsDTO
     */
    promoPrice?: number;
    /**
     * Максимально возможная цена для участия в акции.
     * 
     * Указывается в рублях.
     * 
     * Возвращается для всех товаров.
     * 
     * @type {number}
     * @memberof PromoOfferDiscountParamsDTO
     */
    maxPromoPrice: number;
}

/**
 * Check if a given object implements the PromoOfferDiscountParamsDTO interface.
 */
export function instanceOfPromoOfferDiscountParamsDTO(value: object): value is PromoOfferDiscountParamsDTO {
    if (!('maxPromoPrice' in value) || value['maxPromoPrice'] === undefined) return false;
    return true;
}

export function PromoOfferDiscountParamsDTOFromJSON(json: any): PromoOfferDiscountParamsDTO {
    return PromoOfferDiscountParamsDTOFromJSONTyped(json, false);
}

export function PromoOfferDiscountParamsDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): PromoOfferDiscountParamsDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'price': json['price'] == null ? undefined : json['price'],
        'promoPrice': json['promoPrice'] == null ? undefined : json['promoPrice'],
        'maxPromoPrice': json['maxPromoPrice'],
    };
}

export function PromoOfferDiscountParamsDTOToJSON(value?: PromoOfferDiscountParamsDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'price': value['price'],
        'promoPrice': value['promoPrice'],
        'maxPromoPrice': value['maxPromoPrice'],
    };
}
