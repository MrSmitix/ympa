//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. 
class OrdersStatsPriceType {
  /// Instantiate a new enum with the provided [value].
  const OrdersStatsPriceType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BUYER = OrdersStatsPriceType._(r'BUYER');
  static const CASHBACK = OrdersStatsPriceType._(r'CASHBACK');
  static const MARKETPLACE = OrdersStatsPriceType._(r'MARKETPLACE');

  /// List of all possible values in this [enum][OrdersStatsPriceType].
  static const values = <OrdersStatsPriceType>[
    BUYER,
    CASHBACK,
    MARKETPLACE,
  ];

  static OrdersStatsPriceType? fromJson(dynamic value) => OrdersStatsPriceTypeTypeTransformer().decode(value);

  static List<OrdersStatsPriceType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsPriceType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsPriceType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrdersStatsPriceType] to String,
/// and [decode] dynamic data back to [OrdersStatsPriceType].
class OrdersStatsPriceTypeTypeTransformer {
  factory OrdersStatsPriceTypeTypeTransformer() => _instance ??= const OrdersStatsPriceTypeTypeTransformer._();

  const OrdersStatsPriceTypeTypeTransformer._();

  String encode(OrdersStatsPriceType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrdersStatsPriceType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrdersStatsPriceType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'BUYER': return OrdersStatsPriceType.BUYER;
        case r'CASHBACK': return OrdersStatsPriceType.CASHBACK;
        case r'MARKETPLACE': return OrdersStatsPriceType.MARKETPLACE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrdersStatsPriceTypeTypeTransformer] instance.
  static OrdersStatsPriceTypeTypeTransformer? _instance;
}

