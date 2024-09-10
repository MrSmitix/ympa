/*
 * FeedbackShopDTO.h
 *
 * Информация о магазине.
 */

#ifndef _FeedbackShopDTO_H_
#define _FeedbackShopDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о магазине.
 *
 *  \ingroup Models
 *
 */

class FeedbackShopDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackShopDTO();
	FeedbackShopDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackShopDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Название магазина.
	 */
	std::string getName();

	/*! \brief Set Название магазина.
	 */
	void setName(std::string  name);

private:
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedbackShopDTO_H_ */
