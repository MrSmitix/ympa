/**
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

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AgeDTO;
import org.openapitools.client.model.BasePriceDTO;
import org.openapitools.client.model.OfferConditionDTO;
import org.openapitools.client.model.OfferManualDTO;
import org.openapitools.client.model.OfferParamDTO;
import org.openapitools.client.model.OfferType;
import org.openapitools.client.model.OfferWeightDimensionsDTO;
import org.openapitools.client.model.ParameterValueDTO;
import org.openapitools.client.model.TimePeriodDTO;
import org.openapitools.client.model.UpdatePriceWithDiscountDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Параметры товара.
 **/
@ApiModel(description = "Параметры товара.")
public class UpdateOfferDTO {
  
  @SerializedName("offerId")
  private String offerId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("marketCategoryId")
  private Long marketCategoryId = null;
  @SerializedName("category")
  private String category = null;
  @SerializedName("pictures")
  private List<String> pictures = null;
  @SerializedName("videos")
  private List<String> videos = null;
  @SerializedName("manuals")
  private List<OfferManualDTO> manuals = null;
  @SerializedName("vendor")
  private String vendor = null;
  @SerializedName("barcodes")
  private List<String> barcodes = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("manufacturerCountries")
  private List<String> manufacturerCountries = null;
  @SerializedName("weightDimensions")
  private OfferWeightDimensionsDTO weightDimensions = null;
  @SerializedName("vendorCode")
  private String vendorCode = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("shelfLife")
  private TimePeriodDTO shelfLife = null;
  @SerializedName("lifeTime")
  private TimePeriodDTO lifeTime = null;
  @SerializedName("guaranteePeriod")
  private TimePeriodDTO guaranteePeriod = null;
  @SerializedName("customsCommodityCode")
  private String customsCommodityCode = null;
  @SerializedName("certificates")
  private List<String> certificates = null;
  @SerializedName("boxCount")
  private Integer boxCount = null;
  @SerializedName("condition")
  private OfferConditionDTO condition = null;
  @SerializedName("type")
  private OfferType type = null;
  @SerializedName("downloadable")
  private Boolean downloadable = null;
  @SerializedName("adult")
  private Boolean adult = null;
  @SerializedName("age")
  private AgeDTO age = null;
  @SerializedName("params")
  private List<OfferParamDTO> params = null;
  @SerializedName("parameterValues")
  private List<ParameterValueDTO> parameterValues = null;
  @SerializedName("basicPrice")
  private UpdatePriceWithDiscountDTO basicPrice = null;
  @SerializedName("purchasePrice")
  private BasePriceDTO purchasePrice = null;
  @SerializedName("additionalExpenses")
  private BasePriceDTO additionalExpenses = null;
  @SerializedName("cofinancePrice")
  private BasePriceDTO cofinancePrice = null;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
   **/
  @ApiModelProperty(value = "Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
   **/
  @ApiModelProperty(value = "Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). ")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }
  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  /**
   * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
   **/
  @ApiModelProperty(value = "Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. ")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
   **/
  @ApiModelProperty(value = "Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) ")
  public List<String> getPictures() {
    return pictures;
  }
  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

  /**
   * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
   **/
  @ApiModelProperty(value = "Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) ")
  public List<String> getVideos() {
    return videos;
  }
  public void setVideos(List<String> videos) {
    this.videos = videos;
  }

  /**
   * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
   **/
  @ApiModelProperty(value = "Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. ")
  public List<OfferManualDTO> getManuals() {
    return manuals;
  }
  public void setManuals(List<OfferManualDTO> manuals) {
    this.manuals = manuals;
  }

  /**
   * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
   **/
  @ApiModelProperty(value = "Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.")
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
  public List<String> getBarcodes() {
    return barcodes;
  }
  public void setBarcodes(List<String> barcodes) {
    this.barcodes = barcodes;
  }

