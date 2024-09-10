/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Основные параметры товара.
 */
@JsonPropertyOrder({
  BaseOfferDTO.JSON_PROPERTY_OFFER_ID,
  BaseOfferDTO.JSON_PROPERTY_NAME,
  BaseOfferDTO.JSON_PROPERTY_MARKET_CATEGORY_ID,
  BaseOfferDTO.JSON_PROPERTY_CATEGORY,
  BaseOfferDTO.JSON_PROPERTY_PICTURES,
  BaseOfferDTO.JSON_PROPERTY_VIDEOS,
  BaseOfferDTO.JSON_PROPERTY_MANUALS,
  BaseOfferDTO.JSON_PROPERTY_VENDOR,
  BaseOfferDTO.JSON_PROPERTY_BARCODES,
  BaseOfferDTO.JSON_PROPERTY_DESCRIPTION,
  BaseOfferDTO.JSON_PROPERTY_MANUFACTURER_COUNTRIES,
  BaseOfferDTO.JSON_PROPERTY_WEIGHT_DIMENSIONS,
  BaseOfferDTO.JSON_PROPERTY_VENDOR_CODE,
  BaseOfferDTO.JSON_PROPERTY_TAGS,
  BaseOfferDTO.JSON_PROPERTY_SHELF_LIFE,
  BaseOfferDTO.JSON_PROPERTY_LIFE_TIME,
  BaseOfferDTO.JSON_PROPERTY_GUARANTEE_PERIOD,
  BaseOfferDTO.JSON_PROPERTY_CUSTOMS_COMMODITY_CODE,
  BaseOfferDTO.JSON_PROPERTY_CERTIFICATES,
  BaseOfferDTO.JSON_PROPERTY_BOX_COUNT,
  BaseOfferDTO.JSON_PROPERTY_CONDITION,
  BaseOfferDTO.JSON_PROPERTY_TYPE,
  BaseOfferDTO.JSON_PROPERTY_DOWNLOADABLE,
  BaseOfferDTO.JSON_PROPERTY_ADULT,
  BaseOfferDTO.JSON_PROPERTY_AGE,
  BaseOfferDTO.JSON_PROPERTY_PARAMS
})
@JsonTypeName("BaseOfferDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class BaseOfferDTO {
    public static final String JSON_PROPERTY_OFFER_ID = "offerId";
    private String offerId;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_MARKET_CATEGORY_ID = "marketCategoryId";
    private Long marketCategoryId;

    public static final String JSON_PROPERTY_CATEGORY = "category";
    private String category;

    public static final String JSON_PROPERTY_PICTURES = "pictures";
    private List<String> pictures = null;

    public static final String JSON_PROPERTY_VIDEOS = "videos";
    private List<String> videos = null;

    public static final String JSON_PROPERTY_MANUALS = "manuals";
    private List<@Valid OfferManualDTO> manuals = null;

    public static final String JSON_PROPERTY_VENDOR = "vendor";
    private String vendor;

    public static final String JSON_PROPERTY_BARCODES = "barcodes";
    private List<String> barcodes = null;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_MANUFACTURER_COUNTRIES = "manufacturerCountries";
    private List<String> manufacturerCountries = null;

    public static final String JSON_PROPERTY_WEIGHT_DIMENSIONS = "weightDimensions";
    private OfferWeightDimensionsDTO weightDimensions;

    public static final String JSON_PROPERTY_VENDOR_CODE = "vendorCode";
    private String vendorCode;

    public static final String JSON_PROPERTY_TAGS = "tags";
    private List<String> tags = null;

    public static final String JSON_PROPERTY_SHELF_LIFE = "shelfLife";
    private TimePeriodDTO shelfLife;

    public static final String JSON_PROPERTY_LIFE_TIME = "lifeTime";
    private TimePeriodDTO lifeTime;

    public static final String JSON_PROPERTY_GUARANTEE_PERIOD = "guaranteePeriod";
    private TimePeriodDTO guaranteePeriod;

    public static final String JSON_PROPERTY_CUSTOMS_COMMODITY_CODE = "customsCommodityCode";
    private String customsCommodityCode;

    public static final String JSON_PROPERTY_CERTIFICATES = "certificates";
    private List<String> certificates = null;

    public static final String JSON_PROPERTY_BOX_COUNT = "boxCount";
    private Integer boxCount;

    public static final String JSON_PROPERTY_CONDITION = "condition";
    private OfferConditionDTO condition;

    public static final String JSON_PROPERTY_TYPE = "type";
    private OfferType type;

    public static final String JSON_PROPERTY_DOWNLOADABLE = "downloadable";
    private Boolean downloadable;

    public static final String JSON_PROPERTY_ADULT = "adult";
    private Boolean adult;

    public static final String JSON_PROPERTY_AGE = "age";
    private AgeDTO age;

    public static final String JSON_PROPERTY_PARAMS = "params";
    private List<@Valid OfferParamDTO> params = null;

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
    @NotNull
    @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @Size(min=1, max=255)
    @JsonProperty(JSON_PROPERTY_OFFER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty(JSON_PROPERTY_OFFER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    @Nullable
    @Size(max=256)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public BaseOfferDTO marketCategoryId(Long marketCategoryId) {
        this.marketCategoryId = marketCategoryId;
        return this;
    }

    /**
     * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
     * @return marketCategoryId
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_MARKET_CATEGORY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getMarketCategoryId() {
        return marketCategoryId;
    }

    @JsonProperty(JSON_PROPERTY_MARKET_CATEGORY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMarketCategoryId(Long marketCategoryId) {
        this.marketCategoryId = marketCategoryId;
    }

    public BaseOfferDTO category(String category) {
        this.category = category;
        return this;
    }

    /**
     * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
     * @return category
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCategory() {
        return category;
    }

    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCategory(String category) {
        this.category = category;
    }

    public BaseOfferDTO pictures(List<String> pictures) {
        this.pictures = pictures;
        return this;
    }

    public BaseOfferDTO addPicturesItem(String picturesItem) {
        if (this.pictures == null) {
            this.pictures = new ArrayList<>();
        }
        this.pictures.add(picturesItem);
        return this;
    }

    /**
     * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
     * @return pictures
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PICTURES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getPictures() {
        return pictures;
    }

    @JsonProperty(JSON_PROPERTY_PICTURES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public BaseOfferDTO videos(List<String> videos) {
        this.videos = videos;
        return this;
    }

    public BaseOfferDTO addVideosItem(String videosItem) {
        if (this.videos == null) {
            this.videos = new ArrayList<>();
        }
        this.videos.add(videosItem);
        return this;
    }

    /**
     * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
     * @return videos
     */
    @Nullable
    @Size(max=6)
    @JsonProperty(JSON_PROPERTY_VIDEOS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getVideos() {
        return videos;
    }

    @JsonProperty(JSON_PROPERTY_VIDEOS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    public BaseOfferDTO manuals(List<@Valid OfferManualDTO> manuals) {
        this.manuals = manuals;
        return this;
    }

    public BaseOfferDTO addManualsItem(OfferManualDTO manualsItem) {
        if (this.manuals == null) {
            this.manuals = new ArrayList<>();
        }
        this.manuals.add(manualsItem);
        return this;
    }

    /**
     * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся. 
     * @return manuals
     */
    @Nullable
    @Size(max=6)
    @JsonProperty(JSON_PROPERTY_MANUALS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OfferManualDTO> getManuals() {
        return manuals;
    }

    @JsonProperty(JSON_PROPERTY_MANUALS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setManuals(List<@Valid OfferManualDTO> manuals) {
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_VENDOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVendor() {
        return vendor;
    }

    @JsonProperty(JSON_PROPERTY_VENDOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public BaseOfferDTO barcodes(List<String> barcodes) {
        this.barcodes = barcodes;
        return this;
    }

    public BaseOfferDTO addBarcodesItem(String barcodesItem) {
        if (this.barcodes == null) {
            this.barcodes = new ArrayList<>();
        }
        this.barcodes.add(barcodesItem);
        return this;
    }

    /**
     * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
     * @return barcodes
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_BARCODES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getBarcodes() {
        return barcodes;
    }

    @JsonProperty(JSON_PROPERTY_BARCODES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBarcodes(List<String> barcodes) {
        this.barcodes = barcodes;
    }

    public BaseOfferDTO description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
     * @return description
     */
    @Nullable
    @Size(max=6000)
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public BaseOfferDTO manufacturerCountries(List<String> manufacturerCountries) {
        this.manufacturerCountries = manufacturerCountries;
        return this;
    }

    public BaseOfferDTO addManufacturerCountriesItem(String manufacturerCountriesItem) {
        if (this.manufacturerCountries == null) {
            this.manufacturerCountries = new ArrayList<>();
        }
        this.manufacturerCountries.add(manufacturerCountriesItem);
        return this;
    }

    /**
     * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
     * @return manufacturerCountries
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_MANUFACTURER_COUNTRIES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getManufacturerCountries() {
        return manufacturerCountries;
    }

    @JsonProperty(JSON_PROPERTY_MANUFACTURER_COUNTRIES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setManufacturerCountries(List<String> manufacturerCountries) {
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_WEIGHT_DIMENSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OfferWeightDimensionsDTO getWeightDimensions() {
        return weightDimensions;
    }

    @JsonProperty(JSON_PROPERTY_WEIGHT_DIMENSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_VENDOR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVendorCode() {
        return vendorCode;
    }

    @JsonProperty(JSON_PROPERTY_VENDOR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public BaseOfferDTO tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public BaseOfferDTO addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
     * @return tags
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTags(List<String> tags) {
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_SHELF_LIFE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TimePeriodDTO getShelfLife() {
        return shelfLife;
    }

    @JsonProperty(JSON_PROPERTY_SHELF_LIFE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_LIFE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TimePeriodDTO getLifeTime() {
        return lifeTime;
    }

    @JsonProperty(JSON_PROPERTY_LIFE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_GUARANTEE_PERIOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TimePeriodDTO getGuaranteePeriod() {
        return guaranteePeriod;
    }

    @JsonProperty(JSON_PROPERTY_GUARANTEE_PERIOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_CUSTOMS_COMMODITY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCustomsCommodityCode() {
        return customsCommodityCode;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOMS_COMMODITY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomsCommodityCode(String customsCommodityCode) {
        this.customsCommodityCode = customsCommodityCode;
    }

    public BaseOfferDTO certificates(List<String> certificates) {
        this.certificates = certificates;
        return this;
    }

    public BaseOfferDTO addCertificatesItem(String certificatesItem) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificatesItem);
        return this;
    }

    /**
     * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
     * @return certificates
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CERTIFICATES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getCertificates() {
        return certificates;
    }

    @JsonProperty(JSON_PROPERTY_CERTIFICATES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCertificates(List<String> certificates) {
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_BOX_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getBoxCount() {
        return boxCount;
    }

    @JsonProperty(JSON_PROPERTY_BOX_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_CONDITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OfferConditionDTO getCondition() {
        return condition;
    }

    @JsonProperty(JSON_PROPERTY_CONDITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OfferType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(OfferType type) {
        this.type = type;
    }

    public BaseOfferDTO downloadable(Boolean downloadable) {
        this.downloadable = downloadable;
        return this;
    }

    /**
     * Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
     * @return downloadable
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_DOWNLOADABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getDownloadable() {
        return downloadable;
    }

    @JsonProperty(JSON_PROPERTY_DOWNLOADABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_ADULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAdult() {
        return adult;
    }

    @JsonProperty(JSON_PROPERTY_ADULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_AGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AgeDTO getAge() {
        return age;
    }

    @JsonProperty(JSON_PROPERTY_AGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAge(AgeDTO age) {
        this.age = age;
    }

    public BaseOfferDTO params(List<@Valid OfferParamDTO> params) {
        this.params = params;
        return this;
    }

    public BaseOfferDTO addParamsItem(OfferParamDTO paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
     * @return params
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OfferParamDTO> getParams() {
        return params;
    }

    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParams(List<@Valid OfferParamDTO> params) {
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
            Objects.equals(this.pictures, baseOfferDTO.pictures) &&
            Objects.equals(this.videos, baseOfferDTO.videos) &&
            Objects.equals(this.manuals, baseOfferDTO.manuals) &&
            Objects.equals(this.vendor, baseOfferDTO.vendor) &&
            Objects.equals(this.barcodes, baseOfferDTO.barcodes) &&
            Objects.equals(this.description, baseOfferDTO.description) &&
            Objects.equals(this.manufacturerCountries, baseOfferDTO.manufacturerCountries) &&
            Objects.equals(this.weightDimensions, baseOfferDTO.weightDimensions) &&
            Objects.equals(this.vendorCode, baseOfferDTO.vendorCode) &&
            Objects.equals(this.tags, baseOfferDTO.tags) &&
            Objects.equals(this.shelfLife, baseOfferDTO.shelfLife) &&
            Objects.equals(this.lifeTime, baseOfferDTO.lifeTime) &&
            Objects.equals(this.guaranteePeriod, baseOfferDTO.guaranteePeriod) &&
            Objects.equals(this.customsCommodityCode, baseOfferDTO.customsCommodityCode) &&
            Objects.equals(this.certificates, baseOfferDTO.certificates) &&
            Objects.equals(this.boxCount, baseOfferDTO.boxCount) &&
            Objects.equals(this.condition, baseOfferDTO.condition) &&
            Objects.equals(this.type, baseOfferDTO.type) &&
            Objects.equals(this.downloadable, baseOfferDTO.downloadable) &&
            Objects.equals(this.adult, baseOfferDTO.adult) &&
            Objects.equals(this.age, baseOfferDTO.age) &&
            Objects.equals(this.params, baseOfferDTO.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, name, marketCategoryId, category, pictures, videos, manuals, vendor, barcodes, description, manufacturerCountries, weightDimensions, vendorCode, tags, shelfLife, lifeTime, guaranteePeriod, customsCommodityCode, certificates, boxCount, condition, type, downloadable, adult, age, params);
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

