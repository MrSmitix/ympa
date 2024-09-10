

#include "RefundStatusType.h"

using namespace Tiny;

RefundStatusType::RefundStatusType()
{
}

RefundStatusType::RefundStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

RefundStatusType::~RefundStatusType()
{

}

void
RefundStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
RefundStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



