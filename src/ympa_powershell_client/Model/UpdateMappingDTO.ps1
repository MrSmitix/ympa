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

Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 

.PARAMETER MarketSku
SKU на Маркете.
.OUTPUTS

UpdateMappingDTO<PSCustomObject>
#>

function Initialize-UpdateMappingDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${MarketSku}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => UpdateMappingDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "marketSku" = ${MarketSku}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UpdateMappingDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UpdateMappingDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UpdateMappingDTO<PSCustomObject>
#>
function ConvertFrom-JsonToUpdateMappingDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => UpdateMappingDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UpdateMappingDTO
        $AllProperties = ("marketSku")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "marketSku"))) { #optional property not found
            $MarketSku = $null
        } else {
            $MarketSku = $JsonParameters.PSobject.Properties["marketSku"].value
        }

        $PSO = [PSCustomObject]@{
            "marketSku" = ${MarketSku}
        }

        return $PSO
    }

}

