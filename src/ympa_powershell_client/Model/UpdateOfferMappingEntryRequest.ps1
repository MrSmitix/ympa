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

Запрос на обновление товаров.

.PARAMETER OfferMappingEntries
Информация о товарах в каталоге.
.OUTPUTS

UpdateOfferMappingEntryRequest<PSCustomObject>
#>

function Initialize-UpdateOfferMappingEntryRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${OfferMappingEntries}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => UpdateOfferMappingEntryRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $OfferMappingEntries) {
            throw "invalid value for 'OfferMappingEntries', 'OfferMappingEntries' cannot be null."
        }

        if ($OfferMappingEntries.length -gt 500) {
            throw "invalid value for 'OfferMappingEntries', number of items must be less than or equal to 500."
        }

        if ($OfferMappingEntries.length -lt 1) {
            throw "invalid value for 'OfferMappingEntries', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "offerMappingEntries" = ${OfferMappingEntries}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UpdateOfferMappingEntryRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to UpdateOfferMappingEntryRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UpdateOfferMappingEntryRequest<PSCustomObject>
#>
function ConvertFrom-JsonToUpdateOfferMappingEntryRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => UpdateOfferMappingEntryRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UpdateOfferMappingEntryRequest
        $AllProperties = ("offerMappingEntries")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'offerMappingEntries' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "offerMappingEntries"))) {
            throw "Error! JSON cannot be serialized due to the required property 'offerMappingEntries' missing."
        } else {
            $OfferMappingEntries = $JsonParameters.PSobject.Properties["offerMappingEntries"].value
        }

        $PSO = [PSCustomObject]@{
            "offerMappingEntries" = ${OfferMappingEntries}
        }

        return $PSO
    }

}

