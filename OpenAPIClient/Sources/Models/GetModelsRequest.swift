//
// GetModelsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Запрос информации о моделях. 
public struct GetModelsRequest: Codable {
    /// Список моделей.
    public var models: [Int64]

    public init(models: [Int64]) {
        self.models = models
    }
}
