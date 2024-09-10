

#include "OutletDTO.h"

using namespace Tiny;

OutletDTO::OutletDTO()
{
	name = std::string();
	type = OutletType();
	coords = std::string();
	isMain = bool(false);
	shopOutletCode = std::string();
	visibility = OutletVisibilityType();
	address = OutletAddressDTO();
	phones = std::list<std::string>();
	workingSchedule = OutletWorkingScheduleDTO();
	deliveryRules = std::list<OutletDeliveryRuleDTO>();
	storagePeriod = long(0);
}

OutletDTO::OutletDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletDTO::~OutletDTO()
{

}

void
OutletDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OutletType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *coordsKey = "coords";

    if(object.has_key(coordsKey))
    {
        bourne::json value = object[coordsKey];



        jsonToValue(&coords, value, "std::string");


    }

    const char *isMainKey = "isMain";

    if(object.has_key(isMainKey))
    {
        bourne::json value = object[isMainKey];



        jsonToValue(&isMain, value, "bool");


    }

    const char *shopOutletCodeKey = "shopOutletCode";

    if(object.has_key(shopOutletCodeKey))
    {
        bourne::json value = object[shopOutletCodeKey];



        jsonToValue(&shopOutletCode, value, "std::string");


    }

    const char *visibilityKey = "visibility";

    if(object.has_key(visibilityKey))
    {
        bourne::json value = object[visibilityKey];




        OutletVisibilityType* obj = &visibility;
		obj->fromJson(value.dump());

    }

    const char *addressKey = "address";

    if(object.has_key(addressKey))
    {
        bourne::json value = object[addressKey];




        OutletAddressDTO* obj = &address;
		obj->fromJson(value.dump());

    }

    const char *phonesKey = "phones";

    if(object.has_key(phonesKey))
    {
        bourne::json value = object[phonesKey];


        std::list<std::string> phones_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            phones_list.push_back(element);
        }
        phones = phones_list;


    }

    const char *workingScheduleKey = "workingSchedule";

    if(object.has_key(workingScheduleKey))
    {
        bourne::json value = object[workingScheduleKey];




        OutletWorkingScheduleDTO* obj = &workingSchedule;
		obj->fromJson(value.dump());

    }

    const char *deliveryRulesKey = "deliveryRules";

    if(object.has_key(deliveryRulesKey))
    {
        bourne::json value = object[deliveryRulesKey];


        std::list<OutletDeliveryRuleDTO> deliveryRules_list;
        OutletDeliveryRuleDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            deliveryRules_list.push_back(element);
        }
        deliveryRules = deliveryRules_list;


    }

    const char *storagePeriodKey = "storagePeriod";

    if(object.has_key(storagePeriodKey))
    {
        bourne::json value = object[storagePeriodKey];



        jsonToValue(&storagePeriod, value, "long");


    }


}

bourne::json
OutletDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["type"] = getType().toJson();





    object["coords"] = getCoords();






    object["isMain"] = isIsMain();






    object["shopOutletCode"] = getShopOutletCode();







	object["visibility"] = getVisibility().toJson();






	object["address"] = getAddress().toJson();




    std::list<std::string> phones_list = getPhones();
    bourne::json phones_arr = bourne::json::array();

    for(auto& var : phones_list)
    {
        phones_arr.append(var);
    }
    object["phones"] = phones_arr;










	object["workingSchedule"] = getWorkingSchedule().toJson();




    std::list<OutletDeliveryRuleDTO> deliveryRules_list = getDeliveryRules();
    bourne::json deliveryRules_arr = bourne::json::array();

    for(auto& var : deliveryRules_list)
    {
        OutletDeliveryRuleDTO obj = var;
        deliveryRules_arr.append(obj.toJson());
    }
    object["deliveryRules"] = deliveryRules_arr;







    object["storagePeriod"] = getStoragePeriod();



    return object;

}

std::string
OutletDTO::getName()
{
	return name;
}

void
OutletDTO::setName(std::string  name)
{
	this->name = name;
}

OutletType
OutletDTO::getType()
{
	return type;
}

void
OutletDTO::setType(OutletType  type)
{
	this->type = type;
}

std::string
OutletDTO::getCoords()
{
	return coords;
}

void
OutletDTO::setCoords(std::string  coords)
{
	this->coords = coords;
}

bool
OutletDTO::isIsMain()
{
	return isMain;
}

void
OutletDTO::setIsMain(bool  isMain)
{
	this->isMain = isMain;
}

std::string
OutletDTO::getShopOutletCode()
{
	return shopOutletCode;
}

void
OutletDTO::setShopOutletCode(std::string  shopOutletCode)
{
	this->shopOutletCode = shopOutletCode;
}

OutletVisibilityType
OutletDTO::getVisibility()
{
	return visibility;
}

void
OutletDTO::setVisibility(OutletVisibilityType  visibility)
{
	this->visibility = visibility;
}

OutletAddressDTO
OutletDTO::getAddress()
{
	return address;
}

void
OutletDTO::setAddress(OutletAddressDTO  address)
{
	this->address = address;
}

std::list<std::string>
OutletDTO::getPhones()
{
	return phones;
}

void
OutletDTO::setPhones(std::list <std::string> phones)
{
	this->phones = phones;
}

OutletWorkingScheduleDTO
OutletDTO::getWorkingSchedule()
{
	return workingSchedule;
}

void
OutletDTO::setWorkingSchedule(OutletWorkingScheduleDTO  workingSchedule)
{
	this->workingSchedule = workingSchedule;
}

std::list<OutletDeliveryRuleDTO>
OutletDTO::getDeliveryRules()
{
	return deliveryRules;
}

void
OutletDTO::setDeliveryRules(std::list <OutletDeliveryRuleDTO> deliveryRules)
{
	this->deliveryRules = deliveryRules;
}

long
OutletDTO::getStoragePeriod()
{
	return storagePeriod;
}

void
OutletDTO::setStoragePeriod(long  storagePeriod)
{
	this->storagePeriod = storagePeriod;
}



