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

/**
 * The UpdateStockItemDTO model module.
 * @module model/UpdateStockItemDTO
 * @version LATEST
 */
class UpdateStockItemDTO {
    /**
     * @member {Number} count
     * @type {Number}
     */
    count;
    /**
     * @member {Date} updatedAt
     * @type {Date}
     */
    updatedAt;

    

    /**
     * Constructs a new <code>UpdateStockItemDTO</code>.
     * Информация об остатках товара. 
     * @alias module:model/UpdateStockItemDTO
     * @param count {Number} Количество доступного товара. 
     */
    constructor(count) { 
        
        UpdateStockItemDTO.initialize(this, count);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, count) { 
        obj['count'] = count;
    }

    /**
     * Constructs a <code>UpdateStockItemDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateStockItemDTO} obj Optional instance to populate.
     * @return {module:model/UpdateStockItemDTO} The populated <code>UpdateStockItemDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateStockItemDTO();

            if (data.hasOwnProperty('count')) {
                obj['count'] = ApiClient.convertToType(data['count'], 'Number');
            }
            if (data.hasOwnProperty('updatedAt')) {
                obj['updatedAt'] = ApiClient.convertToType(data['updatedAt'], 'Date');
            }
        }
        return obj;
    }
}



export default UpdateStockItemDTO;

