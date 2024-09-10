//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
class OrdersStatsOrderPaymentType {
  /// Instantiate a new enum with the provided [value].
  const OrdersStatsOrderPaymentType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREDIT = OrdersStatsOrderPaymentType._(r'CREDIT');
  static const POSTPAID = OrdersStatsOrderPaymentType._(r'POSTPAID');
  static const PREPAID = OrdersStatsOrderPaymentType._(r'PREPAID');
  static const TINKOFF_CREDIT = OrdersStatsOrderPaymentType._(r'TINKOFF_CREDIT');

  /// List of all possible values in this [enum][OrdersStatsOrderPaymentType].
  static const values = <OrdersStatsOrderPaymentType>[
    CREDIT,
    POSTPAID,
    PREPAID,
    TINKOFF_CREDIT,
  ];

  static OrdersStatsOrderPaymentType? fromJson(dynamic value) => OrdersStatsOrderPaymentTypeTypeTransformer().decode(value);

  static List<OrdersStatsOrderPaymentType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsOrderPaymentType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsOrderPaymentType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrdersStatsOrderPaymentType] to String,
/// and [decode] dynamic data back to [OrdersStatsOrderPaymentType].
class OrdersStatsOrderPaymentTypeTypeTransformer {
  factory OrdersStatsOrderPaymentTypeTypeTransformer() => _instance ??= const OrdersStatsOrderPaymentTypeTypeTransformer._();

  const OrdersStatsOrderPaymentTypeTypeTransformer._();

  String encode(OrdersStatsOrderPaymentType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrdersStatsOrderPaymentType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrdersStatsOrderPaymentType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREDIT': return OrdersStatsOrderPaymentType.CREDIT;
        case r'POSTPAID': return OrdersStatsOrderPaymentType.POSTPAID;
        case r'PREPAID': return OrdersStatsOrderPaymentType.PREPAID;
        case r'TINKOFF_CREDIT': return OrdersStatsOrderPaymentType.TINKOFF_CREDIT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrdersStatsOrderPaymentTypeTypeTransformer] instance.
  static OrdersStatsOrderPaymentTypeTypeTransformer? _instance;
}

