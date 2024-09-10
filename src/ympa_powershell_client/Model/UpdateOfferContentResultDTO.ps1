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

Ошибки и предупреждения, которые появились из-за переданных характеристик.

.PARAMETER OfferId
Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
.PARAMETER Errors
Ошибки — информация в каталоге не обновится.
.PARAMETER Warnings
Предупреждения — информация в каталоге обновится.
.OUTPUTS

UpdateOfferContentResultDTO<PSCustomObject>
#>

function Initialize-UpdateOfferContentResultDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$")]
        [String]
        ${OfferId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Errors},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Warnings}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => UpdateOfferContentResultDTO' | Write-Debug
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


        $PSO = [PSCustomObject]@{
            "offerId" = ${OfferId}
            "errors" = ${Errors}
            "warnings" = ${Warnings}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UpdateOfferContentResultDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UpdateOfferContentResultDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UpdateOfferContentResultDTO<PSCustomObject>
#>
function ConvertFrom-JsonToUpdateOfferContentResultDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => UpdateOfferContentResultDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UpdateOfferContentResultDTO
        $AllProperties = ("offerId", "errors", "warnings")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "errors"))) { #optional property not found
            $Errors = $null
        } else {
            $Errors = $JsonParameters.PSobject.Properties["errors"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "warnings"))) { #optional property not found
            $Warnings = $null
        } else {
            $Warnings = $JsonParameters.PSobject.Properties["warnings"].value
        }

        $PSO = [PSCustomObject]@{
            "offerId" = ${OfferId}
            "errors" = ${Errors}
            "warnings" = ${Warnings}
        }

        return $PSO
    }

}

