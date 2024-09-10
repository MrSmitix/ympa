//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип. 
class OrderDeliveryPartnerType {
  /// Instantiate a new enum with the provided [value].
  const OrderDeliveryPartnerType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SHOP = OrderDeliveryPartnerType._(r'SHOP');
  static const YANDEX_MARKET = OrderDeliveryPartnerType._(r'YANDEX_MARKET');
  static const UNKNOWN = OrderDeliveryPartnerType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OrderDeliveryPartnerType].
  static const values = <OrderDeliveryPartnerType>[
    SHOP,
    YANDEX_MARKET,
    UNKNOWN,
  ];

  static OrderDeliveryPartnerType? fromJson(dynamic value) => OrderDeliveryPartnerTypeTypeTransformer().decode(value);

  static List<OrderDeliveryPartnerType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDeliveryPartnerType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDeliveryPartnerType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderDeliveryPartnerType] to String,
/// and [decode] dynamic data back to [OrderDeliveryPartnerType].
class OrderDeliveryPartnerTypeTypeTransformer {
  factory OrderDeliveryPartnerTypeTypeTransformer() => _instance ??= const OrderDeliveryPartnerTypeTypeTransformer._();

  const OrderDeliveryPartnerTypeTypeTransformer._();

  String encode(OrderDeliveryPartnerType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderDeliveryPartnerType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderDeliveryPartnerType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SHOP': return OrderDeliveryPartnerType.SHOP;
        case r'YANDEX_MARKET': return OrderDeliveryPartnerType.YANDEX_MARKET;
        case r'UNKNOWN': return OrderDeliveryPartnerType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderDeliveryPartnerTypeTypeTransformer] instance.
  static OrderDeliveryPartnerTypeTypeTransformer? _instance;
}

