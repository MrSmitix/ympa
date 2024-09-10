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

Причина попадания товара в карантин.

.PARAMETER Type
No description available.
.PARAMETER Params
Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
.OUTPUTS

PriceQuarantineVerdictDTO<PSCustomObject>
#>

function Initialize-PriceQuarantineVerdictDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("PRICE_CHANGE", "LOW_PRICE", "LOW_PRICE_PROMO")]
        [PSCustomObject]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Params}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => PriceQuarantineVerdictDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Params) {
            throw "invalid value for 'Params', 'Params' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "params" = ${Params}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to PriceQuarantineVerdictDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to PriceQuarantineVerdictDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

PriceQuarantineVerdictDTO<PSCustomObject>
#>
function ConvertFrom-JsonToPriceQuarantineVerdictDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => PriceQuarantineVerdictDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PriceQuarantineVerdictDTO
        $AllProperties = ("type", "params")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'params' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "params"))) {
            throw "Error! JSON cannot be serialized due to the required property 'params' missing."
        } else {
            $Params = $JsonParameters.PSobject.Properties["params"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "params" = ${Params}
        }

        return $PSO
    }

}

