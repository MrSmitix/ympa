

#include "ReturnDecisionType.h"

using namespace Tiny;

ReturnDecisionType::ReturnDecisionType()
{
}

ReturnDecisionType::ReturnDecisionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnDecisionType::~ReturnDecisionType()
{

}

void
ReturnDecisionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReturnDecisionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



