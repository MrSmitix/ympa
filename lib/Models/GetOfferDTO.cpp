

#include "GetOfferDTO.h"

using namespace Tiny;

GetOfferDTO::GetOfferDTO()
{
	offerId = std::string();
	name = std::string();
	marketCategoryId = long(0);
	category = std::string();
	pictures = std::list<std::string>();
	videos = std::list<std::string>();
	manuals = std::list<OfferManualDTO>();
	vendor = std::string();
	barcodes = std::list<std::string>();
	description = std::string();
	manufacturerCountries = std::list<std::string>();
	weightDimensions = OfferWeightDimensionsDTO();
	vendorCode = std::string();
	tags = std::list<std::string>();
	shelfLife = TimePeriodDTO();
	lifeTime = TimePeriodDTO();
	guaranteePeriod = TimePeriodDTO();
	customsCommodityCode = std::string();
	certificates = std::list<std::string>();
	boxCount = int(0);
	condition = OfferConditionDTO();
	type = OfferType();
	downloadable = bool(false);
	adult = bool(false);
	age = AgeDTO();
	params = std::list<OfferParamDTO>();
	basicPrice = GetPriceWithDiscountDTO();
	purchasePrice = GetPriceDTO();
	additionalExpenses = GetPriceDTO();
	cofinancePrice = GetPriceDTO();
	cardStatus = OfferCardStatusType();
	campaigns = std::list<OfferCampaignStatusDTO>();
	sellingPrograms = std::list<OfferSellingProgramDTO>();
	archived = bool(false);
}

GetOfferDTO::GetOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferDTO::~GetOfferDTO()
{

}

