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

import {
    CurrencyType,
    CurrencyTypeFromJSON,
    CurrencyTypeToJSON,
} from './';

/**
 * @type UpdatePriceWithDiscountDTO
 * Цена с указанием скидки.
 * @export
 */
export interface UpdatePriceWithDiscountDTO extends BasePriceDTO {
}

export function UpdatePriceWithDiscountDTOFromJSON(json: any): UpdatePriceWithDiscountDTO {
    return {
        ...BasePriceDTOFromJSON(json),
    };
}

export function UpdatePriceWithDiscountDTOToJSON(value?: UpdatePriceWithDiscountDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...BasePriceDTOToJSON(value),
    };
}
