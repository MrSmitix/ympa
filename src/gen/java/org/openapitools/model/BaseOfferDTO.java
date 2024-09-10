package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Основные параметры товара.
 */
@ApiModel(description="Основные параметры товара.")

public class BaseOfferDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

 /**
  * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  */
  @ApiModelProperty(example = "Ударная дрель Makita HP1630, 710 Вт", value = "Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ")
  private String name;

 /**
  * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  */
  @ApiModelProperty(value = "Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). ")
  private Long marketCategoryId;

 /**
  * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  */
  @ApiModelProperty(value = "Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. ")
  private String category;

 /**
  * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
  */
  @ApiModelProperty(value = "Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) ")
  private List<String> pictures;

 /**
  * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
  */
  @ApiModelProperty(value = "Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) ")
  private List<String> videos;

 /**
  * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
  */
  @ApiModelProperty(value = "Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. ")
  @Valid
  private List<@Valid OfferManualDTO> manuals;

 /**
  * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  */
  @ApiModelProperty(example = "LEVENHUK", value = "Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.")
  private String vendor;

 /**
  * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  */
  @ApiModelProperty(value = "Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ")
  private List<String> barcodes;

 /**
  * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  */
  @ApiModelProperty(value = "Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ")
  private String description;

 /**
  * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
  */
  @ApiModelProperty(value = "Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). ")
  private List<String> manufacturerCountries;

  @ApiModelProperty(value = "")
  @Valid
  private OfferWeightDimensionsDTO weightDimensions;

 /**
  * Артикул товара от производителя.
  */
  @ApiModelProperty(example = "VNDR-0005A", value = "Артикул товара от производителя.")
  private String vendorCode;

 /**
  * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
  */
  @ApiModelProperty(value = "Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. ")
  private List<String> tags;

  @ApiModelProperty(value = "")
  @Valid
  private TimePeriodDTO shelfLife;

  @ApiModelProperty(value = "")
  @Valid
  private TimePeriodDTO lifeTime;

  @ApiModelProperty(value = "")
  @Valid
  private TimePeriodDTO guaranteePeriod;

 /**
  * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
  */
  @ApiModelProperty(example = "8517610008", value = "Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. ")
  private String customsCommodityCode;

 /**
  * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
  */
  @ApiModelProperty(value = "Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). ")
  private List<String> certificates;

 /**
  * Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
  */
  @ApiModelProperty(value = "Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. ")
  private Integer boxCount;

  @ApiModelProperty(value = "")
  @Valid
  private OfferConditionDTO condition;

  @ApiModelProperty(value = "")
  @Valid
  private OfferType type;

 /**
  * Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
  */
  @ApiModelProperty(value = "Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) ")
  private Boolean downloadable;

 /**
  * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
  */
  @ApiModelProperty(value = "Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. ")
  private Boolean adult;

  @ApiModelProperty(value = "")
  @Valid
  private AgeDTO age;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. ")
  @Valid
  private List<@Valid OfferParamDTO> params;
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return offerId
  */
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
 public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
  public BaseOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  * @return name
  */
  @JsonProperty("name")
 @Size(max=256)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public BaseOfferDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  * @return marketCategoryId
  */
  @JsonProperty("marketCategoryId")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }

  /**
   * Sets the <code>marketCategoryId</code> property.
   */
 public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  /**
   * Sets the <code>marketCategoryId</code> property.
   */
  public BaseOfferDTO marketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
    return this;
  }

 /**
  * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
  * @return category
  */
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  /**
   * Sets the <code>category</code> property.
   */
 public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Sets the <code>category</code> property.
   */
  public BaseOfferDTO category(String category) {
    this.category = category;
    return this;
  }

 /**
  * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
  * @return pictures
  */
  @JsonProperty("pictures")
  public List<String> getPictures() {
    return pictures;
  }

  /**
   * Sets the <code>pictures</code> property.
   */
 public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

  /**
   * Sets the <code>pictures</code> property.
   */
  public BaseOfferDTO pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  /**
   * Adds a new item to the <code>pictures</code> list.
   */
  public BaseOfferDTO addPicturesItem(String picturesItem) {
    this.pictures.add(picturesItem);
    return this;
  }

 /**
  * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
  * @return videos
  */
  @JsonProperty("videos")
 @Size(max=6)  public List<String> getVideos() {
    return videos;
  }

  /**
   * Sets the <code>videos</code> property.
   */
 public void setVideos(List<String> videos) {
    this.videos = videos;
  }

  /**
   * Sets the <code>videos</code> property.
   */
  public BaseOfferDTO videos(List<String> videos) {
    this.videos = videos;
    return this;
  }

  /**
   * Adds a new item to the <code>videos</code> list.
   */
  public BaseOfferDTO addVideosItem(String videosItem) {
    this.videos.add(videosItem);
    return this;
  }

 /**
  * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся. 
  * @return manuals
  */
  @JsonProperty("manuals")
 @Size(max=6)  public List<@Valid OfferManualDTO> getManuals() {
    return manuals;
  }

  /**
   * Sets the <code>manuals</code> property.
   */
 public void setManuals(List<@Valid OfferManualDTO> manuals) {
    this.manuals = manuals;
  }

  /**
   * Sets the <code>manuals</code> property.
   */
  public BaseOfferDTO manuals(List<@Valid OfferManualDTO> manuals) {
    this.manuals = manuals;
    return this;
  }

  /**
   * Adds a new item to the <code>manuals</code> list.
   */
  public BaseOfferDTO addManualsItem(OfferManualDTO manualsItem) {
    this.manuals.add(manualsItem);
    return this;
  }

 /**
  * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  * @return vendor
  */
  @JsonProperty("vendor")
  public String getVendor() {
    return vendor;
  }

  /**
   * Sets the <code>vendor</code> property.
   */
 public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  /**
   * Sets the <code>vendor</code> property.
   */
  public BaseOfferDTO vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

 /**
  * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  * @return barcodes
  */
  @JsonProperty("barcodes")
  public List<String> getBarcodes() {
    return barcodes;
  }

  /**
   * Sets the <code>barcodes</code> property.
   */
 public void setBarcodes(List<String> barcodes) {
    this.barcodes = barcodes;
  }

  /**
   * Sets the <code>barcodes</code> property.
   */
  public BaseOfferDTO barcodes(List<String> barcodes) {
    this.barcodes = barcodes;
    return this;
  }

  /**
   * Adds a new item to the <code>barcodes</code> list.
   */
  public BaseOfferDTO addBarcodesItem(String barcodesItem) {
    this.barcodes.add(barcodesItem);
    return this;
  }

 /**
  * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  * @return description
  */
  @JsonProperty("description")
 @Size(max=6000)  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public BaseOfferDTO description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
  * @return manufacturerCountries
  */
  @JsonProperty("manufacturerCountries")
  public List<String> getManufacturerCountries() {
    return manufacturerCountries;
  }

  /**
   * Sets the <code>manufacturerCountries</code> property.
   */
 public void setManufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

  /**
   * Sets the <code>manufacturerCountries</code> property.
   */
  public BaseOfferDTO manufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
    return this;
  }

  /**
   * Adds a new item to the <code>manufacturerCountries</code> list.
   */
  public BaseOfferDTO addManufacturerCountriesItem(String manufacturerCountriesItem) {
    this.manufacturerCountries.add(manufacturerCountriesItem);
    return this;
  }

 /**
  * Get weightDimensions
  * @return weightDimensions
  */
  @JsonProperty("weightDimensions")
  public OfferWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }

  /**
   * Sets the <code>weightDimensions</code> property.
   */
 public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

  /**
   * Sets the <code>weightDimensions</code> property.
   */
  public BaseOfferDTO weightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
    return this;
  }

 /**
  * Артикул товара от производителя.
  * @return vendorCode
  */
  @JsonProperty("vendorCode")
  public String getVendorCode() {
    return vendorCode;
  }

  /**
   * Sets the <code>vendorCode</code> property.
   */
 public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  /**
   * Sets the <code>vendorCode</code> property.
   */
  public BaseOfferDTO vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

 /**
  * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
  * @return tags
  */
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  /**
   * Sets the <code>tags</code> property.
   */
 public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Sets the <code>tags</code> property.
   */
  public BaseOfferDTO tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Adds a new item to the <code>tags</code> list.
   */
  public BaseOfferDTO addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

 /**
  * Get shelfLife
  * @return shelfLife
  */
  @JsonProperty("shelfLife")
  public TimePeriodDTO getShelfLife() {
    return shelfLife;
  }

  /**
   * Sets the <code>shelfLife</code> property.
   */
 public void setShelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
  }

  /**
   * Sets the <code>shelfLife</code> property.
   */
  public BaseOfferDTO shelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
    return this;
  }

 /**
  * Get lifeTime
  * @return lifeTime
  */
  @JsonProperty("lifeTime")
  public TimePeriodDTO getLifeTime() {
    return lifeTime;
  }

  /**
   * Sets the <code>lifeTime</code> property.
   */
 public void setLifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
  }

  /**
   * Sets the <code>lifeTime</code> property.
   */
  public BaseOfferDTO lifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
    return this;
  }

 /**
  * Get guaranteePeriod
  * @return guaranteePeriod
  */
  @JsonProperty("guaranteePeriod")
  public TimePeriodDTO getGuaranteePeriod() {
    return guaranteePeriod;
  }

  /**
   * Sets the <code>guaranteePeriod</code> property.
   */
 public void setGuaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
  }

  /**
   * Sets the <code>guaranteePeriod</code> property.
   */
  public BaseOfferDTO guaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
    return this;
  }

 /**
  * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
  * @return customsCommodityCode
  */
  @JsonProperty("customsCommodityCode")
  public String getCustomsCommodityCode() {
    return customsCommodityCode;
  }

  /**
   * Sets the <code>customsCommodityCode</code> property.
   */
 public void setCustomsCommodityCode(String customsCommodityCode) {
    this.customsCommodityCode = customsCommodityCode;
  }

  /**
   * Sets the <code>customsCommodityCode</code> property.
   */
  public BaseOfferDTO customsCommodityCode(String customsCommodityCode) {
    this.customsCommodityCode = customsCommodityCode;
    return this;
  }

 /**
  * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
  * @return certificates
  */
  @JsonProperty("certificates")
  public List<String> getCertificates() {
    return certificates;
  }

  /**
   * Sets the <code>certificates</code> property.
   */
 public void setCertificates(List<String> certificates) {
    this.certificates = certificates;
  }

  /**
   * Sets the <code>certificates</code> property.
   */
  public BaseOfferDTO certificates(List<String> certificates) {
    this.certificates = certificates;
    return this;
  }

  /**
   * Adds a new item to the <code>certificates</code> list.
   */
  public BaseOfferDTO addCertificatesItem(String certificatesItem) {
    this.certificates.add(certificatesItem);
    return this;
  }

 /**
  * Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
  * @return boxCount
  */
  @JsonProperty("boxCount")
  public Integer getBoxCount() {
    return boxCount;
  }

  /**
   * Sets the <code>boxCount</code> property.
   */
 public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  /**
   * Sets the <code>boxCount</code> property.
   */
  public BaseOfferDTO boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

 /**
  * Get condition
  * @return condition
  */
  @JsonProperty("condition")
  public OfferConditionDTO getCondition() {
    return condition;
  }

  /**
   * Sets the <code>condition</code> property.
   */
 public void setCondition(OfferConditionDTO condition) {
    this.condition = condition;
  }

  /**
   * Sets the <code>condition</code> property.
   */
  public BaseOfferDTO condition(OfferConditionDTO condition) {
    this.condition = condition;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public OfferType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(OfferType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public BaseOfferDTO type(OfferType type) {
    this.type = type;
    return this;
  }

 /**
  * Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
  * @return downloadable
  */
  @JsonProperty("downloadable")
  public Boolean getDownloadable() {
    return downloadable;
  }

  /**
   * Sets the <code>downloadable</code> property.
   */
 public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }

  /**
   * Sets the <code>downloadable</code> property.
   */
  public BaseOfferDTO downloadable(Boolean downloadable) {
    this.downloadable = downloadable;
    return this;
  }

 /**
  * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
  * @return adult
  */
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }

  /**
   * Sets the <code>adult</code> property.
   */
 public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  /**
   * Sets the <code>adult</code> property.
   */
  public BaseOfferDTO adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

 /**
  * Get age
  * @return age
  */
  @JsonProperty("age")
  public AgeDTO getAge() {
    return age;
  }

  /**
   * Sets the <code>age</code> property.
   */
 public void setAge(AgeDTO age) {
    this.age = age;
  }

  /**
   * Sets the <code>age</code> property.
   */
  public BaseOfferDTO age(AgeDTO age) {
    this.age = age;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
  * @return params
  */
  @JsonProperty("params")
  public List<@Valid OfferParamDTO> getParams() {
    return params;
  }

  /**
   * Sets the <code>params</code> property.
   */
 public void setParams(List<@Valid OfferParamDTO> params) {
    this.params = params;
  }

  /**
   * Sets the <code>params</code> property.
   */
  public BaseOfferDTO params(List<@Valid OfferParamDTO> params) {
    this.params = params;
    return this;
  }

  /**
   * Adds a new item to the <code>params</code> list.
   */
  public BaseOfferDTO addParamsItem(OfferParamDTO paramsItem) {
    this.params.add(paramsItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

