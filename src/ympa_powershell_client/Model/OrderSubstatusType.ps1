#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum OrderSubstatusType.

.DESCRIPTION

Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  * Значения для заказа в статусе `PROCESSING`:      * `STARTED` — заказ подтвержден, его можно начать обрабатывать.      * `READY_TO_SHIP` — заказ собран и готов к отправке.  * Значения для заказа в статусе `CANCELLED`:      * `PROCESSING_EXPIRED` — значение более не используется.      * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.      * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.      * `SHOP_FAILED` — магазин не может выполнить заказ.      * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.      * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.      * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.      * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.      * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.      * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:        * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;       * перерыв между первым и третьим звонком не менее 90 минут;       * соединение не короче 5 секунд.        Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.  * `TECHNICAL_ERROR` — техническая ошибка на стороне Маркета. Обратитесь в поддержку.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
#>

enum OrderSubstatusType {
    # enum value: "RESERVATION_EXPIRED"
    RESERVATION_EXPIRED
    # enum value: "USER_NOT_PAID"
    USER_NOT_PAID
    # enum value: "USER_UNREACHABLE"
    USER_UNREACHABLE
    # enum value: "USER_CHANGED_MIND"
    USER_CHANGED_MIND
    # enum value: "USER_REFUSED_DELIVERY"
    USER_REFUSED_DELIVERY
    # enum value: "USER_REFUSED_PRODUCT"
    USER_REFUSED_PRODUCT
    # enum value: "SHOP_FAILED"
    SHOP_FAILED
    # enum value: "USER_REFUSED_QUALITY"
    USER_REFUSED_QUALITY
    # enum value: "REPLACING_ORDER"
    REPLACING_ORDER
    # enum value: "PROCESSING_EXPIRED"
    PROCESSING_EXPIRED
    # enum value: "PENDING_EXPIRED"
    PENDING_EXPIRED
    # enum value: "SHOP_PENDING_CANCELLED"
    SHOP_PENDING_CANCELLED
    # enum value: "PENDING_CANCELLED"
    PENDING_CANCELLED
    # enum value: "USER_FRAUD"
    USER_FRAUD
    # enum value: "RESERVATION_FAILED"
    RESERVATION_FAILED
    # enum value: "USER_PLACED_OTHER_ORDER"
    USER_PLACED_OTHER_ORDER
    # enum value: "USER_BOUGHT_CHEAPER"
    USER_BOUGHT_CHEAPER
    # enum value: "MISSING_ITEM"
    MISSING_ITEM
    # enum value: "BROKEN_ITEM"
    BROKEN_ITEM
    # enum value: "WRONG_ITEM"
    WRONG_ITEM
    # enum value: "PICKUP_EXPIRED"
    PICKUP_EXPIRED
    # enum value: "DELIVERY_PROBLEMS"
    DELIVERY_PROBLEMS
    # enum value: "LATE_CONTACT"
    LATE_CONTACT
    # enum value: "CUSTOM"
    CUSTOM
    # enum value: "DELIVERY_SERVICE_FAILED"
    DELIVERY_SERVICE_FAILED
    # enum value: "WAREHOUSE_FAILED_TO_SHIP"
    WAREHOUSE_FAILED_TO_SHIP
    # enum value: "DELIVERY_SERIVCE_UNDELIVERED"
    DELIVERY_SERIVCE_UNDELIVERED
    # enum value: "DELIVERY_SERVICE_UNDELIVERED"
    DELIVERY_SERVICE_UNDELIVERED
    # enum value: "PREORDER"
    PREORDER
    # enum value: "AWAIT_CONFIRMATION"
    AWAIT_CONFIRMATION
    # enum value: "STARTED"
    STARTED
    # enum value: "PACKAGING"
    PACKAGING
    # enum value: "READY_TO_SHIP"
    READY_TO_SHIP
    # enum value: "SHIPPED"
    SHIPPED
    # enum value: "ASYNC_PROCESSING"
    ASYNC_PROCESSING
    # enum value: "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA"
    USER_REFUSED_TO_PROVIDE_PERSONAL_DATA
    # enum value: "WAITING_USER_INPUT"
    WAITING_USER_INPUT
    # enum value: "WAITING_BANK_DECISION"
    WAITING_BANK_DECISION
    # enum value: "BANK_REJECT_CREDIT_OFFER"
    BANK_REJECT_CREDIT_OFFER
    # enum value: "CUSTOMER_REJECT_CREDIT_OFFER"
    CUSTOMER_REJECT_CREDIT_OFFER
    # enum value: "CREDIT_OFFER_FAILED"
    CREDIT_OFFER_FAILED
    # enum value: "AWAIT_DELIVERY_DATES_CONFIRMATION"
    AWAIT_DELIVERY_DATES_CONFIRMATION
    # enum value: "SERVICE_FAULT"
    SERVICE_FAULT
    # enum value: "DELIVERY_SERVICE_RECEIVED"
    DELIVERY_SERVICE_RECEIVED
    # enum value: "USER_RECEIVED"
    USER_RECEIVED
    # enum value: "WAITING_FOR_STOCKS"
    WAITING_FOR_STOCKS
    # enum value: "AS_PART_OF_MULTI_ORDER"
    AS_PART_OF_MULTI_ORDER
    # enum value: "READY_FOR_LAST_MILE"
    READY_FOR_LAST_MILE
    # enum value: "LAST_MILE_STARTED"
    LAST_MILE_STARTED
    # enum value: "ANTIFRAUD"
    ANTIFRAUD
    # enum value: "DELIVERY_USER_NOT_RECEIVED"
    DELIVERY_USER_NOT_RECEIVED
    # enum value: "DELIVERY_SERVICE_DELIVERED"
    DELIVERY_SERVICE_DELIVERED
    # enum value: "DELIVERED_USER_NOT_RECEIVED"
    DELIVERED_USER_NOT_RECEIVED
    # enum value: "USER_WANTED_ANOTHER_PAYMENT_METHOD"
    USER_WANTED_ANOTHER_PAYMENT_METHOD
    # enum value: "USER_RECEIVED_TECHNICAL_ERROR"
    USER_RECEIVED_TECHNICAL_ERROR
    # enum value: "USER_FORGOT_TO_USE_BONUS"
    USER_FORGOT_TO_USE_BONUS
    # enum value: "RECEIVED_ON_DISTRIBUTION_CENTER"
    RECEIVED_ON_DISTRIBUTION_CENTER
    # enum value: "DELIVERY_SERVICE_NOT_RECEIVED"
    DELIVERY_SERVICE_NOT_RECEIVED
    # enum value: "DELIVERY_SERVICE_LOST"
    DELIVERY_SERVICE_LOST
    # enum value: "SHIPPED_TO_WRONG_DELIVERY_SERVICE"
    SHIPPED_TO_WRONG_DELIVERY_SERVICE
    # enum value: "DELIVERED_USER_RECEIVED"
    DELIVERED_USER_RECEIVED
    # enum value: "WAITING_TINKOFF_DECISION"
    WAITING_TINKOFF_DECISION
    # enum value: "COURIER_SEARCH"
    COURIER_SEARCH
    # enum value: "COURIER_FOUND"
    COURIER_FOUND
    # enum value: "COURIER_IN_TRANSIT_TO_SENDER"
    COURIER_IN_TRANSIT_TO_SENDER
    # enum value: "COURIER_ARRIVED_TO_SENDER"
    COURIER_ARRIVED_TO_SENDER
    # enum value: "COURIER_RECEIVED"
    COURIER_RECEIVED
    # enum value: "COURIER_NOT_FOUND"
    COURIER_NOT_FOUND
    # enum value: "COURIER_NOT_DELIVER_ORDER"
    COURIER_NOT_DELIVER_ORDER
    # enum value: "COURIER_RETURNS_ORDER"
    COURIER_RETURNS_ORDER
    # enum value: "COURIER_RETURNED_ORDER"
    COURIER_RETURNED_ORDER
    # enum value: "WAITING_USER_DELIVERY_INPUT"
    WAITING_USER_DELIVERY_INPUT
    # enum value: "PICKUP_SERVICE_RECEIVED"
    PICKUP_SERVICE_RECEIVED
    # enum value: "PICKUP_USER_RECEIVED"
    PICKUP_USER_RECEIVED
    # enum value: "CANCELLED_COURIER_NOT_FOUND"
    CANCELLED_COURIER_NOT_FOUND
    # enum value: "COURIER_NOT_COME_FOR_ORDER"
    COURIER_NOT_COME_FOR_ORDER
    # enum value: "DELIVERY_NOT_MANAGED_REGION"
    DELIVERY_NOT_MANAGED_REGION
    # enum value: "INCOMPLETE_CONTACT_INFORMATION"
    INCOMPLETE_CONTACT_INFORMATION
    # enum value: "INCOMPLETE_MULTI_ORDER"
    INCOMPLETE_MULTI_ORDER
    # enum value: "INAPPROPRIATE_WEIGHT_SIZE"
    INAPPROPRIATE_WEIGHT_SIZE
    # enum value: "TECHNICAL_ERROR"
    TECHNICAL_ERROR
    # enum value: "SORTING_CENTER_LOST"
    SORTING_CENTER_LOST
    # enum value: "COURIER_SEARCH_NOT_STARTED"
    COURIER_SEARCH_NOT_STARTED
    # enum value: "LOST"
    LOST
    # enum value: "AWAIT_PAYMENT"
    AWAIT_PAYMENT
    # enum value: "AWAIT_LAVKA_RESERVATION"
    AWAIT_LAVKA_RESERVATION
    # enum value: "USER_WANTS_TO_CHANGE_ADDRESS"
    USER_WANTS_TO_CHANGE_ADDRESS
    # enum value: "FULL_NOT_RANSOM"
    FULL_NOT_RANSOM
    # enum value: "PRESCRIPTION_MISMATCH"
    PRESCRIPTION_MISMATCH
    # enum value: "DROPOFF_LOST"
    DROPOFF_LOST
    # enum value: "DROPOFF_CLOSED"
    DROPOFF_CLOSED
    # enum value: "DELIVERY_TO_STORE_STARTED"
    DELIVERY_TO_STORE_STARTED
    # enum value: "USER_WANTS_TO_CHANGE_DELIVERY_DATE"
    USER_WANTS_TO_CHANGE_DELIVERY_DATE
    # enum value: "WRONG_ITEM_DELIVERED"
    WRONG_ITEM_DELIVERED
    # enum value: "DAMAGED_BOX"
    DAMAGED_BOX
    # enum value: "AWAIT_DELIVERY_DATES"
    AWAIT_DELIVERY_DATES
    # enum value: "LAST_MILE_COURIER_SEARCH"
    LAST_MILE_COURIER_SEARCH
    # enum value: "PICKUP_POINT_CLOSED"
    PICKUP_POINT_CLOSED
    # enum value: "LEGAL_INFO_CHANGED"
    LEGAL_INFO_CHANGED
    # enum value: "USER_HAS_NO_TIME_TO_PICKUP_ORDER"
    USER_HAS_NO_TIME_TO_PICKUP_ORDER
    # enum value: "DELIVERY_CUSTOMS_ARRIVED"
    DELIVERY_CUSTOMS_ARRIVED
    # enum value: "DELIVERY_CUSTOMS_CLEARED"
    DELIVERY_CUSTOMS_CLEARED
    # enum value: "FIRST_MILE_DELIVERY_SERVICE_RECEIVED"
    FIRST_MILE_DELIVERY_SERVICE_RECEIVED
    # enum value: "AWAIT_AUTO_DELIVERY_DATES"
    AWAIT_AUTO_DELIVERY_DATES
    # enum value: "AWAIT_USER_PERSONAL_DATA"
    AWAIT_USER_PERSONAL_DATA
    # enum value: "NO_PERSONAL_DATA_EXPIRED"
    NO_PERSONAL_DATA_EXPIRED
    # enum value: "CUSTOMS_PROBLEMS"
    CUSTOMS_PROBLEMS
    # enum value: "AWAIT_CASHIER"
    AWAIT_CASHIER
    # enum value: "WAITING_POSTPAID_BUDGET_RESERVATION"
    WAITING_POSTPAID_BUDGET_RESERVATION
    # enum value: "AWAIT_SERVICEABLE_CONFIRMATION"
    AWAIT_SERVICEABLE_CONFIRMATION
    # enum value: "POSTPAID_BUDGET_RESERVATION_FAILED"
    POSTPAID_BUDGET_RESERVATION_FAILED
    # enum value: "AWAIT_CUSTOM_PRICE_CONFIRMATION"
    AWAIT_CUSTOM_PRICE_CONFIRMATION
    # enum value: "READY_FOR_PICKUP"
    READY_FOR_PICKUP
    # enum value: "UNKNOWN"
    UNKNOWN
}

