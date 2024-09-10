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

Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 

.PARAMETER DiscountParams
No description available.
.PARAMETER PromocodeParams
No description available.
.OUTPUTS

PromoOfferParamsDTO<PSCustomObject>
#>

function Initialize-PromoOfferParamsDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${DiscountParams},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${PromocodeParams}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => PromoOfferParamsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "discountParams" = ${DiscountParams}
            "promocodeParams" = ${PromocodeParams}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to PromoOfferParamsDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to PromoOfferParamsDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

PromoOfferParamsDTO<PSCustomObject>
#>
function ConvertFrom-JsonToPromoOfferParamsDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => PromoOfferParamsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PromoOfferParamsDTO
        $AllProperties = ("discountParams", "promocodeParams")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "discountParams"))) { #optional property not found
            $DiscountParams = $null
        } else {
            $DiscountParams = $JsonParameters.PSobject.Properties["discountParams"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "promocodeParams"))) { #optional property not found
            $PromocodeParams = $null
        } else {
            $PromocodeParams = $JsonParameters.PSobject.Properties["promocodeParams"].value
        }

        $PSO = [PSCustomObject]@{
            "discountParams" = ${DiscountParams}
            "promocodeParams" = ${PromocodeParams}
        }

        return $PSO
    }

}

