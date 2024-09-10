//
// OfferProcessingStateDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Информация о статусе публикации товара на Маркете. */
public struct OfferProcessingStateDTO: Codable, JSONEncodable, Hashable {

    public var status: OfferProcessingStatusType?
    /** Причины, по которым товар не прошел модерацию. */
    public var notes: [OfferProcessingNoteDTO]?

    public init(status: OfferProcessingStatusType? = nil, notes: [OfferProcessingNoteDTO]? = nil) {
        self.status = status
        self.notes = notes
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case status
        case notes
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(status, forKey: .status)
        try container.encodeIfPresent(notes, forKey: .notes)
    }
}

