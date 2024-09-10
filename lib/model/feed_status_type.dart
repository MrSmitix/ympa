//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Статус прайс-листа.  Возможные значения:    * `ERROR` — найдены ошибки.   * `NA` — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * `OK` — ошибок не найдено. 
class FeedStatusType {
  /// Instantiate a new enum with the provided [value].
  const FeedStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ERROR = FeedStatusType._(r'ERROR');
  static const NA = FeedStatusType._(r'NA');
  static const OK = FeedStatusType._(r'OK');

  /// List of all possible values in this [enum][FeedStatusType].
  static const values = <FeedStatusType>[
    ERROR,
    NA,
    OK,
  ];

  static FeedStatusType? fromJson(dynamic value) => FeedStatusTypeTypeTransformer().decode(value);

  static List<FeedStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FeedStatusType] to String,
/// and [decode] dynamic data back to [FeedStatusType].
class FeedStatusTypeTypeTransformer {
  factory FeedStatusTypeTypeTransformer() => _instance ??= const FeedStatusTypeTypeTransformer._();

  const FeedStatusTypeTypeTransformer._();

  String encode(FeedStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a FeedStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FeedStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ERROR': return FeedStatusType.ERROR;
        case r'NA': return FeedStatusType.NA;
        case r'OK': return FeedStatusType.OK;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FeedStatusTypeTypeTransformer] instance.
  static FeedStatusTypeTypeTransformer? _instance;
}

