# OrderPaymentMethodType

Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (`\"paymentType\": \"PREPAID\"`):    * `YANDEX` — банковской картой.    * `APPLE_PAY` — Apple Pay.    * `GOOGLE_PAY` — Google Pay.    * `CREDIT` — в кредит.    * `TINKOFF_CREDIT` — в кредит в Тинькофф Банке.    * `TINKOFF_INSTALLMENTS` — рассрочка в Тинькофф Банке.    * `EXTERNAL_CERTIFICATE` — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * `SBP` — через систему быстрых платежей.    * `B2B_ACCOUNT_PREPAYMENT` — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (`\"paymentType\": \"POSTPAID\"`):    * `CARD_ON_DELIVERY` — банковской картой.    * `BOUND_CARD_ON_DELIVERY` — привязанной картой при получении.    * `CASH_ON_DELIVERY` — наличными.    * `B2B_ACCOUNT_POSTPAYMENT` — заказ оплачивает организация после доставки.  * `UNKNOWN` — неизвестный тип.  Значение по умолчанию: `CASH_ON_DELIVERY`. 

## Enum

* `CASH_ON_DELIVERY` (value: `'CASH_ON_DELIVERY'`)

* `CARD_ON_DELIVERY` (value: `'CARD_ON_DELIVERY'`)

* `BOUND_CARD_ON_DELIVERY` (value: `'BOUND_CARD_ON_DELIVERY'`)

* `YANDEX` (value: `'YANDEX'`)

* `APPLE_PAY` (value: `'APPLE_PAY'`)

* `EXTERNAL_CERTIFICATE` (value: `'EXTERNAL_CERTIFICATE'`)

* `CREDIT` (value: `'CREDIT'`)

* `GOOGLE_PAY` (value: `'GOOGLE_PAY'`)

* `TINKOFF_CREDIT` (value: `'TINKOFF_CREDIT'`)

* `SBP` (value: `'SBP'`)

* `TINKOFF_INSTALLMENTS` (value: `'TINKOFF_INSTALLMENTS'`)

* `B2_B_ACCOUNT_PREPAYMENT` (value: `'B2B_ACCOUNT_PREPAYMENT'`)

* `B2_B_ACCOUNT_POSTPAYMENT` (value: `'B2B_ACCOUNT_POSTPAYMENT'`)

* `UNKNOWN` (value: `'UNKNOWN'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


