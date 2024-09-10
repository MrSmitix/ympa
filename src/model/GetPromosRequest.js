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
import MechanicsType from './MechanicsType';
import PromoParticipationType from './PromoParticipationType';

/**
 * The GetPromosRequest model module.
 * @module model/GetPromosRequest
 * @version LATEST
 */
class GetPromosRequest {
    /**
     * @member {module:model/PromoParticipationType} participation
     * @type {module:model/PromoParticipationType}
     */
    participation;
    /**
     * @member {module:model/MechanicsType} mechanics
     * @type {module:model/MechanicsType}
     */
    mechanics;

    

    /**
     * Constructs a new <code>GetPromosRequest</code>.
     * Фильтры для получения списка акций.
     * @alias module:model/GetPromosRequest
     */
    constructor() { 
        
        GetPromosRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetPromosRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetPromosRequest} obj Optional instance to populate.
     * @return {module:model/GetPromosRequest} The populated <code>GetPromosRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetPromosRequest();

            if (data.hasOwnProperty('participation')) {
                obj['participation'] = PromoParticipationType.constructFromObject(data['participation']);
            }
            if (data.hasOwnProperty('mechanics')) {
                obj['mechanics'] = MechanicsType.constructFromObject(data['mechanics']);
            }
        }
        return obj;
    }
}



export default GetPromosRequest;

