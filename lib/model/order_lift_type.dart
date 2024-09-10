//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип подъема заказа на этаж:  * `NOT_NEEDED` — не требуется.  * `MANUAL` — ручной.  * `ELEVATOR` — лифт.  * `CARGO_ELEVATOR` — грузовой лифт.  * `FREE` — любой из перечисленных выше, если включена опция бесплатного подъема.  * `UNKNOWN` — неизвестный тип. 
class OrderLiftType {
  /// Instantiate a new enum with the provided [value].
  const OrderLiftType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NOT_NEEDED = OrderLiftType._(r'NOT_NEEDED');
  static const MANUAL = OrderLiftType._(r'MANUAL');
  static const ELEVATOR = OrderLiftType._(r'ELEVATOR');
  static const CARGO_ELEVATOR = OrderLiftType._(r'CARGO_ELEVATOR');
  static const FREE = OrderLiftType._(r'FREE');
  static const UNKNOWN = OrderLiftType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OrderLiftType].
  static const values = <OrderLiftType>[
    NOT_NEEDED,
    MANUAL,
    ELEVATOR,
    CARGO_ELEVATOR,
    FREE,
    UNKNOWN,
  ];

  static OrderLiftType? fromJson(dynamic value) => OrderLiftTypeTypeTransformer().decode(value);

  static List<OrderLiftType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderLiftType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderLiftType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderLiftType] to String,
/// and [decode] dynamic data back to [OrderLiftType].
class OrderLiftTypeTypeTransformer {
  factory OrderLiftTypeTypeTransformer() => _instance ??= const OrderLiftTypeTypeTransformer._();

  const OrderLiftTypeTypeTransformer._();

  String encode(OrderLiftType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderLiftType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderLiftType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NOT_NEEDED': return OrderLiftType.NOT_NEEDED;
        case r'MANUAL': return OrderLiftType.MANUAL;
        case r'ELEVATOR': return OrderLiftType.ELEVATOR;
        case r'CARGO_ELEVATOR': return OrderLiftType.CARGO_ELEVATOR;
        case r'FREE': return OrderLiftType.FREE;
        case r'UNKNOWN': return OrderLiftType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderLiftTypeTypeTransformer] instance.
  static OrderLiftTypeTypeTransformer? _instance;
}

