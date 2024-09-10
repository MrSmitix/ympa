

#include "CampaignSettingsDTO.h"

using namespace Tiny;

CampaignSettingsDTO::CampaignSettingsDTO()
{
	countryRegion = long(0);
	shopName = std::string();
	showInContext = bool(false);
	showInPremium = bool(false);
	useOpenStat = bool(false);
	localRegion = CampaignSettingsLocalRegionDTO();
}

CampaignSettingsDTO::CampaignSettingsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignSettingsDTO::~CampaignSettingsDTO()
{

}

void
CampaignSettingsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countryRegionKey = "countryRegion";

    if(object.has_key(countryRegionKey))
    {
        bourne::json value = object[countryRegionKey];



        jsonToValue(&countryRegion, value, "long");


    }

    const char *shopNameKey = "shopName";

    if(object.has_key(shopNameKey))
    {
        bourne::json value = object[shopNameKey];



        jsonToValue(&shopName, value, "std::string");


    }

    const char *showInContextKey = "showInContext";

    if(object.has_key(showInContextKey))
    {
        bourne::json value = object[showInContextKey];



        jsonToValue(&showInContext, value, "bool");


    }

    const char *showInPremiumKey = "showInPremium";

    if(object.has_key(showInPremiumKey))
    {
        bourne::json value = object[showInPremiumKey];



        jsonToValue(&showInPremium, value, "bool");


    }

    const char *useOpenStatKey = "useOpenStat";

    if(object.has_key(useOpenStatKey))
    {
        bourne::json value = object[useOpenStatKey];



        jsonToValue(&useOpenStat, value, "bool");


    }

    const char *localRegionKey = "localRegion";

    if(object.has_key(localRegionKey))
    {
        bourne::json value = object[localRegionKey];




        CampaignSettingsLocalRegionDTO* obj = &localRegion;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignSettingsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["countryRegion"] = getCountryRegion();






    object["shopName"] = getShopName();






    object["showInContext"] = isShowInContext();






    object["showInPremium"] = isShowInPremium();






    object["useOpenStat"] = isUseOpenStat();







	object["localRegion"] = getLocalRegion().toJson();


    return object;

}

long
CampaignSettingsDTO::getCountryRegion()
{
	return countryRegion;
}

void
CampaignSettingsDTO::setCountryRegion(long  countryRegion)
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
CampaignSettingsDTO::isShowInContext()
{
	return showInContext;
}

void
CampaignSettingsDTO::setShowInContext(bool  showInContext)
{
	this->showInContext = showInContext;
}

bool
CampaignSettingsDTO::isShowInPremium()
{
	return showInPremium;
}

void
CampaignSettingsDTO::setShowInPremium(bool  showInPremium)
{
	this->showInPremium = showInPremium;
}

bool
CampaignSettingsDTO::isUseOpenStat()
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



