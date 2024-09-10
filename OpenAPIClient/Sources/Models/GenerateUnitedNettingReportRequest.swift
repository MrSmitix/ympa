//
// GenerateUnitedNettingReportRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры.  
public struct GenerateUnitedNettingReportRequest: Codable {
    /// Идентификатор бизнеса.
    public var businessId: Int64
    /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
    public var dateTimeFrom: Date?
    /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
    public var dateTimeTo: Date?
    /// Начало периода, включительно.
    public var dateFrom: Date?
    /// Конец периода, включительно. Максимальный период — 1 год.
    public var dateTo: Date?
    /// Номер платежного поручения.
    public var bankOrderId: Int64?
    /// Дата платежного поручения.
    public var bankOrderDateTime: Date?
    /// Список моделей, которые нужны в отчете. 
    public var placementPrograms: [PlacementType]?
    /// Список ИНН, которые нужны в отчете.
    public var inns: [String]?
    /// Список магазинов, которые нужны в отчете.
    public var campaignIds: [Int64]?

    public init(businessId: Int64, dateTimeFrom: Date? = nil, dateTimeTo: Date? = nil, dateFrom: Date? = nil, dateTo: Date? = nil, bankOrderId: Int64? = nil, bankOrderDateTime: Date? = nil, placementPrograms: [PlacementType]? = nil, inns: [String]? = nil, campaignIds: [Int64]? = nil) {
        self.businessId = businessId
        self.dateTimeFrom = dateTimeFrom
        self.dateTimeTo = dateTimeTo
        self.dateFrom = dateFrom
        self.dateTo = dateTo
        self.bankOrderId = bankOrderId
        self.bankOrderDateTime = bankOrderDateTime
        self.placementPrograms = placementPrograms
        self.inns = inns
        self.campaignIds = campaignIds
    }
}
