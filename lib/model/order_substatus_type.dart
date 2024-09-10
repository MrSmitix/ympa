//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  * Значения для заказа в статусе `PROCESSING`:      * `STARTED` — заказ подтвержден, его можно начать обрабатывать.      * `READY_TO_SHIP` — заказ собран и готов к отправке.  * Значения для заказа в статусе `CANCELLED`:      * `PROCESSING_EXPIRED` — значение более не используется.      * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.      * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.      * `SHOP_FAILED` — магазин не может выполнить заказ.      * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.      * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.      * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.      * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.      * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.      * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:        * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;       * перерыв между первым и третьим звонком не менее 90 минут;       * соединение не короче 5 секунд.        Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.  * `TECHNICAL_ERROR` — техническая ошибка на стороне Маркета. Обратитесь в поддержку.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
class OrderSubstatusType {
  /// Instantiate a new enum with the provided [value].
  const OrderSubstatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RESERVATION_EXPIRED = OrderSubstatusType._(r'RESERVATION_EXPIRED');
  static const USER_NOT_PAID = OrderSubstatusType._(r'USER_NOT_PAID');
  static const USER_UNREACHABLE = OrderSubstatusType._(r'USER_UNREACHABLE');
  static const USER_CHANGED_MIND = OrderSubstatusType._(r'USER_CHANGED_MIND');
  static const USER_REFUSED_DELIVERY = OrderSubstatusType._(r'USER_REFUSED_DELIVERY');
  static const USER_REFUSED_PRODUCT = OrderSubstatusType._(r'USER_REFUSED_PRODUCT');
  static const SHOP_FAILED = OrderSubstatusType._(r'SHOP_FAILED');
  static const USER_REFUSED_QUALITY = OrderSubstatusType._(r'USER_REFUSED_QUALITY');
  static const REPLACING_ORDER = OrderSubstatusType._(r'REPLACING_ORDER');
  static const PROCESSING_EXPIRED = OrderSubstatusType._(r'PROCESSING_EXPIRED');
  static const PENDING_EXPIRED = OrderSubstatusType._(r'PENDING_EXPIRED');
  static const SHOP_PENDING_CANCELLED = OrderSubstatusType._(r'SHOP_PENDING_CANCELLED');
  static const PENDING_CANCELLED = OrderSubstatusType._(r'PENDING_CANCELLED');
  static const USER_FRAUD = OrderSubstatusType._(r'USER_FRAUD');
  static const RESERVATION_FAILED = OrderSubstatusType._(r'RESERVATION_FAILED');
  static const USER_PLACED_OTHER_ORDER = OrderSubstatusType._(r'USER_PLACED_OTHER_ORDER');
  static const USER_BOUGHT_CHEAPER = OrderSubstatusType._(r'USER_BOUGHT_CHEAPER');
  static const MISSING_ITEM = OrderSubstatusType._(r'MISSING_ITEM');
  static const BROKEN_ITEM = OrderSubstatusType._(r'BROKEN_ITEM');
  static const WRONG_ITEM = OrderSubstatusType._(r'WRONG_ITEM');
  static const PICKUP_EXPIRED = OrderSubstatusType._(r'PICKUP_EXPIRED');
  static const DELIVERY_PROBLEMS = OrderSubstatusType._(r'DELIVERY_PROBLEMS');
  static const LATE_CONTACT = OrderSubstatusType._(r'LATE_CONTACT');
  static const CUSTOM = OrderSubstatusType._(r'CUSTOM');
  static const DELIVERY_SERVICE_FAILED = OrderSubstatusType._(r'DELIVERY_SERVICE_FAILED');
  static const WAREHOUSE_FAILED_TO_SHIP = OrderSubstatusType._(r'WAREHOUSE_FAILED_TO_SHIP');
  static const DELIVERY_SERIVCE_UNDELIVERED = OrderSubstatusType._(r'DELIVERY_SERIVCE_UNDELIVERED');
  static const DELIVERY_SERVICE_UNDELIVERED = OrderSubstatusType._(r'DELIVERY_SERVICE_UNDELIVERED');
  static const PREORDER = OrderSubstatusType._(r'PREORDER');
  static const AWAIT_CONFIRMATION = OrderSubstatusType._(r'AWAIT_CONFIRMATION');
  static const STARTED = OrderSubstatusType._(r'STARTED');
  static const PACKAGING = OrderSubstatusType._(r'PACKAGING');
  static const READY_TO_SHIP = OrderSubstatusType._(r'READY_TO_SHIP');
  static const SHIPPED = OrderSubstatusType._(r'SHIPPED');
  static const ASYNC_PROCESSING = OrderSubstatusType._(r'ASYNC_PROCESSING');
  static const USER_REFUSED_TO_PROVIDE_PERSONAL_DATA = OrderSubstatusType._(r'USER_REFUSED_TO_PROVIDE_PERSONAL_DATA');
  static const WAITING_USER_INPUT = OrderSubstatusType._(r'WAITING_USER_INPUT');
  static const WAITING_BANK_DECISION = OrderSubstatusType._(r'WAITING_BANK_DECISION');
  static const BANK_REJECT_CREDIT_OFFER = OrderSubstatusType._(r'BANK_REJECT_CREDIT_OFFER');
  static const CUSTOMER_REJECT_CREDIT_OFFER = OrderSubstatusType._(r'CUSTOMER_REJECT_CREDIT_OFFER');
  static const CREDIT_OFFER_FAILED = OrderSubstatusType._(r'CREDIT_OFFER_FAILED');
  static const AWAIT_DELIVERY_DATES_CONFIRMATION = OrderSubstatusType._(r'AWAIT_DELIVERY_DATES_CONFIRMATION');
  static const SERVICE_FAULT = OrderSubstatusType._(r'SERVICE_FAULT');
  static const DELIVERY_SERVICE_RECEIVED = OrderSubstatusType._(r'DELIVERY_SERVICE_RECEIVED');
  static const USER_RECEIVED = OrderSubstatusType._(r'USER_RECEIVED');
  static const WAITING_FOR_STOCKS = OrderSubstatusType._(r'WAITING_FOR_STOCKS');
  static const AS_PART_OF_MULTI_ORDER = OrderSubstatusType._(r'AS_PART_OF_MULTI_ORDER');
  static const READY_FOR_LAST_MILE = OrderSubstatusType._(r'READY_FOR_LAST_MILE');
  static const LAST_MILE_STARTED = OrderSubstatusType._(r'LAST_MILE_STARTED');
  static const ANTIFRAUD = OrderSubstatusType._(r'ANTIFRAUD');
  static const DELIVERY_USER_NOT_RECEIVED = OrderSubstatusType._(r'DELIVERY_USER_NOT_RECEIVED');
  static const DELIVERY_SERVICE_DELIVERED = OrderSubstatusType._(r'DELIVERY_SERVICE_DELIVERED');
  static const DELIVERED_USER_NOT_RECEIVED = OrderSubstatusType._(r'DELIVERED_USER_NOT_RECEIVED');
  static const USER_WANTED_ANOTHER_PAYMENT_METHOD = OrderSubstatusType._(r'USER_WANTED_ANOTHER_PAYMENT_METHOD');
  static const USER_RECEIVED_TECHNICAL_ERROR = OrderSubstatusType._(r'USER_RECEIVED_TECHNICAL_ERROR');
  static const USER_FORGOT_TO_USE_BONUS = OrderSubstatusType._(r'USER_FORGOT_TO_USE_BONUS');
  static const RECEIVED_ON_DISTRIBUTION_CENTER = OrderSubstatusType._(r'RECEIVED_ON_DISTRIBUTION_CENTER');
  static const DELIVERY_SERVICE_NOT_RECEIVED = OrderSubstatusType._(r'DELIVERY_SERVICE_NOT_RECEIVED');
  static const DELIVERY_SERVICE_LOST = OrderSubstatusType._(r'DELIVERY_SERVICE_LOST');
  static const SHIPPED_TO_WRONG_DELIVERY_SERVICE = OrderSubstatusType._(r'SHIPPED_TO_WRONG_DELIVERY_SERVICE');
  static const DELIVERED_USER_RECEIVED = OrderSubstatusType._(r'DELIVERED_USER_RECEIVED');
  static const WAITING_TINKOFF_DECISION = OrderSubstatusType._(r'WAITING_TINKOFF_DECISION');
  static const COURIER_SEARCH = OrderSubstatusType._(r'COURIER_SEARCH');
  static const COURIER_FOUND = OrderSubstatusType._(r'COURIER_FOUND');
  static const COURIER_IN_TRANSIT_TO_SENDER = OrderSubstatusType._(r'COURIER_IN_TRANSIT_TO_SENDER');
  static const COURIER_ARRIVED_TO_SENDER = OrderSubstatusType._(r'COURIER_ARRIVED_TO_SENDER');
  static const COURIER_RECEIVED = OrderSubstatusType._(r'COURIER_RECEIVED');
  static const COURIER_NOT_FOUND = OrderSubstatusType._(r'COURIER_NOT_FOUND');
  static const COURIER_NOT_DELIVER_ORDER = OrderSubstatusType._(r'COURIER_NOT_DELIVER_ORDER');
  static const COURIER_RETURNS_ORDER = OrderSubstatusType._(r'COURIER_RETURNS_ORDER');
  static const COURIER_RETURNED_ORDER = OrderSubstatusType._(r'COURIER_RETURNED_ORDER');
  static const WAITING_USER_DELIVERY_INPUT = OrderSubstatusType._(r'WAITING_USER_DELIVERY_INPUT');
  static const PICKUP_SERVICE_RECEIVED = OrderSubstatusType._(r'PICKUP_SERVICE_RECEIVED');
  static const PICKUP_USER_RECEIVED = OrderSubstatusType._(r'PICKUP_USER_RECEIVED');
  static const CANCELLED_COURIER_NOT_FOUND = OrderSubstatusType._(r'CANCELLED_COURIER_NOT_FOUND');
  static const COURIER_NOT_COME_FOR_ORDER = OrderSubstatusType._(r'COURIER_NOT_COME_FOR_ORDER');
  static const DELIVERY_NOT_MANAGED_REGION = OrderSubstatusType._(r'DELIVERY_NOT_MANAGED_REGION');
  static const INCOMPLETE_CONTACT_INFORMATION = OrderSubstatusType._(r'INCOMPLETE_CONTACT_INFORMATION');
  static const INCOMPLETE_MULTI_ORDER = OrderSubstatusType._(r'INCOMPLETE_MULTI_ORDER');
  static const INAPPROPRIATE_WEIGHT_SIZE = OrderSubstatusType._(r'INAPPROPRIATE_WEIGHT_SIZE');
  static const TECHNICAL_ERROR = OrderSubstatusType._(r'TECHNICAL_ERROR');
  static const SORTING_CENTER_LOST = OrderSubstatusType._(r'SORTING_CENTER_LOST');
  static const COURIER_SEARCH_NOT_STARTED = OrderSubstatusType._(r'COURIER_SEARCH_NOT_STARTED');
  static const LOST = OrderSubstatusType._(r'LOST');
  static const AWAIT_PAYMENT = OrderSubstatusType._(r'AWAIT_PAYMENT');
  static const AWAIT_LAVKA_RESERVATION = OrderSubstatusType._(r'AWAIT_LAVKA_RESERVATION');
  static const USER_WANTS_TO_CHANGE_ADDRESS = OrderSubstatusType._(r'USER_WANTS_TO_CHANGE_ADDRESS');
  static const FULL_NOT_RANSOM = OrderSubstatusType._(r'FULL_NOT_RANSOM');
  static const PRESCRIPTION_MISMATCH = OrderSubstatusType._(r'PRESCRIPTION_MISMATCH');
  static const DROPOFF_LOST = OrderSubstatusType._(r'DROPOFF_LOST');
  static const DROPOFF_CLOSED = OrderSubstatusType._(r'DROPOFF_CLOSED');
  static const DELIVERY_TO_STORE_STARTED = OrderSubstatusType._(r'DELIVERY_TO_STORE_STARTED');
  static const USER_WANTS_TO_CHANGE_DELIVERY_DATE = OrderSubstatusType._(r'USER_WANTS_TO_CHANGE_DELIVERY_DATE');
  static const WRONG_ITEM_DELIVERED = OrderSubstatusType._(r'WRONG_ITEM_DELIVERED');
  static const DAMAGED_BOX = OrderSubstatusType._(r'DAMAGED_BOX');
  static const AWAIT_DELIVERY_DATES = OrderSubstatusType._(r'AWAIT_DELIVERY_DATES');
  static const LAST_MILE_COURIER_SEARCH = OrderSubstatusType._(r'LAST_MILE_COURIER_SEARCH');
  static const PICKUP_POINT_CLOSED = OrderSubstatusType._(r'PICKUP_POINT_CLOSED');
  static const LEGAL_INFO_CHANGED = OrderSubstatusType._(r'LEGAL_INFO_CHANGED');
  static const USER_HAS_NO_TIME_TO_PICKUP_ORDER = OrderSubstatusType._(r'USER_HAS_NO_TIME_TO_PICKUP_ORDER');
  static const DELIVERY_CUSTOMS_ARRIVED = OrderSubstatusType._(r'DELIVERY_CUSTOMS_ARRIVED');
  static const DELIVERY_CUSTOMS_CLEARED = OrderSubstatusType._(r'DELIVERY_CUSTOMS_CLEARED');
  static const FIRST_MILE_DELIVERY_SERVICE_RECEIVED = OrderSubstatusType._(r'FIRST_MILE_DELIVERY_SERVICE_RECEIVED');
  static const AWAIT_AUTO_DELIVERY_DATES = OrderSubstatusType._(r'AWAIT_AUTO_DELIVERY_DATES');
  static const AWAIT_USER_PERSONAL_DATA = OrderSubstatusType._(r'AWAIT_USER_PERSONAL_DATA');
  static const NO_PERSONAL_DATA_EXPIRED = OrderSubstatusType._(r'NO_PERSONAL_DATA_EXPIRED');
  static const CUSTOMS_PROBLEMS = OrderSubstatusType._(r'CUSTOMS_PROBLEMS');
  static const AWAIT_CASHIER = OrderSubstatusType._(r'AWAIT_CASHIER');
  static const WAITING_POSTPAID_BUDGET_RESERVATION = OrderSubstatusType._(r'WAITING_POSTPAID_BUDGET_RESERVATION');
  static const AWAIT_SERVICEABLE_CONFIRMATION = OrderSubstatusType._(r'AWAIT_SERVICEABLE_CONFIRMATION');
  static const POSTPAID_BUDGET_RESERVATION_FAILED = OrderSubstatusType._(r'POSTPAID_BUDGET_RESERVATION_FAILED');
  static const AWAIT_CUSTOM_PRICE_CONFIRMATION = OrderSubstatusType._(r'AWAIT_CUSTOM_PRICE_CONFIRMATION');
  static const READY_FOR_PICKUP = OrderSubstatusType._(r'READY_FOR_PICKUP');
  static const UNKNOWN = OrderSubstatusType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OrderSubstatusType].
  static const values = <OrderSubstatusType>[
    RESERVATION_EXPIRED,
    USER_NOT_PAID,
    USER_UNREACHABLE,
    USER_CHANGED_MIND,
    USER_REFUSED_DELIVERY,
    USER_REFUSED_PRODUCT,
    SHOP_FAILED,
    USER_REFUSED_QUALITY,
    REPLACING_ORDER,
    PROCESSING_EXPIRED,
    PENDING_EXPIRED,
    SHOP_PENDING_CANCELLED,
    PENDING_CANCELLED,
    USER_FRAUD,
    RESERVATION_FAILED,
    USER_PLACED_OTHER_ORDER,
    USER_BOUGHT_CHEAPER,
    MISSING_ITEM,
    BROKEN_ITEM,
    WRONG_ITEM,
    PICKUP_EXPIRED,
    DELIVERY_PROBLEMS,
    LATE_CONTACT,
    CUSTOM,
    DELIVERY_SERVICE_FAILED,
    WAREHOUSE_FAILED_TO_SHIP,
    DELIVERY_SERIVCE_UNDELIVERED,
    DELIVERY_SERVICE_UNDELIVERED,
    PREORDER,
    AWAIT_CONFIRMATION,
    STARTED,
    PACKAGING,
    READY_TO_SHIP,
    SHIPPED,
    ASYNC_PROCESSING,
    USER_REFUSED_TO_PROVIDE_PERSONAL_DATA,
    WAITING_USER_INPUT,
    WAITING_BANK_DECISION,
    BANK_REJECT_CREDIT_OFFER,
    CUSTOMER_REJECT_CREDIT_OFFER,
    CREDIT_OFFER_FAILED,
    AWAIT_DELIVERY_DATES_CONFIRMATION,
    SERVICE_FAULT,
    DELIVERY_SERVICE_RECEIVED,
    USER_RECEIVED,
    WAITING_FOR_STOCKS,
    AS_PART_OF_MULTI_ORDER,
    READY_FOR_LAST_MILE,
    LAST_MILE_STARTED,
    ANTIFRAUD,
    DELIVERY_USER_NOT_RECEIVED,
    DELIVERY_SERVICE_DELIVERED,
    DELIVERED_USER_NOT_RECEIVED,
    USER_WANTED_ANOTHER_PAYMENT_METHOD,
    USER_RECEIVED_TECHNICAL_ERROR,
    USER_FORGOT_TO_USE_BONUS,
    RECEIVED_ON_DISTRIBUTION_CENTER,
    DELIVERY_SERVICE_NOT_RECEIVED,
    DELIVERY_SERVICE_LOST,
    SHIPPED_TO_WRONG_DELIVERY_SERVICE,
    DELIVERED_USER_RECEIVED,
    WAITING_TINKOFF_DECISION,
    COURIER_SEARCH,
    COURIER_FOUND,
    COURIER_IN_TRANSIT_TO_SENDER,
    COURIER_ARRIVED_TO_SENDER,
    COURIER_RECEIVED,
    COURIER_NOT_FOUND,
    COURIER_NOT_DELIVER_ORDER,
    COURIER_RETURNS_ORDER,
    COURIER_RETURNED_ORDER,
    WAITING_USER_DELIVERY_INPUT,
    PICKUP_SERVICE_RECEIVED,
    PICKUP_USER_RECEIVED,
    CANCELLED_COURIER_NOT_FOUND,
    COURIER_NOT_COME_FOR_ORDER,
    DELIVERY_NOT_MANAGED_REGION,
    INCOMPLETE_CONTACT_INFORMATION,
    INCOMPLETE_MULTI_ORDER,
    INAPPROPRIATE_WEIGHT_SIZE,
    TECHNICAL_ERROR,
    SORTING_CENTER_LOST,
    COURIER_SEARCH_NOT_STARTED,
    LOST,
    AWAIT_PAYMENT,
    AWAIT_LAVKA_RESERVATION,
    USER_WANTS_TO_CHANGE_ADDRESS,
    FULL_NOT_RANSOM,
    PRESCRIPTION_MISMATCH,
    DROPOFF_LOST,
    DROPOFF_CLOSED,
    DELIVERY_TO_STORE_STARTED,
    USER_WANTS_TO_CHANGE_DELIVERY_DATE,
    WRONG_ITEM_DELIVERED,
    DAMAGED_BOX,
    AWAIT_DELIVERY_DATES,
    LAST_MILE_COURIER_SEARCH,
    PICKUP_POINT_CLOSED,
    LEGAL_INFO_CHANGED,
    USER_HAS_NO_TIME_TO_PICKUP_ORDER,
    DELIVERY_CUSTOMS_ARRIVED,
    DELIVERY_CUSTOMS_CLEARED,
    FIRST_MILE_DELIVERY_SERVICE_RECEIVED,
    AWAIT_AUTO_DELIVERY_DATES,
    AWAIT_USER_PERSONAL_DATA,
    NO_PERSONAL_DATA_EXPIRED,
    CUSTOMS_PROBLEMS,
    AWAIT_CASHIER,
    WAITING_POSTPAID_BUDGET_RESERVATION,
    AWAIT_SERVICEABLE_CONFIRMATION,
    POSTPAID_BUDGET_RESERVATION_FAILED,
    AWAIT_CUSTOM_PRICE_CONFIRMATION,
    READY_FOR_PICKUP,
    UNKNOWN,
  ];

  static OrderSubstatusType? fromJson(dynamic value) => OrderSubstatusTypeTypeTransformer().decode(value);

  static List<OrderSubstatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderSubstatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderSubstatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderSubstatusType] to String,
