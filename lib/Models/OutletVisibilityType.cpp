

#include "OutletVisibilityType.h"

using namespace Tiny;

OutletVisibilityType::OutletVisibilityType()
{
}

OutletVisibilityType::OutletVisibilityType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletVisibilityType::~OutletVisibilityType()
{

}

void
OutletVisibilityType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OutletVisibilityType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



