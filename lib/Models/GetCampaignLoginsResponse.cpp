

#include "GetCampaignLoginsResponse.h"

using namespace Tiny;

GetCampaignLoginsResponse::GetCampaignLoginsResponse()
{
	logins = std::list<std::string>();
}

GetCampaignLoginsResponse::GetCampaignLoginsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCampaignLoginsResponse::~GetCampaignLoginsResponse()
{

}

void
GetCampaignLoginsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *loginsKey = "logins";

    if(object.has_key(loginsKey))
    {
        bourne::json value = object[loginsKey];


        std::list<std::string> logins_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            logins_list.push_back(element);
        }
        logins = logins_list;


    }


}

bourne::json
GetCampaignLoginsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> logins_list = getLogins();
    bourne::json logins_arr = bourne::json::array();

    for(auto& var : logins_list)
    {
        logins_arr.append(var);
    }
    object["logins"] = logins_arr;






    return object;

}

std::list<std::string>
GetCampaignLoginsResponse::getLogins()
{
	return logins;
}

void
GetCampaignLoginsResponse::setLogins(std::list <std::string> logins)
{
	this->logins = logins;
}



