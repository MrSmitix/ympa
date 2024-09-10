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
import type { ChatMessageDTO } from './ChatMessageDTO';
import {
    ChatMessageDTOFromJSON,
    ChatMessageDTOFromJSONTyped,
    ChatMessageDTOToJSON,
} from './ChatMessageDTO';
import type { ForwardScrollingPagerDTO } from './ForwardScrollingPagerDTO';
import {
    ForwardScrollingPagerDTOFromJSON,
    ForwardScrollingPagerDTOFromJSONTyped,
    ForwardScrollingPagerDTOToJSON,
} from './ForwardScrollingPagerDTO';

/**
 * Информация о сообщениях.
 * @export
 * @interface ChatMessagesResultDTO
 */
export interface ChatMessagesResultDTO {
    /**
     * Идентификатор заказа.
     * @type {number}
     * @memberof ChatMessagesResultDTO
     */
    orderId: number;
    /**
     * Информация о сообщениях.
     * @type {Array<ChatMessageDTO>}
     * @memberof ChatMessagesResultDTO
     */
    messages: Array<ChatMessageDTO>;
    /**
     * 
     * @type {ForwardScrollingPagerDTO}
     * @memberof ChatMessagesResultDTO
     */
    paging?: ForwardScrollingPagerDTO;
}

/**
 * Check if a given object implements the ChatMessagesResultDTO interface.
 */
export function instanceOfChatMessagesResultDTO(value: object): value is ChatMessagesResultDTO {
    if (!('orderId' in value) || value['orderId'] === undefined) return false;
    if (!('messages' in value) || value['messages'] === undefined) return false;
    return true;
}

export function ChatMessagesResultDTOFromJSON(json: any): ChatMessagesResultDTO {
    return ChatMessagesResultDTOFromJSONTyped(json, false);
}

export function ChatMessagesResultDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatMessagesResultDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'orderId': json['orderId'],
        'messages': ((json['messages'] as Array<any>).map(ChatMessageDTOFromJSON)),
        'paging': json['paging'] == null ? undefined : ForwardScrollingPagerDTOFromJSON(json['paging']),
    };
}

export function ChatMessagesResultDTOToJSON(value?: ChatMessagesResultDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'orderId': value['orderId'],
        'messages': ((value['messages'] as Array<any>).map(ChatMessageDTOToJSON)),
        'paging': ForwardScrollingPagerDTOToJSON(value['paging']),
    };
}
