

#include "ShipmentType.h"

using namespace Tiny;

ShipmentType::ShipmentType()
{
}

ShipmentType::ShipmentType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShipmentType::~ShipmentType()
{

}

void
ShipmentType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ShipmentType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



