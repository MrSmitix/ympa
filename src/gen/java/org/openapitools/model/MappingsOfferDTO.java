package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о товарах в каталоге.
 */
@ApiModel(description="Информация о товарах в каталоге.")

public class MappingsOfferDTO  {
  
 /**
  * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  */
  @ApiModelProperty(example = "Ударная дрель Makita HP1630, 710 Вт", value = "Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ")
  private String name;

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String shopSku;

 /**
  * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  */
  @ApiModelProperty(value = "Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. ")
  private String category;

 /**
  * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  */
  @ApiModelProperty(example = "LEVENHUK", value = "Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.")
  private String vendor;

 /**
  * Артикул товара от производителя.
  */
  @ApiModelProperty(example = "VNDR-0005A", value = "Артикул товара от производителя.")
  private String vendorCode;

 /**
  * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  */
  @ApiModelProperty(value = "Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ")
  private String description;

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String id;

 /**
  * Идентификатор фида.
  */
  @ApiModelProperty(value = "Идентификатор фида.")
  private Long feedId;

 /**
  * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  */
  @ApiModelProperty(value = "Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ")
  private List<String> barcodes;

 /**
  * URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
  */
  @ApiModelProperty(value = "URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. ")
  private List<String> urls;

 /**
  * Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
  */
  @ApiModelProperty(value = "Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. ")
  private List<String> pictures;

 /**
  * Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
  */
  @ApiModelProperty(value = "Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. ")
  private String manufacturer;

 /**
  * Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
  */
  @ApiModelProperty(value = "Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. ")
  private List<String> manufacturerCountries;

 /**
  * Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
  */
  @ApiModelProperty(value = "Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. ")
  private Integer minShipment;

 /**
  * Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
  */
  @ApiModelProperty(value = "Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. ")
  private Integer transportUnitSize;

 /**
  * Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
  */
  @ApiModelProperty(value = "Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. ")
  private Integer quantumOfSupply;

 /**
  * Срок, за который продавец поставляет товары на склад, в днях.
  */
  @ApiModelProperty(value = "Срок, за который продавец поставляет товары на склад, в днях.")
  private Integer deliveryDurationDays;

 /**
  * Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
  */
  @ApiModelProperty(value = "Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. ")
  private Integer boxCount;

 /**
  * Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
  */
  @ApiModelProperty(value = "Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. ")
  private List<String> customsCommodityCodes;

  @ApiModelProperty(value = "")
  @Valid
  private OfferWeightDimensionsDTO weightDimensions;

 /**
  * Дни недели, в которые продавец поставляет товары на склад.
  */
  @ApiModelProperty(value = "Дни недели, в которые продавец поставляет товары на склад.")
  @Valid
  private List<DayOfWeekType> supplyScheduleDays;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. ")
  private Integer shelfLifeDays;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. ")
  private Integer lifeTimeDays;

 /**
  * Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
  */
  @ApiModelProperty(value = "Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. ")
  private Integer guaranteePeriodDays;

  @ApiModelProperty(value = "")
  @Valid
  private OfferProcessingStateDTO processingState;

  @ApiModelProperty(value = "")
  @Valid
  private OfferAvailabilityStatusType availability;

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
  * Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
  */
  @ApiModelProperty(value = "Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) ")
  private String certificate;

 /**
  * Цена на товар в рублях.
  */
  @ApiModelProperty(value = "Цена на товар в рублях.")
  @Valid
  private BigDecimal price;
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
  public MappingsOfferDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return shopSku
  */
  @JsonProperty("shopSku")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getShopSku() {
    return shopSku;
  }

