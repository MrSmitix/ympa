
/*
 * OfferManualDTO.h
 *
 * Инструкция по использованию товара. 
 */

#ifndef TINY_CPP_CLIENT_OfferManualDTO_H_
#define TINY_CPP_CLIENT_OfferManualDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Инструкция по использованию товара. 
 *
 *  \ingroup Models
 *
 */

class OfferManualDTO{
public:

    /*! \brief Constructor.
	 */
    OfferManualDTO();
    OfferManualDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferManualDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ссылка на инструкцию.
	 */
	std::string getUrl();

	/*! \brief Set Ссылка на инструкцию.
	 */
	void setUrl(std::string  url);
	/*! \brief Get Название инструкции, которое будет отображаться на карточке товара. 
	 */
	std::string getTitle();

	/*! \brief Set Название инструкции, которое будет отображаться на карточке товара. 
	 */
	void setTitle(std::string  title);


    private:
    std::string url{};
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_OfferManualDTO_H_ */
