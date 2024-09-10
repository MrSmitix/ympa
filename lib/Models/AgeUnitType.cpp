

#include "AgeUnitType.h"

using namespace Tiny;

AgeUnitType::AgeUnitType()
{
}

AgeUnitType::AgeUnitType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AgeUnitType::~AgeUnitType()
{

}

void
AgeUnitType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AgeUnitType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



