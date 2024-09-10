//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS. 
class PlacementType {
  /// Instantiate a new enum with the provided [value].
  const PlacementType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FBS = PlacementType._(r'FBS');
  static const FBY = PlacementType._(r'FBY');
  static const DBS = PlacementType._(r'DBS');

  /// List of all possible values in this [enum][PlacementType].
  static const values = <PlacementType>[
    FBS,
    FBY,
    DBS,
  ];

  static PlacementType? fromJson(dynamic value) => PlacementTypeTypeTransformer().decode(value);

  static List<PlacementType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PlacementType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PlacementType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PlacementType] to String,
/// and [decode] dynamic data back to [PlacementType].
class PlacementTypeTypeTransformer {
  factory PlacementTypeTypeTransformer() => _instance ??= const PlacementTypeTypeTransformer._();

  const PlacementTypeTypeTransformer._();

  String encode(PlacementType data) => data.value;

  /// Decodes a [dynamic value][data] to a PlacementType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PlacementType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FBS': return PlacementType.FBS;
        case r'FBY': return PlacementType.FBY;
        case r'DBS': return PlacementType.DBS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PlacementTypeTypeTransformer] instance.
  static PlacementTypeTypeTransformer? _instance;
}

