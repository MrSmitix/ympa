

#include "SellingProgramType.h"

using namespace Tiny;

SellingProgramType::SellingProgramType()
{
}

SellingProgramType::SellingProgramType(std::string jsonString)
{
	this->fromJson(jsonString);
}

SellingProgramType::~SellingProgramType()
{

}

void
SellingProgramType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
SellingProgramType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



