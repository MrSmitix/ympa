//
// EnrichedOrderBoxLayoutDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация о коробке. 
public struct EnrichedOrderBoxLayoutDTO: Codable {
    /// Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
    public var items: [OrderBoxLayoutItemDTO]
    /// Идентификатор коробки.
    public var boxId: Int64?

    public init(items: [OrderBoxLayoutItemDTO], boxId: Int64? = nil) {
        self.items = items
        self.boxId = boxId
    }
}
