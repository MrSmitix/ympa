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
    ReturnInstanceStatusType,
    ReturnInstanceStockType,
} from './';

/**
 * Логистическая информация по возврату.
 * @export
 * @interface ReturnInstanceDTO
 */
export interface ReturnInstanceDTO {
    /**
     * @type {ReturnInstanceStockType}
     * @memberof ReturnInstanceDTO
     */
    stockType?: ReturnInstanceStockType;
    /**
     * @type {ReturnInstanceStatusType}
     * @memberof ReturnInstanceDTO
     */
    status?: ReturnInstanceStatusType;
    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
     * @type {string}
     * @memberof ReturnInstanceDTO
     */
    cis?: string;
    /**
     * Международный идентификатор мобильного оборудования.
     * @type {string}
     * @memberof ReturnInstanceDTO
     */
    imei?: string;
}


