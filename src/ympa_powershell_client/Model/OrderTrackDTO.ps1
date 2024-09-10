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

Информация о трек-номере посылки (DBS).

.PARAMETER TrackCode
Трек‑номер посылки.
.PARAMETER DeliveryServiceId
Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
.OUTPUTS

OrderTrackDTO<PSCustomObject>
#>

function Initialize-OrderTrackDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TrackCode},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${DeliveryServiceId}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OrderTrackDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "trackCode" = ${TrackCode}
            "deliveryServiceId" = ${DeliveryServiceId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderTrackDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderTrackDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderTrackDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOrderTrackDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OrderTrackDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderTrackDTO
        $AllProperties = ("trackCode", "deliveryServiceId")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "trackCode"))) { #optional property not found
            $TrackCode = $null
        } else {
            $TrackCode = $JsonParameters.PSobject.Properties["trackCode"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deliveryServiceId"))) { #optional property not found
            $DeliveryServiceId = $null
        } else {
            $DeliveryServiceId = $JsonParameters.PSobject.Properties["deliveryServiceId"].value
        }

        $PSO = [PSCustomObject]@{
            "trackCode" = ${TrackCode}
            "deliveryServiceId" = ${DeliveryServiceId}
        }

        return $PSO
    }

}

