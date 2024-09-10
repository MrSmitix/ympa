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
import DayOfWeekType from './DayOfWeekType';
import MappingsOfferInfoDTO from './MappingsOfferInfoDTO';
import OfferAvailabilityStatusType from './OfferAvailabilityStatusType';
import OfferProcessingStateDTO from './OfferProcessingStateDTO';
import OfferWeightDimensionsDTO from './OfferWeightDimensionsDTO';
import TimePeriodDTO from './TimePeriodDTO';

/**
 * The MappingsOfferDTO model module.
 * @module model/MappingsOfferDTO
 * @version LATEST
 */
class MappingsOfferDTO {
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {String} shopSku
     * @type {String}
     */
    shopSku;
    /**
     * @member {String} category
     * @type {String}
     */
    category;
    /**
     * @member {String} vendor
     * @type {String}
     */
    vendor;
    /**
     * @member {String} vendorCode
     * @type {String}
     */
    vendorCode;
    /**
     * @member {String} description
     * @type {String}
     */
    description;
    /**
     * @member {String} id
     * @type {String}
     */
    id;
    /**
     * @member {Number} feedId
     * @type {Number}
     */
    feedId;
    /**
     * @member {Array.<String>} barcodes
     * @type {Array.<String>}
     */
    barcodes;
    /**
     * @member {Array.<String>} urls
     * @type {Array.<String>}
     */
    urls;
    /**
     * @member {Array.<String>} pictures
     * @type {Array.<String>}
     */
    pictures;
    /**
     * @member {String} manufacturer
     * @type {String}
     */
    manufacturer;
    /**
     * @member {Array.<String>} manufacturerCountries
     * @type {Array.<String>}
     */
    manufacturerCountries;
    /**
     * @member {Number} minShipment
     * @type {Number}
     */
    minShipment;
    /**
     * @member {Number} transportUnitSize
     * @type {Number}
     */
    transportUnitSize;
    /**
     * @member {Number} quantumOfSupply
     * @type {Number}
     */
    quantumOfSupply;
    /**
     * @member {Number} deliveryDurationDays
     * @type {Number}
     */
    deliveryDurationDays;
    /**
     * @member {Number} boxCount
     * @type {Number}
     */
    boxCount;
    /**
     * @member {Array.<String>} customsCommodityCodes
     * @type {Array.<String>}
     */
    customsCommodityCodes;
    /**
     * @member {module:model/OfferWeightDimensionsDTO} weightDimensions
     * @type {module:model/OfferWeightDimensionsDTO}
     */
    weightDimensions;
    /**
     * @member {Array.<module:model/DayOfWeekType>} supplyScheduleDays
     * @type {Array.<module:model/DayOfWeekType>}
     */
    supplyScheduleDays;
    /**
     * @member {Number} shelfLifeDays
     * @type {Number}
     */
    shelfLifeDays;
    /**
     * @member {Number} lifeTimeDays
     * @type {Number}
     */
    lifeTimeDays;
    /**
     * @member {Number} guaranteePeriodDays
     * @type {Number}
     */
    guaranteePeriodDays;
    /**
     * @member {module:model/OfferProcessingStateDTO} processingState
     * @type {module:model/OfferProcessingStateDTO}
     */
    processingState;
    /**
     * @member {module:model/OfferAvailabilityStatusType} availability
     * @type {module:model/OfferAvailabilityStatusType}
     */
    availability;
    /**
     * @member {module:model/TimePeriodDTO} shelfLife
     * @type {module:model/TimePeriodDTO}
     */
    shelfLife;
    /**
     * @member {module:model/TimePeriodDTO} lifeTime
     * @type {module:model/TimePeriodDTO}
     */
    lifeTime;
    /**
     * @member {module:model/TimePeriodDTO} guaranteePeriod
     * @type {module:model/TimePeriodDTO}
     */
    guaranteePeriod;
    /**
     * @member {String} certificate
     * @type {String}
     */
    certificate;
    /**
     * @member {Number} price
     * @type {Number}
     */
    price;

