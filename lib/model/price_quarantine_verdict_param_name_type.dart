//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта. 
class PriceQuarantineVerdictParamNameType {
  /// Instantiate a new enum with the provided [value].
  const PriceQuarantineVerdictParamNameType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CURRENT_PRICE = PriceQuarantineVerdictParamNameType._(r'CURRENT_PRICE');
  static const LAST_VALID_PRICE = PriceQuarantineVerdictParamNameType._(r'LAST_VALID_PRICE');
  static const MIN_PRICE = PriceQuarantineVerdictParamNameType._(r'MIN_PRICE');
  static const CURRENCY = PriceQuarantineVerdictParamNameType._(r'CURRENCY');

  /// List of all possible values in this [enum][PriceQuarantineVerdictParamNameType].
  static const values = <PriceQuarantineVerdictParamNameType>[
    CURRENT_PRICE,
    LAST_VALID_PRICE,
    MIN_PRICE,
    CURRENCY,
  ];

  static PriceQuarantineVerdictParamNameType? fromJson(dynamic value) => PriceQuarantineVerdictParamNameTypeTypeTransformer().decode(value);

  static List<PriceQuarantineVerdictParamNameType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PriceQuarantineVerdictParamNameType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PriceQuarantineVerdictParamNameType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PriceQuarantineVerdictParamNameType] to String,
/// and [decode] dynamic data back to [PriceQuarantineVerdictParamNameType].
class PriceQuarantineVerdictParamNameTypeTypeTransformer {
  factory PriceQuarantineVerdictParamNameTypeTypeTransformer() => _instance ??= const PriceQuarantineVerdictParamNameTypeTypeTransformer._();

  const PriceQuarantineVerdictParamNameTypeTypeTransformer._();

  String encode(PriceQuarantineVerdictParamNameType data) => data.value;

  /// Decodes a [dynamic value][data] to a PriceQuarantineVerdictParamNameType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PriceQuarantineVerdictParamNameType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CURRENT_PRICE': return PriceQuarantineVerdictParamNameType.CURRENT_PRICE;
        case r'LAST_VALID_PRICE': return PriceQuarantineVerdictParamNameType.LAST_VALID_PRICE;
        case r'MIN_PRICE': return PriceQuarantineVerdictParamNameType.MIN_PRICE;
        case r'CURRENCY': return PriceQuarantineVerdictParamNameType.CURRENCY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PriceQuarantineVerdictParamNameTypeTypeTransformer] instance.
  static PriceQuarantineVerdictParamNameTypeTypeTransformer? _instance;
}

