/*
 * order_payment_method_type.h
 *
 * Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;PREPAID\&quot;&#x60;):    * &#x60;YANDEX&#x60; — банковской картой.    * &#x60;APPLE_PAY&#x60; — Apple Pay.    * &#x60;GOOGLE_PAY&#x60; — Google Pay.    * &#x60;CREDIT&#x60; — в кредит.    * &#x60;TINKOFF_CREDIT&#x60; — в кредит в Тинькофф Банке.    * &#x60;TINKOFF_INSTALLMENTS&#x60; — рассрочка в Тинькофф Банке.    * &#x60;EXTERNAL_CERTIFICATE&#x60; — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * &#x60;SBP&#x60; — через систему быстрых платежей.    * &#x60;B2B_ACCOUNT_PREPAYMENT&#x60; — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;POSTPAID\&quot;&#x60;):    * &#x60;CARD_ON_DELIVERY&#x60; — банковской картой.    * &#x60;BOUND_CARD_ON_DELIVERY&#x60; — привязанной картой при получении.    * &#x60;CASH_ON_DELIVERY&#x60; — наличными.    * &#x60;B2B_ACCOUNT_POSTPAYMENT&#x60; — заказ оплачивает организация после доставки.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Значение по умолчанию: &#x60;CASH_ON_DELIVERY&#x60;. 
 */

#ifndef _order_payment_method_type_H_
#define _order_payment_method_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_payment_method_type_t order_payment_method_type_t;


// Enum  for order_payment_method_type

typedef enum { _api__order_payment_method_type__NULL = 0, _api__order_payment_method_type__CASH_ON_DELIVERY, _api__order_payment_method_type__CARD_ON_DELIVERY, _api__order_payment_method_type__BOUND_CARD_ON_DELIVERY, _api__order_payment_method_type__YANDEX, _api__order_payment_method_type__APPLE_PAY, _api__order_payment_method_type__EXTERNAL_CERTIFICATE, _api__order_payment_method_type__CREDIT, _api__order_payment_method_type__GOOGLE_PAY, _api__order_payment_method_type__TINKOFF_CREDIT, _api__order_payment_method_type__SBP, _api__order_payment_method_type__TINKOFF_INSTALLMENTS, _api__order_payment_method_type__B2B_ACCOUNT_PREPAYMENT, _api__order_payment_method_type__B2B_ACCOUNT_POSTPAYMENT, _api__order_payment_method_type__UNKNOWN } _api__order_payment_method_type__e;

char* order_payment_method_type_order_payment_method_type_ToString(_api__order_payment_method_type__e order_payment_method_type);

_api__order_payment_method_type__e order_payment_method_type_order_payment_method_type_FromString(char* order_payment_method_type);

//cJSON *order_payment_method_type_order_payment_method_type_convertToJSON(_api__order_payment_method_type__e order_payment_method_type);

//_api__order_payment_method_type__e order_payment_method_type_order_payment_method_type_parseFromJSON(cJSON *order_payment_method_typeJSON);

#endif /* _order_payment_method_type_H_ */

