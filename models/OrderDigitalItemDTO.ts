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
 * Ключ цифрового товара.
 * @export
 * @interface OrderDigitalItemDTO
 */
export interface OrderDigitalItemDTO {
    /**
     * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
     * @type {number}
     * @memberof OrderDigitalItemDTO
     */
    id: number;
    /**
     * Сам ключ.
     * @type {string}
     * @memberof OrderDigitalItemDTO
     */
    code: string;
    /**
     * Инструкция по активации.
     * @type {string}
     * @memberof OrderDigitalItemDTO
     */
    slip: string;
    /**
     * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
     * @type {string}
     * @memberof OrderDigitalItemDTO
     */
    activate_till: string;
}
