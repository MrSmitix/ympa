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
import CategoryParameterDTO from './CategoryParameterDTO';

/**
 * The CategoryContentParametersDTO model module.
 * @module model/CategoryContentParametersDTO
 * @version LATEST
 */
class CategoryContentParametersDTO {
    /**
     * @member {Number} categoryId
     * @type {Number}
     */
    categoryId;
    /**
     * @member {Array.<module:model/CategoryParameterDTO>} parameters
     * @type {Array.<module:model/CategoryParameterDTO>}
     */
    parameters;

    

    /**
     * Constructs a new <code>CategoryContentParametersDTO</code>.
     * Информация о параметрах категории.
     * @alias module:model/CategoryContentParametersDTO
     * @param categoryId {Number} Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
     */
    constructor(categoryId) { 
        
        CategoryContentParametersDTO.initialize(this, categoryId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, categoryId) { 
        obj['categoryId'] = categoryId;
    }

    /**
     * Constructs a <code>CategoryContentParametersDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CategoryContentParametersDTO} obj Optional instance to populate.
     * @return {module:model/CategoryContentParametersDTO} The populated <code>CategoryContentParametersDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CategoryContentParametersDTO();

            if (data.hasOwnProperty('categoryId')) {
                obj['categoryId'] = ApiClient.convertToType(data['categoryId'], 'Number');
            }
            if (data.hasOwnProperty('parameters')) {
                obj['parameters'] = ApiClient.convertToType(data['parameters'], [CategoryParameterDTO]);
            }
        }
        return obj;
    }
}



export default CategoryContentParametersDTO;

