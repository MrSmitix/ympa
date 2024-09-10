/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { AddOffersToArchiveErrorDTO } from './AddOffersToArchiveErrorDTO';
import {
    AddOffersToArchiveErrorDTOFromJSON,
    AddOffersToArchiveErrorDTOFromJSONTyped,
    AddOffersToArchiveErrorDTOToJSON,
} from './AddOffersToArchiveErrorDTO';

/**
 * Товары, которые не удалось поместить в архив.
 * @export
 * @interface AddOffersToArchiveDTO
 */
export interface AddOffersToArchiveDTO {
    /**
     * Список товаров, которые не удалось поместить в архив.
     * @type {Array<AddOffersToArchiveErrorDTO>}
     * @memberof AddOffersToArchiveDTO
     */
    notArchivedOffers?: Array<AddOffersToArchiveErrorDTO> | null;
}

/**
 * Check if a given object implements the AddOffersToArchiveDTO interface.
 */
export function instanceOfAddOffersToArchiveDTO(value: object): value is AddOffersToArchiveDTO {
    return true;
}

export function AddOffersToArchiveDTOFromJSON(json: any): AddOffersToArchiveDTO {
    return AddOffersToArchiveDTOFromJSONTyped(json, false);
}

export function AddOffersToArchiveDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): AddOffersToArchiveDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'notArchivedOffers': json['notArchivedOffers'] == null ? undefined : ((json['notArchivedOffers'] as Array<any>).map(AddOffersToArchiveErrorDTOFromJSON)),
    };
}

export function AddOffersToArchiveDTOToJSON(value?: AddOffersToArchiveDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'notArchivedOffers': value['notArchivedOffers'] == null ? undefined : ((value['notArchivedOffers'] as Array<any>).map(AddOffersToArchiveErrorDTOToJSON)),
    };
}
