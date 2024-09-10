//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
class ShelfsStatisticsAttributionType {
  /// Instantiate a new enum with the provided [value].
  const ShelfsStatisticsAttributionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CLICKS = ShelfsStatisticsAttributionType._(r'CLICKS');
  static const SHOWS = ShelfsStatisticsAttributionType._(r'SHOWS');

  /// List of all possible values in this [enum][ShelfsStatisticsAttributionType].
  static const values = <ShelfsStatisticsAttributionType>[
    CLICKS,
    SHOWS,
  ];

  static ShelfsStatisticsAttributionType? fromJson(dynamic value) => ShelfsStatisticsAttributionTypeTypeTransformer().decode(value);

  static List<ShelfsStatisticsAttributionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ShelfsStatisticsAttributionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ShelfsStatisticsAttributionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ShelfsStatisticsAttributionType] to String,
/// and [decode] dynamic data back to [ShelfsStatisticsAttributionType].
class ShelfsStatisticsAttributionTypeTypeTransformer {
  factory ShelfsStatisticsAttributionTypeTypeTransformer() => _instance ??= const ShelfsStatisticsAttributionTypeTypeTransformer._();

  const ShelfsStatisticsAttributionTypeTypeTransformer._();

  String encode(ShelfsStatisticsAttributionType data) => data.value;

  /// Decodes a [dynamic value][data] to a ShelfsStatisticsAttributionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ShelfsStatisticsAttributionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CLICKS': return ShelfsStatisticsAttributionType.CLICKS;
        case r'SHOWS': return ShelfsStatisticsAttributionType.SHOWS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ShelfsStatisticsAttributionTypeTypeTransformer] instance.
  static ShelfsStatisticsAttributionTypeTypeTransformer? _instance;
}

