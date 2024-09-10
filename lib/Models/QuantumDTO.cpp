

#include "QuantumDTO.h"

using namespace Tiny;

QuantumDTO::QuantumDTO()
{
	minQuantity = int(0);
	stepQuantity = int(0);
}

QuantumDTO::QuantumDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

QuantumDTO::~QuantumDTO()
{

}

void
QuantumDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *minQuantityKey = "minQuantity";

    if(object.has_key(minQuantityKey))
    {
        bourne::json value = object[minQuantityKey];



        jsonToValue(&minQuantity, value, "int");


    }

    const char *stepQuantityKey = "stepQuantity";

    if(object.has_key(stepQuantityKey))
    {
        bourne::json value = object[stepQuantityKey];



        jsonToValue(&stepQuantity, value, "int");


    }


}

bourne::json
QuantumDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["minQuantity"] = getMinQuantity();






    object["stepQuantity"] = getStepQuantity();



    return object;

}

int
QuantumDTO::getMinQuantity()
{
	return minQuantity;
}

void
QuantumDTO::setMinQuantity(int  minQuantity)
{
	this->minQuantity = minQuantity;
}

int
QuantumDTO::getStepQuantity()
{
	return stepQuantity;
}

void
QuantumDTO::setStepQuantity(int  stepQuantity)
{
	this->stepQuantity = stepQuantity;
}



