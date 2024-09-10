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

Информация о документах. 

.PARAMETER Upd
No description available.
.PARAMETER Ukd
No description available.
.PARAMETER TorgTwelve
No description available.
.PARAMETER Sf
No description available.
.PARAMETER Ksf
No description available.
.OUTPUTS

OrderBusinessDocumentsDTO<PSCustomObject>
#>

function Initialize-OrderBusinessDocumentsDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Upd},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Ukd},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${TorgTwelve},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Sf},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Ksf}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OrderBusinessDocumentsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "upd" = ${Upd}
            "ukd" = ${Ukd}
            "torgTwelve" = ${TorgTwelve}
            "sf" = ${Sf}
            "ksf" = ${Ksf}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderBusinessDocumentsDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderBusinessDocumentsDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderBusinessDocumentsDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOrderBusinessDocumentsDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OrderBusinessDocumentsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderBusinessDocumentsDTO
        $AllProperties = ("upd", "ukd", "torgTwelve", "sf", "ksf")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "upd"))) { #optional property not found
            $Upd = $null
        } else {
            $Upd = $JsonParameters.PSobject.Properties["upd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ukd"))) { #optional property not found
            $Ukd = $null
        } else {
            $Ukd = $JsonParameters.PSobject.Properties["ukd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "torgTwelve"))) { #optional property not found
            $TorgTwelve = $null
        } else {
            $TorgTwelve = $JsonParameters.PSobject.Properties["torgTwelve"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sf"))) { #optional property not found
            $Sf = $null
        } else {
            $Sf = $JsonParameters.PSobject.Properties["sf"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ksf"))) { #optional property not found
            $Ksf = $null
        } else {
            $Ksf = $JsonParameters.PSobject.Properties["ksf"].value
        }

        $PSO = [PSCustomObject]@{
            "upd" = ${Upd}
            "ukd" = ${Ukd}
            "torgTwelve" = ${TorgTwelve}
            "sf" = ${Sf}
            "ksf" = ${Ksf}
        }

        return $PSO
    }

}

