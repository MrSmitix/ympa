

#include "OrderBusinessBuyerDTO.h"

using namespace Tiny;

OrderBusinessBuyerDTO::OrderBusinessBuyerDTO()
{
	inn = std::string();
	kpp = std::string();
	organizationName = std::string();
	organizationJurAddress = std::string();
}

OrderBusinessBuyerDTO::OrderBusinessBuyerDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderBusinessBuyerDTO::~OrderBusinessBuyerDTO()
{

}

void
OrderBusinessBuyerDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *innKey = "inn";

    if(object.has_key(innKey))
    {
        bourne::json value = object[innKey];



        jsonToValue(&inn, value, "std::string");


    }

    const char *kppKey = "kpp";

    if(object.has_key(kppKey))
    {
        bourne::json value = object[kppKey];



        jsonToValue(&kpp, value, "std::string");


    }

    const char *organizationNameKey = "organizationName";

    if(object.has_key(organizationNameKey))
    {
        bourne::json value = object[organizationNameKey];



        jsonToValue(&organizationName, value, "std::string");


    }

    const char *organizationJurAddressKey = "organizationJurAddress";

    if(object.has_key(organizationJurAddressKey))
    {
        bourne::json value = object[organizationJurAddressKey];



        jsonToValue(&organizationJurAddress, value, "std::string");


    }


}

bourne::json
OrderBusinessBuyerDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["inn"] = getInn();






    object["kpp"] = getKpp();






    object["organizationName"] = getOrganizationName();






    object["organizationJurAddress"] = getOrganizationJurAddress();



    return object;

}

std::string
OrderBusinessBuyerDTO::getInn()
{
	return inn;
}

void
OrderBusinessBuyerDTO::setInn(std::string  inn)
{
	this->inn = inn;
}

std::string
OrderBusinessBuyerDTO::getKpp()
{
	return kpp;
}

void
OrderBusinessBuyerDTO::setKpp(std::string  kpp)
{
	this->kpp = kpp;
}

std::string
OrderBusinessBuyerDTO::getOrganizationName()
{
	return organizationName;
}

void
OrderBusinessBuyerDTO::setOrganizationName(std::string  organizationName)
{
	this->organizationName = organizationName;
}

std::string
OrderBusinessBuyerDTO::getOrganizationJurAddress()
{
	return organizationJurAddress;
}

void
OrderBusinessBuyerDTO::setOrganizationJurAddress(std::string  organizationJurAddress)
{
	this->organizationJurAddress = organizationJurAddress;
}



