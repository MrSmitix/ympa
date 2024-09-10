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

Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 

.PARAMETER OfferIds
Идентификаторы товаров, информация о которых нужна.  {% note warning ""Такой список возвращается только целиком"" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
.PARAMETER Statuses
Фильтр по статусам товаров. 
.PARAMETER CategoryIds
Фильтр по категориям на Маркете.
.PARAMETER VendorNames
Фильтр по брендам.
.PARAMETER Tags
Фильтр по тегам.
.OUTPUTS

GetCampaignOffersRequest<PSCustomObject>
#>

function Initialize-GetCampaignOffersRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${OfferIds},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Statuses},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Int32[]]
        ${CategoryIds},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${VendorNames},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Tags}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetCampaignOffersRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if (!$OfferIds -and $OfferIds.length -gt 200) {
            throw "invalid value for 'OfferIds', number of items must be less than or equal to 200."
        }


        $PSO = [PSCustomObject]@{
            "offerIds" = ${OfferIds}
            "statuses" = ${Statuses}
            "categoryIds" = ${CategoryIds}
            "vendorNames" = ${VendorNames}
            "tags" = ${Tags}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetCampaignOffersRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetCampaignOffersRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetCampaignOffersRequest<PSCustomObject>
#>
function ConvertFrom-JsonToGetCampaignOffersRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetCampaignOffersRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetCampaignOffersRequest
        $AllProperties = ("offerIds", "statuses", "categoryIds", "vendorNames", "tags")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "offerIds"))) { #optional property not found
            $OfferIds = $null
        } else {
            $OfferIds = $JsonParameters.PSobject.Properties["offerIds"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "statuses"))) { #optional property not found
            $Statuses = $null
        } else {
            $Statuses = $JsonParameters.PSobject.Properties["statuses"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "categoryIds"))) { #optional property not found
            $CategoryIds = $null
        } else {
            $CategoryIds = $JsonParameters.PSobject.Properties["categoryIds"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vendorNames"))) { #optional property not found
            $VendorNames = $null
        } else {
            $VendorNames = $JsonParameters.PSobject.Properties["vendorNames"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tags"))) { #optional property not found
            $Tags = $null
        } else {
            $Tags = $JsonParameters.PSobject.Properties["tags"].value
        }

        $PSO = [PSCustomObject]@{
            "offerIds" = ${OfferIds}
            "statuses" = ${Statuses}
            "categoryIds" = ${CategoryIds}
            "vendorNames" = ${VendorNames}
            "tags" = ${Tags}
        }

        return $PSO
    }

}

