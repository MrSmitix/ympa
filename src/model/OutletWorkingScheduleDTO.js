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
 *
 */

import ApiClient from '../ApiClient';
import OutletWorkingScheduleItemDTO from './OutletWorkingScheduleItemDTO';

/**
 * The OutletWorkingScheduleDTO model module.
 * @module model/OutletWorkingScheduleDTO
 * @version LATEST
 */
class OutletWorkingScheduleDTO {
    /**
     * Constructs a new <code>OutletWorkingScheduleDTO</code>.
     * Список режимов работы точки продаж. 
     * @alias module:model/OutletWorkingScheduleDTO
     * @param scheduleItems {Array.<module:model/OutletWorkingScheduleItemDTO>} Список расписаний работы точки продаж. 
     */
    constructor(scheduleItems) { 
        
        OutletWorkingScheduleDTO.initialize(this, scheduleItems);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, scheduleItems) { 
        obj['scheduleItems'] = scheduleItems;
    }

    /**
     * Constructs a <code>OutletWorkingScheduleDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OutletWorkingScheduleDTO} obj Optional instance to populate.
     * @return {module:model/OutletWorkingScheduleDTO} The populated <code>OutletWorkingScheduleDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OutletWorkingScheduleDTO();

            if (data.hasOwnProperty('workInHoliday')) {
                obj['workInHoliday'] = ApiClient.convertToType(data['workInHoliday'], 'Boolean');
            }
            if (data.hasOwnProperty('scheduleItems')) {
                obj['scheduleItems'] = ApiClient.convertToType(data['scheduleItems'], [OutletWorkingScheduleItemDTO]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OutletWorkingScheduleDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OutletWorkingScheduleDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OutletWorkingScheduleDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['scheduleItems']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['scheduleItems'])) {
                throw new Error("Expected the field `scheduleItems` to be an array in the JSON data but got " + data['scheduleItems']);
            }
            // validate the optional field `scheduleItems` (array)
            for (const item of data['scheduleItems']) {
                OutletWorkingScheduleItemDTO.validateJSON(item);
            };
        }

        return true;
    }


}

OutletWorkingScheduleDTO.RequiredProperties = ["scheduleItems"];

/**
 * Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
 * @member {Boolean} workInHoliday
 */
OutletWorkingScheduleDTO.prototype['workInHoliday'] = undefined;

/**
 * Список расписаний работы точки продаж. 
 * @member {Array.<module:model/OutletWorkingScheduleItemDTO>} scheduleItems
 */
OutletWorkingScheduleDTO.prototype['scheduleItems'] = undefined;






export default OutletWorkingScheduleDTO;

