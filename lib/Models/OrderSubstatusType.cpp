

#include "OrderSubstatusType.h"

using namespace Tiny;

OrderSubstatusType::OrderSubstatusType()
{
}

OrderSubstatusType::OrderSubstatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderSubstatusType::~OrderSubstatusType()
{

}

void
OrderSubstatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderSubstatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



