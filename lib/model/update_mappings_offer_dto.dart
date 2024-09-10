//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateMappingsOfferDTO {
  /// Returns a new [UpdateMappingsOfferDTO] instance.
  UpdateMappingsOfferDTO({
    this.name,
    this.shopSku,
    this.category,
    this.vendor,
    this.vendorCode,
    this.description,
    this.id,
    this.feedId,
    this.barcodes = const [],
    this.urls = const [],
    this.pictures = const [],
    this.manufacturer,
    this.manufacturerCountries = const [],
    this.minShipment,
    this.transportUnitSize,
    this.quantumOfSupply,
    this.deliveryDurationDays,
    this.boxCount,
    this.customsCommodityCodes = const [],
    this.weightDimensions,
    this.supplyScheduleDays = const [],
    this.shelfLifeDays,
    this.lifeTimeDays,
    this.guaranteePeriodDays,
    this.processingState,
    this.availability,
    this.shelfLife,
    this.lifeTime,
    this.guaranteePeriod,
    this.certificate,
  });

  /// Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopSku;

  /// Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? category;

  /// Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? vendor;

  /// Артикул товара от производителя.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? vendorCode;

  /// Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Идентификатор фида.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? feedId;

  /// Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  List<String>? barcodes;

  /// URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
  List<String>? urls;

  /// Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
  List<String>? pictures;

  /// Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? manufacturer;

  /// Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
  List<String>? manufacturerCountries;

  /// Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? minShipment;

  /// Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? transportUnitSize;

  /// Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? quantumOfSupply;

  /// Срок, за который продавец поставляет товары на склад, в днях.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? deliveryDurationDays;

  /// Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? boxCount;

  /// Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
  List<String>? customsCommodityCodes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferWeightDimensionsDTO? weightDimensions;

  /// Дни недели, в которые продавец поставляет товары на склад.
  List<DayOfWeekType>? supplyScheduleDays;

  /// {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? shelfLifeDays;

  /// {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lifeTimeDays;

  /// Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? guaranteePeriodDays;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferProcessingStateDTO? processingState;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferAvailabilityStatusType? availability;

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

  /// Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? certificate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateMappingsOfferDTO &&
    other.name == name &&
    other.shopSku == shopSku &&
    other.category == category &&
    other.vendor == vendor &&
    other.vendorCode == vendorCode &&
    other.description == description &&
    other.id == id &&
    other.feedId == feedId &&
    _deepEquality.equals(other.barcodes, barcodes) &&
    _deepEquality.equals(other.urls, urls) &&
    _deepEquality.equals(other.pictures, pictures) &&
    other.manufacturer == manufacturer &&
    _deepEquality.equals(other.manufacturerCountries, manufacturerCountries) &&
    other.minShipment == minShipment &&
    other.transportUnitSize == transportUnitSize &&
    other.quantumOfSupply == quantumOfSupply &&
    other.deliveryDurationDays == deliveryDurationDays &&
    other.boxCount == boxCount &&
    _deepEquality.equals(other.customsCommodityCodes, customsCommodityCodes) &&
    other.weightDimensions == weightDimensions &&
    _deepEquality.equals(other.supplyScheduleDays, supplyScheduleDays) &&
    other.shelfLifeDays == shelfLifeDays &&
    other.lifeTimeDays == lifeTimeDays &&
    other.guaranteePeriodDays == guaranteePeriodDays &&
    other.processingState == processingState &&
    other.availability == availability &&
    other.shelfLife == shelfLife &&
    other.lifeTime == lifeTime &&
    other.guaranteePeriod == guaranteePeriod &&
    other.certificate == certificate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (shopSku == null ? 0 : shopSku!.hashCode) +
    (category == null ? 0 : category!.hashCode) +
    (vendor == null ? 0 : vendor!.hashCode) +
    (vendorCode == null ? 0 : vendorCode!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (feedId == null ? 0 : feedId!.hashCode) +
    (barcodes == null ? 0 : barcodes!.hashCode) +
    (urls == null ? 0 : urls!.hashCode) +
    (pictures == null ? 0 : pictures!.hashCode) +
    (manufacturer == null ? 0 : manufacturer!.hashCode) +
    (manufacturerCountries == null ? 0 : manufacturerCountries!.hashCode) +
    (minShipment == null ? 0 : minShipment!.hashCode) +
    (transportUnitSize == null ? 0 : transportUnitSize!.hashCode) +
    (quantumOfSupply == null ? 0 : quantumOfSupply!.hashCode) +
    (deliveryDurationDays == null ? 0 : deliveryDurationDays!.hashCode) +
    (boxCount == null ? 0 : boxCount!.hashCode) +
    (customsCommodityCodes == null ? 0 : customsCommodityCodes!.hashCode) +
    (weightDimensions == null ? 0 : weightDimensions!.hashCode) +
    (supplyScheduleDays == null ? 0 : supplyScheduleDays!.hashCode) +
    (shelfLifeDays == null ? 0 : shelfLifeDays!.hashCode) +
    (lifeTimeDays == null ? 0 : lifeTimeDays!.hashCode) +
    (guaranteePeriodDays == null ? 0 : guaranteePeriodDays!.hashCode) +
    (processingState == null ? 0 : processingState!.hashCode) +
    (availability == null ? 0 : availability!.hashCode) +
    (shelfLife == null ? 0 : shelfLife!.hashCode) +
    (lifeTime == null ? 0 : lifeTime!.hashCode) +
    (guaranteePeriod == null ? 0 : guaranteePeriod!.hashCode) +
    (certificate == null ? 0 : certificate!.hashCode);

  @override
  String toString() => 'UpdateMappingsOfferDTO[name=$name, shopSku=$shopSku, category=$category, vendor=$vendor, vendorCode=$vendorCode, description=$description, id=$id, feedId=$feedId, barcodes=$barcodes, urls=$urls, pictures=$pictures, manufacturer=$manufacturer, manufacturerCountries=$manufacturerCountries, minShipment=$minShipment, transportUnitSize=$transportUnitSize, quantumOfSupply=$quantumOfSupply, deliveryDurationDays=$deliveryDurationDays, boxCount=$boxCount, customsCommodityCodes=$customsCommodityCodes, weightDimensions=$weightDimensions, supplyScheduleDays=$supplyScheduleDays, shelfLifeDays=$shelfLifeDays, lifeTimeDays=$lifeTimeDays, guaranteePeriodDays=$guaranteePeriodDays, processingState=$processingState, availability=$availability, shelfLife=$shelfLife, lifeTime=$lifeTime, guaranteePeriod=$guaranteePeriod, certificate=$certificate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.shopSku != null) {
      json[r'shopSku'] = this.shopSku;
    } else {
      json[r'shopSku'] = null;
    }
    if (this.category != null) {
      json[r'category'] = this.category;
    } else {
      json[r'category'] = null;
    }
    if (this.vendor != null) {
      json[r'vendor'] = this.vendor;
    } else {
      json[r'vendor'] = null;
    }
    if (this.vendorCode != null) {
      json[r'vendorCode'] = this.vendorCode;
    } else {
      json[r'vendorCode'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.feedId != null) {
      json[r'feedId'] = this.feedId;
    } else {
      json[r'feedId'] = null;
    }
    if (this.barcodes != null) {
      json[r'barcodes'] = this.barcodes;
    } else {
      json[r'barcodes'] = null;
    }
    if (this.urls != null) {
      json[r'urls'] = this.urls;
    } else {
      json[r'urls'] = null;
    }
    if (this.pictures != null) {
      json[r'pictures'] = this.pictures;
    } else {
      json[r'pictures'] = null;
    }
    if (this.manufacturer != null) {
      json[r'manufacturer'] = this.manufacturer;
    } else {
      json[r'manufacturer'] = null;
    }
    if (this.manufacturerCountries != null) {
      json[r'manufacturerCountries'] = this.manufacturerCountries;
    } else {
      json[r'manufacturerCountries'] = null;
    }
    if (this.minShipment != null) {
      json[r'minShipment'] = this.minShipment;
    } else {
      json[r'minShipment'] = null;
    }
    if (this.transportUnitSize != null) {
      json[r'transportUnitSize'] = this.transportUnitSize;
    } else {
      json[r'transportUnitSize'] = null;
    }
    if (this.quantumOfSupply != null) {
      json[r'quantumOfSupply'] = this.quantumOfSupply;
    } else {
      json[r'quantumOfSupply'] = null;
    }
    if (this.deliveryDurationDays != null) {
      json[r'deliveryDurationDays'] = this.deliveryDurationDays;
    } else {
      json[r'deliveryDurationDays'] = null;
    }
    if (this.boxCount != null) {
      json[r'boxCount'] = this.boxCount;
    } else {
      json[r'boxCount'] = null;
    }
    if (this.customsCommodityCodes != null) {
      json[r'customsCommodityCodes'] = this.customsCommodityCodes;
    } else {
      json[r'customsCommodityCodes'] = null;
    }
    if (this.weightDimensions != null) {
      json[r'weightDimensions'] = this.weightDimensions;
    } else {
      json[r'weightDimensions'] = null;
    }
    if (this.supplyScheduleDays != null) {
      json[r'supplyScheduleDays'] = this.supplyScheduleDays;
    } else {
      json[r'supplyScheduleDays'] = null;
    }
    if (this.shelfLifeDays != null) {
      json[r'shelfLifeDays'] = this.shelfLifeDays;
    } else {
      json[r'shelfLifeDays'] = null;
    }
    if (this.lifeTimeDays != null) {
      json[r'lifeTimeDays'] = this.lifeTimeDays;
    } else {
      json[r'lifeTimeDays'] = null;
    }
    if (this.guaranteePeriodDays != null) {
      json[r'guaranteePeriodDays'] = this.guaranteePeriodDays;
    } else {
      json[r'guaranteePeriodDays'] = null;
    }
    if (this.processingState != null) {
      json[r'processingState'] = this.processingState;
    } else {
      json[r'processingState'] = null;
    }
    if (this.availability != null) {
      json[r'availability'] = this.availability;
    } else {
      json[r'availability'] = null;
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
    if (this.certificate != null) {
      json[r'certificate'] = this.certificate;
    } else {
      json[r'certificate'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateMappingsOfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateMappingsOfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateMappingsOfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateMappingsOfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateMappingsOfferDTO(
        name: mapValueOfType<String>(json, r'name'),
        shopSku: mapValueOfType<String>(json, r'shopSku'),
        category: mapValueOfType<String>(json, r'category'),
        vendor: mapValueOfType<String>(json, r'vendor'),
        vendorCode: mapValueOfType<String>(json, r'vendorCode'),
        description: mapValueOfType<String>(json, r'description'),
        id: mapValueOfType<String>(json, r'id'),
        feedId: mapValueOfType<int>(json, r'feedId'),
        barcodes: json[r'barcodes'] is Iterable
            ? (json[r'barcodes'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        urls: json[r'urls'] is Iterable
            ? (json[r'urls'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        pictures: json[r'pictures'] is Iterable
            ? (json[r'pictures'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        manufacturer: mapValueOfType<String>(json, r'manufacturer'),
        manufacturerCountries: json[r'manufacturerCountries'] is Iterable
            ? (json[r'manufacturerCountries'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        minShipment: mapValueOfType<int>(json, r'minShipment'),
        transportUnitSize: mapValueOfType<int>(json, r'transportUnitSize'),
        quantumOfSupply: mapValueOfType<int>(json, r'quantumOfSupply'),
        deliveryDurationDays: mapValueOfType<int>(json, r'deliveryDurationDays'),
        boxCount: mapValueOfType<int>(json, r'boxCount'),
        customsCommodityCodes: json[r'customsCommodityCodes'] is Iterable
            ? (json[r'customsCommodityCodes'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        weightDimensions: OfferWeightDimensionsDTO.fromJson(json[r'weightDimensions']),
        supplyScheduleDays: DayOfWeekType.listFromJson(json[r'supplyScheduleDays']),
        shelfLifeDays: mapValueOfType<int>(json, r'shelfLifeDays'),
        lifeTimeDays: mapValueOfType<int>(json, r'lifeTimeDays'),
        guaranteePeriodDays: mapValueOfType<int>(json, r'guaranteePeriodDays'),
        processingState: OfferProcessingStateDTO.fromJson(json[r'processingState']),
        availability: OfferAvailabilityStatusType.fromJson(json[r'availability']),
        shelfLife: TimePeriodDTO.fromJson(json[r'shelfLife']),
        lifeTime: TimePeriodDTO.fromJson(json[r'lifeTime']),
        guaranteePeriod: TimePeriodDTO.fromJson(json[r'guaranteePeriod']),
        certificate: mapValueOfType<String>(json, r'certificate'),
      );
    }
    return null;
  }

  static List<UpdateMappingsOfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateMappingsOfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateMappingsOfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateMappingsOfferDTO> mapFromJson(dynamic json) {
    final map = <String, UpdateMappingsOfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateMappingsOfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateMappingsOfferDTO-objects as value to a dart map
  static Map<String, List<UpdateMappingsOfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateMappingsOfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateMappingsOfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

