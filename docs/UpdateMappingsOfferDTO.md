# UpdateMappingsOfferDTO

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

## Methods

### NewUpdateMappingsOfferDTO

`func NewUpdateMappingsOfferDTO() *UpdateMappingsOfferDTO`

NewUpdateMappingsOfferDTO instantiates a new UpdateMappingsOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateMappingsOfferDTOWithDefaults

`func NewUpdateMappingsOfferDTOWithDefaults() *UpdateMappingsOfferDTO`

NewUpdateMappingsOfferDTOWithDefaults instantiates a new UpdateMappingsOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *UpdateMappingsOfferDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *UpdateMappingsOfferDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *UpdateMappingsOfferDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *UpdateMappingsOfferDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetShopSku

`func (o *UpdateMappingsOfferDTO) GetShopSku() string`

GetShopSku returns the ShopSku field if non-nil, zero value otherwise.

### GetShopSkuOk

`func (o *UpdateMappingsOfferDTO) GetShopSkuOk() (*string, bool)`

GetShopSkuOk returns a tuple with the ShopSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopSku

`func (o *UpdateMappingsOfferDTO) SetShopSku(v string)`

SetShopSku sets ShopSku field to given value.

### HasShopSku

`func (o *UpdateMappingsOfferDTO) HasShopSku() bool`

HasShopSku returns a boolean if a field has been set.

### GetCategory

`func (o *UpdateMappingsOfferDTO) GetCategory() string`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *UpdateMappingsOfferDTO) GetCategoryOk() (*string, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *UpdateMappingsOfferDTO) SetCategory(v string)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *UpdateMappingsOfferDTO) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetVendor

`func (o *UpdateMappingsOfferDTO) GetVendor() string`

GetVendor returns the Vendor field if non-nil, zero value otherwise.

### GetVendorOk

`func (o *UpdateMappingsOfferDTO) GetVendorOk() (*string, bool)`

GetVendorOk returns a tuple with the Vendor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendor

`func (o *UpdateMappingsOfferDTO) SetVendor(v string)`

SetVendor sets Vendor field to given value.

### HasVendor

`func (o *UpdateMappingsOfferDTO) HasVendor() bool`

HasVendor returns a boolean if a field has been set.

### GetVendorCode

`func (o *UpdateMappingsOfferDTO) GetVendorCode() string`

GetVendorCode returns the VendorCode field if non-nil, zero value otherwise.

### GetVendorCodeOk

`func (o *UpdateMappingsOfferDTO) GetVendorCodeOk() (*string, bool)`

GetVendorCodeOk returns a tuple with the VendorCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendorCode

`func (o *UpdateMappingsOfferDTO) SetVendorCode(v string)`

SetVendorCode sets VendorCode field to given value.

### HasVendorCode

`func (o *UpdateMappingsOfferDTO) HasVendorCode() bool`

HasVendorCode returns a boolean if a field has been set.

### GetDescription

`func (o *UpdateMappingsOfferDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *UpdateMappingsOfferDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *UpdateMappingsOfferDTO) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *UpdateMappingsOfferDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetId

`func (o *UpdateMappingsOfferDTO) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *UpdateMappingsOfferDTO) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *UpdateMappingsOfferDTO) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *UpdateMappingsOfferDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetFeedId

`func (o *UpdateMappingsOfferDTO) GetFeedId() int64`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *UpdateMappingsOfferDTO) GetFeedIdOk() (*int64, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *UpdateMappingsOfferDTO) SetFeedId(v int64)`

SetFeedId sets FeedId field to given value.

### HasFeedId

`func (o *UpdateMappingsOfferDTO) HasFeedId() bool`

HasFeedId returns a boolean if a field has been set.

### GetBarcodes

`func (o *UpdateMappingsOfferDTO) GetBarcodes() []string`

GetBarcodes returns the Barcodes field if non-nil, zero value otherwise.

### GetBarcodesOk

`func (o *UpdateMappingsOfferDTO) GetBarcodesOk() (*[]string, bool)`

GetBarcodesOk returns a tuple with the Barcodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBarcodes

`func (o *UpdateMappingsOfferDTO) SetBarcodes(v []string)`

SetBarcodes sets Barcodes field to given value.

### HasBarcodes

`func (o *UpdateMappingsOfferDTO) HasBarcodes() bool`

HasBarcodes returns a boolean if a field has been set.

### SetBarcodesNil

`func (o *UpdateMappingsOfferDTO) SetBarcodesNil(b bool)`

 SetBarcodesNil sets the value for Barcodes to be an explicit nil

### UnsetBarcodes
`func (o *UpdateMappingsOfferDTO) UnsetBarcodes()`

UnsetBarcodes ensures that no value is present for Barcodes, not even an explicit nil
### GetUrls

`func (o *UpdateMappingsOfferDTO) GetUrls() []string`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *UpdateMappingsOfferDTO) GetUrlsOk() (*[]string, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *UpdateMappingsOfferDTO) SetUrls(v []string)`

