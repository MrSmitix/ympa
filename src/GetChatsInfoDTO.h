/*
 * GetChatsInfoDTO.h
 *
 * Список чатов.
 */

#ifndef _GetChatsInfoDTO_H_
#define _GetChatsInfoDTO_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "GetChatInfoDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список чатов.
 *
 *  \ingroup Models
 *
 */

class GetChatsInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetChatsInfoDTO();
	GetChatsInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetChatsInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::list <GetChatInfoDTO>chats;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetChatsInfoDTO_H_ */
