//
// ChatsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class ChatsAPI {

    /**
     Создание нового чата с покупателем
     
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter createChatRequest: (body) description 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func createChat(businessId: Int64, createChatRequest: CreateChatRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: CreateChatResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return createChatWithRequestBuilder(businessId: businessId, createChatRequest: createChatRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Создание нового чата с покупателем
     - POST /businesses/{businessId}/chats/new
     - Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter createChatRequest: (body) description 
     - returns: RequestBuilder<CreateChatResponse> 
     */
    open class func createChatWithRequestBuilder(businessId: Int64, createChatRequest: CreateChatRequest) -> RequestBuilder<CreateChatResponse> {
        var localVariablePath = "/businesses/{businessId}/chats/new"
        let businessIdPreEscape = "\(APIHelper.mapValueToPathItem(businessId))"
        let businessIdPostEscape = businessIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{businessId}", with: businessIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: createChatRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<CreateChatResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Получение истории сообщений в чате
     
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter chatId: (query) Идентификатор чата. 
     - parameter getChatHistoryRequest: (body) description 
     - parameter pageToken: (query) Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     - parameter limit: (query) Количество значений на одной странице.  (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func getChatHistory(businessId: Int64, chatId: Int64, getChatHistoryRequest: GetChatHistoryRequest, pageToken: String? = nil, limit: Int? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: GetChatHistoryResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return getChatHistoryWithRequestBuilder(businessId: businessId, chatId: chatId, getChatHistoryRequest: getChatHistoryRequest, pageToken: pageToken, limit: limit).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Получение истории сообщений в чате
     - POST /businesses/{businessId}/chats/history
     - Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter chatId: (query) Идентификатор чата. 
     - parameter getChatHistoryRequest: (body) description 
     - parameter pageToken: (query) Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     - parameter limit: (query) Количество значений на одной странице.  (optional)
     - returns: RequestBuilder<GetChatHistoryResponse> 
     */
    open class func getChatHistoryWithRequestBuilder(businessId: Int64, chatId: Int64, getChatHistoryRequest: GetChatHistoryRequest, pageToken: String? = nil, limit: Int? = nil) -> RequestBuilder<GetChatHistoryResponse> {
        var localVariablePath = "/businesses/{businessId}/chats/history"
        let businessIdPreEscape = "\(APIHelper.mapValueToPathItem(businessId))"
        let businessIdPostEscape = businessIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{businessId}", with: businessIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: getChatHistoryRequest)

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "chatId": (wrappedValue: chatId.encodeToJSON(), isExplode: false),
            "page_token": (wrappedValue: pageToken?.encodeToJSON(), isExplode: false),
            "limit": (wrappedValue: limit?.encodeToJSON(), isExplode: false),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<GetChatHistoryResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Получение доступных чатов
     
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter getChatsRequest: (body) description 
     - parameter pageToken: (query) Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     - parameter limit: (query) Количество значений на одной странице.  (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func getChats(businessId: Int64, getChatsRequest: GetChatsRequest, pageToken: String? = nil, limit: Int? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: GetChatsResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return getChatsWithRequestBuilder(businessId: businessId, getChatsRequest: getChatsRequest, pageToken: pageToken, limit: limit).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Получение доступных чатов
     - POST /businesses/{businessId}/chats
     - Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter getChatsRequest: (body) description 
     - parameter pageToken: (query) Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     - parameter limit: (query) Количество значений на одной странице.  (optional)
     - returns: RequestBuilder<GetChatsResponse> 
     */
    open class func getChatsWithRequestBuilder(businessId: Int64, getChatsRequest: GetChatsRequest, pageToken: String? = nil, limit: Int? = nil) -> RequestBuilder<GetChatsResponse> {
        var localVariablePath = "/businesses/{businessId}/chats"
        let businessIdPreEscape = "\(APIHelper.mapValueToPathItem(businessId))"
        let businessIdPostEscape = businessIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{businessId}", with: businessIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: getChatsRequest)

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "page_token": (wrappedValue: pageToken?.encodeToJSON(), isExplode: false),
            "limit": (wrappedValue: limit?.encodeToJSON(), isExplode: false),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<GetChatsResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Отправка файла в чат
     
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter chatId: (query) Идентификатор чата. 
     - parameter file: (form) Содержимое файла. Максимальный размер файла — 5 Мбайт. 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func sendFileToChat(businessId: Int64, chatId: Int64, file: URL, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: EmptyApiResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return sendFileToChatWithRequestBuilder(businessId: businessId, chatId: chatId, file: file).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Отправка файла в чат
     - POST /businesses/{businessId}/chats/file/send
     - Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter chatId: (query) Идентификатор чата. 
     - parameter file: (form) Содержимое файла. Максимальный размер файла — 5 Мбайт. 
     - returns: RequestBuilder<EmptyApiResponse> 
     */
    open class func sendFileToChatWithRequestBuilder(businessId: Int64, chatId: Int64, file: URL) -> RequestBuilder<EmptyApiResponse> {
        var localVariablePath = "/businesses/{businessId}/chats/file/send"
        let businessIdPreEscape = "\(APIHelper.mapValueToPathItem(businessId))"
        let businessIdPostEscape = businessIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{businessId}", with: businessIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableFormParams: [String: Any?] = [
            "file": file.encodeToJSON(),
        ]

        let localVariableNonNullParameters = APIHelper.rejectNil(localVariableFormParams)
        let localVariableParameters = APIHelper.convertBoolToString(localVariableNonNullParameters)

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "chatId": (wrappedValue: chatId.encodeToJSON(), isExplode: false),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "multipart/form-data",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<EmptyApiResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Отправка сообщения в чат
     
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter chatId: (query) Идентификатор чата. 
     - parameter sendMessageToChatRequest: (body) description 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func sendMessageToChat(businessId: Int64, chatId: Int64, sendMessageToChatRequest: SendMessageToChatRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: EmptyApiResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return sendMessageToChatWithRequestBuilder(businessId: businessId, chatId: chatId, sendMessageToChatRequest: sendMessageToChatRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Отправка сообщения в чат
     - POST /businesses/{businessId}/chats/message
     - Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter chatId: (query) Идентификатор чата. 
     - parameter sendMessageToChatRequest: (body) description 
     - returns: RequestBuilder<EmptyApiResponse> 
     */
    open class func sendMessageToChatWithRequestBuilder(businessId: Int64, chatId: Int64, sendMessageToChatRequest: SendMessageToChatRequest) -> RequestBuilder<EmptyApiResponse> {
        var localVariablePath = "/businesses/{businessId}/chats/message"
        let businessIdPreEscape = "\(APIHelper.mapValueToPathItem(businessId))"
        let businessIdPostEscape = businessIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{businessId}", with: businessIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: sendMessageToChatRequest)

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "chatId": (wrappedValue: chatId.encodeToJSON(), isExplode: false),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<EmptyApiResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }
}
