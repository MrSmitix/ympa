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
import OrderDocumentStatusType from './OrderDocumentStatusType';

/**
 * The DocumentDTO model module.
 * @module model/DocumentDTO
 * @version LATEST
 */
class DocumentDTO {
    /**
     * @member {module:model/OrderDocumentStatusType} status
     * @type {module:model/OrderDocumentStatusType}
     */
    status;
    /**
     * @member {String} number
     * @type {String}
     */
    number;
    /**
     * @member {Date} date
     * @type {Date}
     */
    date;

    

    /**
     * Constructs a new <code>DocumentDTO</code>.
     * Информация о документе.
     * @alias module:model/DocumentDTO
     */
    constructor() { 
        
        DocumentDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DocumentDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DocumentDTO} obj Optional instance to populate.
     * @return {module:model/DocumentDTO} The populated <code>DocumentDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DocumentDTO();

            if (data.hasOwnProperty('status')) {
                obj['status'] = OrderDocumentStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
        }
        return obj;
    }
}



export default DocumentDTO;

