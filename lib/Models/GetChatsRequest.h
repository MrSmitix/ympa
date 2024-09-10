
/*
 * GetChatsRequest.h
 *
 * Фильтры по чатам, которые нужно вернуть. 
 */

#ifndef TINY_CPP_CLIENT_GetChatsRequest_H_
#define TINY_CPP_CLIENT_GetChatsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatStatusType.h"
#include "ChatType.h"
#include <list>

namespace Tiny {


/*! \brief Фильтры по чатам, которые нужно вернуть. 
 *
 *  \ingroup Models
 *
 */

class GetChatsRequest{
public:

    /*! \brief Constructor.
	 */
    GetChatsRequest();
    GetChatsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetChatsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Фильтр по идентификаторам заказов на Маркете.
	 */
	std::list<long> getOrderIds();

	/*! \brief Set Фильтр по идентификаторам заказов на Маркете.
	 */
	void setOrderIds(std::list <long> orderIds);
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
    std::list<long> orderIds;
    std::list<ChatType> types;
    std::list<ChatStatusType> statuses;
};
}

#endif /* TINY_CPP_CLIENT_GetChatsRequest_H_ */
