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
import FlippingPagerDTO from './FlippingPagerDTO';
import FullOutletDTO from './FullOutletDTO';
import ScrollingPagerDTO from './ScrollingPagerDTO';

/**
 * The GetOutletsResponse model module.
 * @module model/GetOutletsResponse
 * @version LATEST
 */
class GetOutletsResponse {
    /**
     * Constructs a new <code>GetOutletsResponse</code>.
     * Ответ на запрос информации о точках продаж.
     * @alias module:model/GetOutletsResponse
     * @param outlets {Array.<module:model/FullOutletDTO>} Информация о точках продаж.
     */
    constructor(outlets) { 
        
        GetOutletsResponse.initialize(this, outlets);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, outlets) { 
        obj['outlets'] = outlets;
    }

    /**
     * Constructs a <code>GetOutletsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetOutletsResponse} obj Optional instance to populate.
     * @return {module:model/GetOutletsResponse} The populated <code>GetOutletsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetOutletsResponse();

            if (data.hasOwnProperty('outlets')) {
                obj['outlets'] = ApiClient.convertToType(data['outlets'], [FullOutletDTO]);
            }
            if (data.hasOwnProperty('paging')) {
                obj['paging'] = ScrollingPagerDTO.constructFromObject(data['paging']);
            }
            if (data.hasOwnProperty('pager')) {
                obj['pager'] = FlippingPagerDTO.constructFromObject(data['pager']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetOutletsResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetOutletsResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetOutletsResponse.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['outlets']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['outlets'])) {
                throw new Error("Expected the field `outlets` to be an array in the JSON data but got " + data['outlets']);
            }
            // validate the optional field `outlets` (array)
            for (const item of data['outlets']) {
                FullOutletDTO.validateJSON(item);
            };
        }
        // validate the optional field `paging`
        if (data['paging']) { // data not null
          ScrollingPagerDTO.validateJSON(data['paging']);
        }
        // validate the optional field `pager`
        if (data['pager']) { // data not null
          FlippingPagerDTO.validateJSON(data['pager']);
        }

        return true;
    }


}

GetOutletsResponse.RequiredProperties = ["outlets"];

/**
 * Информация о точках продаж.
 * @member {Array.<module:model/FullOutletDTO>} outlets
 */
GetOutletsResponse.prototype['outlets'] = undefined;

/**
 * @member {module:model/ScrollingPagerDTO} paging
 */
GetOutletsResponse.prototype['paging'] = undefined;

/**
 * @member {module:model/FlippingPagerDTO} pager
 */
GetOutletsResponse.prototype['pager'] = undefined;






export default GetOutletsResponse;

