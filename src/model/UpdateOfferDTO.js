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
import AgeDTO from './AgeDTO';
import BaseOfferDTO from './BaseOfferDTO';
import BasePriceDTO from './BasePriceDTO';
import OfferConditionDTO from './OfferConditionDTO';
import OfferManualDTO from './OfferManualDTO';
import OfferParamDTO from './OfferParamDTO';
import OfferType from './OfferType';
import OfferWeightDimensionsDTO from './OfferWeightDimensionsDTO';
import ParameterValueDTO from './ParameterValueDTO';
import TimePeriodDTO from './TimePeriodDTO';
import UpdatePriceWithDiscountDTO from './UpdatePriceWithDiscountDTO';

/**
 * The UpdateOfferDTO model module.
 * @module model/UpdateOfferDTO
 * @version LATEST
 */
class UpdateOfferDTO {
    /**
     * @member {String} offerId
     * @type {String}
     */
    offerId;
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {Number} marketCategoryId
     * @type {Number}
     */
    marketCategoryId;
    /**
     * @member {String} category
     * @type {String}
     */
    category;
    /**
     * @member {Array.<String>} pictures
     * @type {Array.<String>}
     */
    pictures;
    /**
     * @member {Array.<String>} videos
     * @type {Array.<String>}
     */
    videos;
    /**
     * @member {Array.<module:model/OfferManualDTO>} manuals
     * @type {Array.<module:model/OfferManualDTO>}
     */
    manuals;
    /**
     * @member {String} vendor
     * @type {String}
     */
    vendor;
    /**
     * @member {Array.<String>} barcodes
     * @type {Array.<String>}
     */
    barcodes;
    /**
     * @member {String} description
     * @type {String}
     */
    description;
    /**
     * @member {Array.<String>} manufacturerCountries
     * @type {Array.<String>}
     */
    manufacturerCountries;
    /**
     * @member {module:model/OfferWeightDimensionsDTO} weightDimensions
     * @type {module:model/OfferWeightDimensionsDTO}
     */
    weightDimensions;
    /**
     * @member {String} vendorCode
     * @type {String}
     */
    vendorCode;
    /**
     * @member {Array.<String>} tags
     * @type {Array.<String>}
     */
    tags;
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
     * @member {String} customsCommodityCode
     * @type {String}
     */
    customsCommodityCode;
    /**
     * @member {Array.<String>} certificates
     * @type {Array.<String>}
     */
    certificates;
    /**
     * @member {Number} boxCount
     * @type {Number}
     */
    boxCount;
    /**
     * @member {module:model/OfferConditionDTO} condition
     * @type {module:model/OfferConditionDTO}
     */
    condition;
    /**
     * @member {module:model/OfferType} type
     * @type {module:model/OfferType}
     */
    type;
    /**
     * @member {Boolean} downloadable
     * @type {Boolean}
     */
    downloadable;
    /**
     * @member {Boolean} adult
     * @type {Boolean}
     */
    adult;
    /**
     * @member {module:model/AgeDTO} age
     * @type {module:model/AgeDTO}
     */
    age;
    /**
     * @member {Array.<module:model/OfferParamDTO>} params
     * @type {Array.<module:model/OfferParamDTO>}
     */
    params;
    /**
     * @member {Array.<module:model/ParameterValueDTO>} parameterValues
     * @type {Array.<module:model/ParameterValueDTO>}
     */
    parameterValues;
    /**
     * @member {module:model/UpdatePriceWithDiscountDTO} basicPrice
     * @type {module:model/UpdatePriceWithDiscountDTO}
     */
    basicPrice;
    /**
     * @member {module:model/BasePriceDTO} purchasePrice
     * @type {module:model/BasePriceDTO}
     */
    purchasePrice;
    /**
     * @member {module:model/BasePriceDTO} additionalExpenses
     * @type {module:model/BasePriceDTO}
     */
    additionalExpenses;
    /**
     * @member {module:model/BasePriceDTO} cofinancePrice
     * @type {module:model/BasePriceDTO}
     */
    cofinancePrice;

    /**
     * @member {String} offerId
     * @type {String}
     */
    #offerId;
    /**
     * @member {String} name
     * @type {String}
     */
    #name;
    /**
     * @member {Number} marketCategoryId
     * @type {Number}
     */
    #marketCategoryId;
    /**
     * @member {String} category
     * @type {String}
     */
    #category;
    /**
     * @member {Array.<String>} pictures
     * @type {Array.<String>}
     */
    #pictures;
    /**
     * @member {Array.<String>} videos
     * @type {Array.<String>}
     */
    #videos;
    /**
     * @member {Array.<module:model/OfferManualDTO>} manuals
     * @type {Array.<module:model/OfferManualDTO>}
     */
    #manuals;
    /**
     * @member {String} vendor
     * @type {String}
     */
    #vendor;
    /**
     * @member {Array.<String>} barcodes
     * @type {Array.<String>}
     */
    #barcodes;
    /**
     * @member {String} description
     * @type {String}
     */
    #description;
    /**
     * @member {Array.<String>} manufacturerCountries
     * @type {Array.<String>}
     */
    #manufacturerCountries;
    /**
     * @member {module:model/OfferWeightDimensionsDTO} weightDimensions
     * @type {module:model/OfferWeightDimensionsDTO}
     */
    #weightDimensions;
    /**
     * @member {String} vendorCode
     * @type {String}
     */
    #vendorCode;
    /**
     * @member {Array.<String>} tags
     * @type {Array.<String>}
     */
    #tags;
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
     * @member {String} customsCommodityCode
     * @type {String}
     */
    #customsCommodityCode;
    /**
     * @member {Array.<String>} certificates
     * @type {Array.<String>}
     */
    #certificates;
    /**
     * @member {Number} boxCount
     * @type {Number}
     */
    #boxCount;
    /**
     * @member {module:model/OfferConditionDTO} condition
     * @type {module:model/OfferConditionDTO}
     */
    #condition;
    /**
     * @member {module:model/OfferType} type
     * @type {module:model/OfferType}
     */
    #type;
    /**
     * @member {Boolean} downloadable
     * @type {Boolean}
     */
    #downloadable;
    /**
     * @member {Boolean} adult
     * @type {Boolean}
     */
    #adult;
    /**
     * @member {module:model/AgeDTO} age
     * @type {module:model/AgeDTO}
     */
    #age;
    /**
     * @member {Array.<module:model/OfferParamDTO>} params
     * @type {Array.<module:model/OfferParamDTO>}
     */
    #params;
    

