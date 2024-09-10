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


#include "GetCampaignOffersResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GetCampaignOffersResponse::GetCampaignOffersResponse()
{
    m_StatusIsSet = false;
    m_ResultIsSet = false;
    
}

void GetCampaignOffersResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GetCampaignOffersResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GetCampaignOffersResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GetCampaignOffersResponse" : pathPrefix;

            
    return success;
}

bool GetCampaignOffersResponse::operator==(const GetCampaignOffersResponse& rhs) const
{
    return
    
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!resultIsSet() && !rhs.resultIsSet()) || (resultIsSet() && rhs.resultIsSet() && getResult() == rhs.getResult()))
    
    ;
}

bool GetCampaignOffersResponse::operator!=(const GetCampaignOffersResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GetCampaignOffersResponse& o)
{
    j = nlohmann::json::object();
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.resultIsSet())
        j["result"] = o.m_Result;
    
}

void from_json(const nlohmann::json& j, GetCampaignOffersResponse& o)
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

org::openapitools::server::model::ApiResponseStatusType GetCampaignOffersResponse::getStatus() const
{
    return m_Status;
}
void GetCampaignOffersResponse::setStatus(org::openapitools::server::model::ApiResponseStatusType const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool GetCampaignOffersResponse::statusIsSet() const
{
    return m_StatusIsSet;
}
void GetCampaignOffersResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
org::openapitools::server::model::GetCampaignOffersResultDTO GetCampaignOffersResponse::getResult() const
{
    return m_Result;
}
void GetCampaignOffersResponse::setResult(org::openapitools::server::model::GetCampaignOffersResultDTO const& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}
bool GetCampaignOffersResponse::resultIsSet() const
{
    return m_ResultIsSet;
}
void GetCampaignOffersResponse::unsetResult()
{
    m_ResultIsSet = false;
}


} // namespace org::openapitools::server::model

