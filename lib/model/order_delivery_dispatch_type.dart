//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип. 
class OrderDeliveryDispatchType {
  /// Instantiate a new enum with the provided [value].
  const OrderDeliveryDispatchType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNKNOWN = OrderDeliveryDispatchType._(r'UNKNOWN');
  static const BUYER = OrderDeliveryDispatchType._(r'BUYER');
  static const MARKET_PARTNER_OUTLET = OrderDeliveryDispatchType._(r'MARKET_PARTNER_OUTLET');
  static const MARKET_BRANDED_OUTLET = OrderDeliveryDispatchType._(r'MARKET_BRANDED_OUTLET');
  static const SHOP_OUTLET = OrderDeliveryDispatchType._(r'SHOP_OUTLET');
  static const DROPOFF = OrderDeliveryDispatchType._(r'DROPOFF');

  /// List of all possible values in this [enum][OrderDeliveryDispatchType].
  static const values = <OrderDeliveryDispatchType>[
    UNKNOWN,
    BUYER,
    MARKET_PARTNER_OUTLET,
    MARKET_BRANDED_OUTLET,
    SHOP_OUTLET,
    DROPOFF,
  ];

  static OrderDeliveryDispatchType? fromJson(dynamic value) => OrderDeliveryDispatchTypeTypeTransformer().decode(value);

  static List<OrderDeliveryDispatchType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDeliveryDispatchType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDeliveryDispatchType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderDeliveryDispatchType] to String,
/// and [decode] dynamic data back to [OrderDeliveryDispatchType].
class OrderDeliveryDispatchTypeTypeTransformer {
  factory OrderDeliveryDispatchTypeTypeTransformer() => _instance ??= const OrderDeliveryDispatchTypeTypeTransformer._();

  const OrderDeliveryDispatchTypeTypeTransformer._();

  String encode(OrderDeliveryDispatchType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderDeliveryDispatchType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderDeliveryDispatchType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return OrderDeliveryDispatchType.UNKNOWN;
        case r'BUYER': return OrderDeliveryDispatchType.BUYER;
        case r'MARKET_PARTNER_OUTLET': return OrderDeliveryDispatchType.MARKET_PARTNER_OUTLET;
        case r'MARKET_BRANDED_OUTLET': return OrderDeliveryDispatchType.MARKET_BRANDED_OUTLET;
        case r'SHOP_OUTLET': return OrderDeliveryDispatchType.SHOP_OUTLET;
        case r'DROPOFF': return OrderDeliveryDispatchType.DROPOFF;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderDeliveryDispatchTypeTypeTransformer] instance.
  static OrderDeliveryDispatchTypeTypeTransformer? _instance;
}

