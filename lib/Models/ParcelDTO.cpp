

#include "ParcelDTO.h"

using namespace Tiny;

ParcelDTO::ParcelDTO()
{
	boxes = std::list<ParcelBoxDTO>();
}

ParcelDTO::ParcelDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ParcelDTO::~ParcelDTO()
{

}

void
ParcelDTO::fromJson(std::string jsonObj)
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
ParcelDTO::toJson()
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
ParcelDTO::getBoxes()
{
	return boxes;
}

void
ParcelDTO::setBoxes(std::list <ParcelBoxDTO> boxes)
{
	this->boxes = boxes;
}



