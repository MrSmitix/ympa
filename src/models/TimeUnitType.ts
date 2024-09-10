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
 * Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год. 
 * @export
 * @enum {string}
 */
export enum TimeUnitType {
    Hour = 'HOUR',
    Day = 'DAY',
    Week = 'WEEK',
    Month = 'MONTH',
    Year = 'YEAR'
}

export function TimeUnitTypeFromJSON(json: any): TimeUnitType {
    return json as TimeUnitType;
}

export function TimeUnitTypeToJSON(value?: TimeUnitType): any {
    return value as any;
}

