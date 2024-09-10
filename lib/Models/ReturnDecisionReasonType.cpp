

#include "ReturnDecisionReasonType.h"

using namespace Tiny;

ReturnDecisionReasonType::ReturnDecisionReasonType()
{
}

ReturnDecisionReasonType::ReturnDecisionReasonType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnDecisionReasonType::~ReturnDecisionReasonType()
{

}

void
ReturnDecisionReasonType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReturnDecisionReasonType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



