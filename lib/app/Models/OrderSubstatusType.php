<?php
/**
 * OrderSubstatusType
 */
namespace app\Models;

/**
 * OrderSubstatusType
 * @description Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  * Значения для заказа в статусе `PROCESSING`:      * `STARTED` — заказ подтвержден, его можно начать обрабатывать.      * `READY_TO_SHIP` — заказ собран и готов к отправке.  * Значения для заказа в статусе `CANCELLED`:      * `PROCESSING_EXPIRED` — значение более не используется.      * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.      * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.      * `SHOP_FAILED` — магазин не может выполнить заказ.      * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.      * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.      * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.      * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.      * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.      * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:        * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;       * перерыв между первым и третьим звонком не менее 90 минут;       * соединение не короче 5 секунд.        Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.  * `TECHNICAL_ERROR` — техническая ошибка на стороне Маркета. Обратитесь в поддержку.  Также могут возвращаться другие значения. Обрабатывать их не требуется.
 */
class OrderSubstatusType
{
    /**
     * Possible values of this enum
     */
    const RESERVATION_EXPIRED = 'RESERVATION_EXPIRED';

    const USER_NOT_PAID = 'USER_NOT_PAID';

    const USER_UNREACHABLE = 'USER_UNREACHABLE';

    const USER_CHANGED_MIND = 'USER_CHANGED_MIND';

    const USER_REFUSED_DELIVERY = 'USER_REFUSED_DELIVERY';

    const USER_REFUSED_PRODUCT = 'USER_REFUSED_PRODUCT';

    const SHOP_FAILED = 'SHOP_FAILED';

    const USER_REFUSED_QUALITY = 'USER_REFUSED_QUALITY';

    const REPLACING_ORDER = 'REPLACING_ORDER';

    const PROCESSING_EXPIRED = 'PROCESSING_EXPIRED';

    const PENDING_EXPIRED = 'PENDING_EXPIRED';

    const SHOP_PENDING_CANCELLED = 'SHOP_PENDING_CANCELLED';

    const PENDING_CANCELLED = 'PENDING_CANCELLED';

    const USER_FRAUD = 'USER_FRAUD';

    const RESERVATION_FAILED = 'RESERVATION_FAILED';

    const USER_PLACED_OTHER_ORDER = 'USER_PLACED_OTHER_ORDER';

    const USER_BOUGHT_CHEAPER = 'USER_BOUGHT_CHEAPER';

    const MISSING_ITEM = 'MISSING_ITEM';

    const BROKEN_ITEM = 'BROKEN_ITEM';

    const WRONG_ITEM = 'WRONG_ITEM';

    const PICKUP_EXPIRED = 'PICKUP_EXPIRED';

    const DELIVERY_PROBLEMS = 'DELIVERY_PROBLEMS';

    const LATE_CONTACT = 'LATE_CONTACT';

    const CUSTOM = 'CUSTOM';

    const DELIVERY_SERVICE_FAILED = 'DELIVERY_SERVICE_FAILED';

    const WAREHOUSE_FAILED_TO_SHIP = 'WAREHOUSE_FAILED_TO_SHIP';

    const DELIVERY_SERIVCE_UNDELIVERED = 'DELIVERY_SERIVCE_UNDELIVERED';

    const DELIVERY_SERVICE_UNDELIVERED = 'DELIVERY_SERVICE_UNDELIVERED';

    const PREORDER = 'PREORDER';

    const AWAIT_CONFIRMATION = 'AWAIT_CONFIRMATION';

    const STARTED = 'STARTED';

    const PACKAGING = 'PACKAGING';

    const READY_TO_SHIP = 'READY_TO_SHIP';

    const SHIPPED = 'SHIPPED';

    const ASYNC_PROCESSING = 'ASYNC_PROCESSING';

    const USER_REFUSED_TO_PROVIDE_PERSONAL_DATA = 'USER_REFUSED_TO_PROVIDE_PERSONAL_DATA';

    const WAITING_USER_INPUT = 'WAITING_USER_INPUT';

    const WAITING_BANK_DECISION = 'WAITING_BANK_DECISION';

    const BANK_REJECT_CREDIT_OFFER = 'BANK_REJECT_CREDIT_OFFER';

    const CUSTOMER_REJECT_CREDIT_OFFER = 'CUSTOMER_REJECT_CREDIT_OFFER';

    const CREDIT_OFFER_FAILED = 'CREDIT_OFFER_FAILED';

