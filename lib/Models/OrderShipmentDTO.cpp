

#include "OrderShipmentDTO.h"

using namespace Tiny;

OrderShipmentDTO::OrderShipmentDTO()
{
	id = long(0);
	shipmentDate = std::string();
	shipmentTime = std::string();
	tracks = std::list<OrderTrackDTO>();
	boxes = std::list<OrderParcelBoxDTO>();
}

OrderShipmentDTO::OrderShipmentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderShipmentDTO::~OrderShipmentDTO()
{

}

void
OrderShipmentDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *shipmentDateKey = "shipmentDate";

    if(object.has_key(shipmentDateKey))
    {
        bourne::json value = object[shipmentDateKey];



        jsonToValue(&shipmentDate, value, "std::string");


    }

    const char *shipmentTimeKey = "shipmentTime";

    if(object.has_key(shipmentTimeKey))
    {
        bourne::json value = object[shipmentTimeKey];



        jsonToValue(&shipmentTime, value, "std::string");


    }

    const char *tracksKey = "tracks";

    if(object.has_key(tracksKey))
    {
        bourne::json value = object[tracksKey];


        std::list<OrderTrackDTO> tracks_list;
        OrderTrackDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tracks_list.push_back(element);
        }
        tracks = tracks_list;


    }

    const char *boxesKey = "boxes";

    if(object.has_key(boxesKey))
    {
        bourne::json value = object[boxesKey];


        std::list<OrderParcelBoxDTO> boxes_list;
        OrderParcelBoxDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            boxes_list.push_back(element);
        }
        boxes = boxes_list;


    }


}

bourne::json
OrderShipmentDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["shipmentDate"] = getShipmentDate();






    object["shipmentTime"] = getShipmentTime();





    std::list<OrderTrackDTO> tracks_list = getTracks();
    bourne::json tracks_arr = bourne::json::array();

    for(auto& var : tracks_list)
    {
        OrderTrackDTO obj = var;
        tracks_arr.append(obj.toJson());
    }
    object["tracks"] = tracks_arr;






    std::list<OrderParcelBoxDTO> boxes_list = getBoxes();
    bourne::json boxes_arr = bourne::json::array();

    for(auto& var : boxes_list)
    {
        OrderParcelBoxDTO obj = var;
        boxes_arr.append(obj.toJson());
    }
    object["boxes"] = boxes_arr;




    return object;

}

long
OrderShipmentDTO::getId()
{
	return id;
}

void
OrderShipmentDTO::setId(long  id)
{
	this->id = id;
}

std::string
OrderShipmentDTO::getShipmentDate()
{
	return shipmentDate;
}

void
OrderShipmentDTO::setShipmentDate(std::string  shipmentDate)
{
	this->shipmentDate = shipmentDate;
}

std::string
OrderShipmentDTO::getShipmentTime()
{
	return shipmentTime;
}

void
OrderShipmentDTO::setShipmentTime(std::string  shipmentTime)
{
	this->shipmentTime = shipmentTime;
}

std::list<OrderTrackDTO>
OrderShipmentDTO::getTracks()
{
	return tracks;
}

void
OrderShipmentDTO::setTracks(std::list <OrderTrackDTO> tracks)
{
	this->tracks = tracks;
}

std::list<OrderParcelBoxDTO>
OrderShipmentDTO::getBoxes()
{
	return boxes;
}

void
OrderShipmentDTO::setBoxes(std::list <OrderParcelBoxDTO> boxes)
{
	this->boxes = boxes;
}



