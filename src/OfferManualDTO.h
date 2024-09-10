/*
 * OfferManualDTO.h
 *
 * Инструкция по использованию товара. 
 */

#ifndef _OfferManualDTO_H_
#define _OfferManualDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Инструкция по использованию товара. 
 *
 *  \ingroup Models
 *
 */

class OfferManualDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferManualDTO();
	OfferManualDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferManualDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string url;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferManualDTO_H_ */
