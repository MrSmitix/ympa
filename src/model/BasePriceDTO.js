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
import CurrencyType from './CurrencyType';

/**
 * The BasePriceDTO model module.
 * @module model/BasePriceDTO
 * @version LATEST
 */
class BasePriceDTO {
    /**
     * Constructs a new <code>BasePriceDTO</code>.
     * Цена на товар.
     * @alias module:model/BasePriceDTO
     * @param value {Number} Значение.
     * @param currencyId {module:model/CurrencyType} 
     */
    constructor(value, currencyId) { 
        
        BasePriceDTO.initialize(this, value, currencyId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, value, currencyId) { 
        obj['value'] = value;
        obj['currencyId'] = currencyId;
    }

    /**
     * Constructs a <code>BasePriceDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BasePriceDTO} obj Optional instance to populate.
     * @return {module:model/BasePriceDTO} The populated <code>BasePriceDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasePriceDTO();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('currencyId')) {
                obj['currencyId'] = CurrencyType.constructFromObject(data['currencyId']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BasePriceDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BasePriceDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of BasePriceDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

BasePriceDTO.RequiredProperties = ["value", "currencyId"];

/**
 * Значение.
 * @member {Number} value
 */
BasePriceDTO.prototype['value'] = undefined;

/**
 * @member {module:model/CurrencyType} currencyId
 */
BasePriceDTO.prototype['currencyId'] = undefined;






export default BasePriceDTO;

