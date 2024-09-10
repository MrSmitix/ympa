package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AgeDTO;
import org.openapitools.model.OfferConditionDTO;
import org.openapitools.model.OfferManualDTO;
import org.openapitools.model.OfferParamDTO;
import org.openapitools.model.OfferType;
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
 * Основные параметры товара.
 */

@Schema(name = "BaseOfferDTO", description = "Основные параметры товара.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BaseOfferDTO {

  private String offerId;

  private String name;

  private Long marketCategoryId;

  private String category;

  @Valid
  private JsonNullable<List<String>> pictures = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> videos = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<@Valid OfferManualDTO>> manuals = JsonNullable.<List<@Valid OfferManualDTO>>undefined();

  private String vendor;

  @Valid
  private JsonNullable<List<String>> barcodes = JsonNullable.<List<String>>undefined();

  private String description;

  @Valid
  private JsonNullable<List<String>> manufacturerCountries = JsonNullable.<List<String>>undefined();

  private OfferWeightDimensionsDTO weightDimensions;

  private String vendorCode;

  @Valid
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  private TimePeriodDTO shelfLife;

  private TimePeriodDTO lifeTime;

  private TimePeriodDTO guaranteePeriod;

  private String customsCommodityCode;

  @Valid
  private JsonNullable<List<String>> certificates = JsonNullable.<List<String>>undefined();

  private Integer boxCount;

  private OfferConditionDTO condition;

  private OfferType type;

  private Boolean downloadable;

  private Boolean adult;

  private AgeDTO age;

  @Deprecated
  @Valid
  private JsonNullable<List<@Valid OfferParamDTO>> params = JsonNullable.<List<@Valid OfferParamDTO>>undefined();

  public BaseOfferDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BaseOfferDTO(String offerId) {
    this.offerId = offerId;
  }

  public BaseOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @NotNull @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public BaseOfferDTO name(String name) {
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

  public BaseOfferDTO marketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
    return this;
  }

  /**
   * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
   * @return marketCategoryId
   */
  
  @Schema(name = "marketCategoryId", description = "Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketCategoryId")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }

  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  public BaseOfferDTO category(String category) {
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

  public BaseOfferDTO pictures(List<String> pictures) {
    this.pictures = JsonNullable.of(pictures);
    return this;
  }

  public BaseOfferDTO addPicturesItem(String picturesItem) {
    if (this.pictures == null || !this.pictures.isPresent()) {
      this.pictures = JsonNullable.of(new ArrayList<>());
    }
    this.pictures.get().add(picturesItem);
    return this;
  }

  /**
   * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
   * @return pictures
   */
  
  @Schema(name = "pictures", description = "Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pictures")
  public JsonNullable<List<String>> getPictures() {
    return pictures;
  }

  public void setPictures(JsonNullable<List<String>> pictures) {
    this.pictures = pictures;
  }

  public BaseOfferDTO videos(List<String> videos) {
    this.videos = JsonNullable.of(videos);
    return this;
  }

  public BaseOfferDTO addVideosItem(String videosItem) {
    if (this.videos == null || !this.videos.isPresent()) {
      this.videos = JsonNullable.of(new ArrayList<>());
    }
    this.videos.get().add(videosItem);
    return this;
  }

  /**
   * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
   * @return videos
   */
  @Size(max = 6) 
  @Schema(name = "videos", description = "Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("videos")
  public JsonNullable<List<String>> getVideos() {
    return videos;
  }

  public void setVideos(JsonNullable<List<String>> videos) {
    this.videos = videos;
  }

  public BaseOfferDTO manuals(List<@Valid OfferManualDTO> manuals) {
    this.manuals = JsonNullable.of(manuals);
    return this;
  }

  public BaseOfferDTO addManualsItem(OfferManualDTO manualsItem) {
    if (this.manuals == null || !this.manuals.isPresent()) {
      this.manuals = JsonNullable.of(new ArrayList<>());
    }
    this.manuals.get().add(manualsItem);
    return this;
  }

  /**
   * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
   * @return manuals
   */
  @Valid @Size(max = 6) 
  @Schema(name = "manuals", description = "Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manuals")
  public JsonNullable<List<@Valid OfferManualDTO>> getManuals() {
    return manuals;
  }

  public void setManuals(JsonNullable<List<@Valid OfferManualDTO>> manuals) {
    this.manuals = manuals;
  }

  public BaseOfferDTO vendor(String vendor) {
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

  public BaseOfferDTO barcodes(List<String> barcodes) {
    this.barcodes = JsonNullable.of(barcodes);
    return this;
  }

  public BaseOfferDTO addBarcodesItem(String barcodesItem) {
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

  public BaseOfferDTO description(String description) {
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

  public BaseOfferDTO manufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = JsonNullable.of(manufacturerCountries);
    return this;
  }

  public BaseOfferDTO addManufacturerCountriesItem(String manufacturerCountriesItem) {
    if (this.manufacturerCountries == null || !this.manufacturerCountries.isPresent()) {
      this.manufacturerCountries = JsonNullable.of(new ArrayList<>());
    }
    this.manufacturerCountries.get().add(manufacturerCountriesItem);
    return this;
  }

  /**
   * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
   * @return manufacturerCountries
   */
  
  @Schema(name = "manufacturerCountries", description = "Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manufacturerCountries")
  public JsonNullable<List<String>> getManufacturerCountries() {
    return manufacturerCountries;
  }

  public void setManufacturerCountries(JsonNullable<List<String>> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

  public BaseOfferDTO weightDimensions(OfferWeightDimensionsDTO weightDimensions) {
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

  public BaseOfferDTO vendorCode(String vendorCode) {
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

  public BaseOfferDTO tags(List<String> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public BaseOfferDTO addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.of(new ArrayList<>());
    }
    this.tags.get().add(tagsItem);
    return this;
  }

  /**
   * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
   * @return tags
   */
  
  @Schema(name = "tags", description = "Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public JsonNullable<List<String>> getTags() {
    return tags;
  }

  public void setTags(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public BaseOfferDTO shelfLife(TimePeriodDTO shelfLife) {
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

  public BaseOfferDTO lifeTime(TimePeriodDTO lifeTime) {
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

  public BaseOfferDTO guaranteePeriod(TimePeriodDTO guaranteePeriod) {
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

  public BaseOfferDTO customsCommodityCode(String customsCommodityCode) {
    this.customsCommodityCode = customsCommodityCode;
    return this;
  }

  /**
   * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
   * @return customsCommodityCode
   */
  
  @Schema(name = "customsCommodityCode", example = "8517610008", description = "Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customsCommodityCode")
  public String getCustomsCommodityCode() {
    return customsCommodityCode;
  }

  public void setCustomsCommodityCode(String customsCommodityCode) {
    this.customsCommodityCode = customsCommodityCode;
  }

  public BaseOfferDTO certificates(List<String> certificates) {
    this.certificates = JsonNullable.of(certificates);
    return this;
  }

  public BaseOfferDTO addCertificatesItem(String certificatesItem) {
    if (this.certificates == null || !this.certificates.isPresent()) {
      this.certificates = JsonNullable.of(new ArrayList<>());
    }
    this.certificates.get().add(certificatesItem);
    return this;
  }

  /**
   * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
   * @return certificates
   */
  
  @Schema(name = "certificates", description = "Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificates")
  public JsonNullable<List<String>> getCertificates() {
    return certificates;
  }

  public void setCertificates(JsonNullable<List<String>> certificates) {
    this.certificates = certificates;
  }

  public BaseOfferDTO boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

  /**
   * Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
   * @return boxCount
   */
  
  @Schema(name = "boxCount", description = "Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boxCount")
  public Integer getBoxCount() {
    return boxCount;
  }

  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  public BaseOfferDTO condition(OfferConditionDTO condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @Valid 
  @Schema(name = "condition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("condition")
  public OfferConditionDTO getCondition() {
    return condition;
  }

  public void setCondition(OfferConditionDTO condition) {
    this.condition = condition;
  }

  public BaseOfferDTO type(OfferType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public OfferType getType() {
    return type;
  }

  public void setType(OfferType type) {
    this.type = type;
  }

  public BaseOfferDTO downloadable(Boolean downloadable) {
    this.downloadable = downloadable;
    return this;
  }

  /**
   * Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
   * @return downloadable
   */
  
  @Schema(name = "downloadable", description = "Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downloadable")
  public Boolean getDownloadable() {
    return downloadable;
  }

  public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }

  public BaseOfferDTO adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

  /**
   * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
   * @return adult
   */
  
  @Schema(name = "adult", description = "Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public BaseOfferDTO age(AgeDTO age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   */
  @Valid 
  @Schema(name = "age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age")
  public AgeDTO getAge() {
    return age;
  }

  public void setAge(AgeDTO age) {
    this.age = age;
  }

  public BaseOfferDTO params(List<@Valid OfferParamDTO> params) {
    this.params = JsonNullable.of(params);
    return this;
  }

  public BaseOfferDTO addParamsItem(OfferParamDTO paramsItem) {
    if (this.params == null || !this.params.isPresent()) {
      this.params = JsonNullable.of(new ArrayList<>());
    }
    this.params.get().add(paramsItem);
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
   * @return params
   * @deprecated
   */
  @Valid 
  @Schema(name = "params", description = "{% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("params")
  @Deprecated
  public JsonNullable<List<@Valid OfferParamDTO>> getParams() {
    return params;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setParams(JsonNullable<List<@Valid OfferParamDTO>> params) {
    this.params = params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseOfferDTO baseOfferDTO = (BaseOfferDTO) o;
    return Objects.equals(this.offerId, baseOfferDTO.offerId) &&
        Objects.equals(this.name, baseOfferDTO.name) &&
        Objects.equals(this.marketCategoryId, baseOfferDTO.marketCategoryId) &&
        Objects.equals(this.category, baseOfferDTO.category) &&
        equalsNullable(this.pictures, baseOfferDTO.pictures) &&
        equalsNullable(this.videos, baseOfferDTO.videos) &&
        equalsNullable(this.manuals, baseOfferDTO.manuals) &&
        Objects.equals(this.vendor, baseOfferDTO.vendor) &&
        equalsNullable(this.barcodes, baseOfferDTO.barcodes) &&
        Objects.equals(this.description, baseOfferDTO.description) &&
        equalsNullable(this.manufacturerCountries, baseOfferDTO.manufacturerCountries) &&
        Objects.equals(this.weightDimensions, baseOfferDTO.weightDimensions) &&
        Objects.equals(this.vendorCode, baseOfferDTO.vendorCode) &&
        equalsNullable(this.tags, baseOfferDTO.tags) &&
        Objects.equals(this.shelfLife, baseOfferDTO.shelfLife) &&
        Objects.equals(this.lifeTime, baseOfferDTO.lifeTime) &&
        Objects.equals(this.guaranteePeriod, baseOfferDTO.guaranteePeriod) &&
        Objects.equals(this.customsCommodityCode, baseOfferDTO.customsCommodityCode) &&
        equalsNullable(this.certificates, baseOfferDTO.certificates) &&
        Objects.equals(this.boxCount, baseOfferDTO.boxCount) &&
        Objects.equals(this.condition, baseOfferDTO.condition) &&
        Objects.equals(this.type, baseOfferDTO.type) &&
        Objects.equals(this.downloadable, baseOfferDTO.downloadable) &&
        Objects.equals(this.adult, baseOfferDTO.adult) &&
        Objects.equals(this.age, baseOfferDTO.age) &&
        equalsNullable(this.params, baseOfferDTO.params);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, name, marketCategoryId, category, hashCodeNullable(pictures), hashCodeNullable(videos), hashCodeNullable(manuals), vendor, hashCodeNullable(barcodes), description, hashCodeNullable(manufacturerCountries), weightDimensions, vendorCode, hashCodeNullable(tags), shelfLife, lifeTime, guaranteePeriod, customsCommodityCode, hashCodeNullable(certificates), boxCount, condition, type, downloadable, adult, age, hashCodeNullable(params));
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
    sb.append("class BaseOfferDTO {\n");
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

