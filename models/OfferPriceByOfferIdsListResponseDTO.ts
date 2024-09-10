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
    OfferPriceByOfferIdsResponseDTO,
    ScrollingPagerDTO,
} from './';

/**
 * Список цен.
 * @export
 * @interface OfferPriceByOfferIdsListResponseDTO
 */
export interface OfferPriceByOfferIdsListResponseDTO {
    /**
     * Страница списка цен.
     * @type {Array<OfferPriceByOfferIdsResponseDTO>}
     * @memberof OfferPriceByOfferIdsListResponseDTO
     */
    offers: Array<OfferPriceByOfferIdsResponseDTO>;
    /**
     * @type {ScrollingPagerDTO}
     * @memberof OfferPriceByOfferIdsListResponseDTO
     */
    paging?: ScrollingPagerDTO;
}
