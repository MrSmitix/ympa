//
// OrderPaymentMethodType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;PREPAID\&quot;&#x60;):    * &#x60;YANDEX&#x60; — банковской картой.    * &#x60;APPLE_PAY&#x60; — Apple Pay.    * &#x60;GOOGLE_PAY&#x60; — Google Pay.    * &#x60;CREDIT&#x60; — в кредит.    * &#x60;TINKOFF_CREDIT&#x60; — в кредит в Тинькофф Банке.    * &#x60;TINKOFF_INSTALLMENTS&#x60; — рассрочка в Тинькофф Банке.    * &#x60;EXTERNAL_CERTIFICATE&#x60; — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * &#x60;SBP&#x60; — через систему быстрых платежей.    * &#x60;B2B_ACCOUNT_PREPAYMENT&#x60; — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;POSTPAID\&quot;&#x60;):    * &#x60;CARD_ON_DELIVERY&#x60; — банковской картой.    * &#x60;BOUND_CARD_ON_DELIVERY&#x60; — привязанной картой при получении.    * &#x60;CASH_ON_DELIVERY&#x60; — наличными.    * &#x60;B2B_ACCOUNT_POSTPAYMENT&#x60; — заказ оплачивает организация после доставки.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Значение по умолчанию: &#x60;CASH_ON_DELIVERY&#x60;.  */
public enum OrderPaymentMethodType: String, Codable, CaseIterable {
    case cashOnDelivery = "CASH_ON_DELIVERY"
    case cardOnDelivery = "CARD_ON_DELIVERY"
    case boundCardOnDelivery = "BOUND_CARD_ON_DELIVERY"
    case yandex = "YANDEX"
    case applePay = "APPLE_PAY"
    case externalCertificate = "EXTERNAL_CERTIFICATE"
    case credit = "CREDIT"
    case googlePay = "GOOGLE_PAY"
    case tinkoffCredit = "TINKOFF_CREDIT"
    case sbp = "SBP"
    case tinkoffInstallments = "TINKOFF_INSTALLMENTS"
    case b2bAccountPrepayment = "B2B_ACCOUNT_PREPAYMENT"
    case b2bAccountPostpayment = "B2B_ACCOUNT_POSTPAYMENT"
    case unknown = "UNKNOWN"
}
