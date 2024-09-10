

#include "SetOrderBoxLayoutRequest.h"

using namespace Tiny;

SetOrderBoxLayoutRequest::SetOrderBoxLayoutRequest()
{
	boxes = std::list<OrderBoxLayoutDTO>();
	allowRemove = bool(false);
}

SetOrderBoxLayoutRequest::SetOrderBoxLayoutRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SetOrderBoxLayoutRequest::~SetOrderBoxLayoutRequest()
{

}

void
SetOrderBoxLayoutRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *boxesKey = "boxes";

    if(object.has_key(boxesKey))
    {
        bourne::json value = object[boxesKey];


        std::list<OrderBoxLayoutDTO> boxes_list;
        OrderBoxLayoutDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            boxes_list.push_back(element);
        }
        boxes = boxes_list;


    }

    const char *allowRemoveKey = "allowRemove";

    if(object.has_key(allowRemoveKey))
    {
        bourne::json value = object[allowRemoveKey];



        jsonToValue(&allowRemove, value, "bool");


    }


}

bourne::json
SetOrderBoxLayoutRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrderBoxLayoutDTO> boxes_list = getBoxes();
    bourne::json boxes_arr = bourne::json::array();

    for(auto& var : boxes_list)
    {
        OrderBoxLayoutDTO obj = var;
        boxes_arr.append(obj.toJson());
    }
    object["boxes"] = boxes_arr;







    object["allowRemove"] = isAllowRemove();



    return object;

}

std::list<OrderBoxLayoutDTO>
SetOrderBoxLayoutRequest::getBoxes()
{
	return boxes;
}

void
SetOrderBoxLayoutRequest::setBoxes(std::list <OrderBoxLayoutDTO> boxes)
{
	this->boxes = boxes;
}

bool
SetOrderBoxLayoutRequest::isAllowRemove()
{
	return allowRemove;
}

void
SetOrderBoxLayoutRequest::setAllowRemove(bool  allowRemove)
{
	this->allowRemove = allowRemove;
}



