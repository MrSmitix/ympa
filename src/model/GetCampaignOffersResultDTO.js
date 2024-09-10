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
 *
 */

import ApiClient from '../ApiClient';
import GetCampaignOfferDTO from './GetCampaignOfferDTO';
import ScrollingPagerDTO from './ScrollingPagerDTO';

/**
 * The GetCampaignOffersResultDTO model module.
 * @module model/GetCampaignOffersResultDTO
 * @version LATEST
 */
class GetCampaignOffersResultDTO {
    /**
     * @member {module:model/ScrollingPagerDTO} paging
     * @type {module:model/ScrollingPagerDTO}
     */
    paging;
    /**
     * @member {Array.<module:model/GetCampaignOfferDTO>} offers
     * @type {Array.<module:model/GetCampaignOfferDTO>}
     */
    offers;

    

    /**
     * Constructs a new <code>GetCampaignOffersResultDTO</code>.
     * Список товаров в заданном магазине.
     * @alias module:model/GetCampaignOffersResultDTO
     * @param offers {Array.<module:model/GetCampaignOfferDTO>} Страница списка товаров.
     */
    constructor(offers) { 
        
        GetCampaignOffersResultDTO.initialize(this, offers);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, offers) { 
        obj['offers'] = offers;
    }

    /**
     * Constructs a <code>GetCampaignOffersResultDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetCampaignOffersResultDTO} obj Optional instance to populate.
     * @return {module:model/GetCampaignOffersResultDTO} The populated <code>GetCampaignOffersResultDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetCampaignOffersResultDTO();

            if (data.hasOwnProperty('paging')) {
                obj['paging'] = ScrollingPagerDTO.constructFromObject(data['paging']);
            }
            if (data.hasOwnProperty('offers')) {
                obj['offers'] = ApiClient.convertToType(data['offers'], [GetCampaignOfferDTO]);
            }
        }
        return obj;
    }
}



export default GetCampaignOffersResultDTO;

