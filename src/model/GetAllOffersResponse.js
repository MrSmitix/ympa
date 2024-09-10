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
import OfferDTO from './OfferDTO';
import OffersDTO from './OffersDTO';

/**
 * The GetAllOffersResponse model module.
 * @module model/GetAllOffersResponse
 * @version LATEST
 */
class GetAllOffersResponse {
    /**
     * Constructs a new <code>GetAllOffersResponse</code>.
     * Список предложений.
     * @alias module:model/GetAllOffersResponse
     * @implements module:model/OffersDTO
     * @param offers {Array.<module:model/OfferDTO>} Список предложений магазина.
     */
    constructor(offers) { 
        OffersDTO.initialize(this, offers);
        GetAllOffersResponse.initialize(this, offers);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, offers) { 
        obj['offers'] = offers;
    }

    /**
     * Constructs a <code>GetAllOffersResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetAllOffersResponse} obj Optional instance to populate.
     * @return {module:model/GetAllOffersResponse} The populated <code>GetAllOffersResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetAllOffersResponse();
            OffersDTO.constructFromObject(data, obj);

            if (data.hasOwnProperty('offers')) {
                obj['offers'] = ApiClient.convertToType(data['offers'], [OfferDTO]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetAllOffersResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetAllOffersResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetAllOffersResponse.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['offers']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['offers'])) {
                throw new Error("Expected the field `offers` to be an array in the JSON data but got " + data['offers']);
            }
            // validate the optional field `offers` (array)
            for (const item of data['offers']) {
                OfferDTO.validateJSON(item);
            };
        }

        return true;
    }


}

GetAllOffersResponse.RequiredProperties = ["offers"];

/**
 * Список предложений магазина.
 * @member {Array.<module:model/OfferDTO>} offers
 */
GetAllOffersResponse.prototype['offers'] = undefined;


// Implement OffersDTO interface:
/**
 * Список предложений магазина.
 * @member {Array.<module:model/OfferDTO>} offers
 */
OffersDTO.prototype['offers'] = undefined;




export default GetAllOffersResponse;

