/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { ApiErrorDTO } from './apiErrorDTO';
import { ApiResponseStatusType } from './apiResponseStatusType';


/**
 * В запросе не указаны авторизационные данные.
 */
export interface ApiUnauthorizedErrorResponse { 
    status?: ApiResponseStatusType;
    /**
     * Список ошибок.
     */
    errors?: Array<ApiErrorDTO> | null;
}
export namespace ApiUnauthorizedErrorResponse {
}


