

#include "TurnoverType.h"

using namespace Tiny;

TurnoverType::TurnoverType()
{
}

TurnoverType::TurnoverType(std::string jsonString)
{
	this->fromJson(jsonString);
}

TurnoverType::~TurnoverType()
{

}

void
TurnoverType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TurnoverType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



