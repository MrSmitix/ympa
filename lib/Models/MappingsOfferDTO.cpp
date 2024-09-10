

#include "MappingsOfferDTO.h"

using namespace Tiny;

MappingsOfferDTO::MappingsOfferDTO()
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
}

MappingsOfferDTO::MappingsOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

MappingsOfferDTO::~MappingsOfferDTO()
{

}

void
MappingsOfferDTO::fromJson(std::string jsonObj)
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


}

bourne::json
MappingsOfferDTO::toJson()
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



    return object;

}

std::string
MappingsOfferDTO::getName()
{
	return name;
}

void
MappingsOfferDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
MappingsOfferDTO::getShopSku()
{
	return shopSku;
}

void
MappingsOfferDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

std::string
MappingsOfferDTO::getCategory()
{
	return category;
}

void
MappingsOfferDTO::setCategory(std::string  category)
{
	this->category = category;
}

std::string
MappingsOfferDTO::getVendor()
{
	return vendor;
}

void
MappingsOfferDTO::setVendor(std::string  vendor)
{
	this->vendor = vendor;
}

std::string
MappingsOfferDTO::getVendorCode()
{
	return vendorCode;
}

void
MappingsOfferDTO::setVendorCode(std::string  vendorCode)
{
	this->vendorCode = vendorCode;
}

std::string
MappingsOfferDTO::getDescription()
{
	return description;
}

void
MappingsOfferDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::string
MappingsOfferDTO::getId()
{
	return id;
}

void
MappingsOfferDTO::setId(std::string  id)
{
	this->id = id;
}

long
MappingsOfferDTO::getFeedId()
{
	return feedId;
}

void
MappingsOfferDTO::setFeedId(long  feedId)
{
	this->feedId = feedId;
}

std::list<std::string>
MappingsOfferDTO::getBarcodes()
{
	return barcodes;
}

void
MappingsOfferDTO::setBarcodes(std::list <std::string> barcodes)
{
	this->barcodes = barcodes;
}

std::list<std::string>
MappingsOfferDTO::getUrls()
{
	return urls;
}

void
MappingsOfferDTO::setUrls(std::list <std::string> urls)
{
	this->urls = urls;
}

std::list<std::string>
MappingsOfferDTO::getPictures()
{
	return pictures;
}

void
MappingsOfferDTO::setPictures(std::list <std::string> pictures)
{
	this->pictures = pictures;
}

std::string
MappingsOfferDTO::getManufacturer()
{
	return manufacturer;
}

void
MappingsOfferDTO::setManufacturer(std::string  manufacturer)
{
	this->manufacturer = manufacturer;
}

std::list<std::string>
MappingsOfferDTO::getManufacturerCountries()
{
	return manufacturerCountries;
}

void
MappingsOfferDTO::setManufacturerCountries(std::list <std::string> manufacturerCountries)
{
	this->manufacturerCountries = manufacturerCountries;
}

int
MappingsOfferDTO::getMinShipment()
{
	return minShipment;
}

void
MappingsOfferDTO::setMinShipment(int  minShipment)
{
	this->minShipment = minShipment;
}

int
MappingsOfferDTO::getTransportUnitSize()
{
	return transportUnitSize;
}

void
MappingsOfferDTO::setTransportUnitSize(int  transportUnitSize)
{
	this->transportUnitSize = transportUnitSize;
}

int
MappingsOfferDTO::getQuantumOfSupply()
{
	return quantumOfSupply;
}

void
MappingsOfferDTO::setQuantumOfSupply(int  quantumOfSupply)
{
	this->quantumOfSupply = quantumOfSupply;
}

int
MappingsOfferDTO::getDeliveryDurationDays()
{
	return deliveryDurationDays;
}

void
MappingsOfferDTO::setDeliveryDurationDays(int  deliveryDurationDays)
{
	this->deliveryDurationDays = deliveryDurationDays;
}

int
MappingsOfferDTO::getBoxCount()
{
	return boxCount;
}

void
MappingsOfferDTO::setBoxCount(int  boxCount)
{
	this->boxCount = boxCount;
}

std::list<std::string>
MappingsOfferDTO::getCustomsCommodityCodes()
{
	return customsCommodityCodes;
}

void
MappingsOfferDTO::setCustomsCommodityCodes(std::list <std::string> customsCommodityCodes)
{
	this->customsCommodityCodes = customsCommodityCodes;
}

OfferWeightDimensionsDTO
MappingsOfferDTO::getWeightDimensions()
{
	return weightDimensions;
}

void
MappingsOfferDTO::setWeightDimensions(OfferWeightDimensionsDTO  weightDimensions)
{
	this->weightDimensions = weightDimensions;
}

std::list<DayOfWeekType>
MappingsOfferDTO::getSupplyScheduleDays()
{
	return supplyScheduleDays;
}

void
MappingsOfferDTO::setSupplyScheduleDays(std::list <DayOfWeekType> supplyScheduleDays)
{
	this->supplyScheduleDays = supplyScheduleDays;
}

int
MappingsOfferDTO::getShelfLifeDays()
{
	return shelfLifeDays;
}

void
MappingsOfferDTO::setShelfLifeDays(int  shelfLifeDays)
{
	this->shelfLifeDays = shelfLifeDays;
}

int
MappingsOfferDTO::getLifeTimeDays()
{
	return lifeTimeDays;
}

void
MappingsOfferDTO::setLifeTimeDays(int  lifeTimeDays)
{
	this->lifeTimeDays = lifeTimeDays;
}

int
MappingsOfferDTO::getGuaranteePeriodDays()
{
	return guaranteePeriodDays;
}

void
MappingsOfferDTO::setGuaranteePeriodDays(int  guaranteePeriodDays)
{
	this->guaranteePeriodDays = guaranteePeriodDays;
}

OfferProcessingStateDTO
MappingsOfferDTO::getProcessingState()
{
	return processingState;
}

void
MappingsOfferDTO::setProcessingState(OfferProcessingStateDTO  processingState)
{
	this->processingState = processingState;
}

OfferAvailabilityStatusType
MappingsOfferDTO::getAvailability()
{
	return availability;
}

void
MappingsOfferDTO::setAvailability(OfferAvailabilityStatusType  availability)
{
	this->availability = availability;
}

TimePeriodDTO
MappingsOfferDTO::getShelfLife()
{
	return shelfLife;
}

void
MappingsOfferDTO::setShelfLife(TimePeriodDTO  shelfLife)
{
	this->shelfLife = shelfLife;
}

TimePeriodDTO
MappingsOfferDTO::getLifeTime()
{
	return lifeTime;
}

void
MappingsOfferDTO::setLifeTime(TimePeriodDTO  lifeTime)
{
	this->lifeTime = lifeTime;
}

TimePeriodDTO
MappingsOfferDTO::getGuaranteePeriod()
{
	return guaranteePeriod;
}

void
MappingsOfferDTO::setGuaranteePeriod(TimePeriodDTO  guaranteePeriod)
{
	this->guaranteePeriod = guaranteePeriod;
}

std::string
MappingsOfferDTO::getCertificate()
{
	return certificate;
}

void
MappingsOfferDTO::setCertificate(std::string  certificate)
{
	this->certificate = certificate;
}

long
MappingsOfferDTO::getPrice()
{
	return price;
}

void
MappingsOfferDTO::setPrice(long  price)
{
	this->price = price;
}



