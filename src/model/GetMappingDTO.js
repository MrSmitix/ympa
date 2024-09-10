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
import UpdateMappingDTO from './UpdateMappingDTO';

/**
 * The GetMappingDTO model module.
 * @module model/GetMappingDTO
 * @version LATEST
 */
class GetMappingDTO {
    /**
     * @member {Number} marketSku
     * @type {Number}
     */
    marketSku;
    /**
     * @member {String} marketSkuName
     * @type {String}
     */
    marketSkuName;
    /**
     * @member {Number} marketModelId
     * @type {Number}
     */
    marketModelId;
    /**
     * @member {String} marketModelName
     * @type {String}
     */
    marketModelName;
    /**
     * @member {Number} marketCategoryId
     * @type {Number}
     */
    marketCategoryId;
    /**
     * @member {String} marketCategoryName
     * @type {String}
     */
    marketCategoryName;

    /**
     * @member {Number} marketSku
     * @type {Number}
     */
    #marketSku;
    

    /**
     * Constructs a new <code>GetMappingDTO</code>.
     * Информация о товарах в каталоге. 
     * @alias module:model/GetMappingDTO
     * @implements module:model/UpdateMappingDTO
     */
    constructor() { 
        UpdateMappingDTO.initialize(this);
        GetMappingDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetMappingDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetMappingDTO} obj Optional instance to populate.
     * @return {module:model/GetMappingDTO} The populated <code>GetMappingDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetMappingDTO();
            UpdateMappingDTO.constructFromObject(data, obj);

            if (data.hasOwnProperty('marketSku')) {
                obj['marketSku'] = ApiClient.convertToType(data['marketSku'], 'Number');
            }
            if (data.hasOwnProperty('marketSkuName')) {
                obj['marketSkuName'] = ApiClient.convertToType(data['marketSkuName'], 'String');
            }
            if (data.hasOwnProperty('marketModelId')) {
                obj['marketModelId'] = ApiClient.convertToType(data['marketModelId'], 'Number');
            }
            if (data.hasOwnProperty('marketModelName')) {
                obj['marketModelName'] = ApiClient.convertToType(data['marketModelName'], 'String');
            }
            if (data.hasOwnProperty('marketCategoryId')) {
                obj['marketCategoryId'] = ApiClient.convertToType(data['marketCategoryId'], 'Number');
            }
            if (data.hasOwnProperty('marketCategoryName')) {
                obj['marketCategoryName'] = ApiClient.convertToType(data['marketCategoryName'], 'String');
            }
        }
        return obj;
    }
}



export default GetMappingDTO;