/// and [decode] dynamic data back to [OrderSubstatusType].
class OrderSubstatusTypeTypeTransformer {
  factory OrderSubstatusTypeTypeTransformer() => _instance ??= const OrderSubstatusTypeTypeTransformer._();

  const OrderSubstatusTypeTypeTransformer._();

  String encode(OrderSubstatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderSubstatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderSubstatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RESERVATION_EXPIRED': return OrderSubstatusType.RESERVATION_EXPIRED;
        case r'USER_NOT_PAID': return OrderSubstatusType.USER_NOT_PAID;
        case r'USER_UNREACHABLE': return OrderSubstatusType.USER_UNREACHABLE;
        case r'USER_CHANGED_MIND': return OrderSubstatusType.USER_CHANGED_MIND;
        case r'USER_REFUSED_DELIVERY': return OrderSubstatusType.USER_REFUSED_DELIVERY;
        case r'USER_REFUSED_PRODUCT': return OrderSubstatusType.USER_REFUSED_PRODUCT;
        case r'SHOP_FAILED': return OrderSubstatusType.SHOP_FAILED;
        case r'USER_REFUSED_QUALITY': return OrderSubstatusType.USER_REFUSED_QUALITY;
        case r'REPLACING_ORDER': return OrderSubstatusType.REPLACING_ORDER;
        case r'PROCESSING_EXPIRED': return OrderSubstatusType.PROCESSING_EXPIRED;
        case r'PENDING_EXPIRED': return OrderSubstatusType.PENDING_EXPIRED;
        case r'SHOP_PENDING_CANCELLED': return OrderSubstatusType.SHOP_PENDING_CANCELLED;
        case r'PENDING_CANCELLED': return OrderSubstatusType.PENDING_CANCELLED;
        case r'USER_FRAUD': return OrderSubstatusType.USER_FRAUD;
        case r'RESERVATION_FAILED': return OrderSubstatusType.RESERVATION_FAILED;
        case r'USER_PLACED_OTHER_ORDER': return OrderSubstatusType.USER_PLACED_OTHER_ORDER;
        case r'USER_BOUGHT_CHEAPER': return OrderSubstatusType.USER_BOUGHT_CHEAPER;
        case r'MISSING_ITEM': return OrderSubstatusType.MISSING_ITEM;
        case r'BROKEN_ITEM': return OrderSubstatusType.BROKEN_ITEM;
        case r'WRONG_ITEM': return OrderSubstatusType.WRONG_ITEM;
        case r'PICKUP_EXPIRED': return OrderSubstatusType.PICKUP_EXPIRED;
        case r'DELIVERY_PROBLEMS': return OrderSubstatusType.DELIVERY_PROBLEMS;
        case r'LATE_CONTACT': return OrderSubstatusType.LATE_CONTACT;
        case r'CUSTOM': return OrderSubstatusType.CUSTOM;
        case r'DELIVERY_SERVICE_FAILED': return OrderSubstatusType.DELIVERY_SERVICE_FAILED;
        case r'WAREHOUSE_FAILED_TO_SHIP': return OrderSubstatusType.WAREHOUSE_FAILED_TO_SHIP;
        case r'DELIVERY_SERIVCE_UNDELIVERED': return OrderSubstatusType.DELIVERY_SERIVCE_UNDELIVERED;
        case r'DELIVERY_SERVICE_UNDELIVERED': return OrderSubstatusType.DELIVERY_SERVICE_UNDELIVERED;
        case r'PREORDER': return OrderSubstatusType.PREORDER;
        case r'AWAIT_CONFIRMATION': return OrderSubstatusType.AWAIT_CONFIRMATION;
        case r'STARTED': return OrderSubstatusType.STARTED;
        case r'PACKAGING': return OrderSubstatusType.PACKAGING;
        case r'READY_TO_SHIP': return OrderSubstatusType.READY_TO_SHIP;
        case r'SHIPPED': return OrderSubstatusType.SHIPPED;
        case r'ASYNC_PROCESSING': return OrderSubstatusType.ASYNC_PROCESSING;
        case r'USER_REFUSED_TO_PROVIDE_PERSONAL_DATA': return OrderSubstatusType.USER_REFUSED_TO_PROVIDE_PERSONAL_DATA;
        case r'WAITING_USER_INPUT': return OrderSubstatusType.WAITING_USER_INPUT;
        case r'WAITING_BANK_DECISION': return OrderSubstatusType.WAITING_BANK_DECISION;
        case r'BANK_REJECT_CREDIT_OFFER': return OrderSubstatusType.BANK_REJECT_CREDIT_OFFER;
        case r'CUSTOMER_REJECT_CREDIT_OFFER': return OrderSubstatusType.CUSTOMER_REJECT_CREDIT_OFFER;
        case r'CREDIT_OFFER_FAILED': return OrderSubstatusType.CREDIT_OFFER_FAILED;
        case r'AWAIT_DELIVERY_DATES_CONFIRMATION': return OrderSubstatusType.AWAIT_DELIVERY_DATES_CONFIRMATION;
        case r'SERVICE_FAULT': return OrderSubstatusType.SERVICE_FAULT;
        case r'DELIVERY_SERVICE_RECEIVED': return OrderSubstatusType.DELIVERY_SERVICE_RECEIVED;
        case r'USER_RECEIVED': return OrderSubstatusType.USER_RECEIVED;
        case r'WAITING_FOR_STOCKS': return OrderSubstatusType.WAITING_FOR_STOCKS;
        case r'AS_PART_OF_MULTI_ORDER': return OrderSubstatusType.AS_PART_OF_MULTI_ORDER;
        case r'READY_FOR_LAST_MILE': return OrderSubstatusType.READY_FOR_LAST_MILE;
        case r'LAST_MILE_STARTED': return OrderSubstatusType.LAST_MILE_STARTED;
        case r'ANTIFRAUD': return OrderSubstatusType.ANTIFRAUD;
        case r'DELIVERY_USER_NOT_RECEIVED': return OrderSubstatusType.DELIVERY_USER_NOT_RECEIVED;
        case r'DELIVERY_SERVICE_DELIVERED': return OrderSubstatusType.DELIVERY_SERVICE_DELIVERED;
        case r'DELIVERED_USER_NOT_RECEIVED': return OrderSubstatusType.DELIVERED_USER_NOT_RECEIVED;
        case r'USER_WANTED_ANOTHER_PAYMENT_METHOD': return OrderSubstatusType.USER_WANTED_ANOTHER_PAYMENT_METHOD;
        case r'USER_RECEIVED_TECHNICAL_ERROR': return OrderSubstatusType.USER_RECEIVED_TECHNICAL_ERROR;
        case r'USER_FORGOT_TO_USE_BONUS': return OrderSubstatusType.USER_FORGOT_TO_USE_BONUS;
        case r'RECEIVED_ON_DISTRIBUTION_CENTER': return OrderSubstatusType.RECEIVED_ON_DISTRIBUTION_CENTER;
        case r'DELIVERY_SERVICE_NOT_RECEIVED': return OrderSubstatusType.DELIVERY_SERVICE_NOT_RECEIVED;
        case r'DELIVERY_SERVICE_LOST': return OrderSubstatusType.DELIVERY_SERVICE_LOST;
        case r'SHIPPED_TO_WRONG_DELIVERY_SERVICE': return OrderSubstatusType.SHIPPED_TO_WRONG_DELIVERY_SERVICE;
        case r'DELIVERED_USER_RECEIVED': return OrderSubstatusType.DELIVERED_USER_RECEIVED;
        case r'WAITING_TINKOFF_DECISION': return OrderSubstatusType.WAITING_TINKOFF_DECISION;
        case r'COURIER_SEARCH': return OrderSubstatusType.COURIER_SEARCH;
        case r'COURIER_FOUND': return OrderSubstatusType.COURIER_FOUND;
        case r'COURIER_IN_TRANSIT_TO_SENDER': return OrderSubstatusType.COURIER_IN_TRANSIT_TO_SENDER;
        case r'COURIER_ARRIVED_TO_SENDER': return OrderSubstatusType.COURIER_ARRIVED_TO_SENDER;
        case r'COURIER_RECEIVED': return OrderSubstatusType.COURIER_RECEIVED;
        case r'COURIER_NOT_FOUND': return OrderSubstatusType.COURIER_NOT_FOUND;
        case r'COURIER_NOT_DELIVER_ORDER': return OrderSubstatusType.COURIER_NOT_DELIVER_ORDER;
        case r'COURIER_RETURNS_ORDER': return OrderSubstatusType.COURIER_RETURNS_ORDER;
        case r'COURIER_RETURNED_ORDER': return OrderSubstatusType.COURIER_RETURNED_ORDER;
        case r'WAITING_USER_DELIVERY_INPUT': return OrderSubstatusType.WAITING_USER_DELIVERY_INPUT;
        case r'PICKUP_SERVICE_RECEIVED': return OrderSubstatusType.PICKUP_SERVICE_RECEIVED;
        case r'PICKUP_USER_RECEIVED': return OrderSubstatusType.PICKUP_USER_RECEIVED;
        case r'CANCELLED_COURIER_NOT_FOUND': return OrderSubstatusType.CANCELLED_COURIER_NOT_FOUND;
        case r'COURIER_NOT_COME_FOR_ORDER': return OrderSubstatusType.COURIER_NOT_COME_FOR_ORDER;
        case r'DELIVERY_NOT_MANAGED_REGION': return OrderSubstatusType.DELIVERY_NOT_MANAGED_REGION;
        case r'INCOMPLETE_CONTACT_INFORMATION': return OrderSubstatusType.INCOMPLETE_CONTACT_INFORMATION;
        case r'INCOMPLETE_MULTI_ORDER': return OrderSubstatusType.INCOMPLETE_MULTI_ORDER;
        case r'INAPPROPRIATE_WEIGHT_SIZE': return OrderSubstatusType.INAPPROPRIATE_WEIGHT_SIZE;
        case r'TECHNICAL_ERROR': return OrderSubstatusType.TECHNICAL_ERROR;
        case r'SORTING_CENTER_LOST': return OrderSubstatusType.SORTING_CENTER_LOST;
        case r'COURIER_SEARCH_NOT_STARTED': return OrderSubstatusType.COURIER_SEARCH_NOT_STARTED;
        case r'LOST': return OrderSubstatusType.LOST;
        case r'AWAIT_PAYMENT': return OrderSubstatusType.AWAIT_PAYMENT;
        case r'AWAIT_LAVKA_RESERVATION': return OrderSubstatusType.AWAIT_LAVKA_RESERVATION;
        case r'USER_WANTS_TO_CHANGE_ADDRESS': return OrderSubstatusType.USER_WANTS_TO_CHANGE_ADDRESS;
        case r'FULL_NOT_RANSOM': return OrderSubstatusType.FULL_NOT_RANSOM;
        case r'PRESCRIPTION_MISMATCH': return OrderSubstatusType.PRESCRIPTION_MISMATCH;
        case r'DROPOFF_LOST': return OrderSubstatusType.DROPOFF_LOST;
        case r'DROPOFF_CLOSED': return OrderSubstatusType.DROPOFF_CLOSED;
        case r'DELIVERY_TO_STORE_STARTED': return OrderSubstatusType.DELIVERY_TO_STORE_STARTED;
        case r'USER_WANTS_TO_CHANGE_DELIVERY_DATE': return OrderSubstatusType.USER_WANTS_TO_CHANGE_DELIVERY_DATE;
        case r'WRONG_ITEM_DELIVERED': return OrderSubstatusType.WRONG_ITEM_DELIVERED;
        case r'DAMAGED_BOX': return OrderSubstatusType.DAMAGED_BOX;
        case r'AWAIT_DELIVERY_DATES': return OrderSubstatusType.AWAIT_DELIVERY_DATES;
        case r'LAST_MILE_COURIER_SEARCH': return OrderSubstatusType.LAST_MILE_COURIER_SEARCH;
        case r'PICKUP_POINT_CLOSED': return OrderSubstatusType.PICKUP_POINT_CLOSED;
        case r'LEGAL_INFO_CHANGED': return OrderSubstatusType.LEGAL_INFO_CHANGED;
        case r'USER_HAS_NO_TIME_TO_PICKUP_ORDER': return OrderSubstatusType.USER_HAS_NO_TIME_TO_PICKUP_ORDER;
        case r'DELIVERY_CUSTOMS_ARRIVED': return OrderSubstatusType.DELIVERY_CUSTOMS_ARRIVED;
        case r'DELIVERY_CUSTOMS_CLEARED': return OrderSubstatusType.DELIVERY_CUSTOMS_CLEARED;
        case r'FIRST_MILE_DELIVERY_SERVICE_RECEIVED': return OrderSubstatusType.FIRST_MILE_DELIVERY_SERVICE_RECEIVED;
        case r'AWAIT_AUTO_DELIVERY_DATES': return OrderSubstatusType.AWAIT_AUTO_DELIVERY_DATES;
        case r'AWAIT_USER_PERSONAL_DATA': return OrderSubstatusType.AWAIT_USER_PERSONAL_DATA;
        case r'NO_PERSONAL_DATA_EXPIRED': return OrderSubstatusType.NO_PERSONAL_DATA_EXPIRED;
        case r'CUSTOMS_PROBLEMS': return OrderSubstatusType.CUSTOMS_PROBLEMS;
        case r'AWAIT_CASHIER': return OrderSubstatusType.AWAIT_CASHIER;
        case r'WAITING_POSTPAID_BUDGET_RESERVATION': return OrderSubstatusType.WAITING_POSTPAID_BUDGET_RESERVATION;
        case r'AWAIT_SERVICEABLE_CONFIRMATION': return OrderSubstatusType.AWAIT_SERVICEABLE_CONFIRMATION;
        case r'POSTPAID_BUDGET_RESERVATION_FAILED': return OrderSubstatusType.POSTPAID_BUDGET_RESERVATION_FAILED;
        case r'AWAIT_CUSTOM_PRICE_CONFIRMATION': return OrderSubstatusType.AWAIT_CUSTOM_PRICE_CONFIRMATION;
        case r'READY_FOR_PICKUP': return OrderSubstatusType.READY_FOR_PICKUP;
        case r'UNKNOWN': return OrderSubstatusType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderSubstatusTypeTypeTransformer] instance.
  static OrderSubstatusTypeTypeTransformer? _instance;
}