void
GetOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *marketCategoryIdKey = "marketCategoryId";

    if(object.has_key(marketCategoryIdKey))
    {
        bourne::json value = object[marketCategoryIdKey];



        jsonToValue(&marketCategoryId, value, "long");


    }

    const char *categoryKey = "category";

    if(object.has_key(categoryKey))
    {
        bourne::json value = object[categoryKey];



        jsonToValue(&category, value, "std::string");


    }

    const char *picturesKey = "pictures";

    if(object.has_key(picturesKey))
    {
        bourne::json value = object[picturesKey];


        std::list<std::string> pictures_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            pictures_list.push_back(element);
        }
        pictures = pictures_list;


    }

    const char *videosKey = "videos";

    if(object.has_key(videosKey))
    {
        bourne::json value = object[videosKey];


        std::list<std::string> videos_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            videos_list.push_back(element);
        }
        videos = videos_list;


    }

    const char *manualsKey = "manuals";

    if(object.has_key(manualsKey))
    {
        bourne::json value = object[manualsKey];


        std::list<OfferManualDTO> manuals_list;
        OfferManualDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            manuals_list.push_back(element);
        }
        manuals = manuals_list;


    }

    const char *vendorKey = "vendor";

    if(object.has_key(vendorKey))
    {
        bourne::json value = object[vendorKey];



        jsonToValue(&vendor, value, "std::string");


    }

    const char *barcodesKey = "barcodes";

    if(object.has_key(barcodesKey))
    {
        bourne::json value = object[barcodesKey];


        std::list<std::string> barcodes_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            barcodes_list.push_back(element);
        }
        barcodes = barcodes_list;


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *manufacturerCountriesKey = "manufacturerCountries";

    if(object.has_key(manufacturerCountriesKey))
    {
        bourne::json value = object[manufacturerCountriesKey];


        std::list<std::string> manufacturerCountries_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            manufacturerCountries_list.push_back(element);
        }
        manufacturerCountries = manufacturerCountries_list;


    }

    const char *weightDimensionsKey = "weightDimensions";

    if(object.has_key(weightDimensionsKey))
    {
        bourne::json value = object[weightDimensionsKey];




        OfferWeightDimensionsDTO* obj = &weightDimensions;
		obj->fromJson(value.dump());

    }

    const char *vendorCodeKey = "vendorCode";

    if(object.has_key(vendorCodeKey))
    {
        bourne::json value = object[vendorCodeKey];



        jsonToValue(&vendorCode, value, "std::string");


    }

    const char *tagsKey = "tags";

    if(object.has_key(tagsKey))
    {
        bourne::json value = object[tagsKey];


        std::list<std::string> tags_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            tags_list.push_back(element);
        }
        tags = tags_list;


    }

    const char *shelfLifeKey = "shelfLife";

    if(object.has_key(shelfLifeKey))
    {
        bourne::json value = object[shelfLifeKey];




        TimePeriodDTO* obj = &shelfLife;
		obj->fromJson(value.dump());

    }

    const char *lifeTimeKey = "lifeTime";

    if(object.has_key(lifeTimeKey))
    {
        bourne::json value = object[lifeTimeKey];




        TimePeriodDTO* obj = &lifeTime;
		obj->fromJson(value.dump());

    }

    const char *guaranteePeriodKey = "guaranteePeriod";

    if(object.has_key(guaranteePeriodKey))
    {
        bourne::json value = object[guaranteePeriodKey];




        TimePeriodDTO* obj = &guaranteePeriod;
		obj->fromJson(value.dump());

    }

    const char *customsCommodityCodeKey = "customsCommodityCode";

    if(object.has_key(customsCommodityCodeKey))
    {
        bourne::json value = object[customsCommodityCodeKey];



        jsonToValue(&customsCommodityCode, value, "std::string");


    }

    const char *certificatesKey = "certificates";

    if(object.has_key(certificatesKey))
    {
        bourne::json value = object[certificatesKey];


        std::list<std::string> certificates_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            certificates_list.push_back(element);
        }
        certificates = certificates_list;


    }

    const char *boxCountKey = "boxCount";

    if(object.has_key(boxCountKey))
    {
        bourne::json value = object[boxCountKey];



        jsonToValue(&boxCount, value, "int");


    }

    const char *conditionKey = "condition";

    if(object.has_key(conditionKey))
    {
        bourne::json value = object[conditionKey];




        OfferConditionDTO* obj = &condition;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OfferType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *downloadableKey = "downloadable";

    if(object.has_key(downloadableKey))
    {
        bourne::json value = object[downloadableKey];



        jsonToValue(&downloadable, value, "bool");


    }

    const char *adultKey = "adult";

    if(object.has_key(adultKey))
    {
        bourne::json value = object[adultKey];



        jsonToValue(&adult, value, "bool");


    }

    const char *ageKey = "age";

    if(object.has_key(ageKey))
    {
        bourne::json value = object[ageKey];




        AgeDTO* obj = &age;
		obj->fromJson(value.dump());

    }

    const char *paramsKey = "params";

    if(object.has_key(paramsKey))
    {
        bourne::json value = object[paramsKey];


        std::list<OfferParamDTO> params_list;
        OfferParamDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            params_list.push_back(element);
        }
        params = params_list;


    }

    const char *basicPriceKey = "basicPrice";

    if(object.has_key(basicPriceKey))
    {
        bourne::json value = object[basicPriceKey];




        GetPriceWithDiscountDTO* obj = &basicPrice;
		obj->fromJson(value.dump());

    }

    const char *purchasePriceKey = "purchasePrice";

    if(object.has_key(purchasePriceKey))
    {
        bourne::json value = object[purchasePriceKey];




        GetPriceDTO* obj = &purchasePrice;
		obj->fromJson(value.dump());

    }

    const char *additionalExpensesKey = "additionalExpenses";

    if(object.has_key(additionalExpensesKey))
    {
        bourne::json value = object[additionalExpensesKey];




        GetPriceDTO* obj = &additionalExpenses;
		obj->fromJson(value.dump());

    }

    const char *cofinancePriceKey = "cofinancePrice";

    if(object.has_key(cofinancePriceKey))
    {
        bourne::json value = object[cofinancePriceKey];




        GetPriceDTO* obj = &cofinancePrice;
		obj->fromJson(value.dump());

    }

    const char *cardStatusKey = "cardStatus";

    if(object.has_key(cardStatusKey))
    {
        bourne::json value = object[cardStatusKey];




        OfferCardStatusType* obj = &cardStatus;
		obj->fromJson(value.dump());

    }

    const char *campaignsKey = "campaigns";

    if(object.has_key(campaignsKey))
    {
        bourne::json value = object[campaignsKey];


        std::list<OfferCampaignStatusDTO> campaigns_list;
        OfferCampaignStatusDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            campaigns_list.push_back(element);
        }
        campaigns = campaigns_list;


    }

    const char *sellingProgramsKey = "sellingPrograms";

    if(object.has_key(sellingProgramsKey))
    {
        bourne::json value = object[sellingProgramsKey];


        std::list<OfferSellingProgramDTO> sellingPrograms_list;
        OfferSellingProgramDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            sellingPrograms_list.push_back(element);
        }
        sellingPrograms = sellingPrograms_list;


    }

    const char *archivedKey = "archived";

    if(object.has_key(archivedKey))
    {
        bourne::json value = object[archivedKey];



        jsonToValue(&archived, value, "bool");


    }


}

