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
import OutletAddressDTO from './OutletAddressDTO';
import OutletDTO from './OutletDTO';
import OutletDeliveryRuleDTO from './OutletDeliveryRuleDTO';
import OutletStatusType from './OutletStatusType';
import OutletType from './OutletType';
import OutletVisibilityType from './OutletVisibilityType';
import OutletWorkingScheduleDTO from './OutletWorkingScheduleDTO';
import RegionDTO from './RegionDTO';

/**
 * The FullOutletDTO model module.
 * @module model/FullOutletDTO
 * @version LATEST
 */
class FullOutletDTO {
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {module:model/OutletType} type
     * @type {module:model/OutletType}
     */
    type;
    /**
     * @member {String} coords
     * @type {String}
     */
    coords;
    /**
     * @member {Boolean} isMain
     * @type {Boolean}
     */
    isMain;
    /**
     * @member {String} shopOutletCode
     * @type {String}
     */
    shopOutletCode;
    /**
     * @member {module:model/OutletVisibilityType} visibility
     * @type {module:model/OutletVisibilityType}
     */
    visibility;
    /**
     * @member {module:model/OutletAddressDTO} address
     * @type {module:model/OutletAddressDTO}
     */
    address;
    /**
     * @member {Array.<String>} phones
     * @type {Array.<String>}
     */
    phones;
    /**
     * @member {module:model/OutletWorkingScheduleDTO} workingSchedule
     * @type {module:model/OutletWorkingScheduleDTO}
     */
    workingSchedule;
    /**
     * @member {Array.<module:model/OutletDeliveryRuleDTO>} deliveryRules
     * @type {Array.<module:model/OutletDeliveryRuleDTO>}
     */
    deliveryRules;
    /**
     * @member {Number} storagePeriod
     * @type {Number}
     */
    storagePeriod;
    /**
     * @member {Number} id
     * @type {Number}
     */
    id;
    /**
     * @member {module:model/OutletStatusType} status
     * @type {module:model/OutletStatusType}
     */
    status;
    /**
     * @member {module:model/RegionDTO} region
     * @type {module:model/RegionDTO}
     */
    region;
    /**
     * @member {String} shopOutletId
     * @type {String}
     */
    shopOutletId;
    /**
     * @member {String} workingTime
     * @type {String}
     */
    workingTime;
    /**
     * @member {String} moderationReason
     * @type {String}
     */
    moderationReason;

    /**
     * @member {String} name
     * @type {String}
     */
    #name;
    /**
     * @member {module:model/OutletType} type
     * @type {module:model/OutletType}
     */
    #type;
    /**
     * @member {String} coords
     * @type {String}
     */
    #coords;
    /**
     * @member {Boolean} isMain
     * @type {Boolean}
     */
    #isMain;
    /**
     * @member {String} shopOutletCode
     * @type {String}
     */
    #shopOutletCode;
    /**
     * @member {module:model/OutletVisibilityType} visibility
     * @type {module:model/OutletVisibilityType}
     */
    #visibility;
    /**
     * @member {module:model/OutletAddressDTO} address
     * @type {module:model/OutletAddressDTO}
     */
    #address;
    /**
     * @member {Array.<String>} phones
     * @type {Array.<String>}
     */
    #phones;
    /**
     * @member {module:model/OutletWorkingScheduleDTO} workingSchedule
     * @type {module:model/OutletWorkingScheduleDTO}
     */
    #workingSchedule;
    /**
     * @member {Array.<module:model/OutletDeliveryRuleDTO>} deliveryRules
     * @type {Array.<module:model/OutletDeliveryRuleDTO>}
     */
    #deliveryRules;
    /**
     * @member {Number} storagePeriod
     * @type {Number}
     */
    #storagePeriod;
    

    /**
     * Constructs a new <code>FullOutletDTO</code>.
     * Информация о точке продаж.
     * @alias module:model/FullOutletDTO
     * @implements module:model/OutletDTO
     * @param name {String} Название точки продаж. 
     * @param type {module:model/OutletType} 
     * @param address {module:model/OutletAddressDTO} 
     * @param phones {Array.<String>} Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
     * @param workingSchedule {module:model/OutletWorkingScheduleDTO} 
     */
    constructor(name, type, address, phones, workingSchedule) { 
        OutletDTO.initialize(this, name, type, address, phones, workingSchedule);
        FullOutletDTO.initialize(this, name, type, address, phones, workingSchedule);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, type, address, phones, workingSchedule) { 
        obj['name'] = name;
        obj['type'] = type;
        obj['address'] = address;
        obj['phones'] = phones;
        obj['workingSchedule'] = workingSchedule;
    }

    /**
     * Constructs a <code>FullOutletDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FullOutletDTO} obj Optional instance to populate.
     * @return {module:model/FullOutletDTO} The populated <code>FullOutletDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FullOutletDTO();
            OutletDTO.constructFromObject(data, obj);

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = OutletType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('coords')) {
                obj['coords'] = ApiClient.convertToType(data['coords'], 'String');
            }
            if (data.hasOwnProperty('isMain')) {
                obj['isMain'] = ApiClient.convertToType(data['isMain'], 'Boolean');
            }
            if (data.hasOwnProperty('shopOutletCode')) {
                obj['shopOutletCode'] = ApiClient.convertToType(data['shopOutletCode'], 'String');
            }
            if (data.hasOwnProperty('visibility')) {
                obj['visibility'] = OutletVisibilityType.constructFromObject(data['visibility']);
            }
            if (data.hasOwnProperty('address')) {
                obj['address'] = OutletAddressDTO.constructFromObject(data['address']);
            }
            if (data.hasOwnProperty('phones')) {
                obj['phones'] = ApiClient.convertToType(data['phones'], ['String']);
            }
            if (data.hasOwnProperty('workingSchedule')) {
                obj['workingSchedule'] = OutletWorkingScheduleDTO.constructFromObject(data['workingSchedule']);
            }
            if (data.hasOwnProperty('deliveryRules')) {
                obj['deliveryRules'] = ApiClient.convertToType(data['deliveryRules'], [OutletDeliveryRuleDTO]);
            }
            if (data.hasOwnProperty('storagePeriod')) {
                obj['storagePeriod'] = ApiClient.convertToType(data['storagePeriod'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = OutletStatusType.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('region')) {
                obj['region'] = RegionDTO.constructFromObject(data['region']);
            }
            if (data.hasOwnProperty('shopOutletId')) {
                obj['shopOutletId'] = ApiClient.convertToType(data['shopOutletId'], 'String');
            }
            if (data.hasOwnProperty('workingTime')) {
                obj['workingTime'] = ApiClient.convertToType(data['workingTime'], 'String');
            }
            if (data.hasOwnProperty('moderationReason')) {
                obj['moderationReason'] = ApiClient.convertToType(data['moderationReason'], 'String');
            }
        }
        return obj;
    }
}



export default FullOutletDTO;

