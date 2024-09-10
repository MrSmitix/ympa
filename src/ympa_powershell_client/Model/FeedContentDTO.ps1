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

Информация о проверке содержимого прайс-листа, загруженного на Маркет.

.PARAMETER RejectedOffersCount
Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
.PARAMETER Status
No description available.
.PARAMETER TotalOffersCount
Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
.PARAMETER VarError
No description available.
.OUTPUTS

FeedContentDTO<PSCustomObject>
#>

function Initialize-FeedContentDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${RejectedOffersCount},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("ERROR", "NA", "OK")]
        [PSCustomObject]
        ${Status},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${TotalOffersCount},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarError}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => FeedContentDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "rejectedOffersCount" = ${RejectedOffersCount}
            "status" = ${Status}
            "totalOffersCount" = ${TotalOffersCount}
            "error" = ${VarError}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to FeedContentDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to FeedContentDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

FeedContentDTO<PSCustomObject>
#>
function ConvertFrom-JsonToFeedContentDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => FeedContentDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in FeedContentDTO
        $AllProperties = ("rejectedOffersCount", "status", "totalOffersCount", "error")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "rejectedOffersCount"))) { #optional property not found
            $RejectedOffersCount = $null
        } else {
            $RejectedOffersCount = $JsonParameters.PSobject.Properties["rejectedOffersCount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) { #optional property not found
            $Status = $null
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "totalOffersCount"))) { #optional property not found
            $TotalOffersCount = $null
        } else {
            $TotalOffersCount = $JsonParameters.PSobject.Properties["totalOffersCount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "error"))) { #optional property not found
            $VarError = $null
        } else {
            $VarError = $JsonParameters.PSobject.Properties["error"].value
        }

        $PSO = [PSCustomObject]@{
            "rejectedOffersCount" = ${RejectedOffersCount}
            "status" = ${Status}
            "totalOffersCount" = ${TotalOffersCount}
            "error" = ${VarError}
        }

        return $PSO
    }

}

