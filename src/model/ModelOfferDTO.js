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
 * The ModelOfferDTO model module.
 * @module model/ModelOfferDTO
 * @version LATEST
 */
class ModelOfferDTO {
    /**
     * Constructs a new <code>ModelOfferDTO</code>.
     * Информация о предложении.
     * @alias module:model/ModelOfferDTO
     */
    constructor() { 
        
        ModelOfferDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ModelOfferDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ModelOfferDTO} obj Optional instance to populate.
     * @return {module:model/ModelOfferDTO} The populated <code>ModelOfferDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ModelOfferDTO();

            if (data.hasOwnProperty('discount')) {
                obj['discount'] = ApiClient.convertToType(data['discount'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('pos')) {
                obj['pos'] = ApiClient.convertToType(data['pos'], 'Number');
            }
            if (data.hasOwnProperty('preDiscountPrice')) {
                obj['preDiscountPrice'] = ApiClient.convertToType(data['preDiscountPrice'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('regionId')) {
                obj['regionId'] = ApiClient.convertToType(data['regionId'], 'Number');
            }
            if (data.hasOwnProperty('shippingCost')) {
                obj['shippingCost'] = ApiClient.convertToType(data['shippingCost'], 'Number');
            }
            if (data.hasOwnProperty('shopName')) {
                obj['shopName'] = ApiClient.convertToType(data['shopName'], 'String');
            }
            if (data.hasOwnProperty('shopRating')) {
                obj['shopRating'] = ApiClient.convertToType(data['shopRating'], 'Number');
            }
            if (data.hasOwnProperty('inStock')) {
                obj['inStock'] = ApiClient.convertToType(data['inStock'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ModelOfferDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ModelOfferDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['shopName'] && !(typeof data['shopName'] === 'string' || data['shopName'] instanceof String)) {
            throw new Error("Expected the field `shopName` to be a primitive type in the JSON string but got " + data['shopName']);
        }

        return true;
    }


}



/**
 * Скидка на предложение в процентах.
 * @member {Number} discount
 */
ModelOfferDTO.prototype['discount'] = undefined;

/**
 * Наименование предложения.
 * @member {String} name
 */
ModelOfferDTO.prototype['name'] = undefined;

/**
 * Позиция предложения в выдаче Маркета на карточке модели.
 * @member {Number} pos
 */
ModelOfferDTO.prototype['pos'] = undefined;

/**
 * Цена предложения без скидки магазина.
 * @member {Number} preDiscountPrice
 */
ModelOfferDTO.prototype['preDiscountPrice'] = undefined;

/**
 * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
 * @member {Number} price
 */
ModelOfferDTO.prototype['price'] = undefined;

/**
 * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
 * @member {Number} regionId
 */
ModelOfferDTO.prototype['regionId'] = undefined;

/**
 * Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
 * @member {Number} shippingCost
 */
ModelOfferDTO.prototype['shippingCost'] = undefined;

/**
 * Название магазина (в том виде, в котором отображается на Маркете).
 * @member {String} shopName
 */
ModelOfferDTO.prototype['shopName'] = undefined;

/**
 * Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
 * @member {Number} shopRating
 */
ModelOfferDTO.prototype['shopRating'] = undefined;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 * @member {Number} inStock
 */
ModelOfferDTO.prototype['inStock'] = undefined;






export default ModelOfferDTO;

