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
 * Текстовая часть отзыва.
 * @export
 * @interface GoodsFeedbackDescriptionDTO
 */
export interface GoodsFeedbackDescriptionDTO {
    /**
     * Описание плюсов товара в отзыве.
     * @type {string}
     * @memberof GoodsFeedbackDescriptionDTO
     */
    advantages?: string;
    /**
     * Описание минусов товара в отзыве.
     * @type {string}
     * @memberof GoodsFeedbackDescriptionDTO
     */
    disadvantages?: string;
    /**
     * Комментарий в отзыве.
     * @type {string}
     * @memberof GoodsFeedbackDescriptionDTO
     */
    comment?: string;
}
