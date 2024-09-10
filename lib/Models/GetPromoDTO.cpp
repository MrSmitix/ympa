

#include "GetPromoDTO.h"

using namespace Tiny;

GetPromoDTO::GetPromoDTO()
{
	id = std::string();
	name = std::string();
	period = PromoPeriodDTO();
	participating = bool(false);
	assortmentInfo = GetPromoAssortmentInfoDTO();
	mechanicsInfo = GetPromoMechanicsInfoDTO();
	bestsellerInfo = GetPromoBestsellerInfoDTO();
	channels = std::list<ChannelType>();
	constraints = GetPromoConstraintsDTO();
}

GetPromoDTO::GetPromoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoDTO::~GetPromoDTO()
{

}

void
GetPromoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *periodKey = "period";

    if(object.has_key(periodKey))
    {
        bourne::json value = object[periodKey];




        PromoPeriodDTO* obj = &period;
		obj->fromJson(value.dump());

    }

    const char *participatingKey = "participating";

    if(object.has_key(participatingKey))
    {
        bourne::json value = object[participatingKey];



        jsonToValue(&participating, value, "bool");


    }

    const char *assortmentInfoKey = "assortmentInfo";

    if(object.has_key(assortmentInfoKey))
    {
        bourne::json value = object[assortmentInfoKey];




        GetPromoAssortmentInfoDTO* obj = &assortmentInfo;
		obj->fromJson(value.dump());

    }

    const char *mechanicsInfoKey = "mechanicsInfo";

    if(object.has_key(mechanicsInfoKey))
    {
        bourne::json value = object[mechanicsInfoKey];




        GetPromoMechanicsInfoDTO* obj = &mechanicsInfo;
		obj->fromJson(value.dump());

    }

    const char *bestsellerInfoKey = "bestsellerInfo";

    if(object.has_key(bestsellerInfoKey))
    {
        bourne::json value = object[bestsellerInfoKey];




        GetPromoBestsellerInfoDTO* obj = &bestsellerInfo;
		obj->fromJson(value.dump());

    }

    const char *channelsKey = "channels";

    if(object.has_key(channelsKey))
    {
        bourne::json value = object[channelsKey];


        std::list<ChannelType> channels_list;
        ChannelType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            channels_list.push_back(element);
        }
        channels = channels_list;


    }

    const char *constraintsKey = "constraints";

    if(object.has_key(constraintsKey))
    {
        bourne::json value = object[constraintsKey];




        GetPromoConstraintsDTO* obj = &constraints;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPromoDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["period"] = getPeriod().toJson();





    object["participating"] = isParticipating();







	object["assortmentInfo"] = getAssortmentInfo().toJson();






	object["mechanicsInfo"] = getMechanicsInfo().toJson();






	object["bestsellerInfo"] = getBestsellerInfo().toJson();




    std::list<ChannelType> channels_list = getChannels();
    bourne::json channels_arr = bourne::json::array();

    for(auto& var : channels_list)
    {
        ChannelType obj = var;
        channels_arr.append(obj.toJson());
    }
    object["channels"] = channels_arr;








	object["constraints"] = getConstraints().toJson();


    return object;

}

std::string
GetPromoDTO::getId()
{
	return id;
}

void
GetPromoDTO::setId(std::string  id)
{
	this->id = id;
}

std::string
GetPromoDTO::getName()
{
	return name;
}

void
GetPromoDTO::setName(std::string  name)
{
	this->name = name;
}

PromoPeriodDTO
GetPromoDTO::getPeriod()
{
	return period;
}

void
GetPromoDTO::setPeriod(PromoPeriodDTO  period)
{
	this->period = period;
}

bool
GetPromoDTO::isParticipating()
{
	return participating;
}

void
GetPromoDTO::setParticipating(bool  participating)
{
	this->participating = participating;
}

GetPromoAssortmentInfoDTO
GetPromoDTO::getAssortmentInfo()
{
	return assortmentInfo;
}

void
GetPromoDTO::setAssortmentInfo(GetPromoAssortmentInfoDTO  assortmentInfo)
{
	this->assortmentInfo = assortmentInfo;
}

GetPromoMechanicsInfoDTO
GetPromoDTO::getMechanicsInfo()
{
	return mechanicsInfo;
}

void
GetPromoDTO::setMechanicsInfo(GetPromoMechanicsInfoDTO  mechanicsInfo)
{
	this->mechanicsInfo = mechanicsInfo;
}

GetPromoBestsellerInfoDTO
GetPromoDTO::getBestsellerInfo()
{
	return bestsellerInfo;
}

void
GetPromoDTO::setBestsellerInfo(GetPromoBestsellerInfoDTO  bestsellerInfo)
{
	this->bestsellerInfo = bestsellerInfo;
}

std::list<ChannelType>
GetPromoDTO::getChannels()
{
	return channels;
}

void
GetPromoDTO::setChannels(std::list <ChannelType> channels)
{
	this->channels = channels;
}

GetPromoConstraintsDTO
GetPromoDTO::getConstraints()
{
	return constraints;
}

void
GetPromoDTO::setConstraints(GetPromoConstraintsDTO  constraints)
{
	this->constraints = constraints;
}



