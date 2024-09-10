//
// ShipmentInfoDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Список с информацией об отгрузках. */
public struct ShipmentInfoDTO: Codable, JSONEncodable, Hashable {

    static let orderIdsRule = ArrayRule(minItems: nil, maxItems: nil, uniqueItems: true)
    /** Идентификатор отгрузки. */
    public var id: Int64?
    /** Начало планового интервала отгрузки. */
    public var planIntervalFrom: Date?
    /** Конец планового интервала отгрузки. */
    public var planIntervalTo: Date?
    public var shipmentType: ShipmentType?
    public var warehouse: PartnerShipmentWarehouseDTO?
    public var warehouseTo: PartnerShipmentWarehouseDTO?
    /** Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. */
    public var externalId: String?
    public var deliveryService: DeliveryServiceDTO?
    public var palletsCount: PalletsCountDTO?
    /** Идентификаторы заказов в отгрузке. */
    public var orderIds: Set<Int64>
    /** Количество заказов, которое Маркет запланировал к отгрузке. */
    public var draftCount: Int?
    /** Количество заказов, которое Маркет подтвердил к отгрузке. */
    public var plannedCount: Int?
    /** Количество заказов, принятых в сортировочном центре или пункте приема. */
    public var factCount: Int?
    public var status: ShipmentStatusType?
    /** Описание статуса отгрузки. */
    public var statusDescription: String?
    /** Время последнего изменения статуса отгрузки. */
    public var statusUpdateTime: Date?

    public init(id: Int64? = nil, planIntervalFrom: Date? = nil, planIntervalTo: Date? = nil, shipmentType: ShipmentType? = nil, warehouse: PartnerShipmentWarehouseDTO? = nil, warehouseTo: PartnerShipmentWarehouseDTO? = nil, externalId: String? = nil, deliveryService: DeliveryServiceDTO? = nil, palletsCount: PalletsCountDTO? = nil, orderIds: Set<Int64>, draftCount: Int? = nil, plannedCount: Int? = nil, factCount: Int? = nil, status: ShipmentStatusType? = nil, statusDescription: String? = nil, statusUpdateTime: Date? = nil) {
        self.id = id
        self.planIntervalFrom = planIntervalFrom
        self.planIntervalTo = planIntervalTo
        self.shipmentType = shipmentType
        self.warehouse = warehouse
        self.warehouseTo = warehouseTo
        self.externalId = externalId
        self.deliveryService = deliveryService
        self.palletsCount = palletsCount
        self.orderIds = orderIds
        self.draftCount = draftCount
        self.plannedCount = plannedCount
        self.factCount = factCount
        self.status = status
        self.statusDescription = statusDescription
        self.statusUpdateTime = statusUpdateTime
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case planIntervalFrom
        case planIntervalTo
        case shipmentType
        case warehouse
        case warehouseTo
        case externalId
        case deliveryService
        case palletsCount
        case orderIds
        case draftCount
        case plannedCount
        case factCount
        case status
        case statusDescription
        case statusUpdateTime
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(planIntervalFrom, forKey: .planIntervalFrom)
        try container.encodeIfPresent(planIntervalTo, forKey: .planIntervalTo)
        try container.encodeIfPresent(shipmentType, forKey: .shipmentType)
        try container.encodeIfPresent(warehouse, forKey: .warehouse)
        try container.encodeIfPresent(warehouseTo, forKey: .warehouseTo)
        try container.encodeIfPresent(externalId, forKey: .externalId)
        try container.encodeIfPresent(deliveryService, forKey: .deliveryService)
        try container.encodeIfPresent(palletsCount, forKey: .palletsCount)
        try container.encode(orderIds, forKey: .orderIds)
        try container.encodeIfPresent(draftCount, forKey: .draftCount)
        try container.encodeIfPresent(plannedCount, forKey: .plannedCount)
        try container.encodeIfPresent(factCount, forKey: .factCount)
        try container.encodeIfPresent(status, forKey: .status)
        try container.encodeIfPresent(statusDescription, forKey: .statusDescription)
        try container.encodeIfPresent(statusUpdateTime, forKey: .statusUpdateTime)
    }
}

