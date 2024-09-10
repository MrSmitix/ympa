
/*
 * OrdersStatsWarehouseDTO.h
 *
 * Информация о складе, на котором хранится товар.
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsWarehouseDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsWarehouseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о складе, на котором хранится товар.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsWarehouseDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsWarehouseDTO();
    OrdersStatsWarehouseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsWarehouseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор склада.
	 */
	long getId();

	/*! \brief Set Идентификатор склада.
	 */
	void setId(long  id);
	/*! \brief Get Название склада.
	 */
	std::string getName();

	/*! \brief Set Название склада.
	 */
	void setName(std::string  name);


    private:
    long id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsWarehouseDTO_H_ */
