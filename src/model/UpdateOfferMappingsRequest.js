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
import UpdateOfferMappingDTO from './UpdateOfferMappingDTO';

/**
 * The UpdateOfferMappingsRequest model module.
 * @module model/UpdateOfferMappingsRequest
 * @version LATEST
 */
class UpdateOfferMappingsRequest {
    /**
     * @member {Array.<module:model/UpdateOfferMappingDTO>} offerMappings
     * @type {Array.<module:model/UpdateOfferMappingDTO>}
     */
    offerMappings;
    /**
     * @member {Boolean} onlyPartnerMediaContent
     * @type {Boolean}
     */
    onlyPartnerMediaContent;

    

    /**
     * Constructs a new <code>UpdateOfferMappingsRequest</code>.
     * @alias module:model/UpdateOfferMappingsRequest
     * @param offerMappings {Array.<module:model/UpdateOfferMappingDTO>} Перечень товаров, которые нужно добавить или обновить.
     */
    constructor(offerMappings) { 
        
        UpdateOfferMappingsRequest.initialize(this, offerMappings);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, offerMappings) { 
        obj['offerMappings'] = offerMappings;
    }

    /**
     * Constructs a <code>UpdateOfferMappingsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateOfferMappingsRequest} obj Optional instance to populate.
     * @return {module:model/UpdateOfferMappingsRequest} The populated <code>UpdateOfferMappingsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateOfferMappingsRequest();

            if (data.hasOwnProperty('offerMappings')) {
                obj['offerMappings'] = ApiClient.convertToType(data['offerMappings'], [UpdateOfferMappingDTO]);
            }
            if (data.hasOwnProperty('onlyPartnerMediaContent')) {
                obj['onlyPartnerMediaContent'] = ApiClient.convertToType(data['onlyPartnerMediaContent'], 'Boolean');
            }
        }
        return obj;
    }
}



export default UpdateOfferMappingsRequest;

