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
 * Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей. 
 * @export
 * @enum {string}
 */
export enum ReportSubStatusType {
    NoData = 'NO_DATA',
    TooLarge = 'TOO_LARGE',
    ResourceNotFound = 'RESOURCE_NOT_FOUND'
}

export function ReportSubStatusTypeFromJSON(json: any): ReportSubStatusType {
    return json as ReportSubStatusType;
}

export function ReportSubStatusTypeToJSON(value?: ReportSubStatusType): any {
    return value as any;
}

