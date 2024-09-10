
/*
 * OrdersStatsDeliveryRegionDTO.h
 *
 * Информация о регионе доставки.
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsDeliveryRegionDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsDeliveryRegionDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о регионе доставки.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsDeliveryRegionDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsDeliveryRegionDTO();
    OrdersStatsDeliveryRegionDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsDeliveryRegionDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор региона доставки.
	 */
	long getId();

	/*! \brief Set Идентификатор региона доставки.
	 */
	void setId(long  id);
	/*! \brief Get Название региона доставки.
	 */
	std::string getName();

	/*! \brief Set Название региона доставки.
	 */
	void setName(std::string  name);


    private:
    long id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsDeliveryRegionDTO_H_ */
