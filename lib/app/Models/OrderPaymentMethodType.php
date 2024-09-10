<?php
/**
 * OrderPaymentMethodType
 */
namespace app\Models;

/**
 * OrderPaymentMethodType
 * @description Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (`\"paymentType\": \"PREPAID\"`):    * `YANDEX` — банковской картой.    * `APPLE_PAY` — Apple Pay.    * `GOOGLE_PAY` — Google Pay.    * `CREDIT` — в кредит.    * `TINKOFF_CREDIT` — в кредит в Тинькофф Банке.    * `TINKOFF_INSTALLMENTS` — рассрочка в Тинькофф Банке.    * `EXTERNAL_CERTIFICATE` — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * `SBP` — через систему быстрых платежей.    * `B2B_ACCOUNT_PREPAYMENT` — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (`\"paymentType\": \"POSTPAID\"`):    * `CARD_ON_DELIVERY` — банковской картой.    * `BOUND_CARD_ON_DELIVERY` — привязанной картой при получении.    * `CASH_ON_DELIVERY` — наличными.    * `B2B_ACCOUNT_POSTPAYMENT` — заказ оплачивает организация после доставки.  * `UNKNOWN` — неизвестный тип.  Значение по умолчанию: `CASH_ON_DELIVERY`.
 */
class OrderPaymentMethodType
{
    /**
     * Possible values of this enum
     */
    const CASH_ON_DELIVERY = 'CASH_ON_DELIVERY';

    const CARD_ON_DELIVERY = 'CARD_ON_DELIVERY';

    const BOUND_CARD_ON_DELIVERY = 'BOUND_CARD_ON_DELIVERY';

    const YANDEX = 'YANDEX';

    const APPLE_PAY = 'APPLE_PAY';

    const EXTERNAL_CERTIFICATE = 'EXTERNAL_CERTIFICATE';

    const CREDIT = 'CREDIT';

    const GOOGLE_PAY = 'GOOGLE_PAY';

    const TINKOFF_CREDIT = 'TINKOFF_CREDIT';

    const SBP = 'SBP';

    const TINKOFF_INSTALLMENTS = 'TINKOFF_INSTALLMENTS';

    const B2_B_ACCOUNT_PREPAYMENT = 'B2B_ACCOUNT_PREPAYMENT';

    const B2_B_ACCOUNT_POSTPAYMENT = 'B2B_ACCOUNT_POSTPAYMENT';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CASH_ON_DELIVERY,
            self::CARD_ON_DELIVERY,
            self::BOUND_CARD_ON_DELIVERY,
            self::YANDEX,
            self::APPLE_PAY,
            self::EXTERNAL_CERTIFICATE,
            self::CREDIT,
            self::GOOGLE_PAY,
            self::TINKOFF_CREDIT,
            self::SBP,
            self::TINKOFF_INSTALLMENTS,
            self::B2_B_ACCOUNT_PREPAYMENT,
            self::B2_B_ACCOUNT_POSTPAYMENT,
            self::UNKNOWN
        ];
    }
}
