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

Запрос переноса заказов из отгрузки.

.PARAMETER OrderIds
Список заказов, которые вы не успеваете подготовить.
.OUTPUTS

TransferOrdersFromShipmentRequest<PSCustomObject>
#>

function Initialize-TransferOrdersFromShipmentRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int64[]]
        ${OrderIds}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => TransferOrdersFromShipmentRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $OrderIds) {
            throw "invalid value for 'OrderIds', 'OrderIds' cannot be null."
        }

        if ($OrderIds.length -gt 500) {
            throw "invalid value for 'OrderIds', number of items must be less than or equal to 500."
        }

        if ($OrderIds.length -lt 1) {
            throw "invalid value for 'OrderIds', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "orderIds" = ${OrderIds}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to TransferOrdersFromShipmentRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to TransferOrdersFromShipmentRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

TransferOrdersFromShipmentRequest<PSCustomObject>
#>
function ConvertFrom-JsonToTransferOrdersFromShipmentRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => TransferOrdersFromShipmentRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in TransferOrdersFromShipmentRequest
        $AllProperties = ("orderIds")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'orderIds' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "orderIds"))) {
            throw "Error! JSON cannot be serialized due to the required property 'orderIds' missing."
        } else {
            $OrderIds = $JsonParameters.PSobject.Properties["orderIds"].value
        }

        $PSO = [PSCustomObject]@{
            "orderIds" = ${OrderIds}
        }

        return $PSO
    }

}

