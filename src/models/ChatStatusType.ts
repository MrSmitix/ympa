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
 * Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. 
 * @export
 * @enum {string}
 */
export enum ChatStatusType {
    New = 'NEW',
    WaitingForCustomer = 'WAITING_FOR_CUSTOMER',
    WaitingForPartner = 'WAITING_FOR_PARTNER',
    WaitingForArbiter = 'WAITING_FOR_ARBITER',
    WaitingForMarket = 'WAITING_FOR_MARKET',
    Finished = 'FINISHED'
}

export function ChatStatusTypeFromJSON(json: any): ChatStatusType {
    return json as ChatStatusType;
}

export function ChatStatusTypeToJSON(value?: ChatStatusType): any {
    return value as any;
}

