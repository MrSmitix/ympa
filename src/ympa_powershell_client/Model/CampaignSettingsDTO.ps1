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

Настройки магазина.

.PARAMETER CountryRegion
Идентификатор региона, в котором находится магазин.
.PARAMETER ShopName
Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
.PARAMETER ShowInContext
Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
.PARAMETER ShowInPremium
Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
.PARAMETER UseOpenStat
Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
.PARAMETER LocalRegion
No description available.
.OUTPUTS

CampaignSettingsDTO<PSCustomObject>
#>

function Initialize-CampaignSettingsDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${CountryRegion},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ShopName},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${ShowInContext},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${ShowInPremium},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${UseOpenStat},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${LocalRegion}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => CampaignSettingsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "countryRegion" = ${CountryRegion}
            "shopName" = ${ShopName}
            "showInContext" = ${ShowInContext}
            "showInPremium" = ${ShowInPremium}
            "useOpenStat" = ${UseOpenStat}
            "localRegion" = ${LocalRegion}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CampaignSettingsDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to CampaignSettingsDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CampaignSettingsDTO<PSCustomObject>
#>
function ConvertFrom-JsonToCampaignSettingsDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => CampaignSettingsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CampaignSettingsDTO
        $AllProperties = ("countryRegion", "shopName", "showInContext", "showInPremium", "useOpenStat", "localRegion")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "countryRegion"))) { #optional property not found
            $CountryRegion = $null
        } else {
            $CountryRegion = $JsonParameters.PSobject.Properties["countryRegion"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "shopName"))) { #optional property not found
            $ShopName = $null
        } else {
            $ShopName = $JsonParameters.PSobject.Properties["shopName"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "showInContext"))) { #optional property not found
            $ShowInContext = $null
        } else {
            $ShowInContext = $JsonParameters.PSobject.Properties["showInContext"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "showInPremium"))) { #optional property not found
            $ShowInPremium = $null
        } else {
            $ShowInPremium = $JsonParameters.PSobject.Properties["showInPremium"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "useOpenStat"))) { #optional property not found
            $UseOpenStat = $null
        } else {
            $UseOpenStat = $JsonParameters.PSobject.Properties["useOpenStat"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "localRegion"))) { #optional property not found
            $LocalRegion = $null
        } else {
            $LocalRegion = $JsonParameters.PSobject.Properties["localRegion"].value
        }

        $PSO = [PSCustomObject]@{
            "countryRegion" = ${CountryRegion}
            "shopName" = ${ShopName}
            "showInContext" = ${ShowInContext}
            "showInPremium" = ${ShowInPremium}
            "useOpenStat" = ${UseOpenStat}
            "localRegion" = ${LocalRegion}
        }

        return $PSO
    }

}

