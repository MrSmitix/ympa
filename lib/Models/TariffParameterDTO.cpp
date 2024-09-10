

#include "TariffParameterDTO.h"

using namespace Tiny;

TariffParameterDTO::TariffParameterDTO()
{
	name = std::string();
	value = std::string();
}

TariffParameterDTO::TariffParameterDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

TariffParameterDTO::~TariffParameterDTO()
{

}

void
TariffParameterDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
TariffParameterDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["value"] = getValue();



    return object;

}

std::string
TariffParameterDTO::getName()
{
	return name;
}

void
TariffParameterDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
TariffParameterDTO::getValue()
{
	return value;
}

void
TariffParameterDTO::setValue(std::string  value)
{
	this->value = value;
}



