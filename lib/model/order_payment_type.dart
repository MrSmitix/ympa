//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
class OrderPaymentType {
  /// Instantiate a new enum with the provided [value].
  const OrderPaymentType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PREPAID = OrderPaymentType._(r'PREPAID');
  static const POSTPAID = OrderPaymentType._(r'POSTPAID');
  static const UNKNOWN = OrderPaymentType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OrderPaymentType].
  static const values = <OrderPaymentType>[
    PREPAID,
    POSTPAID,
    UNKNOWN,
  ];

  static OrderPaymentType? fromJson(dynamic value) => OrderPaymentTypeTypeTransformer().decode(value);

  static List<OrderPaymentType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderPaymentType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderPaymentType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderPaymentType] to String,
/// and [decode] dynamic data back to [OrderPaymentType].
class OrderPaymentTypeTypeTransformer {
  factory OrderPaymentTypeTypeTransformer() => _instance ??= const OrderPaymentTypeTypeTransformer._();

  const OrderPaymentTypeTypeTransformer._();

  String encode(OrderPaymentType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderPaymentType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderPaymentType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PREPAID': return OrderPaymentType.PREPAID;
        case r'POSTPAID': return OrderPaymentType.POSTPAID;
        case r'UNKNOWN': return OrderPaymentType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderPaymentTypeTypeTransformer] instance.
  static OrderPaymentTypeTypeTransformer? _instance;
}

