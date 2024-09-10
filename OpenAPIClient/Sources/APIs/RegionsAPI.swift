//
// RegionsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech

import Foundation
import Combine
import OpenAPITransport


open class RegionsAPI {
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

    public enum SearchRegionChildrenError: Error, CustomStringConvertible {
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
                return "SearchRegionChildrenError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "SearchRegionChildrenError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "SearchRegionChildrenError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "SearchRegionChildrenError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "SearchRegionChildrenError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "SearchRegionChildrenError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Информация о дочерних регионах
    /// - GET /regions/{regionId}/children
    /// - Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter regionId: (path) Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  
    /// - parameter page: (query) Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  (optional, default to 1)
    /// - parameter pageSize: (query) Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  (optional)
    /// - returns: AnyPublisher<GetRegionWithChildrenResponse, Error> 
    open func searchRegionChildren(regionId: Int64, page: Int? = nil, pageSize: Int? = nil) -> AnyPublisher<GetRegionWithChildrenResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/regions/{regionId}/children"
                localVarPath = localVarPath.replacingOccurrences(of: "{regionId}", with: "\(regionId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                var components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                var queryItems: [URLQueryItem] = []
                if let page = page { queryItems.append(URLQueryItem(name: "page", value: "\(page)")) } 
                if let pageSize = pageSize { queryItems.append(URLQueryItem(name: "pageSize", value: "\(pageSize)")) } 
                components?.queryItems = queryItems
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetRegionWithChildrenResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return SearchRegionChildrenError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return SearchRegionChildrenError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return SearchRegionChildrenError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return SearchRegionChildrenError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return SearchRegionChildrenError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return SearchRegionChildrenError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetRegionWithChildrenResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }

    public enum SearchRegionsByIdError: Error, CustomStringConvertible {
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
            case .code401Error(let object):
                return "SearchRegionsByIdError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "SearchRegionsByIdError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "SearchRegionsByIdError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "SearchRegionsByIdError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "SearchRegionsByIdError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Информация о регионе
    /// - GET /regions/{regionId}
    /// - Возвращает информацию о регионе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter regionId: (path) Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  
    /// - returns: AnyPublisher<GetRegionsResponse, Error> 
    open func searchRegionsById(regionId: Int64) -> AnyPublisher<GetRegionsResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/regions/{regionId}"
                localVarPath = localVarPath.replacingOccurrences(of: "{regionId}", with: "\(regionId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                let components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetRegionsResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return SearchRegionsByIdError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return SearchRegionsByIdError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return SearchRegionsByIdError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return SearchRegionsByIdError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return SearchRegionsByIdError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetRegionsResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }

    public enum SearchRegionsByNameError: Error, CustomStringConvertible {
        // В запросе не указаны данные для авторизации.
        case code401Error(ApiUnauthorizedErrorResponse)
        // Данные для авторизации неверны или доступ к ресурсу запрещен.
        case code403Error(ApiForbiddenErrorResponse)
        // Превышено ограничение на доступ к ресурсу.
        case code420Error(ApiLimitErrorResponse)
        // Внутренняя ошибка сервера.
        case code500Error(ApiServerErrorResponse)

        public var description: String {
            switch self {
            case .code401Error(let object):
                return "SearchRegionsByNameError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "SearchRegionsByNameError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code420Error(let object):
                return "SearchRegionsByNameError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "SearchRegionsByNameError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Поиск регионов по их имени
    /// - GET /regions
    /// - Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter name: (query) Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;.  
    /// - parameter pageToken: (query) Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
    /// - parameter limit: (query) Количество значений на одной странице.  (optional)
    /// - returns: AnyPublisher<GetRegionsResponse, Error> 
    open func searchRegionsByName(name: String, pageToken: String? = nil, limit: Int? = nil) -> AnyPublisher<GetRegionsResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                let localVarPath = "/regions"
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                var components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                var queryItems: [URLQueryItem] = []
                queryItems.append(URLQueryItem(name: "name", value: name))
                if let pageToken = pageToken { queryItems.append(URLQueryItem(name: "page_token", value: pageToken)) } 
                if let limit = limit { queryItems.append(URLQueryItem(name: "limit", value: "\(limit)")) } 
                components?.queryItems = queryItems
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetRegionsResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return SearchRegionsByNameError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return SearchRegionsByNameError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return SearchRegionsByNameError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return SearchRegionsByNameError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetRegionsResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }
}
