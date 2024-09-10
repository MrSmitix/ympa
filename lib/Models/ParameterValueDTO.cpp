

#include "ParameterValueDTO.h"

using namespace Tiny;

ParameterValueDTO::ParameterValueDTO()
{
	parameterId = long(0);
	unitId = long(0);
	valueId = long(0);
	value = std::string();
}

ParameterValueDTO::ParameterValueDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ParameterValueDTO::~ParameterValueDTO()
{

}

void
ParameterValueDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *parameterIdKey = "parameterId";

    if(object.has_key(parameterIdKey))
    {
        bourne::json value = object[parameterIdKey];



        jsonToValue(&parameterId, value, "long");


    }

    const char *unitIdKey = "unitId";

    if(object.has_key(unitIdKey))
    {
        bourne::json value = object[unitIdKey];



        jsonToValue(&unitId, value, "long");


    }

    const char *valueIdKey = "valueId";

    if(object.has_key(valueIdKey))
    {
        bourne::json value = object[valueIdKey];



        jsonToValue(&valueId, value, "long");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
ParameterValueDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["parameterId"] = getParameterId();






    object["unitId"] = getUnitId();






    object["valueId"] = getValueId();






    object["value"] = getValue();



    return object;

}

long
ParameterValueDTO::getParameterId()
{
	return parameterId;
}

void
ParameterValueDTO::setParameterId(long  parameterId)
{
	this->parameterId = parameterId;
}

long
ParameterValueDTO::getUnitId()
{
	return unitId;
}

void
ParameterValueDTO::setUnitId(long  unitId)
{
	this->unitId = unitId;
}

long
ParameterValueDTO::getValueId()
{
	return valueId;
}

void
ParameterValueDTO::setValueId(long  valueId)
{
	this->valueId = valueId;
}

std::string
ParameterValueDTO::getValue()
{
	return value;
}

void
ParameterValueDTO::setValue(std::string  value)
{
	this->value = value;
}



