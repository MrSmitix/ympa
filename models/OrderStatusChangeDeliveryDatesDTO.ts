/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * Диапазон дат доставки.
 * @export
 * @interface OrderStatusChangeDeliveryDatesDTO
 */
export interface OrderStatusChangeDeliveryDatesDTO {
    /**
     * **Только для модели DBS**
     * 
     * Фактическая дата доставки.
     * <br><br>
     * Когда передавать параметр `realDeliveryDate`:
     * 
     * * Не передавайте параметр, если:
     *   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;
     *   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса.
     * * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.
     * 
     *   {% note warning "Индекс качества" %}
     * 
     *   Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).
     * 
     *   {% endnote %}
     * 
     *    
     * 
     * @type {Date}
     * @memberof OrderStatusChangeDeliveryDatesDTO
     */
    realDeliveryDate?: Date;
}

/**
 * Check if a given object implements the OrderStatusChangeDeliveryDatesDTO interface.
 */
export function instanceOfOrderStatusChangeDeliveryDatesDTO(value: object): value is OrderStatusChangeDeliveryDatesDTO {
    return true;
}

export function OrderStatusChangeDeliveryDatesDTOFromJSON(json: any): OrderStatusChangeDeliveryDatesDTO {
    return OrderStatusChangeDeliveryDatesDTOFromJSONTyped(json, false);
}

export function OrderStatusChangeDeliveryDatesDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderStatusChangeDeliveryDatesDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'realDeliveryDate': json['realDeliveryDate'] == null ? undefined : (new Date(json['realDeliveryDate'])),
    };
}

export function OrderStatusChangeDeliveryDatesDTOToJSON(value?: OrderStatusChangeDeliveryDatesDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'realDeliveryDate': value['realDeliveryDate'] == null ? undefined : ((value['realDeliveryDate']).toISOString().substring(0,10)),
    };
}

