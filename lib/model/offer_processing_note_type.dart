//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Тип причины, по которой товар не прошел модерацию:  * `ASSORTMENT` — товар производится в разных вариантах. Каждый из них нужно описать как отдельный товар (входной параметр `offer-mapping-entry` запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или строка в каталоге, если вы загружаете товары через кабинет продавца на Маркете). * `CANCELLED` — товар отозван с модерации по вашей инициативе. * `CONFLICTING_INFORMATION` _(ранее ошибочно `CONFLICTING`)_ — вы предоставили противоречивую информацию о товаре. Параметры, которые нужно исправить, указаны в параметре `payload`. * `DEPARTMENT_FROZEN` — правила размещения товаров в данной категории перерабатываются, поэтому товар пока не может пройти модерацию. * `INCORRECT_INFORMATION` — информация о товаре, которую вы предоставили, противоречит описанию от производителя. Параметры, которые нужно исправить, указаны в параметре `payload`. * `LEGAL_CONFLICT` — товар не прошел модерацию по юридическим причинам. Например, он официально не продается в России или у вас нет разрешения на его продажу. * `NEED_CLASSIFICATION_INFORMATION` — информации о товаре, которую вы предоставили, не хватает, чтобы отнести его к категории. Проверьте, что правильно указали название, категорию, производителя и страны производства товара, а также URL изображений или страниц с описанием, по которым можно идентифицировать товар. * `NEED_INFORMATION` — товар раньше не продавался в России и пока не размещается на Маркете. Для него можно создать карточку. Подробнее см. в разделе [Работа с карточкой товара](https://yandex.ru/support/marketplace/assortment/content/index.html) Справки Маркета для продавцов. * `NEED_PICTURES` — для идентификации товара нужны его изображения. Отправьте URL изображений товара в запросе [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или загрузите обновленный каталог через кабинет продавца на Маркете. * `NEED_VENDOR` — неверно указан производитель товара. * `NO_CATEGORY`, `NO_KNOWLEDGE` — товары из указанной категории пока не размещаются на Маркете. Если категория появится, товар будет снова отправлен на модерацию. * `NO_PARAMETERS_IN_SHOP_TITLE` — товар производится в разных вариантах, и из указанного названия непонятно, о каком идет речь. Параметры, которые нужно добавить в название товара, указаны в параметре `payload`. * `NO_SIZE_MEASURE` — для этого товара нужна размерная сетка. Отправьте ее в службу поддержки или вашему менеджеру. Требования к размерной сетке указаны в параметре `payload`. * `UNKNOWN` — товар не прошел модерацию по другой причине. Обратитесь в службу поддержки или к вашему менеджеру. 
class OfferProcessingNoteType {
  /// Instantiate a new enum with the provided [value].
  const OfferProcessingNoteType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ASSORTMENT = OfferProcessingNoteType._(r'ASSORTMENT');
  static const CANCELLED = OfferProcessingNoteType._(r'CANCELLED');
  static const CONFLICTING_INFORMATION = OfferProcessingNoteType._(r'CONFLICTING_INFORMATION');
  static const OTHER = OfferProcessingNoteType._(r'OTHER');
  static const DEPARTMENT_FROZEN = OfferProcessingNoteType._(r'DEPARTMENT_FROZEN');
  static const INCORRECT_INFORMATION = OfferProcessingNoteType._(r'INCORRECT_INFORMATION');
  static const LEGAL_CONFLICT = OfferProcessingNoteType._(r'LEGAL_CONFLICT');
  static const NEED_CLASSIFICATION_INFORMATION = OfferProcessingNoteType._(r'NEED_CLASSIFICATION_INFORMATION');
  static const NEED_INFORMATION = OfferProcessingNoteType._(r'NEED_INFORMATION');
  static const NEED_PICTURES = OfferProcessingNoteType._(r'NEED_PICTURES');
  static const NEED_VENDOR = OfferProcessingNoteType._(r'NEED_VENDOR');
  static const NO_CATEGORY = OfferProcessingNoteType._(r'NO_CATEGORY');
  static const NO_KNOWLEDGE = OfferProcessingNoteType._(r'NO_KNOWLEDGE');
  static const NO_PARAMETERS_IN_SHOP_TITLE = OfferProcessingNoteType._(r'NO_PARAMETERS_IN_SHOP_TITLE');
  static const NO_SIZE_MEASURE = OfferProcessingNoteType._(r'NO_SIZE_MEASURE');
  static const SAMPLE_LINE = OfferProcessingNoteType._(r'SAMPLE_LINE');

