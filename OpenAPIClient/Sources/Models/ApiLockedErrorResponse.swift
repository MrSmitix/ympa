//
// ApiLockedErrorResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Ресурс из запроса заблокирован от применения к нему указанного метода. 
public struct ApiLockedErrorResponse: Codable {
    public var status: ApiResponseStatusType?
    /// Список ошибок.
    public var errors: [ApiErrorDTO]?

    public init(status: ApiResponseStatusType? = nil, errors: [ApiErrorDTO]? = nil) {
        self.status = status
        self.errors = errors
    }
}
