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
import CalculateTariffsOfferDTO from './CalculateTariffsOfferDTO';
import CalculatedTariffDTO from './CalculatedTariffDTO';

/**
 * The CalculateTariffsOfferInfoDTO model module.
 * @module model/CalculateTariffsOfferInfoDTO
 * @version LATEST
 */
class CalculateTariffsOfferInfoDTO {
    /**
     * @member {module:model/CalculateTariffsOfferDTO} offer
     * @type {module:model/CalculateTariffsOfferDTO}
     */
    offer;
    /**
     * @member {Array.<module:model/CalculatedTariffDTO>} tariffs
     * @type {Array.<module:model/CalculatedTariffDTO>}
     */
    tariffs;

    

    /**
     * Constructs a new <code>CalculateTariffsOfferInfoDTO</code>.
     * Стоимость услуг.
     * @alias module:model/CalculateTariffsOfferInfoDTO
     * @param offer {module:model/CalculateTariffsOfferDTO} 
     * @param tariffs {Array.<module:model/CalculatedTariffDTO>} Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
     */
    constructor(offer, tariffs) { 
        
        CalculateTariffsOfferInfoDTO.initialize(this, offer, tariffs);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, offer, tariffs) { 
        obj['offer'] = offer;
        obj['tariffs'] = tariffs;
    }

    /**
     * Constructs a <code>CalculateTariffsOfferInfoDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculateTariffsOfferInfoDTO} obj Optional instance to populate.
     * @return {module:model/CalculateTariffsOfferInfoDTO} The populated <code>CalculateTariffsOfferInfoDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculateTariffsOfferInfoDTO();

            if (data.hasOwnProperty('offer')) {
                obj['offer'] = CalculateTariffsOfferDTO.constructFromObject(data['offer']);
            }
            if (data.hasOwnProperty('tariffs')) {
                obj['tariffs'] = ApiClient.convertToType(data['tariffs'], [CalculatedTariffDTO]);
            }
        }
        return obj;
    }
}



export default CalculateTariffsOfferInfoDTO;

