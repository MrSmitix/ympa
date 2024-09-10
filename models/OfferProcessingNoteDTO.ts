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
import type { OfferProcessingNoteType } from './OfferProcessingNoteType';
import {
    OfferProcessingNoteTypeFromJSON,
    OfferProcessingNoteTypeFromJSONTyped,
    OfferProcessingNoteTypeToJSON,
} from './OfferProcessingNoteType';

/**
 * Причины, по которым товар не прошел модерацию.
 * @export
 * @interface OfferProcessingNoteDTO
 */
export interface OfferProcessingNoteDTO {
    /**
     * 
     * @type {OfferProcessingNoteType}
     * @memberof OfferProcessingNoteDTO
     */
    type?: OfferProcessingNoteType;
    /**
     * Дополнительная информация о причине отклонения товара.
     * 
     * @type {string}
     * @memberof OfferProcessingNoteDTO
     */
    payload?: string;
}



/**
 * Check if a given object implements the OfferProcessingNoteDTO interface.
 */
export function instanceOfOfferProcessingNoteDTO(value: object): value is OfferProcessingNoteDTO {
    return true;
}

export function OfferProcessingNoteDTOFromJSON(json: any): OfferProcessingNoteDTO {
    return OfferProcessingNoteDTOFromJSONTyped(json, false);
}

export function OfferProcessingNoteDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OfferProcessingNoteDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'] == null ? undefined : OfferProcessingNoteTypeFromJSON(json['type']),
        'payload': json['payload'] == null ? undefined : json['payload'],
    };
}

export function OfferProcessingNoteDTOToJSON(value?: OfferProcessingNoteDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': OfferProcessingNoteTypeToJSON(value['type']),
        'payload': value['payload'],
    };
}
