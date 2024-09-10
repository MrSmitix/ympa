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

Модель для ответа API списка информации по заказам.

.PARAMETER Pager
No description available.
.PARAMETER Orders
Модель заказа. 
.PARAMETER Paging
No description available.
.OUTPUTS

GetOrdersResponse<PSCustomObject>
#>

function Initialize-GetOrdersResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Pager},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Orders},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Paging}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetOrdersResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Orders) {
            throw "invalid value for 'Orders', 'Orders' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "pager" = ${Pager}
            "orders" = ${Orders}
            "paging" = ${Paging}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetOrdersResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetOrdersResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetOrdersResponse<PSCustomObject>
#>
function ConvertFrom-JsonToGetOrdersResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetOrdersResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetOrdersResponse
        $AllProperties = ("pager", "orders", "paging")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pager"))) { #optional property not found
            $Pager = $null
        } else {
            $Pager = $JsonParameters.PSobject.Properties["pager"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "paging"))) { #optional property not found
            $Paging = $null
        } else {
            $Paging = $JsonParameters.PSobject.Properties["paging"].value
        }

        $PSO = [PSCustomObject]@{
            "pager" = ${Pager}
            "orders" = ${Orders}
            "paging" = ${Paging}
        }

        return $PSO
    }

}

