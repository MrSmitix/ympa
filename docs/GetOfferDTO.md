# GetOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Name** | Pointer to **string** | Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  | [optional] 
**MarketCategoryId** | Pointer to **int64** | Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | [optional] 
**Category** | Pointer to **string** | Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  | [optional] 
**Pictures** | Pointer to **[]string** | Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html)  | [optional] 
**Videos** | Pointer to **[]string** | Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html)  | [optional] 
**Manuals** | Pointer to [**[]OfferManualDTO**](OfferManualDTO.md) | Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся.  | [optional] 
**Vendor** | Pointer to **string** | Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. | [optional] 
**Barcodes** | Pointer to **[]string** | Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)   | [optional] 
**Description** | Pointer to **string** | Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  | [optional] 
**ManufacturerCountries** | Pointer to **[]string** | Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx).  | [optional] 
**WeightDimensions** | Pointer to [**OfferWeightDimensionsDTO**](OfferWeightDimensionsDTO.md) |  | [optional] 
**VendorCode** | Pointer to **string** | Артикул товара от производителя. | [optional] 
**Tags** | Pointer to **[]string** | Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов.  | [optional] 
**ShelfLife** | Pointer to [**TimePeriodDTO**](TimePeriodDTO.md) |  | [optional] 
**LifeTime** | Pointer to [**TimePeriodDTO**](TimePeriodDTO.md) |  | [optional] 
**GuaranteePeriod** | Pointer to [**TimePeriodDTO**](TimePeriodDTO.md) |  | [optional] 
**CustomsCommodityCode** | Pointer to **string** | Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть.  | [optional] 
**Certificates** | Pointer to **[]string** | Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html).  | [optional] 
**BoxCount** | Pointer to **int32** | Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр.  | [optional] 
**Condition** | Pointer to [**OfferConditionDTO**](OfferConditionDTO.md) |  | [optional] 
**Type** | Pointer to [**OfferType**](OfferType.md) |  | [optional] 
**Downloadable** | Pointer to **bool** | Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md)  | [optional] 
**Adult** | Pointer to **bool** | Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей.  | [optional] 
**Age** | Pointer to [**AgeDTO**](AgeDTO.md) |  | [optional] 
**Params** | Pointer to [**[]OfferParamDTO**](OfferParamDTO.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви.  | [optional] 
**BasicPrice** | Pointer to [**GetPriceWithDiscountDTO**](GetPriceWithDiscountDTO.md) |  | [optional] 
**PurchasePrice** | Pointer to [**GetPriceDTO**](GetPriceDTO.md) |  | [optional] 
**AdditionalExpenses** | Pointer to [**GetPriceDTO**](GetPriceDTO.md) |  | [optional] 
**CofinancePrice** | Pointer to [**GetPriceDTO**](GetPriceDTO.md) |  | [optional] 
**CardStatus** | Pointer to [**OfferCardStatusType**](OfferCardStatusType.md) |  | [optional] 
**Campaigns** | Pointer to [**[]OfferCampaignStatusDTO**](OfferCampaignStatusDTO.md) | Список магазинов, в которых размещен товар.  | [optional] 
**SellingPrograms** | Pointer to [**[]OfferSellingProgramDTO**](OfferSellingProgramDTO.md) | Информация о том, какие для товара доступны модели размещения.  | [optional] 
**Archived** | Pointer to **bool** | Товар помещен в архив.  | [optional] 

## Methods

### NewGetOfferDTO

`func NewGetOfferDTO(offerId string, ) *GetOfferDTO`

NewGetOfferDTO instantiates a new GetOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOfferDTOWithDefaults

`func NewGetOfferDTOWithDefaults() *GetOfferDTO`

NewGetOfferDTOWithDefaults instantiates a new GetOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *GetOfferDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *GetOfferDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *GetOfferDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.


### GetName

`func (o *GetOfferDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GetOfferDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GetOfferDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *GetOfferDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetMarketCategoryId

`func (o *GetOfferDTO) GetMarketCategoryId() int64`

GetMarketCategoryId returns the MarketCategoryId field if non-nil, zero value otherwise.

### GetMarketCategoryIdOk

`func (o *GetOfferDTO) GetMarketCategoryIdOk() (*int64, bool)`

GetMarketCategoryIdOk returns a tuple with the MarketCategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketCategoryId

`func (o *GetOfferDTO) SetMarketCategoryId(v int64)`

SetMarketCategoryId sets MarketCategoryId field to given value.

### HasMarketCategoryId

`func (o *GetOfferDTO) HasMarketCategoryId() bool`

HasMarketCategoryId returns a boolean if a field has been set.

### GetCategory

`func (o *GetOfferDTO) GetCategory() string`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *GetOfferDTO) GetCategoryOk() (*string, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *GetOfferDTO) SetCategory(v string)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *GetOfferDTO) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetPictures

`func (o *GetOfferDTO) GetPictures() []string`

GetPictures returns the Pictures field if non-nil, zero value otherwise.

### GetPicturesOk

`func (o *GetOfferDTO) GetPicturesOk() (*[]string, bool)`

GetPicturesOk returns a tuple with the Pictures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPictures

`func (o *GetOfferDTO) SetPictures(v []string)`

SetPictures sets Pictures field to given value.

### HasPictures

`func (o *GetOfferDTO) HasPictures() bool`

HasPictures returns a boolean if a field has been set.

### SetPicturesNil

`func (o *GetOfferDTO) SetPicturesNil(b bool)`

 SetPicturesNil sets the value for Pictures to be an explicit nil

### UnsetPictures
`func (o *GetOfferDTO) UnsetPictures()`

UnsetPictures ensures that no value is present for Pictures, not even an explicit nil
### GetVideos

`func (o *GetOfferDTO) GetVideos() []string`

GetVideos returns the Videos field if non-nil, zero value otherwise.

### GetVideosOk

`func (o *GetOfferDTO) GetVideosOk() (*[]string, bool)`

GetVideosOk returns a tuple with the Videos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideos

`func (o *GetOfferDTO) SetVideos(v []string)`

SetVideos sets Videos field to given value.

### HasVideos

`func (o *GetOfferDTO) HasVideos() bool`

HasVideos returns a boolean if a field has been set.

### SetVideosNil

`func (o *GetOfferDTO) SetVideosNil(b bool)`

 SetVideosNil sets the value for Videos to be an explicit nil

### UnsetVideos
`func (o *GetOfferDTO) UnsetVideos()`

UnsetVideos ensures that no value is present for Videos, not even an explicit nil
### GetManuals

`func (o *GetOfferDTO) GetManuals() []OfferManualDTO`

GetManuals returns the Manuals field if non-nil, zero value otherwise.

### GetManualsOk

`func (o *GetOfferDTO) GetManualsOk() (*[]OfferManualDTO, bool)`

GetManualsOk returns a tuple with the Manuals field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManuals

`func (o *GetOfferDTO) SetManuals(v []OfferManualDTO)`

SetManuals sets Manuals field to given value.

### HasManuals

`func (o *GetOfferDTO) HasManuals() bool`

HasManuals returns a boolean if a field has been set.

### SetManualsNil

`func (o *GetOfferDTO) SetManualsNil(b bool)`

 SetManualsNil sets the value for Manuals to be an explicit nil

### UnsetManuals
`func (o *GetOfferDTO) UnsetManuals()`

UnsetManuals ensures that no value is present for Manuals, not even an explicit nil
### GetVendor

`func (o *GetOfferDTO) GetVendor() string`

GetVendor returns the Vendor field if non-nil, zero value otherwise.

### GetVendorOk

`func (o *GetOfferDTO) GetVendorOk() (*string, bool)`

GetVendorOk returns a tuple with the Vendor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendor

`func (o *GetOfferDTO) SetVendor(v string)`

SetVendor sets Vendor field to given value.

### HasVendor

`func (o *GetOfferDTO) HasVendor() bool`

HasVendor returns a boolean if a field has been set.

### GetBarcodes

`func (o *GetOfferDTO) GetBarcodes() []string`

GetBarcodes returns the Barcodes field if non-nil, zero value otherwise.

### GetBarcodesOk

`func (o *GetOfferDTO) GetBarcodesOk() (*[]string, bool)`

GetBarcodesOk returns a tuple with the Barcodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBarcodes

`func (o *GetOfferDTO) SetBarcodes(v []string)`

SetBarcodes sets Barcodes field to given value.

### HasBarcodes

`func (o *GetOfferDTO) HasBarcodes() bool`

HasBarcodes returns a boolean if a field has been set.

### SetBarcodesNil

`func (o *GetOfferDTO) SetBarcodesNil(b bool)`

 SetBarcodesNil sets the value for Barcodes to be an explicit nil

### UnsetBarcodes
`func (o *GetOfferDTO) UnsetBarcodes()`

UnsetBarcodes ensures that no value is present for Barcodes, not even an explicit nil
### GetDescription

`func (o *GetOfferDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *GetOfferDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *GetOfferDTO) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *GetOfferDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetManufacturerCountries

`func (o *GetOfferDTO) GetManufacturerCountries() []string`

GetManufacturerCountries returns the ManufacturerCountries field if non-nil, zero value otherwise.

### GetManufacturerCountriesOk

`func (o *GetOfferDTO) GetManufacturerCountriesOk() (*[]string, bool)`

GetManufacturerCountriesOk returns a tuple with the ManufacturerCountries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManufacturerCountries

`func (o *GetOfferDTO) SetManufacturerCountries(v []string)`

SetManufacturerCountries sets ManufacturerCountries field to given value.

### HasManufacturerCountries

`func (o *GetOfferDTO) HasManufacturerCountries() bool`

HasManufacturerCountries returns a boolean if a field has been set.

### SetManufacturerCountriesNil

`func (o *GetOfferDTO) SetManufacturerCountriesNil(b bool)`

 SetManufacturerCountriesNil sets the value for ManufacturerCountries to be an explicit nil

### UnsetManufacturerCountries
`func (o *GetOfferDTO) UnsetManufacturerCountries()`

UnsetManufacturerCountries ensures that no value is present for ManufacturerCountries, not even an explicit nil
### GetWeightDimensions

`func (o *GetOfferDTO) GetWeightDimensions() OfferWeightDimensionsDTO`

GetWeightDimensions returns the WeightDimensions field if non-nil, zero value otherwise.

### GetWeightDimensionsOk

`func (o *GetOfferDTO) GetWeightDimensionsOk() (*OfferWeightDimensionsDTO, bool)`

GetWeightDimensionsOk returns a tuple with the WeightDimensions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeightDimensions

`func (o *GetOfferDTO) SetWeightDimensions(v OfferWeightDimensionsDTO)`

SetWeightDimensions sets WeightDimensions field to given value.

### HasWeightDimensions

`func (o *GetOfferDTO) HasWeightDimensions() bool`

HasWeightDimensions returns a boolean if a field has been set.

### GetVendorCode

`func (o *GetOfferDTO) GetVendorCode() string`

GetVendorCode returns the VendorCode field if non-nil, zero value otherwise.

### GetVendorCodeOk

`func (o *GetOfferDTO) GetVendorCodeOk() (*string, bool)`

GetVendorCodeOk returns a tuple with the VendorCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendorCode

`func (o *GetOfferDTO) SetVendorCode(v string)`

SetVendorCode sets VendorCode field to given value.

### HasVendorCode

`func (o *GetOfferDTO) HasVendorCode() bool`

HasVendorCode returns a boolean if a field has been set.

### GetTags

`func (o *GetOfferDTO) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *GetOfferDTO) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *GetOfferDTO) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *GetOfferDTO) HasTags() bool`

HasTags returns a boolean if a field has been set.

### SetTagsNil

`func (o *GetOfferDTO) SetTagsNil(b bool)`

 SetTagsNil sets the value for Tags to be an explicit nil

### UnsetTags
`func (o *GetOfferDTO) UnsetTags()`

UnsetTags ensures that no value is present for Tags, not even an explicit nil
### GetShelfLife

`func (o *GetOfferDTO) GetShelfLife() TimePeriodDTO`

GetShelfLife returns the ShelfLife field if non-nil, zero value otherwise.

### GetShelfLifeOk

`func (o *GetOfferDTO) GetShelfLifeOk() (*TimePeriodDTO, bool)`

GetShelfLifeOk returns a tuple with the ShelfLife field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShelfLife

`func (o *GetOfferDTO) SetShelfLife(v TimePeriodDTO)`

SetShelfLife sets ShelfLife field to given value.

### HasShelfLife

`func (o *GetOfferDTO) HasShelfLife() bool`

HasShelfLife returns a boolean if a field has been set.

### GetLifeTime

`func (o *GetOfferDTO) GetLifeTime() TimePeriodDTO`

GetLifeTime returns the LifeTime field if non-nil, zero value otherwise.

### GetLifeTimeOk

`func (o *GetOfferDTO) GetLifeTimeOk() (*TimePeriodDTO, bool)`

GetLifeTimeOk returns a tuple with the LifeTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifeTime

`func (o *GetOfferDTO) SetLifeTime(v TimePeriodDTO)`

SetLifeTime sets LifeTime field to given value.

### HasLifeTime

`func (o *GetOfferDTO) HasLifeTime() bool`

HasLifeTime returns a boolean if a field has been set.

### GetGuaranteePeriod

`func (o *GetOfferDTO) GetGuaranteePeriod() TimePeriodDTO`

GetGuaranteePeriod returns the GuaranteePeriod field if non-nil, zero value otherwise.

### GetGuaranteePeriodOk

`func (o *GetOfferDTO) GetGuaranteePeriodOk() (*TimePeriodDTO, bool)`

GetGuaranteePeriodOk returns a tuple with the GuaranteePeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuaranteePeriod

`func (o *GetOfferDTO) SetGuaranteePeriod(v TimePeriodDTO)`

SetGuaranteePeriod sets GuaranteePeriod field to given value.

### HasGuaranteePeriod

`func (o *GetOfferDTO) HasGuaranteePeriod() bool`

HasGuaranteePeriod returns a boolean if a field has been set.

### GetCustomsCommodityCode

`func (o *GetOfferDTO) GetCustomsCommodityCode() string`

GetCustomsCommodityCode returns the CustomsCommodityCode field if non-nil, zero value otherwise.

### GetCustomsCommodityCodeOk

`func (o *GetOfferDTO) GetCustomsCommodityCodeOk() (*string, bool)`

GetCustomsCommodityCodeOk returns a tuple with the CustomsCommodityCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomsCommodityCode

`func (o *GetOfferDTO) SetCustomsCommodityCode(v string)`

SetCustomsCommodityCode sets CustomsCommodityCode field to given value.

### HasCustomsCommodityCode

`func (o *GetOfferDTO) HasCustomsCommodityCode() bool`

HasCustomsCommodityCode returns a boolean if a field has been set.

### GetCertificates

`func (o *GetOfferDTO) GetCertificates() []string`

GetCertificates returns the Certificates field if non-nil, zero value otherwise.

### GetCertificatesOk

`func (o *GetOfferDTO) GetCertificatesOk() (*[]string, bool)`

GetCertificatesOk returns a tuple with the Certificates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCertificates

`func (o *GetOfferDTO) SetCertificates(v []string)`

SetCertificates sets Certificates field to given value.

### HasCertificates

`func (o *GetOfferDTO) HasCertificates() bool`

HasCertificates returns a boolean if a field has been set.

### SetCertificatesNil

`func (o *GetOfferDTO) SetCertificatesNil(b bool)`

 SetCertificatesNil sets the value for Certificates to be an explicit nil

### UnsetCertificates
`func (o *GetOfferDTO) UnsetCertificates()`

UnsetCertificates ensures that no value is present for Certificates, not even an explicit nil
### GetBoxCount

`func (o *GetOfferDTO) GetBoxCount() int32`

GetBoxCount returns the BoxCount field if non-nil, zero value otherwise.

### GetBoxCountOk

`func (o *GetOfferDTO) GetBoxCountOk() (*int32, bool)`

GetBoxCountOk returns a tuple with the BoxCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxCount

`func (o *GetOfferDTO) SetBoxCount(v int32)`

SetBoxCount sets BoxCount field to given value.

### HasBoxCount

`func (o *GetOfferDTO) HasBoxCount() bool`

HasBoxCount returns a boolean if a field has been set.

### GetCondition

`func (o *GetOfferDTO) GetCondition() OfferConditionDTO`

GetCondition returns the Condition field if non-nil, zero value otherwise.

### GetConditionOk

`func (o *GetOfferDTO) GetConditionOk() (*OfferConditionDTO, bool)`

GetConditionOk returns a tuple with the Condition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCondition

`func (o *GetOfferDTO) SetCondition(v OfferConditionDTO)`

SetCondition sets Condition field to given value.

### HasCondition

`func (o *GetOfferDTO) HasCondition() bool`

HasCondition returns a boolean if a field has been set.

### GetType

`func (o *GetOfferDTO) GetType() OfferType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *GetOfferDTO) GetTypeOk() (*OfferType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *GetOfferDTO) SetType(v OfferType)`

SetType sets Type field to given value.

### HasType

`func (o *GetOfferDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetDownloadable

`func (o *GetOfferDTO) GetDownloadable() bool`

GetDownloadable returns the Downloadable field if non-nil, zero value otherwise.

### GetDownloadableOk

`func (o *GetOfferDTO) GetDownloadableOk() (*bool, bool)`

GetDownloadableOk returns a tuple with the Downloadable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownloadable

`func (o *GetOfferDTO) SetDownloadable(v bool)`

SetDownloadable sets Downloadable field to given value.

### HasDownloadable

`func (o *GetOfferDTO) HasDownloadable() bool`

HasDownloadable returns a boolean if a field has been set.

### GetAdult

`func (o *GetOfferDTO) GetAdult() bool`

GetAdult returns the Adult field if non-nil, zero value otherwise.

### GetAdultOk

`func (o *GetOfferDTO) GetAdultOk() (*bool, bool)`

GetAdultOk returns a tuple with the Adult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdult

`func (o *GetOfferDTO) SetAdult(v bool)`

SetAdult sets Adult field to given value.

### HasAdult

`func (o *GetOfferDTO) HasAdult() bool`

HasAdult returns a boolean if a field has been set.

### GetAge

`func (o *GetOfferDTO) GetAge() AgeDTO`

GetAge returns the Age field if non-nil, zero value otherwise.

### GetAgeOk

`func (o *GetOfferDTO) GetAgeOk() (*AgeDTO, bool)`

GetAgeOk returns a tuple with the Age field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAge

`func (o *GetOfferDTO) SetAge(v AgeDTO)`

SetAge sets Age field to given value.

### HasAge

`func (o *GetOfferDTO) HasAge() bool`

HasAge returns a boolean if a field has been set.

### GetParams

`func (o *GetOfferDTO) GetParams() []OfferParamDTO`

GetParams returns the Params field if non-nil, zero value otherwise.

### GetParamsOk

`func (o *GetOfferDTO) GetParamsOk() (*[]OfferParamDTO, bool)`

GetParamsOk returns a tuple with the Params field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParams

`func (o *GetOfferDTO) SetParams(v []OfferParamDTO)`

SetParams sets Params field to given value.

### HasParams

`func (o *GetOfferDTO) HasParams() bool`

HasParams returns a boolean if a field has been set.

### SetParamsNil

`func (o *GetOfferDTO) SetParamsNil(b bool)`

 SetParamsNil sets the value for Params to be an explicit nil

### UnsetParams
`func (o *GetOfferDTO) UnsetParams()`

UnsetParams ensures that no value is present for Params, not even an explicit nil
### GetBasicPrice

`func (o *GetOfferDTO) GetBasicPrice() GetPriceWithDiscountDTO`

GetBasicPrice returns the BasicPrice field if non-nil, zero value otherwise.

### GetBasicPriceOk

`func (o *GetOfferDTO) GetBasicPriceOk() (*GetPriceWithDiscountDTO, bool)`

GetBasicPriceOk returns a tuple with the BasicPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasicPrice

`func (o *GetOfferDTO) SetBasicPrice(v GetPriceWithDiscountDTO)`

SetBasicPrice sets BasicPrice field to given value.

### HasBasicPrice

`func (o *GetOfferDTO) HasBasicPrice() bool`

HasBasicPrice returns a boolean if a field has been set.

### GetPurchasePrice

`func (o *GetOfferDTO) GetPurchasePrice() GetPriceDTO`

GetPurchasePrice returns the PurchasePrice field if non-nil, zero value otherwise.

### GetPurchasePriceOk

`func (o *GetOfferDTO) GetPurchasePriceOk() (*GetPriceDTO, bool)`

GetPurchasePriceOk returns a tuple with the PurchasePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchasePrice

`func (o *GetOfferDTO) SetPurchasePrice(v GetPriceDTO)`

SetPurchasePrice sets PurchasePrice field to given value.

### HasPurchasePrice

`func (o *GetOfferDTO) HasPurchasePrice() bool`

HasPurchasePrice returns a boolean if a field has been set.

### GetAdditionalExpenses

`func (o *GetOfferDTO) GetAdditionalExpenses() GetPriceDTO`

GetAdditionalExpenses returns the AdditionalExpenses field if non-nil, zero value otherwise.

### GetAdditionalExpensesOk

`func (o *GetOfferDTO) GetAdditionalExpensesOk() (*GetPriceDTO, bool)`

GetAdditionalExpensesOk returns a tuple with the AdditionalExpenses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalExpenses

`func (o *GetOfferDTO) SetAdditionalExpenses(v GetPriceDTO)`

SetAdditionalExpenses sets AdditionalExpenses field to given value.

### HasAdditionalExpenses

`func (o *GetOfferDTO) HasAdditionalExpenses() bool`

HasAdditionalExpenses returns a boolean if a field has been set.

### GetCofinancePrice

`func (o *GetOfferDTO) GetCofinancePrice() GetPriceDTO`

GetCofinancePrice returns the CofinancePrice field if non-nil, zero value otherwise.

### GetCofinancePriceOk

`func (o *GetOfferDTO) GetCofinancePriceOk() (*GetPriceDTO, bool)`

GetCofinancePriceOk returns a tuple with the CofinancePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCofinancePrice

`func (o *GetOfferDTO) SetCofinancePrice(v GetPriceDTO)`

SetCofinancePrice sets CofinancePrice field to given value.

### HasCofinancePrice

`func (o *GetOfferDTO) HasCofinancePrice() bool`

HasCofinancePrice returns a boolean if a field has been set.

### GetCardStatus

`func (o *GetOfferDTO) GetCardStatus() OfferCardStatusType`

GetCardStatus returns the CardStatus field if non-nil, zero value otherwise.

### GetCardStatusOk

`func (o *GetOfferDTO) GetCardStatusOk() (*OfferCardStatusType, bool)`

GetCardStatusOk returns a tuple with the CardStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardStatus

`func (o *GetOfferDTO) SetCardStatus(v OfferCardStatusType)`

SetCardStatus sets CardStatus field to given value.

### HasCardStatus

`func (o *GetOfferDTO) HasCardStatus() bool`

HasCardStatus returns a boolean if a field has been set.

### GetCampaigns

`func (o *GetOfferDTO) GetCampaigns() []OfferCampaignStatusDTO`

GetCampaigns returns the Campaigns field if non-nil, zero value otherwise.

### GetCampaignsOk

`func (o *GetOfferDTO) GetCampaignsOk() (*[]OfferCampaignStatusDTO, bool)`

GetCampaignsOk returns a tuple with the Campaigns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaigns

`func (o *GetOfferDTO) SetCampaigns(v []OfferCampaignStatusDTO)`

SetCampaigns sets Campaigns field to given value.

### HasCampaigns

`func (o *GetOfferDTO) HasCampaigns() bool`

HasCampaigns returns a boolean if a field has been set.

### SetCampaignsNil

`func (o *GetOfferDTO) SetCampaignsNil(b bool)`

 SetCampaignsNil sets the value for Campaigns to be an explicit nil

### UnsetCampaigns
`func (o *GetOfferDTO) UnsetCampaigns()`

UnsetCampaigns ensures that no value is present for Campaigns, not even an explicit nil
### GetSellingPrograms

`func (o *GetOfferDTO) GetSellingPrograms() []OfferSellingProgramDTO`

GetSellingPrograms returns the SellingPrograms field if non-nil, zero value otherwise.

### GetSellingProgramsOk

`func (o *GetOfferDTO) GetSellingProgramsOk() (*[]OfferSellingProgramDTO, bool)`

GetSellingProgramsOk returns a tuple with the SellingPrograms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSellingPrograms

`func (o *GetOfferDTO) SetSellingPrograms(v []OfferSellingProgramDTO)`

SetSellingPrograms sets SellingPrograms field to given value.

### HasSellingPrograms

`func (o *GetOfferDTO) HasSellingPrograms() bool`

HasSellingPrograms returns a boolean if a field has been set.

### SetSellingProgramsNil

`func (o *GetOfferDTO) SetSellingProgramsNil(b bool)`

 SetSellingProgramsNil sets the value for SellingPrograms to be an explicit nil

### UnsetSellingPrograms
`func (o *GetOfferDTO) UnsetSellingPrograms()`

UnsetSellingPrograms ensures that no value is present for SellingPrograms, not even an explicit nil
### GetArchived

`func (o *GetOfferDTO) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *GetOfferDTO) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *GetOfferDTO) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *GetOfferDTO) HasArchived() bool`

HasArchived returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


