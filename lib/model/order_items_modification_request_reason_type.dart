//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Причина обновления состава заказа.
class OrderItemsModificationRequestReasonType {
  /// Instantiate a new enum with the provided [value].
  const OrderItemsModificationRequestReasonType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PARTNER_REQUESTED_REMOVE = OrderItemsModificationRequestReasonType._(r'PARTNER_REQUESTED_REMOVE');
  static const USER_REQUESTED_REMOVE = OrderItemsModificationRequestReasonType._(r'USER_REQUESTED_REMOVE');

  /// List of all possible values in this [enum][OrderItemsModificationRequestReasonType].
  static const values = <OrderItemsModificationRequestReasonType>[
    PARTNER_REQUESTED_REMOVE,
    USER_REQUESTED_REMOVE,
  ];

  static OrderItemsModificationRequestReasonType? fromJson(dynamic value) => OrderItemsModificationRequestReasonTypeTypeTransformer().decode(value);

  static List<OrderItemsModificationRequestReasonType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemsModificationRequestReasonType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemsModificationRequestReasonType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderItemsModificationRequestReasonType] to String,
/// and [decode] dynamic data back to [OrderItemsModificationRequestReasonType].
class OrderItemsModificationRequestReasonTypeTypeTransformer {
  factory OrderItemsModificationRequestReasonTypeTypeTransformer() => _instance ??= const OrderItemsModificationRequestReasonTypeTypeTransformer._();

  const OrderItemsModificationRequestReasonTypeTypeTransformer._();

  String encode(OrderItemsModificationRequestReasonType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderItemsModificationRequestReasonType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderItemsModificationRequestReasonType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PARTNER_REQUESTED_REMOVE': return OrderItemsModificationRequestReasonType.PARTNER_REQUESTED_REMOVE;
        case r'USER_REQUESTED_REMOVE': return OrderItemsModificationRequestReasonType.USER_REQUESTED_REMOVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderItemsModificationRequestReasonTypeTypeTransformer] instance.
  static OrderItemsModificationRequestReasonTypeTypeTransformer? _instance;
}

