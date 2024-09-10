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


#include "DeletePromoOffersResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

DeletePromoOffersResponse::DeletePromoOffersResponse()
{
    m_StatusIsSet = false;
    m_ResultIsSet = false;
    
}

void DeletePromoOffersResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool DeletePromoOffersResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool DeletePromoOffersResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "DeletePromoOffersResponse" : pathPrefix;

            
    return success;
}

bool DeletePromoOffersResponse::operator==(const DeletePromoOffersResponse& rhs) const
{
    return
    
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!resultIsSet() && !rhs.resultIsSet()) || (resultIsSet() && rhs.resultIsSet() && getResult() == rhs.getResult()))
    
    ;
}

bool DeletePromoOffersResponse::operator!=(const DeletePromoOffersResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const DeletePromoOffersResponse& o)
{
    j = nlohmann::json::object();
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.resultIsSet())
        j["result"] = o.m_Result;
    
}

void from_json(const nlohmann::json& j, DeletePromoOffersResponse& o)
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

org::openapitools::server::model::ApiResponseStatusType DeletePromoOffersResponse::getStatus() const
{
    return m_Status;
}
void DeletePromoOffersResponse::setStatus(org::openapitools::server::model::ApiResponseStatusType const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool DeletePromoOffersResponse::statusIsSet() const
{
    return m_StatusIsSet;
}
void DeletePromoOffersResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
org::openapitools::server::model::DeletePromoOffersResultDTO DeletePromoOffersResponse::getResult() const
{
    return m_Result;
}
void DeletePromoOffersResponse::setResult(org::openapitools::server::model::DeletePromoOffersResultDTO const& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}
bool DeletePromoOffersResponse::resultIsSet() const
{
    return m_ResultIsSet;
}
void DeletePromoOffersResponse::unsetResult()
{
    m_ResultIsSet = false;
}


} // namespace org::openapitools::server::model

