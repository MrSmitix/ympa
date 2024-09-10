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

Товары, которые не удалось восстановить из архива.

.PARAMETER NotUnarchivedOfferIds
Список товаров, которые не удалось восстановить из архива.
.OUTPUTS

DeleteOffersFromArchiveDTO<PSCustomObject>
#>

function Initialize-DeleteOffersFromArchiveDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${NotUnarchivedOfferIds}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => DeleteOffersFromArchiveDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "notUnarchivedOfferIds" = ${NotUnarchivedOfferIds}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to DeleteOffersFromArchiveDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to DeleteOffersFromArchiveDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

DeleteOffersFromArchiveDTO<PSCustomObject>
#>
function ConvertFrom-JsonToDeleteOffersFromArchiveDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => DeleteOffersFromArchiveDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in DeleteOffersFromArchiveDTO
        $AllProperties = ("notUnarchivedOfferIds")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "notUnarchivedOfferIds"))) { #optional property not found
            $NotUnarchivedOfferIds = $null
        } else {
            $NotUnarchivedOfferIds = $JsonParameters.PSobject.Properties["notUnarchivedOfferIds"].value
        }

        $PSO = [PSCustomObject]@{
            "notUnarchivedOfferIds" = ${NotUnarchivedOfferIds}
        }

        return $PSO
    }

}

