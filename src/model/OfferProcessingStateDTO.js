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
import OfferProcessingNoteDTO from './OfferProcessingNoteDTO';
import OfferProcessingStatusType from './OfferProcessingStatusType';

/**
 * The OfferProcessingStateDTO model module.
 * @module model/OfferProcessingStateDTO
 * @version LATEST
 */
class OfferProcessingStateDTO {
    /**
     * @member {module:model/OfferProcessingStatusType} status
     * @type {module:model/OfferProcessingStatusType}
     */
    status;
    /**
     * @member {Array.<module:model/OfferProcessingNoteDTO>} notes
     * @type {Array.<module:model/OfferProcessingNoteDTO>}
     */
    notes;

    

    /**
     * Constructs a new <code>OfferProcessingStateDTO</code>.
     * Информация о статусе публикации товара на Маркете.
     * @alias module:model/OfferProcessingStateDTO
     */
    constructor() { 
        
        OfferProcessingStateDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OfferProcessingStateDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OfferProcessingStateDTO} obj Optional instance to populate.
     * @return {module:model/OfferProcessingStateDTO} The populated <code>OfferProcessingStateDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OfferProcessingStateDTO();

            if (data.hasOwnProperty('status')) {
                obj['status'] = OfferProcessingStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('notes')) {
                obj['notes'] = ApiClient.convertToType(data['notes'], [OfferProcessingNoteDTO]);
            }
        }
        return obj;
    }
}



export default OfferProcessingStateDTO;

