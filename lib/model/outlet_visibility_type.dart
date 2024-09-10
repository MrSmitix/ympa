//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена. 
class OutletVisibilityType {
  /// Instantiate a new enum with the provided [value].
  const OutletVisibilityType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HIDDEN = OutletVisibilityType._(r'HIDDEN');
  static const VISIBLE = OutletVisibilityType._(r'VISIBLE');
  static const UNKNOWN = OutletVisibilityType._(r'UNKNOWN');

  /// List of all possible values in this [enum][OutletVisibilityType].
  static const values = <OutletVisibilityType>[
    HIDDEN,
    VISIBLE,
    UNKNOWN,
  ];

  static OutletVisibilityType? fromJson(dynamic value) => OutletVisibilityTypeTypeTransformer().decode(value);

  static List<OutletVisibilityType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OutletVisibilityType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OutletVisibilityType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OutletVisibilityType] to String,
/// and [decode] dynamic data back to [OutletVisibilityType].
class OutletVisibilityTypeTypeTransformer {
  factory OutletVisibilityTypeTypeTransformer() => _instance ??= const OutletVisibilityTypeTypeTransformer._();

  const OutletVisibilityTypeTypeTransformer._();

  String encode(OutletVisibilityType data) => data.value;

  /// Decodes a [dynamic value][data] to a OutletVisibilityType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OutletVisibilityType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HIDDEN': return OutletVisibilityType.HIDDEN;
        case r'VISIBLE': return OutletVisibilityType.VISIBLE;
        case r'UNKNOWN': return OutletVisibilityType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OutletVisibilityTypeTypeTransformer] instance.
  static OutletVisibilityTypeTypeTransformer? _instance;
}