SetUrls sets Urls field to given value.

### HasUrls

`func (o *UpdateMappingsOfferDTO) HasUrls() bool`

HasUrls returns a boolean if a field has been set.

### SetUrlsNil

`func (o *UpdateMappingsOfferDTO) SetUrlsNil(b bool)`

 SetUrlsNil sets the value for Urls to be an explicit nil

### UnsetUrls
`func (o *UpdateMappingsOfferDTO) UnsetUrls()`

UnsetUrls ensures that no value is present for Urls, not even an explicit nil
### GetPictures

`func (o *UpdateMappingsOfferDTO) GetPictures() []string`

GetPictures returns the Pictures field if non-nil, zero value otherwise.

### GetPicturesOk

`func (o *UpdateMappingsOfferDTO) GetPicturesOk() (*[]string, bool)`

GetPicturesOk returns a tuple with the Pictures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPictures

`func (o *UpdateMappingsOfferDTO) SetPictures(v []string)`

SetPictures sets Pictures field to given value.

### HasPictures

`func (o *UpdateMappingsOfferDTO) HasPictures() bool`

HasPictures returns a boolean if a field has been set.

### SetPicturesNil

`func (o *UpdateMappingsOfferDTO) SetPicturesNil(b bool)`

 SetPicturesNil sets the value for Pictures to be an explicit nil

### UnsetPictures
`func (o *UpdateMappingsOfferDTO) UnsetPictures()`

UnsetPictures ensures that no value is present for Pictures, not even an explicit nil
### GetManufacturer

`func (o *UpdateMappingsOfferDTO) GetManufacturer() string`

GetManufacturer returns the Manufacturer field if non-nil, zero value otherwise.

### GetManufacturerOk

`func (o *UpdateMappingsOfferDTO) GetManufacturerOk() (*string, bool)`

GetManufacturerOk returns a tuple with the Manufacturer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManufacturer

`func (o *UpdateMappingsOfferDTO) SetManufacturer(v string)`

SetManufacturer sets Manufacturer field to given value.

### HasManufacturer

`func (o *UpdateMappingsOfferDTO) HasManufacturer() bool`

HasManufacturer returns a boolean if a field has been set.

### GetManufacturerCountries

`func (o *UpdateMappingsOfferDTO) GetManufacturerCountries() []string`

GetManufacturerCountries returns the ManufacturerCountries field if non-nil, zero value otherwise.

### GetManufacturerCountriesOk

`func (o *UpdateMappingsOfferDTO) GetManufacturerCountriesOk() (*[]string, bool)`

GetManufacturerCountriesOk returns a tuple with the ManufacturerCountries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManufacturerCountries

`func (o *UpdateMappingsOfferDTO) SetManufacturerCountries(v []string)`

SetManufacturerCountries sets ManufacturerCountries field to given value.

### HasManufacturerCountries

`func (o *UpdateMappingsOfferDTO) HasManufacturerCountries() bool`

HasManufacturerCountries returns a boolean if a field has been set.

### SetManufacturerCountriesNil

`func (o *UpdateMappingsOfferDTO) SetManufacturerCountriesNil(b bool)`

 SetManufacturerCountriesNil sets the value for ManufacturerCountries to be an explicit nil

### UnsetManufacturerCountries
`func (o *UpdateMappingsOfferDTO) UnsetManufacturerCountries()`

UnsetManufacturerCountries ensures that no value is present for ManufacturerCountries, not even an explicit nil
### GetMinShipment

`func (o *UpdateMappingsOfferDTO) GetMinShipment() int32`

GetMinShipment returns the MinShipment field if non-nil, zero value otherwise.

### GetMinShipmentOk

`func (o *UpdateMappingsOfferDTO) GetMinShipmentOk() (*int32, bool)`

GetMinShipmentOk returns a tuple with the MinShipment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinShipment

`func (o *UpdateMappingsOfferDTO) SetMinShipment(v int32)`

SetMinShipment sets MinShipment field to given value.

### HasMinShipment

`func (o *UpdateMappingsOfferDTO) HasMinShipment() bool`

