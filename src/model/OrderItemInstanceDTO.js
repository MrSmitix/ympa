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
 * The OrderItemInstanceDTO model module.
 * @module model/OrderItemInstanceDTO
 * @version LATEST
 */
class OrderItemInstanceDTO {
    /**
     * Constructs a new <code>OrderItemInstanceDTO</code>.
     * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
     * @alias module:model/OrderItemInstanceDTO
     */
    constructor() { 
        
        OrderItemInstanceDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrderItemInstanceDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrderItemInstanceDTO} obj Optional instance to populate.
     * @return {module:model/OrderItemInstanceDTO} The populated <code>OrderItemInstanceDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrderItemInstanceDTO();

            if (data.hasOwnProperty('cis')) {
                obj['cis'] = ApiClient.convertToType(data['cis'], 'String');
            }
            if (data.hasOwnProperty('cisFull')) {
                obj['cisFull'] = ApiClient.convertToType(data['cisFull'], 'String');
            }
            if (data.hasOwnProperty('uin')) {
                obj['uin'] = ApiClient.convertToType(data['uin'], 'String');
            }
            if (data.hasOwnProperty('rnpt')) {
                obj['rnpt'] = ApiClient.convertToType(data['rnpt'], 'String');
            }
            if (data.hasOwnProperty('gtd')) {
                obj['gtd'] = ApiClient.convertToType(data['gtd'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OrderItemInstanceDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OrderItemInstanceDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['cis'] && !(typeof data['cis'] === 'string' || data['cis'] instanceof String)) {
            throw new Error("Expected the field `cis` to be a primitive type in the JSON string but got " + data['cis']);
        }
        // ensure the json data is a string
        if (data['cisFull'] && !(typeof data['cisFull'] === 'string' || data['cisFull'] instanceof String)) {
            throw new Error("Expected the field `cisFull` to be a primitive type in the JSON string but got " + data['cisFull']);
        }
        // ensure the json data is a string
        if (data['uin'] && !(typeof data['uin'] === 'string' || data['uin'] instanceof String)) {
            throw new Error("Expected the field `uin` to be a primitive type in the JSON string but got " + data['uin']);
        }
        // ensure the json data is a string
        if (data['rnpt'] && !(typeof data['rnpt'] === 'string' || data['rnpt'] instanceof String)) {
            throw new Error("Expected the field `rnpt` to be a primitive type in the JSON string but got " + data['rnpt']);
        }
        // ensure the json data is a string
        if (data['gtd'] && !(typeof data['gtd'] === 'string' || data['gtd'] instanceof String)) {
            throw new Error("Expected the field `gtd` to be a primitive type in the JSON string but got " + data['gtd']);
        }

        return true;
    }


}



/**
 * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
 * @member {String} cis
 */
OrderItemInstanceDTO.prototype['cis'] = undefined;

/**
 * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
 * @member {String} cisFull
 */
OrderItemInstanceDTO.prototype['cisFull'] = undefined;

/**
 * УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
 * @member {String} uin
 */
OrderItemInstanceDTO.prototype['uin'] = undefined;

/**
 * Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
 * @member {String} rnpt
 */
OrderItemInstanceDTO.prototype['rnpt'] = undefined;

/**
 * Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
 * @member {String} gtd
 */
OrderItemInstanceDTO.prototype['gtd'] = undefined;






export default OrderItemInstanceDTO;

