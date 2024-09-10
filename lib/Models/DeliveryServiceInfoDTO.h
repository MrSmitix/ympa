
/*
 * DeliveryServiceInfoDTO.h
 *
 * Информация о службе доставки.
 */

#ifndef TINY_CPP_CLIENT_DeliveryServiceInfoDTO_H_
#define TINY_CPP_CLIENT_DeliveryServiceInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о службе доставки.
 *
 *  \ingroup Models
 *
 */

class DeliveryServiceInfoDTO{
public:

    /*! \brief Constructor.
	 */
    DeliveryServiceInfoDTO();
    DeliveryServiceInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeliveryServiceInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор службы доставки.
	 */
	long getId();

	/*! \brief Set Идентификатор службы доставки.
	 */
	void setId(long  id);
	/*! \brief Get Наименование службы доставки.
	 */
	std::string getName();

	/*! \brief Set Наименование службы доставки.
	 */
	void setName(std::string  name);


    private:
    long id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_DeliveryServiceInfoDTO_H_ */
