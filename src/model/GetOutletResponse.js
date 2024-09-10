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
import FullOutletDTO from './FullOutletDTO';

/**
 * The GetOutletResponse model module.
 * @module model/GetOutletResponse
 * @version LATEST
 */
class GetOutletResponse {
    /**
     * Constructs a new <code>GetOutletResponse</code>.
     * Ответ на запрос информации о точке продаж.
     * @alias module:model/GetOutletResponse
     */
    constructor() { 
        
        GetOutletResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetOutletResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetOutletResponse} obj Optional instance to populate.
     * @return {module:model/GetOutletResponse} The populated <code>GetOutletResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetOutletResponse();

            if (data.hasOwnProperty('outlet')) {
                obj['outlet'] = FullOutletDTO.constructFromObject(data['outlet']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetOutletResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetOutletResponse</code>.
     */
    static validateJSON(data) {
        // validate the optional field `outlet`
        if (data['outlet']) { // data not null
          FullOutletDTO.validateJSON(data['outlet']);
        }

        return true;
    }


}



/**
 * @member {module:model/FullOutletDTO} outlet
 */
GetOutletResponse.prototype['outlet'] = undefined;






export default GetOutletResponse;

