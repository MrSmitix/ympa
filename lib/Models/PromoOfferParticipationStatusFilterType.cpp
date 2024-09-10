

#include "PromoOfferParticipationStatusFilterType.h"

using namespace Tiny;

PromoOfferParticipationStatusFilterType::PromoOfferParticipationStatusFilterType()
{
}

PromoOfferParticipationStatusFilterType::PromoOfferParticipationStatusFilterType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoOfferParticipationStatusFilterType::~PromoOfferParticipationStatusFilterType()
{

}

void
PromoOfferParticipationStatusFilterType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PromoOfferParticipationStatusFilterType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



