

#include "SortOrderType.h"

using namespace Tiny;

SortOrderType::SortOrderType()
{
}

SortOrderType::SortOrderType(std::string jsonString)
{
	this->fromJson(jsonString);
}

SortOrderType::~SortOrderType()
{

}

void
SortOrderType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
SortOrderType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



