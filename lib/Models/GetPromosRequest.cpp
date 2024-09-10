

#include "GetPromosRequest.h"

using namespace Tiny;

GetPromosRequest::GetPromosRequest()
{
	participation = PromoParticipationType();
	mechanics = MechanicsType();
}

GetPromosRequest::GetPromosRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromosRequest::~GetPromosRequest()
{

}

void
GetPromosRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *participationKey = "participation";

    if(object.has_key(participationKey))
    {
        bourne::json value = object[participationKey];




        PromoParticipationType* obj = &participation;
		obj->fromJson(value.dump());

    }

    const char *mechanicsKey = "mechanics";

    if(object.has_key(mechanicsKey))
    {
        bourne::json value = object[mechanicsKey];




        MechanicsType* obj = &mechanics;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPromosRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["participation"] = getParticipation().toJson();






	object["mechanics"] = getMechanics().toJson();


    return object;

}

PromoParticipationType
GetPromosRequest::getParticipation()
{
	return participation;
}

void
GetPromosRequest::setParticipation(PromoParticipationType  participation)
{
	this->participation = participation;
}

MechanicsType
GetPromosRequest::getMechanics()
{
	return mechanics;
}

void
GetPromosRequest::setMechanics(MechanicsType  mechanics)
{
	this->mechanics = mechanics;
}



