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
import type { ApiResponseStatusType } from './ApiResponseStatusType';
import {
    ApiResponseStatusTypeFromJSON,
    ApiResponseStatusTypeFromJSONTyped,
    ApiResponseStatusTypeToJSON,
} from './ApiResponseStatusType';
import type { EacVerificationResultDTO } from './EacVerificationResultDTO';
import {
    EacVerificationResultDTOFromJSON,
    EacVerificationResultDTOFromJSONTyped,
    EacVerificationResultDTOToJSON,
} from './EacVerificationResultDTO';

/**
 * 
 * @export
 * @interface VerifyOrderEacResponse
 */
export interface VerifyOrderEacResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof VerifyOrderEacResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {EacVerificationResultDTO}
     * @memberof VerifyOrderEacResponse
     */
    result?: EacVerificationResultDTO;
}



/**
 * Check if a given object implements the VerifyOrderEacResponse interface.
 */
export function instanceOfVerifyOrderEacResponse(value: object): value is VerifyOrderEacResponse {
    return true;
}

export function VerifyOrderEacResponseFromJSON(json: any): VerifyOrderEacResponse {
    return VerifyOrderEacResponseFromJSONTyped(json, false);
}

export function VerifyOrderEacResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): VerifyOrderEacResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : EacVerificationResultDTOFromJSON(json['result']),
    };
}

export function VerifyOrderEacResponseToJSON(value?: VerifyOrderEacResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': EacVerificationResultDTOToJSON(value['result']),
    };
}
