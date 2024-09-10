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


#include "OfferProcessingStateDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OfferProcessingStateDTO::OfferProcessingStateDTO()
{
    m_StatusIsSet = false;
    m_NotesIsSet = false;
    
}

void OfferProcessingStateDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OfferProcessingStateDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OfferProcessingStateDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OfferProcessingStateDTO" : pathPrefix;

             
    if (notesIsSet())
    {
        const std::vector<org::openapitools::server::model::OfferProcessingNoteDTO>& value = m_Notes;
        const std::string currentValuePath = _pathPrefix + ".notes";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::OfferProcessingNoteDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".notes") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool OfferProcessingStateDTO::operator==(const OfferProcessingStateDTO& rhs) const
{
    return
    
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!notesIsSet() && !rhs.notesIsSet()) || (notesIsSet() && rhs.notesIsSet() && getNotes() == rhs.getNotes()))
    
    ;
}

bool OfferProcessingStateDTO::operator!=(const OfferProcessingStateDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OfferProcessingStateDTO& o)
{
    j = nlohmann::json::object();
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.notesIsSet() || !o.m_Notes.empty())
        j["notes"] = o.m_Notes;
    
}

void from_json(const nlohmann::json& j, OfferProcessingStateDTO& o)
{
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    if(j.find("notes") != j.end())
    {
        j.at("notes").get_to(o.m_Notes);
        o.m_NotesIsSet = true;
    } 
    
}

org::openapitools::server::model::OfferProcessingStatusType OfferProcessingStateDTO::getStatus() const
{
    return m_Status;
}
void OfferProcessingStateDTO::setStatus(org::openapitools::server::model::OfferProcessingStatusType const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool OfferProcessingStateDTO::statusIsSet() const
{
    return m_StatusIsSet;
}
void OfferProcessingStateDTO::unsetStatus()
{
    m_StatusIsSet = false;
}
std::vector<org::openapitools::server::model::OfferProcessingNoteDTO> OfferProcessingStateDTO::getNotes() const
{
    return m_Notes;
}
void OfferProcessingStateDTO::setNotes(std::vector<org::openapitools::server::model::OfferProcessingNoteDTO> const& value)
{
    m_Notes = value;
    m_NotesIsSet = true;
}
bool OfferProcessingStateDTO::notesIsSet() const
{
    return m_NotesIsSet;
}
void OfferProcessingStateDTO::unsetNotes()
{
    m_NotesIsSet = false;
}


} // namespace org::openapitools::server::model

