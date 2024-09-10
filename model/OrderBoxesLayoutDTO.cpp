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


#include "OrderBoxesLayoutDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OrderBoxesLayoutDTO::OrderBoxesLayoutDTO()
{
    
}

void OrderBoxesLayoutDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OrderBoxesLayoutDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OrderBoxesLayoutDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OrderBoxesLayoutDTO" : pathPrefix;

         
    
    /* Boxes */ {
        const std::vector<org::openapitools::server::model::EnrichedOrderBoxLayoutDTO>& value = m_Boxes;
        const std::string currentValuePath = _pathPrefix + ".boxes";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::EnrichedOrderBoxLayoutDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".boxes") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool OrderBoxesLayoutDTO::operator==(const OrderBoxesLayoutDTO& rhs) const
{
    return
    
    
    (getBoxes() == rhs.getBoxes())
    
    
    ;
}

bool OrderBoxesLayoutDTO::operator!=(const OrderBoxesLayoutDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OrderBoxesLayoutDTO& o)
{
    j = nlohmann::json::object();
    j["boxes"] = o.m_Boxes;
    
}

void from_json(const nlohmann::json& j, OrderBoxesLayoutDTO& o)
{
    j.at("boxes").get_to(o.m_Boxes);
    
}

std::vector<org::openapitools::server::model::EnrichedOrderBoxLayoutDTO> OrderBoxesLayoutDTO::getBoxes() const
{
    return m_Boxes;
}
void OrderBoxesLayoutDTO::setBoxes(std::vector<org::openapitools::server::model::EnrichedOrderBoxLayoutDTO> const& value)
{
    m_Boxes = value;
}


} // namespace org::openapitools::server::model

