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
 * The BusinessSettingsDTO model module.
 * @module model/BusinessSettingsDTO
 * @version LATEST
 */
class BusinessSettingsDTO {
    /**
     * Constructs a new <code>BusinessSettingsDTO</code>.
     * Настройки кабинета.
     * @alias module:model/BusinessSettingsDTO
     */
    constructor() { 
        
        BusinessSettingsDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BusinessSettingsDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BusinessSettingsDTO} obj Optional instance to populate.
     * @return {module:model/BusinessSettingsDTO} The populated <code>BusinessSettingsDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BusinessSettingsDTO();

            if (data.hasOwnProperty('onlyDefaultPrice')) {
                obj['onlyDefaultPrice'] = ApiClient.convertToType(data['onlyDefaultPrice'], 'Boolean');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = CurrencyType.constructFromObject(data['currency']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BusinessSettingsDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BusinessSettingsDTO</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
 * @member {Boolean} onlyDefaultPrice
 */
BusinessSettingsDTO.prototype['onlyDefaultPrice'] = undefined;

/**
 * @member {module:model/CurrencyType} currency
 */
BusinessSettingsDTO.prototype['currency'] = undefined;






export default BusinessSettingsDTO;

