//
// FeedbacksAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech

import Foundation
import Combine
import OpenAPITransport


open class FeedbacksAPI {
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

    public enum GetFeedbackAndCommentUpdatesError: Error, CustomStringConvertible {
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
                return "GetFeedbackAndCommentUpdatesError: Запрос содержит неправильные данные.: \(object)"
            case .code401Error(let object):
                return "GetFeedbackAndCommentUpdatesError: В запросе не указаны данные для авторизации.: \(object)"
            case .code403Error(let object):
                return "GetFeedbackAndCommentUpdatesError: Данные для авторизации неверны или доступ к ресурсу запрещен.: \(object)"
            case .code404Error(let object):
                return "GetFeedbackAndCommentUpdatesError: Запрашиваемый ресурс не найден.: \(object)"
            case .code420Error(let object):
                return "GetFeedbackAndCommentUpdatesError: Превышено ограничение на доступ к ресурсу.: \(object)"
            case .code500Error(let object):
                return "GetFeedbackAndCommentUpdatesError: Внутренняя ошибка сервера.: \(object)"
            }
        }
    }

    /// Новые и обновленные отзывы о магазине
    /// - GET /campaigns/{campaignId}/feedback/updates
    /// - {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
    /// - OAuth:
    /// - type: oauth2
    /// - name: OAuth
    /// - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    /// - parameter pageToken: (query) Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
    /// - parameter limit: (query) Количество значений на одной странице.  (optional)
    /// - parameter fromDate: (query) Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  (optional)
    /// - returns: AnyPublisher<GetFeedbackListResponse, Error> 
    @available(*, deprecated, message: "Deprecated API operation")
    open func getFeedbackAndCommentUpdates(campaignId: Int64, pageToken: String? = nil, limit: Int? = nil, fromDate: Date? = nil) -> AnyPublisher<GetFeedbackListResponse, Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                var localVarPath = "/campaigns/{campaignId}/feedback/updates"
                localVarPath = localVarPath.replacingOccurrences(of: "{campaignId}", with: "\(campaignId)")
                let localVarURL = baseURL.appendingPathComponent(localVarPath)
                var components = URLComponents(url: localVarURL, resolvingAgainstBaseURL: false)
                var queryItems: [URLQueryItem] = []
                if let pageToken = pageToken { queryItems.append(URLQueryItem(name: "page_token", value: pageToken)) } 
                if let limit = limit { queryItems.append(URLQueryItem(name: "limit", value: "\(limit)")) } 
                if let fromDate = fromDate { queryItems.append(URLQueryItem(name: "from_date", value: )) } 
                components?.queryItems = queryItems
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<GetFeedbackListResponse, Error> in 
            return self.transport.send(request: request)
                .mapError { transportError -> Error in 
                    if transportError.statusCode == 400 {
                        do {
                            let error = try self.decoder.decode(ApiClientDataErrorResponse.self, from: transportError.data)
                            return GetFeedbackAndCommentUpdatesError.code400Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 401 {
                        do {
                            let error = try self.decoder.decode(ApiUnauthorizedErrorResponse.self, from: transportError.data)
                            return GetFeedbackAndCommentUpdatesError.code401Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 403 {
                        do {
                            let error = try self.decoder.decode(ApiForbiddenErrorResponse.self, from: transportError.data)
                            return GetFeedbackAndCommentUpdatesError.code403Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 404 {
                        do {
                            let error = try self.decoder.decode(ApiNotFoundErrorResponse.self, from: transportError.data)
                            return GetFeedbackAndCommentUpdatesError.code404Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 420 {
                        do {
                            let error = try self.decoder.decode(ApiLimitErrorResponse.self, from: transportError.data)
                            return GetFeedbackAndCommentUpdatesError.code420Error(error)
                        } catch {
                            return error
                        }
                    }
                    if transportError.statusCode == 500 {
                        do {
                            let error = try self.decoder.decode(ApiServerErrorResponse.self, from: transportError.data)
                            return GetFeedbackAndCommentUpdatesError.code500Error(error)
                        } catch {
                            return error
                        }
                    }
                    return transportError
                }
                .tryMap { response in
                    try self.decoder.decode(GetFeedbackListResponse.self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }
}
