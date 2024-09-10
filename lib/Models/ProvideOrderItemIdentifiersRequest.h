
/*
 * ProvideOrderItemIdentifiersRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProvideOrderItemIdentifiersRequest_H_
#define TINY_CPP_CLIENT_ProvideOrderItemIdentifiersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderItemInstanceModificationDTO.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProvideOrderItemIdentifiersRequest{
public:

    /*! \brief Constructor.
	 */
    ProvideOrderItemIdentifiersRequest();
    ProvideOrderItemIdentifiersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProvideOrderItemIdentifiersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список позиций, требующих маркировки. 
	 */
	std::list<OrderItemInstanceModificationDTO> getItems();

	/*! \brief Set Список позиций, требующих маркировки. 
	 */
	void setItems(std::list <OrderItemInstanceModificationDTO> items);


    private:
    std::list<OrderItemInstanceModificationDTO> items;
};
}

#endif /* TINY_CPP_CLIENT_ProvideOrderItemIdentifiersRequest_H_ */
