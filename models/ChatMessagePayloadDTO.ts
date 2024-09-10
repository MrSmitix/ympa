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
 * Информация о приложенных к сообщению файлах.
 * @export
 * @interface ChatMessagePayloadDTO
 */
export interface ChatMessagePayloadDTO {
    /**
     * Имя файла.
     * @type {string}
     * @memberof ChatMessagePayloadDTO
     */
    name: string;
    /**
     * Ссылка для скачивания файла.
     * @type {string}
     * @memberof ChatMessagePayloadDTO
     */
    url: string;
    /**
     * Размер файла в байтах.
     * @type {number}
     * @memberof ChatMessagePayloadDTO
     */
    size: number;
}
