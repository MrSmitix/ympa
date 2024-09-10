

#include "GetRegionsResponse.h"

using namespace Tiny;

GetRegionsResponse::GetRegionsResponse()
{
	regions = std::list<RegionDTO>();
	paging = ForwardScrollingPagerDTO();
}

GetRegionsResponse::GetRegionsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetRegionsResponse::~GetRegionsResponse()
{

}

void
GetRegionsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *regionsKey = "regions";

    if(object.has_key(regionsKey))
    {
        bourne::json value = object[regionsKey];


        std::list<RegionDTO> regions_list;
        RegionDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            regions_list.push_back(element);
        }
        regions = regions_list;


    }

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ForwardScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetRegionsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<RegionDTO> regions_list = getRegions();
    bourne::json regions_arr = bourne::json::array();

    for(auto& var : regions_list)
    {
        RegionDTO obj = var;
        regions_arr.append(obj.toJson());
    }
    object["regions"] = regions_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<RegionDTO>
GetRegionsResponse::getRegions()
{
	return regions;
}

void
GetRegionsResponse::setRegions(std::list <RegionDTO> regions)
{
	this->regions = regions;
}

ForwardScrollingPagerDTO
GetRegionsResponse::getPaging()
{
	return paging;
}

void
GetRegionsResponse::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



