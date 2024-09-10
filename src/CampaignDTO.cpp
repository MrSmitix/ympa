#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignDTO::CampaignDTO()
{
	//__init();
}

CampaignDTO::~CampaignDTO()
{
	//__cleanup();
}

void
CampaignDTO::__init()
{
	//domain = std::string();
	//id = long(0);
	//clientId = long(0);
	//business = new BusinessDTO();
	//placementType = new PlacementType();
}

void
CampaignDTO::__cleanup()
{
	//if(domain != NULL) {
	//
	//delete domain;
	//domain = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(clientId != NULL) {
	//
	//delete clientId;
	//clientId = NULL;
	//}
	//if(business != NULL) {
	//
	//delete business;
	//business = NULL;
	//}
	//if(placementType != NULL) {
	//
	//delete placementType;
	//placementType = NULL;
	//}
	//
}

void
CampaignDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *domainKey = "domain";
	node = json_object_get_member(pJsonObject, domainKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&domain, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *clientIdKey = "clientId";
	node = json_object_get_member(pJsonObject, clientIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&clientId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *businessKey = "business";
	node = json_object_get_member(pJsonObject, businessKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessDTO")) {
			jsonToValue(&business, node, "BusinessDTO", "BusinessDTO");
		} else {
			
			BusinessDTO* obj = static_cast<BusinessDTO*> (&business);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *placementTypeKey = "placementType";
	node = json_object_get_member(pJsonObject, placementTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("PlacementType")) {
			jsonToValue(&placementType, node, "PlacementType", "PlacementType");
		} else {
			
			PlacementType* obj = static_cast<PlacementType*> (&placementType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignDTO::CampaignDTO(char* json)
{
	this->fromJson(json);
}

char*
CampaignDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDomain();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *domainKey = "domain";
	json_object_set_member(pJsonObject, domainKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("long long")) {
		long long obj = getClientId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *clientIdKey = "clientId";
	json_object_set_member(pJsonObject, clientIdKey, node);
	if (isprimitive("BusinessDTO")) {
		BusinessDTO obj = getBusiness();
		node = converttoJson(&obj, "BusinessDTO", "");
	}
	else {
		
		BusinessDTO obj = static_cast<BusinessDTO> (getBusiness());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *businessKey = "business";
	json_object_set_member(pJsonObject, businessKey, node);
	if (isprimitive("PlacementType")) {
		PlacementType obj = getPlacementType();
		node = converttoJson(&obj, "PlacementType", "");
	}
	else {
		
		PlacementType obj = static_cast<PlacementType> (getPlacementType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *placementTypeKey = "placementType";
	json_object_set_member(pJsonObject, placementTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

long long
CampaignDTO::getId()
{
	return id;
}

void
CampaignDTO::setId(long long  id)
{
	this->id = id;
}

long long
CampaignDTO::getClientId()
{
	return clientId;
}

void
CampaignDTO::setClientId(long long  clientId)
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