  /**
   * Sets the <code>shopSku</code> property.
   */
 public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * Sets the <code>shopSku</code> property.
   */
  public MappingsOfferDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
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
  public MappingsOfferDTO category(String category) {
    this.category = category;
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
  public MappingsOfferDTO vendor(String vendor) {
    this.vendor = vendor;
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
  public MappingsOfferDTO vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
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
  public MappingsOfferDTO description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public MappingsOfferDTO id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Идентификатор фида.
  * @return feedId
  */
  @JsonProperty("feedId")
  public Long getFeedId() {
    return feedId;
  }

  /**
   * Sets the <code>feedId</code> property.
   */
 public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  /**
   * Sets the <code>feedId</code> property.
   */
  public MappingsOfferDTO feedId(Long feedId) {
    this.feedId = feedId;
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
  public MappingsOfferDTO barcodes(List<String> barcodes) {
    this.barcodes = barcodes;
    return this;
  }

  /**
   * Adds a new item to the <code>barcodes</code> list.
   */
  public MappingsOfferDTO addBarcodesItem(String barcodesItem) {
    this.barcodes.add(barcodesItem);
    return this;
  }

 /**
  * URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
  * @return urls
  */
  @JsonProperty("urls")
  public List<String> getUrls() {
    return urls;
  }

  /**
   * Sets the <code>urls</code> property.
   */
 public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  /**
   * Sets the <code>urls</code> property.
   */
  public MappingsOfferDTO urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  /**
   * Adds a new item to the <code>urls</code> list.
   */
  public MappingsOfferDTO addUrlsItem(String urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

 /**
  * Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. 
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
  public MappingsOfferDTO pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  /**
   * Adds a new item to the <code>pictures</code> list.
   */
  public MappingsOfferDTO addPicturesItem(String picturesItem) {
    this.pictures.add(picturesItem);
    return this;
  }

 /**
  * Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
  * @return manufacturer
  */
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * Sets the <code>manufacturer</code> property.
   */
 public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * Sets the <code>manufacturer</code> property.
   */
  public MappingsOfferDTO manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

 /**
  * Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
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
  public MappingsOfferDTO manufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
    return this;
  }

  /**
   * Adds a new item to the <code>manufacturerCountries</code> list.
   */
  public MappingsOfferDTO addManufacturerCountriesItem(String manufacturerCountriesItem) {
    this.manufacturerCountries.add(manufacturerCountriesItem);
    return this;
  }

 /**
  * Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
  * @return minShipment
  */
  @JsonProperty("minShipment")
  public Integer getMinShipment() {
    return minShipment;
  }

  /**
   * Sets the <code>minShipment</code> property.
   */
 public void setMinShipment(Integer minShipment) {
    this.minShipment = minShipment;
  }

  /**
   * Sets the <code>minShipment</code> property.
   */
  public MappingsOfferDTO minShipment(Integer minShipment) {
    this.minShipment = minShipment;
    return this;
  }

 /**
  * Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
  * @return transportUnitSize
  */
  @JsonProperty("transportUnitSize")
  public Integer getTransportUnitSize() {
    return transportUnitSize;
  }

  /**
   * Sets the <code>transportUnitSize</code> property.
   */
 public void setTransportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
  }

  /**
   * Sets the <code>transportUnitSize</code> property.
   */
  public MappingsOfferDTO transportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
    return this;
  }

 /**
  * Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
  * @return quantumOfSupply
  */
  @JsonProperty("quantumOfSupply")
  public Integer getQuantumOfSupply() {
    return quantumOfSupply;
  }

  /**
   * Sets the <code>quantumOfSupply</code> property.
   */
 public void setQuantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
  }

  /**
   * Sets the <code>quantumOfSupply</code> property.
   */
  public MappingsOfferDTO quantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
    return this;
  }

 /**
  * Срок, за который продавец поставляет товары на склад, в днях.
  * @return deliveryDurationDays
  */
  @JsonProperty("deliveryDurationDays")
  public Integer getDeliveryDurationDays() {
    return deliveryDurationDays;
  }

