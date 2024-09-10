/*
 * FeedDownloadDTO.h
 *
 * Информация о последней загрузке прайс-листа.
 */

#ifndef _FeedDownloadDTO_H_
#define _FeedDownloadDTO_H_


#include <string>
#include "FeedDownloadErrorDTO.h"
#include "FeedStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о последней загрузке прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedDownloadDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedDownloadDTO();
	FeedDownloadDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedDownloadDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FeedStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(FeedStatusType  status);
	/*! \brief Get 
	 */
	FeedDownloadErrorDTO getError();

	/*! \brief Set 
	 */
	void setError(FeedDownloadErrorDTO  error);

private:
	FeedStatusType status;
	FeedDownloadErrorDTO error;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedDownloadDTO_H_ */
