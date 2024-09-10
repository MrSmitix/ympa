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
    OfferMappingDTO,
} from './';

/**
 * Информация о карточке товара.
 * @export
 * @interface OfferMappingInfoDTO
 */
export interface OfferMappingInfoDTO {
    /**
     * @type {OfferMappingDTO}
     * @memberof OfferMappingInfoDTO
     */
    mapping?: OfferMappingDTO;
    /**
     * @type {OfferMappingDTO}
     * @memberof OfferMappingInfoDTO
     */
    awaitingModerationMapping?: OfferMappingDTO;
    /**
     * @type {OfferMappingDTO}
     * @memberof OfferMappingInfoDTO
     */
    rejectedMapping?: OfferMappingDTO;
}
