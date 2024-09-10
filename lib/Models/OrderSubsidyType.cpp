

#include "OrderSubsidyType.h"

using namespace Tiny;

OrderSubsidyType::OrderSubsidyType()
{
}

OrderSubsidyType::OrderSubsidyType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderSubsidyType::~OrderSubsidyType()
{

}

void
OrderSubsidyType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderSubsidyType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



