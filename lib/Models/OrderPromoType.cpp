

#include "OrderPromoType.h"

using namespace Tiny;

OrderPromoType::OrderPromoType()
{
}

OrderPromoType::OrderPromoType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderPromoType::~OrderPromoType()
{

}

void
OrderPromoType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderPromoType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