  /// List of all possible values in this [enum][OfferProcessingNoteType].
  static const values = <OfferProcessingNoteType>[
    ASSORTMENT,
    CANCELLED,
    CONFLICTING_INFORMATION,
    OTHER,
    DEPARTMENT_FROZEN,
    INCORRECT_INFORMATION,
    LEGAL_CONFLICT,
    NEED_CLASSIFICATION_INFORMATION,
    NEED_INFORMATION,
    NEED_PICTURES,
    NEED_VENDOR,
    NO_CATEGORY,
    NO_KNOWLEDGE,
    NO_PARAMETERS_IN_SHOP_TITLE,
    NO_SIZE_MEASURE,
    SAMPLE_LINE,
  ];

  static OfferProcessingNoteType? fromJson(dynamic value) => OfferProcessingNoteTypeTypeTransformer().decode(value);

  static List<OfferProcessingNoteType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferProcessingNoteType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferProcessingNoteType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OfferProcessingNoteType] to String,
/// and [decode] dynamic data back to [OfferProcessingNoteType].
class OfferProcessingNoteTypeTypeTransformer {
  factory OfferProcessingNoteTypeTypeTransformer() => _instance ??= const OfferProcessingNoteTypeTypeTransformer._();

  const OfferProcessingNoteTypeTypeTransformer._();

  String encode(OfferProcessingNoteType data) => data.value;

  /// Decodes a [dynamic value][data] to a OfferProcessingNoteType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OfferProcessingNoteType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ASSORTMENT': return OfferProcessingNoteType.ASSORTMENT;
        case r'CANCELLED': return OfferProcessingNoteType.CANCELLED;
        case r'CONFLICTING_INFORMATION': return OfferProcessingNoteType.CONFLICTING_INFORMATION;
        case r'OTHER': return OfferProcessingNoteType.OTHER;
        case r'DEPARTMENT_FROZEN': return OfferProcessingNoteType.DEPARTMENT_FROZEN;
        case r'INCORRECT_INFORMATION': return OfferProcessingNoteType.INCORRECT_INFORMATION;
        case r'LEGAL_CONFLICT': return OfferProcessingNoteType.LEGAL_CONFLICT;
        case r'NEED_CLASSIFICATION_INFORMATION': return OfferProcessingNoteType.NEED_CLASSIFICATION_INFORMATION;
        case r'NEED_INFORMATION': return OfferProcessingNoteType.NEED_INFORMATION;
        case r'NEED_PICTURES': return OfferProcessingNoteType.NEED_PICTURES;
        case r'NEED_VENDOR': return OfferProcessingNoteType.NEED_VENDOR;
        case r'NO_CATEGORY': return OfferProcessingNoteType.NO_CATEGORY;
        case r'NO_KNOWLEDGE': return OfferProcessingNoteType.NO_KNOWLEDGE;
        case r'NO_PARAMETERS_IN_SHOP_TITLE': return OfferProcessingNoteType.NO_PARAMETERS_IN_SHOP_TITLE;
        case r'NO_SIZE_MEASURE': return OfferProcessingNoteType.NO_SIZE_MEASURE;
        case r'SAMPLE_LINE': return OfferProcessingNoteType.SAMPLE_LINE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OfferProcessingNoteTypeTypeTransformer] instance.
  static OfferProcessingNoteTypeTypeTransformer? _instance;
}

