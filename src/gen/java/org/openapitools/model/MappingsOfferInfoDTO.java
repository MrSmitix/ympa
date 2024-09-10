package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DayOfWeekType;
import org.openapitools.model.OfferAvailabilityStatusType;
import org.openapitools.model.OfferProcessingStateDTO;
import org.openapitools.model.OfferWeightDimensionsDTO;
import org.openapitools.model.TimePeriodDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Базовая информация о товарах в каталоге.
 **/
@ApiModel(description = "Базовая информация о товарах в каталоге.")
@JsonTypeName("MappingsOfferInfoDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MappingsOfferInfoDTO   {
  private String name;
  private String shopSku;
  private String category;
  private String vendor;
  private String vendorCode;
  private String description;
  private String id;
  private Long feedId;
  private @Valid List<String> barcodes;
  private @Valid List<String> urls;
  private @Valid List<String> pictures;
  private String manufacturer;
  private @Valid List<String> manufacturerCountries;
  private Integer minShipment;
  private Integer transportUnitSize;
  private Integer quantumOfSupply;
  private Integer deliveryDurationDays;
  private Integer boxCount;
  private @Valid List<String> customsCommodityCodes;
  private OfferWeightDimensionsDTO weightDimensions;
  private @Valid List<DayOfWeekType> supplyScheduleDays;
  private Integer shelfLifeDays;
  private Integer lifeTimeDays;
  private Integer guaranteePeriodDays;
  private OfferProcessingStateDTO processingState;
  private OfferAvailabilityStatusType availability;
  private TimePeriodDTO shelfLife;
  private TimePeriodDTO lifeTime;
  private TimePeriodDTO guaranteePeriod;
  private String certificate;

  /**
   * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
   **/
  public MappingsOfferInfoDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Ударная дрель Makita HP1630, 710 Вт", value = "Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ")
  @JsonProperty("name")
   @Size(max=256)public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public MappingsOfferInfoDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("shopSku")
   @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)public String getShopSku() {
    return shopSku;
  }

  @JsonProperty("shopSku")
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
   **/
  public MappingsOfferInfoDTO category(String category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. ")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
   **/
  public MappingsOfferInfoDTO vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  
  @ApiModelProperty(example = "LEVENHUK", value = "Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.")
  @JsonProperty("vendor")
  public String getVendor() {
    return vendor;
  }

  @JsonProperty("vendor")
  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  /**
   * Артикул товара от производителя.
   **/
  public MappingsOfferInfoDTO vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

  
  @ApiModelProperty(example = "VNDR-0005A", value = "Артикул товара от производителя.")
  @JsonProperty("vendorCode")
  public String getVendorCode() {
    return vendorCode;
  }

  @JsonProperty("vendorCode")
  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  /**
   * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
   **/
  public MappingsOfferInfoDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ")
  @JsonProperty("description")
   @Size(max=6000)public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public MappingsOfferInfoDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("id")
   @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Идентификатор фида.
   **/
  public MappingsOfferInfoDTO feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор фида.")
  @JsonProperty("feedId")
  public Long getFeedId() {
    return feedId;
  }

  @JsonProperty("feedId")
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  /**
   * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
   **/
  public MappingsOfferInfoDTO barcodes(List<String> barcodes) {
    this.barcodes = barcodes;
    return this;
  }

  
  @ApiModelProperty(value = "Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ")
  @JsonProperty("barcodes")
  public List<String> getBarcodes() {
    return barcodes;
  }

  @JsonProperty("barcodes")
  public void setBarcodes(List<String> barcodes) {
    this.barcodes = barcodes;
  }

  public MappingsOfferInfoDTO addBarcodesItem(String barcodesItem) {
    if (this.barcodes == null) {
      this.barcodes = new ArrayList<>();
    }

    this.barcodes.add(barcodesItem);
    return this;
  }

  public MappingsOfferInfoDTO removeBarcodesItem(String barcodesItem) {
    if (barcodesItem != null && this.barcodes != null) {
      this.barcodes.remove(barcodesItem);
    }

    return this;
  }
  /**
   * URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
   **/
  public MappingsOfferInfoDTO urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  
  @ApiModelProperty(value = "URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. ")
  @JsonProperty("urls")
  public List<String> getUrls() {
    return urls;
  }

  @JsonProperty("urls")
  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  public MappingsOfferInfoDTO addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }

    this.urls.add(urlsItem);
    return this;
  }

  public MappingsOfferInfoDTO removeUrlsItem(String urlsItem) {
    if (urlsItem != null && this.urls != null) {
      this.urls.remove(urlsItem);
    }

    return this;
  }
  /**
   * Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. 
   **/
  public MappingsOfferInfoDTO pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  
  @ApiModelProperty(value = "Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. ")
  @JsonProperty("pictures")
  public List<String> getPictures() {
    return pictures;
  }

  @JsonProperty("pictures")
  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

  public MappingsOfferInfoDTO addPicturesItem(String picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<>();
    }

    this.pictures.add(picturesItem);
    return this;
  }

  public MappingsOfferInfoDTO removePicturesItem(String picturesItem) {
    if (picturesItem != null && this.pictures != null) {
      this.pictures.remove(picturesItem);
    }

    return this;
  }
  /**
   * Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
   **/
  public MappingsOfferInfoDTO manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  
  @ApiModelProperty(value = "Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. ")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  @JsonProperty("manufacturer")
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
   **/
  public MappingsOfferInfoDTO manufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
    return this;
  }

  
  @ApiModelProperty(value = "Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. ")
  @JsonProperty("manufacturerCountries")
  public List<String> getManufacturerCountries() {
    return manufacturerCountries;
  }

  @JsonProperty("manufacturerCountries")
  public void setManufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

  public MappingsOfferInfoDTO addManufacturerCountriesItem(String manufacturerCountriesItem) {
    if (this.manufacturerCountries == null) {
      this.manufacturerCountries = new ArrayList<>();
    }

    this.manufacturerCountries.add(manufacturerCountriesItem);
    return this;
  }

  public MappingsOfferInfoDTO removeManufacturerCountriesItem(String manufacturerCountriesItem) {
    if (manufacturerCountriesItem != null && this.manufacturerCountries != null) {
      this.manufacturerCountries.remove(manufacturerCountriesItem);
    }

    return this;
  }
  /**
   * Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
   **/
  public MappingsOfferInfoDTO minShipment(Integer minShipment) {
    this.minShipment = minShipment;
    return this;
  }

  
  @ApiModelProperty(value = "Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. ")
  @JsonProperty("minShipment")
  public Integer getMinShipment() {
    return minShipment;
  }

  @JsonProperty("minShipment")
  public void setMinShipment(Integer minShipment) {
    this.minShipment = minShipment;
  }

  /**
   * Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
   **/
  public MappingsOfferInfoDTO transportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
    return this;
  }

  
  @ApiModelProperty(value = "Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. ")
  @JsonProperty("transportUnitSize")
  public Integer getTransportUnitSize() {
    return transportUnitSize;
  }

  @JsonProperty("transportUnitSize")
  public void setTransportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
  }

  /**
   * Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
   **/
  public MappingsOfferInfoDTO quantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
    return this;
  }

  
  @ApiModelProperty(value = "Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. ")
  @JsonProperty("quantumOfSupply")
  public Integer getQuantumOfSupply() {
    return quantumOfSupply;
  }

  @JsonProperty("quantumOfSupply")
  public void setQuantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
  }

  /**
   * Срок, за который продавец поставляет товары на склад, в днях.
   **/
  public MappingsOfferInfoDTO deliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
    return this;
  }

  
  @ApiModelProperty(value = "Срок, за который продавец поставляет товары на склад, в днях.")
  @JsonProperty("deliveryDurationDays")
  public Integer getDeliveryDurationDays() {
    return deliveryDurationDays;
  }

  @JsonProperty("deliveryDurationDays")
  public void setDeliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
  }

  /**
   * Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
   **/
  public MappingsOfferInfoDTO boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

  
  @ApiModelProperty(value = "Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. ")
  @JsonProperty("boxCount")
  public Integer getBoxCount() {
    return boxCount;
  }

  @JsonProperty("boxCount")
  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  /**
   * Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
   **/
  public MappingsOfferInfoDTO customsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
    return this;
  }

  
  @ApiModelProperty(value = "Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. ")
  @JsonProperty("customsCommodityCodes")
  public List<String> getCustomsCommodityCodes() {
    return customsCommodityCodes;
  }

  @JsonProperty("customsCommodityCodes")
  public void setCustomsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
  }

  public MappingsOfferInfoDTO addCustomsCommodityCodesItem(String customsCommodityCodesItem) {
    if (this.customsCommodityCodes == null) {
      this.customsCommodityCodes = new ArrayList<>();
    }

    this.customsCommodityCodes.add(customsCommodityCodesItem);
    return this;
  }

  public MappingsOfferInfoDTO removeCustomsCommodityCodesItem(String customsCommodityCodesItem) {
    if (customsCommodityCodesItem != null && this.customsCommodityCodes != null) {
      this.customsCommodityCodes.remove(customsCommodityCodesItem);
    }

    return this;
  }
  /**
   **/
  public MappingsOfferInfoDTO weightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("weightDimensions")
  @Valid public OfferWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }

  @JsonProperty("weightDimensions")
  public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  /**
   * Дни недели, в которые продавец поставляет товары на склад.
   **/
  public MappingsOfferInfoDTO supplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
    return this;
  }

  
  @ApiModelProperty(value = "Дни недели, в которые продавец поставляет товары на склад.")
  @JsonProperty("supplyScheduleDays")
  public List<DayOfWeekType> getSupplyScheduleDays() {
    return supplyScheduleDays;
  }

  @JsonProperty("supplyScheduleDays")
  public void setSupplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
  }

  public MappingsOfferInfoDTO addSupplyScheduleDaysItem(DayOfWeekType supplyScheduleDaysItem) {
    if (this.supplyScheduleDays == null) {
      this.supplyScheduleDays = new ArrayList<>();
    }

    this.supplyScheduleDays.add(supplyScheduleDaysItem);
    return this;
  }

  public MappingsOfferInfoDTO removeSupplyScheduleDaysItem(DayOfWeekType supplyScheduleDaysItem) {
    if (supplyScheduleDaysItem != null && this.supplyScheduleDays != null) {
      this.supplyScheduleDays.remove(supplyScheduleDaysItem);
    }

    return this;
  }
  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
   **/
  public MappingsOfferInfoDTO shelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. ")
  @JsonProperty("shelfLifeDays")
  public Integer getShelfLifeDays() {
    return shelfLifeDays;
  }

  @JsonProperty("shelfLifeDays")
  public void setShelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
   **/
  public MappingsOfferInfoDTO lifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. ")
  @JsonProperty("lifeTimeDays")
  public Integer getLifeTimeDays() {
    return lifeTimeDays;
  }

  @JsonProperty("lifeTimeDays")
  public void setLifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
  }

  /**
   * Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
   **/
  public MappingsOfferInfoDTO guaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
    return this;
  }

  
  @ApiModelProperty(value = "Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. ")
  @JsonProperty("guaranteePeriodDays")
  public Integer getGuaranteePeriodDays() {
    return guaranteePeriodDays;
  }

  @JsonProperty("guaranteePeriodDays")
  public void setGuaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
  }

  /**
   **/
  public MappingsOfferInfoDTO processingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("processingState")
  @Valid public OfferProcessingStateDTO getProcessingState() {
    return processingState;
  }

  @JsonProperty("processingState")
  public void setProcessingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
  }

  /**
   **/
  public MappingsOfferInfoDTO availability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("availability")
  public OfferAvailabilityStatusType getAvailability() {
    return availability;
  }

  @JsonProperty("availability")
  public void setAvailability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
  }

  /**
   **/
  public MappingsOfferInfoDTO shelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shelfLife")
  @Valid public TimePeriodDTO getShelfLife() {
    return shelfLife;
  }

  @JsonProperty("shelfLife")
  public void setShelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
  }

  /**
   **/
  public MappingsOfferInfoDTO lifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lifeTime")
  @Valid public TimePeriodDTO getLifeTime() {
    return lifeTime;
  }

  @JsonProperty("lifeTime")
  public void setLifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
  }

  /**
   **/
  public MappingsOfferInfoDTO guaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("guaranteePeriod")
  @Valid public TimePeriodDTO getGuaranteePeriod() {
    return guaranteePeriod;
  }

  @JsonProperty("guaranteePeriod")
  public void setGuaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
  }

  /**
   * Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
   **/
  public MappingsOfferInfoDTO certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

  
  @ApiModelProperty(value = "Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) ")
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }

  @JsonProperty("certificate")
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingsOfferInfoDTO mappingsOfferInfoDTO = (MappingsOfferInfoDTO) o;
    return Objects.equals(this.name, mappingsOfferInfoDTO.name) &&
        Objects.equals(this.shopSku, mappingsOfferInfoDTO.shopSku) &&
        Objects.equals(this.category, mappingsOfferInfoDTO.category) &&
        Objects.equals(this.vendor, mappingsOfferInfoDTO.vendor) &&
        Objects.equals(this.vendorCode, mappingsOfferInfoDTO.vendorCode) &&
        Objects.equals(this.description, mappingsOfferInfoDTO.description) &&
        Objects.equals(this.id, mappingsOfferInfoDTO.id) &&
        Objects.equals(this.feedId, mappingsOfferInfoDTO.feedId) &&
        Objects.equals(this.barcodes, mappingsOfferInfoDTO.barcodes) &&
        Objects.equals(this.urls, mappingsOfferInfoDTO.urls) &&
        Objects.equals(this.pictures, mappingsOfferInfoDTO.pictures) &&
        Objects.equals(this.manufacturer, mappingsOfferInfoDTO.manufacturer) &&
        Objects.equals(this.manufacturerCountries, mappingsOfferInfoDTO.manufacturerCountries) &&
        Objects.equals(this.minShipment, mappingsOfferInfoDTO.minShipment) &&
        Objects.equals(this.transportUnitSize, mappingsOfferInfoDTO.transportUnitSize) &&
        Objects.equals(this.quantumOfSupply, mappingsOfferInfoDTO.quantumOfSupply) &&
        Objects.equals(this.deliveryDurationDays, mappingsOfferInfoDTO.deliveryDurationDays) &&
        Objects.equals(this.boxCount, mappingsOfferInfoDTO.boxCount) &&
        Objects.equals(this.customsCommodityCodes, mappingsOfferInfoDTO.customsCommodityCodes) &&
        Objects.equals(this.weightDimensions, mappingsOfferInfoDTO.weightDimensions) &&
        Objects.equals(this.supplyScheduleDays, mappingsOfferInfoDTO.supplyScheduleDays) &&
        Objects.equals(this.shelfLifeDays, mappingsOfferInfoDTO.shelfLifeDays) &&
        Objects.equals(this.lifeTimeDays, mappingsOfferInfoDTO.lifeTimeDays) &&
        Objects.equals(this.guaranteePeriodDays, mappingsOfferInfoDTO.guaranteePeriodDays) &&
        Objects.equals(this.processingState, mappingsOfferInfoDTO.processingState) &&
        Objects.equals(this.availability, mappingsOfferInfoDTO.availability) &&
        Objects.equals(this.shelfLife, mappingsOfferInfoDTO.shelfLife) &&
        Objects.equals(this.lifeTime, mappingsOfferInfoDTO.lifeTime) &&
        Objects.equals(this.guaranteePeriod, mappingsOfferInfoDTO.guaranteePeriod) &&
        Objects.equals(this.certificate, mappingsOfferInfoDTO.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shopSku, category, vendor, vendorCode, description, id, feedId, barcodes, urls, pictures, manufacturer, manufacturerCountries, minShipment, transportUnitSize, quantumOfSupply, deliveryDurationDays, boxCount, customsCommodityCodes, weightDimensions, supplyScheduleDays, shelfLifeDays, lifeTimeDays, guaranteePeriodDays, processingState, availability, shelfLife, lifeTime, guaranteePeriod, certificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingsOfferInfoDTO {\n");
    
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

