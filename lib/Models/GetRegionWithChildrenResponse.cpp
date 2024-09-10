

#include "GetRegionWithChildrenResponse.h"

using namespace Tiny;

GetRegionWithChildrenResponse::GetRegionWithChildrenResponse()
{
	pager = FlippingPagerDTO();
	regions = RegionDTO();
}

GetRegionWithChildrenResponse::GetRegionWithChildrenResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetRegionWithChildrenResponse::~GetRegionWithChildrenResponse()
{

}

void
GetRegionWithChildrenResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagerKey = "pager";

    if(object.has_key(pagerKey))
    {
        bourne::json value = object[pagerKey];




        FlippingPagerDTO* obj = &pager;
		obj->fromJson(value.dump());

    }

    const char *regionsKey = "regions";

    if(object.has_key(regionsKey))
    {
        bourne::json value = object[regionsKey];




        RegionDTO* obj = &regions;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetRegionWithChildrenResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["pager"] = getPager().toJson();






	object["regions"] = getRegions().toJson();


    return object;

}

FlippingPagerDTO
GetRegionWithChildrenResponse::getPager()
{
	return pager;
}

void
GetRegionWithChildrenResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}

RegionDTO
GetRegionWithChildrenResponse::getRegions()
{
	return regions;
}

void
GetRegionWithChildrenResponse::setRegions(RegionDTO  regions)
{
	this->regions = regions;
}



