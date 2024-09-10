//
// WarehousesDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация о складах и группах складов. 
public struct WarehousesDTO: Codable {
    /// Список складов, не входящих в группы.
    public var warehouses: [WarehouseDTO]
    /// Список групп складов.
    public var warehouseGroups: [WarehouseGroupDTO]

    public init(warehouses: [WarehouseDTO], warehouseGroups: [WarehouseGroupDTO]) {
        self.warehouses = warehouses
        self.warehouseGroups = warehouseGroups
    }
}
