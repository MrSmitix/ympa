//
// GenerateStocksOnWarehousesReportRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Данные, необходимые для генерации отчета.  */
public struct GenerateStocksOnWarehousesReportRequest: Codable, JSONEncodable, Hashable {

    /** Идентификатор магазина. */
    public var campaignId: Int64
    /** Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). */
    public var warehouseIds: [Int64]?
    /** Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. */
    public var reportDate: Date?
    /** Фильтр по категориям на Маркете (кроме модели FBY). */
    public var categoryIds: [Int64]?
    /** Фильтр по наличию остатков (кроме модели FBY). */
    public var hasStocks: Bool?

    public init(campaignId: Int64, warehouseIds: [Int64]? = nil, reportDate: Date? = nil, categoryIds: [Int64]? = nil, hasStocks: Bool? = nil) {
        self.campaignId = campaignId
        self.warehouseIds = warehouseIds
        self.reportDate = reportDate
        self.categoryIds = categoryIds
        self.hasStocks = hasStocks
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case campaignId
        case warehouseIds
        case reportDate
        case categoryIds
        case hasStocks
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(campaignId, forKey: .campaignId)
        try container.encodeIfPresent(warehouseIds, forKey: .warehouseIds)
        try container.encodeIfPresent(reportDate, forKey: .reportDate)
        try container.encodeIfPresent(categoryIds, forKey: .categoryIds)
        try container.encodeIfPresent(hasStocks, forKey: .hasStocks)
    }
}

