

#include "PromoOfferUpdateWarningCodeType.h"

using namespace Tiny;

PromoOfferUpdateWarningCodeType::PromoOfferUpdateWarningCodeType()
{
}

PromoOfferUpdateWarningCodeType::PromoOfferUpdateWarningCodeType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoOfferUpdateWarningCodeType::~PromoOfferUpdateWarningCodeType()
{

}

void
PromoOfferUpdateWarningCodeType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PromoOfferUpdateWarningCodeType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



