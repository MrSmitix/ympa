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
    CalculateTariffsOfferDTO,
    CalculateTariffsOfferDTOFromJSON,
    CalculateTariffsOfferDTOToJSON,
    CalculatedTariffDTO,
    CalculatedTariffDTOFromJSON,
    CalculatedTariffDTOToJSON,
} from './';

/**
 * Стоимость услуг.
 * @export
 * @interface CalculateTariffsOfferInfoDTO
 */
export interface CalculateTariffsOfferInfoDTO  {
    /**
     * 
     * @type {CalculateTariffsOfferDTO}
     * @memberof CalculateTariffsOfferInfoDTO
     */
    offer: CalculateTariffsOfferDTO;
    /**
     * Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
     * @type {Array<CalculatedTariffDTO>}
     * @memberof CalculateTariffsOfferInfoDTO
     */
    tariffs: Array<CalculatedTariffDTO>;
}

export function CalculateTariffsOfferInfoDTOFromJSON(json: any): CalculateTariffsOfferInfoDTO {
    return {
        'offer': CalculateTariffsOfferDTOFromJSON(json['offer']),
        'tariffs': (json['tariffs'] as Array<any>).map(CalculatedTariffDTOFromJSON),
    };
}

export function CalculateTariffsOfferInfoDTOToJSON(value?: CalculateTariffsOfferInfoDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'offer': CalculateTariffsOfferDTOToJSON(value.offer),
        'tariffs': (value.tariffs as Array<any>).map(CalculatedTariffDTOToJSON),
    };
}


