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
import WarehouseStockDTO from './WarehouseStockDTO';

/**
 * The GoodsStatsWarehouseDTO model module.
 * @module model/GoodsStatsWarehouseDTO
 * @version LATEST
 */
class GoodsStatsWarehouseDTO {
    /**
     * Constructs a new <code>GoodsStatsWarehouseDTO</code>.
     * Информация о складе.
     * @alias module:model/GoodsStatsWarehouseDTO
     * @param stocks {Array.<module:model/WarehouseStockDTO>} Информация об остатках товаров на складе.
     */
    constructor(stocks) { 
        
        GoodsStatsWarehouseDTO.initialize(this, stocks);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, stocks) { 
        obj['stocks'] = stocks;
    }

    /**
     * Constructs a <code>GoodsStatsWarehouseDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GoodsStatsWarehouseDTO} obj Optional instance to populate.
     * @return {module:model/GoodsStatsWarehouseDTO} The populated <code>GoodsStatsWarehouseDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GoodsStatsWarehouseDTO();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('stocks')) {
                obj['stocks'] = ApiClient.convertToType(data['stocks'], [WarehouseStockDTO]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GoodsStatsWarehouseDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GoodsStatsWarehouseDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GoodsStatsWarehouseDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        if (data['stocks']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['stocks'])) {
                throw new Error("Expected the field `stocks` to be an array in the JSON data but got " + data['stocks']);
            }
            // validate the optional field `stocks` (array)
            for (const item of data['stocks']) {
                WarehouseStockDTO.validateJSON(item);
            };
        }

        return true;
    }


}

GoodsStatsWarehouseDTO.RequiredProperties = ["stocks"];

/**
 * Идентификатор склада.
 * @member {Number} id
 */
GoodsStatsWarehouseDTO.prototype['id'] = undefined;

/**
 * Название склада.
 * @member {String} name
 */
GoodsStatsWarehouseDTO.prototype['name'] = undefined;

/**
 * Информация об остатках товаров на складе.
 * @member {Array.<module:model/WarehouseStockDTO>} stocks
 */
GoodsStatsWarehouseDTO.prototype['stocks'] = undefined;






export default GoodsStatsWarehouseDTO;

