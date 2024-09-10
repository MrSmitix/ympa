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

Информация об остатках товара.

.PARAMETER Type
No description available.
.PARAMETER Count
Значение остатков.
.OUTPUTS

WarehouseStockDTO<PSCustomObject>
#>

function Initialize-WarehouseStockDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("FIT", "FREEZE", "AVAILABLE", "QUARANTINE", "UTILIZATION", "DEFECT", "EXPIRED")]
        [PSCustomObject]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Int64]
        ${Count}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => WarehouseStockDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }

        if ($null -eq $Count) {
            throw "invalid value for 'Count', 'Count' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "count" = ${Count}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to WarehouseStockDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to WarehouseStockDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

WarehouseStockDTO<PSCustomObject>
#>
function ConvertFrom-JsonToWarehouseStockDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => WarehouseStockDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in WarehouseStockDTO
        $AllProperties = ("type", "count")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'type' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'type' missing."
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "count"))) {
            throw "Error! JSON cannot be serialized due to the required property 'count' missing."
        } else {
            $Count = $JsonParameters.PSobject.Properties["count"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "count" = ${Count}
        }

        return $PSO
    }

}

