//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
class OrderItemSubsidyType {
  /// Instantiate a new enum with the provided [value].
  const OrderItemSubsidyType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const YANDEX_CASHBACK = OrderItemSubsidyType._(r'YANDEX_CASHBACK');
  static const SUBSIDY = OrderItemSubsidyType._(r'SUBSIDY');

  /// List of all possible values in this [enum][OrderItemSubsidyType].
  static const values = <OrderItemSubsidyType>[
    YANDEX_CASHBACK,
    SUBSIDY,
  ];

  static OrderItemSubsidyType? fromJson(dynamic value) => OrderItemSubsidyTypeTypeTransformer().decode(value);

  static List<OrderItemSubsidyType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemSubsidyType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemSubsidyType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderItemSubsidyType] to String,
/// and [decode] dynamic data back to [OrderItemSubsidyType].
class OrderItemSubsidyTypeTypeTransformer {
  factory OrderItemSubsidyTypeTypeTransformer() => _instance ??= const OrderItemSubsidyTypeTypeTransformer._();

  const OrderItemSubsidyTypeTypeTransformer._();

  String encode(OrderItemSubsidyType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderItemSubsidyType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderItemSubsidyType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'YANDEX_CASHBACK': return OrderItemSubsidyType.YANDEX_CASHBACK;
        case r'SUBSIDY': return OrderItemSubsidyType.SUBSIDY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderItemSubsidyTypeTypeTransformer] instance.
  static OrderItemSubsidyTypeTypeTransformer? _instance;
}

