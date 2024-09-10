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
import PromoOfferParticipationStatusFilterType from './PromoOfferParticipationStatusFilterType';

/**
 * The GetPromoOffersRequest model module.
 * @module model/GetPromoOffersRequest
 * @version LATEST
 */
class GetPromoOffersRequest {
    /**
     * @member {String} promoId
     * @type {String}
     */
    promoId;
    /**
     * @member {module:model/PromoOfferParticipationStatusFilterType} statusType
     * @type {module:model/PromoOfferParticipationStatusFilterType}
     */
    statusType;

    

    /**
     * Constructs a new <code>GetPromoOffersRequest</code>.
     * Получение списка товаров, которые участвуют или могут участвовать в акции.
     * @alias module:model/GetPromoOffersRequest
     * @param promoId {String} Идентификатор акции.
     */
    constructor(promoId) { 
        
        GetPromoOffersRequest.initialize(this, promoId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, promoId) { 
        obj['promoId'] = promoId;
    }

    /**
     * Constructs a <code>GetPromoOffersRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetPromoOffersRequest} obj Optional instance to populate.
     * @return {module:model/GetPromoOffersRequest} The populated <code>GetPromoOffersRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetPromoOffersRequest();

            if (data.hasOwnProperty('promoId')) {
                obj['promoId'] = ApiClient.convertToType(data['promoId'], 'String');
            }
            if (data.hasOwnProperty('statusType')) {
                obj['statusType'] = PromoOfferParticipationStatusFilterType.constructFromObject(data['statusType']);
            }
        }
        return obj;
    }
}



export default GetPromoOffersRequest;

