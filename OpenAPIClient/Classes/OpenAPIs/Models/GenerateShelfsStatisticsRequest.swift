//
// GenerateShelfsStatisticsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Данные, необходимые для генерации отчета.  */
public struct GenerateShelfsStatisticsRequest: Codable, JSONEncodable, Hashable {

    /** Идентификатор бизнеса. */
    public var businessId: Int64
    /** Начало периода, включительно. */
    public var dateFrom: Date
    /** Конец периода, включительно. */
    public var dateTo: Date
    public var attributionType: ShelfsStatisticsAttributionType

    public init(businessId: Int64, dateFrom: Date, dateTo: Date, attributionType: ShelfsStatisticsAttributionType) {
        self.businessId = businessId
        self.dateFrom = dateFrom
        self.dateTo = dateTo
        self.attributionType = attributionType
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case businessId
        case dateFrom
        case dateTo
        case attributionType
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(businessId, forKey: .businessId)
        try container.encode(dateFrom, forKey: .dateFrom)
        try container.encode(dateTo, forKey: .dateTo)
        try container.encode(attributionType, forKey: .attributionType)
    }
}

