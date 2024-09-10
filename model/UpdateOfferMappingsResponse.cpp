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


#include "UpdateOfferMappingsResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

UpdateOfferMappingsResponse::UpdateOfferMappingsResponse()
{
    m_StatusIsSet = false;
    m_ResultsIsSet = false;
    
}

void UpdateOfferMappingsResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UpdateOfferMappingsResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UpdateOfferMappingsResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UpdateOfferMappingsResponse" : pathPrefix;

             
    if (resultsIsSet())
    {
        const std::vector<org::openapitools::server::model::UpdateOfferMappingResultDTO>& value = m_Results;
        const std::string currentValuePath = _pathPrefix + ".results";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::UpdateOfferMappingResultDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".results") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool UpdateOfferMappingsResponse::operator==(const UpdateOfferMappingsResponse& rhs) const
{
    return
    
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!resultsIsSet() && !rhs.resultsIsSet()) || (resultsIsSet() && rhs.resultsIsSet() && getResults() == rhs.getResults()))
    
    ;
}

bool UpdateOfferMappingsResponse::operator!=(const UpdateOfferMappingsResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UpdateOfferMappingsResponse& o)
{
    j = nlohmann::json::object();
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.resultsIsSet() || !o.m_Results.empty())
        j["results"] = o.m_Results;
    
}

void from_json(const nlohmann::json& j, UpdateOfferMappingsResponse& o)
{
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    if(j.find("results") != j.end())
    {
        j.at("results").get_to(o.m_Results);
        o.m_ResultsIsSet = true;
    } 
    
}

org::openapitools::server::model::ApiResponseStatusType UpdateOfferMappingsResponse::getStatus() const
{
    return m_Status;
}
void UpdateOfferMappingsResponse::setStatus(org::openapitools::server::model::ApiResponseStatusType const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool UpdateOfferMappingsResponse::statusIsSet() const
{
    return m_StatusIsSet;
}
void UpdateOfferMappingsResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
std::vector<org::openapitools::server::model::UpdateOfferMappingResultDTO> UpdateOfferMappingsResponse::getResults() const
{
    return m_Results;
}
void UpdateOfferMappingsResponse::setResults(std::vector<org::openapitools::server::model::UpdateOfferMappingResultDTO> const& value)
{
    m_Results = value;
    m_ResultsIsSet = true;
}
bool UpdateOfferMappingsResponse::resultsIsSet() const
{
    return m_ResultsIsSet;
}
void UpdateOfferMappingsResponse::unsetResults()
{
    m_ResultsIsSet = false;
}


} // namespace org::openapitools::server::model

