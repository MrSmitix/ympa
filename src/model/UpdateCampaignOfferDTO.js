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
import BaseCampaignOfferDTO from './BaseCampaignOfferDTO';
import QuantumDTO from './QuantumDTO';

/**
 * The UpdateCampaignOfferDTO model module.
 * @module model/UpdateCampaignOfferDTO
 * @version LATEST
 */
class UpdateCampaignOfferDTO {
    /**
     * @member {String} offerId
     * @type {String}
     */
    offerId;
    /**
     * @member {module:model/QuantumDTO} quantum
     * @type {module:model/QuantumDTO}
     */
    quantum;
    /**
     * @member {Boolean} available
     * @type {Boolean}
     */
    available;
    /**
     * @member {Number} vat
     * @type {Number}
     */
    vat;

    /**
     * @member {String} offerId
     * @type {String}
     */
    #offerId;
    /**
     * @member {module:model/QuantumDTO} quantum
     * @type {module:model/QuantumDTO}
     */
    #quantum;
    /**
     * @member {Boolean} available
     * @type {Boolean}
     */
    #available;
    

    /**
     * Constructs a new <code>UpdateCampaignOfferDTO</code>.
     * Параметры размещения товара в магазине.
     * @alias module:model/UpdateCampaignOfferDTO
     * @implements module:model/BaseCampaignOfferDTO
     * @param offerId {String} Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     */
    constructor(offerId) { 
        BaseCampaignOfferDTO.initialize(this, offerId);
        UpdateCampaignOfferDTO.initialize(this, offerId);
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
     * Constructs a <code>UpdateCampaignOfferDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateCampaignOfferDTO} obj Optional instance to populate.
     * @return {module:model/UpdateCampaignOfferDTO} The populated <code>UpdateCampaignOfferDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateCampaignOfferDTO();
            BaseCampaignOfferDTO.constructFromObject(data, obj);

            if (data.hasOwnProperty('offerId')) {
                obj['offerId'] = ApiClient.convertToType(data['offerId'], 'String');
            }
            if (data.hasOwnProperty('quantum')) {
                obj['quantum'] = QuantumDTO.constructFromObject(data['quantum']);
            }
            if (data.hasOwnProperty('available')) {
                obj['available'] = ApiClient.convertToType(data['available'], 'Boolean');
            }
            if (data.hasOwnProperty('vat')) {
                obj['vat'] = ApiClient.convertToType(data['vat'], 'Number');
            }
        }
        return obj;
    }
}



export default UpdateCampaignOfferDTO;

