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


import * as runtime from '../runtime';
import type {
  ApiClientDataErrorResponse,
  ApiForbiddenErrorResponse,
  ApiLimitErrorResponse,
  ApiNotFoundErrorResponse,
  ApiServerErrorResponse,
  ApiUnauthorizedErrorResponse,
  CreateChatRequest,
  CreateChatResponse,
  EmptyApiResponse,
  GetChatHistoryRequest,
  GetChatHistoryResponse,
  GetChatsRequest,
  GetChatsResponse,
  SendMessageToChatRequest,
} from '../models/index';
import {
    ApiClientDataErrorResponseFromJSON,
    ApiClientDataErrorResponseToJSON,
    ApiForbiddenErrorResponseFromJSON,
    ApiForbiddenErrorResponseToJSON,
    ApiLimitErrorResponseFromJSON,
    ApiLimitErrorResponseToJSON,
    ApiNotFoundErrorResponseFromJSON,
    ApiNotFoundErrorResponseToJSON,
    ApiServerErrorResponseFromJSON,
    ApiServerErrorResponseToJSON,
    ApiUnauthorizedErrorResponseFromJSON,
    ApiUnauthorizedErrorResponseToJSON,
    CreateChatRequestFromJSON,
    CreateChatRequestToJSON,
    CreateChatResponseFromJSON,
    CreateChatResponseToJSON,
    EmptyApiResponseFromJSON,
    EmptyApiResponseToJSON,
    GetChatHistoryRequestFromJSON,
    GetChatHistoryRequestToJSON,
    GetChatHistoryResponseFromJSON,
    GetChatHistoryResponseToJSON,
    GetChatsRequestFromJSON,
    GetChatsRequestToJSON,
    GetChatsResponseFromJSON,
    GetChatsResponseToJSON,
    SendMessageToChatRequestFromJSON,
    SendMessageToChatRequestToJSON,
} from '../models/index';

export interface CreateChatOperationRequest {
    businessId: number;
    createChatRequest: CreateChatRequest;
}

export interface GetChatHistoryOperationRequest {
    businessId: number;
    chatId: number;
    getChatHistoryRequest: GetChatHistoryRequest;
    pageToken?: string;
    limit?: number;
}

export interface GetChatsOperationRequest {
    businessId: number;
    getChatsRequest: GetChatsRequest;
    pageToken?: string;
    limit?: number;
}

export interface SendFileToChatRequest {
    businessId: number;
    chatId: number;
    file: Blob;
}

export interface SendMessageToChatOperationRequest {
    businessId: number;
    chatId: number;
    sendMessageToChatRequest: SendMessageToChatRequest;
}

/**
 * 
 */
export class ChatsApi extends runtime.BaseAPI {

