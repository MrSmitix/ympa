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
import PriceQuarantineVerdictDTO from './PriceQuarantineVerdictDTO';

/**
 * The QuarantineOfferDTO model module.
 * @module model/QuarantineOfferDTO
 * @version LATEST
 */
class QuarantineOfferDTO {
    /**
     * Constructs a new <code>QuarantineOfferDTO</code>.
     * Товар в карантине.
     * @alias module:model/QuarantineOfferDTO
     */
    constructor() { 
        
        QuarantineOfferDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>QuarantineOfferDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QuarantineOfferDTO} obj Optional instance to populate.
     * @return {module:model/QuarantineOfferDTO} The populated <code>QuarantineOfferDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QuarantineOfferDTO();

            if (data.hasOwnProperty('offerId')) {
                obj['offerId'] = ApiClient.convertToType(data['offerId'], 'String');
            }
            if (data.hasOwnProperty('currentPrice')) {
                obj['currentPrice'] = BasePriceDTO.constructFromObject(data['currentPrice']);
            }
            if (data.hasOwnProperty('lastValidPrice')) {
                obj['lastValidPrice'] = BasePriceDTO.constructFromObject(data['lastValidPrice']);
            }
            if (data.hasOwnProperty('verdicts')) {
                obj['verdicts'] = ApiClient.convertToType(data['verdicts'], [PriceQuarantineVerdictDTO]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>QuarantineOfferDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>QuarantineOfferDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['offerId'] && !(typeof data['offerId'] === 'string' || data['offerId'] instanceof String)) {
            throw new Error("Expected the field `offerId` to be a primitive type in the JSON string but got " + data['offerId']);
        }
        // validate the optional field `currentPrice`
        if (data['currentPrice']) { // data not null
          BasePriceDTO.validateJSON(data['currentPrice']);
        }
        // validate the optional field `lastValidPrice`
        if (data['lastValidPrice']) { // data not null
          BasePriceDTO.validateJSON(data['lastValidPrice']);
        }
        if (data['verdicts']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['verdicts'])) {
                throw new Error("Expected the field `verdicts` to be an array in the JSON data but got " + data['verdicts']);
            }
            // validate the optional field `verdicts` (array)
            for (const item of data['verdicts']) {
                PriceQuarantineVerdictDTO.validateJSON(item);
            };
        }

        return true;
    }


}



/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @member {String} offerId
 */
QuarantineOfferDTO.prototype['offerId'] = undefined;

/**
 * @member {module:model/BasePriceDTO} currentPrice
 */
QuarantineOfferDTO.prototype['currentPrice'] = undefined;

/**
 * @member {module:model/BasePriceDTO} lastValidPrice
 */
QuarantineOfferDTO.prototype['lastValidPrice'] = undefined;

/**
 * Причины попадания товара в карантин.
 * @member {Array.<module:model/PriceQuarantineVerdictDTO>} verdicts
 */
QuarantineOfferDTO.prototype['verdicts'] = undefined;






export default QuarantineOfferDTO;

