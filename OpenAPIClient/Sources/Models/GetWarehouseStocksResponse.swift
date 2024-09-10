//
// GetWarehouseStocksResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct GetWarehouseStocksResponse: Codable {
    public var status: ApiResponseStatusType?
    public var result: GetWarehouseStocksDTO?

    public init(status: ApiResponseStatusType? = nil, result: GetWarehouseStocksDTO? = nil) {
        self.status = status
        self.result = result
    }
}
