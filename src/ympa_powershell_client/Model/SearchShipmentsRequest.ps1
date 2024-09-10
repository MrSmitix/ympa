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

Запрос информации об отгрузках.

.PARAMETER DateFrom
Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
.PARAMETER DateTo
Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
.PARAMETER Statuses
Список статусов отгрузок.
.PARAMETER OrderIds
Список идентификаторов заказов из отгрузок.
.PARAMETER CancelledOrders
Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
.OUTPUTS

SearchShipmentsRequest<PSCustomObject>
#>

function Initialize-SearchShipmentsRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.DateTime]
        ${DateFrom},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.DateTime]
        ${DateTo},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Statuses},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Int64[]]
        ${OrderIds},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${CancelledOrders} = $true
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => SearchShipmentsRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $DateFrom) {
            throw "invalid value for 'DateFrom', 'DateFrom' cannot be null."
        }

        if ($null -eq $DateTo) {
            throw "invalid value for 'DateTo', 'DateTo' cannot be null."
        }

        if (!$Statuses -and $Statuses.length -lt 1) {
            throw "invalid value for 'Statuses', number of items must be greater than or equal to 1."
        }

        if (!$OrderIds -and $OrderIds.length -lt 1) {
            throw "invalid value for 'OrderIds', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "dateFrom" = ${DateFrom}
            "dateTo" = ${DateTo}
            "statuses" = ${Statuses}
            "orderIds" = ${OrderIds}
            "cancelledOrders" = ${CancelledOrders}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to SearchShipmentsRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to SearchShipmentsRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

SearchShipmentsRequest<PSCustomObject>
#>
function ConvertFrom-JsonToSearchShipmentsRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => SearchShipmentsRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in SearchShipmentsRequest
        $AllProperties = ("dateFrom", "dateTo", "statuses", "orderIds", "cancelledOrders")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'dateFrom' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "dateFrom"))) {
            throw "Error! JSON cannot be serialized due to the required property 'dateFrom' missing."
        } else {
            $DateFrom = $JsonParameters.PSobject.Properties["dateFrom"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "dateTo"))) {
            throw "Error! JSON cannot be serialized due to the required property 'dateTo' missing."
        } else {
            $DateTo = $JsonParameters.PSobject.Properties["dateTo"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "statuses"))) { #optional property not found
            $Statuses = $null
        } else {
            $Statuses = $JsonParameters.PSobject.Properties["statuses"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "orderIds"))) { #optional property not found
            $OrderIds = $null
        } else {
            $OrderIds = $JsonParameters.PSobject.Properties["orderIds"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "cancelledOrders"))) { #optional property not found
            $CancelledOrders = $null
        } else {
            $CancelledOrders = $JsonParameters.PSobject.Properties["cancelledOrders"].value
        }

        $PSO = [PSCustomObject]@{
            "dateFrom" = ${DateFrom}
            "dateTo" = ${DateTo}
            "statuses" = ${Statuses}
            "orderIds" = ${OrderIds}
            "cancelledOrders" = ${CancelledOrders}
        }

        return $PSO
    }

}

