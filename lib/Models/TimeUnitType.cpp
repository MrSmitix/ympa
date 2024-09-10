

#include "TimeUnitType.h"

using namespace Tiny;

TimeUnitType::TimeUnitType()
{
}

TimeUnitType::TimeUnitType(std::string jsonString)
{
	this->fromJson(jsonString);
}

TimeUnitType::~TimeUnitType()
{

}

void
TimeUnitType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TimeUnitType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



