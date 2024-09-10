package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

/**
 * Информация о рекомендованных карточках товаров.
 */
@ApiModel(description = "Информация о рекомендованных карточках товаров.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EnrichedMappingsOfferDTO   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("shopSku")
  private String shopSku;

  @JsonProperty("category")
  private String category;

  @JsonProperty("vendor")
  private String vendor;

  @JsonProperty("vendorCode")
  private String vendorCode;

  @JsonProperty("description")
  private String description;

  @JsonProperty("id")
  private String id;

  @JsonProperty("feedId")
  private Long feedId;

  @JsonProperty("barcodes")
  private List<String> barcodes = null;

  @JsonProperty("urls")
  private List<String> urls = null;

  @JsonProperty("pictures")
  private List<String> pictures = null;

  @JsonProperty("manufacturer")
  private String manufacturer;

  @JsonProperty("manufacturerCountries")
  private List<String> manufacturerCountries = null;

  @JsonProperty("minShipment")
  private Integer minShipment;

  @JsonProperty("transportUnitSize")
  private Integer transportUnitSize;

  @JsonProperty("quantumOfSupply")
  private Integer quantumOfSupply;

  @JsonProperty("deliveryDurationDays")
  private Integer deliveryDurationDays;

  @JsonProperty("boxCount")
  private Integer boxCount;

  @JsonProperty("customsCommodityCodes")
  private List<String> customsCommodityCodes = null;

  @JsonProperty("weightDimensions")
  private OfferWeightDimensionsDTO weightDimensions;

  @JsonProperty("supplyScheduleDays")
  private List<DayOfWeekType> supplyScheduleDays = null;

  @JsonProperty("shelfLifeDays")
  private Integer shelfLifeDays;

  @JsonProperty("lifeTimeDays")
  private Integer lifeTimeDays;

  @JsonProperty("guaranteePeriodDays")
  private Integer guaranteePeriodDays;

  @JsonProperty("processingState")
  private OfferProcessingStateDTO processingState;

  @JsonProperty("availability")
  private OfferAvailabilityStatusType availability;

  @JsonProperty("shelfLife")
  private TimePeriodDTO shelfLife;

  @JsonProperty("lifeTime")
  private TimePeriodDTO lifeTime;

  @JsonProperty("guaranteePeriod")
  private TimePeriodDTO guaranteePeriod;

  @JsonProperty("certificate")
  private String certificate;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("marketCategoryId")
  private Long marketCategoryId;

  @JsonProperty("marketCategoryName")
  private String marketCategoryName;

  @JsonProperty("marketModelId")
  private Long marketModelId;

  @JsonProperty("marketModelName")
  private String marketModelName;

  @JsonProperty("marketSku")
  private Long marketSku;

  @JsonProperty("marketSkuName")
  private String marketSkuName;

  public EnrichedMappingsOfferDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
   * @return name
  **/
  @ApiModelProperty(example = "Ударная дрель Makita HP1630, 710 Вт", value = "Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnrichedMappingsOfferDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
  **/
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public EnrichedMappingsOfferDTO category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
   * @return category
  **/
  @ApiModelProperty(value = "Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. ")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public EnrichedMappingsOfferDTO vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
   * @return vendor
  **/
  @ApiModelProperty(example = "LEVENHUK", value = "Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public EnrichedMappingsOfferDTO vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

   /**
   * Артикул товара от производителя.
   * @return vendorCode
  **/
  @ApiModelProperty(example = "VNDR-0005A", value = "Артикул товара от производителя.")
  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  public EnrichedMappingsOfferDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
   * @return description
  **/
  @ApiModelProperty(value = "Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EnrichedMappingsOfferDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return id
  **/
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EnrichedMappingsOfferDTO feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Идентификатор фида.
   * @return feedId
  **/
  @ApiModelProperty(value = "Идентификатор фида.")
  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public EnrichedMappingsOfferDTO barcodes(List<String> barcodes) {
    this.barcodes = barcodes;
    return this;
  }

  public EnrichedMappingsOfferDTO addBarcodesItem(String barcodesItem) {
    if (this.barcodes == null) {
      this.barcodes = ;
    }
    this.barcodes.add(barcodesItem);
    return this;
  }

   /**
   * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
   * @return barcodes
  **/
  @ApiModelProperty(value = "Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ")
  public List<String> getBarcodes() {
    return barcodes;
  }

  public void setBarcodes(List<String> barcodes) {
    this.barcodes = barcodes;
  }

  public EnrichedMappingsOfferDTO urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public EnrichedMappingsOfferDTO addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = ;
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
   * @return urls
  **/
  @ApiModelProperty(value = "URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. ")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  public EnrichedMappingsOfferDTO pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  public EnrichedMappingsOfferDTO addPicturesItem(String picturesItem) {
    if (this.pictures == null) {
      this.pictures = ;
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
   * @return pictures
  **/
  @ApiModelProperty(value = "Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. ")
  public List<String> getPictures() {
    return pictures;
  }

  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

  public EnrichedMappingsOfferDTO manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
   * @return manufacturer
  **/
  @ApiModelProperty(value = "Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. ")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public EnrichedMappingsOfferDTO manufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
    return this;
  }

  public EnrichedMappingsOfferDTO addManufacturerCountriesItem(String manufacturerCountriesItem) {
    if (this.manufacturerCountries == null) {
      this.manufacturerCountries = ;
    }
    this.manufacturerCountries.add(manufacturerCountriesItem);
    return this;
  }

   /**
   * Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
   * @return manufacturerCountries
  **/
  @ApiModelProperty(value = "Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. ")
  public List<String> getManufacturerCountries() {
    return manufacturerCountries;
  }

  public void setManufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

  public EnrichedMappingsOfferDTO minShipment(Integer minShipment) {
    this.minShipment = minShipment;
    return this;
  }

   /**
   * Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
   * @return minShipment
  **/
  @ApiModelProperty(value = "Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. ")
  public Integer getMinShipment() {
    return minShipment;
  }

  public void setMinShipment(Integer minShipment) {
    this.minShipment = minShipment;
  }

  public EnrichedMappingsOfferDTO transportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
    return this;
  }

   /**
   * Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
   * @return transportUnitSize
  **/
  @ApiModelProperty(value = "Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. ")
  public Integer getTransportUnitSize() {
    return transportUnitSize;
  }

  public void setTransportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
  }

  public EnrichedMappingsOfferDTO quantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
    return this;
  }

   /**
   * Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
   * @return quantumOfSupply
  **/
  @ApiModelProperty(value = "Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. ")
  public Integer getQuantumOfSupply() {
    return quantumOfSupply;
  }

  public void setQuantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
  }

  public EnrichedMappingsOfferDTO deliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
    return this;
  }

   /**
   * Срок, за который продавец поставляет товары на склад, в днях.
   * @return deliveryDurationDays
  **/
  @ApiModelProperty(value = "Срок, за который продавец поставляет товары на склад, в днях.")
  public Integer getDeliveryDurationDays() {
    return deliveryDurationDays;
  }

  public void setDeliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
  }

  public EnrichedMappingsOfferDTO boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

   /**
   * Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
   * @return boxCount
  **/
  @ApiModelProperty(value = "Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. ")
  public Integer getBoxCount() {
    return boxCount;
  }

  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  public EnrichedMappingsOfferDTO customsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
    return this;
  }

  public EnrichedMappingsOfferDTO addCustomsCommodityCodesItem(String customsCommodityCodesItem) {
    if (this.customsCommodityCodes == null) {
      this.customsCommodityCodes = ;
    }
    this.customsCommodityCodes.add(customsCommodityCodesItem);
    return this;
  }

   /**
   * Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
   * @return customsCommodityCodes
  **/
  @ApiModelProperty(value = "Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. ")
  public List<String> getCustomsCommodityCodes() {
    return customsCommodityCodes;
  }

  public void setCustomsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
  }

  public EnrichedMappingsOfferDTO weightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
    return this;
  }

   /**
   * Get weightDimensions
   * @return weightDimensions
  **/
  @ApiModelProperty(value = "")
  public OfferWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }

  public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  public EnrichedMappingsOfferDTO supplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
    return this;
  }

  public EnrichedMappingsOfferDTO addSupplyScheduleDaysItem(DayOfWeekType supplyScheduleDaysItem) {
    if (this.supplyScheduleDays == null) {
      this.supplyScheduleDays = ;
    }
    this.supplyScheduleDays.add(supplyScheduleDaysItem);
    return this;
  }

   /**
   * Дни недели, в которые продавец поставляет товары на склад.
   * @return supplyScheduleDays
  **/
  @ApiModelProperty(value = "Дни недели, в которые продавец поставляет товары на склад.")
  public List<DayOfWeekType> getSupplyScheduleDays() {
    return supplyScheduleDays;
  }

  public void setSupplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
  }

  public EnrichedMappingsOfferDTO shelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
   * @return shelfLifeDays
  **/
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. ")
  public Integer getShelfLifeDays() {
    return shelfLifeDays;
  }

  public void setShelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
  }

  public EnrichedMappingsOfferDTO lifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
   * @return lifeTimeDays
  **/
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. ")
  public Integer getLifeTimeDays() {
    return lifeTimeDays;
  }

  public void setLifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
  }

  public EnrichedMappingsOfferDTO guaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
    return this;
  }

   /**
   * Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
   * @return guaranteePeriodDays
  **/
  @ApiModelProperty(value = "Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. ")
  public Integer getGuaranteePeriodDays() {
    return guaranteePeriodDays;
  }

  public void setGuaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
  }

  public EnrichedMappingsOfferDTO processingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
    return this;
  }

   /**
   * Get processingState
   * @return processingState
  **/
  @ApiModelProperty(value = "")
  public OfferProcessingStateDTO getProcessingState() {
    return processingState;
  }

  public void setProcessingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
  }

  public EnrichedMappingsOfferDTO availability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  public OfferAvailabilityStatusType getAvailability() {
    return availability;
  }

  public void setAvailability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
  }

  public EnrichedMappingsOfferDTO shelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
    return this;
  }

   /**
   * Get shelfLife
   * @return shelfLife
  **/
  @ApiModelProperty(value = "")
  public TimePeriodDTO getShelfLife() {
    return shelfLife;
  }

  public void setShelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
  }

  public EnrichedMappingsOfferDTO lifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
    return this;
  }

   /**
   * Get lifeTime
   * @return lifeTime
  **/
  @ApiModelProperty(value = "")
  public TimePeriodDTO getLifeTime() {
    return lifeTime;
  }

  public void setLifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
  }

  public EnrichedMappingsOfferDTO guaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
    return this;
  }

   /**
   * Get guaranteePeriod
   * @return guaranteePeriod
  **/
  @ApiModelProperty(value = "")
  public TimePeriodDTO getGuaranteePeriod() {
    return guaranteePeriod;
  }

  public void setGuaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
  }

  public EnrichedMappingsOfferDTO certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
   * @return certificate
  **/
  @ApiModelProperty(value = "Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) ")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public EnrichedMappingsOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Цена на товар в рублях.
   * @return price
  **/
  @ApiModelProperty(value = "Цена на товар в рублях.")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public EnrichedMappingsOfferDTO marketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
    return this;
  }

   /**
   * Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
   * @return marketCategoryId
  **/
  @ApiModelProperty(value = "Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. ")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }

  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  public EnrichedMappingsOfferDTO marketCategoryName(String marketCategoryName) {
    this.marketCategoryName = marketCategoryName;
    return this;
  }

   /**
   * Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
   * @return marketCategoryName
  **/
  @ApiModelProperty(value = "Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. ")
  public String getMarketCategoryName() {
    return marketCategoryName;
  }

  public void setMarketCategoryName(String marketCategoryName) {
    this.marketCategoryName = marketCategoryName;
  }

  public EnrichedMappingsOfferDTO marketModelId(Long marketModelId) {
    this.marketModelId = marketModelId;
    return this;
  }

   /**
   * Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
   * @return marketModelId
  **/
  @ApiModelProperty(value = "Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. ")
  public Long getMarketModelId() {
    return marketModelId;
  }

  public void setMarketModelId(Long marketModelId) {
    this.marketModelId = marketModelId;
  }

  public EnrichedMappingsOfferDTO marketModelName(String marketModelName) {
    this.marketModelName = marketModelName;
    return this;
  }

   /**
   * Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
   * @return marketModelName
  **/
  @ApiModelProperty(value = "Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. ")
  public String getMarketModelName() {
    return marketModelName;
  }

  public void setMarketModelName(String marketModelName) {
    this.marketModelName = marketModelName;
  }

  public EnrichedMappingsOfferDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

   /**
   * SKU на Маркете.
   * @return marketSku
  **/
  @ApiModelProperty(value = "SKU на Маркете.")
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public EnrichedMappingsOfferDTO marketSkuName(String marketSkuName) {
    this.marketSkuName = marketSkuName;
    return this;
  }

   /**
   * Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. 
   * @return marketSkuName
  **/
  @ApiModelProperty(value = "Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. ")
  public String getMarketSkuName() {
    return marketSkuName;
  }

  public void setMarketSkuName(String marketSkuName) {
    this.marketSkuName = marketSkuName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrichedMappingsOfferDTO enrichedMappingsOfferDTO = (EnrichedMappingsOfferDTO) o;
    return Objects.equals(this.name, enrichedMappingsOfferDTO.name) &&
        Objects.equals(this.shopSku, enrichedMappingsOfferDTO.shopSku) &&
        Objects.equals(this.category, enrichedMappingsOfferDTO.category) &&
        Objects.equals(this.vendor, enrichedMappingsOfferDTO.vendor) &&
        Objects.equals(this.vendorCode, enrichedMappingsOfferDTO.vendorCode) &&
        Objects.equals(this.description, enrichedMappingsOfferDTO.description) &&
        Objects.equals(this.id, enrichedMappingsOfferDTO.id) &&
        Objects.equals(this.feedId, enrichedMappingsOfferDTO.feedId) &&
        Objects.equals(this.barcodes, enrichedMappingsOfferDTO.barcodes) &&
        Objects.equals(this.urls, enrichedMappingsOfferDTO.urls) &&
        Objects.equals(this.pictures, enrichedMappingsOfferDTO.pictures) &&
        Objects.equals(this.manufacturer, enrichedMappingsOfferDTO.manufacturer) &&
        Objects.equals(this.manufacturerCountries, enrichedMappingsOfferDTO.manufacturerCountries) &&
        Objects.equals(this.minShipment, enrichedMappingsOfferDTO.minShipment) &&
        Objects.equals(this.transportUnitSize, enrichedMappingsOfferDTO.transportUnitSize) &&
        Objects.equals(this.quantumOfSupply, enrichedMappingsOfferDTO.quantumOfSupply) &&
        Objects.equals(this.deliveryDurationDays, enrichedMappingsOfferDTO.deliveryDurationDays) &&
        Objects.equals(this.boxCount, enrichedMappingsOfferDTO.boxCount) &&
        Objects.equals(this.customsCommodityCodes, enrichedMappingsOfferDTO.customsCommodityCodes) &&
        Objects.equals(this.weightDimensions, enrichedMappingsOfferDTO.weightDimensions) &&
        Objects.equals(this.supplyScheduleDays, enrichedMappingsOfferDTO.supplyScheduleDays) &&
        Objects.equals(this.shelfLifeDays, enrichedMappingsOfferDTO.shelfLifeDays) &&
        Objects.equals(this.lifeTimeDays, enrichedMappingsOfferDTO.lifeTimeDays) &&
        Objects.equals(this.guaranteePeriodDays, enrichedMappingsOfferDTO.guaranteePeriodDays) &&
        Objects.equals(this.processingState, enrichedMappingsOfferDTO.processingState) &&
        Objects.equals(this.availability, enrichedMappingsOfferDTO.availability) &&
        Objects.equals(this.shelfLife, enrichedMappingsOfferDTO.shelfLife) &&
        Objects.equals(this.lifeTime, enrichedMappingsOfferDTO.lifeTime) &&
        Objects.equals(this.guaranteePeriod, enrichedMappingsOfferDTO.guaranteePeriod) &&
        Objects.equals(this.certificate, enrichedMappingsOfferDTO.certificate) &&
        Objects.equals(this.price, enrichedMappingsOfferDTO.price) &&
        Objects.equals(this.marketCategoryId, enrichedMappingsOfferDTO.marketCategoryId) &&
        Objects.equals(this.marketCategoryName, enrichedMappingsOfferDTO.marketCategoryName) &&
        Objects.equals(this.marketModelId, enrichedMappingsOfferDTO.marketModelId) &&
        Objects.equals(this.marketModelName, enrichedMappingsOfferDTO.marketModelName) &&
        Objects.equals(this.marketSku, enrichedMappingsOfferDTO.marketSku) &&
        Objects.equals(this.marketSkuName, enrichedMappingsOfferDTO.marketSkuName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shopSku, category, vendor, vendorCode, description, id, feedId, barcodes, urls, pictures, manufacturer, manufacturerCountries, minShipment, transportUnitSize, quantumOfSupply, deliveryDurationDays, boxCount, customsCommodityCodes, weightDimensions, supplyScheduleDays, shelfLifeDays, lifeTimeDays, guaranteePeriodDays, processingState, availability, shelfLife, lifeTime, guaranteePeriod, certificate, price, marketCategoryId, marketCategoryName, marketModelId, marketModelName, marketSku, marketSkuName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichedMappingsOfferDTO {\n");
    
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
    sb.append("    marketCategoryId: ").append(toIndentedString(marketCategoryId)).append("\n");
    sb.append("    marketCategoryName: ").append(toIndentedString(marketCategoryName)).append("\n");
    sb.append("    marketModelId: ").append(toIndentedString(marketModelId)).append("\n");
    sb.append("    marketModelName: ").append(toIndentedString(marketModelName)).append("\n");
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    marketSkuName: ").append(toIndentedString(marketSkuName)).append("\n");
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

