

#include "PriceSuggestType.h"

using namespace Tiny;

PriceSuggestType::PriceSuggestType()
{
}

PriceSuggestType::PriceSuggestType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceSuggestType::~PriceSuggestType()
{

}

void
PriceSuggestType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PriceSuggestType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



