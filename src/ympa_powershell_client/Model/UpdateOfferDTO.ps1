#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

Параметры товара.

.PARAMETER OfferId
Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
.PARAMETER Name
Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
.PARAMETER MarketCategoryId
Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
.PARAMETER Category
Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
.PARAMETER Pictures
Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
.PARAMETER Videos
Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
.PARAMETER Manuals
Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
.PARAMETER Vendor
Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
.PARAMETER Barcodes
Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
.PARAMETER Description
Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \<h>, \<h1>, \<h2> и так далее — для заголовков; * \<br> и \<p> — для переноса строки; * \<ol> — для нумерованного списка; * \<ul> — для маркированного списка; * \<li> — для создания элементов списка (должен находиться внутри \<ol> или \<ul>); * \<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
.PARAMETER ManufacturerCountries
Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
.PARAMETER WeightDimensions
No description available.
.PARAMETER VendorCode
Артикул товара от производителя.
.PARAMETER Tags
Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
.PARAMETER ShelfLife
No description available.
.PARAMETER LifeTime
No description available.
.PARAMETER GuaranteePeriod
No description available.
.PARAMETER CustomsCommodityCode
Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
.PARAMETER Certificates
Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
.PARAMETER BoxCount
Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
.PARAMETER Condition
No description available.
.PARAMETER Type
No description available.
.PARAMETER Downloadable
Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
.PARAMETER Adult
Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
.PARAMETER Age
No description available.
.PARAMETER Params
{% note warning """" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
.PARAMETER ParameterValues
Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
.PARAMETER BasicPrice
No description available.
.PARAMETER PurchasePrice
No description available.
.PARAMETER AdditionalExpenses
No description available.
.PARAMETER CofinancePrice
No description available.
.OUTPUTS

UpdateOfferDTO<PSCustomObject>
#>

function Initialize-UpdateOfferDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$")]
        [String]
        ${OfferId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${MarketCategoryId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Category},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Pictures},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Videos},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Manuals},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Vendor},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Barcodes},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Description},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${ManufacturerCountries},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${WeightDimensions},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VendorCode},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Tags},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${ShelfLife},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${LifeTime},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${GuaranteePeriod},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CustomsCommodityCode},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Certificates},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${BoxCount},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Condition},
        [Parameter(Position = 21, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("DEFAULT", "MEDICINE", "BOOK", "AUDIOBOOK", "ARTIST_TITLE", "ON_DEMAND")]
        [PSCustomObject]
        ${Type},
        [Parameter(Position = 22, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Downloadable},
        [Parameter(Position = 23, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Adult},
        [Parameter(Position = 24, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Age},
        [Parameter(Position = 25, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Params},
        [Parameter(Position = 26, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${ParameterValues},
        [Parameter(Position = 27, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${BasicPrice},
        [Parameter(Position = 28, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${PurchasePrice},
        [Parameter(Position = 29, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${AdditionalExpenses},
        [Parameter(Position = 30, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${CofinancePrice}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => UpdateOfferDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $OfferId) {
            throw "invalid value for 'OfferId', 'OfferId' cannot be null."
        }

        if ($OfferId.length -gt 255) {
            throw "invalid value for 'OfferId', the character length must be smaller than or equal to 255."
        }

        if ($OfferId.length -lt 1) {
            throw "invalid value for 'OfferId', the character length must be great than or equal to 1."
        }

        if (!$Name -and $Name.length -gt 256) {
            throw "invalid value for 'Name', the character length must be smaller than or equal to 256."
        }

        if (!$Videos -and $Videos.length -gt 6) {
            throw "invalid value for 'Videos', number of items must be less than or equal to 6."
        }

        if (!$Manuals -and $Manuals.length -gt 6) {
            throw "invalid value for 'Manuals', number of items must be less than or equal to 6."
        }

        if (!$Description -and $Description.length -gt 6000) {
            throw "invalid value for 'Description', the character length must be smaller than or equal to 6000."
        }

        if (!$ParameterValues -and $ParameterValues.length -gt 300) {
            throw "invalid value for 'ParameterValues', number of items must be less than or equal to 300."
        }


        $PSO = [PSCustomObject]@{
            "offerId" = ${OfferId}
            "name" = ${Name}
            "marketCategoryId" = ${MarketCategoryId}
            "category" = ${Category}
            "pictures" = ${Pictures}
            "videos" = ${Videos}
            "manuals" = ${Manuals}
            "vendor" = ${Vendor}
            "barcodes" = ${Barcodes}
            "description" = ${Description}
            "manufacturerCountries" = ${ManufacturerCountries}
            "weightDimensions" = ${WeightDimensions}
            "vendorCode" = ${VendorCode}
            "tags" = ${Tags}
            "shelfLife" = ${ShelfLife}
            "lifeTime" = ${LifeTime}
            "guaranteePeriod" = ${GuaranteePeriod}
            "customsCommodityCode" = ${CustomsCommodityCode}
            "certificates" = ${Certificates}
            "boxCount" = ${BoxCount}
            "condition" = ${Condition}
            "type" = ${Type}
            "downloadable" = ${Downloadable}
            "adult" = ${Adult}
            "age" = ${Age}
            "params" = ${Params}
            "parameterValues" = ${ParameterValues}
            "basicPrice" = ${BasicPrice}
            "purchasePrice" = ${PurchasePrice}
            "additionalExpenses" = ${AdditionalExpenses}
            "cofinancePrice" = ${CofinancePrice}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UpdateOfferDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UpdateOfferDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UpdateOfferDTO<PSCustomObject>
#>
function ConvertFrom-JsonToUpdateOfferDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => UpdateOfferDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UpdateOfferDTO
        $AllProperties = ("offerId", "name", "marketCategoryId", "category", "pictures", "videos", "manuals", "vendor", "barcodes", "description", "manufacturerCountries", "weightDimensions", "vendorCode", "tags", "shelfLife", "lifeTime", "guaranteePeriod", "customsCommodityCode", "certificates", "boxCount", "condition", "type", "downloadable", "adult", "age", "params", "parameterValues", "basicPrice", "purchasePrice", "additionalExpenses", "cofinancePrice")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'offerId' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "offerId"))) {
            throw "Error! JSON cannot be serialized due to the required property 'offerId' missing."
        } else {
            $OfferId = $JsonParameters.PSobject.Properties["offerId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "marketCategoryId"))) { #optional property not found
            $MarketCategoryId = $null
        } else {
            $MarketCategoryId = $JsonParameters.PSobject.Properties["marketCategoryId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "category"))) { #optional property not found
            $Category = $null
        } else {
            $Category = $JsonParameters.PSobject.Properties["category"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pictures"))) { #optional property not found
            $Pictures = $null
        } else {
            $Pictures = $JsonParameters.PSobject.Properties["pictures"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "videos"))) { #optional property not found
            $Videos = $null
        } else {
            $Videos = $JsonParameters.PSobject.Properties["videos"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "manuals"))) { #optional property not found
            $Manuals = $null
        } else {
            $Manuals = $JsonParameters.PSobject.Properties["manuals"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vendor"))) { #optional property not found
            $Vendor = $null
        } else {
            $Vendor = $JsonParameters.PSobject.Properties["vendor"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "barcodes"))) { #optional property not found
            $Barcodes = $null
        } else {
            $Barcodes = $JsonParameters.PSobject.Properties["barcodes"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "description"))) { #optional property not found
            $Description = $null
        } else {
            $Description = $JsonParameters.PSobject.Properties["description"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "manufacturerCountries"))) { #optional property not found
            $ManufacturerCountries = $null
        } else {
            $ManufacturerCountries = $JsonParameters.PSobject.Properties["manufacturerCountries"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "weightDimensions"))) { #optional property not found
            $WeightDimensions = $null
        } else {
            $WeightDimensions = $JsonParameters.PSobject.Properties["weightDimensions"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vendorCode"))) { #optional property not found
            $VendorCode = $null
        } else {
            $VendorCode = $JsonParameters.PSobject.Properties["vendorCode"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tags"))) { #optional property not found
            $Tags = $null
        } else {
            $Tags = $JsonParameters.PSobject.Properties["tags"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "shelfLife"))) { #optional property not found
            $ShelfLife = $null
        } else {
            $ShelfLife = $JsonParameters.PSobject.Properties["shelfLife"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "lifeTime"))) { #optional property not found
            $LifeTime = $null
        } else {
            $LifeTime = $JsonParameters.PSobject.Properties["lifeTime"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "guaranteePeriod"))) { #optional property not found
            $GuaranteePeriod = $null
        } else {
            $GuaranteePeriod = $JsonParameters.PSobject.Properties["guaranteePeriod"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "customsCommodityCode"))) { #optional property not found
            $CustomsCommodityCode = $null
        } else {
            $CustomsCommodityCode = $JsonParameters.PSobject.Properties["customsCommodityCode"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "certificates"))) { #optional property not found
            $Certificates = $null
        } else {
            $Certificates = $JsonParameters.PSobject.Properties["certificates"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "boxCount"))) { #optional property not found
            $BoxCount = $null
        } else {
            $BoxCount = $JsonParameters.PSobject.Properties["boxCount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "condition"))) { #optional property not found
            $Condition = $null
        } else {
            $Condition = $JsonParameters.PSobject.Properties["condition"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "downloadable"))) { #optional property not found
            $Downloadable = $null
        } else {
            $Downloadable = $JsonParameters.PSobject.Properties["downloadable"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "adult"))) { #optional property not found
            $Adult = $null
        } else {
            $Adult = $JsonParameters.PSobject.Properties["adult"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "age"))) { #optional property not found
            $Age = $null
        } else {
            $Age = $JsonParameters.PSobject.Properties["age"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "params"))) { #optional property not found
            $Params = $null
        } else {
            $Params = $JsonParameters.PSobject.Properties["params"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "parameterValues"))) { #optional property not found
            $ParameterValues = $null
        } else {
            $ParameterValues = $JsonParameters.PSobject.Properties["parameterValues"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "basicPrice"))) { #optional property not found
            $BasicPrice = $null
        } else {
            $BasicPrice = $JsonParameters.PSobject.Properties["basicPrice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "purchasePrice"))) { #optional property not found
            $PurchasePrice = $null
        } else {
            $PurchasePrice = $JsonParameters.PSobject.Properties["purchasePrice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "additionalExpenses"))) { #optional property not found
            $AdditionalExpenses = $null
        } else {
            $AdditionalExpenses = $JsonParameters.PSobject.Properties["additionalExpenses"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "cofinancePrice"))) { #optional property not found
            $CofinancePrice = $null
        } else {
            $CofinancePrice = $JsonParameters.PSobject.Properties["cofinancePrice"].value
        }

        $PSO = [PSCustomObject]@{
            "offerId" = ${OfferId}
            "name" = ${Name}
            "marketCategoryId" = ${MarketCategoryId}
            "category" = ${Category}
            "pictures" = ${Pictures}
            "videos" = ${Videos}
            "manuals" = ${Manuals}
            "vendor" = ${Vendor}
            "barcodes" = ${Barcodes}
            "description" = ${Description}
            "manufacturerCountries" = ${ManufacturerCountries}
            "weightDimensions" = ${WeightDimensions}
            "vendorCode" = ${VendorCode}
            "tags" = ${Tags}
            "shelfLife" = ${ShelfLife}
            "lifeTime" = ${LifeTime}
            "guaranteePeriod" = ${GuaranteePeriod}
            "customsCommodityCode" = ${CustomsCommodityCode}
            "certificates" = ${Certificates}
            "boxCount" = ${BoxCount}
            "condition" = ${Condition}
            "type" = ${Type}
            "downloadable" = ${Downloadable}
            "adult" = ${Adult}
            "age" = ${Age}
            "params" = ${Params}
            "parameterValues" = ${ParameterValues}
            "basicPrice" = ${BasicPrice}
            "purchasePrice" = ${PurchasePrice}
            "additionalExpenses" = ${AdditionalExpenses}
            "cofinancePrice" = ${CofinancePrice}
        }

        return $PSO
    }

}

