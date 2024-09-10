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
import { CampaignDTO } from './campaignDTO';
import { FlippingPagerDTO } from './flippingPagerDTO';


/**
 * Результаты поиска магазинов.
 */
export interface GetCampaignsResponse { 
    /**
     * Список с информацией по каждому магазину.
     */
    campaigns: Array<CampaignDTO>;
    pager?: FlippingPagerDTO;
}

