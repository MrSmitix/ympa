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

Информация об оборачиваемости товара.

.PARAMETER Turnover
No description available.
.PARAMETER TurnoverDays
Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
.OUTPUTS

TurnoverDTO<PSCustomObject>
#>

function Initialize-TurnoverDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("LOW", "ALMOST_LOW", "HIGH", "VERY_HIGH", "NO_SALES", "FREE_STORE")]
        [PSCustomObject]
        ${Turnover},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${TurnoverDays}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => TurnoverDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Turnover) {
            throw "invalid value for 'Turnover', 'Turnover' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "turnover" = ${Turnover}
            "turnoverDays" = ${TurnoverDays}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to TurnoverDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to TurnoverDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

TurnoverDTO<PSCustomObject>
#>
function ConvertFrom-JsonToTurnoverDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => TurnoverDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in TurnoverDTO
        $AllProperties = ("turnover", "turnoverDays")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'turnover' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "turnover"))) {
            throw "Error! JSON cannot be serialized due to the required property 'turnover' missing."
        } else {
            $Turnover = $JsonParameters.PSobject.Properties["turnover"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "turnoverDays"))) { #optional property not found
            $TurnoverDays = $null
        } else {
            $TurnoverDays = $JsonParameters.PSobject.Properties["turnoverDays"].value
        }

        $PSO = [PSCustomObject]@{
            "turnover" = ${Turnover}
            "turnoverDays" = ${TurnoverDays}
        }

        return $PSO
    }

}

