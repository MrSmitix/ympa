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

Информация об акции «Бестселлеры Маркета».

.PARAMETER Bestseller
Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
.PARAMETER EntryDeadline
До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
.OUTPUTS

GetPromoBestsellerInfoDTO<PSCustomObject>
#>

function Initialize-GetPromoBestsellerInfoDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Boolean]
        ${Bestseller},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${EntryDeadline}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetPromoBestsellerInfoDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Bestseller) {
            throw "invalid value for 'Bestseller', 'Bestseller' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "bestseller" = ${Bestseller}
            "entryDeadline" = ${EntryDeadline}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetPromoBestsellerInfoDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetPromoBestsellerInfoDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetPromoBestsellerInfoDTO<PSCustomObject>
#>
function ConvertFrom-JsonToGetPromoBestsellerInfoDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetPromoBestsellerInfoDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetPromoBestsellerInfoDTO
        $AllProperties = ("bestseller", "entryDeadline")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'bestseller' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bestseller"))) {
            throw "Error! JSON cannot be serialized due to the required property 'bestseller' missing."
        } else {
            $Bestseller = $JsonParameters.PSobject.Properties["bestseller"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "entryDeadline"))) { #optional property not found
            $EntryDeadline = $null
        } else {
            $EntryDeadline = $JsonParameters.PSobject.Properties["entryDeadline"].value
        }

        $PSO = [PSCustomObject]@{
            "bestseller" = ${Bestseller}
            "entryDeadline" = ${EntryDeadline}
        }

        return $PSO
    }

}

