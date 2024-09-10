package apimodels;

import apimodels.DayOfWeekType;
import apimodels.OfferAvailabilityStatusType;
import apimodels.OfferProcessingStateDTO;
import apimodels.OfferWeightDimensionsDTO;
import apimodels.TimePeriodDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Базовая информация о товарах в каталоге.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MappingsOfferInfoDTO   {
  @JsonProperty("name")
  @Size(max=256)

  private String name;

  @JsonProperty("shopSku")
  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String shopSku;

  @JsonProperty("category")
  
  private String category;

  @JsonProperty("vendor")
  
  private String vendor;

  @JsonProperty("vendorCode")
  
  private String vendorCode;

  @JsonProperty("description")
  @Size(max=6000)

  private String description;

  @JsonProperty("id")
  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

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
  @Valid

  private OfferWeightDimensionsDTO weightDimensions;

  @JsonProperty("supplyScheduleDays")
  @Valid

  private List<DayOfWeekType> supplyScheduleDays = null;

  @JsonProperty("shelfLifeDays")
  
  private Integer shelfLifeDays;

  @JsonProperty("lifeTimeDays")
  
  private Integer lifeTimeDays;

  @JsonProperty("guaranteePeriodDays")
  
  private Integer guaranteePeriodDays;

  @JsonProperty("processingState")
  @Valid

  private OfferProcessingStateDTO processingState;

  @JsonProperty("availability")
  @Valid

  private OfferAvailabilityStatusType availability;

  @JsonProperty("shelfLife")
  @Valid

  private TimePeriodDTO shelfLife;

  @JsonProperty("lifeTime")
  @Valid

  private TimePeriodDTO lifeTime;

  @JsonProperty("guaranteePeriod")
  @Valid

  private TimePeriodDTO guaranteePeriod;

  @JsonProperty("certificate")
  
  private String certificate;

  public MappingsOfferInfoDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MappingsOfferInfoDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
  **/
  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public MappingsOfferInfoDTO category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
   * @return category
  **/
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public MappingsOfferInfoDTO vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
   * @return vendor
  **/
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public MappingsOfferInfoDTO vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

   /**
   * Артикул товара от производителя.
   * @return vendorCode
  **/
  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  public MappingsOfferInfoDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MappingsOfferInfoDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MappingsOfferInfoDTO feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Идентификатор фида.
   * @return feedId
  **/
  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public MappingsOfferInfoDTO barcodes(List<String> barcodes) {
    this.barcodes = barcodes;
    return this;
  }

  public MappingsOfferInfoDTO addBarcodesItem(String barcodesItem) {
    if (this.barcodes == null) {
      this.barcodes = new ArrayList<>();
    }
    this.barcodes.add(barcodesItem);
    return this;
  }

   /**
   * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
   * @return barcodes
  **/
  public List<String> getBarcodes() {
    return barcodes;
  }

  public void setBarcodes(List<String> barcodes) {
    this.barcodes = barcodes;
  }

  public MappingsOfferInfoDTO urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public MappingsOfferInfoDTO addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
   * @return urls
  **/
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  public MappingsOfferInfoDTO pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  public MappingsOfferInfoDTO addPicturesItem(String picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
   * @return pictures
  **/
  public List<String> getPictures() {
    return pictures;
  }

  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

  public MappingsOfferInfoDTO manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
   * @return manufacturer
  **/
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public MappingsOfferInfoDTO manufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
    return this;
  }

  public MappingsOfferInfoDTO addManufacturerCountriesItem(String manufacturerCountriesItem) {
    if (this.manufacturerCountries == null) {
      this.manufacturerCountries = new ArrayList<>();
    }
    this.manufacturerCountries.add(manufacturerCountriesItem);
    return this;
  }

   /**
   * Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
   * @return manufacturerCountries
  **/
  public List<String> getManufacturerCountries() {
    return manufacturerCountries;
  }

  public void setManufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

  public MappingsOfferInfoDTO minShipment(Integer minShipment) {
    this.minShipment = minShipment;
    return this;
  }

   /**
   * Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
   * @return minShipment
  **/
  public Integer getMinShipment() {
    return minShipment;
  }

  public void setMinShipment(Integer minShipment) {
    this.minShipment = minShipment;
  }

  public MappingsOfferInfoDTO transportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
    return this;
  }

   /**
   * Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
   * @return transportUnitSize
  **/
  public Integer getTransportUnitSize() {
    return transportUnitSize;
  }

  public void setTransportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
  }

  public MappingsOfferInfoDTO quantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
    return this;
  }

   /**
   * Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
   * @return quantumOfSupply
  **/
  public Integer getQuantumOfSupply() {
    return quantumOfSupply;
  }

  public void setQuantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
  }

  public MappingsOfferInfoDTO deliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
    return this;
  }

   /**
   * Срок, за который продавец поставляет товары на склад, в днях.
   * @return deliveryDurationDays
  **/
  public Integer getDeliveryDurationDays() {
    return deliveryDurationDays;
  }

  public void setDeliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
  }

  public MappingsOfferInfoDTO boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

   /**
   * Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
   * @return boxCount
  **/
  public Integer getBoxCount() {
    return boxCount;
  }

  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  public MappingsOfferInfoDTO customsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
    return this;
  }

  public MappingsOfferInfoDTO addCustomsCommodityCodesItem(String customsCommodityCodesItem) {
    if (this.customsCommodityCodes == null) {
      this.customsCommodityCodes = new ArrayList<>();
    }
    this.customsCommodityCodes.add(customsCommodityCodesItem);
    return this;
  }

   /**
   * Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
   * @return customsCommodityCodes
  **/
  public List<String> getCustomsCommodityCodes() {
    return customsCommodityCodes;
  }

  public void setCustomsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
  }

  public MappingsOfferInfoDTO weightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
    return this;
  }

   /**
   * Get weightDimensions
   * @return weightDimensions
  **/
  public OfferWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }

  public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  public MappingsOfferInfoDTO supplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
    return this;
  }

  public MappingsOfferInfoDTO addSupplyScheduleDaysItem(DayOfWeekType supplyScheduleDaysItem) {
    if (this.supplyScheduleDays == null) {
      this.supplyScheduleDays = new ArrayList<>();
    }
    this.supplyScheduleDays.add(supplyScheduleDaysItem);
    return this;
  }

   /**
   * Дни недели, в которые продавец поставляет товары на склад.
   * @return supplyScheduleDays
  **/
  public List<DayOfWeekType> getSupplyScheduleDays() {
    return supplyScheduleDays;
  }

  public void setSupplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
  }

  public MappingsOfferInfoDTO shelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
   * @return shelfLifeDays
  **/
  public Integer getShelfLifeDays() {
    return shelfLifeDays;
  }

  public void setShelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
  }

  public MappingsOfferInfoDTO lifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
   * @return lifeTimeDays
  **/
  public Integer getLifeTimeDays() {
    return lifeTimeDays;
  }

  public void setLifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
  }

  public MappingsOfferInfoDTO guaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
    return this;
  }

   /**
   * Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
   * @return guaranteePeriodDays
  **/
  public Integer getGuaranteePeriodDays() {
    return guaranteePeriodDays;
  }

  public void setGuaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
  }

  public MappingsOfferInfoDTO processingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
    return this;
  }

   /**
   * Get processingState
   * @return processingState
  **/
  public OfferProcessingStateDTO getProcessingState() {
    return processingState;
  }

  public void setProcessingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
  }

  public MappingsOfferInfoDTO availability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  public OfferAvailabilityStatusType getAvailability() {
    return availability;
  }

  public void setAvailability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
  }

  public MappingsOfferInfoDTO shelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
    return this;
  }

   /**
   * Get shelfLife
   * @return shelfLife
  **/
  public TimePeriodDTO getShelfLife() {
    return shelfLife;
  }

  public void setShelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
  }

  public MappingsOfferInfoDTO lifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
    return this;
  }

   /**
   * Get lifeTime
   * @return lifeTime
  **/
  public TimePeriodDTO getLifeTime() {
    return lifeTime;
  }

  public void setLifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
  }

  public MappingsOfferInfoDTO guaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
    return this;
  }

   /**
   * Get guaranteePeriod
   * @return guaranteePeriod
  **/
  public TimePeriodDTO getGuaranteePeriod() {
    return guaranteePeriod;
  }

  public void setGuaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
  }

  public MappingsOfferInfoDTO certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
   * @return certificate
  **/
  public String getCertificate() {
    return certificate;
  }

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
    return Objects.equals(name, mappingsOfferInfoDTO.name) &&
        Objects.equals(shopSku, mappingsOfferInfoDTO.shopSku) &&
        Objects.equals(category, mappingsOfferInfoDTO.category) &&
        Objects.equals(vendor, mappingsOfferInfoDTO.vendor) &&
        Objects.equals(vendorCode, mappingsOfferInfoDTO.vendorCode) &&
        Objects.equals(description, mappingsOfferInfoDTO.description) &&
        Objects.equals(id, mappingsOfferInfoDTO.id) &&
        Objects.equals(feedId, mappingsOfferInfoDTO.feedId) &&
        Objects.equals(barcodes, mappingsOfferInfoDTO.barcodes) &&
        Objects.equals(urls, mappingsOfferInfoDTO.urls) &&
        Objects.equals(pictures, mappingsOfferInfoDTO.pictures) &&
        Objects.equals(manufacturer, mappingsOfferInfoDTO.manufacturer) &&
        Objects.equals(manufacturerCountries, mappingsOfferInfoDTO.manufacturerCountries) &&
        Objects.equals(minShipment, mappingsOfferInfoDTO.minShipment) &&
        Objects.equals(transportUnitSize, mappingsOfferInfoDTO.transportUnitSize) &&
        Objects.equals(quantumOfSupply, mappingsOfferInfoDTO.quantumOfSupply) &&
        Objects.equals(deliveryDurationDays, mappingsOfferInfoDTO.deliveryDurationDays) &&
        Objects.equals(boxCount, mappingsOfferInfoDTO.boxCount) &&
        Objects.equals(customsCommodityCodes, mappingsOfferInfoDTO.customsCommodityCodes) &&
        Objects.equals(weightDimensions, mappingsOfferInfoDTO.weightDimensions) &&
        Objects.equals(supplyScheduleDays, mappingsOfferInfoDTO.supplyScheduleDays) &&
        Objects.equals(shelfLifeDays, mappingsOfferInfoDTO.shelfLifeDays) &&
        Objects.equals(lifeTimeDays, mappingsOfferInfoDTO.lifeTimeDays) &&
        Objects.equals(guaranteePeriodDays, mappingsOfferInfoDTO.guaranteePeriodDays) &&
        Objects.equals(processingState, mappingsOfferInfoDTO.processingState) &&
        Objects.equals(availability, mappingsOfferInfoDTO.availability) &&
        Objects.equals(shelfLife, mappingsOfferInfoDTO.shelfLife) &&
        Objects.equals(lifeTime, mappingsOfferInfoDTO.lifeTime) &&
        Objects.equals(guaranteePeriod, mappingsOfferInfoDTO.guaranteePeriod) &&
        Objects.equals(certificate, mappingsOfferInfoDTO.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shopSku, category, vendor, vendorCode, description, id, feedId, barcodes, urls, pictures, manufacturer, manufacturerCountries, minShipment, transportUnitSize, quantumOfSupply, deliveryDurationDays, boxCount, customsCommodityCodes, weightDimensions, supplyScheduleDays, shelfLifeDays, lifeTimeDays, guaranteePeriodDays, processingState, availability, shelfLife, lifeTime, guaranteePeriod, certificate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

