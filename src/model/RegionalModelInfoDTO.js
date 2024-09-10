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
 * The RegionalModelInfoDTO model module.
 * @module model/RegionalModelInfoDTO
 * @version LATEST
 */
class RegionalModelInfoDTO {
    /**
     * Constructs a new <code>RegionalModelInfoDTO</code>.
     * Региональная информация.
     * @alias module:model/RegionalModelInfoDTO
     */
    constructor() { 
        
        RegionalModelInfoDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RegionalModelInfoDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RegionalModelInfoDTO} obj Optional instance to populate.
     * @return {module:model/RegionalModelInfoDTO} The populated <code>RegionalModelInfoDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RegionalModelInfoDTO();

            if (data.hasOwnProperty('currency')) {
                obj['currency'] = CurrencyType.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('regionId')) {
                obj['regionId'] = ApiClient.convertToType(data['regionId'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RegionalModelInfoDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RegionalModelInfoDTO</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * @member {module:model/CurrencyType} currency
 */
RegionalModelInfoDTO.prototype['currency'] = undefined;

/**
 * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 * @member {Number} regionId
 */
RegionalModelInfoDTO.prototype['regionId'] = undefined;






export default RegionalModelInfoDTO;

