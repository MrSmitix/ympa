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
import { TimeUnitType } from './timeUnitType';


/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */
export interface TimePeriodDTO { 
    /**
     * Продолжительность в указанных единицах.
     */
    timePeriod: number;
    timeUnit: TimeUnitType;
    /**
     * Комментарий.
     */
    comment?: string;
}
export namespace TimePeriodDTO {
}


