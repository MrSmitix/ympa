

#include "PriceQuarantineVerdictType.h"

using namespace Tiny;

PriceQuarantineVerdictType::PriceQuarantineVerdictType()
{
}

PriceQuarantineVerdictType::PriceQuarantineVerdictType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceQuarantineVerdictType::~PriceQuarantineVerdictType()
{

}

void
PriceQuarantineVerdictType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PriceQuarantineVerdictType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



