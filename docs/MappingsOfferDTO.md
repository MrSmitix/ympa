# MappingsOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  | [optional] 
**ShopSku** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Category** | Pointer to **string** | Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  | [optional] 
**Vendor** | Pointer to **string** | Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. | [optional] 
**VendorCode** | Pointer to **string** | Артикул товара от производителя. | [optional] 
**Description** | Pointer to **string** | Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  | [optional] 
**Id** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**FeedId** | Pointer to **int64** | Идентификатор фида. | [optional] 
**Barcodes** | Pointer to **[]string** | Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)   | [optional] 
**Urls** | Pointer to **[]string** | URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url.  | [optional] 
**Pictures** | Pointer to **[]string** | Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;.  | [optional] 
**Manufacturer** | Pointer to **string** | Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр.  | [optional] 
**ManufacturerCountries** | Pointer to **[]string** | Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран.  | [optional] 
**MinShipment** | Pointer to **int32** | Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60.  | [optional] 
**TransportUnitSize** | Pointer to **int32** | Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6.  | [optional] 
**QuantumOfSupply** | Pointer to **int32** | Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12.  | [optional] 
**DeliveryDurationDays** | Pointer to **int32** | Срок, за который продавец поставляет товары на склад, в днях. | [optional] 
**BoxCount** | Pointer to **int32** | Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр.  | [optional] 
**CustomsCommodityCodes** | Pointer to **[]string** | Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД.  | [optional] 
**WeightDimensions** | Pointer to [**OfferWeightDimensionsDTO**](OfferWeightDimensionsDTO.md) |  | [optional] 
**SupplyScheduleDays** | Pointer to [**[]DayOfWeekType**](DayOfWeekType.md) | Дни недели, в которые продавец поставляет товары на склад. | [optional] 
**ShelfLifeDays** | Pointer to **int32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования.  | [optional] 
**LifeTimeDays** | Pointer to **int32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки.  | [optional] 
**GuaranteePeriodDays** | Pointer to **int32** | Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара.  | [optional] 
**ProcessingState** | Pointer to [**OfferProcessingStateDTO**](OfferProcessingStateDTO.md) |  | [optional] 
**Availability** | Pointer to [**OfferAvailabilityStatusType**](OfferAvailabilityStatusType.md) |  | [optional] 
**ShelfLife** | Pointer to [**TimePeriodDTO**](TimePeriodDTO.md) |  | [optional] 
**LifeTime** | Pointer to [**TimePeriodDTO**](TimePeriodDTO.md) |  | [optional] 
**GuaranteePeriod** | Pointer to [**TimePeriodDTO**](TimePeriodDTO.md) |  | [optional] 
**Certificate** | Pointer to **string** | Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html)  | [optional] 
**Price** | Pointer to **float32** | Цена на товар в рублях. | [optional] 

## Methods

### NewMappingsOfferDTO

`func NewMappingsOfferDTO() *MappingsOfferDTO`

NewMappingsOfferDTO instantiates a new MappingsOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMappingsOfferDTOWithDefaults

`func NewMappingsOfferDTOWithDefaults() *MappingsOfferDTO`

NewMappingsOfferDTOWithDefaults instantiates a new MappingsOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *MappingsOfferDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MappingsOfferDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MappingsOfferDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *MappingsOfferDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetShopSku

`func (o *MappingsOfferDTO) GetShopSku() string`

GetShopSku returns the ShopSku field if non-nil, zero value otherwise.

### GetShopSkuOk

`func (o *MappingsOfferDTO) GetShopSkuOk() (*string, bool)`

GetShopSkuOk returns a tuple with the ShopSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopSku

`func (o *MappingsOfferDTO) SetShopSku(v string)`

SetShopSku sets ShopSku field to given value.

### HasShopSku

`func (o *MappingsOfferDTO) HasShopSku() bool`

HasShopSku returns a boolean if a field has been set.

### GetCategory

`func (o *MappingsOfferDTO) GetCategory() string`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *MappingsOfferDTO) GetCategoryOk() (*string, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *MappingsOfferDTO) SetCategory(v string)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *MappingsOfferDTO) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetVendor

