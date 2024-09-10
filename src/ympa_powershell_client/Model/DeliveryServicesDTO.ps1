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

Информация о службах доставки.

.PARAMETER DeliveryService
Информация о службе доставки.
.OUTPUTS

DeliveryServicesDTO<PSCustomObject>
#>

function Initialize-DeliveryServicesDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${DeliveryService}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => DeliveryServicesDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $DeliveryService) {
            throw "invalid value for 'DeliveryService', 'DeliveryService' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "deliveryService" = ${DeliveryService}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to DeliveryServicesDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to DeliveryServicesDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

DeliveryServicesDTO<PSCustomObject>
#>
function ConvertFrom-JsonToDeliveryServicesDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => DeliveryServicesDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in DeliveryServicesDTO
        $AllProperties = ("deliveryService")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'deliveryService' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deliveryService"))) {
            throw "Error! JSON cannot be serialized due to the required property 'deliveryService' missing."
        } else {
            $DeliveryService = $JsonParameters.PSobject.Properties["deliveryService"].value
        }

        $PSO = [PSCustomObject]@{
            "deliveryService" = ${DeliveryService}
        }

        return $PSO
    }

}

