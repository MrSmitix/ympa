package apimodels;

import apimodels.AgeDTO;
import apimodels.GetPriceDTO;
import apimodels.GetPriceWithDiscountDTO;
import apimodels.OfferCampaignStatusDTO;
import apimodels.OfferCardStatusType;
import apimodels.OfferConditionDTO;
import apimodels.OfferManualDTO;
import apimodels.OfferParamDTO;
import apimodels.OfferSellingProgramDTO;
import apimodels.OfferType;
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
 * Параметры товара.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetOfferDTO   {
  @JsonProperty("offerId")
  @NotNull
@Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("name")
  @Size(max=256)

  private String name;

  @JsonProperty("marketCategoryId")
  
  private Long marketCategoryId;

  @JsonProperty("category")
  
  private String category;

  @JsonProperty("pictures")
  
  private List<String> pictures = null;

  @JsonProperty("videos")
  @Size(max=6)

  private List<String> videos = null;

  @JsonProperty("manuals")
  @Size(max=6)
@Valid

  private List<@Valid OfferManualDTO> manuals = null;

  @JsonProperty("vendor")
  
  private String vendor;

  @JsonProperty("barcodes")
  
  private List<String> barcodes = null;

  @JsonProperty("description")
  @Size(max=6000)

  private String description;

  @JsonProperty("manufacturerCountries")
  
  private List<String> manufacturerCountries = null;

  @JsonProperty("weightDimensions")
  @Valid

  private OfferWeightDimensionsDTO weightDimensions;

  @JsonProperty("vendorCode")
  
  private String vendorCode;

  @JsonProperty("tags")
  
  private List<String> tags = null;

  @JsonProperty("shelfLife")
  @Valid

  private TimePeriodDTO shelfLife;

  @JsonProperty("lifeTime")
  @Valid

  private TimePeriodDTO lifeTime;

  @JsonProperty("guaranteePeriod")
  @Valid

  private TimePeriodDTO guaranteePeriod;

  @JsonProperty("customsCommodityCode")
  
  private String customsCommodityCode;

  @JsonProperty("certificates")
  
  private List<String> certificates = null;

  @JsonProperty("boxCount")
  
  private Integer boxCount;

  @JsonProperty("condition")
  @Valid

  private OfferConditionDTO condition;

  @JsonProperty("type")
  @Valid

  private OfferType type;

  @JsonProperty("downloadable")
  
  private Boolean downloadable;

  @JsonProperty("adult")
  
  private Boolean adult;

  @JsonProperty("age")
  @Valid

  private AgeDTO age;

  @JsonProperty("params")
  @Valid

  private List<@Valid OfferParamDTO> params = null;

  @JsonProperty("basicPrice")
  @Valid

  private GetPriceWithDiscountDTO basicPrice;

  @JsonProperty("purchasePrice")
  @Valid

  private GetPriceDTO purchasePrice;

  @JsonProperty("additionalExpenses")
  @Valid

  private GetPriceDTO additionalExpenses;

  @JsonProperty("cofinancePrice")
  @Valid

  private GetPriceDTO cofinancePrice;

  @JsonProperty("cardStatus")
  @Valid

  private OfferCardStatusType cardStatus;

  @JsonProperty("campaigns")
  @Valid

  private List<@Valid OfferCampaignStatusDTO> campaigns = null;

  @JsonProperty("sellingPrograms")
  @Valid

  private List<@Valid OfferSellingProgramDTO> sellingPrograms = null;

  @JsonProperty("archived")
  
  private Boolean archived;

  public GetOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public GetOfferDTO name(String name) {
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

  public GetOfferDTO marketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
    return this;
  }

   /**
   * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
   * @return marketCategoryId
  **/
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }

  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  public GetOfferDTO category(String category) {
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

  public GetOfferDTO pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  public GetOfferDTO addPicturesItem(String picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
   * @return pictures
  **/
  public List<String> getPictures() {
    return pictures;
  }

  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

  public GetOfferDTO videos(List<String> videos) {
    this.videos = videos;
    return this;
  }

  public GetOfferDTO addVideosItem(String videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
   * @return videos
  **/
  public List<String> getVideos() {
    return videos;
  }

  public void setVideos(List<String> videos) {
    this.videos = videos;
  }

  public GetOfferDTO manuals(List<@Valid OfferManualDTO> manuals) {
    this.manuals = manuals;
    return this;
  }

  public GetOfferDTO addManualsItem(OfferManualDTO manualsItem) {
    if (this.manuals == null) {
      this.manuals = new ArrayList<>();
    }
    this.manuals.add(manualsItem);
    return this;
  }

   /**
   * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
   * @return manuals
  **/
  public List<@Valid OfferManualDTO> getManuals() {
    return manuals;
  }

  public void setManuals(List<@Valid OfferManualDTO> manuals) {
    this.manuals = manuals;
  }

  public GetOfferDTO vendor(String vendor) {
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

  public GetOfferDTO barcodes(List<String> barcodes) {
    this.barcodes = barcodes;
    return this;
  }

  public GetOfferDTO addBarcodesItem(String barcodesItem) {
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

  public GetOfferDTO description(String description) {
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

  public GetOfferDTO manufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
    return this;
  }

  public GetOfferDTO addManufacturerCountriesItem(String manufacturerCountriesItem) {
    if (this.manufacturerCountries == null) {
      this.manufacturerCountries = new ArrayList<>();
    }
    this.manufacturerCountries.add(manufacturerCountriesItem);
    return this;
  }

   /**
   * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
   * @return manufacturerCountries
  **/
  public List<String> getManufacturerCountries() {
    return manufacturerCountries;
  }

  public void setManufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

  public GetOfferDTO weightDimensions(OfferWeightDimensionsDTO weightDimensions) {
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

  public GetOfferDTO vendorCode(String vendorCode) {
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

  public GetOfferDTO tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GetOfferDTO addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
   * @return tags
  **/
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public GetOfferDTO shelfLife(TimePeriodDTO shelfLife) {
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

  public GetOfferDTO lifeTime(TimePeriodDTO lifeTime) {
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

  public GetOfferDTO guaranteePeriod(TimePeriodDTO guaranteePeriod) {
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

  public GetOfferDTO customsCommodityCode(String customsCommodityCode) {
    this.customsCommodityCode = customsCommodityCode;
    return this;
  }

   /**
   * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
   * @return customsCommodityCode
  **/
  public String getCustomsCommodityCode() {
    return customsCommodityCode;
  }

  public void setCustomsCommodityCode(String customsCommodityCode) {
    this.customsCommodityCode = customsCommodityCode;
  }

  public GetOfferDTO certificates(List<String> certificates) {
    this.certificates = certificates;
    return this;
  }

  public GetOfferDTO addCertificatesItem(String certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
   * @return certificates
  **/
  public List<String> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<String> certificates) {
    this.certificates = certificates;
  }

  public GetOfferDTO boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

   /**
   * Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
   * @return boxCount
  **/
  public Integer getBoxCount() {
    return boxCount;
  }

  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  public GetOfferDTO condition(OfferConditionDTO condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  public OfferConditionDTO getCondition() {
    return condition;
  }

  public void setCondition(OfferConditionDTO condition) {
    this.condition = condition;
  }

  public GetOfferDTO type(OfferType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public OfferType getType() {
    return type;
  }

  public void setType(OfferType type) {
    this.type = type;
  }

  public GetOfferDTO downloadable(Boolean downloadable) {
    this.downloadable = downloadable;
    return this;
  }

   /**
   * Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
   * @return downloadable
  **/
  public Boolean getDownloadable() {
    return downloadable;
  }

  public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }

  public GetOfferDTO adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

   /**
   * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
   * @return adult
  **/
  public Boolean getAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public GetOfferDTO age(AgeDTO age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  public AgeDTO getAge() {
    return age;
  }

  public void setAge(AgeDTO age) {
    this.age = age;
  }

  public GetOfferDTO params(List<@Valid OfferParamDTO> params) {
    this.params = params;
    return this;
  }

  public GetOfferDTO addParamsItem(OfferParamDTO paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
   * @return params
  **/
  public List<@Valid OfferParamDTO> getParams() {
    return params;
  }

  public void setParams(List<@Valid OfferParamDTO> params) {
    this.params = params;
  }

  public GetOfferDTO basicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
    return this;
  }

   /**
   * Get basicPrice
   * @return basicPrice
  **/
  public GetPriceWithDiscountDTO getBasicPrice() {
    return basicPrice;
  }

  public void setBasicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
  }

  public GetOfferDTO purchasePrice(GetPriceDTO purchasePrice) {
    this.purchasePrice = purchasePrice;
    return this;
  }

   /**
   * Get purchasePrice
   * @return purchasePrice
  **/
  public GetPriceDTO getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(GetPriceDTO purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public GetOfferDTO additionalExpenses(GetPriceDTO additionalExpenses) {
    this.additionalExpenses = additionalExpenses;
    return this;
  }

   /**
   * Get additionalExpenses
   * @return additionalExpenses
  **/
  public GetPriceDTO getAdditionalExpenses() {
    return additionalExpenses;
  }

  public void setAdditionalExpenses(GetPriceDTO additionalExpenses) {
    this.additionalExpenses = additionalExpenses;
  }

  public GetOfferDTO cofinancePrice(GetPriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
    return this;
  }

   /**
   * Get cofinancePrice
   * @return cofinancePrice
  **/
  public GetPriceDTO getCofinancePrice() {
    return cofinancePrice;
  }

  public void setCofinancePrice(GetPriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
  }

  public GetOfferDTO cardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

   /**
   * Get cardStatus
   * @return cardStatus
  **/
  public OfferCardStatusType getCardStatus() {
    return cardStatus;
  }

  public void setCardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
  }

  public GetOfferDTO campaigns(List<@Valid OfferCampaignStatusDTO> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public GetOfferDTO addCampaignsItem(OfferCampaignStatusDTO campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * Список магазинов, в которых размещен товар. 
   * @return campaigns
  **/
  public List<@Valid OfferCampaignStatusDTO> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<@Valid OfferCampaignStatusDTO> campaigns) {
    this.campaigns = campaigns;
  }

  public GetOfferDTO sellingPrograms(List<@Valid OfferSellingProgramDTO> sellingPrograms) {
    this.sellingPrograms = sellingPrograms;
    return this;
  }

  public GetOfferDTO addSellingProgramsItem(OfferSellingProgramDTO sellingProgramsItem) {
    if (this.sellingPrograms == null) {
      this.sellingPrograms = new ArrayList<>();
    }
    this.sellingPrograms.add(sellingProgramsItem);
    return this;
  }

   /**
   * Информация о том, какие для товара доступны модели размещения. 
   * @return sellingPrograms
  **/
  public List<@Valid OfferSellingProgramDTO> getSellingPrograms() {
    return sellingPrograms;
  }

  public void setSellingPrograms(List<@Valid OfferSellingProgramDTO> sellingPrograms) {
    this.sellingPrograms = sellingPrograms;
  }

  public GetOfferDTO archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Товар помещен в архив. 
   * @return archived
  **/
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferDTO getOfferDTO = (GetOfferDTO) o;
    return Objects.equals(offerId, getOfferDTO.offerId) &&
        Objects.equals(name, getOfferDTO.name) &&
        Objects.equals(marketCategoryId, getOfferDTO.marketCategoryId) &&
        Objects.equals(category, getOfferDTO.category) &&
        Objects.equals(pictures, getOfferDTO.pictures) &&
        Objects.equals(videos, getOfferDTO.videos) &&
        Objects.equals(manuals, getOfferDTO.manuals) &&
        Objects.equals(vendor, getOfferDTO.vendor) &&
        Objects.equals(barcodes, getOfferDTO.barcodes) &&
        Objects.equals(description, getOfferDTO.description) &&
        Objects.equals(manufacturerCountries, getOfferDTO.manufacturerCountries) &&
        Objects.equals(weightDimensions, getOfferDTO.weightDimensions) &&
        Objects.equals(vendorCode, getOfferDTO.vendorCode) &&
        Objects.equals(tags, getOfferDTO.tags) &&
        Objects.equals(shelfLife, getOfferDTO.shelfLife) &&
        Objects.equals(lifeTime, getOfferDTO.lifeTime) &&
        Objects.equals(guaranteePeriod, getOfferDTO.guaranteePeriod) &&
        Objects.equals(customsCommodityCode, getOfferDTO.customsCommodityCode) &&
        Objects.equals(certificates, getOfferDTO.certificates) &&
        Objects.equals(boxCount, getOfferDTO.boxCount) &&
        Objects.equals(condition, getOfferDTO.condition) &&
        Objects.equals(type, getOfferDTO.type) &&
        Objects.equals(downloadable, getOfferDTO.downloadable) &&
        Objects.equals(adult, getOfferDTO.adult) &&
        Objects.equals(age, getOfferDTO.age) &&
        Objects.equals(params, getOfferDTO.params) &&
        Objects.equals(basicPrice, getOfferDTO.basicPrice) &&
        Objects.equals(purchasePrice, getOfferDTO.purchasePrice) &&
        Objects.equals(additionalExpenses, getOfferDTO.additionalExpenses) &&
        Objects.equals(cofinancePrice, getOfferDTO.cofinancePrice) &&
        Objects.equals(cardStatus, getOfferDTO.cardStatus) &&
        Objects.equals(campaigns, getOfferDTO.campaigns) &&
        Objects.equals(sellingPrograms, getOfferDTO.sellingPrograms) &&
        Objects.equals(archived, getOfferDTO.archived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, name, marketCategoryId, category, pictures, videos, manuals, vendor, barcodes, description, manufacturerCountries, weightDimensions, vendorCode, tags, shelfLife, lifeTime, guaranteePeriod, customsCommodityCode, certificates, boxCount, condition, type, downloadable, adult, age, params, basicPrice, purchasePrice, additionalExpenses, cofinancePrice, cardStatus, campaigns, sellingPrograms, archived);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    marketCategoryId: ").append(toIndentedString(marketCategoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    manuals: ").append(toIndentedString(manuals)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    barcodes: ").append(toIndentedString(barcodes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    manufacturerCountries: ").append(toIndentedString(manufacturerCountries)).append("\n");
    sb.append("    weightDimensions: ").append(toIndentedString(weightDimensions)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    shelfLife: ").append(toIndentedString(shelfLife)).append("\n");
    sb.append("    lifeTime: ").append(toIndentedString(lifeTime)).append("\n");
    sb.append("    guaranteePeriod: ").append(toIndentedString(guaranteePeriod)).append("\n");
    sb.append("    customsCommodityCode: ").append(toIndentedString(customsCommodityCode)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    boxCount: ").append(toIndentedString(boxCount)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    basicPrice: ").append(toIndentedString(basicPrice)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    additionalExpenses: ").append(toIndentedString(additionalExpenses)).append("\n");
    sb.append("    cofinancePrice: ").append(toIndentedString(cofinancePrice)).append("\n");
    sb.append("    cardStatus: ").append(toIndentedString(cardStatus)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    sellingPrograms: ").append(toIndentedString(sellingPrograms)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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

