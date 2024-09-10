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
 * Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
 * @export
 * @enum {string}
 */
export enum OfferConditionType {
    Preowned = 'PREOWNED',
    Showcasesample = 'SHOWCASESAMPLE',
    Refurbished = 'REFURBISHED',
    Reduction = 'REDUCTION',
    Renovated = 'RENOVATED',
    NotSpecified = 'NOT_SPECIFIED'
}

export function OfferConditionTypeFromJSON(json: any): OfferConditionType {
    return json as OfferConditionType;
}

export function OfferConditionTypeToJSON(value?: OfferConditionType): any {
    return value as any;
}

