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

/**
 * Частота выплат:  * `DAILY` — ежедневно. * `WEEKLY` — раз в неделю. * `BIWEEKLY` — раз в две недели. * `MONTHLY` — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
 * @export
 * @enum {string}
 */
export enum PaymentFrequencyType {
    Daily = 'DAILY',
    Weekly = 'WEEKLY',
    Biweekly = 'BIWEEKLY',
    Monthly = 'MONTHLY'
}

export function PaymentFrequencyTypeFromJSON(json: any): PaymentFrequencyType {
    return json as PaymentFrequencyType;
}

export function PaymentFrequencyTypeToJSON(value?: PaymentFrequencyType): any {
    return value as any;
}

