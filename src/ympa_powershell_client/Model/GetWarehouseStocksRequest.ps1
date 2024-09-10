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

Фильтры для запроса остатков. 

.PARAMETER WithTurnover
**Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
.PARAMETER Archived
Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
.PARAMETER OfferIds
Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning ""Такой список возвращается только целиком"" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
.OUTPUTS

GetWarehouseStocksRequest<PSCustomObject>
#>

function Initialize-GetWarehouseStocksRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${WithTurnover} = $false,
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Archived},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${OfferIds}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetWarehouseStocksRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if (!$OfferIds -and $OfferIds.length -gt 500) {
            throw "invalid value for 'OfferIds', number of items must be less than or equal to 500."
        }


        $PSO = [PSCustomObject]@{
            "withTurnover" = ${WithTurnover}
            "archived" = ${Archived}
            "offerIds" = ${OfferIds}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetWarehouseStocksRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetWarehouseStocksRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetWarehouseStocksRequest<PSCustomObject>
#>
function ConvertFrom-JsonToGetWarehouseStocksRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetWarehouseStocksRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetWarehouseStocksRequest
        $AllProperties = ("withTurnover", "archived", "offerIds")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "withTurnover"))) { #optional property not found
            $WithTurnover = $null
        } else {
            $WithTurnover = $JsonParameters.PSobject.Properties["withTurnover"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "archived"))) { #optional property not found
            $Archived = $null
        } else {
            $Archived = $JsonParameters.PSobject.Properties["archived"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "offerIds"))) { #optional property not found
            $OfferIds = $null
        } else {
            $OfferIds = $JsonParameters.PSobject.Properties["offerIds"].value
        }

        $PSO = [PSCustomObject]@{
            "withTurnover" = ${WithTurnover}
            "archived" = ${Archived}
            "offerIds" = ${OfferIds}
        }

        return $PSO
    }

}

