//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * `DELIVERY` — скидка за доставку (DBS). 
class OrderSubsidyType {
  /// Instantiate a new enum with the provided [value].
  const OrderSubsidyType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const YANDEX_CASHBACK = OrderSubsidyType._(r'YANDEX_CASHBACK');
  static const SUBSIDY = OrderSubsidyType._(r'SUBSIDY');
  static const DELIVERY = OrderSubsidyType._(r'DELIVERY');

  /// List of all possible values in this [enum][OrderSubsidyType].
  static const values = <OrderSubsidyType>[
    YANDEX_CASHBACK,
    SUBSIDY,
    DELIVERY,
  ];

  static OrderSubsidyType? fromJson(dynamic value) => OrderSubsidyTypeTypeTransformer().decode(value);

  static List<OrderSubsidyType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderSubsidyType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderSubsidyType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderSubsidyType] to String,
/// and [decode] dynamic data back to [OrderSubsidyType].
class OrderSubsidyTypeTypeTransformer {
  factory OrderSubsidyTypeTypeTransformer() => _instance ??= const OrderSubsidyTypeTypeTransformer._();

  const OrderSubsidyTypeTypeTransformer._();

  String encode(OrderSubsidyType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderSubsidyType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderSubsidyType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'YANDEX_CASHBACK': return OrderSubsidyType.YANDEX_CASHBACK;
        case r'SUBSIDY': return OrderSubsidyType.SUBSIDY;
        case r'DELIVERY': return OrderSubsidyType.DELIVERY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderSubsidyTypeTypeTransformer] instance.
  static OrderSubsidyTypeTypeTransformer? _instance;
}

