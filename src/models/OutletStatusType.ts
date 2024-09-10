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
 * Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. 
 * @export
 * @enum {string}
 */
export enum OutletStatusType {
    AtModeration = 'AT_MODERATION',
    Failed = 'FAILED',
    Moderated = 'MODERATED',
    Nonmoderated = 'NONMODERATED',
    Unknown = 'UNKNOWN'
}

export function OutletStatusTypeFromJSON(json: any): OutletStatusType {
    return json as OutletStatusType;
}

export function OutletStatusTypeToJSON(value?: OutletStatusType): any {
    return value as any;
}