    /**
     * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Создание нового чата с покупателем
     */
    async createChatRaw(requestParameters: CreateChatOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CreateChatResponse>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling createChat().'
            );
        }

        if (requestParameters['createChatRequest'] == null) {
            throw new runtime.RequiredError(
                'createChatRequest',
                'Required parameter "createChatRequest" was null or undefined when calling createChat().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/businesses/{businessId}/chats/new`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreateChatRequestToJSON(requestParameters['createChatRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CreateChatResponseFromJSON(jsonValue));
    }

    /**
     * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Создание нового чата с покупателем
     */
    async createChat(requestParameters: CreateChatOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CreateChatResponse> {
        const response = await this.createChatRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     * Получение истории сообщений в чате
     */
    async getChatHistoryRaw(requestParameters: GetChatHistoryOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetChatHistoryResponse>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling getChatHistory().'
            );
        }

        if (requestParameters['chatId'] == null) {
            throw new runtime.RequiredError(
                'chatId',
                'Required parameter "chatId" was null or undefined when calling getChatHistory().'
            );
        }

        if (requestParameters['getChatHistoryRequest'] == null) {
            throw new runtime.RequiredError(
                'getChatHistoryRequest',
                'Required parameter "getChatHistoryRequest" was null or undefined when calling getChatHistory().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['chatId'] != null) {
            queryParameters['chatId'] = requestParameters['chatId'];
        }

        if (requestParameters['pageToken'] != null) {
            queryParameters['page_token'] = requestParameters['pageToken'];
        }

        if (requestParameters['limit'] != null) {
            queryParameters['limit'] = requestParameters['limit'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/businesses/{businessId}/chats/history`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: GetChatHistoryRequestToJSON(requestParameters['getChatHistoryRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetChatHistoryResponseFromJSON(jsonValue));
    }

    /**
     * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     * Получение истории сообщений в чате
     */
    async getChatHistory(requestParameters: GetChatHistoryOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetChatHistoryResponse> {
        const response = await this.getChatHistoryRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     * Получение доступных чатов
     */
    async getChatsRaw(requestParameters: GetChatsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetChatsResponse>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling getChats().'
            );
        }

        if (requestParameters['getChatsRequest'] == null) {
            throw new runtime.RequiredError(
                'getChatsRequest',
                'Required parameter "getChatsRequest" was null or undefined when calling getChats().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['pageToken'] != null) {
            queryParameters['page_token'] = requestParameters['pageToken'];
        }

        if (requestParameters['limit'] != null) {
            queryParameters['limit'] = requestParameters['limit'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/businesses/{businessId}/chats`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: GetChatsRequestToJSON(requestParameters['getChatsRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetChatsResponseFromJSON(jsonValue));
    }

    /**
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     * Получение доступных чатов
     */
    async getChats(requestParameters: GetChatsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetChatsResponse> {
        const response = await this.getChatsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Отправка файла в чат
     */
    async sendFileToChatRaw(requestParameters: SendFileToChatRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<EmptyApiResponse>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling sendFileToChat().'
            );
        }

        if (requestParameters['chatId'] == null) {
            throw new runtime.RequiredError(
                'chatId',
                'Required parameter "chatId" was null or undefined when calling sendFileToChat().'
            );
        }

        if (requestParameters['file'] == null) {
            throw new runtime.RequiredError(
                'file',
                'Required parameter "file" was null or undefined when calling sendFileToChat().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['chatId'] != null) {
            queryParameters['chatId'] = requestParameters['chatId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const consumes: runtime.Consume[] = [
            { contentType: 'multipart/form-data' },
        ];
        // @ts-ignore: canConsumeForm may be unused
        const canConsumeForm = runtime.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): any };
        let useForm = false;
        // use FormData to transmit files using content-type "multipart/form-data"
        useForm = canConsumeForm;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new URLSearchParams();
        }

        if (requestParameters['file'] != null) {
            formParams.append('file', requestParameters['file'] as any);
        }

        const response = await this.request({
            path: `/businesses/{businessId}/chats/file/send`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: formParams,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => EmptyApiResponseFromJSON(jsonValue));
    }

    /**
     * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Отправка файла в чат
     */
    async sendFileToChat(requestParameters: SendFileToChatRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<EmptyApiResponse> {
        const response = await this.sendFileToChatRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Отправка сообщения в чат
     */
    async sendMessageToChatRaw(requestParameters: SendMessageToChatOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<EmptyApiResponse>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling sendMessageToChat().'
            );
        }

        if (requestParameters['chatId'] == null) {
            throw new runtime.RequiredError(
                'chatId',
                'Required parameter "chatId" was null or undefined when calling sendMessageToChat().'
            );
        }

        if (requestParameters['sendMessageToChatRequest'] == null) {
            throw new runtime.RequiredError(
                'sendMessageToChatRequest',
                'Required parameter "sendMessageToChatRequest" was null or undefined when calling sendMessageToChat().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['chatId'] != null) {
            queryParameters['chatId'] = requestParameters['chatId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth", ["market:partner-api"]);
        }

        const response = await this.request({
            path: `/businesses/{businessId}/chats/message`.replace(`{${"businessId"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: SendMessageToChatRequestToJSON(requestParameters['sendMessageToChatRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => EmptyApiResponseFromJSON(jsonValue));
    }

    /**
     * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * Отправка сообщения в чат
     */
    async sendMessageToChat(requestParameters: SendMessageToChatOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<EmptyApiResponse> {
        const response = await this.sendMessageToChatRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