bourne::json
GetOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();






    object["name"] = getName();






    object["marketCategoryId"] = getMarketCategoryId();






    object["category"] = getCategory();





    std::list<std::string> pictures_list = getPictures();
    bourne::json pictures_arr = bourne::json::array();

    for(auto& var : pictures_list)
    {
        pictures_arr.append(var);
    }
    object["pictures"] = pictures_arr;








    std::list<std::string> videos_list = getVideos();
    bourne::json videos_arr = bourne::json::array();

    for(auto& var : videos_list)
    {
        videos_arr.append(var);
    }
    object["videos"] = videos_arr;








    std::list<OfferManualDTO> manuals_list = getManuals();
    bourne::json manuals_arr = bourne::json::array();

    for(auto& var : manuals_list)
    {
        OfferManualDTO obj = var;
        manuals_arr.append(obj.toJson());
    }
    object["manuals"] = manuals_arr;







    object["vendor"] = getVendor();





    std::list<std::string> barcodes_list = getBarcodes();
    bourne::json barcodes_arr = bourne::json::array();

    for(auto& var : barcodes_list)
    {
        barcodes_arr.append(var);
    }
    object["barcodes"] = barcodes_arr;









    object["description"] = getDescription();





    std::list<std::string> manufacturerCountries_list = getManufacturerCountries();
    bourne::json manufacturerCountries_arr = bourne::json::array();

    for(auto& var : manufacturerCountries_list)
    {
        manufacturerCountries_arr.append(var);
    }
    object["manufacturerCountries"] = manufacturerCountries_arr;










	object["weightDimensions"] = getWeightDimensions().toJson();





    object["vendorCode"] = getVendorCode();





    std::list<std::string> tags_list = getTags();
    bourne::json tags_arr = bourne::json::array();

    for(auto& var : tags_list)
    {
        tags_arr.append(var);
    }
    object["tags"] = tags_arr;










	object["shelfLife"] = getShelfLife().toJson();






	object["lifeTime"] = getLifeTime().toJson();






	object["guaranteePeriod"] = getGuaranteePeriod().toJson();





    object["customsCommodityCode"] = getCustomsCommodityCode();





    std::list<std::string> certificates_list = getCertificates();
    bourne::json certificates_arr = bourne::json::array();

    for(auto& var : certificates_list)
    {
        certificates_arr.append(var);
    }
    object["certificates"] = certificates_arr;









    object["boxCount"] = getBoxCount();







	object["condition"] = getCondition().toJson();






	object["type"] = getType().toJson();





    object["downloadable"] = isDownloadable();






    object["adult"] = isAdult();







	object["age"] = getAge().toJson();




    std::list<OfferParamDTO> params_list = getParams();
    bourne::json params_arr = bourne::json::array();

    for(auto& var : params_list)
    {
        OfferParamDTO obj = var;
        params_arr.append(obj.toJson());
    }
    object["params"] = params_arr;








	object["basicPrice"] = getBasicPrice().toJson();






	object["purchasePrice"] = getPurchasePrice().toJson();






	object["additionalExpenses"] = getAdditionalExpenses().toJson();






	object["cofinancePrice"] = getCofinancePrice().toJson();






	object["cardStatus"] = getCardStatus().toJson();




    std::list<OfferCampaignStatusDTO> campaigns_list = getCampaigns();
    bourne::json campaigns_arr = bourne::json::array();

    for(auto& var : campaigns_list)
    {
        OfferCampaignStatusDTO obj = var;
        campaigns_arr.append(obj.toJson());
    }
    object["campaigns"] = campaigns_arr;






    std::list<OfferSellingProgramDTO> sellingPrograms_list = getSellingPrograms();
    bourne::json sellingPrograms_arr = bourne::json::array();

    for(auto& var : sellingPrograms_list)
    {
        OfferSellingProgramDTO obj = var;
        sellingPrograms_arr.append(obj.toJson());
    }
    object["sellingPrograms"] = sellingPrograms_arr;







    object["archived"] = isArchived();



    return object;

}

