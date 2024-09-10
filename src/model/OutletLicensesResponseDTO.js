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
import FullOutletLicenseDTO from './FullOutletLicenseDTO';

/**
 * The OutletLicensesResponseDTO model module.
 * @module model/OutletLicensesResponseDTO
 * @version LATEST
 */
class OutletLicensesResponseDTO {
    /**
     * @member {Array.<module:model/FullOutletLicenseDTO>} licenses
     * @type {Array.<module:model/FullOutletLicenseDTO>}
     */
    licenses;

    

    /**
     * Constructs a new <code>OutletLicensesResponseDTO</code>.
     * Ответ на запрос информации о лицензиях для точек продаж.
     * @alias module:model/OutletLicensesResponseDTO
     * @param licenses {Array.<module:model/FullOutletLicenseDTO>} Список лицензий.
     */
    constructor(licenses) { 
        
        OutletLicensesResponseDTO.initialize(this, licenses);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, licenses) { 
        obj['licenses'] = licenses;
    }

    /**
     * Constructs a <code>OutletLicensesResponseDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OutletLicensesResponseDTO} obj Optional instance to populate.
     * @return {module:model/OutletLicensesResponseDTO} The populated <code>OutletLicensesResponseDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OutletLicensesResponseDTO();

            if (data.hasOwnProperty('licenses')) {
                obj['licenses'] = ApiClient.convertToType(data['licenses'], [FullOutletLicenseDTO]);
            }
        }
        return obj;
    }
}



export default OutletLicensesResponseDTO;

