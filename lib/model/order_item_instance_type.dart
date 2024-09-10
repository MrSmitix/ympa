//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Вид маркировки товара:  * `CIS` — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * `UIN` — УИН, уникальный идентификационный номер.  * `RNPT` — РНПТ, регистрационный номер партии товара.  * `GTD` — номер ГТД, грузовой таможенной декларации. 
class OrderItemInstanceType {
  /// Instantiate a new enum with the provided [value].
  const OrderItemInstanceType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CIS = OrderItemInstanceType._(r'CIS');
  static const UIN = OrderItemInstanceType._(r'UIN');
  static const RNPT = OrderItemInstanceType._(r'RNPT');
  static const GTD = OrderItemInstanceType._(r'GTD');

  /// List of all possible values in this [enum][OrderItemInstanceType].
  static const values = <OrderItemInstanceType>[
    CIS,
    UIN,
    RNPT,
    GTD,
  ];

  static OrderItemInstanceType? fromJson(dynamic value) => OrderItemInstanceTypeTypeTransformer().decode(value);

  static List<OrderItemInstanceType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemInstanceType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemInstanceType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderItemInstanceType] to String,
/// and [decode] dynamic data back to [OrderItemInstanceType].
class OrderItemInstanceTypeTypeTransformer {
  factory OrderItemInstanceTypeTypeTransformer() => _instance ??= const OrderItemInstanceTypeTypeTransformer._();

  const OrderItemInstanceTypeTypeTransformer._();

  String encode(OrderItemInstanceType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderItemInstanceType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderItemInstanceType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CIS': return OrderItemInstanceType.CIS;
        case r'UIN': return OrderItemInstanceType.UIN;
        case r'RNPT': return OrderItemInstanceType.RNPT;
        case r'GTD': return OrderItemInstanceType.GTD;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderItemInstanceTypeTypeTransformer] instance.
  static OrderItemInstanceTypeTypeTransformer? _instance;
}

