

#include "TariffType.h"

using namespace Tiny;

TariffType::TariffType()
{
}

TariffType::TariffType(std::string jsonString)
{
	this->fromJson(jsonString);
}

TariffType::~TariffType()
{

}

void
TariffType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TariffType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



