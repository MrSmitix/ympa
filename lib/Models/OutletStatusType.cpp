

#include "OutletStatusType.h"

using namespace Tiny;

OutletStatusType::OutletStatusType()
{
}

OutletStatusType::OutletStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletStatusType::~OutletStatusType()
{

}

void
OutletStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OutletStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



