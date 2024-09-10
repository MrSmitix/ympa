

#include "SearchShipmentsResponseDTO.h"

using namespace Tiny;

SearchShipmentsResponseDTO::SearchShipmentsResponseDTO()
{
	shipments = std::list<ShipmentInfoDTO>();
	paging = ForwardScrollingPagerDTO();
}

SearchShipmentsResponseDTO::SearchShipmentsResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

SearchShipmentsResponseDTO::~SearchShipmentsResponseDTO()
{

}

void
SearchShipmentsResponseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *shipmentsKey = "shipments";

    if(object.has_key(shipmentsKey))
    {
        bourne::json value = object[shipmentsKey];


        std::list<ShipmentInfoDTO> shipments_list;
        ShipmentInfoDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            shipments_list.push_back(element);
        }
        shipments = shipments_list;


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
SearchShipmentsResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ShipmentInfoDTO> shipments_list = getShipments();
    bourne::json shipments_arr = bourne::json::array();

    for(auto& var : shipments_list)
    {
        ShipmentInfoDTO obj = var;
        shipments_arr.append(obj.toJson());
    }
    object["shipments"] = shipments_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<ShipmentInfoDTO>
SearchShipmentsResponseDTO::getShipments()
{
	return shipments;
}

void
SearchShipmentsResponseDTO::setShipments(std::list <ShipmentInfoDTO> shipments)
{
	this->shipments = shipments;
}

ForwardScrollingPagerDTO
SearchShipmentsResponseDTO::getPaging()
{
	return paging;
}

void
SearchShipmentsResponseDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