    const AWAIT_DELIVERY_DATES_CONFIRMATION = 'AWAIT_DELIVERY_DATES_CONFIRMATION';

    const SERVICE_FAULT = 'SERVICE_FAULT';

    const DELIVERY_SERVICE_RECEIVED = 'DELIVERY_SERVICE_RECEIVED';

    const USER_RECEIVED = 'USER_RECEIVED';

    const WAITING_FOR_STOCKS = 'WAITING_FOR_STOCKS';

    const AS_PART_OF_MULTI_ORDER = 'AS_PART_OF_MULTI_ORDER';

    const READY_FOR_LAST_MILE = 'READY_FOR_LAST_MILE';

    const LAST_MILE_STARTED = 'LAST_MILE_STARTED';

    const ANTIFRAUD = 'ANTIFRAUD';

    const DELIVERY_USER_NOT_RECEIVED = 'DELIVERY_USER_NOT_RECEIVED';

    const DELIVERY_SERVICE_DELIVERED = 'DELIVERY_SERVICE_DELIVERED';

    const DELIVERED_USER_NOT_RECEIVED = 'DELIVERED_USER_NOT_RECEIVED';

    const USER_WANTED_ANOTHER_PAYMENT_METHOD = 'USER_WANTED_ANOTHER_PAYMENT_METHOD';

    const USER_RECEIVED_TECHNICAL_ERROR = 'USER_RECEIVED_TECHNICAL_ERROR';

    const USER_FORGOT_TO_USE_BONUS = 'USER_FORGOT_TO_USE_BONUS';

    const RECEIVED_ON_DISTRIBUTION_CENTER = 'RECEIVED_ON_DISTRIBUTION_CENTER';

    const DELIVERY_SERVICE_NOT_RECEIVED = 'DELIVERY_SERVICE_NOT_RECEIVED';

    const DELIVERY_SERVICE_LOST = 'DELIVERY_SERVICE_LOST';

    const SHIPPED_TO_WRONG_DELIVERY_SERVICE = 'SHIPPED_TO_WRONG_DELIVERY_SERVICE';

    const DELIVERED_USER_RECEIVED = 'DELIVERED_USER_RECEIVED';

    const WAITING_TINKOFF_DECISION = 'WAITING_TINKOFF_DECISION';

    const COURIER_SEARCH = 'COURIER_SEARCH';

    const COURIER_FOUND = 'COURIER_FOUND';

    const COURIER_IN_TRANSIT_TO_SENDER = 'COURIER_IN_TRANSIT_TO_SENDER';

    const COURIER_ARRIVED_TO_SENDER = 'COURIER_ARRIVED_TO_SENDER';

    const COURIER_RECEIVED = 'COURIER_RECEIVED';

    const COURIER_NOT_FOUND = 'COURIER_NOT_FOUND';

    const COURIER_NOT_DELIVER_ORDER = 'COURIER_NOT_DELIVER_ORDER';

    const COURIER_RETURNS_ORDER = 'COURIER_RETURNS_ORDER';

    const COURIER_RETURNED_ORDER = 'COURIER_RETURNED_ORDER';

    const WAITING_USER_DELIVERY_INPUT = 'WAITING_USER_DELIVERY_INPUT';

    const PICKUP_SERVICE_RECEIVED = 'PICKUP_SERVICE_RECEIVED';

    const PICKUP_USER_RECEIVED = 'PICKUP_USER_RECEIVED';

    const CANCELLED_COURIER_NOT_FOUND = 'CANCELLED_COURIER_NOT_FOUND';

    const COURIER_NOT_COME_FOR_ORDER = 'COURIER_NOT_COME_FOR_ORDER';

    const DELIVERY_NOT_MANAGED_REGION = 'DELIVERY_NOT_MANAGED_REGION';

    const INCOMPLETE_CONTACT_INFORMATION = 'INCOMPLETE_CONTACT_INFORMATION';

    const INCOMPLETE_MULTI_ORDER = 'INCOMPLETE_MULTI_ORDER';

    const INAPPROPRIATE_WEIGHT_SIZE = 'INAPPROPRIATE_WEIGHT_SIZE';

    const TECHNICAL_ERROR = 'TECHNICAL_ERROR';

    const SORTING_CENTER_LOST = 'SORTING_CENTER_LOST';

    const COURIER_SEARCH_NOT_STARTED = 'COURIER_SEARCH_NOT_STARTED';

    const LOST = 'LOST';

    const AWAIT_PAYMENT = 'AWAIT_PAYMENT';

    const AWAIT_LAVKA_RESERVATION = 'AWAIT_LAVKA_RESERVATION';

