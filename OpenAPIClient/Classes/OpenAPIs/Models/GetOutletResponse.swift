//
// GetOutletResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Ответ на запрос информации о точке продаж. */
public struct GetOutletResponse: Codable, JSONEncodable, Hashable {

    public var outlet: FullOutletDTO?

    public init(outlet: FullOutletDTO? = nil) {
        self.outlet = outlet
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case outlet
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(outlet, forKey: .outlet)
    }
}

