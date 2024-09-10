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
 * Информация об условиях доставки для данной точки продаж.
 * @export
 * @interface OutletDeliveryRuleDTO
 */
export interface OutletDeliveryRuleDTO {
    /**
     * Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.
     * 
     * Минимальное значение: `0` — доставка в день заказа.
     * 
     * Максимальное значение: `60`.
     * 
     * Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.
     * 
     * Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.
     * 
     * Для доставки в другие регионы:
     * 
     * * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14.
     * * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.
     * 
     * Обязательный параметр, если `type="DEPOT"` или `type="MIXED"`.
     * 
     * Взаимоисключающий с параметром `unspecifiedDeliveryInterval`.
     * 
     * @type {number}
     * @memberof OutletDeliveryRuleDTO
     */
    minDeliveryDays?: number;
    /**
     * Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.
     * 
     * Минимальное значение: `0` — доставка в день заказа.
     * 
     * Максимальное значение: `60`.
     * 
     * Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.
     * 
     * Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.
     * 
     * Для доставки в другие регионы:
     * 
     * * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14.
     * * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.
     * 
     * Обязательный параметр, если `type="DEPOT"` или `type="MIXED"`.
     * 
     * Взаимоисключающий с параметром `unspecifiedDeliveryInterval`.
     * 
     * @type {number}
     * @memberof OutletDeliveryRuleDTO
     */
    maxDeliveryDays?: number;
    /**
     * Идентификатор службы доставки товаров в точку продаж.
     * 
     * Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     * 
     * @type {number}
     * @memberof OutletDeliveryRuleDTO
     */
    deliveryServiceId?: number;
    /**
     * Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от `minDeliveryDays` до `maxDeliveryDays`.
     * 
     * Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от `minDeliveryDays` + 1 рабочий день до `maxDeliveryDays` + 1 рабочий день.
     * 
     * Значение по умолчанию: `24`.
     * 
     * @type {number}
     * @memberof OutletDeliveryRuleDTO
     */
    orderBefore?: number;
    /**
     * Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.
     * @type {number}
     * @memberof OutletDeliveryRuleDTO
     */
    priceFreePickup?: number;
    /**
     * Признак доставки товаров в точку продаж на заказ.
     * 
     * Признак выставлен, если:
     * 
     * * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт);
     * * все товары изготавливаются или поставляются на заказ.
     * 
     * Возможные значения:
     * * `true` — товары доставляются в точку продаж на заказ.
     * 
     * Параметр указывается только со значением `true`.
     * 
     * Взаимоисключающий с параметрами `minDeliveryDays` и `maxDeliveryDays`.
     * 
     * @type {boolean}
     * @memberof OutletDeliveryRuleDTO
     */
    unspecifiedDeliveryInterval?: boolean;
}

/**
 * Check if a given object implements the OutletDeliveryRuleDTO interface.
 */
export function instanceOfOutletDeliveryRuleDTO(value: object): value is OutletDeliveryRuleDTO {
    return true;
}

export function OutletDeliveryRuleDTOFromJSON(json: any): OutletDeliveryRuleDTO {
    return OutletDeliveryRuleDTOFromJSONTyped(json, false);
}

export function OutletDeliveryRuleDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OutletDeliveryRuleDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'minDeliveryDays': json['minDeliveryDays'] == null ? undefined : json['minDeliveryDays'],
        'maxDeliveryDays': json['maxDeliveryDays'] == null ? undefined : json['maxDeliveryDays'],
        'deliveryServiceId': json['deliveryServiceId'] == null ? undefined : json['deliveryServiceId'],
        'orderBefore': json['orderBefore'] == null ? undefined : json['orderBefore'],
        'priceFreePickup': json['priceFreePickup'] == null ? undefined : json['priceFreePickup'],
        'unspecifiedDeliveryInterval': json['unspecifiedDeliveryInterval'] == null ? undefined : json['unspecifiedDeliveryInterval'],
    };
}

export function OutletDeliveryRuleDTOToJSON(value?: OutletDeliveryRuleDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'minDeliveryDays': value['minDeliveryDays'],
        'maxDeliveryDays': value['maxDeliveryDays'],
        'deliveryServiceId': value['deliveryServiceId'],
        'orderBefore': value['orderBefore'],
        'priceFreePickup': value['priceFreePickup'],
        'unspecifiedDeliveryInterval': value['unspecifiedDeliveryInterval'],
    };
}