    /**
     * @member {String} name
     * @type {String}
     */
    #name;
    /**
     * @member {String} shopSku
     * @type {String}
     */
    #shopSku;
    /**
     * @member {String} category
     * @type {String}
     */
    #category;
    /**
     * @member {String} vendor
     * @type {String}
     */
    #vendor;
    /**
     * @member {String} vendorCode
     * @type {String}
     */
    #vendorCode;
    /**
     * @member {String} description
     * @type {String}
     */
    #description;
    /**
     * @member {String} id
     * @type {String}
     */
    #id;
    /**
     * @member {Number} feedId
     * @type {Number}
     */
    #feedId;
    /**
     * @member {Array.<String>} barcodes
     * @type {Array.<String>}
     */
    #barcodes;
    /**
     * @member {Array.<String>} urls
     * @type {Array.<String>}
     */
    #urls;
    /**
     * @member {Array.<String>} pictures
     * @type {Array.<String>}
     */
    #pictures;
    /**
     * @member {String} manufacturer
     * @type {String}
     */
    #manufacturer;
    /**
     * @member {Array.<String>} manufacturerCountries
     * @type {Array.<String>}
     */
    #manufacturerCountries;
    /**
     * @member {Number} minShipment
     * @type {Number}
     */
    #minShipment;
    /**
     * @member {Number} transportUnitSize
     * @type {Number}
     */
    #transportUnitSize;
    /**
     * @member {Number} quantumOfSupply
     * @type {Number}
     */
    #quantumOfSupply;
    /**
     * @member {Number} deliveryDurationDays
     * @type {Number}
     */
    #deliveryDurationDays;
    /**
     * @member {Number} boxCount
     * @type {Number}
     */
    #boxCount;
    /**
     * @member {Array.<String>} customsCommodityCodes
     * @type {Array.<String>}
     */
    #customsCommodityCodes;
    /**
     * @member {module:model/OfferWeightDimensionsDTO} weightDimensions
     * @type {module:model/OfferWeightDimensionsDTO}
     */
    #weightDimensions;
    /**
     * @member {Array.<module:model/DayOfWeekType>} supplyScheduleDays
     * @type {Array.<module:model/DayOfWeekType>}
     */
    #supplyScheduleDays;
    /**
     * @member {Number} shelfLifeDays
     * @type {Number}
     */
    #shelfLifeDays;
    /**
     * @member {Number} lifeTimeDays
     * @type {Number}
     */
    #lifeTimeDays;
    /**
     * @member {Number} guaranteePeriodDays
     * @type {Number}
     */
    #guaranteePeriodDays;
    /**
     * @member {module:model/OfferProcessingStateDTO} processingState
     * @type {module:model/OfferProcessingStateDTO}
     */
    #processingState;
    /**
     * @member {module:model/OfferAvailabilityStatusType} availability
     * @type {module:model/OfferAvailabilityStatusType}
     */
    #availability;
    /**
     * @member {module:model/TimePeriodDTO} shelfLife
     * @type {module:model/TimePeriodDTO}
     */
    #shelfLife;
    /**
     * @member {module:model/TimePeriodDTO} lifeTime
     * @type {module:model/TimePeriodDTO}
     */
    #lifeTime;
    /**
     * @member {module:model/TimePeriodDTO} guaranteePeriod
     * @type {module:model/TimePeriodDTO}
     */
    #guaranteePeriod;
    /**
     * @member {String} certificate
     * @type {String}
     */
    #certificate;
    

