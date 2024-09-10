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
import { ReportSubStatusType } from './reportSubStatusType';
import { ReportStatusType } from './reportStatusType';


/**
 * Статус генерации и ссылка на готовый отчет.
 */
export interface ReportInfoDTO { 
    status: ReportStatusType;
    subStatus?: ReportSubStatusType;
    /**
     * Дата и время запроса на генерацию.
     */
    generationRequestedAt: string;
    /**
     * Дата и время завершения генерации.
     */
    generationFinishedAt?: string;
    /**
     * Ссылка на готовый отчет.
     */
    file?: string;
    /**
     * Ожидаемая продолжительность генерации в миллисекундах.
     */
    estimatedGenerationTime?: number;
}
export namespace ReportInfoDTO {
}


