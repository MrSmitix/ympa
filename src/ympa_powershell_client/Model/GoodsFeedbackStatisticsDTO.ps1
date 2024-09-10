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

Статистическая информация по отзыву.

.PARAMETER Rating
Оценка товара.
.PARAMETER CommentsCount
Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
.PARAMETER Recommended
Рекомендуют ли этот товар.
.PARAMETER PaidAmount
Количество баллов Плюса, которое автор получил за отзыв.
.OUTPUTS

GoodsFeedbackStatisticsDTO<PSCustomObject>
#>

function Initialize-GoodsFeedbackStatisticsDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int32]
        ${Rating},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Int64]
        ${CommentsCount},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Recommended},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${PaidAmount}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GoodsFeedbackStatisticsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Rating) {
            throw "invalid value for 'Rating', 'Rating' cannot be null."
        }

        if ($Rating -gt 5) {
          throw "invalid value for 'Rating', must be smaller than or equal to 5."
        }

        if ($Rating -lt 1) {
          throw "invalid value for 'Rating', must be greater than or equal to 1."
        }

        if ($null -eq $CommentsCount) {
            throw "invalid value for 'CommentsCount', 'CommentsCount' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "rating" = ${Rating}
            "commentsCount" = ${CommentsCount}
            "recommended" = ${Recommended}
            "paidAmount" = ${PaidAmount}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GoodsFeedbackStatisticsDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to GoodsFeedbackStatisticsDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GoodsFeedbackStatisticsDTO<PSCustomObject>
#>
function ConvertFrom-JsonToGoodsFeedbackStatisticsDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GoodsFeedbackStatisticsDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GoodsFeedbackStatisticsDTO
        $AllProperties = ("rating", "commentsCount", "recommended", "paidAmount")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'rating' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "rating"))) {
            throw "Error! JSON cannot be serialized due to the required property 'rating' missing."
        } else {
            $Rating = $JsonParameters.PSobject.Properties["rating"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "commentsCount"))) {
            throw "Error! JSON cannot be serialized due to the required property 'commentsCount' missing."
        } else {
            $CommentsCount = $JsonParameters.PSobject.Properties["commentsCount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "recommended"))) { #optional property not found
            $Recommended = $null
        } else {
            $Recommended = $JsonParameters.PSobject.Properties["recommended"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "paidAmount"))) { #optional property not found
            $PaidAmount = $null
        } else {
            $PaidAmount = $JsonParameters.PSobject.Properties["paidAmount"].value
        }

        $PSO = [PSCustomObject]@{
            "rating" = ${Rating}
            "commentsCount" = ${CommentsCount}
            "recommended" = ${Recommended}
            "paidAmount" = ${PaidAmount}
        }

        return $PSO
    }

}

