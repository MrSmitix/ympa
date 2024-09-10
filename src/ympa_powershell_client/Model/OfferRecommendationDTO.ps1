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

Информация о состоянии цен и рекомендации. 

.PARAMETER Offer
No description available.
.PARAMETER Recommendation
No description available.
.OUTPUTS

OfferRecommendationDTO<PSCustomObject>
#>

function Initialize-OfferRecommendationDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Offer},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Recommendation}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OfferRecommendationDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "offer" = ${Offer}
            "recommendation" = ${Recommendation}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OfferRecommendationDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OfferRecommendationDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OfferRecommendationDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOfferRecommendationDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OfferRecommendationDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OfferRecommendationDTO
        $AllProperties = ("offer", "recommendation")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "offer"))) { #optional property not found
            $Offer = $null
        } else {
            $Offer = $JsonParameters.PSobject.Properties["offer"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "recommendation"))) { #optional property not found
            $Recommendation = $null
        } else {
            $Recommendation = $JsonParameters.PSobject.Properties["recommendation"].value
        }

        $PSO = [PSCustomObject]@{
            "offer" = ${Offer}
            "recommendation" = ${Recommendation}
        }

        return $PSO
    }

}

