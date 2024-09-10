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

Диапазон дат доставки.

.PARAMETER RealDeliveryDate
**Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning ""Индекс качества"" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      
.OUTPUTS

OrderStatusChangeDeliveryDatesDTO<PSCustomObject>
#>

function Initialize-OrderStatusChangeDeliveryDatesDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${RealDeliveryDate}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OrderStatusChangeDeliveryDatesDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "realDeliveryDate" = ${RealDeliveryDate}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderStatusChangeDeliveryDatesDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderStatusChangeDeliveryDatesDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderStatusChangeDeliveryDatesDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOrderStatusChangeDeliveryDatesDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OrderStatusChangeDeliveryDatesDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderStatusChangeDeliveryDatesDTO
        $AllProperties = ("realDeliveryDate")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "realDeliveryDate"))) { #optional property not found
            $RealDeliveryDate = $null
        } else {
            $RealDeliveryDate = $JsonParameters.PSobject.Properties["realDeliveryDate"].value
        }

        $PSO = [PSCustomObject]@{
            "realDeliveryDate" = ${RealDeliveryDate}
        }

        return $PSO
    }

}

