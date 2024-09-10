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
import BusinessDTO from './BusinessDTO';
import PlacementType from './PlacementType';

/**
 * The CampaignDTO model module.
 * @module model/CampaignDTO
 * @version LATEST
 */
class CampaignDTO {
    /**
     * @member {String} domain
     * @type {String}
     */
    domain;
    /**
     * @member {Number} id
     * @type {Number}
     */
    id;
    /**
     * @member {Number} clientId
     * @type {Number}
     */
    clientId;
    /**
     * @member {module:model/BusinessDTO} business
     * @type {module:model/BusinessDTO}
     */
    business;
    /**
     * @member {module:model/PlacementType} placementType
     * @type {module:model/PlacementType}
     */
    placementType;

    

    /**
     * Constructs a new <code>CampaignDTO</code>.
     * Информация о магазине.
     * @alias module:model/CampaignDTO
     */
    constructor() { 
        
        CampaignDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CampaignDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CampaignDTO} obj Optional instance to populate.
     * @return {module:model/CampaignDTO} The populated <code>CampaignDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CampaignDTO();

            if (data.hasOwnProperty('domain')) {
                obj['domain'] = ApiClient.convertToType(data['domain'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('clientId')) {
                obj['clientId'] = ApiClient.convertToType(data['clientId'], 'Number');
            }
            if (data.hasOwnProperty('business')) {
                obj['business'] = BusinessDTO.constructFromObject(data['business']);
            }
            if (data.hasOwnProperty('placementType')) {
                obj['placementType'] = PlacementType.constructFromObject(data['placementType']);
            }
        }
        return obj;
    }
}



export default CampaignDTO;

