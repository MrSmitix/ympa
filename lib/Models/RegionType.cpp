

#include "RegionType.h"

using namespace Tiny;

RegionType::RegionType()
{
}

RegionType::RegionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

RegionType::~RegionType()
{

}

void
RegionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
RegionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



