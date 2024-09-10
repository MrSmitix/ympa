//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). 
class OrdersStatsPaymentSourceType {
  /// Instantiate a new enum with the provided [value].
  const OrdersStatsPaymentSourceType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BUYER = OrdersStatsPaymentSourceType._(r'BUYER');
  static const CASHBACK = OrdersStatsPaymentSourceType._(r'CASHBACK');
  static const MARKETPLACE = OrdersStatsPaymentSourceType._(r'MARKETPLACE');
  static const SPLIT = OrdersStatsPaymentSourceType._(r'SPLIT');

  /// List of all possible values in this [enum][OrdersStatsPaymentSourceType].
  static const values = <OrdersStatsPaymentSourceType>[
    BUYER,
    CASHBACK,
    MARKETPLACE,
    SPLIT,
  ];

  static OrdersStatsPaymentSourceType? fromJson(dynamic value) => OrdersStatsPaymentSourceTypeTypeTransformer().decode(value);

  static List<OrdersStatsPaymentSourceType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsPaymentSourceType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsPaymentSourceType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrdersStatsPaymentSourceType] to String,
/// and [decode] dynamic data back to [OrdersStatsPaymentSourceType].
class OrdersStatsPaymentSourceTypeTypeTransformer {
  factory OrdersStatsPaymentSourceTypeTypeTransformer() => _instance ??= const OrdersStatsPaymentSourceTypeTypeTransformer._();

  const OrdersStatsPaymentSourceTypeTypeTransformer._();

  String encode(OrdersStatsPaymentSourceType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrdersStatsPaymentSourceType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrdersStatsPaymentSourceType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'BUYER': return OrdersStatsPaymentSourceType.BUYER;
        case r'CASHBACK': return OrdersStatsPaymentSourceType.CASHBACK;
        case r'MARKETPLACE': return OrdersStatsPaymentSourceType.MARKETPLACE;
        case r'SPLIT': return OrdersStatsPaymentSourceType.SPLIT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrdersStatsPaymentSourceTypeTypeTransformer] instance.
  static OrdersStatsPaymentSourceTypeTypeTransformer? _instance;
}

