

#include "ReturnInstanceStatusType.h"

using namespace Tiny;

ReturnInstanceStatusType::ReturnInstanceStatusType()
{
}

ReturnInstanceStatusType::ReturnInstanceStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnInstanceStatusType::~ReturnInstanceStatusType()
{

}

void
ReturnInstanceStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReturnInstanceStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



