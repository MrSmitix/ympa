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
    OrderDocumentStatusType,
} from './';

/**
 * Информация о документе.
 * @export
 * @interface DocumentDTO
 */
export interface DocumentDTO {
    /**
     * @type {OrderDocumentStatusType}
     * @memberof DocumentDTO
     */
    status?: OrderDocumentStatusType;
    /**
     * Номер документа.
     * @type {string}
     * @memberof DocumentDTO
     */
    number?: string;
    /**
     * Дата создания документа.
     * @type {string}
     * @memberof DocumentDTO
     */
    date?: string;
}


