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

Рекомендованная цена.

.PARAMETER CampaignId
Идентификатор кампании.
.PARAMETER Price
Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
.OUTPUTS

PriceRecommendationItemDTO<PSCustomObject>
#>

function Initialize-PriceRecommendationItemDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int64]
        ${CampaignId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${Price}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => PriceRecommendationItemDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $CampaignId) {
            throw "invalid value for 'CampaignId', 'CampaignId' cannot be null."
        }

        if ($null -eq $Price) {
            throw "invalid value for 'Price', 'Price' cannot be null."
        }

        if ($Price -lt 1) {
          throw "invalid value for 'Price', must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "campaignId" = ${CampaignId}
            "price" = ${Price}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to PriceRecommendationItemDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to PriceRecommendationItemDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

PriceRecommendationItemDTO<PSCustomObject>
#>
function ConvertFrom-JsonToPriceRecommendationItemDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => PriceRecommendationItemDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PriceRecommendationItemDTO
        $AllProperties = ("campaignId", "price")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'campaignId' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "campaignId"))) {
            throw "Error! JSON cannot be serialized due to the required property 'campaignId' missing."
        } else {
            $CampaignId = $JsonParameters.PSobject.Properties["campaignId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "price"))) {
            throw "Error! JSON cannot be serialized due to the required property 'price' missing."
        } else {
            $Price = $JsonParameters.PSobject.Properties["price"].value
        }

        $PSO = [PSCustomObject]@{
            "campaignId" = ${CampaignId}
            "price" = ${Price}
        }

        return $PSO
    }

}

