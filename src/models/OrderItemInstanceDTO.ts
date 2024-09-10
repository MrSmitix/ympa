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
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 * @export
 * @interface OrderItemInstanceDTO
 */
export interface OrderItemInstanceDTO  {
    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
     * @type {string}
     * @memberof OrderItemInstanceDTO
     */
    cis?: string;
    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
     * @type {string}
     * @memberof OrderItemInstanceDTO
     */
    cisFull?: string;
    /**
     * УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
     * @type {string}
     * @memberof OrderItemInstanceDTO
     */
    uin?: string;
    /**
     * Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
     * @type {string}
     * @memberof OrderItemInstanceDTO
     */
    rnpt?: string;
    /**
     * Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
     * @type {string}
     * @memberof OrderItemInstanceDTO
     */
    gtd?: string;
}

export function OrderItemInstanceDTOFromJSON(json: any): OrderItemInstanceDTO {
    return {
        'cis': !exists(json, 'cis') ? undefined : json['cis'],
        'cisFull': !exists(json, 'cisFull') ? undefined : json['cisFull'],
        'uin': !exists(json, 'uin') ? undefined : json['uin'],
        'rnpt': !exists(json, 'rnpt') ? undefined : json['rnpt'],
        'gtd': !exists(json, 'gtd') ? undefined : json['gtd'],
    };
}

export function OrderItemInstanceDTOToJSON(value?: OrderItemInstanceDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'cis': value.cis,
        'cisFull': value.cisFull,
        'uin': value.uin,
        'rnpt': value.rnpt,
        'gtd': value.gtd,
    };
}


