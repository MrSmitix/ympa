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
    OfferPriceResponseDTO,
    ScrollingPagerDTO,
} from './';

/**
 * Список цен на товары.
 * @export
 * @interface OfferPriceListResponseDTO
 */
export interface OfferPriceListResponseDTO {
    /**
     * Страница списка.
     * @type {Array<OfferPriceResponseDTO>}
     * @memberof OfferPriceListResponseDTO
     */
    offers: Array<OfferPriceResponseDTO>;
    /**
     * @type {ScrollingPagerDTO}
     * @memberof OfferPriceListResponseDTO
     */
    paging?: ScrollingPagerDTO;
    /**
     * Количество всех цен магазина, измененных через API.
     * @type {number}
     * @memberof OfferPriceListResponseDTO
     */
    total?: number;
}
