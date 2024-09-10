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

/**
 * The GenerateGoodsTurnoverRequest model module.
 * @module model/GenerateGoodsTurnoverRequest
 * @version LATEST
 */
class GenerateGoodsTurnoverRequest {
    /**
     * @member {Number} campaignId
     * @type {Number}
     */
    campaignId;
    /**
     * @member {Date} date
     * @type {Date}
     */
    date;

    

    /**
     * Constructs a new <code>GenerateGoodsTurnoverRequest</code>.
     * Данные, необходимые для генерации отчета. 
     * @alias module:model/GenerateGoodsTurnoverRequest
     * @param campaignId {Number} Идентификатор кампании.
     */
    constructor(campaignId) { 
        
        GenerateGoodsTurnoverRequest.initialize(this, campaignId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, campaignId) { 
        obj['campaignId'] = campaignId;
    }

    /**
     * Constructs a <code>GenerateGoodsTurnoverRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GenerateGoodsTurnoverRequest} obj Optional instance to populate.
     * @return {module:model/GenerateGoodsTurnoverRequest} The populated <code>GenerateGoodsTurnoverRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GenerateGoodsTurnoverRequest();

            if (data.hasOwnProperty('campaignId')) {
                obj['campaignId'] = ApiClient.convertToType(data['campaignId'], 'Number');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
        }
        return obj;
    }
}



export default GenerateGoodsTurnoverRequest;