`func (o *MappingsOfferDTO) GetVendor() string`

GetVendor returns the Vendor field if non-nil, zero value otherwise.

### GetVendorOk

`func (o *MappingsOfferDTO) GetVendorOk() (*string, bool)`

GetVendorOk returns a tuple with the Vendor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendor

`func (o *MappingsOfferDTO) SetVendor(v string)`

SetVendor sets Vendor field to given value.

### HasVendor

`func (o *MappingsOfferDTO) HasVendor() bool`

HasVendor returns a boolean if a field has been set.

### GetVendorCode

`func (o *MappingsOfferDTO) GetVendorCode() string`

GetVendorCode returns the VendorCode field if non-nil, zero value otherwise.

### GetVendorCodeOk

`func (o *MappingsOfferDTO) GetVendorCodeOk() (*string, bool)`

GetVendorCodeOk returns a tuple with the VendorCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendorCode

`func (o *MappingsOfferDTO) SetVendorCode(v string)`

SetVendorCode sets VendorCode field to given value.

### HasVendorCode

`func (o *MappingsOfferDTO) HasVendorCode() bool`

HasVendorCode returns a boolean if a field has been set.

### GetDescription

`func (o *MappingsOfferDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *MappingsOfferDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *MappingsOfferDTO) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *MappingsOfferDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetId

`func (o *MappingsOfferDTO) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MappingsOfferDTO) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MappingsOfferDTO) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *MappingsOfferDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetFeedId

`func (o *MappingsOfferDTO) GetFeedId() int64`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *MappingsOfferDTO) GetFeedIdOk() (*int64, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *MappingsOfferDTO) SetFeedId(v int64)`

SetFeedId sets FeedId field to given value.

### HasFeedId

`func (o *MappingsOfferDTO) HasFeedId() bool`

HasFeedId returns a boolean if a field has been set.

### GetBarcodes

`func (o *MappingsOfferDTO) GetBarcodes() []string`

GetBarcodes returns the Barcodes field if non-nil, zero value otherwise.

### GetBarcodesOk

`func (o *MappingsOfferDTO) GetBarcodesOk() (*[]string, bool)`

GetBarcodesOk returns a tuple with the Barcodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBarcodes

`func (o *MappingsOfferDTO) SetBarcodes(v []string)`

SetBarcodes sets Barcodes field to given value.

### HasBarcodes

`func (o *MappingsOfferDTO) HasBarcodes() bool`

HasBarcodes returns a boolean if a field has been set.

### SetBarcodesNil

`func (o *MappingsOfferDTO) SetBarcodesNil(b bool)`

 SetBarcodesNil sets the value for Barcodes to be an explicit nil

### UnsetBarcodes
`func (o *MappingsOfferDTO) UnsetBarcodes()`

UnsetBarcodes ensures that no value is present for Barcodes, not even an explicit nil
### GetUrls

`func (o *MappingsOfferDTO) GetUrls() []string`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *MappingsOfferDTO) GetUrlsOk() (*[]string, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *MappingsOfferDTO) SetUrls(v []string)`

SetUrls sets Urls field to given value.

### HasUrls

`func (o *MappingsOfferDTO) HasUrls() bool`

HasUrls returns a boolean if a field has been set.

### SetUrlsNil

`func (o *MappingsOfferDTO) SetUrlsNil(b bool)`

 SetUrlsNil sets the value for Urls to be an explicit nil

### UnsetUrls
`func (o *MappingsOfferDTO) UnsetUrls()`

UnsetUrls ensures that no value is present for Urls, not even an explicit nil
### GetPictures

`func (o *MappingsOfferDTO) GetPictures() []string`

GetPictures returns the Pictures field if non-nil, zero value otherwise.

### GetPicturesOk

`func (o *MappingsOfferDTO) GetPicturesOk() (*[]string, bool)`

GetPicturesOk returns a tuple with the Pictures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPictures

