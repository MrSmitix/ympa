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

Расписание работы точки продаж.

.PARAMETER StartDay
No description available.
.PARAMETER EndDay
No description available.
.PARAMETER StartTime
Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
.PARAMETER EndTime
Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
.OUTPUTS

OutletWorkingScheduleItemDTO<PSCustomObject>
#>

function Initialize-OutletWorkingScheduleItemDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY")]
        [PSCustomObject]
        ${StartDay},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY")]
        [PSCustomObject]
        ${EndDay},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${StartTime},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${EndTime}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OutletWorkingScheduleItemDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $StartDay) {
            throw "invalid value for 'StartDay', 'StartDay' cannot be null."
        }

        if ($null -eq $EndDay) {
            throw "invalid value for 'EndDay', 'EndDay' cannot be null."
        }

        if ($null -eq $StartTime) {
            throw "invalid value for 'StartTime', 'StartTime' cannot be null."
        }

        if ($StartTime.length -lt 1) {
            throw "invalid value for 'StartTime', the character length must be great than or equal to 1."
        }

        if ($null -eq $EndTime) {
            throw "invalid value for 'EndTime', 'EndTime' cannot be null."
        }

        if ($EndTime.length -lt 1) {
            throw "invalid value for 'EndTime', the character length must be great than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "startDay" = ${StartDay}
            "endDay" = ${EndDay}
            "startTime" = ${StartTime}
            "endTime" = ${EndTime}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OutletWorkingScheduleItemDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OutletWorkingScheduleItemDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OutletWorkingScheduleItemDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOutletWorkingScheduleItemDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OutletWorkingScheduleItemDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OutletWorkingScheduleItemDTO
        $AllProperties = ("startDay", "endDay", "startTime", "endTime")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'startDay' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "startDay"))) {
            throw "Error! JSON cannot be serialized due to the required property 'startDay' missing."
        } else {
            $StartDay = $JsonParameters.PSobject.Properties["startDay"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "endDay"))) {
            throw "Error! JSON cannot be serialized due to the required property 'endDay' missing."
        } else {
            $EndDay = $JsonParameters.PSobject.Properties["endDay"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "startTime"))) {
            throw "Error! JSON cannot be serialized due to the required property 'startTime' missing."
        } else {
            $StartTime = $JsonParameters.PSobject.Properties["startTime"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "endTime"))) {
            throw "Error! JSON cannot be serialized due to the required property 'endTime' missing."
        } else {
            $EndTime = $JsonParameters.PSobject.Properties["endTime"].value
        }

        $PSO = [PSCustomObject]@{
            "startDay" = ${StartDay}
            "endDay" = ${EndDay}
            "startTime" = ${StartTime}
            "endTime" = ${EndTime}
        }

        return $PSO
    }

}

