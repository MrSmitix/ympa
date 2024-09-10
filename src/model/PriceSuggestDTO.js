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
import PriceSuggestType from './PriceSuggestType';

/**
 * The PriceSuggestDTO model module.
 * @module model/PriceSuggestDTO
 * @version LATEST
 */
class PriceSuggestDTO {
    /**
     * @member {module:model/PriceSuggestType} type
     * @type {module:model/PriceSuggestType}
     */
    type;
    /**
     * @member {Number} price
     * @type {Number}
     */
    price;

    

    /**
     * Constructs a new <code>PriceSuggestDTO</code>.
     * Тип цены.
     * @alias module:model/PriceSuggestDTO
     */
    constructor() { 
        
        PriceSuggestDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PriceSuggestDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PriceSuggestDTO} obj Optional instance to populate.
     * @return {module:model/PriceSuggestDTO} The populated <code>PriceSuggestDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PriceSuggestDTO();

            if (data.hasOwnProperty('type')) {
                obj['type'] = PriceSuggestType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
        }
        return obj;
    }
}



export default PriceSuggestDTO;

