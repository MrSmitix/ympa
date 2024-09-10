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
 * В какой чат нужно отправить сообщение и текст сообщения.
 * @export
 * @interface SendMessageToChatRequest
 */
export interface SendMessageToChatRequest {
    /**
     * Текст сообщения. Максимальная длина — 4096 символа.
     * @type {string}
     * @memberof SendMessageToChatRequest
     */
    message: string;
}
