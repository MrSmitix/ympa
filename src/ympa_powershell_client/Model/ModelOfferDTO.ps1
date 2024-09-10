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

Информация о предложении.

.PARAMETER Discount
Скидка на предложение в процентах.
.PARAMETER Name
Наименование предложения.
.PARAMETER Pos
Позиция предложения в выдаче Маркета на карточке модели.
.PARAMETER PreDiscountPrice
Цена предложения без скидки магазина.
.PARAMETER Price
Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
.PARAMETER RegionId
Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
.PARAMETER ShippingCost
Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
.PARAMETER ShopName
Название магазина (в том виде, в котором отображается на Маркете).
.PARAMETER ShopRating
Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
.PARAMETER InStock
{% note warning """" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
.OUTPUTS

ModelOfferDTO<PSCustomObject>
#>

function Initialize-ModelOfferDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Discount},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Pos},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${PreDiscountPrice},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Price},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${RegionId},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${ShippingCost},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ShopName},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ShopRating},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${InStock}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => ModelOfferDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "discount" = ${Discount}
            "name" = ${Name}
            "pos" = ${Pos}
            "preDiscountPrice" = ${PreDiscountPrice}
            "price" = ${Price}
            "regionId" = ${RegionId}
            "shippingCost" = ${ShippingCost}
            "shopName" = ${ShopName}
            "shopRating" = ${ShopRating}
            "inStock" = ${InStock}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ModelOfferDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to ModelOfferDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ModelOfferDTO<PSCustomObject>
#>
function ConvertFrom-JsonToModelOfferDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => ModelOfferDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ModelOfferDTO
        $AllProperties = ("discount", "name", "pos", "preDiscountPrice", "price", "regionId", "shippingCost", "shopName", "shopRating", "inStock")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "discount"))) { #optional property not found
            $Discount = $null
        } else {
            $Discount = $JsonParameters.PSobject.Properties["discount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pos"))) { #optional property not found
            $Pos = $null
        } else {
            $Pos = $JsonParameters.PSobject.Properties["pos"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "preDiscountPrice"))) { #optional property not found
            $PreDiscountPrice = $null
        } else {
            $PreDiscountPrice = $JsonParameters.PSobject.Properties["preDiscountPrice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "price"))) { #optional property not found
            $Price = $null
        } else {
            $Price = $JsonParameters.PSobject.Properties["price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "regionId"))) { #optional property not found
            $RegionId = $null
        } else {
            $RegionId = $JsonParameters.PSobject.Properties["regionId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "shippingCost"))) { #optional property not found
            $ShippingCost = $null
        } else {
            $ShippingCost = $JsonParameters.PSobject.Properties["shippingCost"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "shopName"))) { #optional property not found
            $ShopName = $null
        } else {
            $ShopName = $JsonParameters.PSobject.Properties["shopName"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "shopRating"))) { #optional property not found
            $ShopRating = $null
        } else {
            $ShopRating = $JsonParameters.PSobject.Properties["shopRating"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "inStock"))) { #optional property not found
            $InStock = $null
        } else {
            $InStock = $JsonParameters.PSobject.Properties["inStock"].value
        }

        $PSO = [PSCustomObject]@{
            "discount" = ${Discount}
            "name" = ${Name}
            "pos" = ${Pos}
            "preDiscountPrice" = ${PreDiscountPrice}
            "price" = ${Price}
            "regionId" = ${RegionId}
            "shippingCost" = ${ShippingCost}
            "shopName" = ${ShopName}
            "shopRating" = ${ShopRating}
            "inStock" = ${InStock}
        }

        return $PSO
    }

}

