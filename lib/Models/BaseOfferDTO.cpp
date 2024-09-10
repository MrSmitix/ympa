

#include "BaseOfferDTO.h"

using namespace Tiny;

BaseOfferDTO::BaseOfferDTO()
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
}

BaseOfferDTO::BaseOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

BaseOfferDTO::~BaseOfferDTO()
{

}

void
BaseOfferDTO::fromJson(std::string jsonObj)
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


}

bourne::json
BaseOfferDTO::toJson()
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




    return object;

}

std::string
BaseOfferDTO::getOfferId()
{
	return offerId;
}

void
BaseOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::string
BaseOfferDTO::getName()
{
	return name;
}

void
BaseOfferDTO::setName(std::string  name)
{
	this->name = name;
}

long
BaseOfferDTO::getMarketCategoryId()
{
	return marketCategoryId;
}

void
BaseOfferDTO::setMarketCategoryId(long  marketCategoryId)
{
	this->marketCategoryId = marketCategoryId;
}

std::string
BaseOfferDTO::getCategory()
{
	return category;
}

void
BaseOfferDTO::setCategory(std::string  category)
{
	this->category = category;
}

std::list<std::string>
BaseOfferDTO::getPictures()
{
	return pictures;
}

void
BaseOfferDTO::setPictures(std::list <std::string> pictures)
{
	this->pictures = pictures;
}

std::list<std::string>
BaseOfferDTO::getVideos()
{
	return videos;
}

void
BaseOfferDTO::setVideos(std::list <std::string> videos)
{
	this->videos = videos;
}

std::list<OfferManualDTO>
BaseOfferDTO::getManuals()
{
	return manuals;
}

void
BaseOfferDTO::setManuals(std::list <OfferManualDTO> manuals)
{
	this->manuals = manuals;
}

std::string
BaseOfferDTO::getVendor()
{
	return vendor;
}

void
BaseOfferDTO::setVendor(std::string  vendor)
{
	this->vendor = vendor;
}

std::list<std::string>
BaseOfferDTO::getBarcodes()
{
	return barcodes;
}

void
BaseOfferDTO::setBarcodes(std::list <std::string> barcodes)
{
	this->barcodes = barcodes;
}

std::string
BaseOfferDTO::getDescription()
{
	return description;
}

void
BaseOfferDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::list<std::string>
BaseOfferDTO::getManufacturerCountries()
{
	return manufacturerCountries;
}

void
BaseOfferDTO::setManufacturerCountries(std::list <std::string> manufacturerCountries)
{
	this->manufacturerCountries = manufacturerCountries;
}

OfferWeightDimensionsDTO
BaseOfferDTO::getWeightDimensions()
{
	return weightDimensions;
}

void
BaseOfferDTO::setWeightDimensions(OfferWeightDimensionsDTO  weightDimensions)
{
	this->weightDimensions = weightDimensions;
}

std::string
BaseOfferDTO::getVendorCode()
{
	return vendorCode;
}

void
BaseOfferDTO::setVendorCode(std::string  vendorCode)
{
	this->vendorCode = vendorCode;
}

std::list<std::string>
BaseOfferDTO::getTags()
{
	return tags;
}

void
BaseOfferDTO::setTags(std::list <std::string> tags)
{
	this->tags = tags;
}

TimePeriodDTO
BaseOfferDTO::getShelfLife()
{
	return shelfLife;
}

void
BaseOfferDTO::setShelfLife(TimePeriodDTO  shelfLife)
{
	this->shelfLife = shelfLife;
}

TimePeriodDTO
BaseOfferDTO::getLifeTime()
{
	return lifeTime;
}

void
BaseOfferDTO::setLifeTime(TimePeriodDTO  lifeTime)
{
	this->lifeTime = lifeTime;
}

TimePeriodDTO
BaseOfferDTO::getGuaranteePeriod()
{
	return guaranteePeriod;
}

void
BaseOfferDTO::setGuaranteePeriod(TimePeriodDTO  guaranteePeriod)
{
	this->guaranteePeriod = guaranteePeriod;
}

std::string
BaseOfferDTO::getCustomsCommodityCode()
{
	return customsCommodityCode;
}

void
BaseOfferDTO::setCustomsCommodityCode(std::string  customsCommodityCode)
{
	this->customsCommodityCode = customsCommodityCode;
}

std::list<std::string>
BaseOfferDTO::getCertificates()
{
	return certificates;
}

void
BaseOfferDTO::setCertificates(std::list <std::string> certificates)
{
	this->certificates = certificates;
}

int
BaseOfferDTO::getBoxCount()
{
	return boxCount;
}

void
BaseOfferDTO::setBoxCount(int  boxCount)
{
	this->boxCount = boxCount;
}

OfferConditionDTO
BaseOfferDTO::getCondition()
{
	return condition;
}

void
BaseOfferDTO::setCondition(OfferConditionDTO  condition)
{
	this->condition = condition;
}

OfferType
BaseOfferDTO::getType()
{
	return type;
}

void
BaseOfferDTO::setType(OfferType  type)
{
	this->type = type;
}

bool
BaseOfferDTO::isDownloadable()
{
	return downloadable;
}

void
BaseOfferDTO::setDownloadable(bool  downloadable)
{
	this->downloadable = downloadable;
}

bool
BaseOfferDTO::isAdult()
{
	return adult;
}

void
BaseOfferDTO::setAdult(bool  adult)
{
	this->adult = adult;
}

AgeDTO
BaseOfferDTO::getAge()
{
	return age;
}

void
BaseOfferDTO::setAge(AgeDTO  age)
{
	this->age = age;
}

std::list<OfferParamDTO>
BaseOfferDTO::getParams()
{
	return params;
}

void
BaseOfferDTO::setParams(std::list <OfferParamDTO> params)
{
	this->params = params;
}



