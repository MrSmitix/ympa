package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AgeDTO;
import org.openapitools.model.GetPriceDTO;
import org.openapitools.model.GetPriceWithDiscountDTO;
import org.openapitools.model.OfferCampaignStatusDTO;
import org.openapitools.model.OfferCardStatusType;
import org.openapitools.model.OfferConditionDTO;
import org.openapitools.model.OfferManualDTO;
import org.openapitools.model.OfferParamDTO;
import org.openapitools.model.OfferSellingProgramDTO;
import org.openapitools.model.OfferType;
import org.openapitools.model.OfferWeightDimensionsDTO;
import org.openapitools.model.TimePeriodDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Параметры товара.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferDTO   {
  
  private String offerId;
  private String name;
  private Long marketCategoryId;
  private String category;
  private List<String> pictures;
  private List<String> videos;
  private List<@Valid OfferManualDTO> manuals;
  private String vendor;
  private List<String> barcodes;
  private String description;
  private List<String> manufacturerCountries;
  private OfferWeightDimensionsDTO weightDimensions;
  private String vendorCode;
  private List<String> tags;
  private TimePeriodDTO shelfLife;
  private TimePeriodDTO lifeTime;
  private TimePeriodDTO guaranteePeriod;
  private String customsCommodityCode;
  private List<String> certificates;
  private Integer boxCount;
  private OfferConditionDTO condition;
  private OfferType type;
  private Boolean downloadable;
  private Boolean adult;
  private AgeDTO age;
  private List<@Valid OfferParamDTO> params;
  private GetPriceWithDiscountDTO basicPrice;
  private GetPriceDTO purchasePrice;
  private GetPriceDTO additionalExpenses;
  private GetPriceDTO cofinancePrice;
  private OfferCardStatusType cardStatus;
  private List<@Valid OfferCampaignStatusDTO> campaigns;
  private List<@Valid OfferSellingProgramDTO> sellingPrograms;
  private Boolean archived;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
   **/
  
  @ApiModelProperty(example = "Ударная дрель Makita HP1630, 710 Вт", value = "Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ")
  @JsonProperty("name")
 @Size(max=256)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
   **/
  
  @ApiModelProperty(value = "Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). ")
  @JsonProperty("marketCategoryId")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }
  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  /**
   * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
   **/
  
  @ApiModelProperty(value = "Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. ")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
   **/
  
  @ApiModelProperty(value = "Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) ")
  @JsonProperty("pictures")
  public List<String> getPictures() {
    return pictures;
  }
  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

  /**
   * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
   **/
  
  @ApiModelProperty(value = "Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) ")
  @JsonProperty("videos")
 @Size(max=6)  public List<String> getVideos() {
    return videos;
  }
  public void setVideos(List<String> videos) {
    this.videos = videos;
  }

  /**
   * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся. 
   **/
  
  @ApiModelProperty(value = "Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. ")
  @JsonProperty("manuals")
 @Size(max=6)  @Valid
  public List<@Valid OfferManualDTO> getManuals() {
    return manuals;
  }
  public void setManuals(List<@Valid OfferManualDTO> manuals) {
    this.manuals = manuals;
  }

  /**
   * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
   **/
  
  @ApiModelProperty(example = "LEVENHUK", value = "Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.")
  @JsonProperty("vendor")
  public String getVendor() {
    return vendor;
  }
  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  /**
   * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
   **/
  
  @ApiModelProperty(value = "Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ")
  @JsonProperty("barcodes")
  public List<String> getBarcodes() {
    return barcodes;
  }
  public void setBarcodes(List<String> barcodes) {
    this.barcodes = barcodes;
  }

  /**
   * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
   **/
  
  @ApiModelProperty(value = "Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ")
  @JsonProperty("description")
 @Size(max=6000)  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
   **/
  
  @ApiModelProperty(value = "Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). ")
  @JsonProperty("manufacturerCountries")
  public List<String> getManufacturerCountries() {
    return manufacturerCountries;
  }
  public void setManufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weightDimensions")
  @Valid
  public OfferWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }
  public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  /**
   * Артикул товара от производителя.
   **/
  
  @ApiModelProperty(example = "VNDR-0005A", value = "Артикул товара от производителя.")
  @JsonProperty("vendorCode")
  public String getVendorCode() {
    return vendorCode;
  }
  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  /**
   * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
   **/
  
  @ApiModelProperty(value = "Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. ")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shelfLife")
  @Valid
  public TimePeriodDTO getShelfLife() {
    return shelfLife;
  }
  public void setShelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lifeTime")
  @Valid
  public TimePeriodDTO getLifeTime() {
    return lifeTime;
  }
  public void setLifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("guaranteePeriod")
  @Valid
  public TimePeriodDTO getGuaranteePeriod() {
    return guaranteePeriod;
  }
  public void setGuaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
  }

  /**
   * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
   **/
  
  @ApiModelProperty(example = "8517610008", value = "Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. ")
  @JsonProperty("customsCommodityCode")
  public String getCustomsCommodityCode() {
    return customsCommodityCode;
  }
  public void setCustomsCommodityCode(String customsCommodityCode) {
    this.customsCommodityCode = customsCommodityCode;
  }

  /**
   * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
   **/
  
  @ApiModelProperty(value = "Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). ")
  @JsonProperty("certificates")
  public List<String> getCertificates() {
    return certificates;
  }
  public void setCertificates(List<String> certificates) {
    this.certificates = certificates;
  }

  /**
   * Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
   **/
  
  @ApiModelProperty(value = "Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. ")
  @JsonProperty("boxCount")
  public Integer getBoxCount() {
    return boxCount;
  }
  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("condition")
  @Valid
  public OfferConditionDTO getCondition() {
    return condition;
  }
  public void setCondition(OfferConditionDTO condition) {
    this.condition = condition;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  @Valid
  public OfferType getType() {
    return type;
  }
  public void setType(OfferType type) {
    this.type = type;
  }

  /**
   * Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
   **/
  
  @ApiModelProperty(value = "Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) ")
  @JsonProperty("downloadable")
  public Boolean getDownloadable() {
    return downloadable;
  }
  public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }

  /**
   * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
   **/
  
  @ApiModelProperty(value = "Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. ")
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }
  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("age")
  @Valid
  public AgeDTO getAge() {
    return age;
  }
  public void setAge(AgeDTO age) {
    this.age = age;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
   **/
  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. ")
  @JsonProperty("params")
  @Valid
  public List<@Valid OfferParamDTO> getParams() {
    return params;
  }
  public void setParams(List<@Valid OfferParamDTO> params) {
    this.params = params;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("basicPrice")
  @Valid
  public GetPriceWithDiscountDTO getBasicPrice() {
    return basicPrice;
  }
  public void setBasicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchasePrice")
  @Valid
  public GetPriceDTO getPurchasePrice() {
    return purchasePrice;
  }
  public void setPurchasePrice(GetPriceDTO purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalExpenses")
  @Valid
  public GetPriceDTO getAdditionalExpenses() {
    return additionalExpenses;
  }
  public void setAdditionalExpenses(GetPriceDTO additionalExpenses) {
    this.additionalExpenses = additionalExpenses;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cofinancePrice")
  @Valid
  public GetPriceDTO getCofinancePrice() {
    return cofinancePrice;
  }
  public void setCofinancePrice(GetPriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cardStatus")
  @Valid
  public OfferCardStatusType getCardStatus() {
    return cardStatus;
  }
  public void setCardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
  }

  /**
   * Список магазинов, в которых размещен товар. 
   **/
  
  @ApiModelProperty(value = "Список магазинов, в которых размещен товар. ")
  @JsonProperty("campaigns")
  @Valid
  public List<@Valid OfferCampaignStatusDTO> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<@Valid OfferCampaignStatusDTO> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   * Информация о том, какие для товара доступны модели размещения. 
   **/
  
  @ApiModelProperty(value = "Информация о том, какие для товара доступны модели размещения. ")
  @JsonProperty("sellingPrograms")
  @Valid
  public List<@Valid OfferSellingProgramDTO> getSellingPrograms() {
    return sellingPrograms;
  }
  public void setSellingPrograms(List<@Valid OfferSellingProgramDTO> sellingPrograms) {
    this.sellingPrograms = sellingPrograms;
  }

  /**
   * Товар помещен в архив. 
   **/
  
  @ApiModelProperty(value = "Товар помещен в архив. ")
  @JsonProperty("archived")
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
    return Objects.equals(this.offerId, getOfferDTO.offerId) &&
        Objects.equals(this.name, getOfferDTO.name) &&
        Objects.equals(this.marketCategoryId, getOfferDTO.marketCategoryId) &&
        Objects.equals(this.category, getOfferDTO.category) &&
        Objects.equals(this.pictures, getOfferDTO.pictures) &&
        Objects.equals(this.videos, getOfferDTO.videos) &&
        Objects.equals(this.manuals, getOfferDTO.manuals) &&
        Objects.equals(this.vendor, getOfferDTO.vendor) &&
        Objects.equals(this.barcodes, getOfferDTO.barcodes) &&
        Objects.equals(this.description, getOfferDTO.description) &&
        Objects.equals(this.manufacturerCountries, getOfferDTO.manufacturerCountries) &&
        Objects.equals(this.weightDimensions, getOfferDTO.weightDimensions) &&
        Objects.equals(this.vendorCode, getOfferDTO.vendorCode) &&
        Objects.equals(this.tags, getOfferDTO.tags) &&
        Objects.equals(this.shelfLife, getOfferDTO.shelfLife) &&
        Objects.equals(this.lifeTime, getOfferDTO.lifeTime) &&
        Objects.equals(this.guaranteePeriod, getOfferDTO.guaranteePeriod) &&
        Objects.equals(this.customsCommodityCode, getOfferDTO.customsCommodityCode) &&
        Objects.equals(this.certificates, getOfferDTO.certificates) &&
        Objects.equals(this.boxCount, getOfferDTO.boxCount) &&
        Objects.equals(this.condition, getOfferDTO.condition) &&
        Objects.equals(this.type, getOfferDTO.type) &&
        Objects.equals(this.downloadable, getOfferDTO.downloadable) &&
        Objects.equals(this.adult, getOfferDTO.adult) &&
        Objects.equals(this.age, getOfferDTO.age) &&
        Objects.equals(this.params, getOfferDTO.params) &&
        Objects.equals(this.basicPrice, getOfferDTO.basicPrice) &&
        Objects.equals(this.purchasePrice, getOfferDTO.purchasePrice) &&
        Objects.equals(this.additionalExpenses, getOfferDTO.additionalExpenses) &&
        Objects.equals(this.cofinancePrice, getOfferDTO.cofinancePrice) &&
        Objects.equals(this.cardStatus, getOfferDTO.cardStatus) &&
        Objects.equals(this.campaigns, getOfferDTO.campaigns) &&
        Objects.equals(this.sellingPrograms, getOfferDTO.sellingPrograms) &&
        Objects.equals(this.archived, getOfferDTO.archived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, name, marketCategoryId, category, pictures, videos, manuals, vendor, barcodes, description, manufacturerCountries, weightDimensions, vendorCode, tags, shelfLife, lifeTime, guaranteePeriod, customsCommodityCode, certificates, boxCount, condition, type, downloadable, adult, age, params, basicPrice, purchasePrice, additionalExpenses, cofinancePrice, cardStatus, campaigns, sellingPrograms, archived);
  }

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

