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

Рекомендованная ставка и возможная доля показов.

.PARAMETER Bid
Значение ставки.
.PARAMETER ShowPercent
Доля показов. 
.OUTPUTS

BidRecommendationItemDTO<PSCustomObject>
#>

function Initialize-BidRecommendationItemDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${Bid},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Int64]
        ${ShowPercent}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => BidRecommendationItemDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Bid) {
            throw "invalid value for 'Bid', 'Bid' cannot be null."
        }

        if ($Bid -gt 9999) {
          throw "invalid value for 'Bid', must be smaller than or equal to 9999."
        }

        if ($Bid -lt 0) {
          throw "invalid value for 'Bid', must be greater than or equal to 0."
        }

        if ($null -eq $ShowPercent) {
            throw "invalid value for 'ShowPercent', 'ShowPercent' cannot be null."
        }

        if ($ShowPercent -gt 100) {
          throw "invalid value for 'ShowPercent', must be smaller than or equal to 100."
        }

        if ($ShowPercent -lt 0) {
          throw "invalid value for 'ShowPercent', must be greater than or equal to 0."
        }


        $PSO = [PSCustomObject]@{
            "bid" = ${Bid}
            "showPercent" = ${ShowPercent}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BidRecommendationItemDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to BidRecommendationItemDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BidRecommendationItemDTO<PSCustomObject>
#>
function ConvertFrom-JsonToBidRecommendationItemDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => BidRecommendationItemDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BidRecommendationItemDTO
        $AllProperties = ("bid", "showPercent")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'bid' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bid"))) {
            throw "Error! JSON cannot be serialized due to the required property 'bid' missing."
        } else {
            $Bid = $JsonParameters.PSobject.Properties["bid"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "showPercent"))) {
            throw "Error! JSON cannot be serialized due to the required property 'showPercent' missing."
        } else {
            $ShowPercent = $JsonParameters.PSobject.Properties["showPercent"].value
        }

        $PSO = [PSCustomObject]@{
            "bid" = ${Bid}
            "showPercent" = ${ShowPercent}
        }

        return $PSO
    }

}

