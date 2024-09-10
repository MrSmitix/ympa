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
 * Информация о текущей карточке товара на Маркете.
 * @export
 * @interface OfferMappingDTO
 */
export interface OfferMappingDTO {
    /**
     * SKU на Маркете.
     * @type {number}
     * @memberof OfferMappingDTO
     */
    marketSku?: number;
    /**
     * Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
     * @type {number}
     * @memberof OfferMappingDTO
     */
    modelId?: number;
    /**
     * Идентификатор категории для текущей карточки товара на Маркете.
     * @type {number}
     * @memberof OfferMappingDTO
     */
    categoryId?: number;
}
