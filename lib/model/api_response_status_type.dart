//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип ответа.
class ApiResponseStatusType {
  /// Instantiate a new enum with the provided [value].
  const ApiResponseStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OK = ApiResponseStatusType._(r'OK');
  static const ERROR = ApiResponseStatusType._(r'ERROR');

  /// List of all possible values in this [enum][ApiResponseStatusType].
  static const values = <ApiResponseStatusType>[
    OK,
    ERROR,
  ];

  static ApiResponseStatusType? fromJson(dynamic value) => ApiResponseStatusTypeTypeTransformer().decode(value);

  static List<ApiResponseStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ApiResponseStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ApiResponseStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ApiResponseStatusType] to String,
/// and [decode] dynamic data back to [ApiResponseStatusType].
class ApiResponseStatusTypeTypeTransformer {
  factory ApiResponseStatusTypeTypeTransformer() => _instance ??= const ApiResponseStatusTypeTypeTransformer._();

  const ApiResponseStatusTypeTypeTransformer._();

  String encode(ApiResponseStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a ApiResponseStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ApiResponseStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OK': return ApiResponseStatusType.OK;
        case r'ERROR': return ApiResponseStatusType.ERROR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ApiResponseStatusTypeTypeTransformer] instance.
  static ApiResponseStatusTypeTypeTransformer? _instance;
}

