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
import BasePriceDTO from './BasePriceDTO';

/**
 * The PriceCompetitivenessThresholdsDTO model module.
 * @module model/PriceCompetitivenessThresholdsDTO
 * @version LATEST
 */
class PriceCompetitivenessThresholdsDTO {
    /**
     * Constructs a new <code>PriceCompetitivenessThresholdsDTO</code>.
     * Максимальные значения цены, при которых она является привлекательной или умеренной.
     * @alias module:model/PriceCompetitivenessThresholdsDTO
     */
    constructor() { 
        
        PriceCompetitivenessThresholdsDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PriceCompetitivenessThresholdsDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PriceCompetitivenessThresholdsDTO} obj Optional instance to populate.
     * @return {module:model/PriceCompetitivenessThresholdsDTO} The populated <code>PriceCompetitivenessThresholdsDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PriceCompetitivenessThresholdsDTO();

            if (data.hasOwnProperty('optimalPrice')) {
                obj['optimalPrice'] = BasePriceDTO.constructFromObject(data['optimalPrice']);
            }
            if (data.hasOwnProperty('averagePrice')) {
                obj['averagePrice'] = BasePriceDTO.constructFromObject(data['averagePrice']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PriceCompetitivenessThresholdsDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PriceCompetitivenessThresholdsDTO</code>.
     */
    static validateJSON(data) {
        // validate the optional field `optimalPrice`
        if (data['optimalPrice']) { // data not null
          BasePriceDTO.validateJSON(data['optimalPrice']);
        }
        // validate the optional field `averagePrice`
        if (data['averagePrice']) { // data not null
          BasePriceDTO.validateJSON(data['averagePrice']);
        }

        return true;
    }


}



/**
 * @member {module:model/BasePriceDTO} optimalPrice
 */
PriceCompetitivenessThresholdsDTO.prototype['optimalPrice'] = undefined;

/**
 * @member {module:model/BasePriceDTO} averagePrice
 */
PriceCompetitivenessThresholdsDTO.prototype['averagePrice'] = undefined;






export default PriceCompetitivenessThresholdsDTO;

