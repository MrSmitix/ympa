

#include "CampaignDTO.h"

using namespace Tiny;

CampaignDTO::CampaignDTO()
{
	domain = std::string();
	id = long(0);
	clientId = long(0);
	business = BusinessDTO();
	placementType = PlacementType();
}

CampaignDTO::CampaignDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignDTO::~CampaignDTO()
{

}

void
CampaignDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *domainKey = "domain";

    if(object.has_key(domainKey))
    {
        bourne::json value = object[domainKey];



        jsonToValue(&domain, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *clientIdKey = "clientId";

    if(object.has_key(clientIdKey))
    {
        bourne::json value = object[clientIdKey];



        jsonToValue(&clientId, value, "long");


    }

    const char *businessKey = "business";

    if(object.has_key(businessKey))
    {
        bourne::json value = object[businessKey];




        BusinessDTO* obj = &business;
		obj->fromJson(value.dump());

    }

    const char *placementTypeKey = "placementType";

    if(object.has_key(placementTypeKey))
    {
        bourne::json value = object[placementTypeKey];




        PlacementType* obj = &placementType;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["domain"] = getDomain();






    object["id"] = getId();






    object["clientId"] = getClientId();







	object["business"] = getBusiness().toJson();






	object["placementType"] = getPlacementType().toJson();


    return object;

}

std::string
CampaignDTO::getDomain()
{
	return domain;
}

void
CampaignDTO::setDomain(std::string  domain)
{
	this->domain = domain;
}

long
CampaignDTO::getId()
{
	return id;
}

void
CampaignDTO::setId(long  id)
{
	this->id = id;
}

long
CampaignDTO::getClientId()
{
	return clientId;
}

void
CampaignDTO::setClientId(long  clientId)
{
	this->clientId = clientId;
}

BusinessDTO
CampaignDTO::getBusiness()
{
	return business;
}

void
CampaignDTO::setBusiness(BusinessDTO  business)
{
	this->business = business;
}

PlacementType
CampaignDTO::getPlacementType()
{
	return placementType;
}

void
CampaignDTO::setPlacementType(PlacementType  placementType)
{
	this->placementType = placementType;
}



