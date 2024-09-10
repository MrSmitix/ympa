//
// WarehousesAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech

import Foundation
import Combine
import OpenAPITransport


open class WarehousesAPI {
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

    public enum GetFulfillmentWarehousesError: Error, CustomStringConvertible {
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
                return "GetFulfillmentWarehousesError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GetFulfillmentWarehousesError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GetFulfillmentWarehousesError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GetFulfillmentWarehousesError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GetFulfillmentWarehousesError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GetFulfillmentWarehousesError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Идентификаторы складов Маркета (FBY)
    /// - GET /warehouses
    /// - Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - returns: AnyPublisher<GetFulfillmentWarehousesResponse, Error> 
    open func getFulfillmentWarehouses() -> AnyPublisher<GetFulfillmentWarehousesResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                let localVarPath = "/warehouses"
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                let components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetFulfillmentWarehousesResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GetFulfillmentWarehousesError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GetFulfillmentWarehousesError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GetFulfillmentWarehousesError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GetFulfillmentWarehousesError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GetFulfillmentWarehousesError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GetFulfillmentWarehousesError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetFulfillmentWarehousesResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }

    public enum GetWarehousesError: Error, CustomStringConvertible {
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
                return "GetWarehousesError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GetWarehousesError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GetWarehousesError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GetWarehousesError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GetWarehousesError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GetWarehousesError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Список складов и групп складов
    /// - GET /businesses/{businessId}/warehouses
    /// - Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    /// - returns: AnyPublisher<GetWarehousesResponse, Error> 
    open func getWarehouses(businessId: Int64) -> AnyPublisher<GetWarehousesResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/businesses/{businessId}/warehouses"
                localVarPath = localVarPath.replacingOccurrences(of: "{businessId}", with: "\(businessId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                let components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetWarehousesResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GetWarehousesError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GetWarehousesError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GetWarehousesError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GetWarehousesError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GetWarehousesError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GetWarehousesError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetWarehousesResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }
}
