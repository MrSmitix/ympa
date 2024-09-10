//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду. 
class MechanicsType {
  /// Instantiate a new enum with the provided [value].
  const MechanicsType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DIRECT_DISCOUNT = MechanicsType._(r'DIRECT_DISCOUNT');
  static const BLUE_FLASH = MechanicsType._(r'BLUE_FLASH');
  static const MARKET_PROMOCODE = MechanicsType._(r'MARKET_PROMOCODE');

  /// List of all possible values in this [enum][MechanicsType].
  static const values = <MechanicsType>[
    DIRECT_DISCOUNT,
    BLUE_FLASH,
    MARKET_PROMOCODE,
  ];

  static MechanicsType? fromJson(dynamic value) => MechanicsTypeTypeTransformer().decode(value);

  static List<MechanicsType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MechanicsType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MechanicsType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MechanicsType] to String,
/// and [decode] dynamic data back to [MechanicsType].
class MechanicsTypeTypeTransformer {
  factory MechanicsTypeTypeTransformer() => _instance ??= const MechanicsTypeTypeTransformer._();

  const MechanicsTypeTypeTransformer._();

  String encode(MechanicsType data) => data.value;

  /// Decodes a [dynamic value][data] to a MechanicsType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MechanicsType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DIRECT_DISCOUNT': return MechanicsType.DIRECT_DISCOUNT;
        case r'BLUE_FLASH': return MechanicsType.BLUE_FLASH;
        case r'MARKET_PROMOCODE': return MechanicsType.MARKET_PROMOCODE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MechanicsTypeTypeTransformer] instance.
  static MechanicsTypeTypeTransformer? _instance;
}

