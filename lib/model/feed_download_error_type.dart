//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип ошибки загрузки прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре `httpStatusCode`. 
class FeedDownloadErrorType {
  /// Instantiate a new enum with the provided [value].
  const FeedDownloadErrorType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ERROR = FeedDownloadErrorType._(r'DOWNLOAD_ERROR');
  static const HTTP_ERROR = FeedDownloadErrorType._(r'DOWNLOAD_HTTP_ERROR');

  /// List of all possible values in this [enum][FeedDownloadErrorType].
  static const values = <FeedDownloadErrorType>[
    ERROR,
    HTTP_ERROR,
  ];

  static FeedDownloadErrorType? fromJson(dynamic value) => FeedDownloadErrorTypeTypeTransformer().decode(value);

  static List<FeedDownloadErrorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedDownloadErrorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedDownloadErrorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FeedDownloadErrorType] to String,
/// and [decode] dynamic data back to [FeedDownloadErrorType].
class FeedDownloadErrorTypeTypeTransformer {
  factory FeedDownloadErrorTypeTypeTransformer() => _instance ??= const FeedDownloadErrorTypeTypeTransformer._();

  const FeedDownloadErrorTypeTypeTransformer._();

  String encode(FeedDownloadErrorType data) => data.value;

  /// Decodes a [dynamic value][data] to a FeedDownloadErrorType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FeedDownloadErrorType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DOWNLOAD_ERROR': return FeedDownloadErrorType.ERROR;
        case r'DOWNLOAD_HTTP_ERROR': return FeedDownloadErrorType.HTTP_ERROR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FeedDownloadErrorTypeTypeTransformer] instance.
  static FeedDownloadErrorTypeTypeTransformer? _instance;
}

