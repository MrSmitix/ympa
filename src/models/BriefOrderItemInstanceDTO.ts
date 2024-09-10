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
 * Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
 * @export
 * @interface BriefOrderItemInstanceDTO
 */
export interface BriefOrderItemInstanceDTO  {
    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} 
     * @type {string}
     * @memberof BriefOrderItemInstanceDTO
     */
    cis?: string;
    /**
     * Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
     * @type {string}
     * @memberof BriefOrderItemInstanceDTO
     */
    uin?: string;
    /**
     * Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
     * @type {string}
     * @memberof BriefOrderItemInstanceDTO
     */
    rnpt?: string;
    /**
     * Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
     * @type {string}
     * @memberof BriefOrderItemInstanceDTO
     */
    gtd?: string;
}

export function BriefOrderItemInstanceDTOFromJSON(json: any): BriefOrderItemInstanceDTO {
    return {
        'cis': !exists(json, 'cis') ? undefined : json['cis'],
        'uin': !exists(json, 'uin') ? undefined : json['uin'],
        'rnpt': !exists(json, 'rnpt') ? undefined : json['rnpt'],
        'gtd': !exists(json, 'gtd') ? undefined : json['gtd'],
    };
}

export function BriefOrderItemInstanceDTOToJSON(value?: BriefOrderItemInstanceDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'cis': value.cis,
        'uin': value.uin,
        'rnpt': value.rnpt,
        'gtd': value.gtd,
    };
}


