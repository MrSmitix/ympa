/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  * Значения для заказа в статусе `PROCESSING`:      * `STARTED` — заказ подтвержден, его можно начать обрабатывать.      * `READY_TO_SHIP` — заказ собран и готов к отправке.  * Значения для заказа в статусе `CANCELLED`:      * `PROCESSING_EXPIRED` — значение более не используется.      * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.      * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.      * `SHOP_FAILED` — магазин не может выполнить заказ.      * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.      * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.      * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.      * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.      * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.      * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:        * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;       * перерыв между первым и третьим звонком не менее 90 минут;       * соединение не короче 5 секунд.        Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.  * `TECHNICAL_ERROR` — техническая ошибка на стороне Маркета. Обратитесь в поддержку.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
 */
export type OrderSubstatusType = 'RESERVATION_EXPIRED' | 'USER_NOT_PAID' | 'USER_UNREACHABLE' | 'USER_CHANGED_MIND' | 'USER_REFUSED_DELIVERY' | 'USER_REFUSED_PRODUCT' | 'SHOP_FAILED' | 'USER_REFUSED_QUALITY' | 'REPLACING_ORDER' | 'PROCESSING_EXPIRED' | 'PENDING_EXPIRED' | 'SHOP_PENDING_CANCELLED' | 'PENDING_CANCELLED' | 'USER_FRAUD' | 'RESERVATION_FAILED' | 'USER_PLACED_OTHER_ORDER' | 'USER_BOUGHT_CHEAPER' | 'MISSING_ITEM' | 'BROKEN_ITEM' | 'WRONG_ITEM' | 'PICKUP_EXPIRED' | 'DELIVERY_PROBLEMS' | 'LATE_CONTACT' | 'CUSTOM' | 'DELIVERY_SERVICE_FAILED' | 'WAREHOUSE_FAILED_TO_SHIP' | 'DELIVERY_SERIVCE_UNDELIVERED' | 'DELIVERY_SERVICE_UNDELIVERED' | 'PREORDER' | 'AWAIT_CONFIRMATION' | 'STARTED' | 'PACKAGING' | 'READY_TO_SHIP' | 'SHIPPED' | 'ASYNC_PROCESSING' | 'USER_REFUSED_TO_PROVIDE_PERSONAL_DATA' | 'WAITING_USER_INPUT' | 'WAITING_BANK_DECISION' | 'BANK_REJECT_CREDIT_OFFER' | 'CUSTOMER_REJECT_CREDIT_OFFER' | 'CREDIT_OFFER_FAILED' | 'AWAIT_DELIVERY_DATES_CONFIRMATION' | 'SERVICE_FAULT' | 'DELIVERY_SERVICE_RECEIVED' | 'USER_RECEIVED' | 'WAITING_FOR_STOCKS' | 'AS_PART_OF_MULTI_ORDER' | 'READY_FOR_LAST_MILE' | 'LAST_MILE_STARTED' | 'ANTIFRAUD' | 'DELIVERY_USER_NOT_RECEIVED' | 'DELIVERY_SERVICE_DELIVERED' | 'DELIVERED_USER_NOT_RECEIVED' | 'USER_WANTED_ANOTHER_PAYMENT_METHOD' | 'USER_RECEIVED_TECHNICAL_ERROR' | 'USER_FORGOT_TO_USE_BONUS' | 'RECEIVED_ON_DISTRIBUTION_CENTER' | 'DELIVERY_SERVICE_NOT_RECEIVED' | 'DELIVERY_SERVICE_LOST' | 'SHIPPED_TO_WRONG_DELIVERY_SERVICE' | 'DELIVERED_USER_RECEIVED' | 'WAITING_TINKOFF_DECISION' | 'COURIER_SEARCH' | 'COURIER_FOUND' | 'COURIER_IN_TRANSIT_TO_SENDER' | 'COURIER_ARRIVED_TO_SENDER' | 'COURIER_RECEIVED' | 'COURIER_NOT_FOUND' | 'COURIER_NOT_DELIVER_ORDER' | 'COURIER_RETURNS_ORDER' | 'COURIER_RETURNED_ORDER' | 'WAITING_USER_DELIVERY_INPUT' | 'PICKUP_SERVICE_RECEIVED' | 'PICKUP_USER_RECEIVED' | 'CANCELLED_COURIER_NOT_FOUND' | 'COURIER_NOT_COME_FOR_ORDER' | 'DELIVERY_NOT_MANAGED_REGION' | 'INCOMPLETE_CONTACT_INFORMATION' | 'INCOMPLETE_MULTI_ORDER' | 'INAPPROPRIATE_WEIGHT_SIZE' | 'TECHNICAL_ERROR' | 'SORTING_CENTER_LOST' | 'COURIER_SEARCH_NOT_STARTED' | 'LOST' | 'AWAIT_PAYMENT' | 'AWAIT_LAVKA_RESERVATION' | 'USER_WANTS_TO_CHANGE_ADDRESS' | 'FULL_NOT_RANSOM' | 'PRESCRIPTION_MISMATCH' | 'DROPOFF_LOST' | 'DROPOFF_CLOSED' | 'DELIVERY_TO_STORE_STARTED' | 'USER_WANTS_TO_CHANGE_DELIVERY_DATE' | 'WRONG_ITEM_DELIVERED' | 'DAMAGED_BOX' | 'AWAIT_DELIVERY_DATES' | 'LAST_MILE_COURIER_SEARCH' | 'PICKUP_POINT_CLOSED' | 'LEGAL_INFO_CHANGED' | 'USER_HAS_NO_TIME_TO_PICKUP_ORDER' | 'DELIVERY_CUSTOMS_ARRIVED' | 'DELIVERY_CUSTOMS_CLEARED' | 'FIRST_MILE_DELIVERY_SERVICE_RECEIVED' | 'AWAIT_AUTO_DELIVERY_DATES' | 'AWAIT_USER_PERSONAL_DATA' | 'NO_PERSONAL_DATA_EXPIRED' | 'CUSTOMS_PROBLEMS' | 'AWAIT_CASHIER' | 'WAITING_POSTPAID_BUDGET_RESERVATION' | 'AWAIT_SERVICEABLE_CONFIRMATION' | 'POSTPAID_BUDGET_RESERVATION_FAILED' | 'AWAIT_CUSTOM_PRICE_CONFIRMATION' | 'READY_FOR_PICKUP' | 'UNKNOWN';

