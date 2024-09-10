//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год. 
class TimeUnitType {
  /// Instantiate a new enum with the provided [value].
  const TimeUnitType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HOUR = TimeUnitType._(r'HOUR');
  static const DAY = TimeUnitType._(r'DAY');
  static const WEEK = TimeUnitType._(r'WEEK');
  static const MONTH = TimeUnitType._(r'MONTH');
  static const YEAR = TimeUnitType._(r'YEAR');

  /// List of all possible values in this [enum][TimeUnitType].
  static const values = <TimeUnitType>[
    HOUR,
    DAY,
    WEEK,
    MONTH,
    YEAR,
  ];

  static TimeUnitType? fromJson(dynamic value) => TimeUnitTypeTypeTransformer().decode(value);

  static List<TimeUnitType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TimeUnitType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TimeUnitType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TimeUnitType] to String,
/// and [decode] dynamic data back to [TimeUnitType].
class TimeUnitTypeTypeTransformer {
  factory TimeUnitTypeTypeTransformer() => _instance ??= const TimeUnitTypeTypeTransformer._();

  const TimeUnitTypeTypeTransformer._();

  String encode(TimeUnitType data) => data.value;

  /// Decodes a [dynamic value][data] to a TimeUnitType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TimeUnitType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HOUR': return TimeUnitType.HOUR;
        case r'DAY': return TimeUnitType.DAY;
        case r'WEEK': return TimeUnitType.WEEK;
        case r'MONTH': return TimeUnitType.MONTH;
        case r'YEAR': return TimeUnitType.YEAR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TimeUnitTypeTypeTransformer] instance.
  static TimeUnitTypeTypeTransformer? _instance;
}