HasMinShipment returns a boolean if a field has been set.

### GetTransportUnitSize

`func (o *UpdateMappingsOfferDTO) GetTransportUnitSize() int32`

GetTransportUnitSize returns the TransportUnitSize field if non-nil, zero value otherwise.

### GetTransportUnitSizeOk

`func (o *UpdateMappingsOfferDTO) GetTransportUnitSizeOk() (*int32, bool)`

GetTransportUnitSizeOk returns a tuple with the TransportUnitSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransportUnitSize

`func (o *UpdateMappingsOfferDTO) SetTransportUnitSize(v int32)`

SetTransportUnitSize sets TransportUnitSize field to given value.

### HasTransportUnitSize

`func (o *UpdateMappingsOfferDTO) HasTransportUnitSize() bool`

HasTransportUnitSize returns a boolean if a field has been set.

### GetQuantumOfSupply

`func (o *UpdateMappingsOfferDTO) GetQuantumOfSupply() int32`

GetQuantumOfSupply returns the QuantumOfSupply field if non-nil, zero value otherwise.

### GetQuantumOfSupplyOk

`func (o *UpdateMappingsOfferDTO) GetQuantumOfSupplyOk() (*int32, bool)`

GetQuantumOfSupplyOk returns a tuple with the QuantumOfSupply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantumOfSupply

`func (o *UpdateMappingsOfferDTO) SetQuantumOfSupply(v int32)`

SetQuantumOfSupply sets QuantumOfSupply field to given value.

### HasQuantumOfSupply

`func (o *UpdateMappingsOfferDTO) HasQuantumOfSupply() bool`

HasQuantumOfSupply returns a boolean if a field has been set.

### GetDeliveryDurationDays

`func (o *UpdateMappingsOfferDTO) GetDeliveryDurationDays() int32`

GetDeliveryDurationDays returns the DeliveryDurationDays field if non-nil, zero value otherwise.

### GetDeliveryDurationDaysOk

`func (o *UpdateMappingsOfferDTO) GetDeliveryDurationDaysOk() (*int32, bool)`

GetDeliveryDurationDaysOk returns a tuple with the DeliveryDurationDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryDurationDays

`func (o *UpdateMappingsOfferDTO) SetDeliveryDurationDays(v int32)`

SetDeliveryDurationDays sets DeliveryDurationDays field to given value.

### HasDeliveryDurationDays

`func (o *UpdateMappingsOfferDTO) HasDeliveryDurationDays() bool`

HasDeliveryDurationDays returns a boolean if a field has been set.

### GetBoxCount

`func (o *UpdateMappingsOfferDTO) GetBoxCount() int32`

GetBoxCount returns the BoxCount field if non-nil, zero value otherwise.

### GetBoxCountOk

`func (o *UpdateMappingsOfferDTO) GetBoxCountOk() (*int32, bool)`

GetBoxCountOk returns a tuple with the BoxCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxCount

`func (o *UpdateMappingsOfferDTO) SetBoxCount(v int32)`

SetBoxCount sets BoxCount field to given value.

### HasBoxCount

`func (o *UpdateMappingsOfferDTO) HasBoxCount() bool`

HasBoxCount returns a boolean if a field has been set.

### GetCustomsCommodityCodes

`func (o *UpdateMappingsOfferDTO) GetCustomsCommodityCodes() []string`

GetCustomsCommodityCodes returns the CustomsCommodityCodes field if non-nil, zero value otherwise.

### GetCustomsCommodityCodesOk

`func (o *UpdateMappingsOfferDTO) GetCustomsCommodityCodesOk() (*[]string, bool)`

GetCustomsCommodityCodesOk returns a tuple with the CustomsCommodityCodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomsCommodityCodes

`func (o *UpdateMappingsOfferDTO) SetCustomsCommodityCodes(v []string)`

SetCustomsCommodityCodes sets CustomsCommodityCodes field to given value.

### HasCustomsCommodityCodes

`func (o *UpdateMappingsOfferDTO) HasCustomsCommodityCodes() bool`

HasCustomsCommodityCodes returns a boolean if a field has been set.

### SetCustomsCommodityCodesNil

`func (o *UpdateMappingsOfferDTO) SetCustomsCommodityCodesNil(b bool)`

 SetCustomsCommodityCodesNil sets the value for CustomsCommodityCodes to be an explicit nil

### UnsetCustomsCommodityCodes
`func (o *UpdateMappingsOfferDTO) UnsetCustomsCommodityCodes()`

