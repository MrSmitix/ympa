//
// GetCategoriesMaxSaleQuantumDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Категории и лимит на установку кванта и минимального количества товаров. 
public struct GetCategoriesMaxSaleQuantumDTO: Codable {
    /// Категории и лимит на установку кванта и минимального количества товаров.
    public var results: [MaxSaleQuantumDTO]
    /// Ошибки, которые появились из-за переданных категорий.
    public var errors: [CategoryErrorDTO]?

    public init(results: [MaxSaleQuantumDTO], errors: [CategoryErrorDTO]? = nil) {
        self.results = results
        self.errors = errors
    }
}
