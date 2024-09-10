//
// GetOrderLabelsDataResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Ответ с информацией для печати ярлыков. */
public struct GetOrderLabelsDataResponse: Codable, JSONEncodable, Hashable {

    public var status: ApiResponseStatusType?
    public var result: OrderLabelDTO?

    public init(status: ApiResponseStatusType? = nil, result: OrderLabelDTO? = nil) {
        self.status = status
        self.result = result
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case status
        case result
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(status, forKey: .status)
        try container.encodeIfPresent(result, forKey: .result)
    }
}

