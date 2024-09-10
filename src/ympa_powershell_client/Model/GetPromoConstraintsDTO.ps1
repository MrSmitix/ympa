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

Ограничения в акции.

.PARAMETER WarehouseIds
Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
.OUTPUTS

GetPromoConstraintsDTO<PSCustomObject>
#>

function Initialize-GetPromoConstraintsDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int64[]]
        ${WarehouseIds}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetPromoConstraintsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "warehouseIds" = ${WarehouseIds}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetPromoConstraintsDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetPromoConstraintsDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetPromoConstraintsDTO<PSCustomObject>
#>
function ConvertFrom-JsonToGetPromoConstraintsDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetPromoConstraintsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetPromoConstraintsDTO
        $AllProperties = ("warehouseIds")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "warehouseIds"))) { #optional property not found
            $WarehouseIds = $null
        } else {
            $WarehouseIds = $JsonParameters.PSobject.Properties["warehouseIds"].value
        }

        $PSO = [PSCustomObject]@{
            "warehouseIds" = ${WarehouseIds}
        }

        return $PSO
    }

}

