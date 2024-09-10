//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `EMPTY_MARKET_CATEGORY` — не указана категория Маркета при передаче характеристик категории. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). * `INVALID_PICKER_URL` — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. 
class OfferMappingErrorType {
  /// Instantiate a new enum with the provided [value].
  const OfferMappingErrorType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNKNOWN_CATEGORY = OfferMappingErrorType._(r'UNKNOWN_CATEGORY');
  static const CATEGORY_MISMATCH = OfferMappingErrorType._(r'CATEGORY_MISMATCH');
  static const EMPTY_MARKET_CATEGORY = OfferMappingErrorType._(r'EMPTY_MARKET_CATEGORY');
  static const UNKNOWN_PARAMETER = OfferMappingErrorType._(r'UNKNOWN_PARAMETER');
  static const UNEXPECTED_BOOLEAN_VALUE = OfferMappingErrorType._(r'UNEXPECTED_BOOLEAN_VALUE');
  static const NUMBER_FORMAT = OfferMappingErrorType._(r'NUMBER_FORMAT');
  static const VALUE_BLANK = OfferMappingErrorType._(r'VALUE_BLANK');
  static const INVALID_UNIT_ID = OfferMappingErrorType._(r'INVALID_UNIT_ID');
  static const INVALID_GROUP_ID_LENGTH = OfferMappingErrorType._(r'INVALID_GROUP_ID_LENGTH');
  static const INVALID_GROUP_ID_CHARACTERS = OfferMappingErrorType._(r'INVALID_GROUP_ID_CHARACTERS');
  static const INVALID_PICKER_URL = OfferMappingErrorType._(r'INVALID_PICKER_URL');

  /// List of all possible values in this [enum][OfferMappingErrorType].
  static const values = <OfferMappingErrorType>[
    UNKNOWN_CATEGORY,
    CATEGORY_MISMATCH,
    EMPTY_MARKET_CATEGORY,
    UNKNOWN_PARAMETER,
    UNEXPECTED_BOOLEAN_VALUE,
    NUMBER_FORMAT,
    VALUE_BLANK,
    INVALID_UNIT_ID,
    INVALID_GROUP_ID_LENGTH,
    INVALID_GROUP_ID_CHARACTERS,
    INVALID_PICKER_URL,
  ];

  static OfferMappingErrorType? fromJson(dynamic value) => OfferMappingErrorTypeTypeTransformer().decode(value);

  static List<OfferMappingErrorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferMappingErrorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferMappingErrorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferMappingErrorType] to String,
/// and [decode] dynamic data back to [OfferMappingErrorType].
class OfferMappingErrorTypeTypeTransformer {
  factory OfferMappingErrorTypeTypeTransformer() => _instance ??= const OfferMappingErrorTypeTypeTransformer._();

  const OfferMappingErrorTypeTypeTransformer._();

  String encode(OfferMappingErrorType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferMappingErrorType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferMappingErrorType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNKNOWN_CATEGORY': return OfferMappingErrorType.UNKNOWN_CATEGORY;
        case r'CATEGORY_MISMATCH': return OfferMappingErrorType.CATEGORY_MISMATCH;
        case r'EMPTY_MARKET_CATEGORY': return OfferMappingErrorType.EMPTY_MARKET_CATEGORY;
        case r'UNKNOWN_PARAMETER': return OfferMappingErrorType.UNKNOWN_PARAMETER;
        case r'UNEXPECTED_BOOLEAN_VALUE': return OfferMappingErrorType.UNEXPECTED_BOOLEAN_VALUE;
        case r'NUMBER_FORMAT': return OfferMappingErrorType.NUMBER_FORMAT;
        case r'VALUE_BLANK': return OfferMappingErrorType.VALUE_BLANK;
        case r'INVALID_UNIT_ID': return OfferMappingErrorType.INVALID_UNIT_ID;
        case r'INVALID_GROUP_ID_LENGTH': return OfferMappingErrorType.INVALID_GROUP_ID_LENGTH;
        case r'INVALID_GROUP_ID_CHARACTERS': return OfferMappingErrorType.INVALID_GROUP_ID_CHARACTERS;
        case r'INVALID_PICKER_URL': return OfferMappingErrorType.INVALID_PICKER_URL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferMappingErrorTypeTypeTransformer] instance.
  static OfferMappingErrorTypeTypeTransformer? _instance;
}

