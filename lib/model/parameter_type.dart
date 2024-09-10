//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число. 
class ParameterType {
  /// Instantiate a new enum with the provided [value].
  const ParameterType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const TEXT = ParameterType._(r'TEXT');
  static const ENUM = ParameterType._(r'ENUM');
  static const BOOLEAN = ParameterType._(r'BOOLEAN');
  static const NUMERIC = ParameterType._(r'NUMERIC');

  /// List of all possible values in this [enum][ParameterType].
  static const values = <ParameterType>[
    TEXT,
    ENUM,
    BOOLEAN,
    NUMERIC,
  ];

  static ParameterType? fromJson(dynamic value) => ParameterTypeTypeTransformer().decode(value);

  static List<ParameterType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ParameterType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ParameterType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ParameterType] to String,
/// and [decode] dynamic data back to [ParameterType].
class ParameterTypeTypeTransformer {
  factory ParameterTypeTypeTransformer() => _instance ??= const ParameterTypeTypeTransformer._();

  const ParameterTypeTypeTransformer._();

  String encode(ParameterType data) => data.value;

  /// Decodes a [dynamic value][data] to a ParameterType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ParameterType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'TEXT': return ParameterType.TEXT;
        case r'ENUM': return ParameterType.ENUM;
        case r'BOOLEAN': return ParameterType.BOOLEAN;
        case r'NUMERIC': return ParameterType.NUMERIC;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ParameterTypeTypeTransformer] instance.
  static ParameterTypeTypeTransformer? _instance;
}

