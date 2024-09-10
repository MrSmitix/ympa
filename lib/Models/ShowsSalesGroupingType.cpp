

#include "ShowsSalesGroupingType.h"

using namespace Tiny;

ShowsSalesGroupingType::ShowsSalesGroupingType()
{
}

ShowsSalesGroupingType::ShowsSalesGroupingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShowsSalesGroupingType::~ShowsSalesGroupingType()
{

}

void
ShowsSalesGroupingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ShowsSalesGroupingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



