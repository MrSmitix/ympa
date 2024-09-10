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
import { ApiResponseStatusType } from './apiResponseStatusType';
import { ReportInfoDTO } from './reportInfoDTO';


/**
 * Ответ на запрос информации об отчете.
 */
export interface GetReportInfoResponse { 
    status?: ApiResponseStatusType;
    result?: ReportInfoDTO;
}
export namespace GetReportInfoResponse {
}

