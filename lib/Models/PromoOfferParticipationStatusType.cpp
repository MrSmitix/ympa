

#include "PromoOfferParticipationStatusType.h"

using namespace Tiny;

PromoOfferParticipationStatusType::PromoOfferParticipationStatusType()
{
}

PromoOfferParticipationStatusType::PromoOfferParticipationStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoOfferParticipationStatusType::~PromoOfferParticipationStatusType()
{

}

void
PromoOfferParticipationStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PromoOfferParticipationStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



