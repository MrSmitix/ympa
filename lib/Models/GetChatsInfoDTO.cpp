

#include "GetChatsInfoDTO.h"

using namespace Tiny;

GetChatsInfoDTO::GetChatsInfoDTO()
{
	chats = std::list<GetChatInfoDTO>();
	paging = ForwardScrollingPagerDTO();
}

GetChatsInfoDTO::GetChatsInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetChatsInfoDTO::~GetChatsInfoDTO()
{

}

void
GetChatsInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *chatsKey = "chats";

    if(object.has_key(chatsKey))
    {
        bourne::json value = object[chatsKey];


        std::list<GetChatInfoDTO> chats_list;
        GetChatInfoDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            chats_list.push_back(element);
        }
        chats = chats_list;


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
GetChatsInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<GetChatInfoDTO> chats_list = getChats();
    bourne::json chats_arr = bourne::json::array();

    for(auto& var : chats_list)
    {
        GetChatInfoDTO obj = var;
        chats_arr.append(obj.toJson());
    }
    object["chats"] = chats_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<GetChatInfoDTO>
GetChatsInfoDTO::getChats()
{
	return chats;
}

void
GetChatsInfoDTO::setChats(std::list <GetChatInfoDTO> chats)
{
	this->chats = chats;
}

ForwardScrollingPagerDTO
GetChatsInfoDTO::getPaging()
{
	return paging;
}

void
GetChatsInfoDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



