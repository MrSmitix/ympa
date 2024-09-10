// tslint:disable
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
 */

import type {
    ForwardScrollingPagerDTO,
    ShipmentInfoDTO,
} from './';

/**
 * Информация об отгрузках.
 * @export
 * @interface SearchShipmentsResponseDTO
 */
export interface SearchShipmentsResponseDTO {
    /**
     * Список с информацией об отгрузках.
     * @type {Array<ShipmentInfoDTO>}
     * @memberof SearchShipmentsResponseDTO
     */
    shipments: Array<ShipmentInfoDTO>;
    /**
     * @type {ForwardScrollingPagerDTO}
     * @memberof SearchShipmentsResponseDTO
     */
    paging?: ForwardScrollingPagerDTO;
}
