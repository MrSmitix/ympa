//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей. 
class ReportSubStatusType {
  /// Instantiate a new enum with the provided [value].
  const ReportSubStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NO_DATA = ReportSubStatusType._(r'NO_DATA');
  static const TOO_LARGE = ReportSubStatusType._(r'TOO_LARGE');
  static const RESOURCE_NOT_FOUND = ReportSubStatusType._(r'RESOURCE_NOT_FOUND');

  /// List of all possible values in this [enum][ReportSubStatusType].
  static const values = <ReportSubStatusType>[
    NO_DATA,
    TOO_LARGE,
    RESOURCE_NOT_FOUND,
  ];

  static ReportSubStatusType? fromJson(dynamic value) => ReportSubStatusTypeTypeTransformer().decode(value);

  static List<ReportSubStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReportSubStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReportSubStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReportSubStatusType] to String,
/// and [decode] dynamic data back to [ReportSubStatusType].
class ReportSubStatusTypeTypeTransformer {
  factory ReportSubStatusTypeTypeTransformer() => _instance ??= const ReportSubStatusTypeTypeTransformer._();

  const ReportSubStatusTypeTypeTransformer._();

  String encode(ReportSubStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReportSubStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReportSubStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NO_DATA': return ReportSubStatusType.NO_DATA;
        case r'TOO_LARGE': return ReportSubStatusType.TOO_LARGE;
        case r'RESOURCE_NOT_FOUND': return ReportSubStatusType.RESOURCE_NOT_FOUND;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReportSubStatusTypeTypeTransformer] instance.
  static ReportSubStatusTypeTypeTransformer? _instance;
}

