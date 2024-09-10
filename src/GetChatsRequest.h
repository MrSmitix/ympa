/*
 * GetChatsRequest.h
 *
 * Фильтры по чатам, которые нужно вернуть. 
 */

#ifndef _GetChatsRequest_H_
#define _GetChatsRequest_H_


#include <string>
#include "ChatStatusType.h"
#include "ChatType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фильтры по чатам, которые нужно вернуть. 
 *
 *  \ingroup Models
 *
 */

class GetChatsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetChatsRequest();
	GetChatsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetChatsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Фильтр по идентификаторам заказов на Маркете.
	 */
	std::list<long long> getOrderIds();

	/*! \brief Set Фильтр по идентификаторам заказов на Маркете.
	 */
	void setOrderIds(std::list <long long> orderIds);
	/*! \brief Get Фильтр по типам чатов.
	 */
	std::list<ChatType> getTypes();

	/*! \brief Set Фильтр по типам чатов.
	 */
	void setTypes(std::list <ChatType> types);
	/*! \brief Get Фильтр по статусам чатов.
	 */
	std::list<ChatStatusType> getStatuses();

	/*! \brief Set Фильтр по статусам чатов.
	 */
	void setStatuses(std::list <ChatStatusType> statuses);

private:
	std::list <long long>orderIds;
	std::list <ChatType>types;
	std::list <ChatStatusType>statuses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetChatsRequest_H_ */
