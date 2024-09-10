# UpdateOfferDTO

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
**ParameterValues** | Pointer to [**[]ParameterValueDTO**](ParameterValueDTO.md) | Список характеристик с их значениями.  С &#x60;parameterValues&#x60; обязательно передавайте &#x60;marketCategoryId&#x60; — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее &#x60;parameterId&#x60; с пустым &#x60;value&#x60;.  Максимальное количество характеристик — 300.  | [optional] 
**BasicPrice** | Pointer to [**UpdatePriceWithDiscountDTO**](UpdatePriceWithDiscountDTO.md) |  | [optional] 
**PurchasePrice** | Pointer to [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**AdditionalExpenses** | Pointer to [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**CofinancePrice** | Pointer to [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 

## Methods

### NewUpdateOfferDTO

`func NewUpdateOfferDTO(offerId string, ) *UpdateOfferDTO`

NewUpdateOfferDTO instantiates a new UpdateOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOfferDTOWithDefaults

`func NewUpdateOfferDTOWithDefaults() *UpdateOfferDTO`

NewUpdateOfferDTOWithDefaults instantiates a new UpdateOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *UpdateOfferDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *UpdateOfferDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *UpdateOfferDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.


### GetName

`func (o *UpdateOfferDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *UpdateOfferDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *UpdateOfferDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *UpdateOfferDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetMarketCategoryId

`func (o *UpdateOfferDTO) GetMarketCategoryId() int64`

GetMarketCategoryId returns the MarketCategoryId field if non-nil, zero value otherwise.

### GetMarketCategoryIdOk

`func (o *UpdateOfferDTO) GetMarketCategoryIdOk() (*int64, bool)`

GetMarketCategoryIdOk returns a tuple with the MarketCategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketCategoryId

`func (o *UpdateOfferDTO) SetMarketCategoryId(v int64)`

SetMarketCategoryId sets MarketCategoryId field to given value.

### HasMarketCategoryId

`func (o *UpdateOfferDTO) HasMarketCategoryId() bool`

HasMarketCategoryId returns a boolean if a field has been set.

### GetCategory

`func (o *UpdateOfferDTO) GetCategory() string`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *UpdateOfferDTO) GetCategoryOk() (*string, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *UpdateOfferDTO) SetCategory(v string)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *UpdateOfferDTO) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetPictures

`func (o *UpdateOfferDTO) GetPictures() []string`

GetPictures returns the Pictures field if non-nil, zero value otherwise.

### GetPicturesOk

`func (o *UpdateOfferDTO) GetPicturesOk() (*[]string, bool)`

GetPicturesOk returns a tuple with the Pictures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPictures

`func (o *UpdateOfferDTO) SetPictures(v []string)`

SetPictures sets Pictures field to given value.

### HasPictures

`func (o *UpdateOfferDTO) HasPictures() bool`

HasPictures returns a boolean if a field has been set.

### SetPicturesNil

`func (o *UpdateOfferDTO) SetPicturesNil(b bool)`

 SetPicturesNil sets the value for Pictures to be an explicit nil

### UnsetPictures
`func (o *UpdateOfferDTO) UnsetPictures()`

UnsetPictures ensures that no value is present for Pictures, not even an explicit nil
### GetVideos

`func (o *UpdateOfferDTO) GetVideos() []string`

GetVideos returns the Videos field if non-nil, zero value otherwise.

### GetVideosOk

`func (o *UpdateOfferDTO) GetVideosOk() (*[]string, bool)`

GetVideosOk returns a tuple with the Videos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideos

`func (o *UpdateOfferDTO) SetVideos(v []string)`

SetVideos sets Videos field to given value.

### HasVideos

`func (o *UpdateOfferDTO) HasVideos() bool`

HasVideos returns a boolean if a field has been set.

### SetVideosNil

`func (o *UpdateOfferDTO) SetVideosNil(b bool)`

 SetVideosNil sets the value for Videos to be an explicit nil

### UnsetVideos
`func (o *UpdateOfferDTO) UnsetVideos()`

UnsetVideos ensures that no value is present for Videos, not even an explicit nil
### GetManuals

`func (o *UpdateOfferDTO) GetManuals() []OfferManualDTO`

GetManuals returns the Manuals field if non-nil, zero value otherwise.

### GetManualsOk

`func (o *UpdateOfferDTO) GetManualsOk() (*[]OfferManualDTO, bool)`

GetManualsOk returns a tuple with the Manuals field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManuals

`func (o *UpdateOfferDTO) SetManuals(v []OfferManualDTO)`

SetManuals sets Manuals field to given value.

### HasManuals

`func (o *UpdateOfferDTO) HasManuals() bool`

HasManuals returns a boolean if a field has been set.

### SetManualsNil

`func (o *UpdateOfferDTO) SetManualsNil(b bool)`

 SetManualsNil sets the value for Manuals to be an explicit nil

### UnsetManuals
`func (o *UpdateOfferDTO) UnsetManuals()`

UnsetManuals ensures that no value is present for Manuals, not even an explicit nil
### GetVendor

`func (o *UpdateOfferDTO) GetVendor() string`

GetVendor returns the Vendor field if non-nil, zero value otherwise.

### GetVendorOk

`func (o *UpdateOfferDTO) GetVendorOk() (*string, bool)`

GetVendorOk returns a tuple with the Vendor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendor

`func (o *UpdateOfferDTO) SetVendor(v string)`

SetVendor sets Vendor field to given value.

### HasVendor

`func (o *UpdateOfferDTO) HasVendor() bool`

HasVendor returns a boolean if a field has been set.

### GetBarcodes

`func (o *UpdateOfferDTO) GetBarcodes() []string`

GetBarcodes returns the Barcodes field if non-nil, zero value otherwise.

### GetBarcodesOk

`func (o *UpdateOfferDTO) GetBarcodesOk() (*[]string, bool)`

GetBarcodesOk returns a tuple with the Barcodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBarcodes

`func (o *UpdateOfferDTO) SetBarcodes(v []string)`

SetBarcodes sets Barcodes field to given value.

### HasBarcodes

`func (o *UpdateOfferDTO) HasBarcodes() bool`

HasBarcodes returns a boolean if a field has been set.

### SetBarcodesNil

`func (o *UpdateOfferDTO) SetBarcodesNil(b bool)`

 SetBarcodesNil sets the value for Barcodes to be an explicit nil

### UnsetBarcodes
`func (o *UpdateOfferDTO) UnsetBarcodes()`

UnsetBarcodes ensures that no value is present for Barcodes, not even an explicit nil
### GetDescription

`func (o *UpdateOfferDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *UpdateOfferDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *UpdateOfferDTO) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *UpdateOfferDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetManufacturerCountries

`func (o *UpdateOfferDTO) GetManufacturerCountries() []string`

GetManufacturerCountries returns the ManufacturerCountries field if non-nil, zero value otherwise.

### GetManufacturerCountriesOk

`func (o *UpdateOfferDTO) GetManufacturerCountriesOk() (*[]string, bool)`

GetManufacturerCountriesOk returns a tuple with the ManufacturerCountries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManufacturerCountries

`func (o *UpdateOfferDTO) SetManufacturerCountries(v []string)`

SetManufacturerCountries sets ManufacturerCountries field to given value.

### HasManufacturerCountries

`func (o *UpdateOfferDTO) HasManufacturerCountries() bool`

HasManufacturerCountries returns a boolean if a field has been set.

### SetManufacturerCountriesNil

`func (o *UpdateOfferDTO) SetManufacturerCountriesNil(b bool)`

 SetManufacturerCountriesNil sets the value for ManufacturerCountries to be an explicit nil

### UnsetManufacturerCountries
`func (o *UpdateOfferDTO) UnsetManufacturerCountries()`

UnsetManufacturerCountries ensures that no value is present for ManufacturerCountries, not even an explicit nil
### GetWeightDimensions

`func (o *UpdateOfferDTO) GetWeightDimensions() OfferWeightDimensionsDTO`

GetWeightDimensions returns the WeightDimensions field if non-nil, zero value otherwise.

### GetWeightDimensionsOk

`func (o *UpdateOfferDTO) GetWeightDimensionsOk() (*OfferWeightDimensionsDTO, bool)`

GetWeightDimensionsOk returns a tuple with the WeightDimensions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeightDimensions

`func (o *UpdateOfferDTO) SetWeightDimensions(v OfferWeightDimensionsDTO)`

SetWeightDimensions sets WeightDimensions field to given value.

### HasWeightDimensions

`func (o *UpdateOfferDTO) HasWeightDimensions() bool`

HasWeightDimensions returns a boolean if a field has been set.

### GetVendorCode

`func (o *UpdateOfferDTO) GetVendorCode() string`

GetVendorCode returns the VendorCode field if non-nil, zero value otherwise.

### GetVendorCodeOk

`func (o *UpdateOfferDTO) GetVendorCodeOk() (*string, bool)`

GetVendorCodeOk returns a tuple with the VendorCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendorCode

`func (o *UpdateOfferDTO) SetVendorCode(v string)`

SetVendorCode sets VendorCode field to given value.

### HasVendorCode

`func (o *UpdateOfferDTO) HasVendorCode() bool`

HasVendorCode returns a boolean if a field has been set.

### GetTags

`func (o *UpdateOfferDTO) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *UpdateOfferDTO) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *UpdateOfferDTO) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *UpdateOfferDTO) HasTags() bool`

HasTags returns a boolean if a field has been set.

### SetTagsNil

`func (o *UpdateOfferDTO) SetTagsNil(b bool)`

 SetTagsNil sets the value for Tags to be an explicit nil

### UnsetTags
`func (o *UpdateOfferDTO) UnsetTags()`

UnsetTags ensures that no value is present for Tags, not even an explicit nil
### GetShelfLife

`func (o *UpdateOfferDTO) GetShelfLife() TimePeriodDTO`

GetShelfLife returns the ShelfLife field if non-nil, zero value otherwise.

### GetShelfLifeOk

`func (o *UpdateOfferDTO) GetShelfLifeOk() (*TimePeriodDTO, bool)`

GetShelfLifeOk returns a tuple with the ShelfLife field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShelfLife

`func (o *UpdateOfferDTO) SetShelfLife(v TimePeriodDTO)`

SetShelfLife sets ShelfLife field to given value.

### HasShelfLife

`func (o *UpdateOfferDTO) HasShelfLife() bool`

HasShelfLife returns a boolean if a field has been set.

### GetLifeTime

`func (o *UpdateOfferDTO) GetLifeTime() TimePeriodDTO`

GetLifeTime returns the LifeTime field if non-nil, zero value otherwise.

### GetLifeTimeOk

`func (o *UpdateOfferDTO) GetLifeTimeOk() (*TimePeriodDTO, bool)`

GetLifeTimeOk returns a tuple with the LifeTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifeTime

`func (o *UpdateOfferDTO) SetLifeTime(v TimePeriodDTO)`

SetLifeTime sets LifeTime field to given value.

### HasLifeTime

`func (o *UpdateOfferDTO) HasLifeTime() bool`

HasLifeTime returns a boolean if a field has been set.

### GetGuaranteePeriod

`func (o *UpdateOfferDTO) GetGuaranteePeriod() TimePeriodDTO`

GetGuaranteePeriod returns the GuaranteePeriod field if non-nil, zero value otherwise.

### GetGuaranteePeriodOk

`func (o *UpdateOfferDTO) GetGuaranteePeriodOk() (*TimePeriodDTO, bool)`

GetGuaranteePeriodOk returns a tuple with the GuaranteePeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuaranteePeriod

`func (o *UpdateOfferDTO) SetGuaranteePeriod(v TimePeriodDTO)`

SetGuaranteePeriod sets GuaranteePeriod field to given value.

### HasGuaranteePeriod

`func (o *UpdateOfferDTO) HasGuaranteePeriod() bool`

HasGuaranteePeriod returns a boolean if a field has been set.

### GetCustomsCommodityCode

`func (o *UpdateOfferDTO) GetCustomsCommodityCode() string`

GetCustomsCommodityCode returns the CustomsCommodityCode field if non-nil, zero value otherwise.

### GetCustomsCommodityCodeOk

`func (o *UpdateOfferDTO) GetCustomsCommodityCodeOk() (*string, bool)`

GetCustomsCommodityCodeOk returns a tuple with the CustomsCommodityCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomsCommodityCode

`func (o *UpdateOfferDTO) SetCustomsCommodityCode(v string)`

SetCustomsCommodityCode sets CustomsCommodityCode field to given value.

### HasCustomsCommodityCode

`func (o *UpdateOfferDTO) HasCustomsCommodityCode() bool`

HasCustomsCommodityCode returns a boolean if a field has been set.

### GetCertificates

`func (o *UpdateOfferDTO) GetCertificates() []string`

GetCertificates returns the Certificates field if non-nil, zero value otherwise.

### GetCertificatesOk

`func (o *UpdateOfferDTO) GetCertificatesOk() (*[]string, bool)`

GetCertificatesOk returns a tuple with the Certificates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCertificates

`func (o *UpdateOfferDTO) SetCertificates(v []string)`

SetCertificates sets Certificates field to given value.

### HasCertificates

`func (o *UpdateOfferDTO) HasCertificates() bool`

HasCertificates returns a boolean if a field has been set.

### SetCertificatesNil

`func (o *UpdateOfferDTO) SetCertificatesNil(b bool)`

 SetCertificatesNil sets the value for Certificates to be an explicit nil

### UnsetCertificates
`func (o *UpdateOfferDTO) UnsetCertificates()`

UnsetCertificates ensures that no value is present for Certificates, not even an explicit nil
### GetBoxCount

`func (o *UpdateOfferDTO) GetBoxCount() int32`

GetBoxCount returns the BoxCount field if non-nil, zero value otherwise.

### GetBoxCountOk

`func (o *UpdateOfferDTO) GetBoxCountOk() (*int32, bool)`

GetBoxCountOk returns a tuple with the BoxCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxCount

`func (o *UpdateOfferDTO) SetBoxCount(v int32)`

SetBoxCount sets BoxCount field to given value.

### HasBoxCount

`func (o *UpdateOfferDTO) HasBoxCount() bool`

HasBoxCount returns a boolean if a field has been set.

### GetCondition

`func (o *UpdateOfferDTO) GetCondition() OfferConditionDTO`

GetCondition returns the Condition field if non-nil, zero value otherwise.

### GetConditionOk

`func (o *UpdateOfferDTO) GetConditionOk() (*OfferConditionDTO, bool)`

GetConditionOk returns a tuple with the Condition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCondition

`func (o *UpdateOfferDTO) SetCondition(v OfferConditionDTO)`

SetCondition sets Condition field to given value.

### HasCondition

`func (o *UpdateOfferDTO) HasCondition() bool`

HasCondition returns a boolean if a field has been set.

### GetType

`func (o *UpdateOfferDTO) GetType() OfferType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *UpdateOfferDTO) GetTypeOk() (*OfferType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *UpdateOfferDTO) SetType(v OfferType)`

SetType sets Type field to given value.

### HasType

`func (o *UpdateOfferDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetDownloadable

`func (o *UpdateOfferDTO) GetDownloadable() bool`

GetDownloadable returns the Downloadable field if non-nil, zero value otherwise.

### GetDownloadableOk

`func (o *UpdateOfferDTO) GetDownloadableOk() (*bool, bool)`

GetDownloadableOk returns a tuple with the Downloadable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownloadable

`func (o *UpdateOfferDTO) SetDownloadable(v bool)`

SetDownloadable sets Downloadable field to given value.

### HasDownloadable

`func (o *UpdateOfferDTO) HasDownloadable() bool`

HasDownloadable returns a boolean if a field has been set.

### GetAdult

`func (o *UpdateOfferDTO) GetAdult() bool`

GetAdult returns the Adult field if non-nil, zero value otherwise.

### GetAdultOk

`func (o *UpdateOfferDTO) GetAdultOk() (*bool, bool)`

GetAdultOk returns a tuple with the Adult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdult

`func (o *UpdateOfferDTO) SetAdult(v bool)`

SetAdult sets Adult field to given value.

### HasAdult

`func (o *UpdateOfferDTO) HasAdult() bool`

HasAdult returns a boolean if a field has been set.

### GetAge

`func (o *UpdateOfferDTO) GetAge() AgeDTO`

GetAge returns the Age field if non-nil, zero value otherwise.

### GetAgeOk

`func (o *UpdateOfferDTO) GetAgeOk() (*AgeDTO, bool)`

GetAgeOk returns a tuple with the Age field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAge

`func (o *UpdateOfferDTO) SetAge(v AgeDTO)`

SetAge sets Age field to given value.

### HasAge

`func (o *UpdateOfferDTO) HasAge() bool`

HasAge returns a boolean if a field has been set.

### GetParams

`func (o *UpdateOfferDTO) GetParams() []OfferParamDTO`

GetParams returns the Params field if non-nil, zero value otherwise.

### GetParamsOk

`func (o *UpdateOfferDTO) GetParamsOk() (*[]OfferParamDTO, bool)`

GetParamsOk returns a tuple with the Params field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParams

`func (o *UpdateOfferDTO) SetParams(v []OfferParamDTO)`

SetParams sets Params field to given value.

### HasParams

`func (o *UpdateOfferDTO) HasParams() bool`

HasParams returns a boolean if a field has been set.

### SetParamsNil

`func (o *UpdateOfferDTO) SetParamsNil(b bool)`

 SetParamsNil sets the value for Params to be an explicit nil

### UnsetParams
`func (o *UpdateOfferDTO) UnsetParams()`

UnsetParams ensures that no value is present for Params, not even an explicit nil
### GetParameterValues

`func (o *UpdateOfferDTO) GetParameterValues() []ParameterValueDTO`

GetParameterValues returns the ParameterValues field if non-nil, zero value otherwise.

### GetParameterValuesOk

`func (o *UpdateOfferDTO) GetParameterValuesOk() (*[]ParameterValueDTO, bool)`

GetParameterValuesOk returns a tuple with the ParameterValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameterValues

`func (o *UpdateOfferDTO) SetParameterValues(v []ParameterValueDTO)`

SetParameterValues sets ParameterValues field to given value.

### HasParameterValues

`func (o *UpdateOfferDTO) HasParameterValues() bool`

HasParameterValues returns a boolean if a field has been set.

### SetParameterValuesNil

`func (o *UpdateOfferDTO) SetParameterValuesNil(b bool)`

 SetParameterValuesNil sets the value for ParameterValues to be an explicit nil

### UnsetParameterValues
`func (o *UpdateOfferDTO) UnsetParameterValues()`

UnsetParameterValues ensures that no value is present for ParameterValues, not even an explicit nil
### GetBasicPrice

`func (o *UpdateOfferDTO) GetBasicPrice() UpdatePriceWithDiscountDTO`

GetBasicPrice returns the BasicPrice field if non-nil, zero value otherwise.

### GetBasicPriceOk

`func (o *UpdateOfferDTO) GetBasicPriceOk() (*UpdatePriceWithDiscountDTO, bool)`

GetBasicPriceOk returns a tuple with the BasicPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasicPrice

`func (o *UpdateOfferDTO) SetBasicPrice(v UpdatePriceWithDiscountDTO)`

SetBasicPrice sets BasicPrice field to given value.

### HasBasicPrice

`func (o *UpdateOfferDTO) HasBasicPrice() bool`

HasBasicPrice returns a boolean if a field has been set.

### GetPurchasePrice

`func (o *UpdateOfferDTO) GetPurchasePrice() BasePriceDTO`

GetPurchasePrice returns the PurchasePrice field if non-nil, zero value otherwise.

### GetPurchasePriceOk

`func (o *UpdateOfferDTO) GetPurchasePriceOk() (*BasePriceDTO, bool)`

GetPurchasePriceOk returns a tuple with the PurchasePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchasePrice

`func (o *UpdateOfferDTO) SetPurchasePrice(v BasePriceDTO)`

SetPurchasePrice sets PurchasePrice field to given value.

### HasPurchasePrice

`func (o *UpdateOfferDTO) HasPurchasePrice() bool`

HasPurchasePrice returns a boolean if a field has been set.

### GetAdditionalExpenses

`func (o *UpdateOfferDTO) GetAdditionalExpenses() BasePriceDTO`

GetAdditionalExpenses returns the AdditionalExpenses field if non-nil, zero value otherwise.

### GetAdditionalExpensesOk

`func (o *UpdateOfferDTO) GetAdditionalExpensesOk() (*BasePriceDTO, bool)`

GetAdditionalExpensesOk returns a tuple with the AdditionalExpenses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalExpenses

`func (o *UpdateOfferDTO) SetAdditionalExpenses(v BasePriceDTO)`

SetAdditionalExpenses sets AdditionalExpenses field to given value.

### HasAdditionalExpenses

`func (o *UpdateOfferDTO) HasAdditionalExpenses() bool`

HasAdditionalExpenses returns a boolean if a field has been set.

### GetCofinancePrice

`func (o *UpdateOfferDTO) GetCofinancePrice() BasePriceDTO`

GetCofinancePrice returns the CofinancePrice field if non-nil, zero value otherwise.

### GetCofinancePriceOk

`func (o *UpdateOfferDTO) GetCofinancePriceOk() (*BasePriceDTO, bool)`

GetCofinancePriceOk returns a tuple with the CofinancePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCofinancePrice

`func (o *UpdateOfferDTO) SetCofinancePrice(v BasePriceDTO)`

SetCofinancePrice sets CofinancePrice field to given value.

### HasCofinancePrice

`func (o *UpdateOfferDTO) HasCofinancePrice() bool`

HasCofinancePrice returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


