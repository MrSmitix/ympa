//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`. 
class OrderUpdateStatusType {
  /// Instantiate a new enum with the provided [value].
  const OrderUpdateStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OK = OrderUpdateStatusType._(r'OK');
  static const ERROR = OrderUpdateStatusType._(r'ERROR');

  /// List of all possible values in this [enum][OrderUpdateStatusType].
  static const values = <OrderUpdateStatusType>[
    OK,
    ERROR,
  ];

  static OrderUpdateStatusType? fromJson(dynamic value) => OrderUpdateStatusTypeTypeTransformer().decode(value);

  static List<OrderUpdateStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderUpdateStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderUpdateStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderUpdateStatusType] to String,
/// and [decode] dynamic data back to [OrderUpdateStatusType].
class OrderUpdateStatusTypeTypeTransformer {
  factory OrderUpdateStatusTypeTypeTransformer() => _instance ??= const OrderUpdateStatusTypeTypeTransformer._();

  const OrderUpdateStatusTypeTypeTransformer._();

  String encode(OrderUpdateStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderUpdateStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderUpdateStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OK': return OrderUpdateStatusType.OK;
        case r'ERROR': return OrderUpdateStatusType.ERROR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderUpdateStatusTypeTypeTransformer] instance.
  static OrderUpdateStatusTypeTypeTransformer? _instance;
}

