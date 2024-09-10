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

Настройки кабинета.

.PARAMETER OnlyDefaultPrice
Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
.PARAMETER Currency
No description available.
.OUTPUTS

BusinessSettingsDTO<PSCustomObject>
#>

function Initialize-BusinessSettingsDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${OnlyDefaultPrice},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE")]
        [PSCustomObject]
        ${Currency}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => BusinessSettingsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "onlyDefaultPrice" = ${OnlyDefaultPrice}
            "currency" = ${Currency}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BusinessSettingsDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to BusinessSettingsDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BusinessSettingsDTO<PSCustomObject>
#>
function ConvertFrom-JsonToBusinessSettingsDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => BusinessSettingsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BusinessSettingsDTO
        $AllProperties = ("onlyDefaultPrice", "currency")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "onlyDefaultPrice"))) { #optional property not found
            $OnlyDefaultPrice = $null
        } else {
            $OnlyDefaultPrice = $JsonParameters.PSobject.Properties["onlyDefaultPrice"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "currency"))) { #optional property not found
            $Currency = $null
        } else {
            $Currency = $JsonParameters.PSobject.Properties["currency"].value
        }

        $PSO = [PSCustomObject]@{
            "onlyDefaultPrice" = ${OnlyDefaultPrice}
            "currency" = ${Currency}
        }

        return $PSO
    }

}

