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
 * The GenerateBoostConsolidatedRequest model module.
 * @module model/GenerateBoostConsolidatedRequest
 * @version LATEST
 */
class GenerateBoostConsolidatedRequest {
    /**
     * @member {Number} businessId
     * @type {Number}
     */
    businessId;
    /**
     * @member {Date} dateFrom
     * @type {Date}
     */
    dateFrom;
    /**
     * @member {Date} dateTo
     * @type {Date}
     */
    dateTo;

    

    /**
     * Constructs a new <code>GenerateBoostConsolidatedRequest</code>.
     * Данные, необходимые для генерации отчета. 
     * @alias module:model/GenerateBoostConsolidatedRequest
     * @param businessId {Number} Идентификатор бизнеса.
     * @param dateFrom {Date} Начало периода, включительно.
     * @param dateTo {Date} Конец периода, включительно.
     */
    constructor(businessId, dateFrom, dateTo) { 
        
        GenerateBoostConsolidatedRequest.initialize(this, businessId, dateFrom, dateTo);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, businessId, dateFrom, dateTo) { 
        obj['businessId'] = businessId;
        obj['dateFrom'] = dateFrom;
        obj['dateTo'] = dateTo;
    }

    /**
     * Constructs a <code>GenerateBoostConsolidatedRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GenerateBoostConsolidatedRequest} obj Optional instance to populate.
     * @return {module:model/GenerateBoostConsolidatedRequest} The populated <code>GenerateBoostConsolidatedRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GenerateBoostConsolidatedRequest();

            if (data.hasOwnProperty('businessId')) {
                obj['businessId'] = ApiClient.convertToType(data['businessId'], 'Number');
            }
            if (data.hasOwnProperty('dateFrom')) {
                obj['dateFrom'] = ApiClient.convertToType(data['dateFrom'], 'Date');
            }
            if (data.hasOwnProperty('dateTo')) {
                obj['dateTo'] = ApiClient.convertToType(data['dateTo'], 'Date');
            }
        }
        return obj;
    }
}



export default GenerateBoostConsolidatedRequest;

