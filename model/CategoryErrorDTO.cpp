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


#include "CategoryErrorDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CategoryErrorDTO::CategoryErrorDTO()
{
    m_CategoryId = 0L;
    m_CategoryIdIsSet = false;
    m_TypeIsSet = false;
    
}

void CategoryErrorDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CategoryErrorDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CategoryErrorDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CategoryErrorDTO" : pathPrefix;

            
    return success;
}

bool CategoryErrorDTO::operator==(const CategoryErrorDTO& rhs) const
{
    return
    
    
    
    ((!categoryIdIsSet() && !rhs.categoryIdIsSet()) || (categoryIdIsSet() && rhs.categoryIdIsSet() && getCategoryId() == rhs.getCategoryId())) &&
    
    
    ((!typeIsSet() && !rhs.typeIsSet()) || (typeIsSet() && rhs.typeIsSet() && getType() == rhs.getType()))
    
    ;
}

bool CategoryErrorDTO::operator!=(const CategoryErrorDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CategoryErrorDTO& o)
{
    j = nlohmann::json::object();
    if(o.categoryIdIsSet())
        j["categoryId"] = o.m_CategoryId;
    if(o.typeIsSet())
        j["type"] = o.m_Type;
    
}

void from_json(const nlohmann::json& j, CategoryErrorDTO& o)
{
    if(j.find("categoryId") != j.end())
    {
        j.at("categoryId").get_to(o.m_CategoryId);
        o.m_CategoryIdIsSet = true;
    } 
    if(j.find("type") != j.end())
    {
        j.at("type").get_to(o.m_Type);
        o.m_TypeIsSet = true;
    } 
    
}

int64_t CategoryErrorDTO::getCategoryId() const
{
    return m_CategoryId;
}
void CategoryErrorDTO::setCategoryId(int64_t const value)
{
    m_CategoryId = value;
    m_CategoryIdIsSet = true;
}
bool CategoryErrorDTO::categoryIdIsSet() const
{
    return m_CategoryIdIsSet;
}
void CategoryErrorDTO::unsetCategoryId()
{
    m_CategoryIdIsSet = false;
}
org::openapitools::server::model::CategoryErrorType CategoryErrorDTO::getType() const
{
    return m_Type;
}
void CategoryErrorDTO::setType(org::openapitools::server::model::CategoryErrorType const& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool CategoryErrorDTO::typeIsSet() const
{
    return m_TypeIsSet;
}
void CategoryErrorDTO::unsetType()
{
    m_TypeIsSet = false;
}


} // namespace org::openapitools::server::model

