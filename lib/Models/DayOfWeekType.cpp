

#include "DayOfWeekType.h"

using namespace Tiny;

DayOfWeekType::DayOfWeekType()
{
}

DayOfWeekType::DayOfWeekType(std::string jsonString)
{
	this->fromJson(jsonString);
}

DayOfWeekType::~DayOfWeekType()
{

}

void
DayOfWeekType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
DayOfWeekType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



