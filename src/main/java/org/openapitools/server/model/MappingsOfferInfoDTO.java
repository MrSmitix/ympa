package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.DayOfWeekType;
import org.openapitools.server.model.OfferAvailabilityStatusType;
import org.openapitools.server.model.OfferProcessingStateDTO;
import org.openapitools.server.model.OfferWeightDimensionsDTO;
import org.openapitools.server.model.TimePeriodDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Базовая информация о товарах в каталоге.
 */
public class MappingsOfferInfoDTO   {

    private String name;
    private String shopSku;
    private String category;
    private String vendor;
    private String vendorCode;
    private String description;
    private String id;
    private Long feedId;
    private List<String> barcodes;
    private List<String> urls;
    private List<String> pictures;
    private String manufacturer;
    private List<String> manufacturerCountries;
    private Integer minShipment;
    private Integer transportUnitSize;
    private Integer quantumOfSupply;
    private Integer deliveryDurationDays;
    private Integer boxCount;
    private List<String> customsCommodityCodes;
    private OfferWeightDimensionsDTO weightDimensions;
    private List<DayOfWeekType> supplyScheduleDays;
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
     * Default constructor.
     */
    public MappingsOfferInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create MappingsOfferInfoDTO.
     *
     * @param name Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
     * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param category Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
     * @param vendor Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
     * @param vendorCode Артикул товара от производителя.
     * @param description Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
     * @param id Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param feedId Идентификатор фида.
     * @param barcodes Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
     * @param urls URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
     * @param pictures Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. 
     * @param manufacturer Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
     * @param manufacturerCountries Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
     * @param minShipment Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
     * @param transportUnitSize Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
     * @param quantumOfSupply Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
     * @param deliveryDurationDays Срок, за который продавец поставляет товары на склад, в днях.
     * @param boxCount Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
     * @param customsCommodityCodes Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
     * @param weightDimensions weightDimensions
     * @param supplyScheduleDays Дни недели, в которые продавец поставляет товары на склад.
     * @param shelfLifeDays {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
     * @param lifeTimeDays {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
     * @param guaranteePeriodDays Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
     * @param processingState processingState
     * @param availability availability
     * @param shelfLife shelfLife
     * @param lifeTime lifeTime
     * @param guaranteePeriod guaranteePeriod
     * @param certificate Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
     */
    public MappingsOfferInfoDTO(
        String name, 
        String shopSku, 
        String category, 
        String vendor, 
        String vendorCode, 
        String description, 
        String id, 
        Long feedId, 
        List<String> barcodes, 
        List<String> urls, 
        List<String> pictures, 
        String manufacturer, 
        List<String> manufacturerCountries, 
        Integer minShipment, 
        Integer transportUnitSize, 
        Integer quantumOfSupply, 
        Integer deliveryDurationDays, 
        Integer boxCount, 
        List<String> customsCommodityCodes, 
        OfferWeightDimensionsDTO weightDimensions, 
        List<DayOfWeekType> supplyScheduleDays, 
        Integer shelfLifeDays, 
        Integer lifeTimeDays, 
        Integer guaranteePeriodDays, 
        OfferProcessingStateDTO processingState, 
        OfferAvailabilityStatusType availability, 
        TimePeriodDTO shelfLife, 
        TimePeriodDTO lifeTime, 
        TimePeriodDTO guaranteePeriod, 
        String certificate
    ) {
        this.name = name;
        this.shopSku = shopSku;
        this.category = category;
        this.vendor = vendor;
        this.vendorCode = vendorCode;
        this.description = description;
        this.id = id;
        this.feedId = feedId;
        this.barcodes = barcodes;
        this.urls = urls;
        this.pictures = pictures;
        this.manufacturer = manufacturer;
        this.manufacturerCountries = manufacturerCountries;
        this.minShipment = minShipment;
        this.transportUnitSize = transportUnitSize;
        this.quantumOfSupply = quantumOfSupply;
        this.deliveryDurationDays = deliveryDurationDays;
        this.boxCount = boxCount;
        this.customsCommodityCodes = customsCommodityCodes;
        this.weightDimensions = weightDimensions;
        this.supplyScheduleDays = supplyScheduleDays;
        this.shelfLifeDays = shelfLifeDays;
        this.lifeTimeDays = lifeTimeDays;
        this.guaranteePeriodDays = guaranteePeriodDays;
        this.processingState = processingState;
        this.availability = availability;
        this.shelfLife = shelfLife;
        this.lifeTime = lifeTime;
        this.guaranteePeriod = guaranteePeriod;
        this.certificate = certificate;
    }



    /**
     * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return shopSku
     */
    public String getShopSku() {
        return shopSku;
    }

    public void setShopSku(String shopSku) {
        this.shopSku = shopSku;
    }

    /**
     * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * Артикул товара от производителя.
     * @return vendorCode
     */
    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /**
     * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Идентификатор фида.
     * @return feedId
     */
    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    /**
     * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
     * @return barcodes
     */
    public List<String> getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(List<String> barcodes) {
        this.barcodes = barcodes;
    }

    /**
     * URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    /**
     * Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
     * @return pictures
     */
    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    /**
     * Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
     * @return manufacturerCountries
     */
    public List<String> getManufacturerCountries() {
        return manufacturerCountries;
    }

    public void setManufacturerCountries(List<String> manufacturerCountries) {
        this.manufacturerCountries = manufacturerCountries;
    }

    /**
     * Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
     * @return minShipment
     */
    public Integer getMinShipment() {
        return minShipment;
    }

    public void setMinShipment(Integer minShipment) {
        this.minShipment = minShipment;
    }

    /**
     * Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
     * @return transportUnitSize
     */
    public Integer getTransportUnitSize() {
        return transportUnitSize;
    }

    public void setTransportUnitSize(Integer transportUnitSize) {
        this.transportUnitSize = transportUnitSize;
    }

    /**
     * Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
     * @return quantumOfSupply
     */
    public Integer getQuantumOfSupply() {
        return quantumOfSupply;
    }

    public void setQuantumOfSupply(Integer quantumOfSupply) {
        this.quantumOfSupply = quantumOfSupply;
    }

    /**
     * Срок, за который продавец поставляет товары на склад, в днях.
     * @return deliveryDurationDays
     */
    public Integer getDeliveryDurationDays() {
        return deliveryDurationDays;
    }

    public void setDeliveryDurationDays(Integer deliveryDurationDays) {
        this.deliveryDurationDays = deliveryDurationDays;
    }

    /**
     * Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
     * @return boxCount
     */
    public Integer getBoxCount() {
        return boxCount;
    }

    public void setBoxCount(Integer boxCount) {
        this.boxCount = boxCount;
    }

    /**
     * Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
     * @return customsCommodityCodes
     */
    public List<String> getCustomsCommodityCodes() {
        return customsCommodityCodes;
    }

    public void setCustomsCommodityCodes(List<String> customsCommodityCodes) {
        this.customsCommodityCodes = customsCommodityCodes;
    }

    /**
     * Get weightDimensions
     * @return weightDimensions
     */
    public OfferWeightDimensionsDTO getWeightDimensions() {
        return weightDimensions;
    }

    public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
        this.weightDimensions = weightDimensions;
    }

    /**
     * Дни недели, в которые продавец поставляет товары на склад.
     * @return supplyScheduleDays
     */
    public List<DayOfWeekType> getSupplyScheduleDays() {
        return supplyScheduleDays;
    }

    public void setSupplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
        this.supplyScheduleDays = supplyScheduleDays;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
     * @return shelfLifeDays
     */
    public Integer getShelfLifeDays() {
        return shelfLifeDays;
    }

    public void setShelfLifeDays(Integer shelfLifeDays) {
        this.shelfLifeDays = shelfLifeDays;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
     * @return lifeTimeDays
     */
    public Integer getLifeTimeDays() {
        return lifeTimeDays;
    }

    public void setLifeTimeDays(Integer lifeTimeDays) {
        this.lifeTimeDays = lifeTimeDays;
    }

    /**
     * Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
     * @return guaranteePeriodDays
     */
    public Integer getGuaranteePeriodDays() {
        return guaranteePeriodDays;
    }

    public void setGuaranteePeriodDays(Integer guaranteePeriodDays) {
        this.guaranteePeriodDays = guaranteePeriodDays;
    }

    /**
     * Get processingState
     * @return processingState
     */
    public OfferProcessingStateDTO getProcessingState() {
        return processingState;
    }

    public void setProcessingState(OfferProcessingStateDTO processingState) {
        this.processingState = processingState;
    }

    /**
     * Get availability
     * @return availability
     */
    public OfferAvailabilityStatusType getAvailability() {
        return availability;
    }

    public void setAvailability(OfferAvailabilityStatusType availability) {
        this.availability = availability;
    }

    /**
     * Get shelfLife
     * @return shelfLife
     */
    public TimePeriodDTO getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(TimePeriodDTO shelfLife) {
        this.shelfLife = shelfLife;
    }

    /**
     * Get lifeTime
     * @return lifeTime
     */
    public TimePeriodDTO getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(TimePeriodDTO lifeTime) {
        this.lifeTime = lifeTime;
    }

    /**
     * Get guaranteePeriod
     * @return guaranteePeriod
     */
    public TimePeriodDTO getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(TimePeriodDTO guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    /**
     * Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

