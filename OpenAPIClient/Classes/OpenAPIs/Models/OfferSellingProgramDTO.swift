//
// OfferSellingProgramDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация о том, по каким моделям можно продавать товар, а по каким нельзя. */
public struct OfferSellingProgramDTO: Codable, JSONEncodable, Hashable {

    public var sellingProgram: SellingProgramType
    public var status: OfferSellingProgramStatusType

    public init(sellingProgram: SellingProgramType, status: OfferSellingProgramStatusType) {
        self.sellingProgram = sellingProgram
        self.status = status
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case sellingProgram
        case status
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(sellingProgram, forKey: .sellingProgram)
        try container.encode(status, forKey: .status)
    }
}

