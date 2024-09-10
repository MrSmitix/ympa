//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |`LOW`|`turnoverDays` ≥ 120|| |`ALMOST_LOW`|100 ≤ `turnoverDays` < 120|| |`HIGH`|45 ≤ `turnoverDays` < 100|| |`VERY_HIGH`|0 ≤ `turnoverDays` < 45|| |`NO_SALES`|—|Продаж нет.| |`FREE_STORE`|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
class TurnoverType {
  /// Instantiate a new enum with the provided [value].
  const TurnoverType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const LOW = TurnoverType._(r'LOW');
  static const ALMOST_LOW = TurnoverType._(r'ALMOST_LOW');
  static const HIGH = TurnoverType._(r'HIGH');
  static const VERY_HIGH = TurnoverType._(r'VERY_HIGH');
  static const NO_SALES = TurnoverType._(r'NO_SALES');
  static const FREE_STORE = TurnoverType._(r'FREE_STORE');

  /// List of all possible values in this [enum][TurnoverType].
  static const values = <TurnoverType>[
    LOW,
    ALMOST_LOW,
    HIGH,
    VERY_HIGH,
    NO_SALES,
    FREE_STORE,
  ];

  static TurnoverType? fromJson(dynamic value) => TurnoverTypeTypeTransformer().decode(value);

  static List<TurnoverType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TurnoverType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TurnoverType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TurnoverType] to String,
/// and [decode] dynamic data back to [TurnoverType].
class TurnoverTypeTypeTransformer {
  factory TurnoverTypeTypeTransformer() => _instance ??= const TurnoverTypeTypeTransformer._();

  const TurnoverTypeTypeTransformer._();

  String encode(TurnoverType data) => data.value;

  /// Decodes a [dynamic value][data] to a TurnoverType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TurnoverType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'LOW': return TurnoverType.LOW;
        case r'ALMOST_LOW': return TurnoverType.ALMOST_LOW;
        case r'HIGH': return TurnoverType.HIGH;
        case r'VERY_HIGH': return TurnoverType.VERY_HIGH;
        case r'NO_SALES': return TurnoverType.NO_SALES;
        case r'FREE_STORE': return TurnoverType.FREE_STORE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TurnoverTypeTypeTransformer] instance.
  static TurnoverTypeTypeTransformer? _instance;
}

