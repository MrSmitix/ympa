#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignSettingsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignSettingsDTO::CampaignSettingsDTO()
{
	//__init();
}

CampaignSettingsDTO::~CampaignSettingsDTO()
{
	//__cleanup();
}

void
CampaignSettingsDTO::__init()
{
	//countryRegion = long(0);
	//shopName = std::string();
	//showInContext = bool(false);
	//showInPremium = bool(false);
	//useOpenStat = bool(false);
	//localRegion = new CampaignSettingsLocalRegionDTO();
}

void
CampaignSettingsDTO::__cleanup()
{
	//if(countryRegion != NULL) {
	//
	//delete countryRegion;
	//countryRegion = NULL;
	//}
	//if(shopName != NULL) {
	//
	//delete shopName;
	//shopName = NULL;
	//}
	//if(showInContext != NULL) {
	//
	//delete showInContext;
	//showInContext = NULL;
	//}
	//if(showInPremium != NULL) {
	//
	//delete showInPremium;
	//showInPremium = NULL;
	//}
	//if(useOpenStat != NULL) {
	//
	//delete useOpenStat;
	//useOpenStat = NULL;
	//}
	//if(localRegion != NULL) {
	//
	//delete localRegion;
	//localRegion = NULL;
	//}
	//
}

void
CampaignSettingsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *countryRegionKey = "countryRegion";
	node = json_object_get_member(pJsonObject, countryRegionKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&countryRegion, node, "long long", "");
		} else {
			
		}
	}
	const gchar *shopNameKey = "shopName";
	node = json_object_get_member(pJsonObject, shopNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *showInContextKey = "showInContext";
	node = json_object_get_member(pJsonObject, showInContextKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&showInContext, node, "bool", "");
		} else {
			
		}
	}
	const gchar *showInPremiumKey = "showInPremium";
	node = json_object_get_member(pJsonObject, showInPremiumKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&showInPremium, node, "bool", "");
		} else {
			
		}
	}
	const gchar *useOpenStatKey = "useOpenStat";
	node = json_object_get_member(pJsonObject, useOpenStatKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&useOpenStat, node, "bool", "");
		} else {
			
		}
	}
	const gchar *localRegionKey = "localRegion";
	node = json_object_get_member(pJsonObject, localRegionKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignSettingsLocalRegionDTO")) {
			jsonToValue(&localRegion, node, "CampaignSettingsLocalRegionDTO", "CampaignSettingsLocalRegionDTO");
		} else {
			
			CampaignSettingsLocalRegionDTO* obj = static_cast<CampaignSettingsLocalRegionDTO*> (&localRegion);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignSettingsDTO::CampaignSettingsDTO(char* json)
{
	this->fromJson(json);
}

char*
CampaignSettingsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCountryRegion();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *countryRegionKey = "countryRegion";
	json_object_set_member(pJsonObject, countryRegionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShopName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopNameKey = "shopName";
	json_object_set_member(pJsonObject, shopNameKey, node);
	if (isprimitive("bool")) {
		bool obj = getShowInContext();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *showInContextKey = "showInContext";
	json_object_set_member(pJsonObject, showInContextKey, node);
	if (isprimitive("bool")) {
		bool obj = getShowInPremium();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *showInPremiumKey = "showInPremium";
	json_object_set_member(pJsonObject, showInPremiumKey, node);
	if (isprimitive("bool")) {
		bool obj = getUseOpenStat();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *useOpenStatKey = "useOpenStat";
	json_object_set_member(pJsonObject, useOpenStatKey, node);
	if (isprimitive("CampaignSettingsLocalRegionDTO")) {
		CampaignSettingsLocalRegionDTO obj = getLocalRegion();
		node = converttoJson(&obj, "CampaignSettingsLocalRegionDTO", "");
	}
	else {
		
		CampaignSettingsLocalRegionDTO obj = static_cast<CampaignSettingsLocalRegionDTO> (getLocalRegion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *localRegionKey = "localRegion";
	json_object_set_member(pJsonObject, localRegionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CampaignSettingsDTO::getCountryRegion()
{
	return countryRegion;
}

void
CampaignSettingsDTO::setCountryRegion(long long  countryRegion)
{
	this->countryRegion = countryRegion;
}

std::string
CampaignSettingsDTO::getShopName()
{
	return shopName;
}

void
CampaignSettingsDTO::setShopName(std::string  shopName)
{
	this->shopName = shopName;
}

bool
CampaignSettingsDTO::getShowInContext()
{
	return showInContext;
}

void
CampaignSettingsDTO::setShowInContext(bool  showInContext)
{
	this->showInContext = showInContext;
}

bool
CampaignSettingsDTO::getShowInPremium()
{
	return showInPremium;
}

void
CampaignSettingsDTO::setShowInPremium(bool  showInPremium)
{
	this->showInPremium = showInPremium;
}

bool
CampaignSettingsDTO::getUseOpenStat()
{
	return useOpenStat;
}

void
CampaignSettingsDTO::setUseOpenStat(bool  useOpenStat)
{
	this->useOpenStat = useOpenStat;
}

CampaignSettingsLocalRegionDTO
CampaignSettingsDTO::getLocalRegion()
{
	return localRegion;
}

void
CampaignSettingsDTO::setLocalRegion(CampaignSettingsLocalRegionDTO  localRegion)
{
	this->localRegion = localRegion;
}


