

#include "CalculatedTariffType.h"

using namespace Tiny;

CalculatedTariffType::CalculatedTariffType()
{
}

CalculatedTariffType::CalculatedTariffType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CalculatedTariffType::~CalculatedTariffType()
{

}

void
CalculatedTariffType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CalculatedTariffType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



