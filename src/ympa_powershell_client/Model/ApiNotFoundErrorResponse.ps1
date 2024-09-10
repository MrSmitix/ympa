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

Запрашиваемый ресурс не найден.

.PARAMETER Status
No description available.
.PARAMETER Errors
Список ошибок.
.OUTPUTS

ApiNotFoundErrorResponse<PSCustomObject>
#>

function Initialize-ApiNotFoundErrorResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("OK", "ERROR")]
        [PSCustomObject]
        ${Status},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Errors}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => ApiNotFoundErrorResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "status" = ${Status}
            "errors" = ${Errors}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ApiNotFoundErrorResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to ApiNotFoundErrorResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ApiNotFoundErrorResponse<PSCustomObject>
#>
function ConvertFrom-JsonToApiNotFoundErrorResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => ApiNotFoundErrorResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ApiNotFoundErrorResponse
        $AllProperties = ("status", "errors")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) { #optional property not found
            $Status = $null
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "errors"))) { #optional property not found
            $Errors = $null
        } else {
            $Errors = $JsonParameters.PSobject.Properties["errors"].value
        }

        $PSO = [PSCustomObject]@{
            "status" = ${Status}
            "errors" = ${Errors}
        }

        return $PSO
    }

}

