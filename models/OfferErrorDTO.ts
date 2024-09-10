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
 * Сообщение об ошибке, связанной с размещением товара.
 * @export
 * @interface OfferErrorDTO
 */
export interface OfferErrorDTO {
    /**
     * Тип ошибки.
     * @type {string}
     * @memberof OfferErrorDTO
     */
    message?: string;
    /**
     * Пояснение.
     * @type {string}
     * @memberof OfferErrorDTO
     */
    comment?: string;
}
