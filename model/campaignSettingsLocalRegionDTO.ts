/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { RegionType } from './regionType';
import { CampaignSettingsDeliveryDTO } from './campaignSettingsDeliveryDTO';
import { CampaignSettingsScheduleSourceType } from './campaignSettingsScheduleSourceType';


/**
 * Информация о своем регионе магазина.
 */
export interface CampaignSettingsLocalRegionDTO { 
    /**
     * Идентификатор региона.
     */
    id?: number;
    /**
     * Название региона.
     */
    name?: string;
    type?: RegionType;
    deliveryOptionsSource?: CampaignSettingsScheduleSourceType;
    delivery?: CampaignSettingsDeliveryDTO;
}
export namespace CampaignSettingsLocalRegionDTO {
}


