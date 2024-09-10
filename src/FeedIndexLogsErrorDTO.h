/*
 * FeedIndexLogsErrorDTO.h
 *
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). 
 */

#ifndef _FeedIndexLogsErrorDTO_H_
#define _FeedIndexLogsErrorDTO_H_


#include <string>
#include "FeedIndexLogsErrorType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsErrorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedIndexLogsErrorDTO();
	FeedIndexLogsErrorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedIndexLogsErrorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
	 */
	int getHttpStatusCode();

	/*! \brief Set HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
	 */
	void setHttpStatusCode(int  httpStatusCode);
	/*! \brief Get 
	 */
	FeedIndexLogsErrorType getType();

	/*! \brief Set 
	 */
	void setType(FeedIndexLogsErrorType  type);
	/*! \brief Get Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
	 */
	std::string getDescription();

	/*! \brief Set Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
	 */
	void setDescription(std::string  description);

private:
	int httpStatusCode;
	FeedIndexLogsErrorType type;
	std::string description;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedIndexLogsErrorDTO_H_ */
