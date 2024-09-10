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
import { CurrencyType } from './currencyType';


/**
 * Цена с указанием времени последнего обновления.
 */
export interface GetPriceDTO { 
    /**
     * Значение.
     */
    value: number;
    currencyId: CurrencyType;
    /**
     * Время последнего обновления.
     */
    updatedAt: string;
}
export namespace GetPriceDTO {
}
