

#include "ParameterValueConstraintsDTO.h"

using namespace Tiny;

ParameterValueConstraintsDTO::ParameterValueConstraintsDTO()
{
	minValue = float(0);
	maxValue = float(0);
	maxLength = int(0);
}

ParameterValueConstraintsDTO::ParameterValueConstraintsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ParameterValueConstraintsDTO::~ParameterValueConstraintsDTO()
{

}

void
ParameterValueConstraintsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *minValueKey = "minValue";

    if(object.has_key(minValueKey))
    {
        bourne::json value = object[minValueKey];



        jsonToValue(&minValue, value, "double");


    }

    const char *maxValueKey = "maxValue";

    if(object.has_key(maxValueKey))
    {
        bourne::json value = object[maxValueKey];



        jsonToValue(&maxValue, value, "double");


    }

    const char *maxLengthKey = "maxLength";

    if(object.has_key(maxLengthKey))
    {
        bourne::json value = object[maxLengthKey];



        jsonToValue(&maxLength, value, "int");


    }


}

bourne::json
ParameterValueConstraintsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["minValue"] = getMinValue();






    object["maxValue"] = getMaxValue();






    object["maxLength"] = getMaxLength();



    return object;

}

double
ParameterValueConstraintsDTO::getMinValue()
{
	return minValue;
}

void
ParameterValueConstraintsDTO::setMinValue(double  minValue)
{
	this->minValue = minValue;
}

double
ParameterValueConstraintsDTO::getMaxValue()
{
	return maxValue;
}

void
ParameterValueConstraintsDTO::setMaxValue(double  maxValue)
{
	this->maxValue = maxValue;
}

int
ParameterValueConstraintsDTO::getMaxLength()
{
	return maxLength;
}

void
ParameterValueConstraintsDTO::setMaxLength(int  maxLength)
{
	this->maxLength = maxLength;
}



