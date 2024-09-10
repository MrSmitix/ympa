//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип логистической точки:    * `WAREHOUSE` — склад.   * `PICKUP_POINT` — обычная точка выдачи заказов (ПВЗ).   * `PICKUP_TERMINAL` — постамат.   * `PICKUP_POST_OFFICE` — отделение почтовой связи (ОПС).   * `PICKUP_MIXED` — торговый зал и пункт выдачи заказов.   * `PICKUP_RETAIL` — торговый зал. 
class LogisticPointType {
  /// Instantiate a new enum with the provided [value].
  const LogisticPointType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const WAREHOUSE = LogisticPointType._(r'WAREHOUSE');
  static const PICKUP_POINT = LogisticPointType._(r'PICKUP_POINT');
  static const PICKUP_TERMINAL = LogisticPointType._(r'PICKUP_TERMINAL');
  static const PICKUP_POST_OFFICE = LogisticPointType._(r'PICKUP_POST_OFFICE');
  static const PICKUP_MIXED = LogisticPointType._(r'PICKUP_MIXED');
  static const PICKUP_RETAIL = LogisticPointType._(r'PICKUP_RETAIL');
  static const UNKNOWN = LogisticPointType._(r'UNKNOWN');

  /// List of all possible values in this [enum][LogisticPointType].
  static const values = <LogisticPointType>[
    WAREHOUSE,
    PICKUP_POINT,
    PICKUP_TERMINAL,
    PICKUP_POST_OFFICE,
    PICKUP_MIXED,
    PICKUP_RETAIL,
    UNKNOWN,
  ];

  static LogisticPointType? fromJson(dynamic value) => LogisticPointTypeTypeTransformer().decode(value);

  static List<LogisticPointType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LogisticPointType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LogisticPointType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LogisticPointType] to String,
/// and [decode] dynamic data back to [LogisticPointType].
class LogisticPointTypeTypeTransformer {
  factory LogisticPointTypeTypeTransformer() => _instance ??= const LogisticPointTypeTypeTransformer._();

  const LogisticPointTypeTypeTransformer._();

  String encode(LogisticPointType data) => data.value;

  /// Decodes a [dynamic value][data] to a LogisticPointType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LogisticPointType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'WAREHOUSE': return LogisticPointType.WAREHOUSE;
        case r'PICKUP_POINT': return LogisticPointType.PICKUP_POINT;
        case r'PICKUP_TERMINAL': return LogisticPointType.PICKUP_TERMINAL;
        case r'PICKUP_POST_OFFICE': return LogisticPointType.PICKUP_POST_OFFICE;
        case r'PICKUP_MIXED': return LogisticPointType.PICKUP_MIXED;
        case r'PICKUP_RETAIL': return LogisticPointType.PICKUP_RETAIL;
        case r'UNKNOWN': return LogisticPointType.UNKNOWN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LogisticPointTypeTypeTransformer] instance.
  static LogisticPointTypeTypeTransformer? _instance;
}

