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

Описание предупреждения, которое появилось при добавлении товара.

.PARAMETER OfferId
Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
.PARAMETER Warnings
Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
.OUTPUTS

WarningPromoOfferUpdateDTO<PSCustomObject>
#>

function Initialize-WarningPromoOfferUpdateDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$")]
        [String]
        ${OfferId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Warnings}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => WarningPromoOfferUpdateDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $OfferId) {
            throw "invalid value for 'OfferId', 'OfferId' cannot be null."
        }

        if ($OfferId.length -gt 255) {
            throw "invalid value for 'OfferId', the character length must be smaller than or equal to 255."
        }

        if ($OfferId.length -lt 1) {
            throw "invalid value for 'OfferId', the character length must be great than or equal to 1."
        }

        if ($null -eq $Warnings) {
            throw "invalid value for 'Warnings', 'Warnings' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "offerId" = ${OfferId}
            "warnings" = ${Warnings}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to WarningPromoOfferUpdateDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to WarningPromoOfferUpdateDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

WarningPromoOfferUpdateDTO<PSCustomObject>
#>
function ConvertFrom-JsonToWarningPromoOfferUpdateDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => WarningPromoOfferUpdateDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in WarningPromoOfferUpdateDTO
        $AllProperties = ("offerId", "warnings")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'offerId' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "offerId"))) {
            throw "Error! JSON cannot be serialized due to the required property 'offerId' missing."
        } else {
            $OfferId = $JsonParameters.PSobject.Properties["offerId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "warnings"))) {
            throw "Error! JSON cannot be serialized due to the required property 'warnings' missing."
        } else {
            $Warnings = $JsonParameters.PSobject.Properties["warnings"].value
        }

        $PSO = [PSCustomObject]@{
            "offerId" = ${OfferId}
            "warnings" = ${Warnings}
        }

        return $PSO
    }

}

