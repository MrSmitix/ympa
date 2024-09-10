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
    ChatMessagePayloadDTO,
    ChatMessagePayloadDTOFromJSON,
    ChatMessagePayloadDTOToJSON,
    ChatMessageSenderType,
    ChatMessageSenderTypeFromJSON,
    ChatMessageSenderTypeToJSON,
} from './';

/**
 * Информация о сообщениях.
 * @export
 * @interface ChatMessageDTO
 */
export interface ChatMessageDTO  {
    /**
     * Идентификатор сообщения.
     * @type {number}
     * @memberof ChatMessageDTO
     */
    messageId: number;
    /**
     * Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
     * @type {Date}
     * @memberof ChatMessageDTO
     */
    createdAt: Date;
    /**
     * 
     * @type {ChatMessageSenderType}
     * @memberof ChatMessageDTO
     */
    sender: ChatMessageSenderType;
    /**
     * Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
     * @type {string}
     * @memberof ChatMessageDTO
     */
    message?: string;
    /**
     * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
     * @type {Array<ChatMessagePayloadDTO>}
     * @memberof ChatMessageDTO
     */
    payload?: Array<ChatMessagePayloadDTO>;
}

export function ChatMessageDTOFromJSON(json: any): ChatMessageDTO {
    return {
        'messageId': json['messageId'],
        'createdAt': new Date(json['createdAt']),
        'sender': ChatMessageSenderTypeFromJSON(json['sender']),
        'message': !exists(json, 'message') ? undefined : json['message'],
        'payload': !exists(json, 'payload') ? undefined : (json['payload'] as Array<any>).map(ChatMessagePayloadDTOFromJSON),
    };
}

export function ChatMessageDTOToJSON(value?: ChatMessageDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'messageId': value.messageId,
        'createdAt': value.createdAt.toISOString(),
        'sender': ChatMessageSenderTypeToJSON(value.sender),
        'message': value.message,
        'payload': value.payload === undefined ? undefined : (value.payload as Array<any>).map(ChatMessagePayloadDTOToJSON),
    };
}



