//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
class OrderItemStatusType {
  /// Instantiate a new enum with the provided [value].
  const OrderItemStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const REJECTED = OrderItemStatusType._(r'REJECTED');
  static const RETURNED = OrderItemStatusType._(r'RETURNED');

  /// List of all possible values in this [enum][OrderItemStatusType].
  static const values = <OrderItemStatusType>[
    REJECTED,
    RETURNED,
  ];

  static OrderItemStatusType? fromJson(dynamic value) => OrderItemStatusTypeTypeTransformer().decode(value);

  static List<OrderItemStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderItemStatusType] to String,
/// and [decode] dynamic data back to [OrderItemStatusType].
class OrderItemStatusTypeTypeTransformer {
  factory OrderItemStatusTypeTypeTransformer() => _instance ??= const OrderItemStatusTypeTypeTransformer._();

  const OrderItemStatusTypeTypeTransformer._();

  String encode(OrderItemStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderItemStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderItemStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'REJECTED': return OrderItemStatusType.REJECTED;
        case r'RETURNED': return OrderItemStatusType.RETURNED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderItemStatusTypeTypeTransformer] instance.
  static OrderItemStatusTypeTypeTransformer? _instance;
}

