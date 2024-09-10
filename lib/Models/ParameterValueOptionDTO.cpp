

#include "ParameterValueOptionDTO.h"

using namespace Tiny;

ParameterValueOptionDTO::ParameterValueOptionDTO()
{
	id = long(0);
	value = std::string();
	description = std::string();
}

ParameterValueOptionDTO::ParameterValueOptionDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ParameterValueOptionDTO::~ParameterValueOptionDTO()
{

}

void
ParameterValueOptionDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
ParameterValueOptionDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["value"] = getValue();






    object["description"] = getDescription();



    return object;

}

long
ParameterValueOptionDTO::getId()
{
	return id;
}

void
ParameterValueOptionDTO::setId(long  id)
{
	this->id = id;
}

std::string
ParameterValueOptionDTO::getValue()
{
	return value;
}

void
ParameterValueOptionDTO::setValue(std::string  value)
{
	this->value = value;
}

std::string
ParameterValueOptionDTO::getDescription()
{
	return description;
}

void
ParameterValueOptionDTO::setDescription(std::string  description)
{
	this->description = description;
}



