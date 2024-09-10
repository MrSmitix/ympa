//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип ошибки индексации прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре `httpStatusCode`.  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
class FeedIndexLogsErrorType {
  /// Instantiate a new enum with the provided [value].
  const FeedIndexLogsErrorType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DOWNLOAD_ERROR = FeedIndexLogsErrorType._(r'DOWNLOAD_ERROR');
  static const DOWNLOAD_HTTP_ERROR = FeedIndexLogsErrorType._(r'DOWNLOAD_HTTP_ERROR');
  static const PARSE_ERROR = FeedIndexLogsErrorType._(r'PARSE_ERROR');
  static const PARSE_XML_ERROR = FeedIndexLogsErrorType._(r'PARSE_XML_ERROR');
  static const TOO_MANY_REJECTED_OFFERS = FeedIndexLogsErrorType._(r'TOO_MANY_REJECTED_OFFERS');
  static const NOT_INDEXED = FeedIndexLogsErrorType._(r'NOT_INDEXED');

  /// List of all possible values in this [enum][FeedIndexLogsErrorType].
  static const values = <FeedIndexLogsErrorType>[
    DOWNLOAD_ERROR,
    DOWNLOAD_HTTP_ERROR,
    PARSE_ERROR,
    PARSE_XML_ERROR,
    TOO_MANY_REJECTED_OFFERS,
    NOT_INDEXED,
  ];

  static FeedIndexLogsErrorType? fromJson(dynamic value) => FeedIndexLogsErrorTypeTypeTransformer().decode(value);

  static List<FeedIndexLogsErrorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedIndexLogsErrorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedIndexLogsErrorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FeedIndexLogsErrorType] to String,
/// and [decode] dynamic data back to [FeedIndexLogsErrorType].
class FeedIndexLogsErrorTypeTypeTransformer {
  factory FeedIndexLogsErrorTypeTypeTransformer() => _instance ??= const FeedIndexLogsErrorTypeTypeTransformer._();

  const FeedIndexLogsErrorTypeTypeTransformer._();

  String encode(FeedIndexLogsErrorType data) => data.value;

  /// Decodes a [dynamic value][data] to a FeedIndexLogsErrorType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FeedIndexLogsErrorType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DOWNLOAD_ERROR': return FeedIndexLogsErrorType.DOWNLOAD_ERROR;
        case r'DOWNLOAD_HTTP_ERROR': return FeedIndexLogsErrorType.DOWNLOAD_HTTP_ERROR;
        case r'PARSE_ERROR': return FeedIndexLogsErrorType.PARSE_ERROR;
        case r'PARSE_XML_ERROR': return FeedIndexLogsErrorType.PARSE_XML_ERROR;
        case r'TOO_MANY_REJECTED_OFFERS': return FeedIndexLogsErrorType.TOO_MANY_REJECTED_OFFERS;
        case r'NOT_INDEXED': return FeedIndexLogsErrorType.NOT_INDEXED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FeedIndexLogsErrorTypeTypeTransformer] instance.
  static FeedIndexLogsErrorTypeTypeTransformer? _instance;
}