`func (o *MappingsOfferDTO) SetPictures(v []string)`

SetPictures sets Pictures field to given value.

### HasPictures

`func (o *MappingsOfferDTO) HasPictures() bool`

HasPictures returns a boolean if a field has been set.

### SetPicturesNil

`func (o *MappingsOfferDTO) SetPicturesNil(b bool)`

 SetPicturesNil sets the value for Pictures to be an explicit nil

### UnsetPictures
`func (o *MappingsOfferDTO) UnsetPictures()`

UnsetPictures ensures that no value is present for Pictures, not even an explicit nil
### GetManufacturer

`func (o *MappingsOfferDTO) GetManufacturer() string`

GetManufacturer returns the Manufacturer field if non-nil, zero value otherwise.

### GetManufacturerOk

`func (o *MappingsOfferDTO) GetManufacturerOk() (*string, bool)`

GetManufacturerOk returns a tuple with the Manufacturer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManufacturer

`func (o *MappingsOfferDTO) SetManufacturer(v string)`

SetManufacturer sets Manufacturer field to given value.

### HasManufacturer

`func (o *MappingsOfferDTO) HasManufacturer() bool`

HasManufacturer returns a boolean if a field has been set.

### GetManufacturerCountries

`func (o *MappingsOfferDTO) GetManufacturerCountries() []string`

GetManufacturerCountries returns the ManufacturerCountries field if non-nil, zero value otherwise.

### GetManufacturerCountriesOk

`func (o *MappingsOfferDTO) GetManufacturerCountriesOk() (*[]string, bool)`

GetManufacturerCountriesOk returns a tuple with the ManufacturerCountries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManufacturerCountries

`func (o *MappingsOfferDTO) SetManufacturerCountries(v []string)`

SetManufacturerCountries sets ManufacturerCountries field to given value.

### HasManufacturerCountries

`func (o *MappingsOfferDTO) HasManufacturerCountries() bool`

HasManufacturerCountries returns a boolean if a field has been set.

### SetManufacturerCountriesNil

`func (o *MappingsOfferDTO) SetManufacturerCountriesNil(b bool)`

 SetManufacturerCountriesNil sets the value for ManufacturerCountries to be an explicit nil

### UnsetManufacturerCountries
`func (o *MappingsOfferDTO) UnsetManufacturerCountries()`

UnsetManufacturerCountries ensures that no value is present for ManufacturerCountries, not even an explicit nil
### GetMinShipment

`func (o *MappingsOfferDTO) GetMinShipment() int32`

GetMinShipment returns the MinShipment field if non-nil, zero value otherwise.

### GetMinShipmentOk

`func (o *MappingsOfferDTO) GetMinShipmentOk() (*int32, bool)`

GetMinShipmentOk returns a tuple with the MinShipment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinShipment

`func (o *MappingsOfferDTO) SetMinShipment(v int32)`

SetMinShipment sets MinShipment field to given value.

### HasMinShipment

`func (o *MappingsOfferDTO) HasMinShipment() bool`

HasMinShipment returns a boolean if a field has been set.

### GetTransportUnitSize

`func (o *MappingsOfferDTO) GetTransportUnitSize() int32`

GetTransportUnitSize returns the TransportUnitSize field if non-nil, zero value otherwise.

### GetTransportUnitSizeOk

`func (o *MappingsOfferDTO) GetTransportUnitSizeOk() (*int32, bool)`

GetTransportUnitSizeOk returns a tuple with the TransportUnitSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransportUnitSize

`func (o *MappingsOfferDTO) SetTransportUnitSize(v int32)`

SetTransportUnitSize sets TransportUnitSize field to given value.

### HasTransportUnitSize

`func (o *MappingsOfferDTO) HasTransportUnitSize() bool`

HasTransportUnitSize returns a boolean if a field has been set.

### GetQuantumOfSupply

`func (o *MappingsOfferDTO) GetQuantumOfSupply() int32`

GetQuantumOfSupply returns the QuantumOfSupply field if non-nil, zero value otherwise.

### GetQuantumOfSupplyOk

