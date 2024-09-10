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

Причины, по которым товар не прошел модерацию.

.PARAMETER Type
No description available.
.PARAMETER Payload
Дополнительная информация о причине отклонения товара. 
.OUTPUTS

OfferProcessingNoteDTO<PSCustomObject>
#>

function Initialize-OfferProcessingNoteDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("ASSORTMENT", "CANCELLED", "CONFLICTING_INFORMATION", "OTHER", "DEPARTMENT_FROZEN", "INCORRECT_INFORMATION", "LEGAL_CONFLICT", "NEED_CLASSIFICATION_INFORMATION", "NEED_INFORMATION", "NEED_PICTURES", "NEED_VENDOR", "NO_CATEGORY", "NO_KNOWLEDGE", "NO_PARAMETERS_IN_SHOP_TITLE", "NO_SIZE_MEASURE", "SAMPLE_LINE")]
        [PSCustomObject]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Payload}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OfferProcessingNoteDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "payload" = ${Payload}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OfferProcessingNoteDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OfferProcessingNoteDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OfferProcessingNoteDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOfferProcessingNoteDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OfferProcessingNoteDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OfferProcessingNoteDTO
        $AllProperties = ("type", "payload")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "payload"))) { #optional property not found
            $Payload = $null
        } else {
            $Payload = $JsonParameters.PSobject.Properties["payload"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "payload" = ${Payload}
        }

        return $PSO
    }

}

