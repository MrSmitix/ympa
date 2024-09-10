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
import type { UpdatePromoOfferDiscountParamsDTO } from './UpdatePromoOfferDiscountParamsDTO';
import {
    UpdatePromoOfferDiscountParamsDTOFromJSON,
    UpdatePromoOfferDiscountParamsDTOFromJSONTyped,
    UpdatePromoOfferDiscountParamsDTOToJSON,
} from './UpdatePromoOfferDiscountParamsDTO';

/**
 * Параметры товара, который участвует в акции.
 * @export
 * @interface UpdatePromoOfferParamsDTO
 */
export interface UpdatePromoOfferParamsDTO {
    /**
     * 
     * @type {UpdatePromoOfferDiscountParamsDTO}
     * @memberof UpdatePromoOfferParamsDTO
     */
    discountParams?: UpdatePromoOfferDiscountParamsDTO;
}

/**
 * Check if a given object implements the UpdatePromoOfferParamsDTO interface.
 */
export function instanceOfUpdatePromoOfferParamsDTO(value: object): value is UpdatePromoOfferParamsDTO {
    return true;
}

export function UpdatePromoOfferParamsDTOFromJSON(json: any): UpdatePromoOfferParamsDTO {
    return UpdatePromoOfferParamsDTOFromJSONTyped(json, false);
}

export function UpdatePromoOfferParamsDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdatePromoOfferParamsDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'discountParams': json['discountParams'] == null ? undefined : UpdatePromoOfferDiscountParamsDTOFromJSON(json['discountParams']),
    };
}

export function UpdatePromoOfferParamsDTOToJSON(value?: UpdatePromoOfferParamsDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'discountParams': UpdatePromoOfferDiscountParamsDTOToJSON(value['discountParams']),
    };
}

