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
import ParameterValueDTO from './ParameterValueDTO';

/**
 * The OfferContentDTO model module.
 * @module model/OfferContentDTO
 * @version LATEST
 */
class OfferContentDTO {
    /**
     * @member {String} offerId
     * @type {String}
     */
    offerId;
    /**
     * @member {Number} categoryId
     * @type {Number}
     */
    categoryId;
    /**
     * @member {Array.<module:model/ParameterValueDTO>} parameterValues
     * @type {Array.<module:model/ParameterValueDTO>}
     */
    parameterValues;

    

    /**
     * Constructs a new <code>OfferContentDTO</code>.
     * Товар с указанными характеристиками.
     * @alias module:model/OfferContentDTO
     * @param offerId {String} Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param categoryId {Number} Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
     * @param parameterValues {Array.<module:model/ParameterValueDTO>} Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
     */
    constructor(offerId, categoryId, parameterValues) { 
        
        OfferContentDTO.initialize(this, offerId, categoryId, parameterValues);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, offerId, categoryId, parameterValues) { 
        obj['offerId'] = offerId;
        obj['categoryId'] = categoryId;
        obj['parameterValues'] = parameterValues;
    }

    /**
     * Constructs a <code>OfferContentDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OfferContentDTO} obj Optional instance to populate.
     * @return {module:model/OfferContentDTO} The populated <code>OfferContentDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OfferContentDTO();

            if (data.hasOwnProperty('offerId')) {
                obj['offerId'] = ApiClient.convertToType(data['offerId'], 'String');
            }
            if (data.hasOwnProperty('categoryId')) {
                obj['categoryId'] = ApiClient.convertToType(data['categoryId'], 'Number');
            }
            if (data.hasOwnProperty('parameterValues')) {
                obj['parameterValues'] = ApiClient.convertToType(data['parameterValues'], [ParameterValueDTO]);
            }
        }
        return obj;
    }
}



export default OfferContentDTO;

