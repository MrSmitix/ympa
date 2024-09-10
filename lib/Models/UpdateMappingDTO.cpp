

#include "UpdateMappingDTO.h"

using namespace Tiny;

UpdateMappingDTO::UpdateMappingDTO()
{
	marketSku = long(0);
}

UpdateMappingDTO::UpdateMappingDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMappingDTO::~UpdateMappingDTO()
{

}

void
UpdateMappingDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *marketSkuKey = "marketSku";

    if(object.has_key(marketSkuKey))
    {
        bourne::json value = object[marketSkuKey];



        jsonToValue(&marketSku, value, "long");


    }


}

bourne::json
UpdateMappingDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["marketSku"] = getMarketSku();



    return object;

}

long
UpdateMappingDTO::getMarketSku()
{
	return marketSku;
}

void
UpdateMappingDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}



