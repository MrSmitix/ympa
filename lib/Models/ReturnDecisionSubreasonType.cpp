

#include "ReturnDecisionSubreasonType.h"

using namespace Tiny;

ReturnDecisionSubreasonType::ReturnDecisionSubreasonType()
{
}

ReturnDecisionSubreasonType::ReturnDecisionSubreasonType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnDecisionSubreasonType::~ReturnDecisionSubreasonType()
{

}

void
ReturnDecisionSubreasonType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReturnDecisionSubreasonType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



