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

Список режимов работы точки продаж. 

.PARAMETER WorkInHoliday
Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
.PARAMETER ScheduleItems
Список расписаний работы точки продаж. 
.OUTPUTS

OutletWorkingScheduleDTO<PSCustomObject>
#>

function Initialize-OutletWorkingScheduleDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${WorkInHoliday},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${ScheduleItems}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OutletWorkingScheduleDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $ScheduleItems) {
            throw "invalid value for 'ScheduleItems', 'ScheduleItems' cannot be null."
        }

        if ($ScheduleItems.length -lt 1) {
            throw "invalid value for 'ScheduleItems', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "workInHoliday" = ${WorkInHoliday}
            "scheduleItems" = ${ScheduleItems}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OutletWorkingScheduleDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OutletWorkingScheduleDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OutletWorkingScheduleDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOutletWorkingScheduleDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OutletWorkingScheduleDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OutletWorkingScheduleDTO
        $AllProperties = ("workInHoliday", "scheduleItems")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'scheduleItems' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "scheduleItems"))) {
            throw "Error! JSON cannot be serialized due to the required property 'scheduleItems' missing."
        } else {
            $ScheduleItems = $JsonParameters.PSobject.Properties["scheduleItems"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "workInHoliday"))) { #optional property not found
            $WorkInHoliday = $null
        } else {
            $WorkInHoliday = $JsonParameters.PSobject.Properties["workInHoliday"].value
        }

        $PSO = [PSCustomObject]@{
            "workInHoliday" = ${WorkInHoliday}
            "scheduleItems" = ${ScheduleItems}
        }

        return $PSO
    }

}

