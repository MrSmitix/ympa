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

Ответ на запрос информации о моделях.

.PARAMETER Models
Список моделей товаров.
.PARAMETER Currency
No description available.
.PARAMETER RegionId
Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
.OUTPUTS

GetModelsResponse<PSCustomObject>
#>

function Initialize-GetModelsResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Models},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE")]
        [PSCustomObject]
        ${Currency},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${RegionId}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetModelsResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Models) {
            throw "invalid value for 'Models', 'Models' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "models" = ${Models}
            "currency" = ${Currency}
            "regionId" = ${RegionId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetModelsResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetModelsResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetModelsResponse<PSCustomObject>
#>
function ConvertFrom-JsonToGetModelsResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetModelsResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetModelsResponse
        $AllProperties = ("models", "currency", "regionId")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'models' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "models"))) {
            throw "Error! JSON cannot be serialized due to the required property 'models' missing."
        } else {
            $Models = $JsonParameters.PSobject.Properties["models"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "currency"))) { #optional property not found
            $Currency = $null
        } else {
            $Currency = $JsonParameters.PSobject.Properties["currency"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "regionId"))) { #optional property not found
            $RegionId = $null
        } else {
            $RegionId = $JsonParameters.PSobject.Properties["regionId"].value
        }

        $PSO = [PSCustomObject]@{
            "models" = ${Models}
            "currency" = ${Currency}
            "regionId" = ${RegionId}
        }

        return $PSO
    }

}

