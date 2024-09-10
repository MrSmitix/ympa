

#include "OrderLiftType.h"

using namespace Tiny;

OrderLiftType::OrderLiftType()
{
}

OrderLiftType::OrderLiftType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLiftType::~OrderLiftType()
{

}

void
OrderLiftType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderLiftType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



