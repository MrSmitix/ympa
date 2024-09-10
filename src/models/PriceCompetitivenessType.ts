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

/**
 * Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
 * @export
 * @enum {string}
 */
export enum PriceCompetitivenessType {
    Optimal = 'OPTIMAL',
    Average = 'AVERAGE',
    Low = 'LOW'
}

export function PriceCompetitivenessTypeFromJSON(json: any): PriceCompetitivenessType {
    return json as PriceCompetitivenessType;
}

export function PriceCompetitivenessTypeToJSON(value?: PriceCompetitivenessType): any {
    return value as any;
}

