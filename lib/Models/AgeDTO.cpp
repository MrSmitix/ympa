

#include "AgeDTO.h"

using namespace Tiny;

AgeDTO::AgeDTO()
{
	value = float(0);
	ageUnit = AgeUnitType();
}

AgeDTO::AgeDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

AgeDTO::~AgeDTO()
{

}

void
AgeDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "long");


    }

    const char *ageUnitKey = "ageUnit";

    if(object.has_key(ageUnitKey))
    {
        bourne::json value = object[ageUnitKey];




        AgeUnitType* obj = &ageUnit;
		obj->fromJson(value.dump());

    }


}

bourne::json
AgeDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();







	object["ageUnit"] = getAgeUnit().toJson();


    return object;

}

long
AgeDTO::getValue()
{
	return value;
}

void
AgeDTO::setValue(long  value)
{
	this->value = value;
}

AgeUnitType
AgeDTO::getAgeUnit()
{
	return ageUnit;
}

void
AgeDTO::setAgeUnit(AgeUnitType  ageUnit)
{
	this->ageUnit = ageUnit;
}



