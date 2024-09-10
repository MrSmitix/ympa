//
// RatingsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech

import Foundation
import Combine
import OpenAPITransport


open class RatingsAPI {
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

    public enum GetQualityRatingDetailsError: Error, CustomStringConvertible {
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
                return "GetQualityRatingDetailsError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GetQualityRatingDetailsError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GetQualityRatingDetailsError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GetQualityRatingDetailsError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GetQualityRatingDetailsError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GetQualityRatingDetailsError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Заказы, которые повлияли на индекс качества
    /// - POST /campaigns/{campaignId}/ratings/quality/details
    /// - Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    /// - returns: AnyPublisher<GetQualityRatingDetailsResponse, Error> 
    open func getQualityRatingDetails(campaignId: Int64) -> AnyPublisher<GetQualityRatingDetailsResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/campaigns/{campaignId}/ratings/quality/details"
                localVarPath = localVarPath.replacingOccurrences(of: "{campaignId}", with: "\(campaignId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                let components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "POST"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetQualityRatingDetailsResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GetQualityRatingDetailsError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GetQualityRatingDetailsError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GetQualityRatingDetailsError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GetQualityRatingDetailsError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GetQualityRatingDetailsError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GetQualityRatingDetailsError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetQualityRatingDetailsResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }

    public enum GetQualityRatingsError: Error, CustomStringConvertible {
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
                return "GetQualityRatingsError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GetQualityRatingsError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GetQualityRatingsError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GetQualityRatingsError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GetQualityRatingsError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GetQualityRatingsError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Индекс качества магазинов
    /// - POST /businesses/{businessId}/ratings/quality
    /// - Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter businessId: (path) Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    /// - parameter getQualityRatingRequest: (body)  
    /// - returns: AnyPublisher<GetQualityRatingResponse, Error> 
    open func getQualityRatings(businessId: Int64, getQualityRatingRequest: GetQualityRatingRequest) -> AnyPublisher<GetQualityRatingResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/businesses/{businessId}/ratings/quality"
                localVarPath = localVarPath.replacingOccurrences(of: "{businessId}", with: "\(businessId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                let components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "POST"
                request.httpBody = try self.encoder.encode(getQualityRatingRequest)
                request.setValue("application/json", forHTTPHeaderField: "Content-Type")
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetQualityRatingResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GetQualityRatingsError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GetQualityRatingsError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GetQualityRatingsError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GetQualityRatingsError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GetQualityRatingsError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GetQualityRatingsError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetQualityRatingResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }
}
