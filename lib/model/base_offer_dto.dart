//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BaseOfferDTO {
  /// Returns a new [BaseOfferDTO] instance.
  BaseOfferDTO({
    required this.offerId,
    this.name,
    this.marketCategoryId,
    this.category,
    this.pictures = const [],
    this.videos = const [],
    this.manuals = const [],
    this.vendor,
    this.barcodes = const [],
    this.description,
    this.manufacturerCountries = const [],
    this.weightDimensions,
    this.vendorCode,
    this.tags = const [],
    this.shelfLife,
    this.lifeTime,
    this.guaranteePeriod,
    this.customsCommodityCode,
    this.certificates = const [],
    this.boxCount,
    this.condition,
    this.type,
    this.downloadable,
    this.adult,
    this.age,
    this.params = const [],
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  String offerId;

  /// Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? marketCategoryId;

  /// Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? category;

  /// Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
  List<String>? pictures;

  /// Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
  List<String>? videos;

  /// Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
  List<OfferManualDTO>? manuals;

  /// Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? vendor;

  /// Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  List<String>? barcodes;

  /// Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
  List<String>? manufacturerCountries;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferWeightDimensionsDTO? weightDimensions;

  /// Артикул товара от производителя.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? vendorCode;

  /// Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
  List<String>? tags;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TimePeriodDTO? shelfLife;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TimePeriodDTO? lifeTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TimePeriodDTO? guaranteePeriod;

  /// Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? customsCommodityCode;

  /// Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
  List<String>? certificates;

  /// Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? boxCount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferConditionDTO? condition;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferType? type;

  /// Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? downloadable;

  /// Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? adult;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AgeDTO? age;

  /// {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
  List<OfferParamDTO>? params;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BaseOfferDTO &&
    other.offerId == offerId &&
    other.name == name &&
    other.marketCategoryId == marketCategoryId &&
    other.category == category &&
    _deepEquality.equals(other.pictures, pictures) &&
    _deepEquality.equals(other.videos, videos) &&
    _deepEquality.equals(other.manuals, manuals) &&
    other.vendor == vendor &&
    _deepEquality.equals(other.barcodes, barcodes) &&
    other.description == description &&
    _deepEquality.equals(other.manufacturerCountries, manufacturerCountries) &&
    other.weightDimensions == weightDimensions &&
    other.vendorCode == vendorCode &&
    _deepEquality.equals(other.tags, tags) &&
    other.shelfLife == shelfLife &&
    other.lifeTime == lifeTime &&
    other.guaranteePeriod == guaranteePeriod &&
    other.customsCommodityCode == customsCommodityCode &&
    _deepEquality.equals(other.certificates, certificates) &&
    other.boxCount == boxCount &&
    other.condition == condition &&
    other.type == type &&
    other.downloadable == downloadable &&
    other.adult == adult &&
    other.age == age &&
    _deepEquality.equals(other.params, params);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerId.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (marketCategoryId == null ? 0 : marketCategoryId!.hashCode) +
    (category == null ? 0 : category!.hashCode) +
    (pictures == null ? 0 : pictures!.hashCode) +
    (videos == null ? 0 : videos!.hashCode) +
    (manuals == null ? 0 : manuals!.hashCode) +
    (vendor == null ? 0 : vendor!.hashCode) +
    (barcodes == null ? 0 : barcodes!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (manufacturerCountries == null ? 0 : manufacturerCountries!.hashCode) +
    (weightDimensions == null ? 0 : weightDimensions!.hashCode) +
    (vendorCode == null ? 0 : vendorCode!.hashCode) +
    (tags == null ? 0 : tags!.hashCode) +
    (shelfLife == null ? 0 : shelfLife!.hashCode) +
    (lifeTime == null ? 0 : lifeTime!.hashCode) +
    (guaranteePeriod == null ? 0 : guaranteePeriod!.hashCode) +
    (customsCommodityCode == null ? 0 : customsCommodityCode!.hashCode) +
    (certificates == null ? 0 : certificates!.hashCode) +
    (boxCount == null ? 0 : boxCount!.hashCode) +
    (condition == null ? 0 : condition!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (downloadable == null ? 0 : downloadable!.hashCode) +
    (adult == null ? 0 : adult!.hashCode) +
    (age == null ? 0 : age!.hashCode) +
    (params == null ? 0 : params!.hashCode);

  @override
  String toString() => 'BaseOfferDTO[offerId=$offerId, name=$name, marketCategoryId=$marketCategoryId, category=$category, pictures=$pictures, videos=$videos, manuals=$manuals, vendor=$vendor, barcodes=$barcodes, description=$description, manufacturerCountries=$manufacturerCountries, weightDimensions=$weightDimensions, vendorCode=$vendorCode, tags=$tags, shelfLife=$shelfLife, lifeTime=$lifeTime, guaranteePeriod=$guaranteePeriod, customsCommodityCode=$customsCommodityCode, certificates=$certificates, boxCount=$boxCount, condition=$condition, type=$type, downloadable=$downloadable, adult=$adult, age=$age, params=$params]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerId'] = this.offerId;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.marketCategoryId != null) {
      json[r'marketCategoryId'] = this.marketCategoryId;
    } else {
      json[r'marketCategoryId'] = null;
    }
    if (this.category != null) {
      json[r'category'] = this.category;
    } else {
      json[r'category'] = null;
    }
    if (this.pictures != null) {
      json[r'pictures'] = this.pictures;
    } else {
      json[r'pictures'] = null;
    }
    if (this.videos != null) {
      json[r'videos'] = this.videos;
    } else {
      json[r'videos'] = null;
    }
    if (this.manuals != null) {
      json[r'manuals'] = this.manuals;
    } else {
      json[r'manuals'] = null;
    }
    if (this.vendor != null) {
      json[r'vendor'] = this.vendor;
    } else {
      json[r'vendor'] = null;
    }
    if (this.barcodes != null) {
      json[r'barcodes'] = this.barcodes;
    } else {
      json[r'barcodes'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.manufacturerCountries != null) {
      json[r'manufacturerCountries'] = this.manufacturerCountries;
    } else {
      json[r'manufacturerCountries'] = null;
    }
    if (this.weightDimensions != null) {
      json[r'weightDimensions'] = this.weightDimensions;
    } else {
      json[r'weightDimensions'] = null;
    }
    if (this.vendorCode != null) {
      json[r'vendorCode'] = this.vendorCode;
    } else {
      json[r'vendorCode'] = null;
    }
    if (this.tags != null) {
      json[r'tags'] = this.tags;
    } else {
      json[r'tags'] = null;
    }
    if (this.shelfLife != null) {
      json[r'shelfLife'] = this.shelfLife;
    } else {
      json[r'shelfLife'] = null;
    }
    if (this.lifeTime != null) {
      json[r'lifeTime'] = this.lifeTime;
    } else {
      json[r'lifeTime'] = null;
    }
    if (this.guaranteePeriod != null) {
      json[r'guaranteePeriod'] = this.guaranteePeriod;
    } else {
      json[r'guaranteePeriod'] = null;
    }
    if (this.customsCommodityCode != null) {
      json[r'customsCommodityCode'] = this.customsCommodityCode;
    } else {
      json[r'customsCommodityCode'] = null;
    }
    if (this.certificates != null) {
      json[r'certificates'] = this.certificates;
    } else {
      json[r'certificates'] = null;
    }
    if (this.boxCount != null) {
      json[r'boxCount'] = this.boxCount;
    } else {
      json[r'boxCount'] = null;
    }
    if (this.condition != null) {
      json[r'condition'] = this.condition;
    } else {
      json[r'condition'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.downloadable != null) {
      json[r'downloadable'] = this.downloadable;
    } else {
      json[r'downloadable'] = null;
    }
    if (this.adult != null) {
      json[r'adult'] = this.adult;
    } else {
      json[r'adult'] = null;
    }
    if (this.age != null) {
      json[r'age'] = this.age;
    } else {
      json[r'age'] = null;
    }
    if (this.params != null) {
      json[r'params'] = this.params;
    } else {
      json[r'params'] = null;
    }
    return json;
  }

  /// Returns a new [BaseOfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BaseOfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BaseOfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BaseOfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BaseOfferDTO(
        offerId: mapValueOfType<String>(json, r'offerId')!,
        name: mapValueOfType<String>(json, r'name'),
        marketCategoryId: mapValueOfType<int>(json, r'marketCategoryId'),
        category: mapValueOfType<String>(json, r'category'),
        pictures: json[r'pictures'] is Iterable
            ? (json[r'pictures'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        videos: json[r'videos'] is Iterable
            ? (json[r'videos'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        manuals: OfferManualDTO.listFromJson(json[r'manuals']),
        vendor: mapValueOfType<String>(json, r'vendor'),
        barcodes: json[r'barcodes'] is Iterable
            ? (json[r'barcodes'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        description: mapValueOfType<String>(json, r'description'),
        manufacturerCountries: json[r'manufacturerCountries'] is Iterable
            ? (json[r'manufacturerCountries'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        weightDimensions: OfferWeightDimensionsDTO.fromJson(json[r'weightDimensions']),
        vendorCode: mapValueOfType<String>(json, r'vendorCode'),
        tags: json[r'tags'] is Iterable
            ? (json[r'tags'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        shelfLife: TimePeriodDTO.fromJson(json[r'shelfLife']),
        lifeTime: TimePeriodDTO.fromJson(json[r'lifeTime']),
        guaranteePeriod: TimePeriodDTO.fromJson(json[r'guaranteePeriod']),
        customsCommodityCode: mapValueOfType<String>(json, r'customsCommodityCode'),
        certificates: json[r'certificates'] is Iterable
            ? (json[r'certificates'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        boxCount: mapValueOfType<int>(json, r'boxCount'),
        condition: OfferConditionDTO.fromJson(json[r'condition']),
        type: OfferType.fromJson(json[r'type']),
        downloadable: mapValueOfType<bool>(json, r'downloadable'),
        adult: mapValueOfType<bool>(json, r'adult'),
        age: AgeDTO.fromJson(json[r'age']),
        params: OfferParamDTO.listFromJson(json[r'params']),
      );
    }
    return null;
  }

  static List<BaseOfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BaseOfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BaseOfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BaseOfferDTO> mapFromJson(dynamic json) {
    final map = <String, BaseOfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BaseOfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BaseOfferDTO-objects as value to a dart map
  static Map<String, List<BaseOfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BaseOfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BaseOfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerId',
  };
}

