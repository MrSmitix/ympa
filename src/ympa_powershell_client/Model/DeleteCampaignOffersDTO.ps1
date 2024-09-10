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

Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.

.PARAMETER NotDeletedOfferIds
Список SKU.
.OUTPUTS

DeleteCampaignOffersDTO<PSCustomObject>
#>

function Initialize-DeleteCampaignOffersDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${NotDeletedOfferIds}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => DeleteCampaignOffersDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "notDeletedOfferIds" = ${NotDeletedOfferIds}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to DeleteCampaignOffersDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to DeleteCampaignOffersDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

DeleteCampaignOffersDTO<PSCustomObject>
#>
function ConvertFrom-JsonToDeleteCampaignOffersDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => DeleteCampaignOffersDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in DeleteCampaignOffersDTO
        $AllProperties = ("notDeletedOfferIds")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "notDeletedOfferIds"))) { #optional property not found
            $NotDeletedOfferIds = $null
        } else {
            $NotDeletedOfferIds = $JsonParameters.PSobject.Properties["notDeletedOfferIds"].value
        }

        $PSO = [PSCustomObject]@{
            "notDeletedOfferIds" = ${NotDeletedOfferIds}
        }

        return $PSO
    }

}

