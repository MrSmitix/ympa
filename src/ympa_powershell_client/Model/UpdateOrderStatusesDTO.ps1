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

Список заказов, статус которых обновился.

.PARAMETER Orders
Список с обновленными заказами.
.OUTPUTS

UpdateOrderStatusesDTO<PSCustomObject>
#>

function Initialize-UpdateOrderStatusesDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Orders}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => UpdateOrderStatusesDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Orders) {
            throw "invalid value for 'Orders', 'Orders' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "orders" = ${Orders}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UpdateOrderStatusesDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UpdateOrderStatusesDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UpdateOrderStatusesDTO<PSCustomObject>
#>
function ConvertFrom-JsonToUpdateOrderStatusesDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => UpdateOrderStatusesDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UpdateOrderStatusesDTO
        $AllProperties = ("orders")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'orders' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "orders"))) {
            throw "Error! JSON cannot be serialized due to the required property 'orders' missing."
        } else {
            $Orders = $JsonParameters.PSobject.Properties["orders"].value
        }

        $PSO = [PSCustomObject]@{
            "orders" = ${Orders}
        }

        return $PSO
    }

}

