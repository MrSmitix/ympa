<?php
/**
 * OrderSubstatusType
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */


namespace OpenAPIServer\Model;

/**
 * Class representing the OrderSubstatusType model.
 *
 * Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  * Значения для заказа в статусе &#x60;PROCESSING&#x60;:      * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать.      * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке.  * Значения для заказа в статусе &#x60;CANCELLED&#x60;:      * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.      * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.      * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.      * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.      * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.      * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.      * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.      * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.      * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.      * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:        * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;       * перерыв между первым и третьим звонком не менее 90 минут;       * соединение не короче 5 секунд.        Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.  * &#x60;TECHNICAL_ERROR&#x60; — техническая ошибка на стороне Маркета. Обратитесь в поддержку.  Также могут возвращаться другие значения. Обрабатывать их не требуется.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */
enum OrderSubstatusType: string
{
        case RESERVATION_EXPIRED = 'RESERVATION_EXPIRED';
        case USER_NOT_PAID = 'USER_NOT_PAID';
        case USER_UNREACHABLE = 'USER_UNREACHABLE';
        case USER_CHANGED_MIND = 'USER_CHANGED_MIND';
        case USER_REFUSED_DELIVERY = 'USER_REFUSED_DELIVERY';
        case USER_REFUSED_PRODUCT = 'USER_REFUSED_PRODUCT';
        case SHOP_FAILED = 'SHOP_FAILED';
        case USER_REFUSED_QUALITY = 'USER_REFUSED_QUALITY';
        case REPLACING_ORDER = 'REPLACING_ORDER';
        case PROCESSING_EXPIRED = 'PROCESSING_EXPIRED';
        case PENDING_EXPIRED = 'PENDING_EXPIRED';
        case SHOP_PENDING_CANCELLED = 'SHOP_PENDING_CANCELLED';
        case PENDING_CANCELLED = 'PENDING_CANCELLED';
        case USER_FRAUD = 'USER_FRAUD';
        case RESERVATION_FAILED = 'RESERVATION_FAILED';
        case USER_PLACED_OTHER_ORDER = 'USER_PLACED_OTHER_ORDER';
        case USER_BOUGHT_CHEAPER = 'USER_BOUGHT_CHEAPER';
        case MISSING_ITEM = 'MISSING_ITEM';
        case BROKEN_ITEM = 'BROKEN_ITEM';
        case WRONG_ITEM = 'WRONG_ITEM';
        case PICKUP_EXPIRED = 'PICKUP_EXPIRED';
        case DELIVERY_PROBLEMS = 'DELIVERY_PROBLEMS';
        case LATE_CONTACT = 'LATE_CONTACT';
        case CUSTOM = 'CUSTOM';
        case DELIVERY_SERVICE_FAILED = 'DELIVERY_SERVICE_FAILED';
        case WAREHOUSE_FAILED_TO_SHIP = 'WAREHOUSE_FAILED_TO_SHIP';
        case DELIVERY_SERIVCE_UNDELIVERED = 'DELIVERY_SERIVCE_UNDELIVERED';
        case DELIVERY_SERVICE_UNDELIVERED = 'DELIVERY_SERVICE_UNDELIVERED';
        case PREORDER = 'PREORDER';
        case AWAIT_CONFIRMATION = 'AWAIT_CONFIRMATION';
        case STARTED = 'STARTED';
        case PACKAGING = 'PACKAGING';
        case READY_TO_SHIP = 'READY_TO_SHIP';
        case SHIPPED = 'SHIPPED';
        case ASYNC_PROCESSING = 'ASYNC_PROCESSING';
        case USER_REFUSED_TO_PROVIDE_PERSONAL_DATA = 'USER_REFUSED_TO_PROVIDE_PERSONAL_DATA';
        case WAITING_USER_INPUT = 'WAITING_USER_INPUT';
        case WAITING_BANK_DECISION = 'WAITING_BANK_DECISION';
        case BANK_REJECT_CREDIT_OFFER = 'BANK_REJECT_CREDIT_OFFER';
        case CUSTOMER_REJECT_CREDIT_OFFER = 'CUSTOMER_REJECT_CREDIT_OFFER';
        case CREDIT_OFFER_FAILED = 'CREDIT_OFFER_FAILED';
        case AWAIT_DELIVERY_DATES_CONFIRMATION = 'AWAIT_DELIVERY_DATES_CONFIRMATION';
        case SERVICE_FAULT = 'SERVICE_FAULT';
        case DELIVERY_SERVICE_RECEIVED = 'DELIVERY_SERVICE_RECEIVED';
        case USER_RECEIVED = 'USER_RECEIVED';
        case WAITING_FOR_STOCKS = 'WAITING_FOR_STOCKS';
        case AS_PART_OF_MULTI_ORDER = 'AS_PART_OF_MULTI_ORDER';
        case READY_FOR_LAST_MILE = 'READY_FOR_LAST_MILE';
        case LAST_MILE_STARTED = 'LAST_MILE_STARTED';
        case ANTIFRAUD = 'ANTIFRAUD';
        case DELIVERY_USER_NOT_RECEIVED = 'DELIVERY_USER_NOT_RECEIVED';
        case DELIVERY_SERVICE_DELIVERED = 'DELIVERY_SERVICE_DELIVERED';
        case DELIVERED_USER_NOT_RECEIVED = 'DELIVERED_USER_NOT_RECEIVED';
        case USER_WANTED_ANOTHER_PAYMENT_METHOD = 'USER_WANTED_ANOTHER_PAYMENT_METHOD';
        case USER_RECEIVED_TECHNICAL_ERROR = 'USER_RECEIVED_TECHNICAL_ERROR';
        case USER_FORGOT_TO_USE_BONUS = 'USER_FORGOT_TO_USE_BONUS';
        case RECEIVED_ON_DISTRIBUTION_CENTER = 'RECEIVED_ON_DISTRIBUTION_CENTER';
        case DELIVERY_SERVICE_NOT_RECEIVED = 'DELIVERY_SERVICE_NOT_RECEIVED';
        case DELIVERY_SERVICE_LOST = 'DELIVERY_SERVICE_LOST';
        case SHIPPED_TO_WRONG_DELIVERY_SERVICE = 'SHIPPED_TO_WRONG_DELIVERY_SERVICE';
        case DELIVERED_USER_RECEIVED = 'DELIVERED_USER_RECEIVED';
        case WAITING_TINKOFF_DECISION = 'WAITING_TINKOFF_DECISION';
        case COURIER_SEARCH = 'COURIER_SEARCH';
        case COURIER_FOUND = 'COURIER_FOUND';
        case COURIER_IN_TRANSIT_TO_SENDER = 'COURIER_IN_TRANSIT_TO_SENDER';
        case COURIER_ARRIVED_TO_SENDER = 'COURIER_ARRIVED_TO_SENDER';
        case COURIER_RECEIVED = 'COURIER_RECEIVED';
        case COURIER_NOT_FOUND = 'COURIER_NOT_FOUND';
        case COURIER_NOT_DELIVER_ORDER = 'COURIER_NOT_DELIVER_ORDER';
        case COURIER_RETURNS_ORDER = 'COURIER_RETURNS_ORDER';
        case COURIER_RETURNED_ORDER = 'COURIER_RETURNED_ORDER';
        case WAITING_USER_DELIVERY_INPUT = 'WAITING_USER_DELIVERY_INPUT';
        case PICKUP_SERVICE_RECEIVED = 'PICKUP_SERVICE_RECEIVED';
        case PICKUP_USER_RECEIVED = 'PICKUP_USER_RECEIVED';
        case CANCELLED_COURIER_NOT_FOUND = 'CANCELLED_COURIER_NOT_FOUND';
        case COURIER_NOT_COME_FOR_ORDER = 'COURIER_NOT_COME_FOR_ORDER';
        case DELIVERY_NOT_MANAGED_REGION = 'DELIVERY_NOT_MANAGED_REGION';
        case INCOMPLETE_CONTACT_INFORMATION = 'INCOMPLETE_CONTACT_INFORMATION';
        case INCOMPLETE_MULTI_ORDER = 'INCOMPLETE_MULTI_ORDER';
        case INAPPROPRIATE_WEIGHT_SIZE = 'INAPPROPRIATE_WEIGHT_SIZE';
        case TECHNICAL_ERROR = 'TECHNICAL_ERROR';
        case SORTING_CENTER_LOST = 'SORTING_CENTER_LOST';
        case COURIER_SEARCH_NOT_STARTED = 'COURIER_SEARCH_NOT_STARTED';
        case LOST = 'LOST';
        case AWAIT_PAYMENT = 'AWAIT_PAYMENT';
        case AWAIT_LAVKA_RESERVATION = 'AWAIT_LAVKA_RESERVATION';
        case USER_WANTS_TO_CHANGE_ADDRESS = 'USER_WANTS_TO_CHANGE_ADDRESS';
        case FULL_NOT_RANSOM = 'FULL_NOT_RANSOM';
        case PRESCRIPTION_MISMATCH = 'PRESCRIPTION_MISMATCH';
        case DROPOFF_LOST = 'DROPOFF_LOST';
        case DROPOFF_CLOSED = 'DROPOFF_CLOSED';
        case DELIVERY_TO_STORE_STARTED = 'DELIVERY_TO_STORE_STARTED';
        case USER_WANTS_TO_CHANGE_DELIVERY_DATE = 'USER_WANTS_TO_CHANGE_DELIVERY_DATE';
        case WRONG_ITEM_DELIVERED = 'WRONG_ITEM_DELIVERED';
        case DAMAGED_BOX = 'DAMAGED_BOX';
        case AWAIT_DELIVERY_DATES = 'AWAIT_DELIVERY_DATES';
        case LAST_MILE_COURIER_SEARCH = 'LAST_MILE_COURIER_SEARCH';
        case PICKUP_POINT_CLOSED = 'PICKUP_POINT_CLOSED';
        case LEGAL_INFO_CHANGED = 'LEGAL_INFO_CHANGED';
        case USER_HAS_NO_TIME_TO_PICKUP_ORDER = 'USER_HAS_NO_TIME_TO_PICKUP_ORDER';
        case DELIVERY_CUSTOMS_ARRIVED = 'DELIVERY_CUSTOMS_ARRIVED';
        case DELIVERY_CUSTOMS_CLEARED = 'DELIVERY_CUSTOMS_CLEARED';
        case FIRST_MILE_DELIVERY_SERVICE_RECEIVED = 'FIRST_MILE_DELIVERY_SERVICE_RECEIVED';
        case AWAIT_AUTO_DELIVERY_DATES = 'AWAIT_AUTO_DELIVERY_DATES';
        case AWAIT_USER_PERSONAL_DATA = 'AWAIT_USER_PERSONAL_DATA';
        case NO_PERSONAL_DATA_EXPIRED = 'NO_PERSONAL_DATA_EXPIRED';
        case CUSTOMS_PROBLEMS = 'CUSTOMS_PROBLEMS';
        case AWAIT_CASHIER = 'AWAIT_CASHIER';
        case WAITING_POSTPAID_BUDGET_RESERVATION = 'WAITING_POSTPAID_BUDGET_RESERVATION';
        case AWAIT_SERVICEABLE_CONFIRMATION = 'AWAIT_SERVICEABLE_CONFIRMATION';
        case POSTPAID_BUDGET_RESERVATION_FAILED = 'POSTPAID_BUDGET_RESERVATION_FAILED';
        case AWAIT_CUSTOM_PRICE_CONFIRMATION = 'AWAIT_CUSTOM_PRICE_CONFIRMATION';
        case READY_FOR_PICKUP = 'READY_FOR_PICKUP';
        case UNKNOWN = 'UNKNOWN';
}



