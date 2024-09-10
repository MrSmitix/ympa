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

Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 

.PARAMETER Type
No description available.
.PARAMETER Amount
Сумма субсидии.
.OUTPUTS

OrderItemSubsidyDTO<PSCustomObject>
#>

function Initialize-OrderItemSubsidyDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("YANDEX_CASHBACK", "SUBSIDY")]
        [PSCustomObject]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Amount}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OrderItemSubsidyDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "amount" = ${Amount}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderItemSubsidyDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderItemSubsidyDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderItemSubsidyDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOrderItemSubsidyDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OrderItemSubsidyDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderItemSubsidyDTO
        $AllProperties = ("type", "amount")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount"))) { #optional property not found
            $Amount = $null
        } else {
            $Amount = $JsonParameters.PSobject.Properties["amount"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "amount" = ${Amount}
        }

        return $PSO
    }

}

