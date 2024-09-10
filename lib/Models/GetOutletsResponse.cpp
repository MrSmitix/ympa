

#include "GetOutletsResponse.h"

using namespace Tiny;

GetOutletsResponse::GetOutletsResponse()
{
	outlets = std::list<FullOutletDTO>();
	paging = ScrollingPagerDTO();
	pager = FlippingPagerDTO();
}

GetOutletsResponse::GetOutletsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOutletsResponse::~GetOutletsResponse()
{

}

void
GetOutletsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *outletsKey = "outlets";

    if(object.has_key(outletsKey))
    {
        bourne::json value = object[outletsKey];


        std::list<FullOutletDTO> outlets_list;
        FullOutletDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            outlets_list.push_back(element);
        }
        outlets = outlets_list;


    }

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

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
GetOutletsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<FullOutletDTO> outlets_list = getOutlets();
    bourne::json outlets_arr = bourne::json::array();

    for(auto& var : outlets_list)
    {
        FullOutletDTO obj = var;
        outlets_arr.append(obj.toJson());
    }
    object["outlets"] = outlets_arr;








	object["paging"] = getPaging().toJson();






	object["pager"] = getPager().toJson();


    return object;

}

std::list<FullOutletDTO>
GetOutletsResponse::getOutlets()
{
	return outlets;
}

void
GetOutletsResponse::setOutlets(std::list <FullOutletDTO> outlets)
{
	this->outlets = outlets;
}

ScrollingPagerDTO
GetOutletsResponse::getPaging()
{
	return paging;
}

void
GetOutletsResponse::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

FlippingPagerDTO
GetOutletsResponse::getPager()
{
	return pager;
}

void
GetOutletsResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}



