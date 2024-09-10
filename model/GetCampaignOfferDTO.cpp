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


#include "GetCampaignOfferDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GetCampaignOfferDTO::GetCampaignOfferDTO()
{
    m_OfferId = "";
    m_QuantumIsSet = false;
    m_Available = false;
    m_AvailableIsSet = false;
    m_BasicPriceIsSet = false;
    m_CampaignPriceIsSet = false;
    m_StatusIsSet = false;
    m_ErrorsIsSet = false;
    m_WarningsIsSet = false;
    
}

void GetCampaignOfferDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GetCampaignOfferDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GetCampaignOfferDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GetCampaignOfferDTO" : pathPrefix;

         
    
    /* OfferId */ {
        const std::string& value = m_OfferId;
        const std::string currentValuePath = _pathPrefix + ".offerId";
                
        
        if (value.length() < 1)
        {
            success = false;
            msg << currentValuePath << ": must be at least 1 characters long;";
        }
        if (value.length() > 255)
        {
            success = false;
            msg << currentValuePath << ": must be at most 255 characters long;";
        }

    }
                             
    if (errorsIsSet())
    {
        const std::vector<org::openapitools::server::model::OfferErrorDTO>& value = m_Errors;
        const std::string currentValuePath = _pathPrefix + ".errors";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::OfferErrorDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".errors") && success;
 
                i++;
            }
        }

    }
         
    if (warningsIsSet())
    {
        const std::vector<org::openapitools::server::model::OfferErrorDTO>& value = m_Warnings;
        const std::string currentValuePath = _pathPrefix + ".warnings";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::OfferErrorDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".warnings") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool GetCampaignOfferDTO::operator==(const GetCampaignOfferDTO& rhs) const
{
    return
    
    
    (getOfferId() == rhs.getOfferId())
     &&
    
    
    ((!quantumIsSet() && !rhs.quantumIsSet()) || (quantumIsSet() && rhs.quantumIsSet() && getQuantum() == rhs.getQuantum())) &&
    
    
    ((!availableIsSet() && !rhs.availableIsSet()) || (availableIsSet() && rhs.availableIsSet() && isAvailable() == rhs.isAvailable())) &&
    
    
    ((!basicPriceIsSet() && !rhs.basicPriceIsSet()) || (basicPriceIsSet() && rhs.basicPriceIsSet() && getBasicPrice() == rhs.getBasicPrice())) &&
    
    
    ((!campaignPriceIsSet() && !rhs.campaignPriceIsSet()) || (campaignPriceIsSet() && rhs.campaignPriceIsSet() && getCampaignPrice() == rhs.getCampaignPrice())) &&
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!errorsIsSet() && !rhs.errorsIsSet()) || (errorsIsSet() && rhs.errorsIsSet() && getErrors() == rhs.getErrors())) &&
    
    
    ((!warningsIsSet() && !rhs.warningsIsSet()) || (warningsIsSet() && rhs.warningsIsSet() && getWarnings() == rhs.getWarnings()))
    
    ;
}

bool GetCampaignOfferDTO::operator!=(const GetCampaignOfferDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GetCampaignOfferDTO& o)
{
    j = nlohmann::json::object();
    j["offerId"] = o.m_OfferId;
    if(o.quantumIsSet())
        j["quantum"] = o.m_Quantum;
    if(o.availableIsSet())
        j["available"] = o.m_Available;
    if(o.basicPriceIsSet())
        j["basicPrice"] = o.m_BasicPrice;
    if(o.campaignPriceIsSet())
        j["campaignPrice"] = o.m_CampaignPrice;
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.errorsIsSet() || !o.m_Errors.empty())
        j["errors"] = o.m_Errors;
    if(o.warningsIsSet() || !o.m_Warnings.empty())
        j["warnings"] = o.m_Warnings;
    
}

void from_json(const nlohmann::json& j, GetCampaignOfferDTO& o)
{
    j.at("offerId").get_to(o.m_OfferId);
    if(j.find("quantum") != j.end())
    {
        j.at("quantum").get_to(o.m_Quantum);
        o.m_QuantumIsSet = true;
    } 
    if(j.find("available") != j.end())
    {
        j.at("available").get_to(o.m_Available);
        o.m_AvailableIsSet = true;
    } 
    if(j.find("basicPrice") != j.end())
    {
        j.at("basicPrice").get_to(o.m_BasicPrice);
        o.m_BasicPriceIsSet = true;
    } 
    if(j.find("campaignPrice") != j.end())
    {
        j.at("campaignPrice").get_to(o.m_CampaignPrice);
        o.m_CampaignPriceIsSet = true;
    } 
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    if(j.find("errors") != j.end())
    {
        j.at("errors").get_to(o.m_Errors);
        o.m_ErrorsIsSet = true;
    } 
    if(j.find("warnings") != j.end())
    {
        j.at("warnings").get_to(o.m_Warnings);
        o.m_WarningsIsSet = true;
    } 
    
}

