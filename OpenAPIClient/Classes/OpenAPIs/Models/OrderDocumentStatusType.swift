//
// OrderDocumentStatusType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Статус документа:  * &#x60;READY&#x60; — готов. * &#x60;NOT_READY&#x60; — не готов.  */
public enum OrderDocumentStatusType: String, Codable, CaseIterable {
    case ready = "READY"
    case notReady = "NOT_READY"
}