    /**
     * Constructs a new <code>UpdateOfferDTO</code>.
     * Параметры товара.
     * @alias module:model/UpdateOfferDTO
     * @implements module:model/BaseOfferDTO
     * @param offerId {String} Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     */
    constructor(offerId) { 
        BaseOfferDTO.initialize(this, offerId);
        UpdateOfferDTO.initialize(this, offerId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, offerId) { 
        obj['offerId'] = offerId;
    }

    /**
     * Constructs a <code>UpdateOfferDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateOfferDTO} obj Optional instance to populate.
     * @return {module:model/UpdateOfferDTO} The populated <code>UpdateOfferDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateOfferDTO();
            BaseOfferDTO.constructFromObject(data, obj);

            if (data.hasOwnProperty('offerId')) {
                obj['offerId'] = ApiClient.convertToType(data['offerId'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('marketCategoryId')) {
                obj['marketCategoryId'] = ApiClient.convertToType(data['marketCategoryId'], 'Number');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('pictures')) {
                obj['pictures'] = ApiClient.convertToType(data['pictures'], ['String']);
            }
            if (data.hasOwnProperty('videos')) {
                obj['videos'] = ApiClient.convertToType(data['videos'], ['String']);
            }
            if (data.hasOwnProperty('manuals')) {
                obj['manuals'] = ApiClient.convertToType(data['manuals'], [OfferManualDTO]);
            }
            if (data.hasOwnProperty('vendor')) {
                obj['vendor'] = ApiClient.convertToType(data['vendor'], 'String');
            }
            if (data.hasOwnProperty('barcodes')) {
                obj['barcodes'] = ApiClient.convertToType(data['barcodes'], ['String']);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('manufacturerCountries')) {
                obj['manufacturerCountries'] = ApiClient.convertToType(data['manufacturerCountries'], ['String']);
            }
            if (data.hasOwnProperty('weightDimensions')) {
                obj['weightDimensions'] = OfferWeightDimensionsDTO.constructFromObject(data['weightDimensions']);
            }
            if (data.hasOwnProperty('vendorCode')) {
                obj['vendorCode'] = ApiClient.convertToType(data['vendorCode'], 'String');
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
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
            if (data.hasOwnProperty('customsCommodityCode')) {
                obj['customsCommodityCode'] = ApiClient.convertToType(data['customsCommodityCode'], 'String');
            }
            if (data.hasOwnProperty('certificates')) {
                obj['certificates'] = ApiClient.convertToType(data['certificates'], ['String']);
            }
            if (data.hasOwnProperty('boxCount')) {
                obj['boxCount'] = ApiClient.convertToType(data['boxCount'], 'Number');
            }
            if (data.hasOwnProperty('condition')) {
                obj['condition'] = OfferConditionDTO.constructFromObject(data['condition']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = OfferType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('downloadable')) {
                obj['downloadable'] = ApiClient.convertToType(data['downloadable'], 'Boolean');
            }
            if (data.hasOwnProperty('adult')) {
                obj['adult'] = ApiClient.convertToType(data['adult'], 'Boolean');
            }
            if (data.hasOwnProperty('age')) {
                obj['age'] = AgeDTO.constructFromObject(data['age']);
            }
            if (data.hasOwnProperty('params')) {
                obj['params'] = ApiClient.convertToType(data['params'], [OfferParamDTO]);
            }
            if (data.hasOwnProperty('parameterValues')) {
                obj['parameterValues'] = ApiClient.convertToType(data['parameterValues'], [ParameterValueDTO]);
            }
            if (data.hasOwnProperty('basicPrice')) {
                obj['basicPrice'] = UpdatePriceWithDiscountDTO.constructFromObject(data['basicPrice']);
            }
            if (data.hasOwnProperty('purchasePrice')) {
                obj['purchasePrice'] = BasePriceDTO.constructFromObject(data['purchasePrice']);
            }
            if (data.hasOwnProperty('additionalExpenses')) {
                obj['additionalExpenses'] = BasePriceDTO.constructFromObject(data['additionalExpenses']);
            }
            if (data.hasOwnProperty('cofinancePrice')) {
                obj['cofinancePrice'] = BasePriceDTO.constructFromObject(data['cofinancePrice']);
            }
        }
        return obj;
    }
}



export default UpdateOfferDTO;

