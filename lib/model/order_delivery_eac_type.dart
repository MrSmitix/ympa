//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
class OrderDeliveryEacType {
  /// Instantiate a new enum with the provided [value].
  const OrderDeliveryEacType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const MERCHANT_TO_COURIER = OrderDeliveryEacType._(r'MERCHANT_TO_COURIER');
  static const COURIER_TO_MERCHANT = OrderDeliveryEacType._(r'COURIER_TO_MERCHANT');
  static const CHECKING_BY_MERCHANT = OrderDeliveryEacType._(r'CHECKING_BY_MERCHANT');

  /// List of all possible values in this [enum][OrderDeliveryEacType].
  static const values = <OrderDeliveryEacType>[
    MERCHANT_TO_COURIER,
    COURIER_TO_MERCHANT,
    CHECKING_BY_MERCHANT,
  ];

  static OrderDeliveryEacType? fromJson(dynamic value) => OrderDeliveryEacTypeTypeTransformer().decode(value);

  static List<OrderDeliveryEacType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDeliveryEacType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDeliveryEacType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderDeliveryEacType] to String,
/// and [decode] dynamic data back to [OrderDeliveryEacType].
class OrderDeliveryEacTypeTypeTransformer {
  factory OrderDeliveryEacTypeTypeTransformer() => _instance ??= const OrderDeliveryEacTypeTypeTransformer._();

  const OrderDeliveryEacTypeTypeTransformer._();

  String encode(OrderDeliveryEacType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderDeliveryEacType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderDeliveryEacType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'MERCHANT_TO_COURIER': return OrderDeliveryEacType.MERCHANT_TO_COURIER;
        case r'COURIER_TO_MERCHANT': return OrderDeliveryEacType.COURIER_TO_MERCHANT;
        case r'CHECKING_BY_MERCHANT': return OrderDeliveryEacType.CHECKING_BY_MERCHANT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderDeliveryEacTypeTypeTransformer] instance.
  static OrderDeliveryEacTypeTypeTransformer? _instance;
}

