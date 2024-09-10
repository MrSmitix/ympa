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

Ответ на запрос информации о прайс-листе.

.PARAMETER Feed
No description available.
.OUTPUTS

GetFeedResponse<PSCustomObject>
#>

function Initialize-GetFeedResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Feed}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetFeedResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "feed" = ${Feed}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetFeedResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetFeedResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetFeedResponse<PSCustomObject>
#>
function ConvertFrom-JsonToGetFeedResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetFeedResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetFeedResponse
        $AllProperties = ("feed")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "feed"))) { #optional property not found
            $Feed = $null
        } else {
            $Feed = $JsonParameters.PSobject.Properties["feed"].value
        }

        $PSO = [PSCustomObject]@{
            "feed" = ${Feed}
        }

        return $PSO
    }

}

