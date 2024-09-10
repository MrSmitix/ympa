//
// OrderLabelsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech

import Foundation
import Combine
import OpenAPITransport


open class OrderLabelsAPI {
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

    public enum GenerateOrderLabelError: Error, CustomStringConvertible {
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
                return "GenerateOrderLabelError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GenerateOrderLabelError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GenerateOrderLabelError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GenerateOrderLabelError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GenerateOrderLabelError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GenerateOrderLabelError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Готовый ярлык‑наклейка для коробки в заказе
    /// - GET /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label
    /// - Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    /// - parameter orderId: (path) Идентификатор заказа. 
    /// - parameter shipmentId: (path) Идентификатор грузоместа. 
    /// - parameter boxId: (path) Идентификатор коробки. 
    /// - parameter format: (query) Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)
    /// - returns: AnyPublisher<Data, Error> 
    open func generateOrderLabel(campaignId: Int64, orderId: Int64, shipmentId: Int64, boxId: Int64, format: PageFormatType? = nil) -> AnyPublisher<Data, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label"
                localVarPath = localVarPath.replacingOccurrences(of: "{campaignId}", with: "\(campaignId)")
                localVarPath = localVarPath.replacingOccurrences(of: "{orderId}", with: "\(orderId)")
                localVarPath = localVarPath.replacingOccurrences(of: "{shipmentId}", with: "\(shipmentId)")
                localVarPath = localVarPath.replacingOccurrences(of: "{boxId}", with: "\(boxId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                var components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                var queryItems: [URLQueryItem] = []
                if let format = format { queryItems.append(URLQueryItem(name: "format", value: format.rawValue)) } 
                components?.queryItems = queryItems
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<Data, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(Data.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }

    public enum GenerateOrderLabelsError: Error, CustomStringConvertible {
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
                return "GenerateOrderLabelsError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GenerateOrderLabelsError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GenerateOrderLabelsError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GenerateOrderLabelsError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GenerateOrderLabelsError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GenerateOrderLabelsError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Готовые ярлыки‑наклейки на все коробки в одном заказе
    /// - GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels
    /// - Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    /// - parameter orderId: (path) Идентификатор заказа. 
    /// - parameter format: (query) Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)
    /// - returns: AnyPublisher<Data, Error> 
    open func generateOrderLabels(campaignId: Int64, orderId: Int64, format: PageFormatType? = nil) -> AnyPublisher<Data, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels"
                localVarPath = localVarPath.replacingOccurrences(of: "{campaignId}", with: "\(campaignId)")
                localVarPath = localVarPath.replacingOccurrences(of: "{orderId}", with: "\(orderId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                var components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                var queryItems: [URLQueryItem] = []
                if let format = format { queryItems.append(URLQueryItem(name: "format", value: format.rawValue)) } 
                components?.queryItems = queryItems
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<Data, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelsError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelsError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelsError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelsError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelsError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GenerateOrderLabelsError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(Data.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }

    public enum GetOrderLabelsDataError: Error, CustomStringConvertible {
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
                return "GetOrderLabelsDataError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GetOrderLabelsDataError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GetOrderLabelsDataError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GetOrderLabelsDataError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GetOrderLabelsDataError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GetOrderLabelsDataError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Данные для самостоятельного изготовления ярлыков
    /// - GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data
    /// - Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    /// - parameter orderId: (path) Идентификатор заказа. 
    /// - returns: AnyPublisher<GetOrderLabelsDataResponse, Error> 
    open func getOrderLabelsData(campaignId: Int64, orderId: Int64) -> AnyPublisher<GetOrderLabelsDataResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data"
                localVarPath = localVarPath.replacingOccurrences(of: "{campaignId}", with: "\(campaignId)")
                localVarPath = localVarPath.replacingOccurrences(of: "{orderId}", with: "\(orderId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                let components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetOrderLabelsDataResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GetOrderLabelsDataError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GetOrderLabelsDataError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GetOrderLabelsDataError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GetOrderLabelsDataError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GetOrderLabelsDataError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GetOrderLabelsDataError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetOrderLabelsDataResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }
}
