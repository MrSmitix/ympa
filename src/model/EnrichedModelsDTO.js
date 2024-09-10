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
import EnrichedModelDTO from './EnrichedModelDTO';

/**
 * The EnrichedModelsDTO model module.
 * @module model/EnrichedModelsDTO
 * @version LATEST
 */
class EnrichedModelsDTO {
    /**
     * @member {Array.<module:model/EnrichedModelDTO>} models
     * @type {Array.<module:model/EnrichedModelDTO>}
     */
    models;

    

    /**
     * Constructs a new <code>EnrichedModelsDTO</code>.
     * Список моделей товаров.
     * @alias module:model/EnrichedModelsDTO
     * @param models {Array.<module:model/EnrichedModelDTO>} Список моделей товаров.
     */
    constructor(models) { 
        
        EnrichedModelsDTO.initialize(this, models);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, models) { 
        obj['models'] = models;
    }

    /**
     * Constructs a <code>EnrichedModelsDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EnrichedModelsDTO} obj Optional instance to populate.
     * @return {module:model/EnrichedModelsDTO} The populated <code>EnrichedModelsDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EnrichedModelsDTO();

            if (data.hasOwnProperty('models')) {
                obj['models'] = ApiClient.convertToType(data['models'], [EnrichedModelDTO]);
            }
        }
        return obj;
    }
}



export default EnrichedModelsDTO;

