
/*
 * OfferErrorDTO.h
 *
 * Сообщение об ошибке, связанной с размещением товара.
 */

#ifndef TINY_CPP_CLIENT_OfferErrorDTO_H_
#define TINY_CPP_CLIENT_OfferErrorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Сообщение об ошибке, связанной с размещением товара.
 *
 *  \ingroup Models
 *
 */

class OfferErrorDTO{
public:

    /*! \brief Constructor.
	 */
    OfferErrorDTO();
    OfferErrorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferErrorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Тип ошибки.
	 */
	std::string getMessage();

	/*! \brief Set Тип ошибки.
	 */
	void setMessage(std::string  message);
	/*! \brief Get Пояснение.
	 */
	std::string getComment();

	/*! \brief Set Пояснение.
	 */
	void setComment(std::string  comment);


    private:
    std::string message{};
    std::string comment{};
};
}

#endif /* TINY_CPP_CLIENT_OfferErrorDTO_H_ */
