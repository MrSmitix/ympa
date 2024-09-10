//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Система налогообложения (СНО) магазина на момент оформления заказа:  * `ECHN` — единый сельскохозяйственный налог (ЕСХН).  * `ENVD` — единый налог на вмененный доход (ЕНВД).  * `OSN` — общая система налогообложения (ОСН).  * `PSN` — патентная система налогообложения (ПСН).  * `USN` — упрощенная система налогообложения (УСН).  * `USN_MINUS_COST` — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * `NPD` — налог на профессиональный доход (НПД).  * `UNKNOWN_VALUE` — неизвестное значение. Используется только совместно с параметром `payment-method=YANDEX`. 
class OrderTaxSystemType {
  /// Instantiate a new enum with the provided [value].
  const OrderTaxSystemType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OSN = OrderTaxSystemType._(r'OSN');
  static const USN = OrderTaxSystemType._(r'USN');
  static const USN_MINUS_COST = OrderTaxSystemType._(r'USN_MINUS_COST');
  static const ENVD = OrderTaxSystemType._(r'ENVD');
  static const ECHN = OrderTaxSystemType._(r'ECHN');
  static const PSN = OrderTaxSystemType._(r'PSN');
  static const NPD = OrderTaxSystemType._(r'NPD');
  static const UNKNOWN_VALUE = OrderTaxSystemType._(r'UNKNOWN_VALUE');

  /// List of all possible values in this [enum][OrderTaxSystemType].
  static const values = <OrderTaxSystemType>[
    OSN,
    USN,
    USN_MINUS_COST,
    ENVD,
    ECHN,
    PSN,
    NPD,
    UNKNOWN_VALUE,
  ];

  static OrderTaxSystemType? fromJson(dynamic value) => OrderTaxSystemTypeTypeTransformer().decode(value);

  static List<OrderTaxSystemType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderTaxSystemType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderTaxSystemType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderTaxSystemType] to String,
/// and [decode] dynamic data back to [OrderTaxSystemType].
class OrderTaxSystemTypeTypeTransformer {
  factory OrderTaxSystemTypeTypeTransformer() => _instance ??= const OrderTaxSystemTypeTypeTransformer._();

  const OrderTaxSystemTypeTypeTransformer._();

  String encode(OrderTaxSystemType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderTaxSystemType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderTaxSystemType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OSN': return OrderTaxSystemType.OSN;
        case r'USN': return OrderTaxSystemType.USN;
        case r'USN_MINUS_COST': return OrderTaxSystemType.USN_MINUS_COST;
        case r'ENVD': return OrderTaxSystemType.ENVD;
        case r'ECHN': return OrderTaxSystemType.ECHN;
        case r'PSN': return OrderTaxSystemType.PSN;
        case r'NPD': return OrderTaxSystemType.NPD;
        case r'UNKNOWN_VALUE': return OrderTaxSystemType.UNKNOWN_VALUE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderTaxSystemTypeTypeTransformer] instance.
  static OrderTaxSystemTypeTypeTransformer? _instance;
}

