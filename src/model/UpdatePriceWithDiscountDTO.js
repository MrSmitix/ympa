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
import CurrencyType from './CurrencyType';

/**
 * The UpdatePriceWithDiscountDTO model module.
 * @module model/UpdatePriceWithDiscountDTO
 * @version LATEST
 */
class UpdatePriceWithDiscountDTO {
    /**
     * @member {Number} value
     * @type {Number}
     */
    value;
    /**
     * @member {module:model/CurrencyType} currencyId
     * @type {module:model/CurrencyType}
     */
    currencyId;
    /**
     * @member {Number} discountBase
     * @type {Number}
     */
    discountBase;

    /**
     * @member {Number} value
     * @type {Number}
     */
    #value;
    /**
     * @member {module:model/CurrencyType} currencyId
     * @type {module:model/CurrencyType}
     */
    #currencyId;
    

    /**
     * Constructs a new <code>UpdatePriceWithDiscountDTO</code>.
     * Цена с указанием скидки.
     * @alias module:model/UpdatePriceWithDiscountDTO
     * @implements module:model/BasePriceDTO
     * @param value {Number} Значение.
     * @param currencyId {module:model/CurrencyType} 
     */
    constructor(value, currencyId) { 
        BasePriceDTO.initialize(this, value, currencyId);
        UpdatePriceWithDiscountDTO.initialize(this, value, currencyId);
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
     * Constructs a <code>UpdatePriceWithDiscountDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdatePriceWithDiscountDTO} obj Optional instance to populate.
     * @return {module:model/UpdatePriceWithDiscountDTO} The populated <code>UpdatePriceWithDiscountDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdatePriceWithDiscountDTO();
            BasePriceDTO.constructFromObject(data, obj);

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('currencyId')) {
                obj['currencyId'] = CurrencyType.constructFromObject(data['currencyId']);
            }
            if (data.hasOwnProperty('discountBase')) {
                obj['discountBase'] = ApiClient.convertToType(data['discountBase'], 'Number');
            }
        }
        return obj;
    }
}



export default UpdatePriceWithDiscountDTO;

