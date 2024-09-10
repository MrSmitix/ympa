

#include "ReturnRequestDecisionType.h"

using namespace Tiny;

ReturnRequestDecisionType::ReturnRequestDecisionType()
{
}

ReturnRequestDecisionType::ReturnRequestDecisionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnRequestDecisionType::~ReturnRequestDecisionType()
{

}

void
ReturnRequestDecisionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReturnRequestDecisionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



