

#include "ShipmentStatusType.h"

using namespace Tiny;

ShipmentStatusType::ShipmentStatusType()
{
}

ShipmentStatusType::ShipmentStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShipmentStatusType::~ShipmentStatusType()
{

}

void
ShipmentStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ShipmentStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



