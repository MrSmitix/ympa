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
 * Имя параметра причины скрытия товара по цене.
 * 
 * * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин.
 * * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`).
 * * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`).
 * * `CURRENCY` — валюта.
 * 
 * @export
 */
export const PriceQuarantineVerdictParamNameType = {
    CurrentPrice: 'CURRENT_PRICE',
    LastValidPrice: 'LAST_VALID_PRICE',
    MinPrice: 'MIN_PRICE',
    Currency: 'CURRENCY'
} as const;
export type PriceQuarantineVerdictParamNameType = typeof PriceQuarantineVerdictParamNameType[keyof typeof PriceQuarantineVerdictParamNameType];


export function instanceOfPriceQuarantineVerdictParamNameType(value: any): boolean {
    for (const key in PriceQuarantineVerdictParamNameType) {
        if (Object.prototype.hasOwnProperty.call(PriceQuarantineVerdictParamNameType, key)) {
            if (PriceQuarantineVerdictParamNameType[key as keyof typeof PriceQuarantineVerdictParamNameType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function PriceQuarantineVerdictParamNameTypeFromJSON(json: any): PriceQuarantineVerdictParamNameType {
    return PriceQuarantineVerdictParamNameTypeFromJSONTyped(json, false);
}

export function PriceQuarantineVerdictParamNameTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): PriceQuarantineVerdictParamNameType {
    return json as PriceQuarantineVerdictParamNameType;
}

export function PriceQuarantineVerdictParamNameTypeToJSON(value?: PriceQuarantineVerdictParamNameType | null): any {
    return value as any;
}

