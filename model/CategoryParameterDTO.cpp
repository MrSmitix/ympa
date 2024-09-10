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


#include "CategoryParameterDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CategoryParameterDTO::CategoryParameterDTO()
{
    m_Id = 0L;
    m_Name = "";
    m_NameIsSet = false;
    m_UnitIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_RecommendationTypesIsSet = false;
    m_Required = false;
    m_Filtering = false;
    m_Distinctive = false;
    m_Multivalue = false;
    m_AllowCustomValues = false;
    m_ValuesIsSet = false;
    m_ConstraintsIsSet = false;
    m_ValueRestrictionsIsSet = false;
    
}

void CategoryParameterDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CategoryParameterDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CategoryParameterDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CategoryParameterDTO" : pathPrefix;

                             
    if (recommendationTypesIsSet())
    {
        const std::vector<org::openapitools::server::model::OfferCardRecommendationType>& value = m_RecommendationTypes;
        const std::string currentValuePath = _pathPrefix + ".recommendationTypes";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::OfferCardRecommendationType& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
                             
    if (valuesIsSet())
    {
        const std::vector<org::openapitools::server::model::ParameterValueOptionDTO>& value = m_Values;
        const std::string currentValuePath = _pathPrefix + ".values";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ParameterValueOptionDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".values") && success;
 
                i++;
            }
        }

    }
             
    if (valueRestrictionsIsSet())
    {
        const std::vector<org::openapitools::server::model::ValueRestrictionDTO>& value = m_ValueRestrictions;
        const std::string currentValuePath = _pathPrefix + ".valueRestrictions";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ValueRestrictionDTO& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".valueRestrictions") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool CategoryParameterDTO::operator==(const CategoryParameterDTO& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    (getType() == rhs.getType())
     &&
    
    
    ((!unitIsSet() && !rhs.unitIsSet()) || (unitIsSet() && rhs.unitIsSet() && getUnit() == rhs.getUnit())) &&
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription())) &&
    
    
    ((!recommendationTypesIsSet() && !rhs.recommendationTypesIsSet()) || (recommendationTypesIsSet() && rhs.recommendationTypesIsSet() && getRecommendationTypes() == rhs.getRecommendationTypes())) &&
    
    (isRequired() == rhs.isRequired())
     &&
    
    (isFiltering() == rhs.isFiltering())
     &&
    
    (isDistinctive() == rhs.isDistinctive())
     &&
    
    (isMultivalue() == rhs.isMultivalue())
     &&
    
    (isAllowCustomValues() == rhs.isAllowCustomValues())
     &&
    
    
    ((!valuesIsSet() && !rhs.valuesIsSet()) || (valuesIsSet() && rhs.valuesIsSet() && getValues() == rhs.getValues())) &&
    
    
    ((!constraintsIsSet() && !rhs.constraintsIsSet()) || (constraintsIsSet() && rhs.constraintsIsSet() && getConstraints() == rhs.getConstraints())) &&
    
    
    ((!valueRestrictionsIsSet() && !rhs.valueRestrictionsIsSet()) || (valueRestrictionsIsSet() && rhs.valueRestrictionsIsSet() && getValueRestrictions() == rhs.getValueRestrictions()))
    
    ;
}

bool CategoryParameterDTO::operator!=(const CategoryParameterDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CategoryParameterDTO& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    j["type"] = o.m_Type;
    if(o.unitIsSet())
        j["unit"] = o.m_Unit;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    if(o.recommendationTypesIsSet() || !o.m_RecommendationTypes.empty())
        j["recommendationTypes"] = o.m_RecommendationTypes;
    j["required"] = o.m_Required;
    j["filtering"] = o.m_Filtering;
    j["distinctive"] = o.m_Distinctive;
    j["multivalue"] = o.m_Multivalue;
    j["allowCustomValues"] = o.m_AllowCustomValues;
    if(o.valuesIsSet() || !o.m_Values.empty())
        j["values"] = o.m_Values;
    if(o.constraintsIsSet())
        j["constraints"] = o.m_Constraints;
    if(o.valueRestrictionsIsSet() || !o.m_ValueRestrictions.empty())
        j["valueRestrictions"] = o.m_ValueRestrictions;
    
}

void from_json(const nlohmann::json& j, CategoryParameterDTO& o)
{
    j.at("id").get_to(o.m_Id);
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    j.at("type").get_to(o.m_Type);
    if(j.find("unit") != j.end())
    {
        j.at("unit").get_to(o.m_Unit);
        o.m_UnitIsSet = true;
    } 
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    if(j.find("recommendationTypes") != j.end())
    {
        j.at("recommendationTypes").get_to(o.m_RecommendationTypes);
        o.m_RecommendationTypesIsSet = true;
    } 
    j.at("required").get_to(o.m_Required);
    j.at("filtering").get_to(o.m_Filtering);
    j.at("distinctive").get_to(o.m_Distinctive);
    j.at("multivalue").get_to(o.m_Multivalue);
    j.at("allowCustomValues").get_to(o.m_AllowCustomValues);
    if(j.find("values") != j.end())
    {
        j.at("values").get_to(o.m_Values);
        o.m_ValuesIsSet = true;
    } 
    if(j.find("constraints") != j.end())
    {
        j.at("constraints").get_to(o.m_Constraints);
        o.m_ConstraintsIsSet = true;
    } 
    if(j.find("valueRestrictions") != j.end())
    {
        j.at("valueRestrictions").get_to(o.m_ValueRestrictions);
        o.m_ValueRestrictionsIsSet = true;
    } 
    
}

