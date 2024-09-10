

#include "ShipmentActionType.h"

using namespace Tiny;

ShipmentActionType::ShipmentActionType()
{
}

ShipmentActionType::ShipmentActionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShipmentActionType::~ShipmentActionType()
{

}

void
ShipmentActionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ShipmentActionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



