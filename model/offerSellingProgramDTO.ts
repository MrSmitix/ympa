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
import { SellingProgramType } from './sellingProgramType';
import { OfferSellingProgramStatusType } from './offerSellingProgramStatusType';


/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 */
export interface OfferSellingProgramDTO { 
    sellingProgram: SellingProgramType;
    status: OfferSellingProgramStatusType;
}
export namespace OfferSellingProgramDTO {
}

