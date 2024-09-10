

#include "PagedReturnsDTO.h"

using namespace Tiny;

PagedReturnsDTO::PagedReturnsDTO()
{
	paging = ForwardScrollingPagerDTO();
	returns = std::list<ReturnDTO>();
}

PagedReturnsDTO::PagedReturnsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PagedReturnsDTO::~PagedReturnsDTO()
{

}

void
PagedReturnsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ForwardScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }

    const char *returnsKey = "returns";

    if(object.has_key(returnsKey))
    {
        bourne::json value = object[returnsKey];


        std::list<ReturnDTO> returns_list;
        ReturnDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            returns_list.push_back(element);
        }
        returns = returns_list;


    }


}

bourne::json
PagedReturnsDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["paging"] = getPaging().toJson();




    std::list<ReturnDTO> returns_list = getReturns();
    bourne::json returns_arr = bourne::json::array();

    for(auto& var : returns_list)
    {
        ReturnDTO obj = var;
        returns_arr.append(obj.toJson());
    }
    object["returns"] = returns_arr;




    return object;

}

ForwardScrollingPagerDTO
PagedReturnsDTO::getPaging()
{
	return paging;
}

void
PagedReturnsDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<ReturnDTO>
PagedReturnsDTO::getReturns()
{
	return returns;
}

void
PagedReturnsDTO::setReturns(std::list <ReturnDTO> returns)
{
	this->returns = returns;
}



