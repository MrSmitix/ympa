<?php
/**
 * RefundStatusType
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
 * RefundStatusType Class Doc Comment
 *
 * @description Cтатус возврата денег:  * &#x60;STARTED_BY_USER&#x60; — создан клиентом из личного кабинета.  * &#x60;REFUND_IN_PROGRESS&#x60; — ждет решение о возврате денег.  * &#x60;REFUNDED&#x60; — по возврату проведены все возвратные денежные транзакции.  * &#x60;FAILED&#x60; — невозможно провести возврат покупателю.  * &#x60;WAITING_FOR_DECISION&#x60; — ожидает решения.  * &#x60;DECISION_MADE&#x60; — по возврату принято решение.  * &#x60;REFUNDED_WITH_BONUSES&#x60; — возврат осуществлен баллами Плюса или промокодом.  * &#x60;REFUNDED_BY_SHOP&#x60; — магазин сделал самостоятельно возврат денег.  * &#x60;COMPLETE_WITHOUT_REFUND&#x60; — возврат денег не требуется.  * &#x60;CANCELLED&#x60; — возврат отменен.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
enum RefundStatusType: string
{
    case STARTED_BY_USER = 'STARTED_BY_USER';

    case REFUND_IN_PROGRESS = 'REFUND_IN_PROGRESS';

    case REFUNDED = 'REFUNDED';

    case FAILED = 'FAILED';

    case WAITING_FOR_DECISION = 'WAITING_FOR_DECISION';

    case DECISION_MADE = 'DECISION_MADE';

    case REFUNDED_WITH_BONUSES = 'REFUNDED_WITH_BONUSES';

    case REFUNDED_BY_SHOP = 'REFUNDED_BY_SHOP';

    case CANCELLED = 'CANCELLED';

    case COMPLETE_WITHOUT_REFUND = 'COMPLETE_WITHOUT_REFUND';

    case UNKNOWN = 'UNKNOWN';

}


