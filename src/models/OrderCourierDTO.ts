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

import { exists, mapValues } from '../runtime';
/**
 * Информация о курьере.
 * @export
 * @interface OrderCourierDTO
 */
export interface OrderCourierDTO  {
    /**
     * Полное имя курьера.
     * @type {string}
     * @memberof OrderCourierDTO
     */
    fullName?: string;
    /**
     * Номер телефона курьера.
     * @type {string}
     * @memberof OrderCourierDTO
     */
    phone?: string;
    /**
     * Добавочный номер телефона.
     * @type {string}
     * @memberof OrderCourierDTO
     */
    phoneExtension?: string;
    /**
     * Номер транспортного средства.
     * @type {string}
     * @memberof OrderCourierDTO
     */
    vehicleNumber?: string;
    /**
     * Описание машины. Например, модель и цвет.
     * @type {string}
     * @memberof OrderCourierDTO
     */
    vehicleDescription?: string;
}

export function OrderCourierDTOFromJSON(json: any): OrderCourierDTO {
    return {
        'fullName': !exists(json, 'fullName') ? undefined : json['fullName'],
        'phone': !exists(json, 'phone') ? undefined : json['phone'],
        'phoneExtension': !exists(json, 'phoneExtension') ? undefined : json['phoneExtension'],
        'vehicleNumber': !exists(json, 'vehicleNumber') ? undefined : json['vehicleNumber'],
        'vehicleDescription': !exists(json, 'vehicleDescription') ? undefined : json['vehicleDescription'],
    };
}

export function OrderCourierDTOToJSON(value?: OrderCourierDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'fullName': value.fullName,
        'phone': value.phone,
        'phoneExtension': value.phoneExtension,
        'vehicleNumber': value.vehicleNumber,
        'vehicleDescription': value.vehicleDescription,
    };
}