`func (o *MappingsOfferDTO) GetQuantumOfSupplyOk() (*int32, bool)`

GetQuantumOfSupplyOk returns a tuple with the QuantumOfSupply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantumOfSupply

`func (o *MappingsOfferDTO) SetQuantumOfSupply(v int32)`

SetQuantumOfSupply sets QuantumOfSupply field to given value.

### HasQuantumOfSupply

`func (o *MappingsOfferDTO) HasQuantumOfSupply() bool`

HasQuantumOfSupply returns a boolean if a field has been set.

### GetDeliveryDurationDays

`func (o *MappingsOfferDTO) GetDeliveryDurationDays() int32`

GetDeliveryDurationDays returns the DeliveryDurationDays field if non-nil, zero value otherwise.

### GetDeliveryDurationDaysOk

`func (o *MappingsOfferDTO) GetDeliveryDurationDaysOk() (*int32, bool)`

GetDeliveryDurationDaysOk returns a tuple with the DeliveryDurationDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryDurationDays

`func (o *MappingsOfferDTO) SetDeliveryDurationDays(v int32)`

SetDeliveryDurationDays sets DeliveryDurationDays field to given value.

### HasDeliveryDurationDays

`func (o *MappingsOfferDTO) HasDeliveryDurationDays() bool`

HasDeliveryDurationDays returns a boolean if a field has been set.

### GetBoxCount

`func (o *MappingsOfferDTO) GetBoxCount() int32`

GetBoxCount returns the BoxCount field if non-nil, zero value otherwise.

### GetBoxCountOk

`func (o *MappingsOfferDTO) GetBoxCountOk() (*int32, bool)`

GetBoxCountOk returns a tuple with the BoxCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxCount

`func (o *MappingsOfferDTO) SetBoxCount(v int32)`

SetBoxCount sets BoxCount field to given value.

### HasBoxCount

`func (o *MappingsOfferDTO) HasBoxCount() bool`

HasBoxCount returns a boolean if a field has been set.

### GetCustomsCommodityCodes

`func (o *MappingsOfferDTO) GetCustomsCommodityCodes() []string`

GetCustomsCommodityCodes returns the CustomsCommodityCodes field if non-nil, zero value otherwise.

### GetCustomsCommodityCodesOk

`func (o *MappingsOfferDTO) GetCustomsCommodityCodesOk() (*[]string, bool)`

GetCustomsCommodityCodesOk returns a tuple with the CustomsCommodityCodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomsCommodityCodes

`func (o *MappingsOfferDTO) SetCustomsCommodityCodes(v []string)`

SetCustomsCommodityCodes sets CustomsCommodityCodes field to given value.

### HasCustomsCommodityCodes

`func (o *MappingsOfferDTO) HasCustomsCommodityCodes() bool`

HasCustomsCommodityCodes returns a boolean if a field has been set.

### SetCustomsCommodityCodesNil

`func (o *MappingsOfferDTO) SetCustomsCommodityCodesNil(b bool)`

 SetCustomsCommodityCodesNil sets the value for CustomsCommodityCodes to be an explicit nil

### UnsetCustomsCommodityCodes
`func (o *MappingsOfferDTO) UnsetCustomsCommodityCodes()`

UnsetCustomsCommodityCodes ensures that no value is present for CustomsCommodityCodes, not even an explicit nil
### GetWeightDimensions

`func (o *MappingsOfferDTO) GetWeightDimensions() OfferWeightDimensionsDTO`

GetWeightDimensions returns the WeightDimensions field if non-nil, zero value otherwise.

### GetWeightDimensionsOk

`func (o *MappingsOfferDTO) GetWeightDimensionsOk() (*OfferWeightDimensionsDTO, bool)`

GetWeightDimensionsOk returns a tuple with the WeightDimensions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeightDimensions

`func (o *MappingsOfferDTO) SetWeightDimensions(v OfferWeightDimensionsDTO)`

SetWeightDimensions sets WeightDimensions field to given value.

### HasWeightDimensions

