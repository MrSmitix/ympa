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
 * Привлекательность цены:
 * 
 * * `OPTIMAL` — привлекательная.
 * * `AVERAGE` — умеренная.
 * * `LOW` — непривлекательная.
 * 
 * @export
 */
export const PriceCompetitivenessType = {
    Optimal: 'OPTIMAL',
    Average: 'AVERAGE',
    Low: 'LOW'
} as const;
export type PriceCompetitivenessType = typeof PriceCompetitivenessType[keyof typeof PriceCompetitivenessType];


export function instanceOfPriceCompetitivenessType(value: any): boolean {
    for (const key in PriceCompetitivenessType) {
        if (Object.prototype.hasOwnProperty.call(PriceCompetitivenessType, key)) {
            if (PriceCompetitivenessType[key as keyof typeof PriceCompetitivenessType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function PriceCompetitivenessTypeFromJSON(json: any): PriceCompetitivenessType {
    return PriceCompetitivenessTypeFromJSONTyped(json, false);
}

export function PriceCompetitivenessTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): PriceCompetitivenessType {
    return json as PriceCompetitivenessType;
}

export function PriceCompetitivenessTypeToJSON(value?: PriceCompetitivenessType | null): any {
    return value as any;
}
