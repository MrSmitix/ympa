//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// День недели:  * `MONDAY` — понедельник. * `TUESDAY` — вторник. * `WEDNESDAY` — среда. * `THURSDAY` — четверг. * `FRIDAY` — пятница. * `SATURDAY` — суббота. * `SUNDAY` — воскресенье. 
class DayOfWeekType {
  /// Instantiate a new enum with the provided [value].
  const DayOfWeekType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const MONDAY = DayOfWeekType._(r'MONDAY');
  static const TUESDAY = DayOfWeekType._(r'TUESDAY');
  static const WEDNESDAY = DayOfWeekType._(r'WEDNESDAY');
  static const THURSDAY = DayOfWeekType._(r'THURSDAY');
  static const FRIDAY = DayOfWeekType._(r'FRIDAY');
  static const SATURDAY = DayOfWeekType._(r'SATURDAY');
  static const SUNDAY = DayOfWeekType._(r'SUNDAY');

  /// List of all possible values in this [enum][DayOfWeekType].
  static const values = <DayOfWeekType>[
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY,
  ];

  static DayOfWeekType? fromJson(dynamic value) => DayOfWeekTypeTypeTransformer().decode(value);

  static List<DayOfWeekType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DayOfWeekType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DayOfWeekType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DayOfWeekType] to String,
/// and [decode] dynamic data back to [DayOfWeekType].
class DayOfWeekTypeTypeTransformer {
  factory DayOfWeekTypeTypeTransformer() => _instance ??= const DayOfWeekTypeTypeTransformer._();

  const DayOfWeekTypeTypeTransformer._();

  String encode(DayOfWeekType data) => data.value;

  /// Decodes a [dynamic value][data] to a DayOfWeekType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DayOfWeekType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'MONDAY': return DayOfWeekType.MONDAY;
        case r'TUESDAY': return DayOfWeekType.TUESDAY;
        case r'WEDNESDAY': return DayOfWeekType.WEDNESDAY;
        case r'THURSDAY': return DayOfWeekType.THURSDAY;
        case r'FRIDAY': return DayOfWeekType.FRIDAY;
        case r'SATURDAY': return DayOfWeekType.SATURDAY;
        case r'SUNDAY': return DayOfWeekType.SUNDAY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DayOfWeekTypeTypeTransformer] instance.
  static DayOfWeekTypeTypeTransformer? _instance;
}

