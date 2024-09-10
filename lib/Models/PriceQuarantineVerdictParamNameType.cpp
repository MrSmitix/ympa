

#include "PriceQuarantineVerdictParamNameType.h"

using namespace Tiny;

PriceQuarantineVerdictParamNameType::PriceQuarantineVerdictParamNameType()
{
}

PriceQuarantineVerdictParamNameType::PriceQuarantineVerdictParamNameType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceQuarantineVerdictParamNameType::~PriceQuarantineVerdictParamNameType()
{

}

void
PriceQuarantineVerdictParamNameType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PriceQuarantineVerdictParamNameType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



