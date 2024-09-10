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
/**
 * Историю какого чата нужно получить — и начиная с какого сообщения.
 * 
 * @export
 * @interface GetChatHistoryRequest
 */
export interface GetChatHistoryRequest {
    /**
     * Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
     * @type {number}
     * @memberof GetChatHistoryRequest
     */
    messageIdFrom?: number;
}

/**
 * Check if a given object implements the GetChatHistoryRequest interface.
 */
export function instanceOfGetChatHistoryRequest(value: object): value is GetChatHistoryRequest {
    return true;
}

export function GetChatHistoryRequestFromJSON(json: any): GetChatHistoryRequest {
    return GetChatHistoryRequestFromJSONTyped(json, false);
}

export function GetChatHistoryRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetChatHistoryRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'messageIdFrom': json['messageIdFrom'] == null ? undefined : json['messageIdFrom'],
    };
}

export function GetChatHistoryRequestToJSON(value?: GetChatHistoryRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'messageIdFrom': value['messageIdFrom'],
    };
}
