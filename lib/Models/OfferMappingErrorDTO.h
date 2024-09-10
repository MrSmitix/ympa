
/*
 * OfferMappingErrorDTO.h
 *
 * Текст ошибки.
 */

#ifndef TINY_CPP_CLIENT_OfferMappingErrorDTO_H_
#define TINY_CPP_CLIENT_OfferMappingErrorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferMappingErrorType.h"

namespace Tiny {


/*! \brief Текст ошибки.
 *
 *  \ingroup Models
 *
 */

class OfferMappingErrorDTO{
public:

    /*! \brief Constructor.
	 */
    OfferMappingErrorDTO();
    OfferMappingErrorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferMappingErrorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OfferMappingErrorType getType();

	/*! \brief Set 
	 */
	void setType(OfferMappingErrorType  type);
	/*! \brief Get Идентификатор характеристики, с которой связана ошибка.
	 */
	long getParameterId();

	/*! \brief Set Идентификатор характеристики, с которой связана ошибка.
	 */
	void setParameterId(long  parameterId);
	/*! \brief Get Текст ошибки.
	 */
	std::string getMessage();

	/*! \brief Set Текст ошибки.
	 */
	void setMessage(std::string  message);


    private:
    OfferMappingErrorType type;
    long parameterId{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_OfferMappingErrorDTO_H_ */
