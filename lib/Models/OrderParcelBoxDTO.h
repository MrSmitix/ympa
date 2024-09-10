
/*
 * OrderParcelBoxDTO.h
 *
 * Информация о грузоместе.
 */

#ifndef TINY_CPP_CLIENT_OrderParcelBoxDTO_H_
#define TINY_CPP_CLIENT_OrderParcelBoxDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о грузоместе.
 *
 *  \ingroup Models
 *
 */

class OrderParcelBoxDTO{
public:

    /*! \brief Constructor.
	 */
    OrderParcelBoxDTO();
    OrderParcelBoxDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderParcelBoxDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор грузоместа.
	 */
	long getId();

	/*! \brief Set Идентификатор грузоместа.
	 */
	void setId(long  id);
	/*! \brief Get Идентификатор грузового места в информационной системе магазина.
	 */
	std::string getFulfilmentId();

	/*! \brief Set Идентификатор грузового места в информационной системе магазина.
	 */
	void setFulfilmentId(std::string  fulfilmentId);


    private:
    long id{};
    std::string fulfilmentId{};
};
}

#endif /* TINY_CPP_CLIENT_OrderParcelBoxDTO_H_ */
