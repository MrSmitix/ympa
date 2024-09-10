//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип региона.  Возможные значения:  * `CITY_DISTRICT` — район города.  * `CITY` — крупный город.  * `CONTINENT` — континент.  * `COUNTRY_DISTRICT` — область.  * `COUNTRY` — страна.  * `REGION` — регион.  * `REPUBLIC_AREA` — район субъекта федерации.  * `REPUBLIC` — субъект федерации.  * `SUBWAY_STATION` — станция метро.  * `VILLAGE` — город.  * `OTHER` — неизвестный регион. 
class RegionType {
  /// Instantiate a new enum with the provided [value].
  const RegionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OTHER = RegionType._(r'OTHER');
  static const CONTINENT = RegionType._(r'CONTINENT');
  static const REGION = RegionType._(r'REGION');
  static const COUNTRY = RegionType._(r'COUNTRY');
  static const COUNTRY_DISTRICT = RegionType._(r'COUNTRY_DISTRICT');
  static const REPUBLIC = RegionType._(r'REPUBLIC');
  static const CITY = RegionType._(r'CITY');
  static const VILLAGE = RegionType._(r'VILLAGE');
  static const CITY_DISTRICT = RegionType._(r'CITY_DISTRICT');
  static const SUBWAY_STATION = RegionType._(r'SUBWAY_STATION');
  static const REPUBLIC_AREA = RegionType._(r'REPUBLIC_AREA');

  /// List of all possible values in this [enum][RegionType].
  static const values = <RegionType>[
    OTHER,
    CONTINENT,
    REGION,
    COUNTRY,
    COUNTRY_DISTRICT,
    REPUBLIC,
    CITY,
    VILLAGE,
    CITY_DISTRICT,
    SUBWAY_STATION,
    REPUBLIC_AREA,
  ];

  static RegionType? fromJson(dynamic value) => RegionTypeTypeTransformer().decode(value);

  static List<RegionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RegionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RegionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RegionType] to String,
/// and [decode] dynamic data back to [RegionType].
class RegionTypeTypeTransformer {
  factory RegionTypeTypeTransformer() => _instance ??= const RegionTypeTypeTransformer._();

  const RegionTypeTypeTransformer._();

  String encode(RegionType data) => data.value;

  /// Decodes a [dynamic value][data] to a RegionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RegionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OTHER': return RegionType.OTHER;
        case r'CONTINENT': return RegionType.CONTINENT;
        case r'REGION': return RegionType.REGION;
        case r'COUNTRY': return RegionType.COUNTRY;
        case r'COUNTRY_DISTRICT': return RegionType.COUNTRY_DISTRICT;
        case r'REPUBLIC': return RegionType.REPUBLIC;
        case r'CITY': return RegionType.CITY;
        case r'VILLAGE': return RegionType.VILLAGE;
        case r'CITY_DISTRICT': return RegionType.CITY_DISTRICT;
        case r'SUBWAY_STATION': return RegionType.SUBWAY_STATION;
        case r'REPUBLIC_AREA': return RegionType.REPUBLIC_AREA;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RegionTypeTypeTransformer] instance.
  static RegionTypeTypeTransformer? _instance;
}

