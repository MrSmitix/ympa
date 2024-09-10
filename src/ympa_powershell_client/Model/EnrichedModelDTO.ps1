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

Модель товара.

.PARAMETER Id
Идентификатор модели товара.
.PARAMETER Name
Название модели товара.
.PARAMETER Prices
No description available.
.PARAMETER Offers
Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
.PARAMETER OfflineOffers
Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
.PARAMETER OnlineOffers
Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
.OUTPUTS

EnrichedModelDTO<PSCustomObject>
#>

function Initialize-EnrichedModelDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Prices},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Offers},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${OfflineOffers},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${OnlineOffers}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => EnrichedModelDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "name" = ${Name}
            "prices" = ${Prices}
            "offers" = ${Offers}
            "offlineOffers" = ${OfflineOffers}
            "onlineOffers" = ${OnlineOffers}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to EnrichedModelDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to EnrichedModelDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

EnrichedModelDTO<PSCustomObject>
#>
function ConvertFrom-JsonToEnrichedModelDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => EnrichedModelDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in EnrichedModelDTO
        $AllProperties = ("id", "name", "prices", "offers", "offlineOffers", "onlineOffers")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "prices"))) { #optional property not found
            $Prices = $null
        } else {
            $Prices = $JsonParameters.PSobject.Properties["prices"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "offers"))) { #optional property not found
            $Offers = $null
        } else {
            $Offers = $JsonParameters.PSobject.Properties["offers"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "offlineOffers"))) { #optional property not found
            $OfflineOffers = $null
        } else {
            $OfflineOffers = $JsonParameters.PSobject.Properties["offlineOffers"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "onlineOffers"))) { #optional property not found
            $OnlineOffers = $null
        } else {
            $OnlineOffers = $JsonParameters.PSobject.Properties["onlineOffers"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "name" = ${Name}
            "prices" = ${Prices}
            "offers" = ${Offers}
            "offlineOffers" = ${OfflineOffers}
            "onlineOffers" = ${OnlineOffers}
        }

        return $PSO
    }

}

