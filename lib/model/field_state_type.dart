//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено. 
class FieldStateType {
  /// Instantiate a new enum with the provided [value].
  const FieldStateType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SPECIFIED = FieldStateType._(r'SPECIFIED');
  static const EMPTY = FieldStateType._(r'EMPTY');

  /// List of all possible values in this [enum][FieldStateType].
  static const values = <FieldStateType>[
    SPECIFIED,
    EMPTY,
  ];

  static FieldStateType? fromJson(dynamic value) => FieldStateTypeTypeTransformer().decode(value);

  static List<FieldStateType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FieldStateType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FieldStateType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FieldStateType] to String,
/// and [decode] dynamic data back to [FieldStateType].
class FieldStateTypeTypeTransformer {
  factory FieldStateTypeTypeTransformer() => _instance ??= const FieldStateTypeTypeTransformer._();

  const FieldStateTypeTypeTransformer._();

  String encode(FieldStateType data) => data.value;

  /// Decodes a [dynamic value][data] to a FieldStateType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FieldStateType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SPECIFIED': return FieldStateType.SPECIFIED;
        case r'EMPTY': return FieldStateType.EMPTY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FieldStateTypeTypeTransformer] instance.
  static FieldStateTypeTypeTransformer? _instance;
}

