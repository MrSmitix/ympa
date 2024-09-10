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

Ответ на запрос списка логинов, связанных с магазином.

.PARAMETER Logins
Список логинов.
.OUTPUTS

GetCampaignLoginsResponse<PSCustomObject>
#>

function Initialize-GetCampaignLoginsResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Logins}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetCampaignLoginsResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Logins) {
            throw "invalid value for 'Logins', 'Logins' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "logins" = ${Logins}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetCampaignLoginsResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetCampaignLoginsResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetCampaignLoginsResponse<PSCustomObject>
#>
function ConvertFrom-JsonToGetCampaignLoginsResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetCampaignLoginsResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetCampaignLoginsResponse
        $AllProperties = ("logins")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'logins' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "logins"))) {
            throw "Error! JSON cannot be serialized due to the required property 'logins' missing."
        } else {
            $Logins = $JsonParameters.PSobject.Properties["logins"].value
        }

        $PSO = [PSCustomObject]@{
            "logins" = ${Logins}
        }

        return $PSO
    }

}