`func (o *MappingsOfferDTO) HasWeightDimensions() bool`

HasWeightDimensions returns a boolean if a field has been set.

### GetSupplyScheduleDays

`func (o *MappingsOfferDTO) GetSupplyScheduleDays() []DayOfWeekType`

GetSupplyScheduleDays returns the SupplyScheduleDays field if non-nil, zero value otherwise.

### GetSupplyScheduleDaysOk

`func (o *MappingsOfferDTO) GetSupplyScheduleDaysOk() (*[]DayOfWeekType, bool)`

GetSupplyScheduleDaysOk returns a tuple with the SupplyScheduleDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupplyScheduleDays

`func (o *MappingsOfferDTO) SetSupplyScheduleDays(v []DayOfWeekType)`

SetSupplyScheduleDays sets SupplyScheduleDays field to given value.

### HasSupplyScheduleDays

`func (o *MappingsOfferDTO) HasSupplyScheduleDays() bool`

HasSupplyScheduleDays returns a boolean if a field has been set.

### SetSupplyScheduleDaysNil

`func (o *MappingsOfferDTO) SetSupplyScheduleDaysNil(b bool)`

 SetSupplyScheduleDaysNil sets the value for SupplyScheduleDays to be an explicit nil

### UnsetSupplyScheduleDays
`func (o *MappingsOfferDTO) UnsetSupplyScheduleDays()`

UnsetSupplyScheduleDays ensures that no value is present for SupplyScheduleDays, not even an explicit nil
### GetShelfLifeDays

`func (o *MappingsOfferDTO) GetShelfLifeDays() int32`

GetShelfLifeDays returns the ShelfLifeDays field if non-nil, zero value otherwise.

### GetShelfLifeDaysOk

`func (o *MappingsOfferDTO) GetShelfLifeDaysOk() (*int32, bool)`

GetShelfLifeDaysOk returns a tuple with the ShelfLifeDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShelfLifeDays

`func (o *MappingsOfferDTO) SetShelfLifeDays(v int32)`

SetShelfLifeDays sets ShelfLifeDays field to given value.

### HasShelfLifeDays

`func (o *MappingsOfferDTO) HasShelfLifeDays() bool`

HasShelfLifeDays returns a boolean if a field has been set.

### GetLifeTimeDays

`func (o *MappingsOfferDTO) GetLifeTimeDays() int32`

GetLifeTimeDays returns the LifeTimeDays field if non-nil, zero value otherwise.

### GetLifeTimeDaysOk

`func (o *MappingsOfferDTO) GetLifeTimeDaysOk() (*int32, bool)`

GetLifeTimeDaysOk returns a tuple with the LifeTimeDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifeTimeDays

`func (o *MappingsOfferDTO) SetLifeTimeDays(v int32)`

SetLifeTimeDays sets LifeTimeDays field to given value.

### HasLifeTimeDays

`func (o *MappingsOfferDTO) HasLifeTimeDays() bool`

HasLifeTimeDays returns a boolean if a field has been set.

### GetGuaranteePeriodDays

`func (o *MappingsOfferDTO) GetGuaranteePeriodDays() int32`

GetGuaranteePeriodDays returns the GuaranteePeriodDays field if non-nil, zero value otherwise.

### GetGuaranteePeriodDaysOk

`func (o *MappingsOfferDTO) GetGuaranteePeriodDaysOk() (*int32, bool)`

GetGuaranteePeriodDaysOk returns a tuple with the GuaranteePeriodDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuaranteePeriodDays

`func (o *MappingsOfferDTO) SetGuaranteePeriodDays(v int32)`

SetGuaranteePeriodDays sets GuaranteePeriodDays field to given value.

### HasGuaranteePeriodDays

`func (o *MappingsOfferDTO) HasGuaranteePeriodDays() bool`

HasGuaranteePeriodDays returns a boolean if a field has been set.

### GetProcessingState

`func (o *MappingsOfferDTO) GetProcessingState() OfferProcessingStateDTO`

