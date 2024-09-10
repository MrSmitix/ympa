//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. 
class ReportStatusType {
  /// Instantiate a new enum with the provided [value].
  const ReportStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PENDING = ReportStatusType._(r'PENDING');
  static const PROCESSING = ReportStatusType._(r'PROCESSING');
  static const FAILED = ReportStatusType._(r'FAILED');
  static const DONE = ReportStatusType._(r'DONE');

  /// List of all possible values in this [enum][ReportStatusType].
  static const values = <ReportStatusType>[
    PENDING,
    PROCESSING,
    FAILED,
    DONE,
  ];

  static ReportStatusType? fromJson(dynamic value) => ReportStatusTypeTypeTransformer().decode(value);

  static List<ReportStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReportStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReportStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReportStatusType] to String,
/// and [decode] dynamic data back to [ReportStatusType].
class ReportStatusTypeTypeTransformer {
  factory ReportStatusTypeTypeTransformer() => _instance ??= const ReportStatusTypeTypeTransformer._();

  const ReportStatusTypeTypeTransformer._();

  String encode(ReportStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a ReportStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReportStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PENDING': return ReportStatusType.PENDING;
        case r'PROCESSING': return ReportStatusType.PROCESSING;
        case r'FAILED': return ReportStatusType.FAILED;
        case r'DONE': return ReportStatusType.DONE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReportStatusTypeTypeTransformer] instance.
  static ReportStatusTypeTypeTransformer? _instance;
}

