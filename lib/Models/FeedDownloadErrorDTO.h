
/*
 * FeedDownloadErrorDTO.h
 *
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_FeedDownloadErrorDTO_H_
#define TINY_CPP_CLIENT_FeedDownloadErrorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedDownloadErrorType.h"

namespace Tiny {


/*! \brief Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
 *
 *  \ingroup Models
 *
 */

class FeedDownloadErrorDTO{
public:

    /*! \brief Constructor.
	 */
    FeedDownloadErrorDTO();
    FeedDownloadErrorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedDownloadErrorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int httpStatusCode{};
    FeedDownloadErrorType type;
    std::string description{};
};
}

#endif /* TINY_CPP_CLIENT_FeedDownloadErrorDTO_H_ */
