

#include "ShipmentBoxesDTO.h"

using namespace Tiny;

ShipmentBoxesDTO::ShipmentBoxesDTO()
{
	boxes = std::list<ParcelBoxDTO>();
}

ShipmentBoxesDTO::ShipmentBoxesDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShipmentBoxesDTO::~ShipmentBoxesDTO()
{

}

void
ShipmentBoxesDTO::fromJson(std::string jsonObj)
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
ShipmentBoxesDTO::toJson()
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
ShipmentBoxesDTO::getBoxes()
{
	return boxes;
}

void
ShipmentBoxesDTO::setBoxes(std::list <ParcelBoxDTO> boxes)
{
	this->boxes = boxes;
}



