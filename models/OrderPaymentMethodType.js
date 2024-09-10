const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (`\"paymentType\": \"PREPAID\"`):    * `YANDEX` — банковской картой.    * `APPLE_PAY` — Apple Pay.    * `GOOGLE_PAY` — Google Pay.    * `CREDIT` — в кредит.    * `TINKOFF_CREDIT` — в кредит в Тинькофф Банке.    * `TINKOFF_INSTALLMENTS` — рассрочка в Тинькофф Банке.    * `EXTERNAL_CERTIFICATE` — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * `SBP` — через систему быстрых платежей.    * `B2B_ACCOUNT_PREPAYMENT` — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (`\"paymentType\": \"POSTPAID\"`):    * `CARD_ON_DELIVERY` — банковской картой.    * `BOUND_CARD_ON_DELIVERY` — привязанной картой при получении.    * `CASH_ON_DELIVERY` — наличными.    * `B2B_ACCOUNT_POSTPAYMENT` — заказ оплачивает организация после доставки.  * `UNKNOWN` — неизвестный тип.  Значение по умолчанию: `CASH_ON_DELIVERY`.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CASH_ON_DELIVERY',
                    'CARD_ON_DELIVERY',
                    'BOUND_CARD_ON_DELIVERY',
                    'YANDEX',
                    'APPLE_PAY',
                    'EXTERNAL_CERTIFICATE',
                    'CREDIT',
                    'GOOGLE_PAY',
                    'TINKOFF_CREDIT',
                    'SBP',
                    'TINKOFF_INSTALLMENTS',
                    'B2B_ACCOUNT_PREPAYMENT',
                    'B2B_ACCOUNT_POSTPAYMENT',
                    'UNKNOWN',
                ],
            }
        )
    }
