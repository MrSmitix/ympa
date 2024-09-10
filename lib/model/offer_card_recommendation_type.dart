//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Рекомендация по дополнению или замене контента. Не возвращается для карточек, которые заполнены Маркетом или содержат бывшие в употреблении товары.  Часть рекомендаций относятся к **основным параметрам**, которые есть у товаров любых категорий. Другие — к тем **характеристикам**, которые есть у товара потому, что он относится к определенной категории.  **1. Рекомендации, относящиеся к основным параметрам**  Каждая такая рекомендация относится к **единственному параметру**. Чтобы заполнить этот параметр, пользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  Рекомендации по заполнению параметров в `updateOfferMappings`:  * `RECOGNIZED_VENDOR` — напишите название производителя так, как его пишет сам производитель (параметр `vendor`). * `PICTURE_COUNT` — добавьте изображения (параметр `pictures`). * `FIRST_PICTURE_SIZE` — замените первое изображение более крупным (параметр `pictures`). * `TITLE_LENGTH` — измените название (параметр `name`). Составьте название по схеме: тип + бренд или производитель + модель + особенности, если есть (размер, вес, цвет). * `DESCRIPTION_LENGTH` — добавьте описание рекомендуемого размера (параметр `description`). * `AVERAGE_PICTURE_SIZE` — замените все изображения на изображения высокого качества (параметр `pictures`). * `FIRST_VIDEO_LENGTH` — добавьте первое видео рекомендуемой длины (параметр `videos`). * `AVERAGE_VIDEO_SIZE` — замените все видео на видео высокого качества (параметр `videos`). * `VIDEO_COUNT` — добавьте больше видео (параметр `videos`).  Рекомендуемые значения параметров описаны в [Справке Яндекс Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/add/).  **2. Рекомендации, относящиеся к характеристикам по категориям**  Каждая такая рекомендация предполагает заполнение **одной или нескольких характеристик**. Чтобы узнать, какие именно характеристики нужно заполнить, воспользуйтесь запросом [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). Например, если вы получили рекомендацию `MAIN`, нужно заполнить характеристики, имеющие `MAIN` в массиве `recommendationTypes`.  Рекомендации:  * `MAIN` — заполните ключевые характеристики товара, которые используются в поиске и фильтрах. * `ADDITIONAL` — заполните дополнительные характеристики товара. * `DISTINCTIVE` — заполните характеристики, которыми отличаются друг от друга варианты товара.  **3. Устаревшие рекомендации**  * `HAS_VIDEO`. * `FILTERABLE`. * `HAS_DESCRIPTION`. * `HAS_BARCODE`. 
class OfferCardRecommendationType {
  /// Instantiate a new enum with the provided [value].
  const OfferCardRecommendationType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HAS_VIDEO = OfferCardRecommendationType._(r'HAS_VIDEO');
  static const RECOGNIZED_VENDOR = OfferCardRecommendationType._(r'RECOGNIZED_VENDOR');
  static const MAIN = OfferCardRecommendationType._(r'MAIN');
  static const ADDITIONAL = OfferCardRecommendationType._(r'ADDITIONAL');
  static const DISTINCTIVE = OfferCardRecommendationType._(r'DISTINCTIVE');
  static const FILTERABLE = OfferCardRecommendationType._(r'FILTERABLE');
  static const PICTURE_COUNT = OfferCardRecommendationType._(r'PICTURE_COUNT');
  static const HAS_DESCRIPTION = OfferCardRecommendationType._(r'HAS_DESCRIPTION');
  static const HAS_BARCODE = OfferCardRecommendationType._(r'HAS_BARCODE');
  static const FIRST_PICTURE_SIZE = OfferCardRecommendationType._(r'FIRST_PICTURE_SIZE');
  static const TITLE_LENGTH = OfferCardRecommendationType._(r'TITLE_LENGTH');
  static const DESCRIPTION_LENGTH = OfferCardRecommendationType._(r'DESCRIPTION_LENGTH');
  static const AVERAGE_PICTURE_SIZE = OfferCardRecommendationType._(r'AVERAGE_PICTURE_SIZE');
  static const FIRST_VIDEO_SIZE = OfferCardRecommendationType._(r'FIRST_VIDEO_SIZE');
  static const FIRST_VIDEO_LENGTH = OfferCardRecommendationType._(r'FIRST_VIDEO_LENGTH');
  static const AVERAGE_VIDEO_SIZE = OfferCardRecommendationType._(r'AVERAGE_VIDEO_SIZE');
  static const VIDEO_COUNT = OfferCardRecommendationType._(r'VIDEO_COUNT');

