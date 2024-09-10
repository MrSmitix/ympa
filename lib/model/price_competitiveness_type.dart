//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
class PriceCompetitivenessType {
  /// Instantiate a new enum with the provided [value].
  const PriceCompetitivenessType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OPTIMAL = PriceCompetitivenessType._(r'OPTIMAL');
  static const AVERAGE = PriceCompetitivenessType._(r'AVERAGE');
  static const LOW = PriceCompetitivenessType._(r'LOW');

  /// List of all possible values in this [enum][PriceCompetitivenessType].
  static const values = <PriceCompetitivenessType>[
    OPTIMAL,
    AVERAGE,
    LOW,
  ];

  static PriceCompetitivenessType? fromJson(dynamic value) => PriceCompetitivenessTypeTypeTransformer().decode(value);

  static List<PriceCompetitivenessType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PriceCompetitivenessType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PriceCompetitivenessType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PriceCompetitivenessType] to String,
/// and [decode] dynamic data back to [PriceCompetitivenessType].
class PriceCompetitivenessTypeTypeTransformer {
  factory PriceCompetitivenessTypeTypeTransformer() => _instance ??= const PriceCompetitivenessTypeTypeTransformer._();

  const PriceCompetitivenessTypeTypeTransformer._();

  String encode(PriceCompetitivenessType data) => data.value;

  /// Decodes a [dynamic value][data] to a PriceCompetitivenessType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PriceCompetitivenessType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OPTIMAL': return PriceCompetitivenessType.OPTIMAL;
        case r'AVERAGE': return PriceCompetitivenessType.AVERAGE;
        case r'LOW': return PriceCompetitivenessType.LOW;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PriceCompetitivenessTypeTypeTransformer] instance.
  static PriceCompetitivenessTypeTypeTransformer? _instance;
}

