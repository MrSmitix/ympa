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
import BriefOrderItemInstanceDTO from './BriefOrderItemInstanceDTO';
import OrderBoxLayoutPartialCountDTO from './OrderBoxLayoutPartialCountDTO';

/**
 * The OrderBoxLayoutItemDTO model module.
 * @module model/OrderBoxLayoutItemDTO
 * @version LATEST
 */
class OrderBoxLayoutItemDTO {
    /**
     * Constructs a new <code>OrderBoxLayoutItemDTO</code>.
     * Информация о товаре в коробке.
     * @alias module:model/OrderBoxLayoutItemDTO
     * @param id {Number} Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
     */
    constructor(id) { 
        
        OrderBoxLayoutItemDTO.initialize(this, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id) { 
        obj['id'] = id;
    }

    /**
     * Constructs a <code>OrderBoxLayoutItemDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrderBoxLayoutItemDTO} obj Optional instance to populate.
     * @return {module:model/OrderBoxLayoutItemDTO} The populated <code>OrderBoxLayoutItemDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrderBoxLayoutItemDTO();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('fullCount')) {
                obj['fullCount'] = ApiClient.convertToType(data['fullCount'], 'Number');
            }
            if (data.hasOwnProperty('partialCount')) {
                obj['partialCount'] = OrderBoxLayoutPartialCountDTO.constructFromObject(data['partialCount']);
            }
            if (data.hasOwnProperty('instances')) {
                obj['instances'] = ApiClient.convertToType(data['instances'], [BriefOrderItemInstanceDTO]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OrderBoxLayoutItemDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OrderBoxLayoutItemDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OrderBoxLayoutItemDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `partialCount`
        if (data['partialCount']) { // data not null
          OrderBoxLayoutPartialCountDTO.validateJSON(data['partialCount']);
        }
        if (data['instances']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['instances'])) {
                throw new Error("Expected the field `instances` to be an array in the JSON data but got " + data['instances']);
            }
            // validate the optional field `instances` (array)
            for (const item of data['instances']) {
                BriefOrderItemInstanceDTO.validateJSON(item);
            };
        }

        return true;
    }


}

OrderBoxLayoutItemDTO.RequiredProperties = ["id"];

/**
 * Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
 * @member {Number} id
 */
OrderBoxLayoutItemDTO.prototype['id'] = undefined;

/**
 * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
 * @member {Number} fullCount
 */
OrderBoxLayoutItemDTO.prototype['fullCount'] = undefined;

/**
 * @member {module:model/OrderBoxLayoutPartialCountDTO} partialCount
 */
OrderBoxLayoutItemDTO.prototype['partialCount'] = undefined;

/**
 * Переданные вами коды маркировки.
 * @member {Array.<module:model/BriefOrderItemInstanceDTO>} instances
 */
OrderBoxLayoutItemDTO.prototype['instances'] = undefined;






export default OrderBoxLayoutItemDTO;