GetProcessingState returns the ProcessingState field if non-nil, zero value otherwise.

### GetProcessingStateOk

`func (o *MappingsOfferDTO) GetProcessingStateOk() (*OfferProcessingStateDTO, bool)`

GetProcessingStateOk returns a tuple with the ProcessingState field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessingState

`func (o *MappingsOfferDTO) SetProcessingState(v OfferProcessingStateDTO)`

SetProcessingState sets ProcessingState field to given value.

### HasProcessingState

`func (o *MappingsOfferDTO) HasProcessingState() bool`

HasProcessingState returns a boolean if a field has been set.

### GetAvailability

`func (o *MappingsOfferDTO) GetAvailability() OfferAvailabilityStatusType`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *MappingsOfferDTO) GetAvailabilityOk() (*OfferAvailabilityStatusType, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *MappingsOfferDTO) SetAvailability(v OfferAvailabilityStatusType)`

SetAvailability sets Availability field to given value.

### HasAvailability

`func (o *MappingsOfferDTO) HasAvailability() bool`

HasAvailability returns a boolean if a field has been set.

### GetShelfLife

`func (o *MappingsOfferDTO) GetShelfLife() TimePeriodDTO`

GetShelfLife returns the ShelfLife field if non-nil, zero value otherwise.

### GetShelfLifeOk

`func (o *MappingsOfferDTO) GetShelfLifeOk() (*TimePeriodDTO, bool)`

GetShelfLifeOk returns a tuple with the ShelfLife field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShelfLife

`func (o *MappingsOfferDTO) SetShelfLife(v TimePeriodDTO)`

SetShelfLife sets ShelfLife field to given value.

### HasShelfLife

`func (o *MappingsOfferDTO) HasShelfLife() bool`

HasShelfLife returns a boolean if a field has been set.

### GetLifeTime

`func (o *MappingsOfferDTO) GetLifeTime() TimePeriodDTO`

GetLifeTime returns the LifeTime field if non-nil, zero value otherwise.

### GetLifeTimeOk

`func (o *MappingsOfferDTO) GetLifeTimeOk() (*TimePeriodDTO, bool)`

GetLifeTimeOk returns a tuple with the LifeTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifeTime

`func (o *MappingsOfferDTO) SetLifeTime(v TimePeriodDTO)`

SetLifeTime sets LifeTime field to given value.

### HasLifeTime

`func (o *MappingsOfferDTO) HasLifeTime() bool`

HasLifeTime returns a boolean if a field has been set.

### GetGuaranteePeriod

`func (o *MappingsOfferDTO) GetGuaranteePeriod() TimePeriodDTO`

GetGuaranteePeriod returns the GuaranteePeriod field if non-nil, zero value otherwise.

### GetGuaranteePeriodOk

`func (o *MappingsOfferDTO) GetGuaranteePeriodOk() (*TimePeriodDTO, bool)`

GetGuaranteePeriodOk returns a tuple with the GuaranteePeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuaranteePeriod

`func (o *MappingsOfferDTO) SetGuaranteePeriod(v TimePeriodDTO)`

SetGuaranteePeriod sets GuaranteePeriod field to given value.

### HasGuaranteePeriod

`func (o *MappingsOfferDTO) HasGuaranteePeriod() bool`

HasGuaranteePeriod returns a boolean if a field has been set.

### GetCertificate

`func (o *MappingsOfferDTO) GetCertificate() string`

GetCertificate returns the Certificate field if non-nil, zero value otherwise.

### GetCertificateOk

`func (o *MappingsOfferDTO) GetCertificateOk() (*string, bool)`

GetCertificateOk returns a tuple with the Certificate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCertificate

`func (o *MappingsOfferDTO) SetCertificate(v string)`

SetCertificate sets Certificate field to given value.

### HasCertificate

`func (o *MappingsOfferDTO) HasCertificate() bool`

HasCertificate returns a boolean if a field has been set.

### GetPrice

`func (o *MappingsOfferDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *MappingsOfferDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *MappingsOfferDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *MappingsOfferDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


