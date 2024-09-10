//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
class AgeUnitType {
  /// Instantiate a new enum with the provided [value].
  const AgeUnitType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const YEAR = AgeUnitType._(r'YEAR');
  static const MONTH = AgeUnitType._(r'MONTH');

  /// List of all possible values in this [enum][AgeUnitType].
  static const values = <AgeUnitType>[
    YEAR,
    MONTH,
  ];

  static AgeUnitType? fromJson(dynamic value) => AgeUnitTypeTypeTransformer().decode(value);

  static List<AgeUnitType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AgeUnitType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AgeUnitType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AgeUnitType] to String,
/// and [decode] dynamic data back to [AgeUnitType].
class AgeUnitTypeTypeTransformer {
  factory AgeUnitTypeTypeTransformer() => _instance ??= const AgeUnitTypeTypeTransformer._();

  const AgeUnitTypeTypeTransformer._();

  String encode(AgeUnitType data) => data.value;

  /// Decodes a [dynamic value][data] to a AgeUnitType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AgeUnitType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'YEAR': return AgeUnitType.YEAR;
        case r'MONTH': return AgeUnitType.MONTH;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AgeUnitTypeTypeTransformer] instance.
  static AgeUnitTypeTypeTransformer? _instance;
}

