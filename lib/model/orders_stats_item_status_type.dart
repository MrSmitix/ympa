//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. 
class OrdersStatsItemStatusType {
  /// Instantiate a new enum with the provided [value].
  const OrdersStatsItemStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const REJECTED = OrdersStatsItemStatusType._(r'REJECTED');
  static const RETURNED = OrdersStatsItemStatusType._(r'RETURNED');

  /// List of all possible values in this [enum][OrdersStatsItemStatusType].
  static const values = <OrdersStatsItemStatusType>[
    REJECTED,
    RETURNED,
  ];

  static OrdersStatsItemStatusType? fromJson(dynamic value) => OrdersStatsItemStatusTypeTypeTransformer().decode(value);

  static List<OrdersStatsItemStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsItemStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsItemStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrdersStatsItemStatusType] to String,
/// and [decode] dynamic data back to [OrdersStatsItemStatusType].
class OrdersStatsItemStatusTypeTypeTransformer {
  factory OrdersStatsItemStatusTypeTypeTransformer() => _instance ??= const OrdersStatsItemStatusTypeTypeTransformer._();

  const OrdersStatsItemStatusTypeTypeTransformer._();

  String encode(OrdersStatsItemStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrdersStatsItemStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrdersStatsItemStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'REJECTED': return OrdersStatsItemStatusType.REJECTED;
        case r'RETURNED': return OrdersStatsItemStatusType.RETURNED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrdersStatsItemStatusTypeTypeTransformer] instance.
  static OrdersStatsItemStatusTypeTypeTransformer? _instance;
}

