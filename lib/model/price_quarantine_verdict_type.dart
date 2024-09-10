//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Типы карантина:  * `PRICE_CHANGE` — новая цена слишком сильно отличается от прежней. В поле `params` будет  новая цена `CURRENT_PRICE` и последняя цена до попадания в карантин `LAST_VALID_PRICE`. * `LOW_PRICE` — установленная цена слишком сильно отличается от рыночной. В поле `params` будет установленная вами цена `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. * `LOW_PRICE_PROMO` — цена после применения акций слишком сильно отличается от рыночной. В поле `params` будет цена после применения акций `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. 
class PriceQuarantineVerdictType {
  /// Instantiate a new enum with the provided [value].
  const PriceQuarantineVerdictType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PRICE_CHANGE = PriceQuarantineVerdictType._(r'PRICE_CHANGE');
  static const LOW_PRICE = PriceQuarantineVerdictType._(r'LOW_PRICE');
  static const LOW_PRICE_PROMO = PriceQuarantineVerdictType._(r'LOW_PRICE_PROMO');

  /// List of all possible values in this [enum][PriceQuarantineVerdictType].
  static const values = <PriceQuarantineVerdictType>[
    PRICE_CHANGE,
    LOW_PRICE,
    LOW_PRICE_PROMO,
  ];

  static PriceQuarantineVerdictType? fromJson(dynamic value) => PriceQuarantineVerdictTypeTypeTransformer().decode(value);

  static List<PriceQuarantineVerdictType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PriceQuarantineVerdictType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PriceQuarantineVerdictType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PriceQuarantineVerdictType] to String,
/// and [decode] dynamic data back to [PriceQuarantineVerdictType].
class PriceQuarantineVerdictTypeTypeTransformer {
  factory PriceQuarantineVerdictTypeTypeTransformer() => _instance ??= const PriceQuarantineVerdictTypeTypeTransformer._();

  const PriceQuarantineVerdictTypeTypeTransformer._();

  String encode(PriceQuarantineVerdictType data) => data.value;

  /// Decodes a [dynamic value][data] to a PriceQuarantineVerdictType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PriceQuarantineVerdictType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PRICE_CHANGE': return PriceQuarantineVerdictType.PRICE_CHANGE;
        case r'LOW_PRICE': return PriceQuarantineVerdictType.LOW_PRICE;
        case r'LOW_PRICE_PROMO': return PriceQuarantineVerdictType.LOW_PRICE_PROMO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PriceQuarantineVerdictTypeTypeTransformer] instance.
  static PriceQuarantineVerdictTypeTypeTransformer? _instance;
}

