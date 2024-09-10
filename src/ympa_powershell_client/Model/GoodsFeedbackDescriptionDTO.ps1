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

Текстовая часть отзыва.

.PARAMETER Advantages
Описание плюсов товара в отзыве.
.PARAMETER Disadvantages
Описание минусов товара в отзыве.
.PARAMETER Comment
Комментарий в отзыве.
.OUTPUTS

GoodsFeedbackDescriptionDTO<PSCustomObject>
#>

function Initialize-GoodsFeedbackDescriptionDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Advantages},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Disadvantages},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Comment}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GoodsFeedbackDescriptionDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "advantages" = ${Advantages}
            "disadvantages" = ${Disadvantages}
            "comment" = ${Comment}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GoodsFeedbackDescriptionDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to GoodsFeedbackDescriptionDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GoodsFeedbackDescriptionDTO<PSCustomObject>
#>
function ConvertFrom-JsonToGoodsFeedbackDescriptionDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GoodsFeedbackDescriptionDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GoodsFeedbackDescriptionDTO
        $AllProperties = ("advantages", "disadvantages", "comment")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "advantages"))) { #optional property not found
            $Advantages = $null
        } else {
            $Advantages = $JsonParameters.PSobject.Properties["advantages"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "disadvantages"))) { #optional property not found
            $Disadvantages = $null
        } else {
            $Disadvantages = $JsonParameters.PSobject.Properties["disadvantages"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "comment"))) { #optional property not found
            $Comment = $null
        } else {
            $Comment = $JsonParameters.PSobject.Properties["comment"].value
        }

        $PSO = [PSCustomObject]@{
            "advantages" = ${Advantages}
            "disadvantages" = ${Disadvantages}
            "comment" = ${Comment}
        }

        return $PSO
    }

}

