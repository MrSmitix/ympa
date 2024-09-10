

#include "ReturnShipmentStatusType.h"

using namespace Tiny;

ReturnShipmentStatusType::ReturnShipmentStatusType()
{
}

ReturnShipmentStatusType::ReturnShipmentStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnShipmentStatusType::~ReturnShipmentStatusType()
{

}

void
ReturnShipmentStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReturnShipmentStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



