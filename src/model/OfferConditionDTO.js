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
import OfferConditionQualityType from './OfferConditionQualityType';
import OfferConditionType from './OfferConditionType';

/**
 * The OfferConditionDTO model module.
 * @module model/OfferConditionDTO
 * @version LATEST
 */
class OfferConditionDTO {
    /**
     * @member {module:model/OfferConditionType} type
     * @type {module:model/OfferConditionType}
     */
    type;
    /**
     * @member {module:model/OfferConditionQualityType} quality
     * @type {module:model/OfferConditionQualityType}
     */
    quality;
    /**
     * @member {String} reason
     * @type {String}
     */
    reason;

    

    /**
     * Constructs a new <code>OfferConditionDTO</code>.
     * Состояние уцененного товара. 
     * @alias module:model/OfferConditionDTO
     */
    constructor() { 
        
        OfferConditionDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OfferConditionDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OfferConditionDTO} obj Optional instance to populate.
     * @return {module:model/OfferConditionDTO} The populated <code>OfferConditionDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OfferConditionDTO();

            if (data.hasOwnProperty('type')) {
                obj['type'] = OfferConditionType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = OfferConditionQualityType.constructFromObject(data['quality']);
            }
            if (data.hasOwnProperty('reason')) {
                obj['reason'] = ApiClient.convertToType(data['reason'], 'String');
            }
        }
        return obj;
    }
}



export default OfferConditionDTO;

