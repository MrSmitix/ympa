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
import QuarantineOfferDTO from './QuarantineOfferDTO';
import ScrollingPagerDTO from './ScrollingPagerDTO';

/**
 * The GetQuarantineOffersResultDTO model module.
 * @module model/GetQuarantineOffersResultDTO
 * @version LATEST
 */
class GetQuarantineOffersResultDTO {
    /**
     * @member {module:model/ScrollingPagerDTO} paging
     * @type {module:model/ScrollingPagerDTO}
     */
    paging;
    /**
     * @member {Array.<module:model/QuarantineOfferDTO>} offers
     * @type {Array.<module:model/QuarantineOfferDTO>}
     */
    offers;

    

    /**
     * Constructs a new <code>GetQuarantineOffersResultDTO</code>.
     * Список товаров в карантине.
     * @alias module:model/GetQuarantineOffersResultDTO
     * @param offers {Array.<module:model/QuarantineOfferDTO>} Страница списка товаров в карантине.
     */
    constructor(offers) { 
        
        GetQuarantineOffersResultDTO.initialize(this, offers);
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
     * Constructs a <code>GetQuarantineOffersResultDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetQuarantineOffersResultDTO} obj Optional instance to populate.
     * @return {module:model/GetQuarantineOffersResultDTO} The populated <code>GetQuarantineOffersResultDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetQuarantineOffersResultDTO();

            if (data.hasOwnProperty('paging')) {
                obj['paging'] = ScrollingPagerDTO.constructFromObject(data['paging']);
            }
            if (data.hasOwnProperty('offers')) {
                obj['offers'] = ApiClient.convertToType(data['offers'], [QuarantineOfferDTO]);
            }
        }
        return obj;
    }
}



export default GetQuarantineOffersResultDTO;

