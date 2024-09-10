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
 * Причина обновления состава заказа.
 */
export type OrderItemsModificationRequestReasonType = 'PARTNER_REQUESTED_REMOVE' | 'USER_REQUESTED_REMOVE';

export const OrderItemsModificationRequestReasonType = {
    PartnerRequestedRemove: 'PARTNER_REQUESTED_REMOVE' as OrderItemsModificationRequestReasonType,
    UserRequestedRemove: 'USER_REQUESTED_REMOVE' as OrderItemsModificationRequestReasonType
};