UnsetCustomsCommodityCodes ensures that no value is present for CustomsCommodityCodes, not even an explicit nil
### GetWeightDimensions

`func (o *UpdateMappingsOfferDTO) GetWeightDimensions() OfferWeightDimensionsDTO`

GetWeightDimensions returns the WeightDimensions field if non-nil, zero value otherwise.

### GetWeightDimensionsOk

`func (o *UpdateMappingsOfferDTO) GetWeightDimensionsOk() (*OfferWeightDimensionsDTO, bool)`

GetWeightDimensionsOk returns a tuple with the WeightDimensions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeightDimensions

`func (o *UpdateMappingsOfferDTO) SetWeightDimensions(v OfferWeightDimensionsDTO)`

SetWeightDimensions sets WeightDimensions field to given value.

### HasWeightDimensions

`func (o *UpdateMappingsOfferDTO) HasWeightDimensions() bool`

HasWeightDimensions returns a boolean if a field has been set.

### GetSupplyScheduleDays

`func (o *UpdateMappingsOfferDTO) GetSupplyScheduleDays() []DayOfWeekType`

GetSupplyScheduleDays returns the SupplyScheduleDays field if non-nil, zero value otherwise.

### GetSupplyScheduleDaysOk

`func (o *UpdateMappingsOfferDTO) GetSupplyScheduleDaysOk() (*[]DayOfWeekType, bool)`

GetSupplyScheduleDaysOk returns a tuple with the SupplyScheduleDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupplyScheduleDays

`func (o *UpdateMappingsOfferDTO) SetSupplyScheduleDays(v []DayOfWeekType)`

SetSupplyScheduleDays sets SupplyScheduleDays field to given value.

### HasSupplyScheduleDays

`func (o *UpdateMappingsOfferDTO) HasSupplyScheduleDays() bool`

HasSupplyScheduleDays returns a boolean if a field has been set.

### SetSupplyScheduleDaysNil

`func (o *UpdateMappingsOfferDTO) SetSupplyScheduleDaysNil(b bool)`

 SetSupplyScheduleDaysNil sets the value for SupplyScheduleDays to be an explicit nil

### UnsetSupplyScheduleDays
`func (o *UpdateMappingsOfferDTO) UnsetSupplyScheduleDays()`

UnsetSupplyScheduleDays ensures that no value is present for SupplyScheduleDays, not even an explicit nil
### GetShelfLifeDays

`func (o *UpdateMappingsOfferDTO) GetShelfLifeDays() int32`

GetShelfLifeDays returns the ShelfLifeDays field if non-nil, zero value otherwise.

### GetShelfLifeDaysOk

`func (o *UpdateMappingsOfferDTO) GetShelfLifeDaysOk() (*int32, bool)`

GetShelfLifeDaysOk returns a tuple with the ShelfLifeDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShelfLifeDays

`func (o *UpdateMappingsOfferDTO) SetShelfLifeDays(v int32)`

SetShelfLifeDays sets ShelfLifeDays field to given value.

### HasShelfLifeDays

`func (o *UpdateMappingsOfferDTO) HasShelfLifeDays() bool`

HasShelfLifeDays returns a boolean if a field has been set.

### GetLifeTimeDays

`func (o *UpdateMappingsOfferDTO) GetLifeTimeDays() int32`

GetLifeTimeDays returns the LifeTimeDays field if non-nil, zero value otherwise.

### GetLifeTimeDaysOk

`func (o *UpdateMappingsOfferDTO) GetLifeTimeDaysOk() (*int32, bool)`

GetLifeTimeDaysOk returns a tuple with the LifeTimeDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifeTimeDays

`func (o *UpdateMappingsOfferDTO) SetLifeTimeDays(v int32)`

SetLifeTimeDays sets LifeTimeDays field to given value.

### HasLifeTimeDays

`func (o *UpdateMappingsOfferDTO) HasLifeTimeDays() bool`

HasLifeTimeDays returns a boolean if a field has been set.

### GetGuaranteePeriodDays

`func (o *UpdateMappingsOfferDTO) GetGuaranteePeriodDays() int32`

GetGuaranteePeriodDays returns the GuaranteePeriodDays field if non-nil, zero value otherwise.

### GetGuaranteePeriodDaysOk

`func (o *UpdateMappingsOfferDTO) GetGuaranteePeriodDaysOk() (*int32, bool)`

GetGuaranteePeriodDaysOk returns a tuple with the GuaranteePeriodDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuaranteePeriodDays

`func (o *UpdateMappingsOfferDTO) SetGuaranteePeriodDays(v int32)`

