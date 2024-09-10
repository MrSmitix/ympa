/*
 * OfferMappingErrorDTO.h
 *
 * Текст ошибки.
 */

#ifndef _OfferMappingErrorDTO_H_
#define _OfferMappingErrorDTO_H_


#include <string>
#include "OfferMappingErrorType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Текст ошибки.
 *
 *  \ingroup Models
 *
 */

class OfferMappingErrorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferMappingErrorDTO();
	OfferMappingErrorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferMappingErrorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OfferMappingErrorType getType();

	/*! \brief Set 
	 */
	void setType(OfferMappingErrorType  type);
	/*! \brief Get Идентификатор характеристики, с которой связана ошибка.
	 */
	long long getParameterId();

	/*! \brief Set Идентификатор характеристики, с которой связана ошибка.
	 */
	void setParameterId(long long  parameterId);
	/*! \brief Get Текст ошибки.
	 */
	std::string getMessage();

	/*! \brief Set Текст ошибки.
	 */
	void setMessage(std::string  message);

private:
	OfferMappingErrorType type;
	long long parameterId;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferMappingErrorDTO_H_ */
