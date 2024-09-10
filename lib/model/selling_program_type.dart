//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
class SellingProgramType {
  /// Instantiate a new enum with the provided [value].
  const SellingProgramType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FBY = SellingProgramType._(r'FBY');
  static const FBS = SellingProgramType._(r'FBS');
  static const DBS = SellingProgramType._(r'DBS');
  static const EXPRESS = SellingProgramType._(r'EXPRESS');

  /// List of all possible values in this [enum][SellingProgramType].
  static const values = <SellingProgramType>[
    FBY,
    FBS,
    DBS,
    EXPRESS,
  ];

  static SellingProgramType? fromJson(dynamic value) => SellingProgramTypeTypeTransformer().decode(value);

  static List<SellingProgramType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SellingProgramType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SellingProgramType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [SellingProgramType] to String,
/// and [decode] dynamic data back to [SellingProgramType].
class SellingProgramTypeTypeTransformer {
  factory SellingProgramTypeTypeTransformer() => _instance ??= const SellingProgramTypeTypeTransformer._();

  const SellingProgramTypeTypeTransformer._();

  String encode(SellingProgramType data) => data.value;

  /// Decodes a [dynamic value][data] to a SellingProgramType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  SellingProgramType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FBY': return SellingProgramType.FBY;
        case r'FBS': return SellingProgramType.FBS;
        case r'DBS': return SellingProgramType.DBS;
        case r'EXPRESS': return SellingProgramType.EXPRESS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [SellingProgramTypeTypeTransformer] instance.
  static SellingProgramTypeTypeTransformer? _instance;
}

