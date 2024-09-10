/* tslint:disable */
/* eslint-disable */
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
 * Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).
 * 
 * * Значения для заказа в статусе `PROCESSING`:
 * 
 *     * `STARTED` — заказ подтвержден, его можно начать обрабатывать.
 * 
 *     * `READY_TO_SHIP` — заказ собран и готов к отправке.
 * 
 * * Значения для заказа в статусе `CANCELLED`:
 * 
 *     * `PROCESSING_EXPIRED` — значение более не используется.
 * 
 *     * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.
 * 
 *     * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.
 * 
 *     * `SHOP_FAILED` — магазин не может выполнить заказ.
 * 
 *     * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.
 * 
 *     * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.
 * 
 *     * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.
 * 
 *     * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.
 * 
 *     * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.
 * 
 *     * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:
 * 
 *       * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;
 *       * перерыв между первым и третьим звонком не менее 90 минут;
 *       * соединение не короче 5 секунд.
 * 
 *       Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.
 * 
 * * `TECHNICAL_ERROR` — техническая ошибка на стороне Маркета. Обратитесь в поддержку.
 * 
 * Также могут возвращаться другие значения. Обрабатывать их не требуется.
 * 
 * @export
 */
export const OrderSubstatusType = {
    ReservationExpired: 'RESERVATION_EXPIRED',
    UserNotPaid: 'USER_NOT_PAID',
    UserUnreachable: 'USER_UNREACHABLE',
    UserChangedMind: 'USER_CHANGED_MIND',
    UserRefusedDelivery: 'USER_REFUSED_DELIVERY',
    UserRefusedProduct: 'USER_REFUSED_PRODUCT',
    ShopFailed: 'SHOP_FAILED',
    UserRefusedQuality: 'USER_REFUSED_QUALITY',
    ReplacingOrder: 'REPLACING_ORDER',
    ProcessingExpired: 'PROCESSING_EXPIRED',
    PendingExpired: 'PENDING_EXPIRED',
    ShopPendingCancelled: 'SHOP_PENDING_CANCELLED',
    PendingCancelled: 'PENDING_CANCELLED',
    UserFraud: 'USER_FRAUD',
    ReservationFailed: 'RESERVATION_FAILED',
    UserPlacedOtherOrder: 'USER_PLACED_OTHER_ORDER',
    UserBoughtCheaper: 'USER_BOUGHT_CHEAPER',
    MissingItem: 'MISSING_ITEM',
    BrokenItem: 'BROKEN_ITEM',
    WrongItem: 'WRONG_ITEM',
    PickupExpired: 'PICKUP_EXPIRED',
    DeliveryProblems: 'DELIVERY_PROBLEMS',
    LateContact: 'LATE_CONTACT',
    Custom: 'CUSTOM',
    DeliveryServiceFailed: 'DELIVERY_SERVICE_FAILED',
    WarehouseFailedToShip: 'WAREHOUSE_FAILED_TO_SHIP',
    DeliverySerivceUndelivered: 'DELIVERY_SERIVCE_UNDELIVERED',
    DeliveryServiceUndelivered: 'DELIVERY_SERVICE_UNDELIVERED',
    Preorder: 'PREORDER',
    AwaitConfirmation: 'AWAIT_CONFIRMATION',
    Started: 'STARTED',
    Packaging: 'PACKAGING',
    ReadyToShip: 'READY_TO_SHIP',
    Shipped: 'SHIPPED',
    AsyncProcessing: 'ASYNC_PROCESSING',
    UserRefusedToProvidePersonalData: 'USER_REFUSED_TO_PROVIDE_PERSONAL_DATA',
    WaitingUserInput: 'WAITING_USER_INPUT',
    WaitingBankDecision: 'WAITING_BANK_DECISION',
    BankRejectCreditOffer: 'BANK_REJECT_CREDIT_OFFER',
    CustomerRejectCreditOffer: 'CUSTOMER_REJECT_CREDIT_OFFER',
    CreditOfferFailed: 'CREDIT_OFFER_FAILED',
    AwaitDeliveryDatesConfirmation: 'AWAIT_DELIVERY_DATES_CONFIRMATION',
    ServiceFault: 'SERVICE_FAULT',
    DeliveryServiceReceived: 'DELIVERY_SERVICE_RECEIVED',
    UserReceived: 'USER_RECEIVED',
    WaitingForStocks: 'WAITING_FOR_STOCKS',
    AsPartOfMultiOrder: 'AS_PART_OF_MULTI_ORDER',
    ReadyForLastMile: 'READY_FOR_LAST_MILE',
    LastMileStarted: 'LAST_MILE_STARTED',
    Antifraud: 'ANTIFRAUD',
    DeliveryUserNotReceived: 'DELIVERY_USER_NOT_RECEIVED',
    DeliveryServiceDelivered: 'DELIVERY_SERVICE_DELIVERED',
    DeliveredUserNotReceived: 'DELIVERED_USER_NOT_RECEIVED',
    UserWantedAnotherPaymentMethod: 'USER_WANTED_ANOTHER_PAYMENT_METHOD',
    UserReceivedTechnicalError: 'USER_RECEIVED_TECHNICAL_ERROR',
    UserForgotToUseBonus: 'USER_FORGOT_TO_USE_BONUS',
    ReceivedOnDistributionCenter: 'RECEIVED_ON_DISTRIBUTION_CENTER',
    DeliveryServiceNotReceived: 'DELIVERY_SERVICE_NOT_RECEIVED',
    DeliveryServiceLost: 'DELIVERY_SERVICE_LOST',
    ShippedToWrongDeliveryService: 'SHIPPED_TO_WRONG_DELIVERY_SERVICE',
    DeliveredUserReceived: 'DELIVERED_USER_RECEIVED',
    WaitingTinkoffDecision: 'WAITING_TINKOFF_DECISION',
    CourierSearch: 'COURIER_SEARCH',
    CourierFound: 'COURIER_FOUND',
    CourierInTransitToSender: 'COURIER_IN_TRANSIT_TO_SENDER',
    CourierArrivedToSender: 'COURIER_ARRIVED_TO_SENDER',
    CourierReceived: 'COURIER_RECEIVED',
    CourierNotFound: 'COURIER_NOT_FOUND',
    CourierNotDeliverOrder: 'COURIER_NOT_DELIVER_ORDER',
    CourierReturnsOrder: 'COURIER_RETURNS_ORDER',
    CourierReturnedOrder: 'COURIER_RETURNED_ORDER',
    WaitingUserDeliveryInput: 'WAITING_USER_DELIVERY_INPUT',
    PickupServiceReceived: 'PICKUP_SERVICE_RECEIVED',
    PickupUserReceived: 'PICKUP_USER_RECEIVED',
    CancelledCourierNotFound: 'CANCELLED_COURIER_NOT_FOUND',
    CourierNotComeForOrder: 'COURIER_NOT_COME_FOR_ORDER',
    DeliveryNotManagedRegion: 'DELIVERY_NOT_MANAGED_REGION',
    IncompleteContactInformation: 'INCOMPLETE_CONTACT_INFORMATION',
    IncompleteMultiOrder: 'INCOMPLETE_MULTI_ORDER',
    InappropriateWeightSize: 'INAPPROPRIATE_WEIGHT_SIZE',
    TechnicalError: 'TECHNICAL_ERROR',
    SortingCenterLost: 'SORTING_CENTER_LOST',
    CourierSearchNotStarted: 'COURIER_SEARCH_NOT_STARTED',
    Lost: 'LOST',
    AwaitPayment: 'AWAIT_PAYMENT',
    AwaitLavkaReservation: 'AWAIT_LAVKA_RESERVATION',
    UserWantsToChangeAddress: 'USER_WANTS_TO_CHANGE_ADDRESS',
    FullNotRansom: 'FULL_NOT_RANSOM',
    PrescriptionMismatch: 'PRESCRIPTION_MISMATCH',
    DropoffLost: 'DROPOFF_LOST',
    DropoffClosed: 'DROPOFF_CLOSED',
    DeliveryToStoreStarted: 'DELIVERY_TO_STORE_STARTED',
    UserWantsToChangeDeliveryDate: 'USER_WANTS_TO_CHANGE_DELIVERY_DATE',
    WrongItemDelivered: 'WRONG_ITEM_DELIVERED',
    DamagedBox: 'DAMAGED_BOX',
    AwaitDeliveryDates: 'AWAIT_DELIVERY_DATES',
    LastMileCourierSearch: 'LAST_MILE_COURIER_SEARCH',
    PickupPointClosed: 'PICKUP_POINT_CLOSED',
    LegalInfoChanged: 'LEGAL_INFO_CHANGED',
    UserHasNoTimeToPickupOrder: 'USER_HAS_NO_TIME_TO_PICKUP_ORDER',
    DeliveryCustomsArrived: 'DELIVERY_CUSTOMS_ARRIVED',
    DeliveryCustomsCleared: 'DELIVERY_CUSTOMS_CLEARED',
    FirstMileDeliveryServiceReceived: 'FIRST_MILE_DELIVERY_SERVICE_RECEIVED',
    AwaitAutoDeliveryDates: 'AWAIT_AUTO_DELIVERY_DATES',
    AwaitUserPersonalData: 'AWAIT_USER_PERSONAL_DATA',
    NoPersonalDataExpired: 'NO_PERSONAL_DATA_EXPIRED',
    CustomsProblems: 'CUSTOMS_PROBLEMS',
    AwaitCashier: 'AWAIT_CASHIER',
    WaitingPostpaidBudgetReservation: 'WAITING_POSTPAID_BUDGET_RESERVATION',
    AwaitServiceableConfirmation: 'AWAIT_SERVICEABLE_CONFIRMATION',
    PostpaidBudgetReservationFailed: 'POSTPAID_BUDGET_RESERVATION_FAILED',
    AwaitCustomPriceConfirmation: 'AWAIT_CUSTOM_PRICE_CONFIRMATION',
    ReadyForPickup: 'READY_FOR_PICKUP',
    Unknown: 'UNKNOWN'
} as const;
export type OrderSubstatusType = typeof OrderSubstatusType[keyof typeof OrderSubstatusType];


export function instanceOfOrderSubstatusType(value: any): boolean {
    for (const key in OrderSubstatusType) {
        if (Object.prototype.hasOwnProperty.call(OrderSubstatusType, key)) {
            if (OrderSubstatusType[key as keyof typeof OrderSubstatusType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function OrderSubstatusTypeFromJSON(json: any): OrderSubstatusType {
    return OrderSubstatusTypeFromJSONTyped(json, false);
}

export function OrderSubstatusTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderSubstatusType {
    return json as OrderSubstatusType;
}

export function OrderSubstatusTypeToJSON(value?: OrderSubstatusType | null): any {
    return value as any;
}
