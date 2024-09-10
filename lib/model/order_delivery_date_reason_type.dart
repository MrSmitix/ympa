//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. 
class OrderDeliveryDateReasonType {
  /// Instantiate a new enum with the provided [value].
  const OrderDeliveryDateReasonType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const USER_MOVED_DELIVERY_DATES = OrderDeliveryDateReasonType._(r'USER_MOVED_DELIVERY_DATES');
  static const PARTNER_MOVED_DELIVERY_DATES = OrderDeliveryDateReasonType._(r'PARTNER_MOVED_DELIVERY_DATES');

  /// List of all possible values in this [enum][OrderDeliveryDateReasonType].
  static const values = <OrderDeliveryDateReasonType>[
    USER_MOVED_DELIVERY_DATES,
    PARTNER_MOVED_DELIVERY_DATES,
  ];

  static OrderDeliveryDateReasonType? fromJson(dynamic value) => OrderDeliveryDateReasonTypeTypeTransformer().decode(value);

  static List<OrderDeliveryDateReasonType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDeliveryDateReasonType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDeliveryDateReasonType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderDeliveryDateReasonType] to String,
/// and [decode] dynamic data back to [OrderDeliveryDateReasonType].
class OrderDeliveryDateReasonTypeTypeTransformer {
  factory OrderDeliveryDateReasonTypeTypeTransformer() => _instance ??= const OrderDeliveryDateReasonTypeTypeTransformer._();

  const OrderDeliveryDateReasonTypeTypeTransformer._();

  String encode(OrderDeliveryDateReasonType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderDeliveryDateReasonType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderDeliveryDateReasonType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'USER_MOVED_DELIVERY_DATES': return OrderDeliveryDateReasonType.USER_MOVED_DELIVERY_DATES;
        case r'PARTNER_MOVED_DELIVERY_DATES': return OrderDeliveryDateReasonType.PARTNER_MOVED_DELIVERY_DATES;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderDeliveryDateReasonTypeTypeTransformer] instance.
  static OrderDeliveryDateReasonTypeTypeTransformer? _instance;
}