std::string
GetOfferDTO::getOfferId()
{
	return offerId;
}

void
GetOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::string
GetOfferDTO::getName()
{
	return name;
}

void
GetOfferDTO::setName(std::string  name)
{
	this->name = name;
}

long
GetOfferDTO::getMarketCategoryId()
{
	return marketCategoryId;
}

void
GetOfferDTO::setMarketCategoryId(long  marketCategoryId)
{
	this->marketCategoryId = marketCategoryId;
}

std::string
GetOfferDTO::getCategory()
{
	return category;
}

void
GetOfferDTO::setCategory(std::string  category)
{
	this->category = category;
}

std::list<std::string>
GetOfferDTO::getPictures()
{
	return pictures;
}

void
GetOfferDTO::setPictures(std::list <std::string> pictures)
{
	this->pictures = pictures;
}

std::list<std::string>
GetOfferDTO::getVideos()
{
	return videos;
}

void
GetOfferDTO::setVideos(std::list <std::string> videos)
{
	this->videos = videos;
}

std::list<OfferManualDTO>
GetOfferDTO::getManuals()
{
	return manuals;
}

void
GetOfferDTO::setManuals(std::list <OfferManualDTO> manuals)
{
	this->manuals = manuals;
}

std::string
GetOfferDTO::getVendor()
{
	return vendor;
}

void
GetOfferDTO::setVendor(std::string  vendor)
{
	this->vendor = vendor;
}

std::list<std::string>
GetOfferDTO::getBarcodes()
{
	return barcodes;
}

void
GetOfferDTO::setBarcodes(std::list <std::string> barcodes)
{
	this->barcodes = barcodes;
}

std::string
GetOfferDTO::getDescription()
{
	return description;
}

void
GetOfferDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::list<std::string>
GetOfferDTO::getManufacturerCountries()
{
	return manufacturerCountries;
}

void
GetOfferDTO::setManufacturerCountries(std::list <std::string> manufacturerCountries)
{
	this->manufacturerCountries = manufacturerCountries;
}

OfferWeightDimensionsDTO
GetOfferDTO::getWeightDimensions()
{
	return weightDimensions;
}

void
GetOfferDTO::setWeightDimensions(OfferWeightDimensionsDTO  weightDimensions)
{
	this->weightDimensions = weightDimensions;
}

std::string
GetOfferDTO::getVendorCode()
{
	return vendorCode;
}

void
GetOfferDTO::setVendorCode(std::string  vendorCode)
{
	this->vendorCode = vendorCode;
}

std::list<std::string>
GetOfferDTO::getTags()
{
	return tags;
}

void
GetOfferDTO::setTags(std::list <std::string> tags)
{
	this->tags = tags;
}

TimePeriodDTO
GetOfferDTO::getShelfLife()
{
	return shelfLife;
}

void
GetOfferDTO::setShelfLife(TimePeriodDTO  shelfLife)
{
	this->shelfLife = shelfLife;
}

TimePeriodDTO
GetOfferDTO::getLifeTime()
{
	return lifeTime;
}

void
GetOfferDTO::setLifeTime(TimePeriodDTO  lifeTime)
{
	this->lifeTime = lifeTime;
}

