//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. 
class FeedIndexLogsStatusType {
  /// Instantiate a new enum with the provided [value].
  const FeedIndexLogsStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ERROR = FeedIndexLogsStatusType._(r'ERROR');
  static const OK = FeedIndexLogsStatusType._(r'OK');
  static const WARNING = FeedIndexLogsStatusType._(r'WARNING');

  /// List of all possible values in this [enum][FeedIndexLogsStatusType].
  static const values = <FeedIndexLogsStatusType>[
    ERROR,
    OK,
    WARNING,
  ];

  static FeedIndexLogsStatusType? fromJson(dynamic value) => FeedIndexLogsStatusTypeTypeTransformer().decode(value);

  static List<FeedIndexLogsStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedIndexLogsStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedIndexLogsStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FeedIndexLogsStatusType] to String,
/// and [decode] dynamic data back to [FeedIndexLogsStatusType].
class FeedIndexLogsStatusTypeTypeTransformer {
  factory FeedIndexLogsStatusTypeTypeTransformer() => _instance ??= const FeedIndexLogsStatusTypeTypeTransformer._();

  const FeedIndexLogsStatusTypeTypeTransformer._();

  String encode(FeedIndexLogsStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a FeedIndexLogsStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FeedIndexLogsStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ERROR': return FeedIndexLogsStatusType.ERROR;
        case r'OK': return FeedIndexLogsStatusType.OK;
        case r'WARNING': return FeedIndexLogsStatusType.WARNING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FeedIndexLogsStatusTypeTypeTransformer] instance.
  static FeedIndexLogsStatusTypeTypeTransformer? _instance;
}

