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
 * The GenerateMassOrderLabelsRequest model module.
 * @module model/GenerateMassOrderLabelsRequest
 * @version LATEST
 */
class GenerateMassOrderLabelsRequest {
    /**
     * Constructs a new <code>GenerateMassOrderLabelsRequest</code>.
     * Данные, необходимые для генерации файла. 
     * @alias module:model/GenerateMassOrderLabelsRequest
     * @param businessId {Number} Идентификатор кабинета.
     * @param orderIds {Array.<Number>} Список идентификаторов заказов.
     */
    constructor(businessId, orderIds) { 
        
        GenerateMassOrderLabelsRequest.initialize(this, businessId, orderIds);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, businessId, orderIds) { 
        obj['businessId'] = businessId;
        obj['orderIds'] = orderIds;
    }

    /**
     * Constructs a <code>GenerateMassOrderLabelsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GenerateMassOrderLabelsRequest} obj Optional instance to populate.
     * @return {module:model/GenerateMassOrderLabelsRequest} The populated <code>GenerateMassOrderLabelsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GenerateMassOrderLabelsRequest();

            if (data.hasOwnProperty('businessId')) {
                obj['businessId'] = ApiClient.convertToType(data['businessId'], 'Number');
            }
            if (data.hasOwnProperty('orderIds')) {
                obj['orderIds'] = ApiClient.convertToType(data['orderIds'], ['Number']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GenerateMassOrderLabelsRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GenerateMassOrderLabelsRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GenerateMassOrderLabelsRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is an array
        if (!Array.isArray(data['orderIds'])) {
            throw new Error("Expected the field `orderIds` to be an array in the JSON data but got " + data['orderIds']);
        }

        return true;
    }


}

GenerateMassOrderLabelsRequest.RequiredProperties = ["businessId", "orderIds"];

/**
 * Идентификатор кабинета.
 * @member {Number} businessId
 */
GenerateMassOrderLabelsRequest.prototype['businessId'] = undefined;

/**
 * Список идентификаторов заказов.
 * @member {Array.<Number>} orderIds
 */
GenerateMassOrderLabelsRequest.prototype['orderIds'] = undefined;






export default GenerateMassOrderLabelsRequest;

