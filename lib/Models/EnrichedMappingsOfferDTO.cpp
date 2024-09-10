

#include "EnrichedMappingsOfferDTO.h"

using namespace Tiny;

EnrichedMappingsOfferDTO::EnrichedMappingsOfferDTO()
{
	name = std::string();
	shopSku = std::string();
	category = std::string();
	vendor = std::string();
	vendorCode = std::string();
	description = std::string();
	id = std::string();
	feedId = long(0);
	barcodes = std::list<std::string>();
	urls = std::list<std::string>();
	pictures = std::list<std::string>();
	manufacturer = std::string();
	manufacturerCountries = std::list<std::string>();
	minShipment = int(0);
	transportUnitSize = int(0);
	quantumOfSupply = int(0);
	deliveryDurationDays = int(0);
	boxCount = int(0);
	customsCommodityCodes = std::list<std::string>();
	weightDimensions = OfferWeightDimensionsDTO();
	supplyScheduleDays = std::list<DayOfWeekType>();
	shelfLifeDays = int(0);
	lifeTimeDays = int(0);
	guaranteePeriodDays = int(0);
	processingState = OfferProcessingStateDTO();
	availability = OfferAvailabilityStatusType();
	shelfLife = TimePeriodDTO();
	lifeTime = TimePeriodDTO();
	guaranteePeriod = TimePeriodDTO();
	certificate = std::string();
	price = float(0);
	marketCategoryId = long(0);
	marketCategoryName = std::string();
	marketModelId = long(0);
	marketModelName = std::string();
	marketSku = long(0);
	marketSkuName = std::string();
}

EnrichedMappingsOfferDTO::EnrichedMappingsOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

EnrichedMappingsOfferDTO::~EnrichedMappingsOfferDTO()
{

}

