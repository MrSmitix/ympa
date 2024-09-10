
/*
 * FeedIndexLogsErrorDTO.h
 *
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). 
 */

#ifndef TINY_CPP_CLIENT_FeedIndexLogsErrorDTO_H_
#define TINY_CPP_CLIENT_FeedIndexLogsErrorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedIndexLogsErrorType.h"

namespace Tiny {


/*! \brief Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsErrorDTO{
public:

    /*! \brief Constructor.
	 */
    FeedIndexLogsErrorDTO();
    FeedIndexLogsErrorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedIndexLogsErrorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int httpStatusCode{};
    FeedIndexLogsErrorType type;
    std::string description{};
};
}

#endif /* TINY_CPP_CLIENT_FeedIndexLogsErrorDTO_H_ */
