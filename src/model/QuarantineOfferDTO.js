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
     * @member {String} offerId
     * @type {String}
     */
    offerId;
    /**
     * @member {module:model/BasePriceDTO} currentPrice
     * @type {module:model/BasePriceDTO}
     */
    currentPrice;
    /**
     * @member {module:model/BasePriceDTO} lastValidPrice
     * @type {module:model/BasePriceDTO}
     */
    lastValidPrice;
    /**
     * @member {Array.<module:model/PriceQuarantineVerdictDTO>} verdicts
     * @type {Array.<module:model/PriceQuarantineVerdictDTO>}
     */
    verdicts;

    

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
}



export default QuarantineOfferDTO;

