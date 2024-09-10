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

import type {
    OfferMappingErrorType,
} from './';

/**
 * Текст ошибки.
 * @export
 * @interface OfferMappingErrorDTO
 */
export interface OfferMappingErrorDTO {
    /**
     * @type {OfferMappingErrorType}
     * @memberof OfferMappingErrorDTO
     */
    type: OfferMappingErrorType;
    /**
     * Идентификатор характеристики, с которой связана ошибка.
     * @type {number}
     * @memberof OfferMappingErrorDTO
     */
    parameterId?: number;
    /**
     * Текст ошибки.
     * @type {string}
     * @memberof OfferMappingErrorDTO
     */
    message: string;
}