  /**
   * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
   **/
  @ApiModelProperty(value = "Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
   **/
  @ApiModelProperty(value = "Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). ")
  public List<String> getManufacturerCountries() {
    return manufacturerCountries;
  }
  public void setManufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OfferWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }
  public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  /**
   * Артикул товара от производителя.
   **/
  @ApiModelProperty(value = "Артикул товара от производителя.")
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
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TimePeriodDTO getShelfLife() {
    return shelfLife;
  }
  public void setShelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TimePeriodDTO getLifeTime() {
    return lifeTime;
  }
  public void setLifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TimePeriodDTO getGuaranteePeriod() {
    return guaranteePeriod;
  }
  public void setGuaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
  }

  /**
   * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
   **/
  @ApiModelProperty(value = "Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. ")
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
  public Integer getBoxCount() {
    return boxCount;
  }
  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OfferConditionDTO getCondition() {
    return condition;
  }
  public void setCondition(OfferConditionDTO condition) {
    this.condition = condition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OfferType getType() {
    return type;
  }
  public void setType(OfferType type) {
    this.type = type;
  }

  /**
   * Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
   **/
  @ApiModelProperty(value = "Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) ")
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
  public Boolean getAdult() {
    return adult;
  }
  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AgeDTO getAge() {
    return age;
  }
  public void setAge(AgeDTO age) {
    this.age = age;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
   **/
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. ")
  public List<OfferParamDTO> getParams() {
    return params;
  }
  public void setParams(List<OfferParamDTO> params) {
    this.params = params;
  }

  /**
   * Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
   **/
  @ApiModelProperty(value = "Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. ")
  public List<ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }
  public void setParameterValues(List<ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UpdatePriceWithDiscountDTO getBasicPrice() {
    return basicPrice;
  }
  public void setBasicPrice(UpdatePriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BasePriceDTO getPurchasePrice() {
    return purchasePrice;
  }
  public void setPurchasePrice(BasePriceDTO purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BasePriceDTO getAdditionalExpenses() {
    return additionalExpenses;
  }
  public void setAdditionalExpenses(BasePriceDTO additionalExpenses) {
    this.additionalExpenses = additionalExpenses;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BasePriceDTO getCofinancePrice() {
    return cofinancePrice;
  }
  public void setCofinancePrice(BasePriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferDTO updateOfferDTO = (UpdateOfferDTO) o;
    return (this.offerId == null ? updateOfferDTO.offerId == null : this.offerId.equals(updateOfferDTO.offerId)) &&
        (this.name == null ? updateOfferDTO.name == null : this.name.equals(updateOfferDTO.name)) &&
        (this.marketCategoryId == null ? updateOfferDTO.marketCategoryId == null : this.marketCategoryId.equals(updateOfferDTO.marketCategoryId)) &&
        (this.category == null ? updateOfferDTO.category == null : this.category.equals(updateOfferDTO.category)) &&
        (this.pictures == null ? updateOfferDTO.pictures == null : this.pictures.equals(updateOfferDTO.pictures)) &&
        (this.videos == null ? updateOfferDTO.videos == null : this.videos.equals(updateOfferDTO.videos)) &&
        (this.manuals == null ? updateOfferDTO.manuals == null : this.manuals.equals(updateOfferDTO.manuals)) &&
        (this.vendor == null ? updateOfferDTO.vendor == null : this.vendor.equals(updateOfferDTO.vendor)) &&
        (this.barcodes == null ? updateOfferDTO.barcodes == null : this.barcodes.equals(updateOfferDTO.barcodes)) &&
        (this.description == null ? updateOfferDTO.description == null : this.description.equals(updateOfferDTO.description)) &&
        (this.manufacturerCountries == null ? updateOfferDTO.manufacturerCountries == null : this.manufacturerCountries.equals(updateOfferDTO.manufacturerCountries)) &&
        (this.weightDimensions == null ? updateOfferDTO.weightDimensions == null : this.weightDimensions.equals(updateOfferDTO.weightDimensions)) &&
        (this.vendorCode == null ? updateOfferDTO.vendorCode == null : this.vendorCode.equals(updateOfferDTO.vendorCode)) &&
        (this.tags == null ? updateOfferDTO.tags == null : this.tags.equals(updateOfferDTO.tags)) &&
        (this.shelfLife == null ? updateOfferDTO.shelfLife == null : this.shelfLife.equals(updateOfferDTO.shelfLife)) &&
        (this.lifeTime == null ? updateOfferDTO.lifeTime == null : this.lifeTime.equals(updateOfferDTO.lifeTime)) &&
        (this.guaranteePeriod == null ? updateOfferDTO.guaranteePeriod == null : this.guaranteePeriod.equals(updateOfferDTO.guaranteePeriod)) &&
        (this.customsCommodityCode == null ? updateOfferDTO.customsCommodityCode == null : this.customsCommodityCode.equals(updateOfferDTO.customsCommodityCode)) &&
        (this.certificates == null ? updateOfferDTO.certificates == null : this.certificates.equals(updateOfferDTO.certificates)) &&
        (this.boxCount == null ? updateOfferDTO.boxCount == null : this.boxCount.equals(updateOfferDTO.boxCount)) &&
        (this.condition == null ? updateOfferDTO.condition == null : this.condition.equals(updateOfferDTO.condition)) &&
        (this.type == null ? updateOfferDTO.type == null : this.type.equals(updateOfferDTO.type)) &&
        (this.downloadable == null ? updateOfferDTO.downloadable == null : this.downloadable.equals(updateOfferDTO.downloadable)) &&
        (this.adult == null ? updateOfferDTO.adult == null : this.adult.equals(updateOfferDTO.adult)) &&
        (this.age == null ? updateOfferDTO.age == null : this.age.equals(updateOfferDTO.age)) &&
        (this.params == null ? updateOfferDTO.params == null : this.params.equals(updateOfferDTO.params)) &&
        (this.parameterValues == null ? updateOfferDTO.parameterValues == null : this.parameterValues.equals(updateOfferDTO.parameterValues)) &&
        (this.basicPrice == null ? updateOfferDTO.basicPrice == null : this.basicPrice.equals(updateOfferDTO.basicPrice)) &&
        (this.purchasePrice == null ? updateOfferDTO.purchasePrice == null : this.purchasePrice.equals(updateOfferDTO.purchasePrice)) &&
        (this.additionalExpenses == null ? updateOfferDTO.additionalExpenses == null : this.additionalExpenses.equals(updateOfferDTO.additionalExpenses)) &&
        (this.cofinancePrice == null ? updateOfferDTO.cofinancePrice == null : this.cofinancePrice.equals(updateOfferDTO.cofinancePrice));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.offerId == null ? 0: this.offerId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.marketCategoryId == null ? 0: this.marketCategoryId.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.pictures == null ? 0: this.pictures.hashCode());
    result = 31 * result + (this.videos == null ? 0: this.videos.hashCode());
    result = 31 * result + (this.manuals == null ? 0: this.manuals.hashCode());
    result = 31 * result + (this.vendor == null ? 0: this.vendor.hashCode());
    result = 31 * result + (this.barcodes == null ? 0: this.barcodes.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.manufacturerCountries == null ? 0: this.manufacturerCountries.hashCode());
    result = 31 * result + (this.weightDimensions == null ? 0: this.weightDimensions.hashCode());
    result = 31 * result + (this.vendorCode == null ? 0: this.vendorCode.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.shelfLife == null ? 0: this.shelfLife.hashCode());
    result = 31 * result + (this.lifeTime == null ? 0: this.lifeTime.hashCode());
    result = 31 * result + (this.guaranteePeriod == null ? 0: this.guaranteePeriod.hashCode());
    result = 31 * result + (this.customsCommodityCode == null ? 0: this.customsCommodityCode.hashCode());
    result = 31 * result + (this.certificates == null ? 0: this.certificates.hashCode());
    result = 31 * result + (this.boxCount == null ? 0: this.boxCount.hashCode());
    result = 31 * result + (this.condition == null ? 0: this.condition.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.downloadable == null ? 0: this.downloadable.hashCode());
    result = 31 * result + (this.adult == null ? 0: this.adult.hashCode());
    result = 31 * result + (this.age == null ? 0: this.age.hashCode());
    result = 31 * result + (this.params == null ? 0: this.params.hashCode());
    result = 31 * result + (this.parameterValues == null ? 0: this.parameterValues.hashCode());
    result = 31 * result + (this.basicPrice == null ? 0: this.basicPrice.hashCode());
    result = 31 * result + (this.purchasePrice == null ? 0: this.purchasePrice.hashCode());
    result = 31 * result + (this.additionalExpenses == null ? 0: this.additionalExpenses.hashCode());
    result = 31 * result + (this.cofinancePrice == null ? 0: this.cofinancePrice.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferDTO {\n");
    
    sb.append("  offerId: ").append(offerId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  marketCategoryId: ").append(marketCategoryId).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  pictures: ").append(pictures).append("\n");
    sb.append("  videos: ").append(videos).append("\n");
    sb.append("  manuals: ").append(manuals).append("\n");
    sb.append("  vendor: ").append(vendor).append("\n");
    sb.append("  barcodes: ").append(barcodes).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  manufacturerCountries: ").append(manufacturerCountries).append("\n");
    sb.append("  weightDimensions: ").append(weightDimensions).append("\n");
    sb.append("  vendorCode: ").append(vendorCode).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  shelfLife: ").append(shelfLife).append("\n");
    sb.append("  lifeTime: ").append(lifeTime).append("\n");
    sb.append("  guaranteePeriod: ").append(guaranteePeriod).append("\n");
    sb.append("  customsCommodityCode: ").append(customsCommodityCode).append("\n");
    sb.append("  certificates: ").append(certificates).append("\n");
    sb.append("  boxCount: ").append(boxCount).append("\n");
    sb.append("  condition: ").append(condition).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  downloadable: ").append(downloadable).append("\n");
    sb.append("  adult: ").append(adult).append("\n");
    sb.append("  age: ").append(age).append("\n");
    sb.append("  params: ").append(params).append("\n");
    sb.append("  parameterValues: ").append(parameterValues).append("\n");
    sb.append("  basicPrice: ").append(basicPrice).append("\n");
    sb.append("  purchasePrice: ").append(purchasePrice).append("\n");
    sb.append("  additionalExpenses: ").append(additionalExpenses).append("\n");
    sb.append("  cofinancePrice: ").append(cofinancePrice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
