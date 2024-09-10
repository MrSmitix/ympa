

#include "DeliveryServicesDTO.h"

using namespace Tiny;

DeliveryServicesDTO::DeliveryServicesDTO()
{
	deliveryService = std::list<DeliveryServiceInfoDTO>();
}

DeliveryServicesDTO::DeliveryServicesDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeliveryServicesDTO::~DeliveryServicesDTO()
{

}

void
DeliveryServicesDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deliveryServiceKey = "deliveryService";

    if(object.has_key(deliveryServiceKey))
    {
        bourne::json value = object[deliveryServiceKey];


        std::list<DeliveryServiceInfoDTO> deliveryService_list;
        DeliveryServiceInfoDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            deliveryService_list.push_back(element);
        }
        deliveryService = deliveryService_list;


    }


}

bourne::json
DeliveryServicesDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeliveryServiceInfoDTO> deliveryService_list = getDeliveryService();
    bourne::json deliveryService_arr = bourne::json::array();

    for(auto& var : deliveryService_list)
    {
        DeliveryServiceInfoDTO obj = var;
        deliveryService_arr.append(obj.toJson());
    }
    object["deliveryService"] = deliveryService_arr;




    return object;

}

std::list<DeliveryServiceInfoDTO>
DeliveryServicesDTO::getDeliveryService()
{
	return deliveryService;
}

void
DeliveryServicesDTO::setDeliveryService(std::list <DeliveryServiceInfoDTO> deliveryService)
{
	this->deliveryService = deliveryService;
}