    const USER_WANTS_TO_CHANGE_ADDRESS = 'USER_WANTS_TO_CHANGE_ADDRESS';

    const FULL_NOT_RANSOM = 'FULL_NOT_RANSOM';

    const PRESCRIPTION_MISMATCH = 'PRESCRIPTION_MISMATCH';

    const DROPOFF_LOST = 'DROPOFF_LOST';

    const DROPOFF_CLOSED = 'DROPOFF_CLOSED';

    const DELIVERY_TO_STORE_STARTED = 'DELIVERY_TO_STORE_STARTED';

    const USER_WANTS_TO_CHANGE_DELIVERY_DATE = 'USER_WANTS_TO_CHANGE_DELIVERY_DATE';

    const WRONG_ITEM_DELIVERED = 'WRONG_ITEM_DELIVERED';

    const DAMAGED_BOX = 'DAMAGED_BOX';

    const AWAIT_DELIVERY_DATES = 'AWAIT_DELIVERY_DATES';

    const LAST_MILE_COURIER_SEARCH = 'LAST_MILE_COURIER_SEARCH';

    const PICKUP_POINT_CLOSED = 'PICKUP_POINT_CLOSED';

    const LEGAL_INFO_CHANGED = 'LEGAL_INFO_CHANGED';

    const USER_HAS_NO_TIME_TO_PICKUP_ORDER = 'USER_HAS_NO_TIME_TO_PICKUP_ORDER';

    const DELIVERY_CUSTOMS_ARRIVED = 'DELIVERY_CUSTOMS_ARRIVED';

    const DELIVERY_CUSTOMS_CLEARED = 'DELIVERY_CUSTOMS_CLEARED';

    const FIRST_MILE_DELIVERY_SERVICE_RECEIVED = 'FIRST_MILE_DELIVERY_SERVICE_RECEIVED';

    const AWAIT_AUTO_DELIVERY_DATES = 'AWAIT_AUTO_DELIVERY_DATES';

    const AWAIT_USER_PERSONAL_DATA = 'AWAIT_USER_PERSONAL_DATA';

    const NO_PERSONAL_DATA_EXPIRED = 'NO_PERSONAL_DATA_EXPIRED';

    const CUSTOMS_PROBLEMS = 'CUSTOMS_PROBLEMS';

    const AWAIT_CASHIER = 'AWAIT_CASHIER';

    const WAITING_POSTPAID_BUDGET_RESERVATION = 'WAITING_POSTPAID_BUDGET_RESERVATION';

    const AWAIT_SERVICEABLE_CONFIRMATION = 'AWAIT_SERVICEABLE_CONFIRMATION';

    const POSTPAID_BUDGET_RESERVATION_FAILED = 'POSTPAID_BUDGET_RESERVATION_FAILED';

    const AWAIT_CUSTOM_PRICE_CONFIRMATION = 'AWAIT_CUSTOM_PRICE_CONFIRMATION';

