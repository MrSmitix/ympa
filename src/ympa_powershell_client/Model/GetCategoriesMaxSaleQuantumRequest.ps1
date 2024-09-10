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

Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 

.PARAMETER MarketCategoryIds
Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
.OUTPUTS

GetCategoriesMaxSaleQuantumRequest<PSCustomObject>
#>

function Initialize-GetCategoriesMaxSaleQuantumRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int64[]]
        ${MarketCategoryIds}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetCategoriesMaxSaleQuantumRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $MarketCategoryIds) {
            throw "invalid value for 'MarketCategoryIds', 'MarketCategoryIds' cannot be null."
        }

        if ($MarketCategoryIds.length -gt 1500) {
            throw "invalid value for 'MarketCategoryIds', number of items must be less than or equal to 1500."
        }

        if ($MarketCategoryIds.length -lt 1) {
            throw "invalid value for 'MarketCategoryIds', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "marketCategoryIds" = ${MarketCategoryIds}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetCategoriesMaxSaleQuantumRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetCategoriesMaxSaleQuantumRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetCategoriesMaxSaleQuantumRequest<PSCustomObject>
#>
function ConvertFrom-JsonToGetCategoriesMaxSaleQuantumRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetCategoriesMaxSaleQuantumRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetCategoriesMaxSaleQuantumRequest
        $AllProperties = ("marketCategoryIds")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'marketCategoryIds' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "marketCategoryIds"))) {
            throw "Error! JSON cannot be serialized due to the required property 'marketCategoryIds' missing."
        } else {
            $MarketCategoryIds = $JsonParameters.PSobject.Properties["marketCategoryIds"].value
        }

        $PSO = [PSCustomObject]@{
            "marketCategoryIds" = ${MarketCategoryIds}
        }

        return $PSO
    }

}

