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
import UpdatePriceWithDiscountDTO from './UpdatePriceWithDiscountDTO';

/**
 * The UpdateBusinessOfferPriceDTO model module.
 * @module model/UpdateBusinessOfferPriceDTO
 * @version LATEST
 */
class UpdateBusinessOfferPriceDTO {
    /**
     * Constructs a new <code>UpdateBusinessOfferPriceDTO</code>.
     * Товар с новой ценой.
     * @alias module:model/UpdateBusinessOfferPriceDTO
     * @param offerId {String} Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param price {module:model/UpdatePriceWithDiscountDTO} 
     */
    constructor(offerId, price) { 
        
        UpdateBusinessOfferPriceDTO.initialize(this, offerId, price);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, offerId, price) { 
        obj['offerId'] = offerId;
        obj['price'] = price;
    }

    /**
     * Constructs a <code>UpdateBusinessOfferPriceDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateBusinessOfferPriceDTO} obj Optional instance to populate.
     * @return {module:model/UpdateBusinessOfferPriceDTO} The populated <code>UpdateBusinessOfferPriceDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateBusinessOfferPriceDTO();

            if (data.hasOwnProperty('offerId')) {
                obj['offerId'] = ApiClient.convertToType(data['offerId'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = UpdatePriceWithDiscountDTO.constructFromObject(data['price']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UpdateBusinessOfferPriceDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UpdateBusinessOfferPriceDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of UpdateBusinessOfferPriceDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['offerId'] && !(typeof data['offerId'] === 'string' || data['offerId'] instanceof String)) {
            throw new Error("Expected the field `offerId` to be a primitive type in the JSON string but got " + data['offerId']);
        }
        // validate the optional field `price`
        if (data['price']) { // data not null
          UpdatePriceWithDiscountDTO.validateJSON(data['price']);
        }

        return true;
    }


}

UpdateBusinessOfferPriceDTO.RequiredProperties = ["offerId", "price"];

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @member {String} offerId
 */
UpdateBusinessOfferPriceDTO.prototype['offerId'] = undefined;

/**
 * @member {module:model/UpdatePriceWithDiscountDTO} price
 */
UpdateBusinessOfferPriceDTO.prototype['price'] = undefined;






export default UpdateBusinessOfferPriceDTO;

