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
import PromoOfferDiscountParamsDTO from './PromoOfferDiscountParamsDTO';
import PromoOfferPromocodeParamsDTO from './PromoOfferPromocodeParamsDTO';

/**
 * The PromoOfferParamsDTO model module.
 * @module model/PromoOfferParamsDTO
 * @version LATEST
 */
class PromoOfferParamsDTO {
    /**
     * Constructs a new <code>PromoOfferParamsDTO</code>.
     * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
     * @alias module:model/PromoOfferParamsDTO
     */
    constructor() { 
        
        PromoOfferParamsDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PromoOfferParamsDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PromoOfferParamsDTO} obj Optional instance to populate.
     * @return {module:model/PromoOfferParamsDTO} The populated <code>PromoOfferParamsDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PromoOfferParamsDTO();

            if (data.hasOwnProperty('discountParams')) {
                obj['discountParams'] = PromoOfferDiscountParamsDTO.constructFromObject(data['discountParams']);
            }
            if (data.hasOwnProperty('promocodeParams')) {
                obj['promocodeParams'] = PromoOfferPromocodeParamsDTO.constructFromObject(data['promocodeParams']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PromoOfferParamsDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PromoOfferParamsDTO</code>.
     */
    static validateJSON(data) {
        // validate the optional field `discountParams`
        if (data['discountParams']) { // data not null
          PromoOfferDiscountParamsDTO.validateJSON(data['discountParams']);
        }
        // validate the optional field `promocodeParams`
        if (data['promocodeParams']) { // data not null
          PromoOfferPromocodeParamsDTO.validateJSON(data['promocodeParams']);
        }

        return true;
    }


}



/**
 * @member {module:model/PromoOfferDiscountParamsDTO} discountParams
 */
PromoOfferParamsDTO.prototype['discountParams'] = undefined;

/**
 * @member {module:model/PromoOfferPromocodeParamsDTO} promocodeParams
 */
PromoOfferParamsDTO.prototype['promocodeParams'] = undefined;






export default PromoOfferParamsDTO;

