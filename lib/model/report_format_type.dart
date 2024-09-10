//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета. 
class ReportFormatType {
  /// Instantiate a new enum with the provided [value].
  const ReportFormatType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FILE = ReportFormatType._(r'FILE');
  static const CSV = ReportFormatType._(r'CSV');

  /// List of all possible values in this [enum][ReportFormatType].
  static const values = <ReportFormatType>[
    FILE,
    CSV,
  ];

  static ReportFormatType? fromJson(dynamic value) => ReportFormatTypeTypeTransformer().decode(value);

  static List<ReportFormatType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReportFormatType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReportFormatType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReportFormatType] to String,
/// and [decode] dynamic data back to [ReportFormatType].
class ReportFormatTypeTypeTransformer {
  factory ReportFormatTypeTypeTransformer() => _instance ??= const ReportFormatTypeTypeTransformer._();

  const ReportFormatTypeTypeTransformer._();

  String encode(ReportFormatType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReportFormatType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReportFormatType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FILE': return ReportFormatType.FILE;
        case r'CSV': return ReportFormatType.CSV;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReportFormatTypeTypeTransformer] instance.
  static ReportFormatTypeTypeTransformer? _instance;
}