  /**
   * Sets the <code>deliveryDurationDays</code> property.
   */
 public void setDeliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
  }

  /**
   * Sets the <code>deliveryDurationDays</code> property.
   */
  public MappingsOfferDTO deliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
    return this;
  }

 /**
  * Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
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
  public MappingsOfferDTO boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

 /**
  * Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
  * @return customsCommodityCodes
  */
  @JsonProperty("customsCommodityCodes")
  public List<String> getCustomsCommodityCodes() {
    return customsCommodityCodes;
  }

  /**
   * Sets the <code>customsCommodityCodes</code> property.
   */
 public void setCustomsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
  }

  /**
   * Sets the <code>customsCommodityCodes</code> property.
   */
  public MappingsOfferDTO customsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
    return this;
  }

  /**
   * Adds a new item to the <code>customsCommodityCodes</code> list.
   */
  public MappingsOfferDTO addCustomsCommodityCodesItem(String customsCommodityCodesItem) {
    this.customsCommodityCodes.add(customsCommodityCodesItem);
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
  public MappingsOfferDTO weightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
    return this;
  }

 /**
  * Дни недели, в которые продавец поставляет товары на склад.
  * @return supplyScheduleDays
  */
  @JsonProperty("supplyScheduleDays")
  public List<DayOfWeekType> getSupplyScheduleDays() {
    return supplyScheduleDays;
  }

  /**
   * Sets the <code>supplyScheduleDays</code> property.
   */
 public void setSupplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
  }

  /**
   * Sets the <code>supplyScheduleDays</code> property.
   */
  public MappingsOfferDTO supplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
    return this;
  }

  /**
   * Adds a new item to the <code>supplyScheduleDays</code> list.
   */
  public MappingsOfferDTO addSupplyScheduleDaysItem(DayOfWeekType supplyScheduleDaysItem) {
    this.supplyScheduleDays.add(supplyScheduleDaysItem);
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
  * @return shelfLifeDays
  */
  @JsonProperty("shelfLifeDays")
  public Integer getShelfLifeDays() {
    return shelfLifeDays;
  }

  /**
   * Sets the <code>shelfLifeDays</code> property.
   */
 public void setShelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
  }

  /**
   * Sets the <code>shelfLifeDays</code> property.
   */
  public MappingsOfferDTO shelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
  * @return lifeTimeDays
  */
  @JsonProperty("lifeTimeDays")
  public Integer getLifeTimeDays() {
    return lifeTimeDays;
  }

  /**
   * Sets the <code>lifeTimeDays</code> property.
   */
 public void setLifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
  }

  /**
   * Sets the <code>lifeTimeDays</code> property.
   */
  public MappingsOfferDTO lifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
    return this;
  }

 /**
  * Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
  * @return guaranteePeriodDays
  */
  @JsonProperty("guaranteePeriodDays")
  public Integer getGuaranteePeriodDays() {
    return guaranteePeriodDays;
  }

  /**
   * Sets the <code>guaranteePeriodDays</code> property.
   */
 public void setGuaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
  }

  /**
   * Sets the <code>guaranteePeriodDays</code> property.
   */
  public MappingsOfferDTO guaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
    return this;
  }

 /**
  * Get processingState
  * @return processingState
  */
  @JsonProperty("processingState")
  public OfferProcessingStateDTO getProcessingState() {
    return processingState;
  }

  /**
   * Sets the <code>processingState</code> property.
   */
 public void setProcessingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
  }

  /**
   * Sets the <code>processingState</code> property.
   */
  public MappingsOfferDTO processingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
    return this;
  }

 /**
  * Get availability
  * @return availability
  */
  @JsonProperty("availability")
  public OfferAvailabilityStatusType getAvailability() {
    return availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
 public void setAvailability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
  public MappingsOfferDTO availability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
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
  public MappingsOfferDTO shelfLife(TimePeriodDTO shelfLife) {
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
  public MappingsOfferDTO lifeTime(TimePeriodDTO lifeTime) {
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
  public MappingsOfferDTO guaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
    return this;
  }

 /**
  * Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
  * @return certificate
  */
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }

  /**
   * Sets the <code>certificate</code> property.
   */
 public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  /**
   * Sets the <code>certificate</code> property.
   */
  public MappingsOfferDTO certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

 /**
  * Цена на товар в рублях.
  * @return price
  */
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public MappingsOfferDTO price(BigDecimal price) {
    this.price = price;
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
    MappingsOfferDTO mappingsOfferDTO = (MappingsOfferDTO) o;
    return Objects.equals(this.name, mappingsOfferDTO.name) &&
        Objects.equals(this.shopSku, mappingsOfferDTO.shopSku) &&
        Objects.equals(this.category, mappingsOfferDTO.category) &&
        Objects.equals(this.vendor, mappingsOfferDTO.vendor) &&
        Objects.equals(this.vendorCode, mappingsOfferDTO.vendorCode) &&
        Objects.equals(this.description, mappingsOfferDTO.description) &&
        Objects.equals(this.id, mappingsOfferDTO.id) &&
        Objects.equals(this.feedId, mappingsOfferDTO.feedId) &&
        Objects.equals(this.barcodes, mappingsOfferDTO.barcodes) &&
        Objects.equals(this.urls, mappingsOfferDTO.urls) &&
        Objects.equals(this.pictures, mappingsOfferDTO.pictures) &&
        Objects.equals(this.manufacturer, mappingsOfferDTO.manufacturer) &&
        Objects.equals(this.manufacturerCountries, mappingsOfferDTO.manufacturerCountries) &&
        Objects.equals(this.minShipment, mappingsOfferDTO.minShipment) &&
        Objects.equals(this.transportUnitSize, mappingsOfferDTO.transportUnitSize) &&
        Objects.equals(this.quantumOfSupply, mappingsOfferDTO.quantumOfSupply) &&
        Objects.equals(this.deliveryDurationDays, mappingsOfferDTO.deliveryDurationDays) &&
        Objects.equals(this.boxCount, mappingsOfferDTO.boxCount) &&
        Objects.equals(this.customsCommodityCodes, mappingsOfferDTO.customsCommodityCodes) &&
        Objects.equals(this.weightDimensions, mappingsOfferDTO.weightDimensions) &&
        Objects.equals(this.supplyScheduleDays, mappingsOfferDTO.supplyScheduleDays) &&
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

  @Override
  public int hashCode() {
    return Objects.hash(name, shopSku, category, vendor, vendorCode, description, id, feedId, barcodes, urls, pictures, manufacturer, manufacturerCountries, minShipment, transportUnitSize, quantumOfSupply, deliveryDurationDays, boxCount, customsCommodityCodes, weightDimensions, supplyScheduleDays, shelfLifeDays, lifeTimeDays, guaranteePeriodDays, processingState, availability, shelfLife, lifeTime, guaranteePeriod, certificate, price);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

