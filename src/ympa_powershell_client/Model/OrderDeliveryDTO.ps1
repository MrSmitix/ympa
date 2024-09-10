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

Информация о доставке.

.PARAMETER Id
Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
.PARAMETER Type
No description available.
.PARAMETER ServiceName
Наименование службы доставки.
.PARAMETER Price
{% note warning """" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
.PARAMETER DeliveryPartnerType
No description available.
.PARAMETER Courier
No description available.
.PARAMETER Dates
No description available.
.PARAMETER Region
No description available.
.PARAMETER Address
No description available.
.PARAMETER Vat
No description available.
.PARAMETER DeliveryServiceId
Идентификатор службы доставки.
.PARAMETER LiftType
No description available.
.PARAMETER LiftPrice
Стоимость подъема на этаж.
.PARAMETER OutletCode
Идентификатор пункта самовывоза, присвоенный магазином.
.PARAMETER OutletStorageLimitDate
Формат даты: `ДД-ММ-ГГГГ`. 
.PARAMETER DispatchType
No description available.
.PARAMETER Tracks
Информация для отслеживания перемещений посылки.
.PARAMETER Shipments
Информация о посылках.
.PARAMETER Estimated
Приблизительная ли дата доставки.
.PARAMETER EacType
No description available.
.PARAMETER EacCode
Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
.OUTPUTS

OrderDeliveryDTO<PSCustomObject>
#>

function Initialize-OrderDeliveryDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("DELIVERY", "PICKUP", "POST", "DIGITAL", "UNKNOWN")]
        [PSCustomObject]
        ${Type},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ServiceName},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Price},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("SHOP", "YANDEX_MARKET", "UNKNOWN")]
        [PSCustomObject]
        ${DeliveryPartnerType},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Courier},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Dates},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Region},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Address},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("NO_VAT", "VAT_0", "VAT_10", "VAT_10_110", "VAT_20", "VAT_20_120", "VAT_18", "VAT_18_118", "UNKNOWN_VALUE")]
        [PSCustomObject]
        ${Vat},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${DeliveryServiceId},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("NOT_NEEDED", "MANUAL", "ELEVATOR", "CARGO_ELEVATOR", "FREE", "UNKNOWN")]
        [PSCustomObject]
        ${LiftType},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${LiftPrice},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${OutletCode},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${OutletStorageLimitDate},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("UNKNOWN", "BUYER", "MARKET_PARTNER_OUTLET", "MARKET_BRANDED_OUTLET", "SHOP_OUTLET", "DROPOFF")]
        [PSCustomObject]
        ${DispatchType},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Tracks},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Shipments},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Estimated},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("MERCHANT_TO_COURIER", "COURIER_TO_MERCHANT", "CHECKING_BY_MERCHANT")]
        [PSCustomObject]
        ${EacType},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${EacCode}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OrderDeliveryDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "type" = ${Type}
            "serviceName" = ${ServiceName}
            "price" = ${Price}
            "deliveryPartnerType" = ${DeliveryPartnerType}
            "courier" = ${Courier}
            "dates" = ${Dates}
            "region" = ${Region}
            "address" = ${Address}
            "vat" = ${Vat}
            "deliveryServiceId" = ${DeliveryServiceId}
            "liftType" = ${LiftType}
            "liftPrice" = ${LiftPrice}
            "outletCode" = ${OutletCode}
            "outletStorageLimitDate" = ${OutletStorageLimitDate}
            "dispatchType" = ${DispatchType}
            "tracks" = ${Tracks}
            "shipments" = ${Shipments}
            "estimated" = ${Estimated}
            "eacType" = ${EacType}
            "eacCode" = ${EacCode}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderDeliveryDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderDeliveryDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderDeliveryDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOrderDeliveryDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OrderDeliveryDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderDeliveryDTO
        $AllProperties = ("id", "type", "serviceName", "price", "deliveryPartnerType", "courier", "dates", "region", "address", "vat", "deliveryServiceId", "liftType", "liftPrice", "outletCode", "outletStorageLimitDate", "dispatchType", "tracks", "shipments", "estimated", "eacType", "eacCode")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "serviceName"))) { #optional property not found
            $ServiceName = $null
        } else {
            $ServiceName = $JsonParameters.PSobject.Properties["serviceName"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "price"))) { #optional property not found
            $Price = $null
        } else {
            $Price = $JsonParameters.PSobject.Properties["price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deliveryPartnerType"))) { #optional property not found
            $DeliveryPartnerType = $null
        } else {
            $DeliveryPartnerType = $JsonParameters.PSobject.Properties["deliveryPartnerType"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "courier"))) { #optional property not found
            $Courier = $null
        } else {
            $Courier = $JsonParameters.PSobject.Properties["courier"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "dates"))) { #optional property not found
            $Dates = $null
        } else {
            $Dates = $JsonParameters.PSobject.Properties["dates"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "region"))) { #optional property not found
            $Region = $null
        } else {
            $Region = $JsonParameters.PSobject.Properties["region"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "address"))) { #optional property not found
            $Address = $null
        } else {
            $Address = $JsonParameters.PSobject.Properties["address"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vat"))) { #optional property not found
            $Vat = $null
        } else {
            $Vat = $JsonParameters.PSobject.Properties["vat"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deliveryServiceId"))) { #optional property not found
            $DeliveryServiceId = $null
        } else {
            $DeliveryServiceId = $JsonParameters.PSobject.Properties["deliveryServiceId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "liftType"))) { #optional property not found
            $LiftType = $null
        } else {
            $LiftType = $JsonParameters.PSobject.Properties["liftType"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "liftPrice"))) { #optional property not found
            $LiftPrice = $null
        } else {
            $LiftPrice = $JsonParameters.PSobject.Properties["liftPrice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "outletCode"))) { #optional property not found
            $OutletCode = $null
        } else {
            $OutletCode = $JsonParameters.PSobject.Properties["outletCode"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "outletStorageLimitDate"))) { #optional property not found
            $OutletStorageLimitDate = $null
        } else {
            $OutletStorageLimitDate = $JsonParameters.PSobject.Properties["outletStorageLimitDate"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "dispatchType"))) { #optional property not found
            $DispatchType = $null
        } else {
            $DispatchType = $JsonParameters.PSobject.Properties["dispatchType"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tracks"))) { #optional property not found
            $Tracks = $null
        } else {
            $Tracks = $JsonParameters.PSobject.Properties["tracks"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "shipments"))) { #optional property not found
            $Shipments = $null
        } else {
            $Shipments = $JsonParameters.PSobject.Properties["shipments"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "estimated"))) { #optional property not found
            $Estimated = $null
        } else {
            $Estimated = $JsonParameters.PSobject.Properties["estimated"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "eacType"))) { #optional property not found
            $EacType = $null
        } else {
            $EacType = $JsonParameters.PSobject.Properties["eacType"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "eacCode"))) { #optional property not found
            $EacCode = $null
        } else {
            $EacCode = $JsonParameters.PSobject.Properties["eacCode"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "type" = ${Type}
            "serviceName" = ${ServiceName}
            "price" = ${Price}
            "deliveryPartnerType" = ${DeliveryPartnerType}
            "courier" = ${Courier}
            "dates" = ${Dates}
            "region" = ${Region}
            "address" = ${Address}
            "vat" = ${Vat}
            "deliveryServiceId" = ${DeliveryServiceId}
            "liftType" = ${LiftType}
            "liftPrice" = ${LiftPrice}
            "outletCode" = ${OutletCode}
            "outletStorageLimitDate" = ${OutletStorageLimitDate}
            "dispatchType" = ${DispatchType}
            "tracks" = ${Tracks}
            "shipments" = ${Shipments}
            "estimated" = ${Estimated}
            "eacType" = ${EacType}
            "eacCode" = ${EacCode}
        }

        return $PSO
    }

}

