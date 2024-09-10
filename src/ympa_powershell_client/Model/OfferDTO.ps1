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

Предложение.

.PARAMETER Price
Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
.PARAMETER FeedId
Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
.PARAMETER Id
Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
.PARAMETER ShopCategoryId
Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
.PARAMETER MarketCategoryId
Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
.PARAMETER PreDiscountPrice
Цена предложения без скидки.
.PARAMETER Discount
Скидка на предложение в процентах.
.PARAMETER CutPrice
Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
.PARAMETER Url
URL-адрес предложения на сайте магазина.
.PARAMETER ModelId
Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
.PARAMETER Name
Наименование предложения.
.PARAMETER Currency
No description available.
.PARAMETER Bid
{% note warning """" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
.PARAMETER Cbid
{% note warning """" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
.PARAMETER Fee
{% note warning """" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
.PARAMETER Blocked
Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
.OUTPUTS

OfferDTO<PSCustomObject>
#>

function Initialize-OfferDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Price},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${FeedId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ShopCategoryId},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${MarketCategoryId},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${PreDiscountPrice},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Discount},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${CutPrice},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Url},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [Int64]
        ${ModelId},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE")]
        [PSCustomObject]
        ${Currency},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Bid},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Cbid},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Fee},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Blocked}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OfferDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $ModelId) {
            throw "invalid value for 'ModelId', 'ModelId' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "price" = ${Price}
            "feedId" = ${FeedId}
            "id" = ${Id}
            "shopCategoryId" = ${ShopCategoryId}
            "marketCategoryId" = ${MarketCategoryId}
            "preDiscountPrice" = ${PreDiscountPrice}
            "discount" = ${Discount}
            "cutPrice" = ${CutPrice}
            "url" = ${Url}
            "modelId" = ${ModelId}
            "name" = ${Name}
            "currency" = ${Currency}
            "bid" = ${Bid}
            "cbid" = ${Cbid}
            "fee" = ${Fee}
            "blocked" = ${Blocked}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OfferDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OfferDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OfferDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOfferDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OfferDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OfferDTO
        $AllProperties = ("price", "feedId", "id", "shopCategoryId", "marketCategoryId", "preDiscountPrice", "discount", "cutPrice", "url", "modelId", "name", "currency", "bid", "cbid", "fee", "blocked")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'modelId' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "modelId"))) {
            throw "Error! JSON cannot be serialized due to the required property 'modelId' missing."
        } else {
            $ModelId = $JsonParameters.PSobject.Properties["modelId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "price"))) { #optional property not found
            $Price = $null
        } else {
            $Price = $JsonParameters.PSobject.Properties["price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "feedId"))) { #optional property not found
            $FeedId = $null
        } else {
            $FeedId = $JsonParameters.PSobject.Properties["feedId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "shopCategoryId"))) { #optional property not found
            $ShopCategoryId = $null
        } else {
            $ShopCategoryId = $JsonParameters.PSobject.Properties["shopCategoryId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "marketCategoryId"))) { #optional property not found
            $MarketCategoryId = $null
        } else {
            $MarketCategoryId = $JsonParameters.PSobject.Properties["marketCategoryId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "preDiscountPrice"))) { #optional property not found
            $PreDiscountPrice = $null
        } else {
            $PreDiscountPrice = $JsonParameters.PSobject.Properties["preDiscountPrice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "discount"))) { #optional property not found
            $Discount = $null
        } else {
            $Discount = $JsonParameters.PSobject.Properties["discount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "cutPrice"))) { #optional property not found
            $CutPrice = $null
        } else {
            $CutPrice = $JsonParameters.PSobject.Properties["cutPrice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "url"))) { #optional property not found
            $Url = $null
        } else {
            $Url = $JsonParameters.PSobject.Properties["url"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "currency"))) { #optional property not found
            $Currency = $null
        } else {
            $Currency = $JsonParameters.PSobject.Properties["currency"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bid"))) { #optional property not found
            $Bid = $null
        } else {
            $Bid = $JsonParameters.PSobject.Properties["bid"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "cbid"))) { #optional property not found
            $Cbid = $null
        } else {
            $Cbid = $JsonParameters.PSobject.Properties["cbid"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee"))) { #optional property not found
            $Fee = $null
        } else {
            $Fee = $JsonParameters.PSobject.Properties["fee"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "blocked"))) { #optional property not found
            $Blocked = $null
        } else {
            $Blocked = $JsonParameters.PSobject.Properties["blocked"].value
        }

        $PSO = [PSCustomObject]@{
            "price" = ${Price}
            "feedId" = ${FeedId}
            "id" = ${Id}
            "shopCategoryId" = ${ShopCategoryId}
            "marketCategoryId" = ${MarketCategoryId}
            "preDiscountPrice" = ${PreDiscountPrice}
            "discount" = ${Discount}
            "cutPrice" = ${CutPrice}
            "url" = ${Url}
            "modelId" = ${ModelId}
            "name" = ${Name}
            "currency" = ${Currency}
            "bid" = ${Bid}
            "cbid" = ${Cbid}
            "fee" = ${Fee}
            "blocked" = ${Blocked}
        }

        return $PSO
    }

}

