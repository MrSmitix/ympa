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
    RejectedPromoOfferUpdateDTO,
    RejectedPromoOfferUpdateDTOFromJSON,
    RejectedPromoOfferUpdateDTOToJSON,
    WarningPromoOfferUpdateDTO,
    WarningPromoOfferUpdateDTOFromJSON,
    WarningPromoOfferUpdateDTOToJSON,
} from './';

/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 * @export
 * @interface UpdatePromoOffersResultDTO
 */
export interface UpdatePromoOffersResultDTO  {
    /**
     * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
     * @type {Array<RejectedPromoOfferUpdateDTO>}
     * @memberof UpdatePromoOffersResultDTO
     */
    rejectedOffers?: Array<RejectedPromoOfferUpdateDTO>;
    /**
     * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
     * @type {Array<WarningPromoOfferUpdateDTO>}
     * @memberof UpdatePromoOffersResultDTO
     */
    warningOffers?: Array<WarningPromoOfferUpdateDTO>;
}

export function UpdatePromoOffersResultDTOFromJSON(json: any): UpdatePromoOffersResultDTO {
    return {
        'rejectedOffers': !exists(json, 'rejectedOffers') ? undefined : (json['rejectedOffers'] as Array<any>).map(RejectedPromoOfferUpdateDTOFromJSON),
        'warningOffers': !exists(json, 'warningOffers') ? undefined : (json['warningOffers'] as Array<any>).map(WarningPromoOfferUpdateDTOFromJSON),
    };
}

export function UpdatePromoOffersResultDTOToJSON(value?: UpdatePromoOffersResultDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'rejectedOffers': value.rejectedOffers === undefined ? undefined : (value.rejectedOffers as Array<any>).map(RejectedPromoOfferUpdateDTOToJSON),
        'warningOffers': value.warningOffers === undefined ? undefined : (value.warningOffers as Array<any>).map(WarningPromoOfferUpdateDTOToJSON),
    };
}


