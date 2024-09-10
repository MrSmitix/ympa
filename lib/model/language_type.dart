//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Язык:  * `RU` — русский.  * `EN` — английский. 
class LanguageType {
  /// Instantiate a new enum with the provided [value].
  const LanguageType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RU = LanguageType._(r'RU');
  static const EN = LanguageType._(r'EN');

  /// List of all possible values in this [enum][LanguageType].
  static const values = <LanguageType>[
    RU,
    EN,
  ];

  static LanguageType? fromJson(dynamic value) => LanguageTypeTypeTransformer().decode(value);

  static List<LanguageType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LanguageType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LanguageType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LanguageType] to String,
/// and [decode] dynamic data back to [LanguageType].
class LanguageTypeTypeTransformer {
  factory LanguageTypeTypeTransformer() => _instance ??= const LanguageTypeTypeTransformer._();

  const LanguageTypeTypeTransformer._();

  String encode(LanguageType data) => data.value;

  /// Decodes a [dynamic value][data] to a LanguageType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LanguageType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RU': return LanguageType.RU;
        case r'EN': return LanguageType.EN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LanguageTypeTypeTransformer] instance.
  static LanguageTypeTypeTransformer? _instance;
}

