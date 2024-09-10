/*
 * FeedDownloadErrorDTO.h
 *
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
 */

#ifndef _FeedDownloadErrorDTO_H_
#define _FeedDownloadErrorDTO_H_


#include <string>
#include "FeedDownloadErrorType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
 *
 *  \ingroup Models
 *
 */

class FeedDownloadErrorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedDownloadErrorDTO();
	FeedDownloadErrorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedDownloadErrorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
	 */
	int getHttpStatusCode();

	/*! \brief Set HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
	 */
	void setHttpStatusCode(int  httpStatusCode);
	/*! \brief Get 
	 */
	FeedDownloadErrorType getType();

	/*! \brief Set 
	 */
	void setType(FeedDownloadErrorType  type);
	/*! \brief Get Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
	 */
	std::string getDescription();

	/*! \brief Set Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
	 */
	void setDescription(std::string  description);

private:
	int httpStatusCode;
	FeedDownloadErrorType type;
	std::string description;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedDownloadErrorDTO_H_ */
