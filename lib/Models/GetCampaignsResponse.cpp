

#include "GetCampaignsResponse.h"

using namespace Tiny;

GetCampaignsResponse::GetCampaignsResponse()
{
	campaigns = std::list<CampaignDTO>();
	pager = FlippingPagerDTO();
}

GetCampaignsResponse::GetCampaignsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCampaignsResponse::~GetCampaignsResponse()
{

}

void
GetCampaignsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignsKey = "campaigns";

    if(object.has_key(campaignsKey))
    {
        bourne::json value = object[campaignsKey];


        std::list<CampaignDTO> campaigns_list;
        CampaignDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            campaigns_list.push_back(element);
        }
        campaigns = campaigns_list;


    }

    const char *pagerKey = "pager";

    if(object.has_key(pagerKey))
    {
        bourne::json value = object[pagerKey];




        FlippingPagerDTO* obj = &pager;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetCampaignsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CampaignDTO> campaigns_list = getCampaigns();
    bourne::json campaigns_arr = bourne::json::array();

    for(auto& var : campaigns_list)
    {
        CampaignDTO obj = var;
        campaigns_arr.append(obj.toJson());
    }
    object["campaigns"] = campaigns_arr;








	object["pager"] = getPager().toJson();


    return object;

}

std::list<CampaignDTO>
GetCampaignsResponse::getCampaigns()
{
	return campaigns;
}

void
GetCampaignsResponse::setCampaigns(std::list <CampaignDTO> campaigns)
{
	this->campaigns = campaigns;
}

FlippingPagerDTO
GetCampaignsResponse::getPager()
{
	return pager;
}

void
GetCampaignsResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}



