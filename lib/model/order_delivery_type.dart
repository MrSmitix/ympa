//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Способ доставки заказа:  * `DELIVERY` — курьерская доставка.  * `PICKUP` — самовывоз.  * `POST` — почта.  * `DIGITAL` — для цифровых товаров.  * `UNKNOWN` — неизвестный тип. 
class OrderDeliveryType {
  /// Instantiate a new enum with the provided [value].
  const OrderDeliveryType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DELIVERY = OrderDeliveryType._(r'DELIVERY');
  static const PICKUP = OrderDeliveryType._(r'PICKUP');
  static const POST = OrderDeliveryType._(r'POST');
  static const DIGITAL = OrderDeliveryType._(r'DIGITAL');
  static const UNKNOWN = OrderDeliveryType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OrderDeliveryType].
  static const values = <OrderDeliveryType>[
    DELIVERY,
    PICKUP,
    POST,
    DIGITAL,
    UNKNOWN,
  ];

  static OrderDeliveryType? fromJson(dynamic value) => OrderDeliveryTypeTypeTransformer().decode(value);

  static List<OrderDeliveryType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDeliveryType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDeliveryType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderDeliveryType] to String,
/// and [decode] dynamic data back to [OrderDeliveryType].
class OrderDeliveryTypeTypeTransformer {
  factory OrderDeliveryTypeTypeTransformer() => _instance ??= const OrderDeliveryTypeTypeTransformer._();

  const OrderDeliveryTypeTypeTransformer._();

  String encode(OrderDeliveryType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderDeliveryType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderDeliveryType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DELIVERY': return OrderDeliveryType.DELIVERY;
        case r'PICKUP': return OrderDeliveryType.PICKUP;
        case r'POST': return OrderDeliveryType.POST;
        case r'DIGITAL': return OrderDeliveryType.DIGITAL;
        case r'UNKNOWN': return OrderDeliveryType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderDeliveryTypeTypeTransformer] instance.
  static OrderDeliveryTypeTypeTransformer? _instance;
}

