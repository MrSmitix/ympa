

#include "PromoOfferUpdateWarningDTO.h"

using namespace Tiny;

PromoOfferUpdateWarningDTO::PromoOfferUpdateWarningDTO()
{
	code = PromoOfferUpdateWarningCodeType();
	campaignIds = std::list<long>();
}

PromoOfferUpdateWarningDTO::PromoOfferUpdateWarningDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromoOfferUpdateWarningDTO::~PromoOfferUpdateWarningDTO()
{

}

void
PromoOfferUpdateWarningDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];




        PromoOfferUpdateWarningCodeType* obj = &code;
		obj->fromJson(value.dump());

    }

    const char *campaignIdsKey = "campaignIds";

    if(object.has_key(campaignIdsKey))
    {
        bourne::json value = object[campaignIdsKey];


        std::list<long> campaignIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            campaignIds_list.push_back(element);
        }
        campaignIds = campaignIds_list;


    }


}

bourne::json
PromoOfferUpdateWarningDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["code"] = getCode().toJson();




    std::list<long> campaignIds_list = getCampaignIds();
    bourne::json campaignIds_arr = bourne::json::array();

    for(auto& var : campaignIds_list)
    {
        campaignIds_arr.append(var);
    }
    object["campaignIds"] = campaignIds_arr;






    return object;

}

PromoOfferUpdateWarningCodeType
PromoOfferUpdateWarningDTO::getCode()
{
	return code;
}

void
PromoOfferUpdateWarningDTO::setCode(PromoOfferUpdateWarningCodeType  code)
{
	this->code = code;
}

std::list<long>
PromoOfferUpdateWarningDTO::getCampaignIds()
{
	return campaignIds;
}

void
PromoOfferUpdateWarningDTO::setCampaignIds(std::list <long> campaignIds)
{
	this->campaignIds = campaignIds;
}



