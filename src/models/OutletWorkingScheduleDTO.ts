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

import { exists, mapValues } from '../runtime';
import {
    OutletWorkingScheduleItemDTO,
    OutletWorkingScheduleItemDTOFromJSON,
    OutletWorkingScheduleItemDTOToJSON,
} from './';

/**
 * Список режимов работы точки продаж. 
 * @export
 * @interface OutletWorkingScheduleDTO
 */
export interface OutletWorkingScheduleDTO  {
    /**
     * Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
     * @type {boolean}
     * @memberof OutletWorkingScheduleDTO
     */
    workInHoliday?: boolean;
    /**
     * Список расписаний работы точки продаж. 
     * @type {Array<OutletWorkingScheduleItemDTO>}
     * @memberof OutletWorkingScheduleDTO
     */
    scheduleItems: Array<OutletWorkingScheduleItemDTO>;
}

export function OutletWorkingScheduleDTOFromJSON(json: any): OutletWorkingScheduleDTO {
    return {
        'workInHoliday': !exists(json, 'workInHoliday') ? undefined : json['workInHoliday'],
        'scheduleItems': (json['scheduleItems'] as Array<any>).map(OutletWorkingScheduleItemDTOFromJSON),
    };
}

export function OutletWorkingScheduleDTOToJSON(value?: OutletWorkingScheduleDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'workInHoliday': value.workInHoliday,
        'scheduleItems': (value.scheduleItems as Array<any>).map(OutletWorkingScheduleItemDTOToJSON),
    };
}


