
/*
 * GetChatsInfoDTO.h
 *
 * Список чатов.
 */

#ifndef TINY_CPP_CLIENT_GetChatsInfoDTO_H_
#define TINY_CPP_CLIENT_GetChatsInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "GetChatInfoDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список чатов.
 *
 *  \ingroup Models
 *
 */

class GetChatsInfoDTO{
public:

    /*! \brief Constructor.
	 */
    GetChatsInfoDTO();
    GetChatsInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetChatsInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Информация о чатах.
	 */
	std::list<GetChatInfoDTO> getChats();

	/*! \brief Set Информация о чатах.
	 */
	void setChats(std::list <GetChatInfoDTO> chats);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);


    private:
    std::list<GetChatInfoDTO> chats;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_GetChatsInfoDTO_H_ */
