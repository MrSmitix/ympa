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
import RejectedPromoOfferUpdateReasonType from './RejectedPromoOfferUpdateReasonType';

/**
 * The RejectedPromoOfferUpdateDTO model module.
 * @module model/RejectedPromoOfferUpdateDTO
 * @version LATEST
 */
class RejectedPromoOfferUpdateDTO {
    /**
     * Constructs a new <code>RejectedPromoOfferUpdateDTO</code>.
     * Описание отклоненного изменения.
     * @alias module:model/RejectedPromoOfferUpdateDTO
     * @param offerId {String} Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param reason {module:model/RejectedPromoOfferUpdateReasonType} 
     */
    constructor(offerId, reason) { 
        
        RejectedPromoOfferUpdateDTO.initialize(this, offerId, reason);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, offerId, reason) { 
        obj['offerId'] = offerId;
        obj['reason'] = reason;
    }

    /**
     * Constructs a <code>RejectedPromoOfferUpdateDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RejectedPromoOfferUpdateDTO} obj Optional instance to populate.
     * @return {module:model/RejectedPromoOfferUpdateDTO} The populated <code>RejectedPromoOfferUpdateDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RejectedPromoOfferUpdateDTO();

            if (data.hasOwnProperty('offerId')) {
                obj['offerId'] = ApiClient.convertToType(data['offerId'], 'String');
            }
            if (data.hasOwnProperty('reason')) {
                obj['reason'] = RejectedPromoOfferUpdateReasonType.constructFromObject(data['reason']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RejectedPromoOfferUpdateDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RejectedPromoOfferUpdateDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RejectedPromoOfferUpdateDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['offerId'] && !(typeof data['offerId'] === 'string' || data['offerId'] instanceof String)) {
            throw new Error("Expected the field `offerId` to be a primitive type in the JSON string but got " + data['offerId']);
        }

        return true;
    }


}

RejectedPromoOfferUpdateDTO.RequiredProperties = ["offerId", "reason"];

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @member {String} offerId
 */
RejectedPromoOfferUpdateDTO.prototype['offerId'] = undefined;

/**
 * @member {module:model/RejectedPromoOfferUpdateReasonType} reason
 */
RejectedPromoOfferUpdateDTO.prototype['reason'] = undefined;






export default RejectedPromoOfferUpdateDTO;