void
EnrichedMappingsOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *shopSkuKey = "shopSku";

    if(object.has_key(shopSkuKey))
    {
        bourne::json value = object[shopSkuKey];



        jsonToValue(&shopSku, value, "std::string");


    }

    const char *categoryKey = "category";

    if(object.has_key(categoryKey))
    {
        bourne::json value = object[categoryKey];



        jsonToValue(&category, value, "std::string");


    }

    const char *vendorKey = "vendor";

    if(object.has_key(vendorKey))
    {
        bourne::json value = object[vendorKey];



        jsonToValue(&vendor, value, "std::string");


    }

    const char *vendorCodeKey = "vendorCode";

    if(object.has_key(vendorCodeKey))
    {
        bourne::json value = object[vendorCodeKey];



        jsonToValue(&vendorCode, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *feedIdKey = "feedId";

    if(object.has_key(feedIdKey))
    {
        bourne::json value = object[feedIdKey];



        jsonToValue(&feedId, value, "long");


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

    const char *urlsKey = "urls";

    if(object.has_key(urlsKey))
    {
        bourne::json value = object[urlsKey];


        std::list<std::string> urls_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            urls_list.push_back(element);
        }
        urls = urls_list;


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

    const char *manufacturerKey = "manufacturer";

    if(object.has_key(manufacturerKey))
    {
        bourne::json value = object[manufacturerKey];



        jsonToValue(&manufacturer, value, "std::string");


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

    const char *minShipmentKey = "minShipment";

    if(object.has_key(minShipmentKey))
    {
        bourne::json value = object[minShipmentKey];



        jsonToValue(&minShipment, value, "int");


    }

    const char *transportUnitSizeKey = "transportUnitSize";

    if(object.has_key(transportUnitSizeKey))
    {
        bourne::json value = object[transportUnitSizeKey];



        jsonToValue(&transportUnitSize, value, "int");


    }

    const char *quantumOfSupplyKey = "quantumOfSupply";

    if(object.has_key(quantumOfSupplyKey))
    {
        bourne::json value = object[quantumOfSupplyKey];



        jsonToValue(&quantumOfSupply, value, "int");


    }

    const char *deliveryDurationDaysKey = "deliveryDurationDays";

    if(object.has_key(deliveryDurationDaysKey))
    {
        bourne::json value = object[deliveryDurationDaysKey];



        jsonToValue(&deliveryDurationDays, value, "int");


    }

    const char *boxCountKey = "boxCount";

    if(object.has_key(boxCountKey))
    {
        bourne::json value = object[boxCountKey];



        jsonToValue(&boxCount, value, "int");


    }

    const char *customsCommodityCodesKey = "customsCommodityCodes";

    if(object.has_key(customsCommodityCodesKey))
    {
        bourne::json value = object[customsCommodityCodesKey];


        std::list<std::string> customsCommodityCodes_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            customsCommodityCodes_list.push_back(element);
        }
        customsCommodityCodes = customsCommodityCodes_list;


    }

    const char *weightDimensionsKey = "weightDimensions";

    if(object.has_key(weightDimensionsKey))
    {
        bourne::json value = object[weightDimensionsKey];




        OfferWeightDimensionsDTO* obj = &weightDimensions;
		obj->fromJson(value.dump());

    }

    const char *supplyScheduleDaysKey = "supplyScheduleDays";

    if(object.has_key(supplyScheduleDaysKey))
    {
        bourne::json value = object[supplyScheduleDaysKey];


        std::list<DayOfWeekType> supplyScheduleDays_list;
        DayOfWeekType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            supplyScheduleDays_list.push_back(element);
        }
        supplyScheduleDays = supplyScheduleDays_list;


    }

    const char *shelfLifeDaysKey = "shelfLifeDays";

    if(object.has_key(shelfLifeDaysKey))
    {
        bourne::json value = object[shelfLifeDaysKey];



        jsonToValue(&shelfLifeDays, value, "int");


    }

    const char *lifeTimeDaysKey = "lifeTimeDays";

    if(object.has_key(lifeTimeDaysKey))
    {
        bourne::json value = object[lifeTimeDaysKey];



        jsonToValue(&lifeTimeDays, value, "int");


    }

    const char *guaranteePeriodDaysKey = "guaranteePeriodDays";

    if(object.has_key(guaranteePeriodDaysKey))
    {
        bourne::json value = object[guaranteePeriodDaysKey];



        jsonToValue(&guaranteePeriodDays, value, "int");


    }

    const char *processingStateKey = "processingState";

    if(object.has_key(processingStateKey))
    {
        bourne::json value = object[processingStateKey];




        OfferProcessingStateDTO* obj = &processingState;
		obj->fromJson(value.dump());

    }

    const char *availabilityKey = "availability";

    if(object.has_key(availabilityKey))
    {
        bourne::json value = object[availabilityKey];




        OfferAvailabilityStatusType* obj = &availability;
		obj->fromJson(value.dump());

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

    const char *certificateKey = "certificate";

    if(object.has_key(certificateKey))
    {
        bourne::json value = object[certificateKey];



        jsonToValue(&certificate, value, "std::string");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *marketCategoryIdKey = "marketCategoryId";

    if(object.has_key(marketCategoryIdKey))
    {
        bourne::json value = object[marketCategoryIdKey];



        jsonToValue(&marketCategoryId, value, "long");


    }

    const char *marketCategoryNameKey = "marketCategoryName";

    if(object.has_key(marketCategoryNameKey))
    {
        bourne::json value = object[marketCategoryNameKey];



        jsonToValue(&marketCategoryName, value, "std::string");


    }

    const char *marketModelIdKey = "marketModelId";

    if(object.has_key(marketModelIdKey))
    {
        bourne::json value = object[marketModelIdKey];



        jsonToValue(&marketModelId, value, "long");


    }

    const char *marketModelNameKey = "marketModelName";

    if(object.has_key(marketModelNameKey))
    {
        bourne::json value = object[marketModelNameKey];



        jsonToValue(&marketModelName, value, "std::string");


    }

    const char *marketSkuKey = "marketSku";

    if(object.has_key(marketSkuKey))
    {
        bourne::json value = object[marketSkuKey];



        jsonToValue(&marketSku, value, "long");


    }

    const char *marketSkuNameKey = "marketSkuName";

    if(object.has_key(marketSkuNameKey))
    {
        bourne::json value = object[marketSkuNameKey];



        jsonToValue(&marketSkuName, value, "std::string");


    }


}

bourne::json
EnrichedMappingsOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["shopSku"] = getShopSku();






    object["category"] = getCategory();






    object["vendor"] = getVendor();






    object["vendorCode"] = getVendorCode();






    object["description"] = getDescription();






    object["id"] = getId();






    object["feedId"] = getFeedId();





    std::list<std::string> barcodes_list = getBarcodes();
    bourne::json barcodes_arr = bourne::json::array();

    for(auto& var : barcodes_list)
    {
        barcodes_arr.append(var);
    }
    object["barcodes"] = barcodes_arr;








    std::list<std::string> urls_list = getUrls();
    bourne::json urls_arr = bourne::json::array();

    for(auto& var : urls_list)
    {
        urls_arr.append(var);
    }
    object["urls"] = urls_arr;








    std::list<std::string> pictures_list = getPictures();
    bourne::json pictures_arr = bourne::json::array();

    for(auto& var : pictures_list)
    {
        pictures_arr.append(var);
    }
    object["pictures"] = pictures_arr;









    object["manufacturer"] = getManufacturer();





    std::list<std::string> manufacturerCountries_list = getManufacturerCountries();
    bourne::json manufacturerCountries_arr = bourne::json::array();

    for(auto& var : manufacturerCountries_list)
    {
        manufacturerCountries_arr.append(var);
    }
    object["manufacturerCountries"] = manufacturerCountries_arr;









    object["minShipment"] = getMinShipment();






    object["transportUnitSize"] = getTransportUnitSize();






    object["quantumOfSupply"] = getQuantumOfSupply();






    object["deliveryDurationDays"] = getDeliveryDurationDays();






    object["boxCount"] = getBoxCount();





    std::list<std::string> customsCommodityCodes_list = getCustomsCommodityCodes();
    bourne::json customsCommodityCodes_arr = bourne::json::array();

    for(auto& var : customsCommodityCodes_list)
    {
        customsCommodityCodes_arr.append(var);
    }
    object["customsCommodityCodes"] = customsCommodityCodes_arr;










	object["weightDimensions"] = getWeightDimensions().toJson();




    std::list<DayOfWeekType> supplyScheduleDays_list = getSupplyScheduleDays();
    bourne::json supplyScheduleDays_arr = bourne::json::array();

    for(auto& var : supplyScheduleDays_list)
    {
        DayOfWeekType obj = var;
        supplyScheduleDays_arr.append(obj.toJson());
    }
    object["supplyScheduleDays"] = supplyScheduleDays_arr;







    object["shelfLifeDays"] = getShelfLifeDays();






    object["lifeTimeDays"] = getLifeTimeDays();






    object["guaranteePeriodDays"] = getGuaranteePeriodDays();







	object["processingState"] = getProcessingState().toJson();






	object["availability"] = getAvailability().toJson();






	object["shelfLife"] = getShelfLife().toJson();






	object["lifeTime"] = getLifeTime().toJson();






	object["guaranteePeriod"] = getGuaranteePeriod().toJson();





    object["certificate"] = getCertificate();






    object["price"] = getPrice();






    object["marketCategoryId"] = getMarketCategoryId();






    object["marketCategoryName"] = getMarketCategoryName();






    object["marketModelId"] = getMarketModelId();






    object["marketModelName"] = getMarketModelName();






    object["marketSku"] = getMarketSku();






    object["marketSkuName"] = getMarketSkuName();



    return object;

}

std::string
EnrichedMappingsOfferDTO::getName()
{
	return name;
}

void
EnrichedMappingsOfferDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
EnrichedMappingsOfferDTO::getShopSku()
{
	return shopSku;
}

void
EnrichedMappingsOfferDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

std::string
EnrichedMappingsOfferDTO::getCategory()
{
	return category;
}

void
EnrichedMappingsOfferDTO::setCategory(std::string  category)
{
	this->category = category;
}

std::string
EnrichedMappingsOfferDTO::getVendor()
{
	return vendor;
}

void
EnrichedMappingsOfferDTO::setVendor(std::string  vendor)
{
	this->vendor = vendor;
}

std::string
EnrichedMappingsOfferDTO::getVendorCode()
{
	return vendorCode;
}

void
EnrichedMappingsOfferDTO::setVendorCode(std::string  vendorCode)
{
	this->vendorCode = vendorCode;
}

std::string
EnrichedMappingsOfferDTO::getDescription()
{
	return description;
}

void
EnrichedMappingsOfferDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::string
EnrichedMappingsOfferDTO::getId()
{
	return id;
}

void
EnrichedMappingsOfferDTO::setId(std::string  id)
{
	this->id = id;
}

long
EnrichedMappingsOfferDTO::getFeedId()
{
	return feedId;
}

void
EnrichedMappingsOfferDTO::setFeedId(long  feedId)
{
	this->feedId = feedId;
}

std::list<std::string>
EnrichedMappingsOfferDTO::getBarcodes()
{
	return barcodes;
}

void
EnrichedMappingsOfferDTO::setBarcodes(std::list <std::string> barcodes)
{
	this->barcodes = barcodes;
}

std::list<std::string>
EnrichedMappingsOfferDTO::getUrls()
{
	return urls;
}

void
EnrichedMappingsOfferDTO::setUrls(std::list <std::string> urls)
{
	this->urls = urls;
}

std::list<std::string>
EnrichedMappingsOfferDTO::getPictures()
{
	return pictures;
}

void
EnrichedMappingsOfferDTO::setPictures(std::list <std::string> pictures)
{
	this->pictures = pictures;
}

std::string
EnrichedMappingsOfferDTO::getManufacturer()
{
	return manufacturer;
}

void
EnrichedMappingsOfferDTO::setManufacturer(std::string  manufacturer)
{
	this->manufacturer = manufacturer;
}

std::list<std::string>
EnrichedMappingsOfferDTO::getManufacturerCountries()
{
	return manufacturerCountries;
}

void
EnrichedMappingsOfferDTO::setManufacturerCountries(std::list <std::string> manufacturerCountries)
{
	this->manufacturerCountries = manufacturerCountries;
}

int
EnrichedMappingsOfferDTO::getMinShipment()
{
	return minShipment;
}

void
EnrichedMappingsOfferDTO::setMinShipment(int  minShipment)
{
	this->minShipment = minShipment;
}

int
EnrichedMappingsOfferDTO::getTransportUnitSize()
{
	return transportUnitSize;
}

void
EnrichedMappingsOfferDTO::setTransportUnitSize(int  transportUnitSize)
{
	this->transportUnitSize = transportUnitSize;
}

int
EnrichedMappingsOfferDTO::getQuantumOfSupply()
{
	return quantumOfSupply;
}

void
EnrichedMappingsOfferDTO::setQuantumOfSupply(int  quantumOfSupply)
{
	this->quantumOfSupply = quantumOfSupply;
}

int
EnrichedMappingsOfferDTO::getDeliveryDurationDays()
{
	return deliveryDurationDays;
}

void
EnrichedMappingsOfferDTO::setDeliveryDurationDays(int  deliveryDurationDays)
{
	this->deliveryDurationDays = deliveryDurationDays;
}

int
EnrichedMappingsOfferDTO::getBoxCount()
{
	return boxCount;
}

void
EnrichedMappingsOfferDTO::setBoxCount(int  boxCount)
{
	this->boxCount = boxCount;
}

std::list<std::string>
EnrichedMappingsOfferDTO::getCustomsCommodityCodes()
{
	return customsCommodityCodes;
}

void
EnrichedMappingsOfferDTO::setCustomsCommodityCodes(std::list <std::string> customsCommodityCodes)
{
	this->customsCommodityCodes = customsCommodityCodes;
}

OfferWeightDimensionsDTO
EnrichedMappingsOfferDTO::getWeightDimensions()
{
	return weightDimensions;
}

void
EnrichedMappingsOfferDTO::setWeightDimensions(OfferWeightDimensionsDTO  weightDimensions)
{
	this->weightDimensions = weightDimensions;
}

std::list<DayOfWeekType>
EnrichedMappingsOfferDTO::getSupplyScheduleDays()
{
	return supplyScheduleDays;
}

void
EnrichedMappingsOfferDTO::setSupplyScheduleDays(std::list <DayOfWeekType> supplyScheduleDays)
{
	this->supplyScheduleDays = supplyScheduleDays;
}

int
EnrichedMappingsOfferDTO::getShelfLifeDays()
{
	return shelfLifeDays;
}

void
EnrichedMappingsOfferDTO::setShelfLifeDays(int  shelfLifeDays)
{
	this->shelfLifeDays = shelfLifeDays;
}

int
EnrichedMappingsOfferDTO::getLifeTimeDays()
{
	return lifeTimeDays;
}

void
EnrichedMappingsOfferDTO::setLifeTimeDays(int  lifeTimeDays)
{
	this->lifeTimeDays = lifeTimeDays;
}

int
EnrichedMappingsOfferDTO::getGuaranteePeriodDays()
{
	return guaranteePeriodDays;
}

void
EnrichedMappingsOfferDTO::setGuaranteePeriodDays(int  guaranteePeriodDays)
{
	this->guaranteePeriodDays = guaranteePeriodDays;
}

OfferProcessingStateDTO
EnrichedMappingsOfferDTO::getProcessingState()
{
	return processingState;
}

void
EnrichedMappingsOfferDTO::setProcessingState(OfferProcessingStateDTO  processingState)
{
	this->processingState = processingState;
}

OfferAvailabilityStatusType
EnrichedMappingsOfferDTO::getAvailability()
{
	return availability;
}

void
EnrichedMappingsOfferDTO::setAvailability(OfferAvailabilityStatusType  availability)
{
	this->availability = availability;
}

TimePeriodDTO
EnrichedMappingsOfferDTO::getShelfLife()
{
	return shelfLife;
}

void
EnrichedMappingsOfferDTO::setShelfLife(TimePeriodDTO  shelfLife)
{
	this->shelfLife = shelfLife;
}

TimePeriodDTO
EnrichedMappingsOfferDTO::getLifeTime()
{
	return lifeTime;
}

void
EnrichedMappingsOfferDTO::setLifeTime(TimePeriodDTO  lifeTime)
{
	this->lifeTime = lifeTime;
}

TimePeriodDTO
EnrichedMappingsOfferDTO::getGuaranteePeriod()
{
	return guaranteePeriod;
}

void
EnrichedMappingsOfferDTO::setGuaranteePeriod(TimePeriodDTO  guaranteePeriod)
{
	this->guaranteePeriod = guaranteePeriod;
}

std::string
EnrichedMappingsOfferDTO::getCertificate()
{
	return certificate;
}

void
EnrichedMappingsOfferDTO::setCertificate(std::string  certificate)
{
	this->certificate = certificate;
}

long
EnrichedMappingsOfferDTO::getPrice()
{
	return price;
}

void
EnrichedMappingsOfferDTO::setPrice(long  price)
{
	this->price = price;
}

long
EnrichedMappingsOfferDTO::getMarketCategoryId()
{
	return marketCategoryId;
}

void
EnrichedMappingsOfferDTO::setMarketCategoryId(long  marketCategoryId)
{
	this->marketCategoryId = marketCategoryId;
}

std::string
EnrichedMappingsOfferDTO::getMarketCategoryName()
{
	return marketCategoryName;
}

void
EnrichedMappingsOfferDTO::setMarketCategoryName(std::string  marketCategoryName)
{
	this->marketCategoryName = marketCategoryName;
}

long
EnrichedMappingsOfferDTO::getMarketModelId()
{
	return marketModelId;
}

void
EnrichedMappingsOfferDTO::setMarketModelId(long  marketModelId)
{
	this->marketModelId = marketModelId;
}

std::string
EnrichedMappingsOfferDTO::getMarketModelName()
{
	return marketModelName;
}

void
EnrichedMappingsOfferDTO::setMarketModelName(std::string  marketModelName)
{
	this->marketModelName = marketModelName;
}

long
EnrichedMappingsOfferDTO::getMarketSku()
{
	return marketSku;
}

void
EnrichedMappingsOfferDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
EnrichedMappingsOfferDTO::getMarketSkuName()
{
	return marketSkuName;
}

void
EnrichedMappingsOfferDTO::setMarketSkuName(std::string  marketSkuName)
{
	this->marketSkuName = marketSkuName;
}



