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
    GetCampaignOfferDTO,
    ScrollingPagerDTO,
} from './';

/**
 * Список товаров в заданном магазине.
 * @export
 * @interface GetCampaignOffersResultDTO
 */
export interface GetCampaignOffersResultDTO {
    /**
     * @type {ScrollingPagerDTO}
     * @memberof GetCampaignOffersResultDTO
     */
    paging?: ScrollingPagerDTO;
    /**
     * Страница списка товаров.
     * @type {Array<GetCampaignOfferDTO>}
     * @memberof GetCampaignOffersResultDTO
     */
    offers: Array<GetCampaignOfferDTO>;
}
