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


#include "GoodsFeedbackCommentListDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GoodsFeedbackCommentListDTO::GoodsFeedbackCommentListDTO()
{
    m_PagingIsSet = false;
    
}

void GoodsFeedbackCommentListDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GoodsFeedbackCommentListDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GoodsFeedbackCommentListDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GoodsFeedbackCommentListDTO" : pathPrefix;

         
    
    /* Comments */ {
        const std::vector<org::openapitools::server::model::GoodsFeedbackCommentDTO>& value = m_Comments;
        const std::string currentValuePath = _pathPrefix + ".comments";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::GoodsFeedbackCommentDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".comments") && success;
 
                i++;
            }
        }

    }
        
    return success;
}

bool GoodsFeedbackCommentListDTO::operator==(const GoodsFeedbackCommentListDTO& rhs) const
{
    return
    
    
    (getComments() == rhs.getComments())
     &&
    
    
    ((!pagingIsSet() && !rhs.pagingIsSet()) || (pagingIsSet() && rhs.pagingIsSet() && getPaging() == rhs.getPaging()))
    
    ;
}

bool GoodsFeedbackCommentListDTO::operator!=(const GoodsFeedbackCommentListDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GoodsFeedbackCommentListDTO& o)
{
    j = nlohmann::json::object();
    j["comments"] = o.m_Comments;
    if(o.pagingIsSet())
        j["paging"] = o.m_Paging;
    
}

void from_json(const nlohmann::json& j, GoodsFeedbackCommentListDTO& o)
{
    j.at("comments").get_to(o.m_Comments);
    if(j.find("paging") != j.end())
    {
        j.at("paging").get_to(o.m_Paging);
        o.m_PagingIsSet = true;
    } 
    
}

std::vector<org::openapitools::server::model::GoodsFeedbackCommentDTO> GoodsFeedbackCommentListDTO::getComments() const
{
    return m_Comments;
}
void GoodsFeedbackCommentListDTO::setComments(std::vector<org::openapitools::server::model::GoodsFeedbackCommentDTO> const& value)
{
    m_Comments = value;
}
org::openapitools::server::model::ForwardScrollingPagerDTO GoodsFeedbackCommentListDTO::getPaging() const
{
    return m_Paging;
}
void GoodsFeedbackCommentListDTO::setPaging(org::openapitools::server::model::ForwardScrollingPagerDTO const& value)
{
    m_Paging = value;
    m_PagingIsSet = true;
}
bool GoodsFeedbackCommentListDTO::pagingIsSet() const
{
    return m_PagingIsSet;
}
void GoodsFeedbackCommentListDTO::unsetPaging()
{
    m_PagingIsSet = false;
}


} // namespace org::openapitools::server::model

