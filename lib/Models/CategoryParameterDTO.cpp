

#include "CategoryParameterDTO.h"

using namespace Tiny;

CategoryParameterDTO::CategoryParameterDTO()
{
	id = long(0);
	name = std::string();
	type = ParameterType();
	unit = CategoryParameterUnitDTO();
	description = std::string();
	recommendationTypes = std::list<OfferCardRecommendationType>();
	required = bool(false);
	filtering = bool(false);
	distinctive = bool(false);
	multivalue = bool(false);
	allowCustomValues = bool(false);
	values = std::list<ParameterValueOptionDTO>();
	constraints = ParameterValueConstraintsDTO();
	valueRestrictions = std::list<ValueRestrictionDTO>();
}

CategoryParameterDTO::CategoryParameterDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CategoryParameterDTO::~CategoryParameterDTO()
{

}

void
CategoryParameterDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        ParameterType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *unitKey = "unit";

    if(object.has_key(unitKey))
    {
        bourne::json value = object[unitKey];




        CategoryParameterUnitDTO* obj = &unit;
		obj->fromJson(value.dump());

    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *recommendationTypesKey = "recommendationTypes";

    if(object.has_key(recommendationTypesKey))
    {
        bourne::json value = object[recommendationTypesKey];


        std::list<OfferCardRecommendationType> recommendationTypes_list;
        OfferCardRecommendationType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            recommendationTypes_list.push_back(element);
        }
        recommendationTypes = recommendationTypes_list;


    }

    const char *requiredKey = "required";

    if(object.has_key(requiredKey))
    {
        bourne::json value = object[requiredKey];



        jsonToValue(&required, value, "bool");


    }

    const char *filteringKey = "filtering";

    if(object.has_key(filteringKey))
    {
        bourne::json value = object[filteringKey];



        jsonToValue(&filtering, value, "bool");


    }

    const char *distinctiveKey = "distinctive";

    if(object.has_key(distinctiveKey))
    {
        bourne::json value = object[distinctiveKey];



        jsonToValue(&distinctive, value, "bool");


    }

    const char *multivalueKey = "multivalue";

    if(object.has_key(multivalueKey))
    {
        bourne::json value = object[multivalueKey];



        jsonToValue(&multivalue, value, "bool");


    }

    const char *allowCustomValuesKey = "allowCustomValues";

    if(object.has_key(allowCustomValuesKey))
    {
        bourne::json value = object[allowCustomValuesKey];



        jsonToValue(&allowCustomValues, value, "bool");


    }

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<ParameterValueOptionDTO> values_list;
        ParameterValueOptionDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }

    const char *constraintsKey = "constraints";

    if(object.has_key(constraintsKey))
    {
        bourne::json value = object[constraintsKey];




        ParameterValueConstraintsDTO* obj = &constraints;
		obj->fromJson(value.dump());

    }

    const char *valueRestrictionsKey = "valueRestrictions";

    if(object.has_key(valueRestrictionsKey))
    {
        bourne::json value = object[valueRestrictionsKey];


        std::list<ValueRestrictionDTO> valueRestrictions_list;
        ValueRestrictionDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            valueRestrictions_list.push_back(element);
        }
        valueRestrictions = valueRestrictions_list;


    }


}

bourne::json
CategoryParameterDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["type"] = getType().toJson();






	object["unit"] = getUnit().toJson();





    object["description"] = getDescription();





    std::list<OfferCardRecommendationType> recommendationTypes_list = getRecommendationTypes();
    bourne::json recommendationTypes_arr = bourne::json::array();

    for(auto& var : recommendationTypes_list)
    {
        OfferCardRecommendationType obj = var;
        recommendationTypes_arr.append(obj.toJson());
    }
    object["recommendationTypes"] = recommendationTypes_arr;







    object["required"] = isRequired();






    object["filtering"] = isFiltering();






    object["distinctive"] = isDistinctive();






    object["multivalue"] = isMultivalue();






    object["allowCustomValues"] = isAllowCustomValues();





    std::list<ParameterValueOptionDTO> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        ParameterValueOptionDTO obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;








	object["constraints"] = getConstraints().toJson();




    std::list<ValueRestrictionDTO> valueRestrictions_list = getValueRestrictions();
    bourne::json valueRestrictions_arr = bourne::json::array();

    for(auto& var : valueRestrictions_list)
    {
        ValueRestrictionDTO obj = var;
        valueRestrictions_arr.append(obj.toJson());
    }
    object["valueRestrictions"] = valueRestrictions_arr;




    return object;

}

long
CategoryParameterDTO::getId()
{
	return id;
}

void
CategoryParameterDTO::setId(long  id)
{
	this->id = id;
}

std::string
CategoryParameterDTO::getName()
{
	return name;
}

void
CategoryParameterDTO::setName(std::string  name)
{
	this->name = name;
}

ParameterType
CategoryParameterDTO::getType()
{
	return type;
}

void
CategoryParameterDTO::setType(ParameterType  type)
{
	this->type = type;
}

CategoryParameterUnitDTO
CategoryParameterDTO::getUnit()
{
	return unit;
}

void
CategoryParameterDTO::setUnit(CategoryParameterUnitDTO  unit)
{
	this->unit = unit;
}

std::string
CategoryParameterDTO::getDescription()
{
	return description;
}

void
CategoryParameterDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::list<OfferCardRecommendationType>
CategoryParameterDTO::getRecommendationTypes()
{
	return recommendationTypes;
}

void
CategoryParameterDTO::setRecommendationTypes(std::list <OfferCardRecommendationType> recommendationTypes)
{
	this->recommendationTypes = recommendationTypes;
}

bool
CategoryParameterDTO::isRequired()
{
	return required;
}

void
CategoryParameterDTO::setRequired(bool  required)
{
	this->required = required;
}

bool
CategoryParameterDTO::isFiltering()
{
	return filtering;
}

void
CategoryParameterDTO::setFiltering(bool  filtering)
{
	this->filtering = filtering;
}

bool
CategoryParameterDTO::isDistinctive()
{
	return distinctive;
}

void
CategoryParameterDTO::setDistinctive(bool  distinctive)
{
	this->distinctive = distinctive;
}

bool
CategoryParameterDTO::isMultivalue()
{
	return multivalue;
}

void
CategoryParameterDTO::setMultivalue(bool  multivalue)
{
	this->multivalue = multivalue;
}

bool
CategoryParameterDTO::isAllowCustomValues()
{
	return allowCustomValues;
}

void
CategoryParameterDTO::setAllowCustomValues(bool  allowCustomValues)
{
	this->allowCustomValues = allowCustomValues;
}

std::list<ParameterValueOptionDTO>
CategoryParameterDTO::getValues()
{
	return values;
}

void
CategoryParameterDTO::setValues(std::list <ParameterValueOptionDTO> values)
{
	this->values = values;
}

ParameterValueConstraintsDTO
CategoryParameterDTO::getConstraints()
{
	return constraints;
}

void
CategoryParameterDTO::setConstraints(ParameterValueConstraintsDTO  constraints)
{
	this->constraints = constraints;
}

std::list<ValueRestrictionDTO>
CategoryParameterDTO::getValueRestrictions()
{
	return valueRestrictions;
}

void
CategoryParameterDTO::setValueRestrictions(std::list <ValueRestrictionDTO> valueRestrictions)
{
	this->valueRestrictions = valueRestrictions;
}



