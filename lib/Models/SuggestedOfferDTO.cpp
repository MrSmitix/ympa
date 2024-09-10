

#include "SuggestedOfferDTO.h"

using namespace Tiny;

SuggestedOfferDTO::SuggestedOfferDTO()
{
	offerId = std::string();
	name = std::string();
	category = std::string();
	vendor = std::string();
	barcodes = std::list<std::string>();
	description = std::string();
	vendorCode = std::string();
	basicPrice = BasePriceDTO();
}

SuggestedOfferDTO::SuggestedOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

SuggestedOfferDTO::~SuggestedOfferDTO()
{

}

void
SuggestedOfferDTO::fromJson(std::string jsonObj)
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

    const char *vendorCodeKey = "vendorCode";

    if(object.has_key(vendorCodeKey))
    {
        bourne::json value = object[vendorCodeKey];



        jsonToValue(&vendorCode, value, "std::string");


    }

    const char *basicPriceKey = "basicPrice";

    if(object.has_key(basicPriceKey))
    {
        bourne::json value = object[basicPriceKey];




        BasePriceDTO* obj = &basicPrice;
		obj->fromJson(value.dump());

    }


}

bourne::json
SuggestedOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();






    object["name"] = getName();






    object["category"] = getCategory();






    object["vendor"] = getVendor();





    std::list<std::string> barcodes_list = getBarcodes();
    bourne::json barcodes_arr = bourne::json::array();

    for(auto& var : barcodes_list)
    {
        barcodes_arr.append(var);
    }
    object["barcodes"] = barcodes_arr;









    object["description"] = getDescription();






    object["vendorCode"] = getVendorCode();







	object["basicPrice"] = getBasicPrice().toJson();


    return object;

}

std::string
SuggestedOfferDTO::getOfferId()
{
	return offerId;
}

void
SuggestedOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::string
SuggestedOfferDTO::getName()
{
	return name;
}

void
SuggestedOfferDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
SuggestedOfferDTO::getCategory()
{
	return category;
}

void
SuggestedOfferDTO::setCategory(std::string  category)
{
	this->category = category;
}

std::string
SuggestedOfferDTO::getVendor()
{
	return vendor;
}

void
SuggestedOfferDTO::setVendor(std::string  vendor)
{
	this->vendor = vendor;
}

std::list<std::string>
SuggestedOfferDTO::getBarcodes()
{
	return barcodes;
}

void
SuggestedOfferDTO::setBarcodes(std::list <std::string> barcodes)
{
	this->barcodes = barcodes;
}

std::string
SuggestedOfferDTO::getDescription()
{
	return description;
}

void
SuggestedOfferDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::string
SuggestedOfferDTO::getVendorCode()
{
	return vendorCode;
}

void
SuggestedOfferDTO::setVendorCode(std::string  vendorCode)
{
	this->vendorCode = vendorCode;
}

BasePriceDTO
SuggestedOfferDTO::getBasicPrice()
{
	return basicPrice;
}

void
SuggestedOfferDTO::setBasicPrice(BasePriceDTO  basicPrice)
{
	this->basicPrice = basicPrice;
}



