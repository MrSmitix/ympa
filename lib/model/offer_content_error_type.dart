//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Типы ошибок:  * `OFFER_NOT_FOUND` — такого товара нет в каталоге. * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). 
class OfferContentErrorType {
  /// Instantiate a new enum with the provided [value].
  const OfferContentErrorType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OFFER_NOT_FOUND = OfferContentErrorType._(r'OFFER_NOT_FOUND');
  static const UNKNOWN_CATEGORY = OfferContentErrorType._(r'UNKNOWN_CATEGORY');
  static const CATEGORY_MISMATCH = OfferContentErrorType._(r'CATEGORY_MISMATCH');
  static const UNKNOWN_PARAMETER = OfferContentErrorType._(r'UNKNOWN_PARAMETER');
  static const UNEXPECTED_BOOLEAN_VALUE = OfferContentErrorType._(r'UNEXPECTED_BOOLEAN_VALUE');
  static const NUMBER_FORMAT = OfferContentErrorType._(r'NUMBER_FORMAT');
  static const VALUE_BLANK = OfferContentErrorType._(r'VALUE_BLANK');
  static const INVALID_UNIT_ID = OfferContentErrorType._(r'INVALID_UNIT_ID');
  static const INVALID_GROUP_ID_LENGTH = OfferContentErrorType._(r'INVALID_GROUP_ID_LENGTH');
  static const INVALID_GROUP_ID_CHARACTERS = OfferContentErrorType._(r'INVALID_GROUP_ID_CHARACTERS');

  /// List of all possible values in this [enum][OfferContentErrorType].
  static const values = <OfferContentErrorType>[
    OFFER_NOT_FOUND,
    UNKNOWN_CATEGORY,
    CATEGORY_MISMATCH,
    UNKNOWN_PARAMETER,
    UNEXPECTED_BOOLEAN_VALUE,
    NUMBER_FORMAT,
    VALUE_BLANK,
    INVALID_UNIT_ID,
    INVALID_GROUP_ID_LENGTH,
    INVALID_GROUP_ID_CHARACTERS,
  ];

  static OfferContentErrorType? fromJson(dynamic value) => OfferContentErrorTypeTypeTransformer().decode(value);

  static List<OfferContentErrorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferContentErrorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferContentErrorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferContentErrorType] to String,
/// and [decode] dynamic data back to [OfferContentErrorType].
class OfferContentErrorTypeTypeTransformer {
  factory OfferContentErrorTypeTypeTransformer() => _instance ??= const OfferContentErrorTypeTypeTransformer._();

  const OfferContentErrorTypeTypeTransformer._();

  String encode(OfferContentErrorType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferContentErrorType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferContentErrorType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OFFER_NOT_FOUND': return OfferContentErrorType.OFFER_NOT_FOUND;
        case r'UNKNOWN_CATEGORY': return OfferContentErrorType.UNKNOWN_CATEGORY;
        case r'CATEGORY_MISMATCH': return OfferContentErrorType.CATEGORY_MISMATCH;
        case r'UNKNOWN_PARAMETER': return OfferContentErrorType.UNKNOWN_PARAMETER;
        case r'UNEXPECTED_BOOLEAN_VALUE': return OfferContentErrorType.UNEXPECTED_BOOLEAN_VALUE;
        case r'NUMBER_FORMAT': return OfferContentErrorType.NUMBER_FORMAT;
        case r'VALUE_BLANK': return OfferContentErrorType.VALUE_BLANK;
        case r'INVALID_UNIT_ID': return OfferContentErrorType.INVALID_UNIT_ID;
        case r'INVALID_GROUP_ID_LENGTH': return OfferContentErrorType.INVALID_GROUP_ID_LENGTH;
        case r'INVALID_GROUP_ID_CHARACTERS': return OfferContentErrorType.INVALID_GROUP_ID_CHARACTERS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferContentErrorTypeTypeTransformer] instance.
  static OfferContentErrorTypeTypeTransformer? _instance;
}

