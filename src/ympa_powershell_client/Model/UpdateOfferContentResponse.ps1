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

Описывает проблемы, которые появились при сохранении товара.

.PARAMETER Status
No description available.
.PARAMETER Results
Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
.OUTPUTS

UpdateOfferContentResponse<PSCustomObject>
#>

function Initialize-UpdateOfferContentResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("OK", "ERROR")]
        [PSCustomObject]
        ${Status},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Results}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => UpdateOfferContentResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "status" = ${Status}
            "results" = ${Results}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UpdateOfferContentResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to UpdateOfferContentResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UpdateOfferContentResponse<PSCustomObject>
#>
function ConvertFrom-JsonToUpdateOfferContentResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => UpdateOfferContentResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UpdateOfferContentResponse
        $AllProperties = ("status", "results")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) { #optional property not found
            $Status = $null
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "results"))) { #optional property not found
            $Results = $null
        } else {
            $Results = $JsonParameters.PSobject.Properties["results"].value
        }

        $PSO = [PSCustomObject]@{
            "status" = ${Status}
            "results" = ${Results}
        }

        return $PSO
    }

}

