//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
class LicenseCheckStatusType {
  /// Instantiate a new enum with the provided [value].
  const LicenseCheckStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NEW = LicenseCheckStatusType._(r'NEW');
  static const SUCCESS = LicenseCheckStatusType._(r'SUCCESS');
  static const FAIL = LicenseCheckStatusType._(r'FAIL');
  static const REVOKE = LicenseCheckStatusType._(r'REVOKE');
  static const DONT_WANT = LicenseCheckStatusType._(r'DONT_WANT');
  static const FAIL_MANUAL = LicenseCheckStatusType._(r'FAIL_MANUAL');

  /// List of all possible values in this [enum][LicenseCheckStatusType].
  static const values = <LicenseCheckStatusType>[
    NEW,
    SUCCESS,
    FAIL,
    REVOKE,
    DONT_WANT,
    FAIL_MANUAL,
  ];

  static LicenseCheckStatusType? fromJson(dynamic value) => LicenseCheckStatusTypeTypeTransformer().decode(value);

  static List<LicenseCheckStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LicenseCheckStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LicenseCheckStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LicenseCheckStatusType] to String,
/// and [decode] dynamic data back to [LicenseCheckStatusType].
class LicenseCheckStatusTypeTypeTransformer {
  factory LicenseCheckStatusTypeTypeTransformer() => _instance ??= const LicenseCheckStatusTypeTypeTransformer._();

  const LicenseCheckStatusTypeTypeTransformer._();

  String encode(LicenseCheckStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a LicenseCheckStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LicenseCheckStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NEW': return LicenseCheckStatusType.NEW;
        case r'SUCCESS': return LicenseCheckStatusType.SUCCESS;
        case r'FAIL': return LicenseCheckStatusType.FAIL;
        case r'REVOKE': return LicenseCheckStatusType.REVOKE;
        case r'DONT_WANT': return LicenseCheckStatusType.DONT_WANT;
        case r'FAIL_MANUAL': return LicenseCheckStatusType.FAIL_MANUAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LicenseCheckStatusTypeTypeTransformer] instance.
  static LicenseCheckStatusTypeTypeTransformer? _instance;
}