TimePeriodDTO
GetOfferDTO::getGuaranteePeriod()
{
	return guaranteePeriod;
}

void
GetOfferDTO::setGuaranteePeriod(TimePeriodDTO  guaranteePeriod)
{
	this->guaranteePeriod = guaranteePeriod;
}

std::string
GetOfferDTO::getCustomsCommodityCode()
{
	return customsCommodityCode;
}

void
GetOfferDTO::setCustomsCommodityCode(std::string  customsCommodityCode)
{
	this->customsCommodityCode = customsCommodityCode;
}

std::list<std::string>
GetOfferDTO::getCertificates()
{
	return certificates;
}

void
GetOfferDTO::setCertificates(std::list <std::string> certificates)
{
	this->certificates = certificates;
}

int
GetOfferDTO::getBoxCount()
{
	return boxCount;
}

void
GetOfferDTO::setBoxCount(int  boxCount)
{
	this->boxCount = boxCount;
}

OfferConditionDTO
GetOfferDTO::getCondition()
{
	return condition;
}

void
GetOfferDTO::setCondition(OfferConditionDTO  condition)
{
	this->condition = condition;
}

OfferType
GetOfferDTO::getType()
{
	return type;
}

void
GetOfferDTO::setType(OfferType  type)
{
	this->type = type;
}

bool
GetOfferDTO::isDownloadable()
{
	return downloadable;
}

void
GetOfferDTO::setDownloadable(bool  downloadable)
{
	this->downloadable = downloadable;
}

bool
GetOfferDTO::isAdult()
{
	return adult;
}

void
GetOfferDTO::setAdult(bool  adult)
{
	this->adult = adult;
}

AgeDTO
GetOfferDTO::getAge()
{
	return age;
}

void
GetOfferDTO::setAge(AgeDTO  age)
{
	this->age = age;
}

std::list<OfferParamDTO>
GetOfferDTO::getParams()
{
	return params;
}

void
GetOfferDTO::setParams(std::list <OfferParamDTO> params)
{
	this->params = params;
}

GetPriceWithDiscountDTO
GetOfferDTO::getBasicPrice()
{
	return basicPrice;
}

void
GetOfferDTO::setBasicPrice(GetPriceWithDiscountDTO  basicPrice)
{
	this->basicPrice = basicPrice;
}

GetPriceDTO
GetOfferDTO::getPurchasePrice()
{
	return purchasePrice;
}

void
GetOfferDTO::setPurchasePrice(GetPriceDTO  purchasePrice)
{
	this->purchasePrice = purchasePrice;
}

GetPriceDTO
GetOfferDTO::getAdditionalExpenses()
{
	return additionalExpenses;
}

void
GetOfferDTO::setAdditionalExpenses(GetPriceDTO  additionalExpenses)
{
	this->additionalExpenses = additionalExpenses;
}

GetPriceDTO
GetOfferDTO::getCofinancePrice()
{
	return cofinancePrice;
}

void
GetOfferDTO::setCofinancePrice(GetPriceDTO  cofinancePrice)
{
	this->cofinancePrice = cofinancePrice;
}

OfferCardStatusType
GetOfferDTO::getCardStatus()
{
	return cardStatus;
}

void
GetOfferDTO::setCardStatus(OfferCardStatusType  cardStatus)
{
	this->cardStatus = cardStatus;
}

std::list<OfferCampaignStatusDTO>
GetOfferDTO::getCampaigns()
{
	return campaigns;
}

void
GetOfferDTO::setCampaigns(std::list <OfferCampaignStatusDTO> campaigns)
{
	this->campaigns = campaigns;
}

std::list<OfferSellingProgramDTO>
GetOfferDTO::getSellingPrograms()
{
	return sellingPrograms;
}

void
GetOfferDTO::setSellingPrograms(std::list <OfferSellingProgramDTO> sellingPrograms)
{
	this->sellingPrograms = sellingPrograms;
}

bool
GetOfferDTO::isArchived()
{
	return archived;
}

void
GetOfferDTO::setArchived(bool  archived)
{
	this->archived = archived;
}



