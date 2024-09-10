

#include "SetOrderShipmentBoxesRequest.h"

using namespace Tiny;

SetOrderShipmentBoxesRequest::SetOrderShipmentBoxesRequest()
{
	boxes = std::list<ParcelBoxDTO>();
}

SetOrderShipmentBoxesRequest::SetOrderShipmentBoxesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SetOrderShipmentBoxesRequest::~SetOrderShipmentBoxesRequest()
{

}

void
SetOrderShipmentBoxesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *boxesKey = "boxes";

    if(object.has_key(boxesKey))
    {
        bourne::json value = object[boxesKey];


        std::list<ParcelBoxDTO> boxes_list;
        ParcelBoxDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            boxes_list.push_back(element);
        }
        boxes = boxes_list;


    }


}

bourne::json
SetOrderShipmentBoxesRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ParcelBoxDTO> boxes_list = getBoxes();
    bourne::json boxes_arr = bourne::json::array();

    for(auto& var : boxes_list)
    {
        ParcelBoxDTO obj = var;
        boxes_arr.append(obj.toJson());
    }
    object["boxes"] = boxes_arr;




    return object;

}

std::list<ParcelBoxDTO>
SetOrderShipmentBoxesRequest::getBoxes()
{
	return boxes;
}

void
SetOrderShipmentBoxesRequest::setBoxes(std::list <ParcelBoxDTO> boxes)
{
	this->boxes = boxes;
}



