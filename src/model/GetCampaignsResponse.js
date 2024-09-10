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
import CampaignDTO from './CampaignDTO';
import FlippingPagerDTO from './FlippingPagerDTO';

/**
 * The GetCampaignsResponse model module.
 * @module model/GetCampaignsResponse
 * @version LATEST
 */
class GetCampaignsResponse {
    /**
     * Constructs a new <code>GetCampaignsResponse</code>.
     * Результаты поиска магазинов.
     * @alias module:model/GetCampaignsResponse
     * @param campaigns {Array.<module:model/CampaignDTO>} Список с информацией по каждому магазину.
     */
    constructor(campaigns) { 
        
        GetCampaignsResponse.initialize(this, campaigns);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, campaigns) { 
        obj['campaigns'] = campaigns;
    }

    /**
     * Constructs a <code>GetCampaignsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetCampaignsResponse} obj Optional instance to populate.
     * @return {module:model/GetCampaignsResponse} The populated <code>GetCampaignsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetCampaignsResponse();

            if (data.hasOwnProperty('campaigns')) {
                obj['campaigns'] = ApiClient.convertToType(data['campaigns'], [CampaignDTO]);
            }
            if (data.hasOwnProperty('pager')) {
                obj['pager'] = FlippingPagerDTO.constructFromObject(data['pager']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetCampaignsResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetCampaignsResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetCampaignsResponse.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['campaigns']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['campaigns'])) {
                throw new Error("Expected the field `campaigns` to be an array in the JSON data but got " + data['campaigns']);
            }
            // validate the optional field `campaigns` (array)
            for (const item of data['campaigns']) {
                CampaignDTO.validateJSON(item);
            };
        }
        // validate the optional field `pager`
        if (data['pager']) { // data not null
          FlippingPagerDTO.validateJSON(data['pager']);
        }

        return true;
    }


}

GetCampaignsResponse.RequiredProperties = ["campaigns"];

/**
 * Список с информацией по каждому магазину.
 * @member {Array.<module:model/CampaignDTO>} campaigns
 */
GetCampaignsResponse.prototype['campaigns'] = undefined;

/**
 * @member {module:model/FlippingPagerDTO} pager
 */
GetCampaignsResponse.prototype['pager'] = undefined;






export default GetCampaignsResponse;

