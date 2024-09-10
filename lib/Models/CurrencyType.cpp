

#include "CurrencyType.h"

using namespace Tiny;

CurrencyType::CurrencyType()
{
}

CurrencyType::CurrencyType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CurrencyType::~CurrencyType()
{

}

void
CurrencyType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CurrencyType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