std::string GetCampaignOfferDTO::getOfferId() const
{
    return m_OfferId;
}
void GetCampaignOfferDTO::setOfferId(std::string const& value)
{
    m_OfferId = value;
}
org::openapitools::server::model::QuantumDTO GetCampaignOfferDTO::getQuantum() const
{
    return m_Quantum;
}
void GetCampaignOfferDTO::setQuantum(org::openapitools::server::model::QuantumDTO const& value)
{
    m_Quantum = value;
    m_QuantumIsSet = true;
}
bool GetCampaignOfferDTO::quantumIsSet() const
{
    return m_QuantumIsSet;
}
void GetCampaignOfferDTO::unsetQuantum()
{
    m_QuantumIsSet = false;
}
bool GetCampaignOfferDTO::isAvailable() const
{
    return m_Available;
}
void GetCampaignOfferDTO::setAvailable(bool const value)
{
    m_Available = value;
    m_AvailableIsSet = true;
}
bool GetCampaignOfferDTO::availableIsSet() const
{
    return m_AvailableIsSet;
}
void GetCampaignOfferDTO::unsetAvailable()
{
    m_AvailableIsSet = false;
}
org::openapitools::server::model::GetPriceWithDiscountDTO GetCampaignOfferDTO::getBasicPrice() const
{
    return m_BasicPrice;
}
void GetCampaignOfferDTO::setBasicPrice(org::openapitools::server::model::GetPriceWithDiscountDTO const& value)
{
    m_BasicPrice = value;
    m_BasicPriceIsSet = true;
}
bool GetCampaignOfferDTO::basicPriceIsSet() const
{
    return m_BasicPriceIsSet;
}
void GetCampaignOfferDTO::unsetBasicPrice()
{
    m_BasicPriceIsSet = false;
}
org::openapitools::server::model::GetPriceWithVatDTO GetCampaignOfferDTO::getCampaignPrice() const
{
    return m_CampaignPrice;
}
void GetCampaignOfferDTO::setCampaignPrice(org::openapitools::server::model::GetPriceWithVatDTO const& value)
{
    m_CampaignPrice = value;
    m_CampaignPriceIsSet = true;
}
bool GetCampaignOfferDTO::campaignPriceIsSet() const
{
    return m_CampaignPriceIsSet;
}
void GetCampaignOfferDTO::unsetCampaignPrice()
{
    m_CampaignPriceIsSet = false;
}
org::openapitools::server::model::OfferCampaignStatusType GetCampaignOfferDTO::getStatus() const
{
    return m_Status;
}
void GetCampaignOfferDTO::setStatus(org::openapitools::server::model::OfferCampaignStatusType const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool GetCampaignOfferDTO::statusIsSet() const
{
    return m_StatusIsSet;
}
void GetCampaignOfferDTO::unsetStatus()
{
    m_StatusIsSet = false;
}
std::vector<org::openapitools::server::model::OfferErrorDTO> GetCampaignOfferDTO::getErrors() const
{
    return m_Errors;
}
void GetCampaignOfferDTO::setErrors(std::vector<org::openapitools::server::model::OfferErrorDTO> const& value)
{
    m_Errors = value;
    m_ErrorsIsSet = true;
}
bool GetCampaignOfferDTO::errorsIsSet() const
{
    return m_ErrorsIsSet;
}
void GetCampaignOfferDTO::unsetErrors()
{
    m_ErrorsIsSet = false;
}
std::vector<org::openapitools::server::model::OfferErrorDTO> GetCampaignOfferDTO::getWarnings() const
{
    return m_Warnings;
}
void GetCampaignOfferDTO::setWarnings(std::vector<org::openapitools::server::model::OfferErrorDTO> const& value)
{
    m_Warnings = value;
    m_WarningsIsSet = true;
}
bool GetCampaignOfferDTO::warningsIsSet() const
{
    return m_WarningsIsSet;
}
void GetCampaignOfferDTO::unsetWarnings()
{
    m_WarningsIsSet = false;
}


} // namespace org::openapitools::server::model

