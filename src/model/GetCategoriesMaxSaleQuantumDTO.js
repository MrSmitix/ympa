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
import CategoryErrorDTO from './CategoryErrorDTO';
import MaxSaleQuantumDTO from './MaxSaleQuantumDTO';

/**
 * The GetCategoriesMaxSaleQuantumDTO model module.
 * @module model/GetCategoriesMaxSaleQuantumDTO
 * @version LATEST
 */
class GetCategoriesMaxSaleQuantumDTO {
    /**
     * Constructs a new <code>GetCategoriesMaxSaleQuantumDTO</code>.
     * Категории и лимит на установку кванта и минимального количества товаров.
     * @alias module:model/GetCategoriesMaxSaleQuantumDTO
     * @param results {Array.<module:model/MaxSaleQuantumDTO>} Категории и лимит на установку кванта и минимального количества товаров.
     */
    constructor(results) { 
        
        GetCategoriesMaxSaleQuantumDTO.initialize(this, results);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, results) { 
        obj['results'] = results;
    }

    /**
     * Constructs a <code>GetCategoriesMaxSaleQuantumDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetCategoriesMaxSaleQuantumDTO} obj Optional instance to populate.
     * @return {module:model/GetCategoriesMaxSaleQuantumDTO} The populated <code>GetCategoriesMaxSaleQuantumDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetCategoriesMaxSaleQuantumDTO();

            if (data.hasOwnProperty('results')) {
                obj['results'] = ApiClient.convertToType(data['results'], [MaxSaleQuantumDTO]);
            }
            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [CategoryErrorDTO]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetCategoriesMaxSaleQuantumDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetCategoriesMaxSaleQuantumDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetCategoriesMaxSaleQuantumDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['results']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['results'])) {
                throw new Error("Expected the field `results` to be an array in the JSON data but got " + data['results']);
            }
            // validate the optional field `results` (array)
            for (const item of data['results']) {
                MaxSaleQuantumDTO.validateJSON(item);
            };
        }
        if (data['errors']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['errors'])) {
                throw new Error("Expected the field `errors` to be an array in the JSON data but got " + data['errors']);
            }
            // validate the optional field `errors` (array)
            for (const item of data['errors']) {
                CategoryErrorDTO.validateJSON(item);
            };
        }

        return true;
    }


}

GetCategoriesMaxSaleQuantumDTO.RequiredProperties = ["results"];

/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 * @member {Array.<module:model/MaxSaleQuantumDTO>} results
 */
GetCategoriesMaxSaleQuantumDTO.prototype['results'] = undefined;

/**
 * Ошибки, которые появились из-за переданных категорий.
 * @member {Array.<module:model/CategoryErrorDTO>} errors
 */
GetCategoriesMaxSaleQuantumDTO.prototype['errors'] = undefined;






export default GetCategoriesMaxSaleQuantumDTO;

