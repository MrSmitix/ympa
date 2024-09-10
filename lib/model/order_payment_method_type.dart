//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (`\"paymentType\": \"PREPAID\"`):    * `YANDEX` — банковской картой.    * `APPLE_PAY` — Apple Pay.    * `GOOGLE_PAY` — Google Pay.    * `CREDIT` — в кредит.    * `TINKOFF_CREDIT` — в кредит в Тинькофф Банке.    * `TINKOFF_INSTALLMENTS` — рассрочка в Тинькофф Банке.    * `EXTERNAL_CERTIFICATE` — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * `SBP` — через систему быстрых платежей.    * `B2B_ACCOUNT_PREPAYMENT` — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (`\"paymentType\": \"POSTPAID\"`):    * `CARD_ON_DELIVERY` — банковской картой.    * `BOUND_CARD_ON_DELIVERY` — привязанной картой при получении.    * `CASH_ON_DELIVERY` — наличными.    * `B2B_ACCOUNT_POSTPAYMENT` — заказ оплачивает организация после доставки.  * `UNKNOWN` — неизвестный тип.  Значение по умолчанию: `CASH_ON_DELIVERY`. 
class OrderPaymentMethodType {
  /// Instantiate a new enum with the provided [value].
  const OrderPaymentMethodType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CASH_ON_DELIVERY = OrderPaymentMethodType._(r'CASH_ON_DELIVERY');
  static const CARD_ON_DELIVERY = OrderPaymentMethodType._(r'CARD_ON_DELIVERY');
  static const BOUND_CARD_ON_DELIVERY = OrderPaymentMethodType._(r'BOUND_CARD_ON_DELIVERY');
  static const YANDEX = OrderPaymentMethodType._(r'YANDEX');
  static const APPLE_PAY = OrderPaymentMethodType._(r'APPLE_PAY');
  static const EXTERNAL_CERTIFICATE = OrderPaymentMethodType._(r'EXTERNAL_CERTIFICATE');
  static const CREDIT = OrderPaymentMethodType._(r'CREDIT');
  static const GOOGLE_PAY = OrderPaymentMethodType._(r'GOOGLE_PAY');
  static const TINKOFF_CREDIT = OrderPaymentMethodType._(r'TINKOFF_CREDIT');
  static const SBP = OrderPaymentMethodType._(r'SBP');
  static const TINKOFF_INSTALLMENTS = OrderPaymentMethodType._(r'TINKOFF_INSTALLMENTS');
  static const b2BACCOUNTPREPAYMENT = OrderPaymentMethodType._(r'B2B_ACCOUNT_PREPAYMENT');
  static const b2BACCOUNTPOSTPAYMENT = OrderPaymentMethodType._(r'B2B_ACCOUNT_POSTPAYMENT');
  static const UNKNOWN = OrderPaymentMethodType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OrderPaymentMethodType].
  static const values = <OrderPaymentMethodType>[
    CASH_ON_DELIVERY,
    CARD_ON_DELIVERY,
    BOUND_CARD_ON_DELIVERY,
    YANDEX,
    APPLE_PAY,
    EXTERNAL_CERTIFICATE,
    CREDIT,
    GOOGLE_PAY,
    TINKOFF_CREDIT,
    SBP,
    TINKOFF_INSTALLMENTS,
    b2BACCOUNTPREPAYMENT,
    b2BACCOUNTPOSTPAYMENT,
    UNKNOWN,
  ];

  static OrderPaymentMethodType? fromJson(dynamic value) => OrderPaymentMethodTypeTypeTransformer().decode(value);

  static List<OrderPaymentMethodType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderPaymentMethodType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderPaymentMethodType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderPaymentMethodType] to String,
/// and [decode] dynamic data back to [OrderPaymentMethodType].
class OrderPaymentMethodTypeTypeTransformer {
  factory OrderPaymentMethodTypeTypeTransformer() => _instance ??= const OrderPaymentMethodTypeTypeTransformer._();

  const OrderPaymentMethodTypeTypeTransformer._();

  String encode(OrderPaymentMethodType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderPaymentMethodType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderPaymentMethodType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CASH_ON_DELIVERY': return OrderPaymentMethodType.CASH_ON_DELIVERY;
        case r'CARD_ON_DELIVERY': return OrderPaymentMethodType.CARD_ON_DELIVERY;
        case r'BOUND_CARD_ON_DELIVERY': return OrderPaymentMethodType.BOUND_CARD_ON_DELIVERY;
        case r'YANDEX': return OrderPaymentMethodType.YANDEX;
        case r'APPLE_PAY': return OrderPaymentMethodType.APPLE_PAY;
        case r'EXTERNAL_CERTIFICATE': return OrderPaymentMethodType.EXTERNAL_CERTIFICATE;
        case r'CREDIT': return OrderPaymentMethodType.CREDIT;
        case r'GOOGLE_PAY': return OrderPaymentMethodType.GOOGLE_PAY;
        case r'TINKOFF_CREDIT': return OrderPaymentMethodType.TINKOFF_CREDIT;
        case r'SBP': return OrderPaymentMethodType.SBP;
        case r'TINKOFF_INSTALLMENTS': return OrderPaymentMethodType.TINKOFF_INSTALLMENTS;
        case r'B2B_ACCOUNT_PREPAYMENT': return OrderPaymentMethodType.b2BACCOUNTPREPAYMENT;
        case r'B2B_ACCOUNT_POSTPAYMENT': return OrderPaymentMethodType.b2BACCOUNTPOSTPAYMENT;
        case r'UNKNOWN': return OrderPaymentMethodType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderPaymentMethodTypeTypeTransformer] instance.
  static OrderPaymentMethodTypeTypeTransformer? _instance;
}

