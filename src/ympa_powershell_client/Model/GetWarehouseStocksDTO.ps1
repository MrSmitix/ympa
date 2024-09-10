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

Список складов с информацией об остатках на каждом из них.

.PARAMETER Paging
No description available.
.PARAMETER Warehouses
Страница списка складов.
.OUTPUTS

GetWarehouseStocksDTO<PSCustomObject>
#>

function Initialize-GetWarehouseStocksDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Paging},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Warehouses}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetWarehouseStocksDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Warehouses) {
            throw "invalid value for 'Warehouses', 'Warehouses' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "paging" = ${Paging}
            "warehouses" = ${Warehouses}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetWarehouseStocksDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetWarehouseStocksDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetWarehouseStocksDTO<PSCustomObject>
#>
function ConvertFrom-JsonToGetWarehouseStocksDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetWarehouseStocksDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetWarehouseStocksDTO
        $AllProperties = ("paging", "warehouses")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'warehouses' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "warehouses"))) {
            throw "Error! JSON cannot be serialized due to the required property 'warehouses' missing."
        } else {
            $Warehouses = $JsonParameters.PSobject.Properties["warehouses"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "paging"))) { #optional property not found
            $Paging = $null
        } else {
            $Paging = $JsonParameters.PSobject.Properties["paging"].value
        }

        $PSO = [PSCustomObject]@{
            "paging" = ${Paging}
            "warehouses" = ${Warehouses}
        }

        return $PSO
    }

}

