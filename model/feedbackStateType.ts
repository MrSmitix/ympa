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
 * Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
 */
export type FeedbackStateType = 'LAST' | 'PREVIOUS' | 'DELETED';

export const FeedbackStateType = {
    Last: 'LAST' as FeedbackStateType,
    Previous: 'PREVIOUS' as FeedbackStateType,
    Deleted: 'DELETED' as FeedbackStateType
};

