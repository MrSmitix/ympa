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

Максимальные значения цены, при которых она является привлекательной или умеренной.

.PARAMETER OptimalPrice
No description available.
.PARAMETER AveragePrice
No description available.
.OUTPUTS

PriceCompetitivenessThresholdsDTO<PSCustomObject>
#>

function Initialize-PriceCompetitivenessThresholdsDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${OptimalPrice},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${AveragePrice}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => PriceCompetitivenessThresholdsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "optimalPrice" = ${OptimalPrice}
            "averagePrice" = ${AveragePrice}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to PriceCompetitivenessThresholdsDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to PriceCompetitivenessThresholdsDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

PriceCompetitivenessThresholdsDTO<PSCustomObject>
#>
function ConvertFrom-JsonToPriceCompetitivenessThresholdsDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => PriceCompetitivenessThresholdsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PriceCompetitivenessThresholdsDTO
        $AllProperties = ("optimalPrice", "averagePrice")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "optimalPrice"))) { #optional property not found
            $OptimalPrice = $null
        } else {
            $OptimalPrice = $JsonParameters.PSobject.Properties["optimalPrice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "averagePrice"))) { #optional property not found
            $AveragePrice = $null
        } else {
            $AveragePrice = $JsonParameters.PSobject.Properties["averagePrice"].value
        }

        $PSO = [PSCustomObject]@{
            "optimalPrice" = ${OptimalPrice}
            "averagePrice" = ${AveragePrice}
        }

        return $PSO
    }

}

