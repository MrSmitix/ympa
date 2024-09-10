//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. 
class LicenseType {
  /// Instantiate a new enum with the provided [value].
  const LicenseType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ALCOHOL = LicenseType._(r'ALCOHOL');
  static const UNKNOWN = LicenseType._(r'UNKNOWN');

  /// List of all possible values in this [enum][LicenseType].
  static const values = <LicenseType>[
    ALCOHOL,
    UNKNOWN,
  ];

  static LicenseType? fromJson(dynamic value) => LicenseTypeTypeTransformer().decode(value);

  static List<LicenseType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LicenseType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LicenseType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LicenseType] to String,
/// and [decode] dynamic data back to [LicenseType].
class LicenseTypeTypeTransformer {
  factory LicenseTypeTypeTransformer() => _instance ??= const LicenseTypeTypeTransformer._();

  const LicenseTypeTypeTransformer._();

  String encode(LicenseType data) => data.value;

  /// Decodes a [dynamic value][data] to a LicenseType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LicenseType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ALCOHOL': return LicenseType.ALCOHOL;
        case r'UNKNOWN': return LicenseType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LicenseTypeTypeTransformer] instance.
  static LicenseTypeTypeTransformer? _instance;
}

