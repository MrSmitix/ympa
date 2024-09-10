/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. 
 */
export type ChatStatusType = 'NEW' | 'WAITING_FOR_CUSTOMER' | 'WAITING_FOR_PARTNER' | 'WAITING_FOR_ARBITER' | 'WAITING_FOR_MARKET' | 'FINISHED';

export const ChatStatusType = {
    New: 'NEW' as ChatStatusType,
    WaitingForCustomer: 'WAITING_FOR_CUSTOMER' as ChatStatusType,
    WaitingForPartner: 'WAITING_FOR_PARTNER' as ChatStatusType,
    WaitingForArbiter: 'WAITING_FOR_ARBITER' as ChatStatusType,
    WaitingForMarket: 'WAITING_FOR_MARKET' as ChatStatusType,
    Finished: 'FINISHED' as ChatStatusType
};

