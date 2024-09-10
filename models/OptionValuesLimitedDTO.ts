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
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 * @export
 * @interface OptionValuesLimitedDTO
 */
export interface OptionValuesLimitedDTO {
    /**
     * Идентификатор значения ограничивающей характеристики.
     * @type {number}
     * @memberof OptionValuesLimitedDTO
     */
    limitingOptionValueId: number;
    /**
     * Идентификаторы допустимых значений ограничиваемой характеристики. 
     * @type {Array<number>}
     * @memberof OptionValuesLimitedDTO
     */
    optionValueIds: Array<number>;
}
