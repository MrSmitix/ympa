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
import type { FeedPublicationFullDTO } from './FeedPublicationFullDTO';
import {
    FeedPublicationFullDTOFromJSON,
    FeedPublicationFullDTOFromJSONTyped,
    FeedPublicationFullDTOToJSON,
} from './FeedPublicationFullDTO';
import type { FeedPublicationPriceAndStockUpdateDTO } from './FeedPublicationPriceAndStockUpdateDTO';
import {
    FeedPublicationPriceAndStockUpdateDTOFromJSON,
    FeedPublicationPriceAndStockUpdateDTOFromJSONTyped,
    FeedPublicationPriceAndStockUpdateDTOToJSON,
} from './FeedPublicationPriceAndStockUpdateDTO';
import type { FeedStatusType } from './FeedStatusType';
import {
    FeedStatusTypeFromJSON,
    FeedStatusTypeFromJSONTyped,
    FeedStatusTypeToJSON,
} from './FeedStatusType';

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 * @export
 * @interface FeedPublicationDTO
 */
export interface FeedPublicationDTO {
    /**
     * 
     * @type {FeedStatusType}
     * @memberof FeedPublicationDTO
     */
    status?: FeedStatusType;
    /**
     * 
     * @type {FeedPublicationFullDTO}
     * @memberof FeedPublicationDTO
     */
    full?: FeedPublicationFullDTO;
    /**
     * 
     * @type {FeedPublicationPriceAndStockUpdateDTO}
     * @memberof FeedPublicationDTO
     */
    priceAndStockUpdate?: FeedPublicationPriceAndStockUpdateDTO;
}



/**
 * Check if a given object implements the FeedPublicationDTO interface.
 */
export function instanceOfFeedPublicationDTO(value: object): value is FeedPublicationDTO {
    return true;
}

export function FeedPublicationDTOFromJSON(json: any): FeedPublicationDTO {
    return FeedPublicationDTOFromJSONTyped(json, false);
}

export function FeedPublicationDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): FeedPublicationDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : FeedStatusTypeFromJSON(json['status']),
        'full': json['full'] == null ? undefined : FeedPublicationFullDTOFromJSON(json['full']),
        'priceAndStockUpdate': json['priceAndStockUpdate'] == null ? undefined : FeedPublicationPriceAndStockUpdateDTOFromJSON(json['priceAndStockUpdate']),
    };
}

export function FeedPublicationDTOToJSON(value?: FeedPublicationDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': FeedStatusTypeToJSON(value['status']),
        'full': FeedPublicationFullDTOToJSON(value['full']),
        'priceAndStockUpdate': FeedPublicationPriceAndStockUpdateDTOToJSON(value['priceAndStockUpdate']),
    };
}
