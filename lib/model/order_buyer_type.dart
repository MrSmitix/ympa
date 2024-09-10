//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
class OrderBuyerType {
  /// Instantiate a new enum with the provided [value].
  const OrderBuyerType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PERSON = OrderBuyerType._(r'PERSON');
  static const BUSINESS = OrderBuyerType._(r'BUSINESS');

  /// List of all possible values in this [enum][OrderBuyerType].
  static const values = <OrderBuyerType>[
    PERSON,
    BUSINESS,
  ];

  static OrderBuyerType? fromJson(dynamic value) => OrderBuyerTypeTypeTransformer().decode(value);

  static List<OrderBuyerType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderBuyerType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderBuyerType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderBuyerType] to String,
/// and [decode] dynamic data back to [OrderBuyerType].
class OrderBuyerTypeTypeTransformer {
  factory OrderBuyerTypeTypeTransformer() => _instance ??= const OrderBuyerTypeTypeTransformer._();

  const OrderBuyerTypeTypeTransformer._();

  String encode(OrderBuyerType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderBuyerType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderBuyerType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PERSON': return OrderBuyerType.PERSON;
        case r'BUSINESS': return OrderBuyerType.BUSINESS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderBuyerTypeTypeTransformer] instance.
  static OrderBuyerTypeTypeTransformer? _instance;
}

