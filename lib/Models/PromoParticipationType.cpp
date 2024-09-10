

#include "PromoParticipationType.h"

using namespace Tiny;

PromoParticipationType::PromoParticipationType()
{
}

PromoParticipationType::PromoParticipationType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoParticipationType::~PromoParticipationType()
{

}

void
PromoParticipationType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PromoParticipationType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



