//
// ContentAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech

import Foundation
import Combine
import OpenAPITransport


open class ContentAPI {
    private let transport: OpenAPITransport
    public var encoder: JSONEncoder = {
        let encoder = JSONEncoder()
        encoder.dateEncodingStrategy = .formatted(OpenISO8601DateFormatter())
        return encoder
    }()
    public var decoder: JSONDecoder = {
        let decoder = JSONDecoder()
        decoder.dateDecodingStrategy = .formatted(OpenISO8601DateFormatter())
        return decoder
    }()
    public var baseURL = URL(string: "https://api.partner.market.yandex.ru")

    public init(_ transport: OpenAPITransport) {
        self.transport = transport
    }

    public enum GetCategoryContentParametersError: Error, CustomStringConvertible {
        // Запрос содержит неправильные данные.
        case code400Error(ApiClientDataErrorResponse)
        // В запросе не указаны данные для авторизации.
        case code401Error(ApiUnauthorizedErrorResponse)
        // Данные для авторизации неверны или доступ к ресурсу запрещен.
        case code403Error(ApiForbiddenErrorResponse)
        // Запрашиваемый ресурс не найден.
        case code404Error(ApiNotFoundErrorResponse)
        // Превышено ограничение на доступ к ресурсу.
        case code420Error(ApiLimitErrorResponse)
        // Внутренняя ошибка сервера.
        case code500Error(ApiServerErrorResponse)

        public var description: String {
            switch self {
            case .code400Error(let object):
                return "GetCategoryContentParametersError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GetCategoryContentParametersError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GetCategoryContentParametersError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GetCategoryContentParametersError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GetCategoryContentParametersError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GetCategoryContentParametersError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Списки характеристик товаров по категориям
    /// - POST /category/{categoryId}/parameters
    /// - Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter categoryId: (path) Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  
    /// - returns: AnyPublisher<GetCategoryContentParametersResponse, Error> 
    open func getCategoryContentParameters(categoryId: Int64) -> AnyPublisher<GetCategoryContentParametersResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/category/{categoryId}/parameters"
                localVarPath = localVarPath.replacingOccurrences(of: "{categoryId}", with: "\(categoryId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                let components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "POST"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetCategoryContentParametersResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GetCategoryContentParametersError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GetCategoryContentParametersError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GetCategoryContentParametersError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GetCategoryContentParametersError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GetCategoryContentParametersError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GetCategoryContentParametersError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetCategoryContentParametersResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }

    public enum GetOfferCardsContentStatusError: Error, CustomStringConvertible {
        // Запрос содержит неправильные данные.
        case code400Error(ApiClientDataErrorResponse)
        // В запросе не указаны данные для авторизации.
        case code401Error(ApiUnauthorizedErrorResponse)
        // Данные для авторизации неверны или доступ к ресурсу запрещен.
        case code403Error(ApiForbiddenErrorResponse)
        // Запрашиваемый ресурс не найден.
        case code404Error(ApiNotFoundErrorResponse)
        // Превышено ограничение на доступ к ресурсу.
        case code420Error(ApiLimitErrorResponse)
        // Внутренняя ошибка сервера.
        case code500Error(ApiServerErrorResponse)

        public var description: String {
            switch self {
            case .code400Error(let object):
                return "GetOfferCardsContentStatusError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GetOfferCardsContentStatusError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GetOfferCardsContentStatusError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GetOfferCardsContentStatusError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GetOfferCardsContentStatusError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GetOfferCardsContentStatusError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Получение информации о заполненности карточек магазина
    /// - POST /businesses/{businessId}/offer-cards
    /// - Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    /// - parameter pageToken: (query) Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
    /// - parameter limit: (query) Количество значений на одной странице.  (optional)
    /// - parameter getOfferCardsContentStatusRequest: (body)  (optional)
    /// - returns: AnyPublisher<GetOfferCardsContentStatusResponse, Error> 
    open func getOfferCardsContentStatus(businessId: Int64, pageToken: String? = nil, limit: Int? = nil, getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest? = nil) -> AnyPublisher<GetOfferCardsContentStatusResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/businesses/{businessId}/offer-cards"
                localVarPath = localVarPath.replacingOccurrences(of: "{businessId}", with: "\(businessId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                var components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                var queryItems: [URLQueryItem] = []
                if let pageToken = pageToken { queryItems.append(URLQueryItem(name: "page_token", value: pageToken)) } 
                if let limit = limit { queryItems.append(URLQueryItem(name: "limit", value: "\(limit)")) } 
                components?.queryItems = queryItems
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "POST"
                request.httpBody = try self.encoder.encode(getOfferCardsContentStatusRequest)
                request.setValue("application/json", forHTTPHeaderField: "Content-Type")
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetOfferCardsContentStatusResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GetOfferCardsContentStatusError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GetOfferCardsContentStatusError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GetOfferCardsContentStatusError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GetOfferCardsContentStatusError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GetOfferCardsContentStatusError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GetOfferCardsContentStatusError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetOfferCardsContentStatusResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }

    public enum UpdateOfferContentError: Error, CustomStringConvertible {
        // Запрос содержит неправильные данные.
        case code400Error(ApiClientDataErrorResponse)
        // В запросе не указаны данные для авторизации.
        case code401Error(ApiUnauthorizedErrorResponse)
        // Данные для авторизации неверны или доступ к ресурсу запрещен.
        case code403Error(ApiForbiddenErrorResponse)
        // Запрашиваемый ресурс не найден.
        case code404Error(ApiNotFoundErrorResponse)
        // Превышено ограничение на доступ к ресурсу.
        case code420Error(ApiLimitErrorResponse)
        // К ресурсу нельзя применить указанный метод.
        case code423Error(ApiLockedErrorResponse)
        // Внутренняя ошибка сервера.
        case code500Error(ApiServerErrorResponse)

        public var description: String {
            switch self {
            case .code400Error(let object):
                return "UpdateOfferContentError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "UpdateOfferContentError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "UpdateOfferContentError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "UpdateOfferContentError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "UpdateOfferContentError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code423Error(let object):
                return "UpdateOfferContentError: К ресурсу нельзя применить указанный метод.: \(object)"
            case .code500Error(let object):
                return "UpdateOfferContentError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Редактирование категорийных характеристик товара
    /// - POST /businesses/{businessId}/offer-cards/update
    /// - Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    /// - parameter updateOfferContentRequest: (body)  
    /// - returns: AnyPublisher<UpdateOfferContentResponse, Error> 
    open func updateOfferContent(businessId: Int64, updateOfferContentRequest: UpdateOfferContentRequest) -> AnyPublisher<UpdateOfferContentResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/businesses/{businessId}/offer-cards/update"
                localVarPath = localVarPath.replacingOccurrences(of: "{businessId}", with: "\(businessId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                let components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "POST"
                request.httpBody = try self.encoder.encode(updateOfferContentRequest)
                request.setValue("application/json", forHTTPHeaderField: "Content-Type")
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<UpdateOfferContentResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return UpdateOfferContentError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return UpdateOfferContentError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return UpdateOfferContentError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return UpdateOfferContentError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return UpdateOfferContentError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 423 {
                        do {
                            let error = try self.decoder.decode(ApiLockedErrorResponse.self, from: transportError.data)
                            return UpdateOfferContentError.code423Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return UpdateOfferContentError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(UpdateOfferContentResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }
}