    /**
     * Constructs a new <code>MappingsOfferDTO</code>.
     * Информация о товарах в каталоге.
     * @alias module:model/MappingsOfferDTO
     * @implements module:model/MappingsOfferInfoDTO
     */
    constructor() { 
        MappingsOfferInfoDTO.initialize(this);
        MappingsOfferDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MappingsOfferDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MappingsOfferDTO} obj Optional instance to populate.
     * @return {module:model/MappingsOfferDTO} The populated <code>MappingsOfferDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MappingsOfferDTO();
            MappingsOfferInfoDTO.constructFromObject(data, obj);

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('shopSku')) {
                obj['shopSku'] = ApiClient.convertToType(data['shopSku'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('vendor')) {
                obj['vendor'] = ApiClient.convertToType(data['vendor'], 'String');
            }
            if (data.hasOwnProperty('vendorCode')) {
                obj['vendorCode'] = ApiClient.convertToType(data['vendorCode'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('feedId')) {
                obj['feedId'] = ApiClient.convertToType(data['feedId'], 'Number');
            }
            if (data.hasOwnProperty('barcodes')) {
                obj['barcodes'] = ApiClient.convertToType(data['barcodes'], ['String']);
            }
            if (data.hasOwnProperty('urls')) {
                obj['urls'] = ApiClient.convertToType(data['urls'], ['String']);
            }
            if (data.hasOwnProperty('pictures')) {
                obj['pictures'] = ApiClient.convertToType(data['pictures'], ['String']);
            }
            if (data.hasOwnProperty('manufacturer')) {
                obj['manufacturer'] = ApiClient.convertToType(data['manufacturer'], 'String');
            }
            if (data.hasOwnProperty('manufacturerCountries')) {
                obj['manufacturerCountries'] = ApiClient.convertToType(data['manufacturerCountries'], ['String']);
            }
            if (data.hasOwnProperty('minShipment')) {
                obj['minShipment'] = ApiClient.convertToType(data['minShipment'], 'Number');
            }
            if (data.hasOwnProperty('transportUnitSize')) {
                obj['transportUnitSize'] = ApiClient.convertToType(data['transportUnitSize'], 'Number');
            }
            if (data.hasOwnProperty('quantumOfSupply')) {
                obj['quantumOfSupply'] = ApiClient.convertToType(data['quantumOfSupply'], 'Number');
            }
            if (data.hasOwnProperty('deliveryDurationDays')) {
                obj['deliveryDurationDays'] = ApiClient.convertToType(data['deliveryDurationDays'], 'Number');
            }
            if (data.hasOwnProperty('boxCount')) {
                obj['boxCount'] = ApiClient.convertToType(data['boxCount'], 'Number');
            }
            if (data.hasOwnProperty('customsCommodityCodes')) {
                obj['customsCommodityCodes'] = ApiClient.convertToType(data['customsCommodityCodes'], ['String']);
            }
            if (data.hasOwnProperty('weightDimensions')) {
                obj['weightDimensions'] = OfferWeightDimensionsDTO.constructFromObject(data['weightDimensions']);
            }
            if (data.hasOwnProperty('supplyScheduleDays')) {
                obj['supplyScheduleDays'] = ApiClient.convertToType(data['supplyScheduleDays'], [DayOfWeekType]);
            }
            if (data.hasOwnProperty('shelfLifeDays')) {
                obj['shelfLifeDays'] = ApiClient.convertToType(data['shelfLifeDays'], 'Number');
            }
            if (data.hasOwnProperty('lifeTimeDays')) {
                obj['lifeTimeDays'] = ApiClient.convertToType(data['lifeTimeDays'], 'Number');
            }
            if (data.hasOwnProperty('guaranteePeriodDays')) {
                obj['guaranteePeriodDays'] = ApiClient.convertToType(data['guaranteePeriodDays'], 'Number');
            }
            if (data.hasOwnProperty('processingState')) {
                obj['processingState'] = OfferProcessingStateDTO.constructFromObject(data['processingState']);
            }
            if (data.hasOwnProperty('availability')) {
                obj['availability'] = OfferAvailabilityStatusType.constructFromObject(data['availability']);
            }
            if (data.hasOwnProperty('shelfLife')) {
                obj['shelfLife'] = TimePeriodDTO.constructFromObject(data['shelfLife']);
            }
            if (data.hasOwnProperty('lifeTime')) {
                obj['lifeTime'] = TimePeriodDTO.constructFromObject(data['lifeTime']);
            }
            if (data.hasOwnProperty('guaranteePeriod')) {
                obj['guaranteePeriod'] = TimePeriodDTO.constructFromObject(data['guaranteePeriod']);
            }
            if (data.hasOwnProperty('certificate')) {
                obj['certificate'] = ApiClient.convertToType(data['certificate'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
        }
        return obj;
    }
}



export default MappingsOfferDTO;