export const OrderSubstatusType = {
    ReservationExpired: 'RESERVATION_EXPIRED' as OrderSubstatusType,
    UserNotPaid: 'USER_NOT_PAID' as OrderSubstatusType,
    UserUnreachable: 'USER_UNREACHABLE' as OrderSubstatusType,
    UserChangedMind: 'USER_CHANGED_MIND' as OrderSubstatusType,
    UserRefusedDelivery: 'USER_REFUSED_DELIVERY' as OrderSubstatusType,
    UserRefusedProduct: 'USER_REFUSED_PRODUCT' as OrderSubstatusType,
    ShopFailed: 'SHOP_FAILED' as OrderSubstatusType,
    UserRefusedQuality: 'USER_REFUSED_QUALITY' as OrderSubstatusType,
    ReplacingOrder: 'REPLACING_ORDER' as OrderSubstatusType,
    ProcessingExpired: 'PROCESSING_EXPIRED' as OrderSubstatusType,
    PendingExpired: 'PENDING_EXPIRED' as OrderSubstatusType,
    ShopPendingCancelled: 'SHOP_PENDING_CANCELLED' as OrderSubstatusType,
    PendingCancelled: 'PENDING_CANCELLED' as OrderSubstatusType,
    UserFraud: 'USER_FRAUD' as OrderSubstatusType,
    ReservationFailed: 'RESERVATION_FAILED' as OrderSubstatusType,
    UserPlacedOtherOrder: 'USER_PLACED_OTHER_ORDER' as OrderSubstatusType,
    UserBoughtCheaper: 'USER_BOUGHT_CHEAPER' as OrderSubstatusType,
    MissingItem: 'MISSING_ITEM' as OrderSubstatusType,
    BrokenItem: 'BROKEN_ITEM' as OrderSubstatusType,
    WrongItem: 'WRONG_ITEM' as OrderSubstatusType,
    PickupExpired: 'PICKUP_EXPIRED' as OrderSubstatusType,
    DeliveryProblems: 'DELIVERY_PROBLEMS' as OrderSubstatusType,
    LateContact: 'LATE_CONTACT' as OrderSubstatusType,
    Custom: 'CUSTOM' as OrderSubstatusType,
    DeliveryServiceFailed: 'DELIVERY_SERVICE_FAILED' as OrderSubstatusType,
    WarehouseFailedToShip: 'WAREHOUSE_FAILED_TO_SHIP' as OrderSubstatusType,
    DeliverySerivceUndelivered: 'DELIVERY_SERIVCE_UNDELIVERED' as OrderSubstatusType,
    DeliveryServiceUndelivered: 'DELIVERY_SERVICE_UNDELIVERED' as OrderSubstatusType,
    Preorder: 'PREORDER' as OrderSubstatusType,
    AwaitConfirmation: 'AWAIT_CONFIRMATION' as OrderSubstatusType,
    Started: 'STARTED' as OrderSubstatusType,
    Packaging: 'PACKAGING' as OrderSubstatusType,
    ReadyToShip: 'READY_TO_SHIP' as OrderSubstatusType,
    Shipped: 'SHIPPED' as OrderSubstatusType,
    AsyncProcessing: 'ASYNC_PROCESSING' as OrderSubstatusType,
    UserRefusedToProvidePersonalData: 'USER_REFUSED_TO_PROVIDE_PERSONAL_DATA' as OrderSubstatusType,
    WaitingUserInput: 'WAITING_USER_INPUT' as OrderSubstatusType,
    WaitingBankDecision: 'WAITING_BANK_DECISION' as OrderSubstatusType,
    BankRejectCreditOffer: 'BANK_REJECT_CREDIT_OFFER' as OrderSubstatusType,
    CustomerRejectCreditOffer: 'CUSTOMER_REJECT_CREDIT_OFFER' as OrderSubstatusType,
    CreditOfferFailed: 'CREDIT_OFFER_FAILED' as OrderSubstatusType,
    AwaitDeliveryDatesConfirmation: 'AWAIT_DELIVERY_DATES_CONFIRMATION' as OrderSubstatusType,
    ServiceFault: 'SERVICE_FAULT' as OrderSubstatusType,
    DeliveryServiceReceived: 'DELIVERY_SERVICE_RECEIVED' as OrderSubstatusType,
    UserReceived: 'USER_RECEIVED' as OrderSubstatusType,
    WaitingForStocks: 'WAITING_FOR_STOCKS' as OrderSubstatusType,
    AsPartOfMultiOrder: 'AS_PART_OF_MULTI_ORDER' as OrderSubstatusType,
    ReadyForLastMile: 'READY_FOR_LAST_MILE' as OrderSubstatusType,
    LastMileStarted: 'LAST_MILE_STARTED' as OrderSubstatusType,
    Antifraud: 'ANTIFRAUD' as OrderSubstatusType,
    DeliveryUserNotReceived: 'DELIVERY_USER_NOT_RECEIVED' as OrderSubstatusType,
    DeliveryServiceDelivered: 'DELIVERY_SERVICE_DELIVERED' as OrderSubstatusType,
    DeliveredUserNotReceived: 'DELIVERED_USER_NOT_RECEIVED' as OrderSubstatusType,
    UserWantedAnotherPaymentMethod: 'USER_WANTED_ANOTHER_PAYMENT_METHOD' as OrderSubstatusType,
    UserReceivedTechnicalError: 'USER_RECEIVED_TECHNICAL_ERROR' as OrderSubstatusType,
    UserForgotToUseBonus: 'USER_FORGOT_TO_USE_BONUS' as OrderSubstatusType,
    ReceivedOnDistributionCenter: 'RECEIVED_ON_DISTRIBUTION_CENTER' as OrderSubstatusType,
    DeliveryServiceNotReceived: 'DELIVERY_SERVICE_NOT_RECEIVED' as OrderSubstatusType,
    DeliveryServiceLost: 'DELIVERY_SERVICE_LOST' as OrderSubstatusType,
    ShippedToWrongDeliveryService: 'SHIPPED_TO_WRONG_DELIVERY_SERVICE' as OrderSubstatusType,
    DeliveredUserReceived: 'DELIVERED_USER_RECEIVED' as OrderSubstatusType,
    WaitingTinkoffDecision: 'WAITING_TINKOFF_DECISION' as OrderSubstatusType,
    CourierSearch: 'COURIER_SEARCH' as OrderSubstatusType,
    CourierFound: 'COURIER_FOUND' as OrderSubstatusType,
    CourierInTransitToSender: 'COURIER_IN_TRANSIT_TO_SENDER' as OrderSubstatusType,
    CourierArrivedToSender: 'COURIER_ARRIVED_TO_SENDER' as OrderSubstatusType,
    CourierReceived: 'COURIER_RECEIVED' as OrderSubstatusType,
    CourierNotFound: 'COURIER_NOT_FOUND' as OrderSubstatusType,
    CourierNotDeliverOrder: 'COURIER_NOT_DELIVER_ORDER' as OrderSubstatusType,
    CourierReturnsOrder: 'COURIER_RETURNS_ORDER' as OrderSubstatusType,
    CourierReturnedOrder: 'COURIER_RETURNED_ORDER' as OrderSubstatusType,
    WaitingUserDeliveryInput: 'WAITING_USER_DELIVERY_INPUT' as OrderSubstatusType,
    PickupServiceReceived: 'PICKUP_SERVICE_RECEIVED' as OrderSubstatusType,
    PickupUserReceived: 'PICKUP_USER_RECEIVED' as OrderSubstatusType,
    CancelledCourierNotFound: 'CANCELLED_COURIER_NOT_FOUND' as OrderSubstatusType,
    CourierNotComeForOrder: 'COURIER_NOT_COME_FOR_ORDER' as OrderSubstatusType,
    DeliveryNotManagedRegion: 'DELIVERY_NOT_MANAGED_REGION' as OrderSubstatusType,
    IncompleteContactInformation: 'INCOMPLETE_CONTACT_INFORMATION' as OrderSubstatusType,
    IncompleteMultiOrder: 'INCOMPLETE_MULTI_ORDER' as OrderSubstatusType,
    InappropriateWeightSize: 'INAPPROPRIATE_WEIGHT_SIZE' as OrderSubstatusType,
    TechnicalError: 'TECHNICAL_ERROR' as OrderSubstatusType,
    SortingCenterLost: 'SORTING_CENTER_LOST' as OrderSubstatusType,
    CourierSearchNotStarted: 'COURIER_SEARCH_NOT_STARTED' as OrderSubstatusType,
    Lost: 'LOST' as OrderSubstatusType,
    AwaitPayment: 'AWAIT_PAYMENT' as OrderSubstatusType,
    AwaitLavkaReservation: 'AWAIT_LAVKA_RESERVATION' as OrderSubstatusType,
    UserWantsToChangeAddress: 'USER_WANTS_TO_CHANGE_ADDRESS' as OrderSubstatusType,
    FullNotRansom: 'FULL_NOT_RANSOM' as OrderSubstatusType,
    PrescriptionMismatch: 'PRESCRIPTION_MISMATCH' as OrderSubstatusType,
    DropoffLost: 'DROPOFF_LOST' as OrderSubstatusType,
    DropoffClosed: 'DROPOFF_CLOSED' as OrderSubstatusType,
    DeliveryToStoreStarted: 'DELIVERY_TO_STORE_STARTED' as OrderSubstatusType,
    UserWantsToChangeDeliveryDate: 'USER_WANTS_TO_CHANGE_DELIVERY_DATE' as OrderSubstatusType,
    WrongItemDelivered: 'WRONG_ITEM_DELIVERED' as OrderSubstatusType,
    DamagedBox: 'DAMAGED_BOX' as OrderSubstatusType,
    AwaitDeliveryDates: 'AWAIT_DELIVERY_DATES' as OrderSubstatusType,
    LastMileCourierSearch: 'LAST_MILE_COURIER_SEARCH' as OrderSubstatusType,
    PickupPointClosed: 'PICKUP_POINT_CLOSED' as OrderSubstatusType,
    LegalInfoChanged: 'LEGAL_INFO_CHANGED' as OrderSubstatusType,
    UserHasNoTimeToPickupOrder: 'USER_HAS_NO_TIME_TO_PICKUP_ORDER' as OrderSubstatusType,
    DeliveryCustomsArrived: 'DELIVERY_CUSTOMS_ARRIVED' as OrderSubstatusType,
    DeliveryCustomsCleared: 'DELIVERY_CUSTOMS_CLEARED' as OrderSubstatusType,
    FirstMileDeliveryServiceReceived: 'FIRST_MILE_DELIVERY_SERVICE_RECEIVED' as OrderSubstatusType,
    AwaitAutoDeliveryDates: 'AWAIT_AUTO_DELIVERY_DATES' as OrderSubstatusType,
    AwaitUserPersonalData: 'AWAIT_USER_PERSONAL_DATA' as OrderSubstatusType,
    NoPersonalDataExpired: 'NO_PERSONAL_DATA_EXPIRED' as OrderSubstatusType,
    CustomsProblems: 'CUSTOMS_PROBLEMS' as OrderSubstatusType,
    AwaitCashier: 'AWAIT_CASHIER' as OrderSubstatusType,
    WaitingPostpaidBudgetReservation: 'WAITING_POSTPAID_BUDGET_RESERVATION' as OrderSubstatusType,
    AwaitServiceableConfirmation: 'AWAIT_SERVICEABLE_CONFIRMATION' as OrderSubstatusType,
    PostpaidBudgetReservationFailed: 'POSTPAID_BUDGET_RESERVATION_FAILED' as OrderSubstatusType,
    AwaitCustomPriceConfirmation: 'AWAIT_CUSTOM_PRICE_CONFIRMATION' as OrderSubstatusType,
    ReadyForPickup: 'READY_FOR_PICKUP' as OrderSubstatusType,
    Unknown: 'UNKNOWN' as OrderSubstatusType
}
