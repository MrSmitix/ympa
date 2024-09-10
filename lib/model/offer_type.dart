//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Особый тип товара:  * `MEDICINE` — лекарства. * `BOOK` — бумажные и электронные книги. * `AUDIOBOOK` — аудиокниги. * `ARTIST_TITLE` — музыкальная и видеопродукция. * `ON_DEMAND` — товары на заказ.  {% note info \"Если ваш товар — книга\" %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
class OfferType {
  /// Instantiate a new enum with the provided [value].
  const OfferType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DEFAULT = OfferType._(r'DEFAULT');
  static const MEDICINE = OfferType._(r'MEDICINE');
  static const BOOK = OfferType._(r'BOOK');
  static const AUDIOBOOK = OfferType._(r'AUDIOBOOK');
  static const ARTIST_TITLE = OfferType._(r'ARTIST_TITLE');
  static const ON_DEMAND = OfferType._(r'ON_DEMAND');

  /// List of all possible values in this [enum][OfferType].
  static const values = <OfferType>[
    DEFAULT,
    MEDICINE,
    BOOK,
    AUDIOBOOK,
    ARTIST_TITLE,
    ON_DEMAND,
  ];

  static OfferType? fromJson(dynamic value) => OfferTypeTypeTransformer().decode(value);

  static List<OfferType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferType] to String,
/// and [decode] dynamic data back to [OfferType].
class OfferTypeTypeTransformer {
  factory OfferTypeTypeTransformer() => _instance ??= const OfferTypeTypeTransformer._();

  const OfferTypeTypeTransformer._();

  String encode(OfferType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DEFAULT': return OfferType.DEFAULT;
        case r'MEDICINE': return OfferType.MEDICINE;
        case r'BOOK': return OfferType.BOOK;
        case r'AUDIOBOOK': return OfferType.AUDIOBOOK;
        case r'ARTIST_TITLE': return OfferType.ARTIST_TITLE;
        case r'ON_DEMAND': return OfferType.ON_DEMAND;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferTypeTypeTransformer] instance.
  static OfferTypeTypeTransformer? _instance;
}

