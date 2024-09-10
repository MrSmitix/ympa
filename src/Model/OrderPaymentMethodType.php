<?php
/**
 * OrderPaymentMethodType
 *
 * PHP version 8.1
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * @generated Generated by: https://openapi-generator.tech
 * Generator version: 7.8.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

/**
 * OrderPaymentMethodType Class Doc Comment
 *
 * @description Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;PREPAID\&quot;&#x60;):    * &#x60;YANDEX&#x60; — банковской картой.    * &#x60;APPLE_PAY&#x60; — Apple Pay.    * &#x60;GOOGLE_PAY&#x60; — Google Pay.    * &#x60;CREDIT&#x60; — в кредит.    * &#x60;TINKOFF_CREDIT&#x60; — в кредит в Тинькофф Банке.    * &#x60;TINKOFF_INSTALLMENTS&#x60; — рассрочка в Тинькофф Банке.    * &#x60;EXTERNAL_CERTIFICATE&#x60; — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * &#x60;SBP&#x60; — через систему быстрых платежей.    * &#x60;B2B_ACCOUNT_PREPAYMENT&#x60; — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;POSTPAID\&quot;&#x60;):    * &#x60;CARD_ON_DELIVERY&#x60; — банковской картой.    * &#x60;BOUND_CARD_ON_DELIVERY&#x60; — привязанной картой при получении.    * &#x60;CASH_ON_DELIVERY&#x60; — наличными.    * &#x60;B2B_ACCOUNT_POSTPAYMENT&#x60; — заказ оплачивает организация после доставки.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Значение по умолчанию: &#x60;CASH_ON_DELIVERY&#x60;.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
enum OrderPaymentMethodType: string
{
    case CASH_ON_DELIVERY = 'CASH_ON_DELIVERY';

    case CARD_ON_DELIVERY = 'CARD_ON_DELIVERY';

    case BOUND_CARD_ON_DELIVERY = 'BOUND_CARD_ON_DELIVERY';

    case YANDEX = 'YANDEX';

    case APPLE_PAY = 'APPLE_PAY';

    case EXTERNAL_CERTIFICATE = 'EXTERNAL_CERTIFICATE';

    case CREDIT = 'CREDIT';

    case GOOGLE_PAY = 'GOOGLE_PAY';

    case TINKOFF_CREDIT = 'TINKOFF_CREDIT';

    case SBP = 'SBP';

    case TINKOFF_INSTALLMENTS = 'TINKOFF_INSTALLMENTS';

    case B2_B_ACCOUNT_PREPAYMENT = 'B2B_ACCOUNT_PREPAYMENT';

    case B2_B_ACCOUNT_POSTPAYMENT = 'B2B_ACCOUNT_POSTPAYMENT';

    case UNKNOWN = 'UNKNOWN';

}

