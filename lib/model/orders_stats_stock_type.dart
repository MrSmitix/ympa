//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
class OrdersStatsStockType {
  /// Instantiate a new enum with the provided [value].
  const OrdersStatsStockType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FIT = OrdersStatsStockType._(r'FIT');
  static const FREEZE = OrdersStatsStockType._(r'FREEZE');
  static const AVAILABLE = OrdersStatsStockType._(r'AVAILABLE');
  static const QUARANTINE = OrdersStatsStockType._(r'QUARANTINE');
  static const UTILIZATION = OrdersStatsStockType._(r'UTILIZATION');
  static const DEFECT = OrdersStatsStockType._(r'DEFECT');
  static const EXPIRED = OrdersStatsStockType._(r'EXPIRED');

  /// List of all possible values in this [enum][OrdersStatsStockType].
  static const values = <OrdersStatsStockType>[
    FIT,
    FREEZE,
    AVAILABLE,
    QUARANTINE,
    UTILIZATION,
    DEFECT,
    EXPIRED,
  ];

  static OrdersStatsStockType? fromJson(dynamic value) => OrdersStatsStockTypeTypeTransformer().decode(value);

  static List<OrdersStatsStockType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsStockType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsStockType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrdersStatsStockType] to String,
/// and [decode] dynamic data back to [OrdersStatsStockType].
class OrdersStatsStockTypeTypeTransformer {
  factory OrdersStatsStockTypeTypeTransformer() => _instance ??= const OrdersStatsStockTypeTypeTransformer._();

  const OrdersStatsStockTypeTypeTransformer._();

  String encode(OrdersStatsStockType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrdersStatsStockType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrdersStatsStockType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FIT': return OrdersStatsStockType.FIT;
        case r'FREEZE': return OrdersStatsStockType.FREEZE;
        case r'AVAILABLE': return OrdersStatsStockType.AVAILABLE;
        case r'QUARANTINE': return OrdersStatsStockType.QUARANTINE;
        case r'UTILIZATION': return OrdersStatsStockType.UTILIZATION;
        case r'DEFECT': return OrdersStatsStockType.DEFECT;
        case r'EXPIRED': return OrdersStatsStockType.EXPIRED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrdersStatsStockTypeTypeTransformer] instance.
  static OrdersStatsStockTypeTypeTransformer? _instance;
}

