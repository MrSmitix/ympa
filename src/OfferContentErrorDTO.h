/*
 * OfferContentErrorDTO.h
 *
 * Текст ошибки.
 */

#ifndef _OfferContentErrorDTO_H_
#define _OfferContentErrorDTO_H_


#include <string>
#include "OfferContentErrorType.h"
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

class OfferContentErrorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferContentErrorDTO();
	OfferContentErrorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferContentErrorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OfferContentErrorType getType();

	/*! \brief Set 
	 */
	void setType(OfferContentErrorType  type);
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
	OfferContentErrorType type;
	long long parameterId;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferContentErrorDTO_H_ */
