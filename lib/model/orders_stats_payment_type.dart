//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
class OrdersStatsPaymentType {
  /// Instantiate a new enum with the provided [value].
  const OrdersStatsPaymentType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PAYMENT = OrdersStatsPaymentType._(r'PAYMENT');
  static const REFUND = OrdersStatsPaymentType._(r'REFUND');
  static const UNKNOWN = OrdersStatsPaymentType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OrdersStatsPaymentType].
  static const values = <OrdersStatsPaymentType>[
    PAYMENT,
    REFUND,
    UNKNOWN,
  ];

  static OrdersStatsPaymentType? fromJson(dynamic value) => OrdersStatsPaymentTypeTypeTransformer().decode(value);

  static List<OrdersStatsPaymentType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsPaymentType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsPaymentType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrdersStatsPaymentType] to String,
/// and [decode] dynamic data back to [OrdersStatsPaymentType].
class OrdersStatsPaymentTypeTypeTransformer {
  factory OrdersStatsPaymentTypeTypeTransformer() => _instance ??= const OrdersStatsPaymentTypeTypeTransformer._();

  const OrdersStatsPaymentTypeTypeTransformer._();

  String encode(OrdersStatsPaymentType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrdersStatsPaymentType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrdersStatsPaymentType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PAYMENT': return OrdersStatsPaymentType.PAYMENT;
        case r'REFUND': return OrdersStatsPaymentType.REFUND;
        case r'UNKNOWN': return OrdersStatsPaymentType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrdersStatsPaymentTypeTypeTransformer] instance.
  static OrdersStatsPaymentTypeTypeTransformer? _instance;
}

