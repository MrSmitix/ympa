

#include "FullOutletDTO.h"

using namespace Tiny;

FullOutletDTO::FullOutletDTO()
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
	id = long(0);
	status = OutletStatusType();
	region = RegionDTO();
	shopOutletId = std::string();
	workingTime = std::string();
	moderationReason = std::string();
}

FullOutletDTO::FullOutletDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FullOutletDTO::~FullOutletDTO()
{

}

void
FullOutletDTO::fromJson(std::string jsonObj)
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

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OutletStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *regionKey = "region";

    if(object.has_key(regionKey))
    {
        bourne::json value = object[regionKey];




        RegionDTO* obj = &region;
		obj->fromJson(value.dump());

    }

    const char *shopOutletIdKey = "shopOutletId";

    if(object.has_key(shopOutletIdKey))
    {
        bourne::json value = object[shopOutletIdKey];



        jsonToValue(&shopOutletId, value, "std::string");


    }

    const char *workingTimeKey = "workingTime";

    if(object.has_key(workingTimeKey))
    {
        bourne::json value = object[workingTimeKey];



        jsonToValue(&workingTime, value, "std::string");


    }

    const char *moderationReasonKey = "moderationReason";

    if(object.has_key(moderationReasonKey))
    {
        bourne::json value = object[moderationReasonKey];



        jsonToValue(&moderationReason, value, "std::string");


    }


}

bourne::json
FullOutletDTO::toJson()
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






    object["id"] = getId();







	object["status"] = getStatus().toJson();






	object["region"] = getRegion().toJson();





    object["shopOutletId"] = getShopOutletId();






    object["workingTime"] = getWorkingTime();






    object["moderationReason"] = getModerationReason();



    return object;

}

std::string
FullOutletDTO::getName()
{
	return name;
}

void
FullOutletDTO::setName(std::string  name)
{
	this->name = name;
}

OutletType
FullOutletDTO::getType()
{
	return type;
}

void
FullOutletDTO::setType(OutletType  type)
{
	this->type = type;
}

std::string
FullOutletDTO::getCoords()
{
	return coords;
}

void
FullOutletDTO::setCoords(std::string  coords)
{
	this->coords = coords;
}

bool
FullOutletDTO::isIsMain()
{
	return isMain;
}

void
FullOutletDTO::setIsMain(bool  isMain)
{
	this->isMain = isMain;
}

std::string
FullOutletDTO::getShopOutletCode()
{
	return shopOutletCode;
}

void
FullOutletDTO::setShopOutletCode(std::string  shopOutletCode)
{
	this->shopOutletCode = shopOutletCode;
}

OutletVisibilityType
FullOutletDTO::getVisibility()
{
	return visibility;
}

void
FullOutletDTO::setVisibility(OutletVisibilityType  visibility)
{
	this->visibility = visibility;
}

OutletAddressDTO
FullOutletDTO::getAddress()
{
	return address;
}

void
FullOutletDTO::setAddress(OutletAddressDTO  address)
{
	this->address = address;
}

std::list<std::string>
FullOutletDTO::getPhones()
{
	return phones;
}

void
FullOutletDTO::setPhones(std::list <std::string> phones)
{
	this->phones = phones;
}

OutletWorkingScheduleDTO
FullOutletDTO::getWorkingSchedule()
{
	return workingSchedule;
}

void
FullOutletDTO::setWorkingSchedule(OutletWorkingScheduleDTO  workingSchedule)
{
	this->workingSchedule = workingSchedule;
}

std::list<OutletDeliveryRuleDTO>
FullOutletDTO::getDeliveryRules()
{
	return deliveryRules;
}

void
FullOutletDTO::setDeliveryRules(std::list <OutletDeliveryRuleDTO> deliveryRules)
{
	this->deliveryRules = deliveryRules;
}

long
FullOutletDTO::getStoragePeriod()
{
	return storagePeriod;
}

void
FullOutletDTO::setStoragePeriod(long  storagePeriod)
{
	this->storagePeriod = storagePeriod;
}

long
FullOutletDTO::getId()
{
	return id;
}

void
FullOutletDTO::setId(long  id)
{
	this->id = id;
}

OutletStatusType
FullOutletDTO::getStatus()
{
	return status;
}

void
FullOutletDTO::setStatus(OutletStatusType  status)
{
	this->status = status;
}

RegionDTO
FullOutletDTO::getRegion()
{
	return region;
}

void
FullOutletDTO::setRegion(RegionDTO  region)
{
	this->region = region;
}

std::string
FullOutletDTO::getShopOutletId()
{
	return shopOutletId;
}

void
FullOutletDTO::setShopOutletId(std::string  shopOutletId)
{
	this->shopOutletId = shopOutletId;
}

std::string
FullOutletDTO::getWorkingTime()
{
	return workingTime;
}

void
FullOutletDTO::setWorkingTime(std::string  workingTime)
{
	this->workingTime = workingTime;
}

std::string
FullOutletDTO::getModerationReason()
{
	return moderationReason;
}

void
FullOutletDTO::setModerationReason(std::string  moderationReason)
{
	this->moderationReason = moderationReason;
}