    const READY_FOR_PICKUP = 'READY_FOR_PICKUP';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::RESERVATION_EXPIRED,
            self::USER_NOT_PAID,
            self::USER_UNREACHABLE,
            self::USER_CHANGED_MIND,
            self::USER_REFUSED_DELIVERY,
            self::USER_REFUSED_PRODUCT,
            self::SHOP_FAILED,
            self::USER_REFUSED_QUALITY,
            self::REPLACING_ORDER,
            self::PROCESSING_EXPIRED,
            self::PENDING_EXPIRED,
            self::SHOP_PENDING_CANCELLED,
            self::PENDING_CANCELLED,
            self::USER_FRAUD,
            self::RESERVATION_FAILED,
            self::USER_PLACED_OTHER_ORDER,
            self::USER_BOUGHT_CHEAPER,
            self::MISSING_ITEM,
            self::BROKEN_ITEM,
            self::WRONG_ITEM,
            self::PICKUP_EXPIRED,
            self::DELIVERY_PROBLEMS,
            self::LATE_CONTACT,
            self::CUSTOM,
            self::DELIVERY_SERVICE_FAILED,
            self::WAREHOUSE_FAILED_TO_SHIP,
            self::DELIVERY_SERIVCE_UNDELIVERED,
            self::DELIVERY_SERVICE_UNDELIVERED,
            self::PREORDER,
            self::AWAIT_CONFIRMATION,
            self::STARTED,
            self::PACKAGING,
            self::READY_TO_SHIP,
            self::SHIPPED,
            self::ASYNC_PROCESSING,
            self::USER_REFUSED_TO_PROVIDE_PERSONAL_DATA,
            self::WAITING_USER_INPUT,
            self::WAITING_BANK_DECISION,
            self::BANK_REJECT_CREDIT_OFFER,
            self::CUSTOMER_REJECT_CREDIT_OFFER,
            self::CREDIT_OFFER_FAILED,
            self::AWAIT_DELIVERY_DATES_CONFIRMATION,
            self::SERVICE_FAULT,
            self::DELIVERY_SERVICE_RECEIVED,
            self::USER_RECEIVED,
            self::WAITING_FOR_STOCKS,
            self::AS_PART_OF_MULTI_ORDER,
            self::READY_FOR_LAST_MILE,
            self::LAST_MILE_STARTED,
            self::ANTIFRAUD,
            self::DELIVERY_USER_NOT_RECEIVED,
            self::DELIVERY_SERVICE_DELIVERED,
            self::DELIVERED_USER_NOT_RECEIVED,
            self::USER_WANTED_ANOTHER_PAYMENT_METHOD,
            self::USER_RECEIVED_TECHNICAL_ERROR,
            self::USER_FORGOT_TO_USE_BONUS,
            self::RECEIVED_ON_DISTRIBUTION_CENTER,
            self::DELIVERY_SERVICE_NOT_RECEIVED,
            self::DELIVERY_SERVICE_LOST,
            self::SHIPPED_TO_WRONG_DELIVERY_SERVICE,
            self::DELIVERED_USER_RECEIVED,
            self::WAITING_TINKOFF_DECISION,
            self::COURIER_SEARCH,
            self::COURIER_FOUND,
            self::COURIER_IN_TRANSIT_TO_SENDER,
            self::COURIER_ARRIVED_TO_SENDER,
            self::COURIER_RECEIVED,
            self::COURIER_NOT_FOUND,
            self::COURIER_NOT_DELIVER_ORDER,
            self::COURIER_RETURNS_ORDER,
            self::COURIER_RETURNED_ORDER,
            self::WAITING_USER_DELIVERY_INPUT,
            self::PICKUP_SERVICE_RECEIVED,
            self::PICKUP_USER_RECEIVED,
            self::CANCELLED_COURIER_NOT_FOUND,
            self::COURIER_NOT_COME_FOR_ORDER,
            self::DELIVERY_NOT_MANAGED_REGION,
            self::INCOMPLETE_CONTACT_INFORMATION,
            self::INCOMPLETE_MULTI_ORDER,
            self::INAPPROPRIATE_WEIGHT_SIZE,
            self::TECHNICAL_ERROR,
            self::SORTING_CENTER_LOST,
            self::COURIER_SEARCH_NOT_STARTED,
            self::LOST,
            self::AWAIT_PAYMENT,
            self::AWAIT_LAVKA_RESERVATION,
            self::USER_WANTS_TO_CHANGE_ADDRESS,
            self::FULL_NOT_RANSOM,
            self::PRESCRIPTION_MISMATCH,
            self::DROPOFF_LOST,
            self::DROPOFF_CLOSED,
            self::DELIVERY_TO_STORE_STARTED,
            self::USER_WANTS_TO_CHANGE_DELIVERY_DATE,
            self::WRONG_ITEM_DELIVERED,
            self::DAMAGED_BOX,
            self::AWAIT_DELIVERY_DATES,
            self::LAST_MILE_COURIER_SEARCH,
            self::PICKUP_POINT_CLOSED,
            self::LEGAL_INFO_CHANGED,
            self::USER_HAS_NO_TIME_TO_PICKUP_ORDER,
            self::DELIVERY_CUSTOMS_ARRIVED,
            self::DELIVERY_CUSTOMS_CLEARED,
            self::FIRST_MILE_DELIVERY_SERVICE_RECEIVED,
            self::AWAIT_AUTO_DELIVERY_DATES,
            self::AWAIT_USER_PERSONAL_DATA,
            self::NO_PERSONAL_DATA_EXPIRED,
            self::CUSTOMS_PROBLEMS,
            self::AWAIT_CASHIER,
            self::WAITING_POSTPAID_BUDGET_RESERVATION,
            self::AWAIT_SERVICEABLE_CONFIRMATION,
            self::POSTPAID_BUDGET_RESERVATION_FAILED,
            self::AWAIT_CUSTOM_PRICE_CONFIRMATION,
            self::READY_FOR_PICKUP,
            self::UNKNOWN
        ];
    }
}
