/*
 * FeedPublicationFullDTO.h
 *
 * Информация о последней публикации предложений из прайс-листа на Маркете. 
 */

#ifndef _FeedPublicationFullDTO_H_
#define _FeedPublicationFullDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о последней публикации предложений из прайс-листа на Маркете. 
 *
 *  \ingroup Models
 *
 */

class FeedPublicationFullDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedPublicationFullDTO();
	FeedPublicationFullDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedPublicationFullDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	std::string getFileTime();

	/*! \brief Set Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	void setFileTime(std::string  fileTime);
	/*! \brief Get Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	std::string getPublishedTime();

	/*! \brief Set Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	void setPublishedTime(std::string  publishedTime);

private:
	std::string fileTime;
	std::string publishedTime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedPublicationFullDTO_H_ */
