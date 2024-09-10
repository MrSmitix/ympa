

#include "OrderBoxesLayoutDTO.h"

using namespace Tiny;

OrderBoxesLayoutDTO::OrderBoxesLayoutDTO()
{
	boxes = std::list<EnrichedOrderBoxLayoutDTO>();
}

OrderBoxesLayoutDTO::OrderBoxesLayoutDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderBoxesLayoutDTO::~OrderBoxesLayoutDTO()
{

}

void
OrderBoxesLayoutDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *boxesKey = "boxes";

    if(object.has_key(boxesKey))
    {
        bourne::json value = object[boxesKey];


        std::list<EnrichedOrderBoxLayoutDTO> boxes_list;
        EnrichedOrderBoxLayoutDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            boxes_list.push_back(element);
        }
        boxes = boxes_list;


    }


}

bourne::json
OrderBoxesLayoutDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<EnrichedOrderBoxLayoutDTO> boxes_list = getBoxes();
    bourne::json boxes_arr = bourne::json::array();

    for(auto& var : boxes_list)
    {
        EnrichedOrderBoxLayoutDTO obj = var;
        boxes_arr.append(obj.toJson());
    }
    object["boxes"] = boxes_arr;




    return object;

}

std::list<EnrichedOrderBoxLayoutDTO>
OrderBoxesLayoutDTO::getBoxes()
{
	return boxes;
}

void
OrderBoxesLayoutDTO::setBoxes(std::list <EnrichedOrderBoxLayoutDTO> boxes)
{
	this->boxes = boxes;
}



