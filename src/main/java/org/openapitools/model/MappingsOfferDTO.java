package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DayOfWeekType;
import org.openapitools.model.OfferAvailabilityStatusType;
import org.openapitools.model.OfferProcessingStateDTO;
import org.openapitools.model.OfferWeightDimensionsDTO;
import org.openapitools.model.TimePeriodDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о товарах в каталоге.
 */

@Schema(name = "MappingsOfferDTO", description = "Информация о товарах в каталоге.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MappingsOfferDTO {

  private String name;

  private String shopSku;

  private String category;

  private String vendor;

  private String vendorCode;

  private String description;

  private String id;

  private Long feedId;

  @Valid
  private JsonNullable<List<String>> barcodes = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> urls = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> pictures = JsonNullable.<List<String>>undefined();

  private String manufacturer;

  @Valid
  private JsonNullable<List<String>> manufacturerCountries = JsonNullable.<List<String>>undefined();

  private Integer minShipment;

  private Integer transportUnitSize;

  private Integer quantumOfSupply;

  private Integer deliveryDurationDays;

  private Integer boxCount;

  @Valid
  private JsonNullable<List<String>> customsCommodityCodes = JsonNullable.<List<String>>undefined();

  private OfferWeightDimensionsDTO weightDimensions;

  @Valid
  private JsonNullable<List<DayOfWeekType>> supplyScheduleDays = JsonNullable.<List<DayOfWeekType>>undefined();

  private Integer shelfLifeDays;

  private Integer lifeTimeDays;

  private Integer guaranteePeriodDays;

  private OfferProcessingStateDTO processingState;

  private OfferAvailabilityStatusType availability;

  private TimePeriodDTO shelfLife;

  private TimePeriodDTO lifeTime;

  private TimePeriodDTO guaranteePeriod;

  private String certificate;

  private BigDecimal price;

  public MappingsOfferDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
   * @return name
   */
  @Size(max = 256) 
  @Schema(name = "name", example = "Ударная дрель Makita HP1630, 710 Вт", description = "Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MappingsOfferDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
   */
  @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "shopSku", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopSku")
  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public MappingsOfferDTO category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
   * @return category
   */
  
  @Schema(name = "category", description = "Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public MappingsOfferDTO vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
   * @return vendor
   */
  
  @Schema(name = "vendor", example = "LEVENHUK", description = "Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendor")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public MappingsOfferDTO vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

  /**
   * Артикул товара от производителя.
   * @return vendorCode
   */
  
  @Schema(name = "vendorCode", example = "VNDR-0005A", description = "Артикул товара от производителя.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendorCode")
  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  public MappingsOfferDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
   * @return description
   */
  @Size(max = 6000) 
  @Schema(name = "description", description = "Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MappingsOfferDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return id
   */
  @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "id", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MappingsOfferDTO feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * Идентификатор фида.
   * @return feedId
   */
  
  @Schema(name = "feedId", description = "Идентификатор фида.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feedId")
  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public MappingsOfferDTO barcodes(List<String> barcodes) {
    this.barcodes = JsonNullable.of(barcodes);
    return this;
  }

  public MappingsOfferDTO addBarcodesItem(String barcodesItem) {
    if (this.barcodes == null || !this.barcodes.isPresent()) {
      this.barcodes = JsonNullable.of(new ArrayList<>());
    }
    this.barcodes.get().add(barcodesItem);
    return this;
  }

  /**
   * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
   * @return barcodes
   */
  
  @Schema(name = "barcodes", description = "Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("barcodes")
  public JsonNullable<List<String>> getBarcodes() {
    return barcodes;
  }

  public void setBarcodes(JsonNullable<List<String>> barcodes) {
    this.barcodes = barcodes;
  }

  public MappingsOfferDTO urls(List<String> urls) {
    this.urls = JsonNullable.of(urls);
    return this;
  }

  public MappingsOfferDTO addUrlsItem(String urlsItem) {
    if (this.urls == null || !this.urls.isPresent()) {
      this.urls = JsonNullable.of(new ArrayList<>());
    }
    this.urls.get().add(urlsItem);
    return this;
  }

  /**
   * URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
   * @return urls
   */
  
  @Schema(name = "urls", description = "URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urls")
  public JsonNullable<List<String>> getUrls() {
    return urls;
  }

  public void setUrls(JsonNullable<List<String>> urls) {
    this.urls = urls;
  }

  public MappingsOfferDTO pictures(List<String> pictures) {
    this.pictures = JsonNullable.of(pictures);
    return this;
  }

  public MappingsOfferDTO addPicturesItem(String picturesItem) {
    if (this.pictures == null || !this.pictures.isPresent()) {
      this.pictures = JsonNullable.of(new ArrayList<>());
    }
    this.pictures.get().add(picturesItem);
    return this;
  }

  /**
   * Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
   * @return pictures
   */
  
  @Schema(name = "pictures", description = "Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pictures")
  public JsonNullable<List<String>> getPictures() {
    return pictures;
  }

  public void setPictures(JsonNullable<List<String>> pictures) {
    this.pictures = pictures;
  }

  public MappingsOfferDTO manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
   * @return manufacturer
   */
  
  @Schema(name = "manufacturer", description = "Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public MappingsOfferDTO manufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = JsonNullable.of(manufacturerCountries);
    return this;
  }

  public MappingsOfferDTO addManufacturerCountriesItem(String manufacturerCountriesItem) {
    if (this.manufacturerCountries == null || !this.manufacturerCountries.isPresent()) {
      this.manufacturerCountries = JsonNullable.of(new ArrayList<>());
    }
    this.manufacturerCountries.get().add(manufacturerCountriesItem);
    return this;
  }

  /**
   * Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
   * @return manufacturerCountries
   */
  
  @Schema(name = "manufacturerCountries", description = "Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manufacturerCountries")
  public JsonNullable<List<String>> getManufacturerCountries() {
    return manufacturerCountries;
  }

  public void setManufacturerCountries(JsonNullable<List<String>> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

  public MappingsOfferDTO minShipment(Integer minShipment) {
    this.minShipment = minShipment;
    return this;
  }

  /**
   * Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
   * @return minShipment
   */
  
  @Schema(name = "minShipment", description = "Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minShipment")
  public Integer getMinShipment() {
    return minShipment;
  }

  public void setMinShipment(Integer minShipment) {
    this.minShipment = minShipment;
  }

  public MappingsOfferDTO transportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
    return this;
  }

  /**
   * Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
   * @return transportUnitSize
   */
  
  @Schema(name = "transportUnitSize", description = "Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transportUnitSize")
  public Integer getTransportUnitSize() {
    return transportUnitSize;
  }

  public void setTransportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
  }

  public MappingsOfferDTO quantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
    return this;
  }

  /**
   * Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
   * @return quantumOfSupply
   */
  
  @Schema(name = "quantumOfSupply", description = "Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantumOfSupply")
  public Integer getQuantumOfSupply() {
    return quantumOfSupply;
  }

  public void setQuantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
  }

  public MappingsOfferDTO deliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
    return this;
  }

  /**
   * Срок, за который продавец поставляет товары на склад, в днях.
   * @return deliveryDurationDays
   */
  
  @Schema(name = "deliveryDurationDays", description = "Срок, за который продавец поставляет товары на склад, в днях.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryDurationDays")
  public Integer getDeliveryDurationDays() {
    return deliveryDurationDays;
  }

  public void setDeliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
  }

  public MappingsOfferDTO boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

  /**
   * Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
   * @return boxCount
   */
  
  @Schema(name = "boxCount", description = "Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boxCount")
  public Integer getBoxCount() {
    return boxCount;
  }

  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  public MappingsOfferDTO customsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = JsonNullable.of(customsCommodityCodes);
    return this;
  }

  public MappingsOfferDTO addCustomsCommodityCodesItem(String customsCommodityCodesItem) {
    if (this.customsCommodityCodes == null || !this.customsCommodityCodes.isPresent()) {
      this.customsCommodityCodes = JsonNullable.of(new ArrayList<>());
    }
    this.customsCommodityCodes.get().add(customsCommodityCodesItem);
    return this;
  }

  /**
   * Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
   * @return customsCommodityCodes
   */
  
  @Schema(name = "customsCommodityCodes", description = "Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customsCommodityCodes")
  public JsonNullable<List<String>> getCustomsCommodityCodes() {
    return customsCommodityCodes;
  }

  public void setCustomsCommodityCodes(JsonNullable<List<String>> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
  }

  public MappingsOfferDTO weightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
    return this;
  }

  /**
   * Get weightDimensions
   * @return weightDimensions
   */
  @Valid 
  @Schema(name = "weightDimensions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weightDimensions")
  public OfferWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }

  public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  public MappingsOfferDTO supplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = JsonNullable.of(supplyScheduleDays);
    return this;
  }

  public MappingsOfferDTO addSupplyScheduleDaysItem(DayOfWeekType supplyScheduleDaysItem) {
    if (this.supplyScheduleDays == null || !this.supplyScheduleDays.isPresent()) {
      this.supplyScheduleDays = JsonNullable.of(new ArrayList<>());
    }
    this.supplyScheduleDays.get().add(supplyScheduleDaysItem);
    return this;
  }

  /**
   * Дни недели, в которые продавец поставляет товары на склад.
   * @return supplyScheduleDays
   */
  @Valid 
  @Schema(name = "supplyScheduleDays", description = "Дни недели, в которые продавец поставляет товары на склад.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supplyScheduleDays")
  public JsonNullable<List<DayOfWeekType>> getSupplyScheduleDays() {
    return supplyScheduleDays;
  }

  public void setSupplyScheduleDays(JsonNullable<List<DayOfWeekType>> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
  }

  public MappingsOfferDTO shelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
   * @return shelfLifeDays
   */
  
  @Schema(name = "shelfLifeDays", description = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shelfLifeDays")
  public Integer getShelfLifeDays() {
    return shelfLifeDays;
  }

  public void setShelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
  }

  public MappingsOfferDTO lifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
   * @return lifeTimeDays
   */
  
  @Schema(name = "lifeTimeDays", description = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifeTimeDays")
  public Integer getLifeTimeDays() {
    return lifeTimeDays;
  }

  public void setLifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
  }

  public MappingsOfferDTO guaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
    return this;
  }

  /**
   * Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
   * @return guaranteePeriodDays
   */
  
  @Schema(name = "guaranteePeriodDays", description = "Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guaranteePeriodDays")
  public Integer getGuaranteePeriodDays() {
    return guaranteePeriodDays;
  }

  public void setGuaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
  }

  public MappingsOfferDTO processingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
    return this;
  }

  /**
   * Get processingState
   * @return processingState
   */
  @Valid 
  @Schema(name = "processingState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processingState")
  public OfferProcessingStateDTO getProcessingState() {
    return processingState;
  }

  public void setProcessingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
  }

  public MappingsOfferDTO availability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
   */
  @Valid 
  @Schema(name = "availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
  public OfferAvailabilityStatusType getAvailability() {
    return availability;
  }

  public void setAvailability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
  }

  public MappingsOfferDTO shelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
    return this;
  }

  /**
   * Get shelfLife
   * @return shelfLife
   */
  @Valid 
  @Schema(name = "shelfLife", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shelfLife")
  public TimePeriodDTO getShelfLife() {
    return shelfLife;
  }

  public void setShelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
  }

  public MappingsOfferDTO lifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
    return this;
  }

  /**
   * Get lifeTime
   * @return lifeTime
   */
  @Valid 
  @Schema(name = "lifeTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifeTime")
  public TimePeriodDTO getLifeTime() {
    return lifeTime;
  }

  public void setLifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
  }

  public MappingsOfferDTO guaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
    return this;
  }

  /**
   * Get guaranteePeriod
   * @return guaranteePeriod
   */
  @Valid 
  @Schema(name = "guaranteePeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guaranteePeriod")
  public TimePeriodDTO getGuaranteePeriod() {
    return guaranteePeriod;
  }

  public void setGuaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
  }

  public MappingsOfferDTO certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
   * @return certificate
   */
  
  @Schema(name = "certificate", description = "Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public MappingsOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Цена на товар в рублях.
   * @return price
   */
  @Valid 
  @Schema(name = "price", description = "Цена на товар в рублях.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingsOfferDTO mappingsOfferDTO = (MappingsOfferDTO) o;
    return Objects.equals(this.name, mappingsOfferDTO.name) &&
        Objects.equals(this.shopSku, mappingsOfferDTO.shopSku) &&
        Objects.equals(this.category, mappingsOfferDTO.category) &&
        Objects.equals(this.vendor, mappingsOfferDTO.vendor) &&
        Objects.equals(this.vendorCode, mappingsOfferDTO.vendorCode) &&
        Objects.equals(this.description, mappingsOfferDTO.description) &&
        Objects.equals(this.id, mappingsOfferDTO.id) &&
        Objects.equals(this.feedId, mappingsOfferDTO.feedId) &&
        equalsNullable(this.barcodes, mappingsOfferDTO.barcodes) &&
        equalsNullable(this.urls, mappingsOfferDTO.urls) &&
        equalsNullable(this.pictures, mappingsOfferDTO.pictures) &&
        Objects.equals(this.manufacturer, mappingsOfferDTO.manufacturer) &&
        equalsNullable(this.manufacturerCountries, mappingsOfferDTO.manufacturerCountries) &&
        Objects.equals(this.minShipment, mappingsOfferDTO.minShipment) &&
        Objects.equals(this.transportUnitSize, mappingsOfferDTO.transportUnitSize) &&
        Objects.equals(this.quantumOfSupply, mappingsOfferDTO.quantumOfSupply) &&
        Objects.equals(this.deliveryDurationDays, mappingsOfferDTO.deliveryDurationDays) &&
        Objects.equals(this.boxCount, mappingsOfferDTO.boxCount) &&
        equalsNullable(this.customsCommodityCodes, mappingsOfferDTO.customsCommodityCodes) &&
        Objects.equals(this.weightDimensions, mappingsOfferDTO.weightDimensions) &&
        equalsNullable(this.supplyScheduleDays, mappingsOfferDTO.supplyScheduleDays) &&
        Objects.equals(this.shelfLifeDays, mappingsOfferDTO.shelfLifeDays) &&
        Objects.equals(this.lifeTimeDays, mappingsOfferDTO.lifeTimeDays) &&
        Objects.equals(this.guaranteePeriodDays, mappingsOfferDTO.guaranteePeriodDays) &&
        Objects.equals(this.processingState, mappingsOfferDTO.processingState) &&
        Objects.equals(this.availability, mappingsOfferDTO.availability) &&
        Objects.equals(this.shelfLife, mappingsOfferDTO.shelfLife) &&
        Objects.equals(this.lifeTime, mappingsOfferDTO.lifeTime) &&
        Objects.equals(this.guaranteePeriod, mappingsOfferDTO.guaranteePeriod) &&
        Objects.equals(this.certificate, mappingsOfferDTO.certificate) &&
        Objects.equals(this.price, mappingsOfferDTO.price);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shopSku, category, vendor, vendorCode, description, id, feedId, hashCodeNullable(barcodes), hashCodeNullable(urls), hashCodeNullable(pictures), manufacturer, hashCodeNullable(manufacturerCountries), minShipment, transportUnitSize, quantumOfSupply, deliveryDurationDays, boxCount, hashCodeNullable(customsCommodityCodes), weightDimensions, hashCodeNullable(supplyScheduleDays), shelfLifeDays, lifeTimeDays, guaranteePeriodDays, processingState, availability, shelfLife, lifeTime, guaranteePeriod, certificate, price);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingsOfferDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    barcodes: ").append(toIndentedString(barcodes)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerCountries: ").append(toIndentedString(manufacturerCountries)).append("\n");
    sb.append("    minShipment: ").append(toIndentedString(minShipment)).append("\n");
    sb.append("    transportUnitSize: ").append(toIndentedString(transportUnitSize)).append("\n");
    sb.append("    quantumOfSupply: ").append(toIndentedString(quantumOfSupply)).append("\n");
    sb.append("    deliveryDurationDays: ").append(toIndentedString(deliveryDurationDays)).append("\n");
    sb.append("    boxCount: ").append(toIndentedString(boxCount)).append("\n");
    sb.append("    customsCommodityCodes: ").append(toIndentedString(customsCommodityCodes)).append("\n");
    sb.append("    weightDimensions: ").append(toIndentedString(weightDimensions)).append("\n");
    sb.append("    supplyScheduleDays: ").append(toIndentedString(supplyScheduleDays)).append("\n");
    sb.append("    shelfLifeDays: ").append(toIndentedString(shelfLifeDays)).append("\n");
    sb.append("    lifeTimeDays: ").append(toIndentedString(lifeTimeDays)).append("\n");
    sb.append("    guaranteePeriodDays: ").append(toIndentedString(guaranteePeriodDays)).append("\n");
    sb.append("    processingState: ").append(toIndentedString(processingState)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    shelfLife: ").append(toIndentedString(shelfLife)).append("\n");
    sb.append("    lifeTime: ").append(toIndentedString(lifeTime)).append("\n");
    sb.append("    guaranteePeriod: ").append(toIndentedString(guaranteePeriod)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