int64_t CategoryParameterDTO::getId() const
{
    return m_Id;
}
void CategoryParameterDTO::setId(int64_t const value)
{
    m_Id = value;
}
std::string CategoryParameterDTO::getName() const
{
    return m_Name;
}
void CategoryParameterDTO::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool CategoryParameterDTO::nameIsSet() const
{
    return m_NameIsSet;
}
void CategoryParameterDTO::unsetName()
{
    m_NameIsSet = false;
}
org::openapitools::server::model::ParameterType CategoryParameterDTO::getType() const
{
    return m_Type;
}
void CategoryParameterDTO::setType(org::openapitools::server::model::ParameterType const& value)
{
    m_Type = value;
}
org::openapitools::server::model::CategoryParameterUnitDTO CategoryParameterDTO::getUnit() const
{
    return m_Unit;
}
void CategoryParameterDTO::setUnit(org::openapitools::server::model::CategoryParameterUnitDTO const& value)
{
    m_Unit = value;
    m_UnitIsSet = true;
}
bool CategoryParameterDTO::unitIsSet() const
{
    return m_UnitIsSet;
}
void CategoryParameterDTO::unsetUnit()
{
    m_UnitIsSet = false;
}
std::string CategoryParameterDTO::getDescription() const
{
    return m_Description;
}
void CategoryParameterDTO::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool CategoryParameterDTO::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void CategoryParameterDTO::unsetDescription()
{
    m_DescriptionIsSet = false;
}
std::vector<org::openapitools::server::model::OfferCardRecommendationType> CategoryParameterDTO::getRecommendationTypes() const
{
    return m_RecommendationTypes;
}
void CategoryParameterDTO::setRecommendationTypes(std::vector<org::openapitools::server::model::OfferCardRecommendationType> const& value)
{
    m_RecommendationTypes = value;
    m_RecommendationTypesIsSet = true;
}
bool CategoryParameterDTO::recommendationTypesIsSet() const
{
    return m_RecommendationTypesIsSet;
}
void CategoryParameterDTO::unsetRecommendationTypes()
{
    m_RecommendationTypesIsSet = false;
}
bool CategoryParameterDTO::isRequired() const
{
    return m_Required;
}
void CategoryParameterDTO::setRequired(bool const value)
{
    m_Required = value;
}
bool CategoryParameterDTO::isFiltering() const
{
    return m_Filtering;
}
void CategoryParameterDTO::setFiltering(bool const value)
{
    m_Filtering = value;
}
bool CategoryParameterDTO::isDistinctive() const
{
    return m_Distinctive;
}
void CategoryParameterDTO::setDistinctive(bool const value)
{
    m_Distinctive = value;
}
bool CategoryParameterDTO::isMultivalue() const
{
    return m_Multivalue;
}
void CategoryParameterDTO::setMultivalue(bool const value)
{
    m_Multivalue = value;
}
bool CategoryParameterDTO::isAllowCustomValues() const
{
    return m_AllowCustomValues;
}
void CategoryParameterDTO::setAllowCustomValues(bool const value)
{
    m_AllowCustomValues = value;
}
std::vector<org::openapitools::server::model::ParameterValueOptionDTO> CategoryParameterDTO::getValues() const
{
    return m_Values;
}
void CategoryParameterDTO::setValues(std::vector<org::openapitools::server::model::ParameterValueOptionDTO> const& value)
{
    m_Values = value;
    m_ValuesIsSet = true;
}
bool CategoryParameterDTO::valuesIsSet() const
{
    return m_ValuesIsSet;
}
void CategoryParameterDTO::unsetValues()
{
    m_ValuesIsSet = false;
}
org::openapitools::server::model::ParameterValueConstraintsDTO CategoryParameterDTO::getConstraints() const
{
    return m_Constraints;
}
void CategoryParameterDTO::setConstraints(org::openapitools::server::model::ParameterValueConstraintsDTO const& value)
{
    m_Constraints = value;
    m_ConstraintsIsSet = true;
}
bool CategoryParameterDTO::constraintsIsSet() const
{
    return m_ConstraintsIsSet;
}
void CategoryParameterDTO::unsetConstraints()
{
    m_ConstraintsIsSet = false;
}
std::vector<org::openapitools::server::model::ValueRestrictionDTO> CategoryParameterDTO::getValueRestrictions() const
{
    return m_ValueRestrictions;
}
void CategoryParameterDTO::setValueRestrictions(std::vector<org::openapitools::server::model::ValueRestrictionDTO> const& value)
{
    m_ValueRestrictions = value;
    m_ValueRestrictionsIsSet = true;
}
bool CategoryParameterDTO::valueRestrictionsIsSet() const
{
    return m_ValueRestrictionsIsSet;
}
void CategoryParameterDTO::unsetValueRestrictions()
{
    m_ValueRestrictionsIsSet = false;
}


} // namespace org::openapitools::server::model

