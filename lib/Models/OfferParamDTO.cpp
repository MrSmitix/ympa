

#include "OfferParamDTO.h"

using namespace Tiny;

OfferParamDTO::OfferParamDTO()
{
	name = std::string();
	value = std::string();
}

OfferParamDTO::OfferParamDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferParamDTO::~OfferParamDTO()
{

}

void
OfferParamDTO::fromJson(std::string jsonObj)
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
OfferParamDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["value"] = getValue();



    return object;

}

std::string
OfferParamDTO::getName()
{
	return name;
}

void
OfferParamDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
OfferParamDTO::getValue()
{
	return value;
}

void
OfferParamDTO::setValue(std::string  value)
{
	this->value = value;
}