SetGuaranteePeriodDays sets GuaranteePeriodDays field to given value.

### HasGuaranteePeriodDays

`func (o *UpdateMappingsOfferDTO) HasGuaranteePeriodDays() bool`

HasGuaranteePeriodDays returns a boolean if a field has been set.

### GetProcessingState

`func (o *UpdateMappingsOfferDTO) GetProcessingState() OfferProcessingStateDTO`

GetProcessingState returns the ProcessingState field if non-nil, zero value otherwise.

### GetProcessingStateOk

`func (o *UpdateMappingsOfferDTO) GetProcessingStateOk() (*OfferProcessingStateDTO, bool)`

GetProcessingStateOk returns a tuple with the ProcessingState field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessingState

`func (o *UpdateMappingsOfferDTO) SetProcessingState(v OfferProcessingStateDTO)`

SetProcessingState sets ProcessingState field to given value.

### HasProcessingState

`func (o *UpdateMappingsOfferDTO) HasProcessingState() bool`

HasProcessingState returns a boolean if a field has been set.

### GetAvailability

`func (o *UpdateMappingsOfferDTO) GetAvailability() OfferAvailabilityStatusType`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *UpdateMappingsOfferDTO) GetAvailabilityOk() (*OfferAvailabilityStatusType, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *UpdateMappingsOfferDTO) SetAvailability(v OfferAvailabilityStatusType)`

SetAvailability sets Availability field to given value.

### HasAvailability

`func (o *UpdateMappingsOfferDTO) HasAvailability() bool`

HasAvailability returns a boolean if a field has been set.

### GetShelfLife

`func (o *UpdateMappingsOfferDTO) GetShelfLife() TimePeriodDTO`

GetShelfLife returns the ShelfLife field if non-nil, zero value otherwise.

### GetShelfLifeOk

`func (o *UpdateMappingsOfferDTO) GetShelfLifeOk() (*TimePeriodDTO, bool)`

GetShelfLifeOk returns a tuple with the ShelfLife field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShelfLife

`func (o *UpdateMappingsOfferDTO) SetShelfLife(v TimePeriodDTO)`

SetShelfLife sets ShelfLife field to given value.

### HasShelfLife

`func (o *UpdateMappingsOfferDTO) HasShelfLife() bool`

HasShelfLife returns a boolean if a field has been set.

### GetLifeTime

`func (o *UpdateMappingsOfferDTO) GetLifeTime() TimePeriodDTO`

GetLifeTime returns the LifeTime field if non-nil, zero value otherwise.

### GetLifeTimeOk

`func (o *UpdateMappingsOfferDTO) GetLifeTimeOk() (*TimePeriodDTO, bool)`

GetLifeTimeOk returns a tuple with the LifeTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifeTime

`func (o *UpdateMappingsOfferDTO) SetLifeTime(v TimePeriodDTO)`

SetLifeTime sets LifeTime field to given value.

### HasLifeTime

`func (o *UpdateMappingsOfferDTO) HasLifeTime() bool`

HasLifeTime returns a boolean if a field has been set.

### GetGuaranteePeriod

`func (o *UpdateMappingsOfferDTO) GetGuaranteePeriod() TimePeriodDTO`

GetGuaranteePeriod returns the GuaranteePeriod field if non-nil, zero value otherwise.

### GetGuaranteePeriodOk

`func (o *UpdateMappingsOfferDTO) GetGuaranteePeriodOk() (*TimePeriodDTO, bool)`

GetGuaranteePeriodOk returns a tuple with the GuaranteePeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuaranteePeriod

`func (o *UpdateMappingsOfferDTO) SetGuaranteePeriod(v TimePeriodDTO)`

SetGuaranteePeriod sets GuaranteePeriod field to given value.

### HasGuaranteePeriod

`func (o *UpdateMappingsOfferDTO) HasGuaranteePeriod() bool`

HasGuaranteePeriod returns a boolean if a field has been set.

### GetCertificate

`func (o *UpdateMappingsOfferDTO) GetCertificate() string`

GetCertificate returns the Certificate field if non-nil, zero value otherwise.

### GetCertificateOk

`func (o *UpdateMappingsOfferDTO) GetCertificateOk() (*string, bool)`

GetCertificateOk returns a tuple with the Certificate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCertificate

`func (o *UpdateMappingsOfferDTO) SetCertificate(v string)`

SetCertificate sets Certificate field to given value.

### HasCertificate

`func (o *UpdateMappingsOfferDTO) HasCertificate() bool`

HasCertificate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