  /// List of all possible values in this [enum][OfferCardRecommendationType].
  static const values = <OfferCardRecommendationType>[
    HAS_VIDEO,
    RECOGNIZED_VENDOR,
    MAIN,
    ADDITIONAL,
    DISTINCTIVE,
    FILTERABLE,
    PICTURE_COUNT,
    HAS_DESCRIPTION,
    HAS_BARCODE,
    FIRST_PICTURE_SIZE,
    TITLE_LENGTH,
    DESCRIPTION_LENGTH,
    AVERAGE_PICTURE_SIZE,
    FIRST_VIDEO_SIZE,
    FIRST_VIDEO_LENGTH,
    AVERAGE_VIDEO_SIZE,
    VIDEO_COUNT,
  ];

  static OfferCardRecommendationType? fromJson(dynamic value) => OfferCardRecommendationTypeTypeTransformer().decode(value);

  static List<OfferCardRecommendationType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferCardRecommendationType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferCardRecommendationType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferCardRecommendationType] to String,
/// and [decode] dynamic data back to [OfferCardRecommendationType].
class OfferCardRecommendationTypeTypeTransformer {
  factory OfferCardRecommendationTypeTypeTransformer() => _instance ??= const OfferCardRecommendationTypeTypeTransformer._();

  const OfferCardRecommendationTypeTypeTransformer._();

  String encode(OfferCardRecommendationType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferCardRecommendationType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferCardRecommendationType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HAS_VIDEO': return OfferCardRecommendationType.HAS_VIDEO;
        case r'RECOGNIZED_VENDOR': return OfferCardRecommendationType.RECOGNIZED_VENDOR;
        case r'MAIN': return OfferCardRecommendationType.MAIN;
        case r'ADDITIONAL': return OfferCardRecommendationType.ADDITIONAL;
        case r'DISTINCTIVE': return OfferCardRecommendationType.DISTINCTIVE;
        case r'FILTERABLE': return OfferCardRecommendationType.FILTERABLE;
        case r'PICTURE_COUNT': return OfferCardRecommendationType.PICTURE_COUNT;
        case r'HAS_DESCRIPTION': return OfferCardRecommendationType.HAS_DESCRIPTION;
        case r'HAS_BARCODE': return OfferCardRecommendationType.HAS_BARCODE;
        case r'FIRST_PICTURE_SIZE': return OfferCardRecommendationType.FIRST_PICTURE_SIZE;
        case r'TITLE_LENGTH': return OfferCardRecommendationType.TITLE_LENGTH;
        case r'DESCRIPTION_LENGTH': return OfferCardRecommendationType.DESCRIPTION_LENGTH;
        case r'AVERAGE_PICTURE_SIZE': return OfferCardRecommendationType.AVERAGE_PICTURE_SIZE;
        case r'FIRST_VIDEO_SIZE': return OfferCardRecommendationType.FIRST_VIDEO_SIZE;
        case r'FIRST_VIDEO_LENGTH': return OfferCardRecommendationType.FIRST_VIDEO_LENGTH;
        case r'AVERAGE_VIDEO_SIZE': return OfferCardRecommendationType.AVERAGE_VIDEO_SIZE;
        case r'VIDEO_COUNT': return OfferCardRecommendationType.VIDEO_COUNT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferCardRecommendationTypeTypeTransformer] instance.
  static OfferCardRecommendationTypeTypeTransformer? _instance;
}

