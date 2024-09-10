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
import ForwardScrollingPagerDTO from './ForwardScrollingPagerDTO';
import ShipmentInfoDTO from './ShipmentInfoDTO';

/**
 * The SearchShipmentsResponseDTO model module.
 * @module model/SearchShipmentsResponseDTO
 * @version LATEST
 */
class SearchShipmentsResponseDTO {
    /**
     * @member {Array.<module:model/ShipmentInfoDTO>} shipments
     * @type {Array.<module:model/ShipmentInfoDTO>}
     */
    shipments;
    /**
     * @member {module:model/ForwardScrollingPagerDTO} paging
     * @type {module:model/ForwardScrollingPagerDTO}
     */
    paging;

    

    /**
     * Constructs a new <code>SearchShipmentsResponseDTO</code>.
     * Информация об отгрузках.
     * @alias module:model/SearchShipmentsResponseDTO
     * @param shipments {Array.<module:model/ShipmentInfoDTO>} Список с информацией об отгрузках.
     */
    constructor(shipments) { 
        
        SearchShipmentsResponseDTO.initialize(this, shipments);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, shipments) { 
        obj['shipments'] = shipments;
    }

    /**
     * Constructs a <code>SearchShipmentsResponseDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SearchShipmentsResponseDTO} obj Optional instance to populate.
     * @return {module:model/SearchShipmentsResponseDTO} The populated <code>SearchShipmentsResponseDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SearchShipmentsResponseDTO();

            if (data.hasOwnProperty('shipments')) {
                obj['shipments'] = ApiClient.convertToType(data['shipments'], [ShipmentInfoDTO]);
            }
            if (data.hasOwnProperty('paging')) {
                obj['paging'] = ForwardScrollingPagerDTO.constructFromObject(data['paging']);
            }
        }
        return obj;
    }
}



export default SearchShipmentsResponseDTO;

