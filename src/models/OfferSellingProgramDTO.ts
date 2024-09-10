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
    OfferSellingProgramStatusType,
    OfferSellingProgramStatusTypeFromJSON,
    OfferSellingProgramStatusTypeToJSON,
    SellingProgramType,
    SellingProgramTypeFromJSON,
    SellingProgramTypeToJSON,
} from './';

/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 * @export
 * @interface OfferSellingProgramDTO
 */
export interface OfferSellingProgramDTO  {
    /**
     * 
     * @type {SellingProgramType}
     * @memberof OfferSellingProgramDTO
     */
    sellingProgram: SellingProgramType;
    /**
     * 
     * @type {OfferSellingProgramStatusType}
     * @memberof OfferSellingProgramDTO
     */
    status: OfferSellingProgramStatusType;
}

export function OfferSellingProgramDTOFromJSON(json: any): OfferSellingProgramDTO {
    return {
        'sellingProgram': SellingProgramTypeFromJSON(json['sellingProgram']),
        'status': OfferSellingProgramStatusTypeFromJSON(json['status']),
    };
}

export function OfferSellingProgramDTOToJSON(value?: OfferSellingProgramDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'sellingProgram': SellingProgramTypeToJSON(value.sellingProgram),
        'status': OfferSellingProgramStatusTypeToJSON(value.status),
    };
}



