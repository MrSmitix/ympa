//
// GoodsFeedbackCommentAuthorDTO.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Информация об авторе комментария. 
public struct GoodsFeedbackCommentAuthorDTO: Codable {
    public var type: GoodsFeedbackCommentAuthorType?
    /// Имя автора или название кабинета.
    public var name: String?

    public init(type: GoodsFeedbackCommentAuthorType? = nil, name: String? = nil) {
        self.type = type
        self.name = name
    }
}
