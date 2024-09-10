
/*
 * TransferOrdersFromShipmentRequest.h
 *
 * Запрос переноса заказов из отгрузки.
 */

#ifndef TINY_CPP_CLIENT_TransferOrdersFromShipmentRequest_H_
#define TINY_CPP_CLIENT_TransferOrdersFromShipmentRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Запрос переноса заказов из отгрузки.
 *
 *  \ingroup Models
 *
 */

class TransferOrdersFromShipmentRequest{
public:

    /*! \brief Constructor.
	 */
    TransferOrdersFromShipmentRequest();
    TransferOrdersFromShipmentRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TransferOrdersFromShipmentRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список заказов, которые вы не успеваете подготовить.
	 */
	std::list<long> getOrderIds();

	/*! \brief Set Список заказов, которые вы не успеваете подготовить.
	 */
	void setOrderIds(std::list <long> orderIds);


    private:
    std::list<long> orderIds;
};
}

#endif /* TINY_CPP_CLIENT_TransferOrdersFromShipmentRequest_H_ */
