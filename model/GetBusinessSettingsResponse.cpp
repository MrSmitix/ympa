/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "GetBusinessSettingsResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GetBusinessSettingsResponse::GetBusinessSettingsResponse()
{
    m_StatusIsSet = false;
    m_ResultIsSet = false;
    
}

void GetBusinessSettingsResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GetBusinessSettingsResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GetBusinessSettingsResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GetBusinessSettingsResponse" : pathPrefix;

            
    return success;
}

bool GetBusinessSettingsResponse::operator==(const GetBusinessSettingsResponse& rhs) const
{
    return
    
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!resultIsSet() && !rhs.resultIsSet()) || (resultIsSet() && rhs.resultIsSet() && getResult() == rhs.getResult()))
    
    ;
}

bool GetBusinessSettingsResponse::operator!=(const GetBusinessSettingsResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GetBusinessSettingsResponse& o)
{
    j = nlohmann::json::object();
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.resultIsSet())
        j["result"] = o.m_Result;
    
}

void from_json(const nlohmann::json& j, GetBusinessSettingsResponse& o)
{
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    if(j.find("result") != j.end())
    {
        j.at("result").get_to(o.m_Result);
        o.m_ResultIsSet = true;
    } 
    
}

org::openapitools::server::model::ApiResponseStatusType GetBusinessSettingsResponse::getStatus() const
{
    return m_Status;
}
void GetBusinessSettingsResponse::setStatus(org::openapitools::server::model::ApiResponseStatusType const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool GetBusinessSettingsResponse::statusIsSet() const
{
    return m_StatusIsSet;
}
void GetBusinessSettingsResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
org::openapitools::server::model::GetBusinessSettingsInfoDTO GetBusinessSettingsResponse::getResult() const
{
    return m_Result;
}
void GetBusinessSettingsResponse::setResult(org::openapitools::server::model::GetBusinessSettingsInfoDTO const& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}
bool GetBusinessSettingsResponse::resultIsSet() const
{
    return m_ResultIsSet;
}
void GetBusinessSettingsResponse::unsetResult()
{
    m_ResultIsSet = false;
}


} // namespace org::openapitools::server::model

