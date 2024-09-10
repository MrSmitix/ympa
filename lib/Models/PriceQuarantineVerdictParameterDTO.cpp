

#include "PriceQuarantineVerdictParameterDTO.h"

using namespace Tiny;

PriceQuarantineVerdictParameterDTO::PriceQuarantineVerdictParameterDTO()
{
	name = PriceQuarantineVerdictParamNameType();
	value = std::string();
}

PriceQuarantineVerdictParameterDTO::PriceQuarantineVerdictParameterDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceQuarantineVerdictParameterDTO::~PriceQuarantineVerdictParameterDTO()
{

}

void
PriceQuarantineVerdictParameterDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        PriceQuarantineVerdictParamNameType* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
PriceQuarantineVerdictParameterDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();





    object["value"] = getValue();



    return object;

}

PriceQuarantineVerdictParamNameType
PriceQuarantineVerdictParameterDTO::getName()
{
	return name;
}

void
PriceQuarantineVerdictParameterDTO::setName(PriceQuarantineVerdictParamNameType  name)
{
	this->name = name;
}

std::string
PriceQuarantineVerdictParameterDTO::getValue()
{
	return value;
}

void
PriceQuarantineVerdictParameterDTO::setValue(std::string  value)
{
	this->value = value;
}



