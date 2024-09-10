//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
class OfferConditionQualityType {
  /// Instantiate a new enum with the provided [value].
  const OfferConditionQualityType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PERFECT = OfferConditionQualityType._(r'PERFECT');
  static const EXCELLENT = OfferConditionQualityType._(r'EXCELLENT');
  static const GOOD = OfferConditionQualityType._(r'GOOD');
  static const NOT_SPECIFIED = OfferConditionQualityType._(r'NOT_SPECIFIED');

  /// List of all possible values in this [enum][OfferConditionQualityType].
  static const values = <OfferConditionQualityType>[
    PERFECT,
    EXCELLENT,
    GOOD,
    NOT_SPECIFIED,
  ];

  static OfferConditionQualityType? fromJson(dynamic value) => OfferConditionQualityTypeTypeTransformer().decode(value);

  static List<OfferConditionQualityType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferConditionQualityType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferConditionQualityType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferConditionQualityType] to String,
/// and [decode] dynamic data back to [OfferConditionQualityType].
class OfferConditionQualityTypeTypeTransformer {
  factory OfferConditionQualityTypeTypeTransformer() => _instance ??= const OfferConditionQualityTypeTypeTransformer._();

  const OfferConditionQualityTypeTypeTransformer._();

  String encode(OfferConditionQualityType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferConditionQualityType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferConditionQualityType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PERFECT': return OfferConditionQualityType.PERFECT;
        case r'EXCELLENT': return OfferConditionQualityType.EXCELLENT;
        case r'GOOD': return OfferConditionQualityType.GOOD;
        case r'NOT_SPECIFIED': return OfferConditionQualityType.NOT_SPECIFIED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferConditionQualityTypeTypeTransformer] instance.
  static OfferConditionQualityTypeTypeTransformer? _instance;
}

