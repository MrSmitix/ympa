//
// OutletStatusType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Статус точки продаж.  Возможные значения:  * &#x60;AT_MODERATION&#x60; — проверяется. * &#x60;FAILED&#x60; — не прошла проверку и отклонена модератором. * &#x60;MODERATED&#x60; — проверена и одобрена. * &#x60;NONMODERATED&#x60; — новая точка, нуждается в проверке.  */
public enum OutletStatusType: String, Codable, CaseIterable {
    case atModeration = "AT_MODERATION"
    case failed = "FAILED"
    case moderated = "MODERATED"
    case nonmoderated = "NONMODERATED"
    case unknown = "UNKNOWN"
}
