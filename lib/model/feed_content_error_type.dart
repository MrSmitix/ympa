//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип ошибки в содержимом прайс-листа.  Возможные значения:  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
class FeedContentErrorType {
  /// Instantiate a new enum with the provided [value].
  const FeedContentErrorType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PARSE_ERROR = FeedContentErrorType._(r'PARSE_ERROR');
  static const PARSE_XML_ERROR = FeedContentErrorType._(r'PARSE_XML_ERROR');
  static const TOO_MANY_REJECTED_OFFERS = FeedContentErrorType._(r'TOO_MANY_REJECTED_OFFERS');

  /// List of all possible values in this [enum][FeedContentErrorType].
  static const values = <FeedContentErrorType>[
    PARSE_ERROR,
    PARSE_XML_ERROR,
    TOO_MANY_REJECTED_OFFERS,
  ];

  static FeedContentErrorType? fromJson(dynamic value) => FeedContentErrorTypeTypeTransformer().decode(value);

  static List<FeedContentErrorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeedContentErrorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeedContentErrorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FeedContentErrorType] to String,
/// and [decode] dynamic data back to [FeedContentErrorType].
class FeedContentErrorTypeTypeTransformer {
  factory FeedContentErrorTypeTypeTransformer() => _instance ??= const FeedContentErrorTypeTypeTransformer._();

  const FeedContentErrorTypeTypeTransformer._();

  String encode(FeedContentErrorType data) => data.value;

  /// Decodes a [dynamic value][data] to a FeedContentErrorType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FeedContentErrorType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PARSE_ERROR': return FeedContentErrorType.PARSE_ERROR;
        case r'PARSE_XML_ERROR': return FeedContentErrorType.PARSE_XML_ERROR;
        case r'TOO_MANY_REJECTED_OFFERS': return FeedContentErrorType.TOO_MANY_REJECTED_OFFERS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FeedContentErrorTypeTypeTransformer] instance.
  static FeedContentErrorTypeTypeTransformer? _instance;
}

