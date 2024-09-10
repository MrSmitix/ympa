//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Ставка налога на добавленную стоимость (НДС) на товар:  * `NO_VAT` — НДС не облагается, используется только для отдельных видов услуг.  * `VAT_0` — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * `VAT_10` — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * `VAT_10_110` — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * `VAT_20` — НДС 20%. Основная ставка с 2019 года.  * `VAT_20_120` — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * `VAT_18` — НДС 18%. Основная ставка до 2019 года.  * `VAT_18_118` — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * `UNKNOWN_VALUE` — неизвестный тип.  Используется только совместно с параметром `payment-method=YANDEX`. 
class OrderVatType {
  /// Instantiate a new enum with the provided [value].
  const OrderVatType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NO_VAT = OrderVatType._(r'NO_VAT');
  static const vAT0 = OrderVatType._(r'VAT_0');
  static const vAT10 = OrderVatType._(r'VAT_10');
  static const vAT10110 = OrderVatType._(r'VAT_10_110');
  static const vAT20 = OrderVatType._(r'VAT_20');
  static const vAT20120 = OrderVatType._(r'VAT_20_120');
  static const vAT18 = OrderVatType._(r'VAT_18');
  static const vAT18118 = OrderVatType._(r'VAT_18_118');
  static const UNKNOWN_VALUE = OrderVatType._(r'UNKNOWN_VALUE');

  /// List of all possible values in this [enum][OrderVatType].
  static const values = <OrderVatType>[
    NO_VAT,
    vAT0,
    vAT10,
    vAT10110,
    vAT20,
    vAT20120,
    vAT18,
    vAT18118,
    UNKNOWN_VALUE,
  ];

  static OrderVatType? fromJson(dynamic value) => OrderVatTypeTypeTransformer().decode(value);

  static List<OrderVatType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderVatType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderVatType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderVatType] to String,
/// and [decode] dynamic data back to [OrderVatType].
class OrderVatTypeTypeTransformer {
  factory OrderVatTypeTypeTransformer() => _instance ??= const OrderVatTypeTypeTransformer._();

  const OrderVatTypeTypeTransformer._();

  String encode(OrderVatType data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderVatType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderVatType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NO_VAT': return OrderVatType.NO_VAT;
        case r'VAT_0': return OrderVatType.vAT0;
        case r'VAT_10': return OrderVatType.vAT10;
        case r'VAT_10_110': return OrderVatType.vAT10110;
        case r'VAT_20': return OrderVatType.vAT20;
        case r'VAT_20_120': return OrderVatType.vAT20120;
        case r'VAT_18': return OrderVatType.vAT18;
        case r'VAT_18_118': return OrderVatType.vAT18118;
        case r'UNKNOWN_VALUE': return OrderVatType.UNKNOWN_VALUE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderVatTypeTypeTransformer] instance.
  static OrderVatTypeTypeTransformer? _instance;
}

