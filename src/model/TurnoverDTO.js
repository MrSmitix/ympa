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
import TurnoverType from './TurnoverType';

/**
 * The TurnoverDTO model module.
 * @module model/TurnoverDTO
 * @version LATEST
 */
class TurnoverDTO {
    /**
     * Constructs a new <code>TurnoverDTO</code>.
     * Информация об оборачиваемости товара.
     * @alias module:model/TurnoverDTO
     * @param turnover {module:model/TurnoverType} 
     */
    constructor(turnover) { 
        
        TurnoverDTO.initialize(this, turnover);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, turnover) { 
        obj['turnover'] = turnover;
    }

    /**
     * Constructs a <code>TurnoverDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TurnoverDTO} obj Optional instance to populate.
     * @return {module:model/TurnoverDTO} The populated <code>TurnoverDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TurnoverDTO();

            if (data.hasOwnProperty('turnover')) {
                obj['turnover'] = TurnoverType.constructFromObject(data['turnover']);
            }
            if (data.hasOwnProperty('turnoverDays')) {
                obj['turnoverDays'] = ApiClient.convertToType(data['turnoverDays'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>TurnoverDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>TurnoverDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of TurnoverDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

TurnoverDTO.RequiredProperties = ["turnover"];

/**
 * @member {module:model/TurnoverType} turnover
 */
TurnoverDTO.prototype['turnover'] = undefined;

/**
 * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
 * @member {Number} turnoverDays
 */
TurnoverDTO.prototype['turnoverDays'] = undefined;






export default TurnoverDTO;

