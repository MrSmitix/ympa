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
 * The CalculateTariffsOfferDTO model module.
 * @module model/CalculateTariffsOfferDTO
 * @version LATEST
 */
class CalculateTariffsOfferDTO {
    /**
     * @member {Number} categoryId
     * @type {Number}
     */
    categoryId;
    /**
     * @member {Number} price
     * @type {Number}
     */
    price;
    /**
     * @member {Number} length
     * @type {Number}
     */
    length;
    /**
     * @member {Number} width
     * @type {Number}
     */
    width;
    /**
     * @member {Number} height
     * @type {Number}
     */
    height;
    /**
     * @member {Number} weight
     * @type {Number}
     */
    weight;
    /**
     * @member {Number} quantity
     * @type {Number}
     * @default 1
     */
    quantity = 1;

    

    /**
     * Constructs a new <code>CalculateTariffsOfferDTO</code>.
     * Параметры товара, для которого нужно рассчитать стоимость услуг.
     * @alias module:model/CalculateTariffsOfferDTO
     * @param categoryId {Number} Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
     * @param price {Number} Цена на товар в рублях.
     * @param length {Number} Длина товара в сантиметрах.
     * @param width {Number} Ширина товара в сантиметрах.
     * @param height {Number} Высота товара в сантиметрах.
     * @param weight {Number} Вес товара в килограммах.
     */
    constructor(categoryId, price, length, width, height, weight) { 
        
        CalculateTariffsOfferDTO.initialize(this, categoryId, price, length, width, height, weight);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, categoryId, price, length, width, height, weight) { 
        obj['categoryId'] = categoryId;
        obj['price'] = price;
        obj['length'] = length;
        obj['width'] = width;
        obj['height'] = height;
        obj['weight'] = weight;
    }

    /**
     * Constructs a <code>CalculateTariffsOfferDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculateTariffsOfferDTO} obj Optional instance to populate.
     * @return {module:model/CalculateTariffsOfferDTO} The populated <code>CalculateTariffsOfferDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculateTariffsOfferDTO();

            if (data.hasOwnProperty('categoryId')) {
                obj['categoryId'] = ApiClient.convertToType(data['categoryId'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('length')) {
                obj['length'] = ApiClient.convertToType(data['length'], 'Number');
            }
            if (data.hasOwnProperty('width')) {
                obj['width'] = ApiClient.convertToType(data['width'], 'Number');
            }
            if (data.hasOwnProperty('height')) {
                obj['height'] = ApiClient.convertToType(data['height'], 'Number');
            }
            if (data.hasOwnProperty('weight')) {
                obj['weight'] = ApiClient.convertToType(data['weight'], 'Number');
            }
            if (data.hasOwnProperty('quantity')) {
                obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
            }
        }
        return obj;
    }
}



export default CalculateTariffsOfferDTO;

